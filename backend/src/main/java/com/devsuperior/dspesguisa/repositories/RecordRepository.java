package com.devsuperior.dspesguisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesguisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record,Long> {

}
