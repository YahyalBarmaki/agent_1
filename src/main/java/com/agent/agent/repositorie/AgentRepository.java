package com.agent.agent.repositorie;

import com.agent.agent.entities.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AgentRepository extends JpaRepository<Agent,Long> {
    public List<Agent> findByNom(String nom);
}
