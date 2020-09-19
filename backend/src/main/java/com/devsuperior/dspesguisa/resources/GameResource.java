package com.devsuperior.dspesguisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dspesguisa.dto.Gamedto;
import com.devsuperior.dspesguisa.services.GameService;

@RestController
@RequestMapping(value = "/game")
public class GameResource {

	@Autowired
	private GameService service;
	
	@GetMapping
	public ResponseEntity<List<Gamedto>> findAll(){
		List<Gamedto> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
}
