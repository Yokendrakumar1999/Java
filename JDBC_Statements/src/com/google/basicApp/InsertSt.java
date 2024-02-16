package com.google.basicApp;
import java.sql.*;

public class InsertSt {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String qry1="insert into BTM.Student values(501,'vj',22)";
		String qry2="insert into BTM.Student values(502,'nr',21)";
		String qry3="insert into BTM.Student values(503,'hk',23)";
		String qry4="insert into BTM.Student values(504,'abi',24)";
		String qry5="insert into BTM.Student values(505,'dina',24)";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=yogi");
			stmt=con.createStatement();
			stmt.executeUpdate(qry1);
			stmt.executeUpdate(qry2);
			stmt.executeUpdate(qry3);
			stmt.executeUpdate(qry4);
			stmt.executeUpdate(qry5);

			System.out.println("record inserted successfully");
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
