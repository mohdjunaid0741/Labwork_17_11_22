package com.assign;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.assign.agent.Agent;
import com.assign.dao.AgentRepository;

@SpringBootApplication
public class LabworkApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(LabworkApplication.class, args);
		
		AgentRepository ar = context.getBean(AgentRepository.class);
		
		// Create Agent
		
//		Agent a = new Agent();
//		a.setName("Agent X");
//		a.setArea("Noida");
//		a.setAgent_commision("10%");
//		
//		Agent a1 = ar.save(a);
//		
//		System.out.println(a1);
		
		//update the agent by id
		
//		Optional<Agent> optional = ar.findById(1);
//		
//		Agent a2 = optional.get();
//		a2.setName("John");
//		a2.setArea("Gurgaon");
//		a2.setAgent_commision("5%");
//		
//		Agent result1 = ar.save(a2);
//		
//		System.out.println(result1);
		
//		// adding another Agents
		
//		Agent a4 = new Agent();
//		a4.setName("Paul");
//		a4.setArea("Delhi");
//		a4.setAgent_commision("2%");
//		
//		Agent a3 = new Agent();
//		a3.setName("Jacob");
//		a3.setArea("Ghaziabad");
//		a3.setAgent_commision("1%");
//		
//		List<Agent> agent = List.of(a4,a3);
//		
//		Iterable<Agent> result = ar.saveAll(agent);
//		result.forEach(Agent-> {
//			System.out.println(Agent);
//		});
		
		ar.deleteById(3);
		System.out.println("Deleted id");
		
	}

}
