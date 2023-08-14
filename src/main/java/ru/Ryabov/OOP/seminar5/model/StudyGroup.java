package ru.Ryabov.OOP.seminar5.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student>  {
    private List<Student> studList;

    Teacher teacher;


    public StudyGroup(){
        studList = new ArrayList<>();
    }
    public StudyGroup(List<Student> studList, Teacher teacher){
        setStudList(studList);
        this.teacher = teacher;
    }

    public List<Student> getStudList() {
        return studList;
    }

    public void setStudList(List<Student> studList) {
        this.studList = studList;
    }

    @Override
    public StudyGroupIter iterator() {
        return new StudyGroupIter(this);
    }
}
