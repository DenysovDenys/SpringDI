package com.company.model;

public class User {

    private String name;
    private String lname;
    private int age;

    public User() {
    }

    public User(String name, String lName, int age) {
        this.name = name;
        this.lname = lName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  "Driver: '" + name + '\'' +
                ", '" + lname + '\'' +
                ", " + age +
                '\n';
    }

}