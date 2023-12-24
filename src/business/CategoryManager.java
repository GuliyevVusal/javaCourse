package business;

import dataAccsess.ProductDao;
import entities.Category;
import logger.Logger;

public class CategoryManager implements CategoryService {

    private Category[] categories;
    private ProductDao productDao;
    private Logger log;

    public CategoryManager(Category[] categories, ProductDao productDao, Logger log) {
        this.categories = categories;
        this.productDao = productDao;
        this.log = log;
    }

    @Override
    public void add(Category category) throws Exception {
        for (Category categoryName : categories) {
            if (categoryName.getCategoryName() == category.getCategoryName()) {
                throw new Exception("This category has already been added.");
            }
        }
        productDao.add(category);
        log.add(category);
    }

    @Override
    public void delete(Category category) {
        productDao.delete(category);
    }

    @Override
    public void update(Category category) {
        productDao.update(category);
    }
}
