<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JDBC Displaying table</h1>
<%
	Connection con = null;
	ResultSet rs = null;
	Statement stmt = null;
	
	
	try{
	// connecting drivers
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");
	
	out.print("Db Connected");
	stmt = con.createStatement();
	
	String Sql = "select * from Registration";
	
	rs = stmt.executeQuery(Sql);
	
		out.print("<br>");
	while(rs.next()){
		out.print("ID: " + rs.getInt("id"));
		out.print("Age: " + rs.getInt("age"));
		out.print("First: " + rs.getString("first"));
		out.print("Last: " + rs.getString("last"));
		out.print("<br>");
	}
	}catch(Exception e){
		out.print("Exception :" + e);
	}
	
%>
</body>
</html>