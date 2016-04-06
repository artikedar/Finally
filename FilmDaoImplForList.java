package com.flp.fms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.flp.fms.domain.Category;
import com.flp.fms.domain.Film;
import com.flp.fms.domain.Language;

public class FilmDaoImplForList implements IFilmDao{
	
	private Map<Integer, Film> film_Repository=new HashMap<>();
	
	public Connection getConnection(){
		Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/filmdb", "root", "Pass1234");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	@Override
	public List<Language> getLanguages() {
			List<Language> languages=new ArrayList<>();
			Connection con=getConnection();
			String sql="SELECT * FROM languages";
						
			try {
				PreparedStatement pst=con.prepareStatement(sql);
				ResultSet rs=pst.executeQuery();
				Language language=new Language();
				language.setLanguage_Id(1);
				language.setName(rs.getString(2));
				languages.add(language);
				
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
			
			
			/*languages.add(new Language(1, "English"));
			languages.add(new Language(2, "Hindi"));
			languages.add(new Language(3, "Marathi"));
			languages.add(new Language(4, "Tamil"));
			languages.add(new Language(5, "Telegu"));
		*/
			return languages;
			}

	@Override
	public List<Category> getCategories() {
		List<Category> categories=new ArrayList<>();
		Connection con=getConnection();
		String sql="SELECT * FROM category";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			Category category=new Category();
			category.setCategory_Id(1);
			category.setName(rs.getString(2));
			categories.add(category);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		/*categories.add(new Category(1, "Horror"));
		categories.add(new Category(2, "Comedy"));
		categories.add(new Category(3, "Romance"));
		categories.add(new Category(4, "Drama"));
		categories.add(new Category(5, "Action"));
		categories.add(new Category(6, "Documentry"));*/
		
		return categories;
	}

	@Override
	public void addFilm(Film film) {
		
		
		
	/*	film_Repository.put(film.getFilm_ID(), film);*/
		}

	@Override
	public Map<Integer, Film> getAllFilms() {
		// TODO Auto-generated method stub
		return film_Repository;
	}

	
	
	

	
	}

	

