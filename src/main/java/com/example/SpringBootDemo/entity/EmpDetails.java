package com.example.SpringBootDemo.entity;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@Container(containerName = "EmployeeDetails")
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class EmpDetails implements Serializable {
    @Id
    @PartitionKey
    private String empId;
    private String empName;
    private String email;
    private int age;
}
