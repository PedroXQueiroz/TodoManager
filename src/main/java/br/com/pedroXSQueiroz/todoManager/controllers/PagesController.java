package br.com.pedroXSQueiroz.todoManager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class PagesController {
	
	@RequestMapping("/home")
	public ModelAndView getHomeView() {
		return new ModelAndView("todoList");
	}
	
	
}
