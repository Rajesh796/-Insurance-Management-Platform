package com.example.demo.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
@Autowired	
private ClientRepository repo;
	
	public List<ClientModel> getallclients(){
		List<ClientModel> client=new ArrayList<>();
		repo.findAll().forEach(client::add);
		return client;
		
	}
	public Optional<ClientModel> getclientbyid(String id) {
		return repo.findById(id);
	}
	public void Addclient(ClientModel client) {
		repo.save(client);
	}
	public void updateclient(ClientModel client,String id) {
		repo.save(client);
	}
	public void deleteclient(String id) {
		repo.deleteById(id);
	}
}
