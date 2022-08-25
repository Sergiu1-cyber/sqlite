package main.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Operatii {

	Connection conn;

	public Operatii(Connection conn) {
		this.conn = conn;
	}

	public void getDates() {
		try{
			Statement statement = this.conn.createStatement();
			String query = "SELECT * FROM posts";
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				String title = rs.getString("title");
				String post = rs.getString("post");
				System.out.println(title + "\t| " + post);
			}
			rs.close();
			statement.close();	
		} 
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void setDates(String title, String post) {
		try {
			String query = "INSERT INTO posts(title, post) VALUES (?, ?) ";
			PreparedStatement pstatement = this.conn.prepareStatement(query);
			pstatement.setString(1, title);
			pstatement.setString(2, post);
			int res = pstatement.executeUpdate();
			if (res == 1) {
				System.out.println("Date adaugate ...");
			}
			else {
				System.out.println("Eroare");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
