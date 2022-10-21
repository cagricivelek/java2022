package recapDemo4.business;

import recapDemo4.core.logging.ILogger;
import recapDemo4.dataAccess.ICategoryDao;
import recapDemo4.entities.Category;

public class CategoryManager {
	
	private ICategoryDao categoryDao;
	private Category[] categories;
	private ILogger[] loggers;
	
	
	public CategoryManager(ICategoryDao categoryDao, Category[] categories, ILogger[] loggers) {
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception{
		
		for (Category c : categories) {
			if (category.getCategeoryName() == c.getCategeoryName()) {
				throw new Exception("Kategori İsmi Tekrar Edemez...");
			}
		}
		
		categoryDao.add(category);
		
		for (ILogger logger : loggers) {
			logger.log(category.getCategeoryName());
		}
		
		
	}
	

}
