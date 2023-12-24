package logger;

import entities.Category;
import entities.Course;
import entities.Teacher;

public class DatabaseLogger implements Logger {
    @Override
    public void add(Category category) {
        System.out.println("Logged to Database : " + category.getCategoryName());
    }

    @Override
    public void add(Course course) {
        System.out.println("Logged to Database : " + course.getCourseName());
    }

    @Override
    public void add(Teacher teacher) {
        System.out.println("Logged to Database : " + teacher.getFirstName() + " " + teacher.getLastName());
    }
}
