package br.com.pedroXSQueiroz.todoManager.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.pedroXSQueiroz.todoManager.beans.Todo;



@Repository("todoRepository")
public class TodoDao {

	private SessionFactory sessionFactory;
	
	public TodoDao(@Autowired SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<Todo> list() {
		Session currentSession = this.sessionFactory.getCurrentSession();
		
		Query query = currentSession.createQuery("from Todo");
		
		List<Todo> resultList = (List<Todo>) query.list();
		
		return resultList;
	}

	public Todo insert(Todo bean) {
		
		Session currentSession = this.sessionFactory.getCurrentSession();
		
		currentSession.save(bean);
		
		return bean;
	}

	public void update(Todo bean) {
		
		Session currentSession = this.sessionFactory.getCurrentSession();
		
		currentSession.update(bean);
	}

	public Todo read(int id) {
		
		Session currentSession = this.sessionFactory.getCurrentSession();
		
		Query query = currentSession.createQuery("from Todo td where td.id = :id");
		query.setInteger("id", id);
		
		Todo todo = (Todo) query.list().get(0);
		
		return todo;
	}

	public void delete(Todo bean) {

		Session currentSession = this.sessionFactory.getCurrentSession();
		
		currentSession.delete(bean);
	}
	
}
