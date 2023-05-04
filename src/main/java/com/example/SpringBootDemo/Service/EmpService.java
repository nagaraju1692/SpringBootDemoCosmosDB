package com.example.SpringBootDemo.Service;


import com.example.SpringBootDemo.entity.EmpDetails;
import com.example.SpringBootDemo.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    private EmpRepository empRepository;
    public void saveEmpDetails(){

        EmpDetails empDetails = new EmpDetails();
        empDetails.setEmpId("101");
        empDetails.setEmpName("nagaraju");
        empDetails.setAge(34);
        empDetails.setEmail("nagarajuy.java@gmail.com");
        empRepository.save(empDetails);
    }
}
