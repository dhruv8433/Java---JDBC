import java.sql.*;

class Insertion {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");
			Statement stmt = con.createStatement();

			// inserting data to the database

			System.out.println("Inserting records into the table...");
			String sql = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
			stmt.executeUpdate(sql);

			con.close();
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}