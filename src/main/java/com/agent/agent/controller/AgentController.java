package com.agent.agent.controller;

import com.agent.agent.entities.Agent;
import com.agent.agent.repositorie.AgentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
public class AgentController {
    private AgentRepository agentRepository;

    public AgentController(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    @PostMapping("/addAgent")
    public Agent addAgent(@RequestBody  Agent agent){

        return agentRepository.save(agent);
    }
    @GetMapping("/agents")
    public List<Agent> listAgent(){
        return agentRepository.findAll();
    }
    @GetMapping("/agent/{id}")
    public Agent getAgent(@PathVariable Long id){
        return agentRepository.findById(id).get();
    }
    @DeleteMapping("/deleteAgent/{id}")
    public void deleteAgent(@PathVariable Long id){
        agentRepository.deleteById(id);
    }

    @PostMapping("/updateAgent/{id}")
    public ResponseEntity<Agent> updateEmployer(@RequestBody Agent agent,@PathVariable("id")long id){
        Optional<Agent> agentOptional = agentRepository.findById(id);
        if (agentOptional.isPresent()){
            Agent agent1 = agentOptional.get();
            agent1.setPrenom(agent.getPrenom());
            agent1.setNom(agent.getNom());
            agent1.setEmail(agent.getEmail());
            agent1.setAdresse(agent.getAdresse());
            agent1.setTel(agent.getTel());
            return new ResponseEntity<>(agentRepository.save(agent1), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    };
}
