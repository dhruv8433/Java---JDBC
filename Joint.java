import java.sql.*;
import java.util.*;

public class Joint {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");

            Statement stmt = con.createStatement();

            String sql = "SELECT e.first, e.last, e.age " +
                    "FROM registration e " +
                    "INNER JOIN test d " +
                    "ON e.id = d.id";

            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.print("First: " + rs.getString("first"));
                System.out.println("\nLast: " + rs.getString("last"));
                System.out.print("Age: " + rs.getInt("age"));
            }
            rs.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error in displaying result" + e.getMessage());
        }
    }
}
