package br.com.pedroXSQueiroz.todoManager.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pedroXSQueiroz.todoManager.beans.Todo;
import br.com.pedroXSQueiroz.todoManager.daos.TodoDao;

@Service("todoService")
public class TodoService {
	
	private final TodoDao dao; 
	
	public TodoService(@Autowired TodoDao todoDao) {
		this.dao = todoDao;
	}
	
	@Transactional
	public List<Todo> readTodos(){
		return this.dao.list();
	}

	@Transactional
	public int insertTodo(Todo bean) {
		// TODO Auto-generated method stub
		
		Todo insertedBean = this.dao.insert(bean);
		
		return insertedBean.getId();
	}

	@Transactional
	public void updateTodo(Todo bean) {
		// TODO Auto-generated method stub
		
		this.dao.update(bean); 
		
	}

	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		Todo bean = this.dao.read(id);
		
		this.dao.delete(bean);
		
	}
	
}
