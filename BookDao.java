package com.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.Book;
import java.sql.Connection;
/*
 * @author Balaji
 */
public class BookDao {
	
	Connection con;
	
	public void saveBook(Book book) throws ClassNotFoundException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		 
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cognizant","root","sql@admin");

			String qry = "insert into book values(?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(qry);
			
			ps.setInt(1, book.getIsbn());
			ps.setString(2, book.getName());
			ps.setString(3, book.getAuthor());
			ps.executeUpdate();
			//con.commit();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteBook(int isbn){
		try {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cognizant","root","sql@admin");
			
			String qry = "delete from book where isbn = ?";
			
			PreparedStatement ps = con.prepareStatement(qry);
			
			ps.setInt(1, isbn);

			ps.executeUpdate();
			//con.commit();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	 
}
