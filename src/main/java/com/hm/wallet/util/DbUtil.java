package com.hm.wallet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	public static Connection getDbMySqlConnection() {

		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/app", "root", "ROOT");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}
}
