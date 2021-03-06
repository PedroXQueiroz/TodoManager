package br.com.pedroXSQueiroz.todoManager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class PagesController {
	
	@RequestMapping("/home")
	public ModelAndView getHomeView() {
		return new ModelAndView("todoList");
	}
	
	@RequestMapping("/todo/new")
	public ModelAndView getTodoForm() {
		return new ModelAndView("todoForm");
	}
	
	@RequestMapping("/todo/edit/{id}")
	public ModelAndView getTodoForm(@PathVariable("id") int id) {
		
		return new ModelAndView("todoForm");
	}
	
}
