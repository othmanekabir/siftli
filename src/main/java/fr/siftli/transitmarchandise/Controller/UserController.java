package fr.siftli.transitmarchandise.Controller;

import fr.siftli.transitmarchandise.dto.Utilisateur;
import fr.siftli.transitmarchandise.model.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UtilisateurRepository utilisateur;


    @GetMapping(value ="/all")
    public List<Utilisateur> listeUtilisateur(){
        return utilisateur.findAll();
    }


    @GetMapping(value ="/user/id/{id}")
    public Optional<Utilisateur> utilisateurParId(@PathVariable("id") Long id){
        return utilisateur.findById(id);
    }

    @GetMapping(value ="/user/username/{username}")
    public Optional<Utilisateur> utilisateurParNom(@PathVariable("username") String userName) {
        return utilisateur.findByUsername(userName);
    }

    @GetMapping(value ="/user/role/{role}")
    public List<Optional<Utilisateur>> utilisateurParRole(@PathVariable("role") String role) {
        return utilisateur.findByRole(role);
    }

    @PostMapping(value="/add")
    public ResponseEntity<Object> creerUtilisateur(Utilisateur util){
        Utilisateur u = utilisateur.save(util);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(u.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

}
