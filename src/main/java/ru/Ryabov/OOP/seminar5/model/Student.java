package ru.Ryabov.OOP.seminar5.model;

public class Student extends User{

    private Integer studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Student(String fName, String sName, String lName, Integer studentId) {
        super(fName, sName, lName);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                '}';
    }
}
