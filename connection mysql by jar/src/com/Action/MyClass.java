package com.Action;

import java.sql.*;

public class MyClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306","Airline","");//To connect database
		System.out.println("Connected");//checking if connected
	}
}
