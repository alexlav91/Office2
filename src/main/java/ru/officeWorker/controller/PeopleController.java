package ru.officeWorker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.officeWorker.dao.DAO;
import ru.officeWorker.models.Person;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private final DAO peopleDao;

    @Autowired
    public PeopleController(DAO peopleDao) {

        this.peopleDao = peopleDao;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("people", peopleDao.index());
        return "people/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", peopleDao.show(id));
        return "people/show";
    }

    @GetMapping("/new")
    public String newPerson(Model model) {
        model.addAttribute("person", new Person());
        return "people/newPerson";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") Person person) {
        peopleDao.save(person);
        return "redirect:/people";
    }
    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id){
        model.addAttribute("person", peopleDao.show(id));
        return "people/edit";

    }
    @PatchMapping("/{id}")
    public String update(@ModelAttribute("person") Person person, @PathVariable("id")int id){
        peopleDao.update(id, person);
        return "redirect:/people";
    }
    @DeleteMapping("/{id}")
    public  String delete(@PathVariable("id")int id){
        peopleDao.delete(id);
        return "redirect:/people";
    }
}
