import java.sql.*;

class CreateTable {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");

            String sql = "CREATE TABLE REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";

            Statement stmt = conn.createStatement();

            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error in creating table" + e.getMessage());
        }
    }
}
