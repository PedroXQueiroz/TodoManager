package br.com.pedroXSQueiroz.todoManager.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.pedroXSQueiroz.todoManager.beans.Todo;
import br.com.pedroXSQueiroz.todoManager.services.TodoService;

@Controller()
@RequestMapping("/todo")
public class TodoController {
	
	private final TodoService service;
	
	public TodoController(@Autowired TodoService service) {
		
		this.service = service;
		
	}
	
	@RequestMapping(value = "/", method =  RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Todo> getTodos()
	{
		return this.service.readTodos();		
	}
	
	@RequestMapping(value = "/{id}", method =  RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Todo getTodo(@PathVariable("id") int id)
	{
		return this.service.readTodo(id);		
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public Todo create(@RequestBody Todo bean) 
	{
		int id = this.service.insertTodo(bean);
		
		bean.setId(id);
		
		return bean;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, produces = "application/json")
	@ResponseBody
	public Todo update(@RequestBody Todo bean){
		
		this.service.updateTodo(bean);
		
		return bean;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public void delete(@PathVariable("id") int id) {
		
		this.service.delete(id);
		
	}
	
	@RequestMapping(value = "/{id}/done/{done}", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public Todo setDoneState(@PathVariable("id") int id, @PathVariable("done") boolean done) {
		return this.service.setTodoDoneState(id, done);
	}
	
}
