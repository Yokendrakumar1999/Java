package com.google.basicApp;

import java.sql.*;

public class UpdateSt {
	public static void main(String[] args) {

		Connection con=null;
		Statement stmt=null;
		String qry="update BTM.Student set name='vj', age=44 where id=501";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=yogi");

			stmt=con.createStatement();
			stmt.executeUpdate(qry);
			System.out.println("updated successfully");
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
			}if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
