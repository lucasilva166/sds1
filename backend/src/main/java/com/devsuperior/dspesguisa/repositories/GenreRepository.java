package com.devsuperior.dspesguisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesguisa.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre,Long> {

}
