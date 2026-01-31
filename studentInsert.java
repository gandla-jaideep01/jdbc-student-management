import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class studentInsert {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter yout id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter roll: ");
            String roll = sc.nextLine();

            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/classroom",
                    "root",
                    "Jesus@143");

            
            String sql = "INSERT INTO student (sname,sid, sroll) VALUES (?,?, ?)";

            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setInt(2, id);
            pst.setString(3, roll);

            
            pst.executeUpdate();

            System.out.println("Data inserted successfully!");

            
            pst.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
