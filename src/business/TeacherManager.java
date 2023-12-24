package business;

import logger.Logger;
import dataAccsess.ProductDao;
import entities.Teacher;

public class TeacherManager implements TeacherService {

    private ProductDao productDao;
    private Logger log;

    public TeacherManager(ProductDao productDao, Logger log) {
        this.productDao = productDao;
        this.log = log;
    }

    @Override
    public void add(Teacher teacher) {
        productDao.add(teacher);
        log.add(teacher);
    }

    @Override
    public void delete(Teacher teacher) {
        productDao.delete(teacher);
    }

    @Override
    public void update(Teacher teacher) {
        productDao.update(teacher);
    }
}
