package main.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

  public Connection connect() {
    Connection conn = null;
    try{
      Class.forName("org.sqlite.JDBC");
      String url = "jdbc:sqlite:databaza.db";
      conn = DriverManager.getConnection(url);
      System.out.println("Conectat ...");
    }
    catch (ClassNotFoundException e) {
      System.out.println("ClassNotFoundException: " + e.getMessage());
    }
    catch (SQLException e) {
      System.out.println("SQL Error: " + e.getMessage());
    }

    return conn;
  }
}
