package com.example.Assignment.TaskController;

import com.example.Assignment.Model.Task;
import com.example.Assignment.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class Taskcontroller {
    @Autowired
    TaskService taskservice;
    @GetMapping("/list")
    public String listEmployees(Model model)
    {
        List<Task> theEmployees = taskservice.findAll();
        model.addAttribute("employees", theEmployees);
        return "list-employees";
    }
    @GetMapping("/show")
    public String showFormForAdd(Model model)
    {
        Task e = new Task();
        model.addAttribute("employee",e);
        return "employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee")Task theEmployee)
    {
        taskservice.save(theEmployee);
        return "redirect:/emp/list";
    }
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId")int theId, Model model)
    {
        Task employee1= taskservice.findById(theId);
        model.addAttribute("employee",employee1);
        return "employee-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId")int theId)
    {
        taskservice.deleteById(theId);
        return "redirect:/emp/list";
    }
}

