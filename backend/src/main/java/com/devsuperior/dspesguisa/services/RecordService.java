package com.devsuperior.dspesguisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dspesguisa.dto.RecordInsertdto;
import com.devsuperior.dspesguisa.dto.Recorddto;
import com.devsuperior.dspesguisa.entities.Game;
import com.devsuperior.dspesguisa.entities.Record;
import com.devsuperior.dspesguisa.repositories.GameRepository;
import com.devsuperior.dspesguisa.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public Recorddto insert(RecordInsertdto dto) {
		
		Record Entity = new Record();
		Entity.setName(dto.getName());
		Entity.setAge(dto.getAge());
		Entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		Entity.setGame(game);
		
		Entity = repository.save(Entity);
		return new Recorddto(Entity);
	}
}
