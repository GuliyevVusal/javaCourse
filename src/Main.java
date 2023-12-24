import business.CategoryManager;
import business.CourseManager;
import business.TeacherManager;
import dataAccsess.HibernateDao;
import dataAccsess.JdbcDao;
import entities.Category;
import entities.Course;
import entities.Teacher;
import logger.DatabaseLogger;
import logger.FileLogger;

public class Main {
    public static void main(String[] args) throws Exception {

        Teacher teacher = new Teacher("Sarkhan", "Rasullu");

        Course course1 = new Course("Java Programming Course", teacher, 200);

        Course course2 = new Course("C & C++ ", teacher, 0);

        Course[] courses = {course2};

        Category category1 = new Category(1, "Programming");
        Category category2 = new Category(2, "Graphic Design");

        Category[] categories = {category1};

        CourseManager courseManager = new CourseManager(courses, new JdbcDao(), new DatabaseLogger());
        courseManager.add(course1);
        courseManager.update(course1);
        courseManager.delete(course1);

        CategoryManager categoryManager = new CategoryManager(categories, new HibernateDao(), new FileLogger());
        categoryManager.add(category2);
        categoryManager.update(category2);
        categoryManager.delete(category2);

        TeacherManager teacherManager = new TeacherManager(new HibernateDao(), new FileLogger());
        teacherManager.add(teacher);
        teacherManager.update(teacher);
        teacherManager.delete(teacher);
    }
}
