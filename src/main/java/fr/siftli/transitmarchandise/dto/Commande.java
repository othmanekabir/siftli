package fr.siftli.transitmarchandise.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Component
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String orderName;
    @ElementCollection(targetClass=String.class)
    private List<String> productList;
    private String orderDate;
    private String status;
    @ManyToOne
    private Utilisateur user;

   
}
