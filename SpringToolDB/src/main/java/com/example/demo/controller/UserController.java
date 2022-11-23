package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.Agentdao;
import com.example.demo.model.AgentModel;

@Controller
public class UserController {
	@Autowired
	Agentdao agentdao;
	
	@RequestMapping("index")
	public String userindex() {
		
		return "index.jsp";
	}
	
	@RequestMapping("addUser")
	public String userAdd(AgentModel agent) {
		agentdao.save(agent);
		return "index.jsp";
	}
}
