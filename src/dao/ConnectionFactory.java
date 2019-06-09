package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * コネクション作成クラス
 * @author ryuta maehara
 *
 */

public final class ConnectionFactory {
	static Connection createConnection() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/shudo?"
					+ "autoReconnect=true&useSSL=false",
	        		"root","root");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
