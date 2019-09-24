package fr.siftli.transitmarchandise.model;

import fr.siftli.transitmarchandise.dto.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Optional;

public interface CommandeRepository extends JpaRepository<Commande, Long> {

    Optional<Commande> findByOrdername(String username);
    Optional<Commande> findByOrderdate(Date date);
    Optional<Commande> findByStatus(String username);
    Optional<Commande> findByEstgratuit(Boolean esGratuit);
    Optional<Commande> findByCodereduction(String codeReduction);


    
}
