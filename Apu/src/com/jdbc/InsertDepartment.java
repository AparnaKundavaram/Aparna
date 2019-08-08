package com.jdbc;
import java.util.Scanner;

// Step 1: Import required packages
import java.sql.*;
public class InsertDepartment {

		// JDBC driver name and database URL
		static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		static final String DB_URL = "jdbc:mysql://localhost:3306/apudb";
		
		// Database credentials
		static final String USER = "root";
		static final String PASSWORD = "Chikkydeepu3*"; 
		
		public static void insertToDatabase(String id, String name, String num ){
			String dId = id;
			String dName = name;
			String dNum = num;
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				//STEP 2: Register JDBC driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//STEP 3: Open a Connection
				System.out.println("Connecting to Apu ^_^");
				conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
				
				//STEP 4: Execute a query
				String sql;
				sql = "INSERT INTO department(depId, depName, depNum) VALUES(?,?,?)";
				pstmt = conn.prepareStatement(sql);
				// set parameters for statement
	            pstmt.setString(1, dId);
	            pstmt.setString(2, dName);
	            pstmt.setString(3, dNum);
				pstmt.executeUpdate();
				
				System.out.println("Inserted into a database");
				pstmt.close();
				conn.close();
				
			} catch(SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();	
			} catch(Exception e){
				// Handle errors for Class.forName
				e.printStackTrace();
			} finally{
				try{
			         if(pstmt!=null)
			            pstmt.close();
			      }catch(SQLException se2){
			      }// nothing we can do
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }
			}
			
		}
		public static void main(String [] args){
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please enter the Department Id");
			String deptId = userInput.nextLine();
			System.out.println("Please enter the Department Name");
			String deptName = userInput.nextLine();
			System.out.println("Please enter the Department Number");
			String deptNum = userInput.nextLine();
			
			insertToDatabase(deptId, deptName, deptNum);
		}


}
