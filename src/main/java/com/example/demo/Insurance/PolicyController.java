package com.example.demo.Insurance;

import java.util.EmptyStackException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyController {
@Autowired
private PolicyService service;

@RequestMapping("/GET/api/policies:")

	public List<InsuranceModel> getpolicies() throws Exception{
	return service.getallpolicies();
	}
@RequestMapping("/GET /api/policies/{id}")
public Optional<InsuranceModel> gtepolicybyid(@PathVariable String id) {
	if(id==null) {
		throw new NoSuchElementException();}
	else {
		return service.getpolicybyid(id);
	}
}
	

@RequestMapping(method=RequestMethod.POST,value="/POST /api/policies")
	public void addpolicy(@RequestBody InsuranceModel policy) {
	if(ObjectUtils.isEmpty(policy)) {
		throw new EmptyStackException();
		
	}else {
		service.AddPolicy(policy);
	}
	}

@RequestMapping(method=RequestMethod.PUT,value="/PUT /api/policies/{id}")
public void updatepolicy(@RequestBody InsuranceModel policy,@PathVariable String id) {
	service.UpdatePolicy(id, policy);
}
@RequestMapping(method=RequestMethod.DELETE,value="/DELETE /api/policies/{id}")
	public void deletepolicy(@PathVariable String id) {
	service.deletepolicy(id);
}

}
