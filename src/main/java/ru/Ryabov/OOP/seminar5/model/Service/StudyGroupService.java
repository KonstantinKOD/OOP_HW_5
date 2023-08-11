package ru.Ryabov.OOP.seminar5.model.Service;

import ru.Ryabov.OOP.seminar5.model.Student;
import ru.Ryabov.OOP.seminar5.model.StudyGroup;
import ru.Ryabov.OOP.seminar5.model.Teacher;

import java.util.List;

public class StudyGroupService {

    private StudyGroup studentGroup;
    private Student student;
    private Teacher teacher;

    public StudyGroupService(StudyGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudyGroupService(){
        this.studentGroup = new StudyGroup();
    }

    public StudyGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudyGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addGroup(List<Student> group, Teacher teacher){
        if (teacher != null) {
            teacher.add(teacher); // Как правильно написать метод добавления учителя в группу?
        }
        while (group.size() < 30){
            group.add(student);
        }

    }

    public boolean removeStudent(String fName, String sName, String lName, Integer studentId) {
        Student removeStudent = new Student(fName, sName, lName, null);
        if (studentGroup.getStudList() == null) return false;
        List<Student> studentList = studentGroup.getStudList();
        for (Student student : studentList) {
            if (student.equals(removeStudent)) {
                studentList.remove(student);
                return true;
            }
        }
        return false;
    }
}
