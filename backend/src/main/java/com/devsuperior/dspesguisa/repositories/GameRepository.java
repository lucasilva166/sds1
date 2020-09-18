package com.devsuperior.dspesguisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesguisa.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

}
