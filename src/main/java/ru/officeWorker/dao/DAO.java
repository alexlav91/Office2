package ru.officeWorker.dao;

import org.springframework.stereotype.Component;
import ru.officeWorker.models.Manager;
import ru.officeWorker.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class DAO {
    private static int managerID;
    private static int peopleId;
    List<Manager> listOfManagers;
    List<Person> people;

    {


        people = new ArrayList<>();
        people.add(new Person(++peopleId, "Tom", "Tomson", 20, 1.0, "Eduard"));
        people.add(new Person(++peopleId, "Jane", "Janiton", 23, 1.5, "Eduard"));
        people.add(new Person(++peopleId, "Cat", "Catison", 19, 0.5, "Nikola"));
        people.add(new Person(++peopleId, "Met", "Metison", 25, 3.3, "Nikola"));
        people.add(new Person(++peopleId, "Nika", "Nikova", 18, 0.1, "Denis"));
        people.add(new Person(++peopleId, "Kris", "Kristovich", 30, 5.0, "Denis"));

        listOfManagers = new ArrayList<>();
        listOfManagers.add(new Manager(++managerID, "Eduard", "White", 30, 2.2));
        listOfManagers.add(new Manager(++managerID, "Nikola", "Black", 32, 3.2));
        listOfManagers.add(new Manager(++managerID, "Denis", "Red", 34, 5.4));


        listOfManagers.get(0).getSubordinates().add(people.get(0));
        listOfManagers.get(0).getSubordinates().add(people.get(1));
        listOfManagers.get(1).getSubordinates().add(people.get(2));
        listOfManagers.get(1).getSubordinates().add(people.get(3));
        listOfManagers.get(2).getSubordinates().add(people.get(4));
        listOfManagers.get(2).getSubordinates().add(people.get(5));


    }

    public List<Manager> managerIndex() {

        return listOfManagers;
    }

    public Manager managerShow(int id) {
        return listOfManagers.stream().filter(manager -> manager.getId() == id).findAny().orElse(null);
    }

    public List<Person> index() {

        return people;
    }

    public Person show(int id) {

        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++peopleId);
        if (person.getManager().equals("Eduard")) {
            listOfManagers.get(0).getSubordinates().add(person);
        }
        if (person.getManager().equals("Nikola")) {
            listOfManagers.get(1).getSubordinates().add(person);
        }
        if (person.getManager().equals("Denis")) {
            listOfManagers.get(2).getSubordinates().add(person);
        }
        people.add(person);
    }
    public void update(int id, Person updatedPerson){
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setSurname(updatedPerson.getSurname());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setExperience(updatedPerson.getExperience());


    }
    public void delete(int id){
        people.removeIf(p->p.getId()==id);
    }
}





