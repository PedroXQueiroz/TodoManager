package br.com.pedroXSQueiroz.todoManager.beans;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
