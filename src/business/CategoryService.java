package business;

import entities.Category;

public interface CategoryService {

    void add(Category category) throws Exception;

    void delete(Category category);

    void update(Category category);
}
