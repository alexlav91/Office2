package ru.officeWorker.dao;

import org.springframework.stereotype.Component;
import ru.officeWorker.models.Person;
import  ru.officeWorker.dao.ManagerDao;


import java.util.ArrayList;
import java.util.List;
@Component
public class PeopleDao {
    private static int peopleId;
    List<Person> people;
    {   people = new ArrayList<>();
        people.add(new Person(++peopleId,"Tom", "Tomson",20,1.0,"Eduard"));
        people.add(new Person(++peopleId,"Jane", "Janiton",23,1.5,"Eduard" ));
        people.add(new Person(++peopleId,"Cat", "Catison", 19,0.5,"Nikola"));
        people.add(new Person(++peopleId,"Met", "Metison",25,3.3,"Nikola"));
        people.add(new Person(++peopleId,"Nika", "Nikova", 18, 0.1,"Denis"));
        people.add(new Person(++peopleId,"Kris", "Kristovich", 30,5.0,"Denis"));
    }
    public  List<Person> index(){

        return people;
    }
    public Person show(int id){

        return people.stream().filter(person->person.getId()==id).findAny().orElse(null);
    }

}
