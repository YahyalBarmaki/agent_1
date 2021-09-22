package com.agent.agent;

import com.agent.agent.entities.Agent;
import com.agent.agent.repositorie.AgentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AgentApplication  {

    private AgentRepository agentRepository;

    public AgentApplication(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(AgentApplication.class, args);
    }

   /* @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
        corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
                "Accept", "Authorization", "Origin, Accept", "X-requested-With",
                "Access-Control-Request-Method", "Access-Control-Request-Method-Headers"));
        corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
                "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }*/
   /* @Override
    public void run(String... args) throws Exception {
        agentRepository.save(new Agent(null,"Yahya","LY","Yeumbeul","77 570 16 31"));
        agentRepository.save(new Agent(null,"Youssou","DIOP","Fass Mbao","77 450 12 13"));
        agentRepository.save(new Agent(null,"Mame","GAYE","PA","76 252 20 13"));
        agentRepository.save(new Agent(null,"Modou","FALL","thies","77 012 20 14"));
        agentRepository.save(new Agent(null,"Mor","SECK","ST LOUIS","77 850 32 25"));
        agentRepository.save(new Agent(null,"Babacar","LO","GUÉWAYE","77 689 55 19"));

        System.out.println("-------------------------------------------------");
        agentRepository.findAll().forEach(p->{
            System.out.println(p.toString());
        });
        System.out.println("-------------------------------------------------");
        Agent agent = agentRepository.findById(1L).get();
        System.out.println(agent.getNom());
        System.out.println("********************************************");
        //agentRepository.deleteById(2L);
        System.out.println("********************************************");
        agentRepository.findAll().forEach(p->{
            System.out.println(p.toString());
        });
        System.out.println("********************************************");
        List<Agent> agents = agentRepository.findByNom("FALL");
        agents.forEach(p->{
            System.out.println(p.toString());
        });

    }*/
}
