package business;

import entities.Teacher;

public interface TeacherService {
    void add(Teacher teacher);

    void delete(Teacher teacher);

    void update(Teacher teacher);
}
