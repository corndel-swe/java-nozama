package com.corndel.nozama;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Db {
  static final String dbUrl = "jdbc:sqlite:nozama.db";

  public Connection getConnection() throws SQLException {
    return DriverManager.getConnection(dbUrl);
  }
}
