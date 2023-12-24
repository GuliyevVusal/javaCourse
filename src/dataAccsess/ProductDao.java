package dataAccsess;

import entities.Category;
import entities.Course;
import entities.Teacher;

public interface ProductDao {

    void add(Category category);

    void delete(Category category);

    void update(Category category);

    void add(Course course);

    void delete(Course course);

    void update(Course course);

    void add(Teacher teacher);

    void delete(Teacher teacher);

    void update(Teacher teacher);
}
