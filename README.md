# JDBC Student Management (Beginner Project)

This is a simple Java JDBC project that connects to a MySQL database
and inserts student data into a MySQL table.

## Features

- Console-based Java input
- JDBC connection to MySQL
- Uses PreparedStatement
- Beginner friendly project

## Technologies Used

- Java
- MySQL
- JDBC

## Table Structure

```sql
CREATE TABLE student (
  sid INT,
  sname VARCHAR(60),
  sroll VARCHAR(40)
);
```

# JDBC Student Management (Beginner Project)

This is a simple Java JDBC project that connects to a MySQL database
and inserts student data into a MySQL table.

## How to Run

Compile:
javac -cp ".;mysql-connector-j-9.6.0.jar" studentInsert.java

Run:
java -cp ".;mysql-connector-j-9.6.0.jar" studentInsert
