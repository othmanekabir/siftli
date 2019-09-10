package fr.siftli.transitmarchandise.Controller;

import fr.siftli.transitmarchandise.dto.Utilisateur;
import fr.siftli.transitmarchandise.model.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UtilisateurRepository utilisateur;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Utilisateur> listeUtilisateur(){

        List<Utilisateur> u = utilisateur.findAll();

        u.contains("eee");

        return u;
    }


}
