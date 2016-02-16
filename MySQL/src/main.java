import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class main {

	public static void main(String[] args) {
		String dbHost="localhost";
		String dbDatabase="softdev2";
		String dbUser = "root";
		String dbPassword = "";
		try {
			// register driver
			Class.forName("com.mysql.jdbc.Driver");
			// Make Connection Url
			String connectionUrl = "jdbc:mysql://" + dbHost
						+ "/" + dbDatabase
						+ "?user=" + dbUser
						+ "&password=" + dbPassword;
			//open Connection
			Connection conn = DriverManager.getConnection(connectionUrl);
			// Code to create sql and run it will go here
			// create SQL
			String sql = "insert into student (id,firstname,age) values (2, 'Mary',21);";
			// prepare Statement
			PreparedStatement ps = conn.prepareStatement(sql);
			// execute SQL
			ps.executeUpdate();
			
			// close connection
			conn.close();
		}catch (ClassNotFoundException cnfe){
			throw new RuntimeException(cnfe);
		}catch (SQLException sqle) {
		throw new RuntimeException(sqle);
		}
		}

}
