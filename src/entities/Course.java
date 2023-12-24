package entities;

public class Course {

    private String courseName;
    private Teacher teacher;
    private double unitPrice;

    public Course() {
    }

    public Course(String courseName, Teacher teacher, double unitPrice) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.unitPrice = unitPrice;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
