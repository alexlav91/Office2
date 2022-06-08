package ru.officeWorker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.officeWorker.dao.DAO;

@Controller
@RequestMapping("/managers")
public class MangerController {
    private final DAO managerDao;
    @Autowired
    public MangerController(DAO managerDao) {
        this.managerDao = managerDao;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("managers", managerDao.managerIndex());
        return "managers/managerIndex";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("manager", managerDao.managerShow(id));
        model.addAttribute("subordinates", managerDao.managerShow(id).getSubordinates());
        return "managers/managerShow";
    }

}
