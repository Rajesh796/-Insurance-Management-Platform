package com.example.demo.Insurance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PolicyRepository extends CrudRepository<InsuranceModel, String>{

}
