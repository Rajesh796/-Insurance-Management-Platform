package com.example.demo.Client;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository

public  interface ClientRepository extends CrudRepository<ClientModel, String>{

}
