package dataAccsess;

import entities.Category;
import entities.Course;
import entities.Teacher;

public class HibernateDao implements ProductDao{
    @Override
    public void add(Category category) {
        System.out.println("Added to databse with Hibernate: " + category.getCategoryName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Deleted from database with Hibernate: " + category.getCategoryName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Updated in database with Hibernate: " + category.getCategoryName());
    }

    @Override
    public void add(Course course) {
        System.out.println("Added to database with Hibernate: " + course.getCourseName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Deleted from database with Hibernate: " + course.getCourseName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Updated in database with Hibernate: " + course.getCourseName());
    }

    @Override
    public void add(Teacher teacher) {
        System.out.println("Added to database with Hibernate: " + teacher.getFirstName() + " " + teacher.getLastName());
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println("Deleted from database with Hibernate: " + teacher.getFirstName() + " " + teacher.getLastName());
    }

    @Override
    public void update(Teacher teacher) {
        System.out.println("Updated in database with Hibernate: " + teacher.getFirstName() + " " + teacher.getLastName());
    }
}
