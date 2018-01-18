package com.privalia.model;

public class Student extends PrivaliaObject{
    private int idStudent;
    private String name;
    private String surname;
    private int age;


    /*
     * Exemple inicialitzador static
     */
    static int numero;

    static {
        numero = 10;
    }
    // Final exemple

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int idStudent) {
        this.idStudent = idStudent;
    }
}
