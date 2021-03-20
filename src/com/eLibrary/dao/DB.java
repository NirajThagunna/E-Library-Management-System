package com.eLibrary.dao;

import java.sql.*;

public class DB {
	public static Connection getCon(){
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/library","admin","admin123"); 

		}catch(Exception e){System.out.println(e);}
		return con;
	}
}
