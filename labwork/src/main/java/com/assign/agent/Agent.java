package com.assign.agent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String area;
    private String agent_commision;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getAgent_commision() {
		return agent_commision;
	}
	public void setAgent_commision(String agent_commision) {
		this.agent_commision = agent_commision;
	}
	public Agent(int id, String name, String area, String agent_commision) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.agent_commision = agent_commision;
	}
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Agent [id=" + id + ", name=" + name + ", area=" + area + ", agent_commision=" + agent_commision + "]";
	}
    
    
}
