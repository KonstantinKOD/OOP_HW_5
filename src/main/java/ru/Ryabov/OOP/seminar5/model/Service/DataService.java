package ru.Ryabov.OOP.seminar5.model.Service;

import ru.Ryabov.OOP.seminar5.model.Student;
import ru.Ryabov.OOP.seminar5.model.Teacher;
import ru.Ryabov.OOP.seminar5.model.Type;
import ru.Ryabov.OOP.seminar5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> uList;

    public void Create(String fName, String sName, String lName, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type){
            Student student = new Student(fName, sName, lName, id);
            uList.add(student);
        }
        if (Type.TEACHER == type){
            Teacher teacher = new Teacher(fName, sName , lName, id);
            uList.add(teacher);
        }
    }

    public User getUserID (Type type, int id) {
        User resUser = null;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : uList) {
            if (itsStudent && user instanceof Student && ((Student) user).getStudentId() == id) {
                resUser = user;
            }
            if (!itsStudent && user instanceof Teacher && ((Teacher) user).getTeacherId() == id) {
                resUser = user;
            }
        }
        return resUser;
    }

    public List<User> getAll(){
        return uList;
    }

    public List<User> getStudentAll(){
        List<User> resultList = new ArrayList<>();
        for (User user : uList) {
            if (user instanceof Student) {
                resultList.add(user);
            }
        }
        return resultList;
    }
    
    private int getFreeId(Type type) {
        int lastID = 1;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : uList) {
            if (itsStudent && user instanceof Student) {
                lastID = ((Student) user).getStudentId() + 1;
            }
            if (!itsStudent && user instanceof Teacher) {
                lastID = ((Teacher) user).getTeacherId() + 1;
            }
        }
        return lastID;
    }
}
