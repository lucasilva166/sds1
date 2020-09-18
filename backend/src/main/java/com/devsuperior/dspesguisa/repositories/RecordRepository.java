package com.devsuperior.dspesguisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesguisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record,Long> {

}
