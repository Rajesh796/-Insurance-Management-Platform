package com.example.demo.Claim;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimService {
@Autowired
private ClaimRepository repo;
 
public List<ClaimModel> getallclaims(){
	List<ClaimModel> claims=new ArrayList<>();
	repo.findAll().forEach(claims::add);
	return claims;
	
}
public Optional<ClaimModel> getclaimbyid(String id ) {
	return repo.findById(id);

}
public void Addclaim(ClaimModel claim) {
	repo.save(claim);
}
public void updateclaimbyid(ClaimModel claim,String id) {
	repo.save(claim);
	
}
public void deleteclaimbyid(String id ) {
	repo.deleteById(id);
}
}
