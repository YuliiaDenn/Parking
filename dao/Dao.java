package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

	public final String PASSWORD = "root";
	public final String USERNAME = "root";
	public final String URL = "jdbc:mysql://localhost:3306/parking?serverTimezone=Europe/Kiev";

	public Connection getConnection() {

		Connection conn = null;

		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return conn;
	}

}
