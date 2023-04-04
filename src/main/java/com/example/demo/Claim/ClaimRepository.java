package com.example.demo.Claim;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClaimRepository extends CrudRepository<ClaimModel, String> {

}
