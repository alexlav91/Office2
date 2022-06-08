package ru.officeWorker.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class Manager  {
    private int Id;
    private String name;
    private String surname;
    private int age;
    private double experience;
    private List<Person> subordinates;

        public Manager(int id, String name, String surname, int age, double experience, List<Person> subordinates) {
        Id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.experience = experience;
        this.subordinates = subordinates;
    }

    public Manager(int id, String name) {
        Id = id;
        this.name = name;
    }

    public Manager(int id, String name, String surname, int age, double experience) {
        Id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.experience = experience;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {

        this.experience = experience;
    }

    public List<Person> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Person> subordinates) {
        this.subordinates = subordinates;
    }
}

