package com.litageview.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
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
		
		@RequestMapping(value = "/uploadBook", method = RequestMethod.GET)
		public ModelAndView uploadBookWebpage(){
			ModelAndView mav = new ModelAndView();
			mav.setViewName("authorBookUpload");
			System.out.println("reahced");
			return mav;
		}
		
		
		// Saving book to database
		@RequestMapping(value = "/savingBook", method = RequestMethod.POST)
		public @ResponseBody String deleteBook(@RequestParam MultipartFile file, @RequestParam int bookId,
														@RequestParam String title,
														@RequestParam ArrayList<String> genre,
														@RequestParam String description){
			
			if(!file.isEmpty()) {
				try {
						Optional<Books> book = lwas.findByBookId(bookId);
						book.get().setBook(file);
						book.get().setTitle(title);
						book.get().setGenre(genre);
						book.get().setDescription(description);
						Instant instant = Instant.now();
						book.get().setUploadDate(Date.from(instant));
					
						return	"Book was uploaded succesfully.";
					
					}catch(Exception e) {
						e.printStackTrace();
					}
				
			}else {
				return	"Please upload a valid document.";
			}
			
			//Code doesn't reach this point
		return "";
		}
		
		
		//Removing book from database
		@RequestMapping(value = "/deletingBook", method = RequestMethod.POST)
		public @ResponseBody String deleteDocument(@RequestParam MultipartFile file, @RequestParam int bookId){
			System.out.println("reached");
				
					Optional<Books> book = lwas.findByBookId(bookId);
					if(!book.isEmpty()) {
						
						lwas.deleteByBookId(bookId);
					
						return	"Book was deleted succesfully.";
					
					}else {
						//Will delete later when drop down system is introduced.
						return	"Please select a valid book.";
					}

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

}
