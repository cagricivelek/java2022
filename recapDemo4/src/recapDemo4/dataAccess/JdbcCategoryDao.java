package recapDemo4.dataAccess;

import recapDemo4.entities.Category;

public class JdbcCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		
		System.out.println("Jdbc ile Veritabanına Kurs eklendi : " + category.getCategeoryName());
		
	}



}
