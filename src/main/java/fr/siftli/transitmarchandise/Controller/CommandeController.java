package fr.siftli.transitmarchandise.Controller;

import fr.siftli.transitmarchandise.dto.Commande;
import fr.siftli.transitmarchandise.model.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/commandes")
public class CommandeController {

    @Autowired
    CommandeRepository commande;


    @GetMapping(value ="/all")
    public List<Commande> listeCommande(){
        return commande.findAll();
    }

    @GetMapping(value ="/commande/id/{id}")
    public Optional<Commande> commandeParId(@PathVariable("id") Long id){
        return commande.findById(id);
    }

    @GetMapping(value ="/commande/ordername/{orderName}")
    public Optional<Commande> commandeParOrderName(@PathVariable("orderName") String orderName){
        return commande.findByOrdername(orderName);
    }

    @GetMapping(value ="/commande/date/{date}")
    public Optional<Commande> commandeParOrderDate(@PathVariable("date") String date)throws Exception{
        Date d = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        return commande.findByOrderdate(d);
    }

    @GetMapping(value ="/commande/status/{status}")
    public Optional<Commande> commandeParstatus(@PathVariable("status") String status){
        return commande.findByStatus(status);
    }

    @GetMapping(value ="/commande/estgratuit/{estgratuit}")
    public Optional<Commande> commandeParId(@PathVariable("estgratuit") Boolean estgratuit){
        return commande.findByEstgratuit(estgratuit);
    }

    @GetMapping(value ="/commande/codereduction/{codeReduction}")
    public Optional<Commande> commandeParCodeReduction(@PathVariable("codeReduction") String codeReduction){
        return commande.findByCodereduction(codeReduction);
    }






}
