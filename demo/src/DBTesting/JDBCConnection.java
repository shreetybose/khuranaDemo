package DBTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String host = "localhost";
		String port = "3306";
		
		//Class.forName( "com.mysql.jdbc.Driver" );

		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/KinjalBatch","root","12345678");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("SELECT * FROM KinjalBatch.shreeetyBatchStudents where name='Kashish'");
		
		while(rs.next()) {
			System.out.println(rs.getString("location"));
			System.out.println(rs.getString("age"));
		}
		
		

	}

}
