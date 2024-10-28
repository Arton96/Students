package org.example;

import com.sun.jdi.LongValue;
import org.example.app.Ui.UserInterface;
import org.example.app.db.DBConnection;
import org.example.app.db.entity.Pagesa;
import org.example.app.db.entity.Student;
import org.example.app.repository.PagesaRepository;
import org.example.app.repository.StudentRepository;
import org.example.app.service.StudentService;

import java.security.Timestamp;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        DBConnection dbc = new DBConnection();

        StudentRepository studentRepo = new StudentRepository(dbc);
        PagesaRepository pagesaRepo = new PagesaRepository(dbc);


        StudentService studentService = new StudentService(studentRepo,pagesaRepo);
        System.out.println(studentRepo.kthejTeGjitheStudentet());

        UserInterface ui = new UserInterface(studentService,scanner);
        ui.start();

 }
}


