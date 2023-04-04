package com.example.demo.Claim;

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
public class ClaimController {

	@Autowired 
	private ClaimService service;
	
	@RequestMapping("GET /api/claims")
	public List<ClaimModel> getallclaims(){
		return service.getallclaims();
		
	}
	@RequestMapping(method=RequestMethod.GET,value="GET /api/claims/{id}")
	public Optional<ClaimModel> getclaimbyid(@PathVariable String id) {
		if(id==null) {
			throw new NoSuchElementException();}
		else {
			return service.getclaimbyid(id);
		}
	}
	@RequestMapping(method=RequestMethod.POST,value="POST /api/claims")
	public void addclaim(@RequestBody ClaimModel claim) {
		if(ObjectUtils.isEmpty(claim)) {
			throw new EmptyStackException();
			
		}else {
			service.Addclaim(claim);
		}
	}
	@RequestMapping(method=RequestMethod.PUT,value="PUT /api/claims/{id}")
	public void Updateclaimbyid(@RequestBody ClaimModel claim,@PathVariable String id) {
		service.updateclaimbyid(claim, id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="DELETE /api/claims/{id}")
	public void deleteclaimbyid(@PathVariable String id ) {
		service.deleteclaimbyid(id);
	}
}
