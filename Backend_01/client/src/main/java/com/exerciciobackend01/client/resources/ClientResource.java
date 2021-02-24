package com.exerciciobackend01.client.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exerciciobackend01.client.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client((long) 1, "Maria", "12345678997", 94949845d, Instant.now(), 3));
		list.add(new Client((long) 2, "João", "98765432132", 852368d, Instant.now(), 0));
		return ResponseEntity.ok().body(list);
		
	}
	
	
}
 