package logger;

import entities.Category;
import entities.Course;
import entities.Teacher;

public class FileLogger implements Logger {
    @Override
    public void add(Category category) {
        System.out.println("Logged to File : " + category.getCategoryName());
    }

    @Override
    public void add(Course course) {
        System.out.println("Logged to File : " + course.getCourseName());
    }

    @Override
    public void add(Teacher teacher) {
        System.out.println("Logged to File : " + teacher.getFirstName() + " " + teacher.getLastName());
    }
}
