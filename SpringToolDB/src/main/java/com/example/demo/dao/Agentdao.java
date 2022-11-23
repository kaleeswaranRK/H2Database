package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.AgentModel;

public interface Agentdao extends CrudRepository<AgentModel, Integer> {

}
