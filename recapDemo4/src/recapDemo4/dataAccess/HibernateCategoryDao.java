package recapDemo4.dataAccess;

import recapDemo4.entities.Category;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		
		System.out.println("Hibernate ile Veritabanına Kategori eklendi : " + category.getCategeoryName());
		
	}




}
