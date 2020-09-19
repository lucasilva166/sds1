package com.devsuperior.dspesguisa.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dspesguisa.entities.Record;
import com.devsuperior.dspesguisa.entities.enums.Platform;

public class Recorddto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private Instant moment;
	private String name;
	private Integer age;
	private String gameTitle;
	private Platform gamePlatform;
	private String genreName;
	
	public Recorddto() {
		
	}
 
	public Recorddto(Record Entity) {
		id = Entity.getId();
		moment = Entity.getMoment();
	    age = Entity.getAge();
		name = Entity.getName();
		gameTitle = Entity.getGame().getTitle();
		gamePlatform = Entity.getGame().getPlatform();
		genreName = Entity.getGame().getGenre().getName();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public Platform getGamePlatform() {
		return gamePlatform;
	}

	public void setGamePlatform(Platform gamePlatform) {
		this.gamePlatform = gamePlatform;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	
}
