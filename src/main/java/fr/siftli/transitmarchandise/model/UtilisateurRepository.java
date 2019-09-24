package fr.siftli.transitmarchandise.model;

import fr.siftli.transitmarchandise.dto.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    Optional<Utilisateur> findByUsername(String username);

    List<Optional<Utilisateur>>  findByRole(String role);


}
