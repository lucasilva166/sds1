package com.devsuperior.dspesguisa.dto;

import java.io.Serializable;

import com.devsuperior.dspesguisa.entities.Game;
import com.devsuperior.dspesguisa.entities.enums.Platform;

public class Gamedto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private long id;
	private String title;
	private Platform platform;
	
	public Gamedto() {
		
	}
	
	public Gamedto(Game entity) {
		
		id = entity.getId();
		title = entity.getTitle();
		platform = entity.getPlatform();
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
	
}
