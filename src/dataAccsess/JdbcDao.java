package dataAccsess;

import entities.Category;
import entities.Course;
import entities.Teacher;

public class JdbcDao implements ProductDao{
    @Override
    public void add(Category category) {
        System.out.println("Added to database with JDBC: " + category.getCategoryName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Deleted from database with JDBC: " + category.getCategoryName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Updated in database with JDBC: " + category.getCategoryName());
    }

    @Override
    public void add(Course course) {
        System.out.println("Added to database with JDBC: " + course.getCourseName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Deleted from database with JDBC: " + course.getCourseName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Updated in database with JDBC: " + course.getCourseName());
    }

    @Override
    public void add(Teacher teacher) {
        System.out.println("Added to database with JDBC: " + teacher.getFirstName() + " " + teacher.getLastName());
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println("Deleted from database with JDBC: " + teacher.getFirstName() + " " + teacher.getLastName());
    }

    @Override
    public void update(Teacher teacher) {
        System.out.println("Updated in database with JDBC: " + teacher.getFirstName() + " " + teacher.getLastName());
    }
}
