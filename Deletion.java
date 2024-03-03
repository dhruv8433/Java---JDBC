import java.sql.*;

// Delete 
class Deletion {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", null);
            Statement stmt = con.createStatement();

            String query = "DELETE FROM Registration " +
                    "WHERE id = 101";

            stmt.executeUpdate(query);

            System.out.println("Deletion Sucess");
        } catch (Exception e) {
            System.out.println("Error in deletion :" + e.getMessage());
        }
    }
}
