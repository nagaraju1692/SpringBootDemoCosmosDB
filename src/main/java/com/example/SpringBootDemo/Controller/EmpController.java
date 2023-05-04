package com.example.SpringBootDemo.Controller;

import com.example.SpringBootDemo.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @PostMapping("/saveEmpDetails")
    public String SaveEmpDetails(){

        empService.saveEmpDetails();

        return "Data Saved Successfully.!!!";

    }
}
