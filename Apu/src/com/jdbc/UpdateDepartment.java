package com.jdbc;
// Step 1: Import required packages
import java.sql.*;
import java.util.Scanner;
public class UpdateDepartment {


			// JDBC driver name and database URL
			static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
			static final String DB_URL = "jdbc:mysql://localhost:3306/apudb";
			
			// Database credentials
			static final String USER = "root";
			static final String PASSWORD = "Chikkydeepu3*"; 
			
			public static void updateTheDatabase(String id, String name){
				String dId = id;
				String dName = name;
				
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
					sql = "UPDATE department SET depName = ? WHERE depId = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, dName);
					pstmt.setString(2, dId);
					pstmt.executeUpdate();
					System.out.println("Record updated successfully");
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
					//
				}
				
			}
			public static void main(String [] args){
				Scanner userInput = new Scanner(System.in);
				System.out.println("Please enter the Department Id");
				String deptId = userInput.nextLine();
				System.out.println("Please enter the Department Name to change");
				String deptName = userInput.nextLine();
				updateTheDatabase(deptId, deptName);
			}
		}


