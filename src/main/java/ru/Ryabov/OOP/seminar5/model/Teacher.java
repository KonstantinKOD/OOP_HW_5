package ru.Ryabov.OOP.seminar5.model;

public class Teacher extends User {

    private Integer teacherId;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher(String fName, String sName, String lName, Integer teacherId) {
        super(fName, sName, lName);
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                '}';
    }
}
