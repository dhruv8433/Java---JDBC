import java.sql.*;

class WhereCondition {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");

            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM Registration" +
                    " WHERE id >= 101 ";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(", First: " + rs.getString("first"));
                System.out.println(", Last: " + rs.getString("last"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error in getting resules" + e.getMessage());
        }
    }
}
