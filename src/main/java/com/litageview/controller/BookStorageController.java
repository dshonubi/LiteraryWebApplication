package com.litageview.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Optional;
import java.io.BufferedReader;
import java.io.StringReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.litageview.domain.Author;
import com.litageview.domain.Books;
import com.litageview.service.LiteraryWebApplicationService;

	@RestController
	public class BookStorageController {
	
		static BookStorageController bsc;
		static Author author;
		
		@Autowired
		LiteraryWebApplicationService lwas = new LiteraryWebApplicationService();
		
		

		
		//Details needed to connect to the local database for now
		private static Connection connection = null;
		private static String host = "localhost";
		private static int PORT = 3306;
		private static String database = "as1068";
		private static String username = "root";
		private static String password = "Ayodele28?";
		
		@RequestMapping(value = "/uploadBook")
		public ModelAndView uploadBookWebpage(){
			ModelAndView mav = new ModelAndView();
			mav.setViewName("authorBookUpload");
			return mav;
		}
		
		@RequestMapping(value = "/savingFile", method = RequestMethod.POST)
		public @ResponseBody String saveTextDocument(@RequestParam MultipartFile file, @RequestParam String bookTitle){
			System.out.println("reached");
			if(!file.isEmpty()) {
				try {
					bsc.selectSavedBook(author.getFirstName(), author.getLastName(), bookTitle);
					return	"Document was uploaded succesfully.";
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}else {
				return	"Please upload a valid document.";
			}
			
			//Code doesn't reach this point
			return "";
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Connection to database
		public static Connection connection() {

			if (connection == null) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String connect_string = "jdbc:mysql://" + host + ":" + PORT + "/" + database;
					connection = DriverManager.getConnection(connect_string, username, password);
					return connection;

				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
			} else {
				return connection;
			}
		}
		
		//selection of best solution from the collated algorithms
		public MultipartFile selectSavedBook(String authorFirstName, String authorLastName, String bookTitle) 
				throws SQLException {

			Connection connection = connection();
			Statement statement = connection.createStatement();
			String sql = "";
			
			ResultSet rs = statement.executeQuery(sql); 
			int [] aId = new int[5];
			int [] algorithms = new int[5];
			int i = 0;
			while (rs.next()) {
				
				int id = Integer.parseInt(rs.getString("Id"));
				int solution = Integer.parseInt(rs.getString("FinalSolution"));
				
				aId[i] = id;
				algorithms[i] = solution;
				
				i++;
			}
			
			int lowestSol = 0; 
			for(int j = 0; j<5;j++) {
				if(j==4) {
					break;
				}else if(algorithms[j]<algorithms[j+1]){
					lowestSol = j;
				}else {
					lowestSol = j+1;
				}
			}
			
			return null;	
		}
}
