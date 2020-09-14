package com.company.model;

public class Car {

    private User user;

    private String make;
    private String model;
    private int year;

    public Car(User user, String make, String model, int year) {
        this.user = user;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return user.toString() +
                "Car: " +
                "'" + make + '\'' +
                ", '" + model + '\'' +
                ", " + year;
    }

}