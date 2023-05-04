package com.example.SpringBootDemo.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.example.SpringBootDemo.entity.EmpDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends CosmosRepository<EmpDetails,Integer>, CrudRepository<EmpDetails,Integer> {

}
