package com.devsuperior.dspesguisa.dto;

import java.io.Serializable;

public class RecordInsertdto  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long gameid;
	private String name;
	private Integer age;
	
	public RecordInsertdto() {
		
	}

	public long getGameId() {
		return gameid;
	}

	public void setGameId(long gameid) {
		this.gameid = gameid;
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
	
}
	
	