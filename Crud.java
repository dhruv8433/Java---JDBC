import java.sql.*;
import java.util.*;

public class Crud {
    public static void main(String[] args) {
        System.out.println("welcome back chief! how can i help you...?");

        System.out.println("1. Create a new Table");
        System.out.println("2. Insert a Record");
        System.out.println("3. Delete a Record");
        System.out.println("4. Update a Record");
        System.out.println("5. Search a Record");
        System.out.println("6. Delete a Table");
        System.out.println("7. Exit");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Choose Options: ");
        int choice = myObj.nextInt();

        switch (choice) {
            case 1:
                System.out.println("option 1 -- create a table");

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");
                    System.out.println("Connection established");
                    Statement stmt = con.createStatement();
                    System.out.println("Enter table name: ");
                    String tableName = myObj.next();
                    String Sql = "CREATE TABLE " + tableName
                            + "(id INT NOT NULL, "
                            + "name VARCHAR(255), "
                            + "age INT, "
                            + "PRIMARY KEY (id))";

                    stmt.executeUpdate(Sql);

                    System.out.println("Table created successfully with name " + tableName);
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Error in creating table" + e.getMessage());
                }
                break;

            case 6:
                System.out.println("option 1 -- create a table");
                System.out.println("Enter table name: ");
                String tableName = myObj.nextLine();
                String Sql = "DELETE TABLE " + tableName;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");
                    System.out.println("Connection established");
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate(Sql);

                    System.out.println("Table created successfully with name" + tableName);
                } catch (Exception e) {
                    System.out.println("Error in deleting table" + e.getMessage());
                }
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
