package com.example.demo.Insurance;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PolicyService {
	@Autowired
	private PolicyRepository repo;
	
public List<InsuranceModel> getallpolicies(){
	List<InsuranceModel> policies=new ArrayList<>();
	repo.findAll().forEach(policies::add);
	return policies;
	
}
public Optional<InsuranceModel> getpolicybyid(String id) {
	return repo.findById(id);
}

public void AddPolicy(InsuranceModel client) {
	repo.save(client);
}
public void UpdatePolicy(String id,InsuranceModel policy) {
	repo.save(policy);
	
}
public void deletepolicy(String id ) {
	repo.deleteById(id);
}
}
