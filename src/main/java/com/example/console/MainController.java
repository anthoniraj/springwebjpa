package com.example.console;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("getEmployeeData")
    public String getEmployeeData(Model model) {
        List<Employee> employeeData = employeeRepository.findAll();
        model.addAttribute("employeeData", employeeData);
        return "EmployeeInfo";
    }
}
