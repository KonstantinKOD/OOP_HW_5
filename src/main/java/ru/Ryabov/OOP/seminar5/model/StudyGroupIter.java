package ru.Ryabov.OOP.seminar5.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroupIter implements Iterator<Student> {
    public List<Student> students;
    private int counter;

    public StudyGroupIter(StudyGroup studentGroup) {
        this.students = studentGroup.getStudList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()) return null;
        counter++;
        return students.get(counter);
    }

    @Override
    public void remove() {
        students = new ArrayList<>();
        counter = 0;
    }
}

