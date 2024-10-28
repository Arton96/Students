package org.example.app.service;

import org.example.app.db.entity.Pagesa;
import org.example.app.db.entity.Student;
import org.example.app.repository.PagesaRepository;
import org.example.app.repository.StudentRepository;

import java.sql.Date;
import java.util.List;

public class StudentService {

    private StudentRepository sRepo;
    private PagesaRepository pagesaRepo;

    public StudentService(StudentRepository sRepo, PagesaRepository pagesaRepo) {
        this.sRepo = sRepo;
        this.pagesaRepo = pagesaRepo;
    }



    public void createStudent(Student newStudent){
        sRepo.createStudent(newStudent);

        newStudent = sRepo.findLastStudent();
        for(int i = 0; i<=10; i++){
            Pagesa pagesa = new Pagesa(0l, newStudent.getId(), new Date(2024 - 1900,i+1,1),new Date(2024 - 1900,i+2,1),false,null);
            pagesaRepo.createPagesa(pagesa);
        }

    }
    public void makePayment(Student studenti){
        for(Pagesa p : studenti.getPagesat()){
            if(!p.getEshtePaguar()){

                p.setEshtePaguar(true);
                pagesaRepo.updatePagesa(p.getId(),p);
                System.out.println("Payment made successfully and expires at :" + p.getDataEMbarimit());
                break;
            }

        }
    }
}
