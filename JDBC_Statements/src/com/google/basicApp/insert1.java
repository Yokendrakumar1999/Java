package com.google.basicApp;

import java.sql.*;

public class insert1 {

		public static void main(String[] args) {
		    Connection con=null;
		    Statement stmt=null;
		    String qry="insert into BTM.Student values(201,'sangeeth',65)";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=yogi");
				stmt=con.createStatement();
				stmt.executeUpdate(qry);
				System.out.println("Inserted successfully");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			finally {
				if(stmt!=null) {
					try {
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(con!=null) {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
}
