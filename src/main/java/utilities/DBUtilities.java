package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtilities {
	
	//Creating private static obj of Connection class
		private static Connection conn;
		
		//Creating private static obj of Statement class
		private static Statement stmt;
		
		//Creating private static obj of ResultSet class
		//it is used to create a resultSet to store query result.
		private static ResultSet resultSet;
		
		//create databade url (class (global) objects)
		
		//syntax for db url connection or url string
		//jdbc:typeofdatabase://host:port/databasename
		
		private static String dbURL = "jdbc:postgresql://localhost:5432/DVDRENTAL";
		
		//create database User Name
		
		private static String dbUserName = "postgres";
		
		//create database User Password
		
		private static String dbUserPassword = "root";
		
		public static void setupConnection() {
			try {
				conn = DriverManager.getConnection(dbURL, dbUserName, dbUserPassword );
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		public static void closeConnection() {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}

		public static ResultSet runQuery(String query) {

			try {

				stmt = conn.createStatement();
				resultSet = stmt.executeQuery(query);
//				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return resultSet;

		}
		
		public void writeResultToCSV() {
			
			
		}
}
