package org.example.app.db.entity;

import java.util.ArrayList;

public class Student {
    private Long id;
    private String name;
    private int age;
    private String lastName;
    private String phone;
    private String birthPlace;
    private Character gender;
    private String course_name;

   public Student(long id, String name, String lastName) {
   }

    public ArrayList<Pagesa> getPagesa() {
        return pagesa;
    }

    public void setPagesa(ArrayList<Pagesa> pagesa) {
        this.pagesa = pagesa;
    }

    private  ArrayList<Pagesa>pagesa;

    public Student(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public Student(Long id, String name, int age, String lastName, String phone, String birthPlace, Character gender, String course_name) {
        this.id = id;
        this.name = name;
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.phone = phone;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.course_name = course_name;
        this.pagesa = new ArrayList<>();

    }

//    public Student(long id, String name, int age, Object o, String lastName, String phone, String birthplace, char gender, String courseName) {
//    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getCourseName() {
        return course_name;
    }

    public void setCourseName(String course_name) {
        this.course_name = course_name;
    }

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Student() {

        this.id = 0L;
        this.age = 0;
        this.name = "";
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", gender=" + gender +
                ", courseName='" + course_name + '\'' +
                '}';
    }
}
