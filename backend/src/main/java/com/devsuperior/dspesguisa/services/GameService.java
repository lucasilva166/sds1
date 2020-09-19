package com.devsuperior.dspesguisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dspesguisa.dto.Gamedto;
import com.devsuperior.dspesguisa.entities.Game;
import com.devsuperior.dspesguisa.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<Gamedto> findAll(){
	
		List<Game> list = repository.findAll();
		return list.stream().map(x -> new Gamedto(x)).collect(Collectors.toList());
	}
}
