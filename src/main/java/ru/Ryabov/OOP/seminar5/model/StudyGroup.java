package ru.Ryabov.OOP.seminar5.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student>  {
    private List<Student> studList;

    private Teacher teacher;


    public StudyGroup(){
        studList = new ArrayList<>();
    }
    public StudyGroup(List<Student> studList){
        setStudList(studList);
    }

    public List<Student> getStudList() {
        return studList;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    

    public void setStudList(List<Student> studList) {
        this.studList = studList;
    }

    @Override
    public StudyGroupIter iterator() {
        return new StudyGroupIter(this);
    }
}
