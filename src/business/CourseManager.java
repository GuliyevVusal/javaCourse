package business;

import dataAccsess.ProductDao;
import entities.Course;
import logger.Logger;

public class CourseManager implements CourseService {

    private Course[] courses;
    private ProductDao productDao;
    private Logger log;

    public CourseManager(Course[] courses, ProductDao productDao, Logger log) {
        this.courses = courses;
        this.productDao = productDao;
        this.log = log;
    }

    @Override
    public void add(Course course) throws Exception {
        if (course.getUnitPrice() < 0) {
            throw new Exception("Course price cannot be less than 0.");
        }
        //Course name check
        for (Course coursName : courses) {
            if (coursName.getCourseName() == course.getCourseName()) {
                throw new Exception("This course has already been added.");
            }
        }
        productDao.add(course);
        log.add(course);
    }

    @Override
    public void delete(Course course) {
        productDao.delete(course);
    }

    @Override
    public void update(Course course) {
        productDao.update(course);
    }
}
