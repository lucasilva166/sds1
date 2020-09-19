package com.devsuperior.dspesguisa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dspesguisa.dto.RecordInsertdto;
import com.devsuperior.dspesguisa.dto.Recorddto;
import com.devsuperior.dspesguisa.services.RecordService;

@RestController
@RequestMapping(value = "/record")
public class RecordResource {

	@Autowired
	private RecordService service;
	
	@PostMapping
	public ResponseEntity<Recorddto> insert(@RequestBody RecordInsertdto dto) {
		
		Recorddto newdto = service.insert(dto);
		return ResponseEntity.ok().body(newdto);
		
	}
}
