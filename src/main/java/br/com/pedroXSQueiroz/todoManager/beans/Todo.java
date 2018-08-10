package br.com.pedroXSQueiroz.todoManager.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity()
@Table(name = "todo")
public class Todo extends AbstractBean{
	
	@Column(name = "todo_name")
	public String name;
	
	@Column(name = "todo_description")
	public String description; 
	
	@Column(name = "deadline")
	public Date deadline;
	
	@Column(name = "done")
	public boolean done;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
}
