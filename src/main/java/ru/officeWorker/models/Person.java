package ru.officeWorker.models;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private int id;
    private String name;
    private String surname;
    private int age;
    private double experience;
    private String manager;

    public Person() {
    }

    public Person(int id, String name, String surname, int age, double experience, String manager) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.experience = experience;
        this.manager = manager;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {

        this.manager = manager;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

