package ru.officeWorker.dao;

import org.springframework.stereotype.Component;
import ru.officeWorker.models.Manager;

import java.util.ArrayList;
import java.util.List;
@Component
public class ManagerDao {
    private static int managerID;
    List<Manager> listOfManagers;
    {
        listOfManagers = new ArrayList<>();
        listOfManagers.add(new Manager(++managerID,"Eduard", "White",30,2.2));
        listOfManagers.add(new Manager(++managerID,"Nikola", "Black",32,3.2));
        listOfManagers.add(new Manager(++managerID,"Denis","Red",34,5.4));
        }
            public  List<Manager> managerIndex(){

        return listOfManagers;
    }
    public Manager managerShow(int id){
        return listOfManagers.stream().filter(manager->manager.getId()==id).findAny().orElse(null);
    }
    
}
