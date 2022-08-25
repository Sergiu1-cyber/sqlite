package main;

import java.sql.Connection;
import main.db.*;

public class Main {

  public static void main(String[] args) {
    Connect conector = new Connect();
    Connection conn = conector.connect();

		String title = "Date ...";
		String post = "Noi ...";
		Operatii opr = new Operatii(conn);
		opr.getDates();
  }

}
