import java.sql.*;

// Connecting to JAVA SQL
class ConnectionDb {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", null);

            System.out.println("Connection Success");
            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Connection Faliure: " + e.getMessage());
        }
    }
}
