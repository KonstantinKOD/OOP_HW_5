package ru.Ryabov.OOP.seminar5.model.controller;

import ru.Ryabov.OOP.seminar5.model.Service.DataService;
import ru.Ryabov.OOP.seminar5.model.Student;
import ru.Ryabov.OOP.seminar5.model.Type;
import ru.Ryabov.OOP.seminar5.model.User;
import ru.Ryabov.OOP.seminar5.model.view.StudentView;

import java.util.List;

public class Controller {
    public final DataService service = new DataService();
    StudentView view = new StudentView();

    public void createStudent(String fName, String lName, String sName) {
        service.Create(fName, sName, lName, Type.STUDENT);
    }

    public void createTeacher(String fName,String lName,String sName) {
        service.Create(fName,sName,lName,Type.TEACHER);
    }



    public void getAll() {
        List<User> userList = service.getStudentAll();
        for (User user : userList) {
            view.print((Student) user);
        }
    }
}

