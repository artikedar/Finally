package com.flp.fms.dao;

import java.util.List;
import java.util.Map;

import com.flp.fms.domain.Category;
import com.flp.fms.domain.Film;
import com.flp.fms.domain.Language;

public interface IFilmDao {
	
	public List<Language> getLanguages();

	public List<Category> getCategories();
	
	public void addFilm(Film film);
	
	public Map<Integer, Film> getAllFilms();

	
	

	
	
}
