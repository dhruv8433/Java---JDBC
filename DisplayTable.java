import java.sql.*;

class DisplayTable {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");

            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM Registration";

            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                // Display values
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(", First: " + rs.getString("first"));
                System.out.println(", Last: " + rs.getString("last"));
            }
            rs.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error in displaying result" + e.getMessage());
        }
    }
}
