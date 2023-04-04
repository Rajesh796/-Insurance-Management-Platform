package com.example.demo.Client;

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
import org.springframework.web.client.HttpClientErrorException.NotAcceptable;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
public class ClientController {
	@Autowired
	private ClientService service;
	
	@RequestMapping("/GET /api/clients")
	public List<ClientModel> getallclients(){
		return service.getallclients();
		
	}
	@RequestMapping("/GET /api/clients/{id}")
	public Optional<ClientModel> getclientbyid(@PathVariable String id ) {
		if(id==null) {
			throw new NoSuchElementException();}
		else {
			return service.getclientbyid(id);
		}
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/POST /api/clients")
	public void AddClient(@RequestBody ClientModel client) {
		if(ObjectUtils.isEmpty(client)) {
			throw new EmptyStackException();
			
		}else {
			service.Addclient(client);
		}
	}
	@RequestMapping(method=RequestMethod.PUT,value="/PUT /api/clients/{id}")
	public void updateclient(@RequestBody ClientModel client,@PathVariable String id) {
	
		service.updateclient(client, id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/DELETE /api/clients/{id}")
	public void deleteclientbyid(@PathVariable String id) {
		service.deleteclient(id);
	}

}
