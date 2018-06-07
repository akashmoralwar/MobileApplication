package com.cg.evm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {


public static void main(String[] args) {
	Connection conn=DatabaseConnection.getConnection();
}

public static Connection getConnection()
{
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String username="system";
	String password="akash";
	String driver="oracle.jdbc.driver.OracleDriver";

	Connection conn=null;
	
	try{
	      Class.forName(driver);
	      conn=DriverManager.getConnection(url,username,password);
	      System.out.println("Database Connected..");
	}catch(SQLException|ClassNotFoundException e)
	{
		e.printStackTrace();
		System.out.println(e.getMessage());
	}

	return conn;
}

}
