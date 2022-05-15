package tn.esprit.TRAVELGO.entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class email {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idNe ;
    private String name ;
    private String email;
    private String message;
    private long idCompany;
}
