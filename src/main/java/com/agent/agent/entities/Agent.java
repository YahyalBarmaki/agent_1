package com.agent.agent.entities;

import lombok.*;


import javax.persistence.*;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity
public class Agent {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String prenom;
    private String nom;
    private String email;
    private String adresse;
    private String tel;

}
