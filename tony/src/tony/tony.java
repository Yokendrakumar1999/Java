package tony;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class tony {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String qry="insert into BTM.Student values(125,'Sukesh',22)";
		String qry1="insert into BTM.Student values(124,'Sukesh',22)";
		try {
			Class.forName("com.mysql.jdbc.Driver"); //1
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=yogi");  //2
			stmt=con.createStatement();  //3
			stmt.executeUpdate(qry);   //4
			stmt.executeUpdate(qry1);
			System.out.println("Insert succesfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {   //5
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
