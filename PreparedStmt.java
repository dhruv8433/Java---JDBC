import java.sql.*;

public class PreparedStmt {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");

            PreparedStatement stmt = con.prepareStatement("insert into test values(?,?,?)");
            stmt.setInt(1, 1);
            stmt.setString(2, "Rni");
            stmt.setInt(3, 21);

            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
