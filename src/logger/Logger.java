package logger;

import entities.Category;
import entities.Course;
import entities.Teacher;

public interface Logger {
    void add(Category category);

    void add(Course course);

    void add(Teacher teacher);
}
