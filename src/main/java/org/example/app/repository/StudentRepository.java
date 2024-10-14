package org.example.app.repository;

import org.example.app.db.DBConnection;
import org.example.app.db.entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private DBConnection dbConnection;


    public StudentRepository(DBConnection connection){
        this.dbConnection = connection;
    }

    public void createStudent(Student student){
        String query = "insert into studentet(name,age,last_name,phone,birthplace,gender,course_name) values(?,?,?,?,?,?,?)";

        try(Connection lidhja = this.dbConnection.getConnection();
            PreparedStatement urdheri = lidhja.prepareStatement(query)

        ){
            urdheri.setString(1,student.getName());
            urdheri.setInt(2,student.getAge());
            urdheri.setString(3,student.getLastName());
            urdheri.setString(4,student.getPhone());
            urdheri.setString(5,student.getBirthPlace());
            urdheri.setString(6, String.valueOf(student.getGender()));
            urdheri.setString(7,student.getCourseName());
            urdheri.executeUpdate();
        }catch (SQLException e){
            System.out.println("Nuk mujta me shtu studentin");
            e.printStackTrace();
        }
    }
    public Student findStudentById(Long id){
        String query = "select * from studentet where id = ?";

        try(Connection lidhja = this.dbConnection.getConnection();
            PreparedStatement urdheri = lidhja.prepareStatement(query)

        ){
            urdheri.setLong(1,id);
            ResultSet response = urdheri.executeQuery();
            if(response.next()){
                String genderRespStr = response.getString("gender");
                Character genderResponse = null;
                if(genderRespStr != null){
                    genderResponse = genderRespStr.charAt(0);
                }
                return new Student(
                        response.getLong("id"),
                        response.getString("name"),
                        response.getInt("age"),
                        response.getString("last_name"),
                        response.getString("phone"),
                        response.getString("birthplace"),
                        genderResponse,
                        response.getString("course_name")
                );

            }
        }catch (SQLException e){
            System.out.println("Nuk mujta me shtu studentin");
            e.printStackTrace();
        }
        return null;
    }

    public List<Student> kthejTeGjitheStudentet() {
        String query = "SELECT * FROM studentet";
        List<Student> studentList = new ArrayList<>();


        try (Connection lidhja = this.dbConnection.getConnection();
             PreparedStatement urdher = lidhja.prepareStatement(query);
             ResultSet respons = urdher.executeQuery()) {


            while (respons.next()) {
                String genderStr = respons.getString("gender");
                char gender = 0;
                if(genderStr != null){
                    gender = genderStr.charAt(0);
                }
                Student student = new Student(
                        respons.getLong("id"),
                        respons.getString("name"),
                        respons.getInt("age"),
                        respons.getString("last_name"),
                        respons.getString("phone"),
                        respons.getString("birthplace"),
                        gender,
                        respons.getString("course_name")

                );
                studentList.add(student);
            }
        } catch (SQLException e) {
            System.out.println("Nuk mujta me i kthy studentet");
            e.printStackTrace();
        }
        return studentList;
    }
    public void updateStudent(Long id ,Student student){
        String query = "Update Studentet set name = ? , age = ?,last_name = ?,phone = ?,birthplace = ?,gender = ?,course_name = ? where id = ?";


        try(Connection lidhja = this.dbConnection.getConnection();
            PreparedStatement urdheri = lidhja.prepareStatement(query)

        ){
            String genderStr = student.getGender() +"";


            urdheri.setString(1,student.getName());
            urdheri.setInt(2,student.getAge());
            urdheri.setString(3,student.getLastName());
            urdheri.setString(4,student.getPhone());
            urdheri.setString(5,student.getBirthPlace());
            urdheri.setString(6, genderStr.charAt(0) + "");
            urdheri.setString(7,student.getCourseName());
            urdheri.setLong(8,id);


            urdheri.executeUpdate();
        }catch (SQLException e){
            System.out.println("Nuk mujta me ndryshu studentin");
            e.printStackTrace();
        }
    }
    public void deleteStudent(Long id){
        String query = "Delete from Studentet where id = ?";


        try(Connection lidhja = this.dbConnection.getConnection();
            PreparedStatement urdheri = lidhja.prepareStatement(query)

        ){

            urdheri.setLong(1,id);
            urdheri.executeUpdate();
        }catch (SQLException e){
            System.out.println("Nuk mujta me fshi studentin");
            e.printStackTrace();
        }
    }
    }



