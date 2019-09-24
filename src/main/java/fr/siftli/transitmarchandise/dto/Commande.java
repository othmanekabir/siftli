package fr.siftli.transitmarchandise.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Component
public class Commande implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ordername;
    @ElementCollection(targetClass=String.class)
    private List<String> productlist;
    private Date orderdate;
    private String status;
    @ManyToOne
    private Utilisateur user;
    private String adressedelivraison;
    private Long poid;
    private boolean estgratuit;
    private Taille taille;
    private String codereduction;

   
}
