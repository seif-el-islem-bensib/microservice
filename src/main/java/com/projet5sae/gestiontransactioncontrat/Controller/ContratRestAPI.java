package com.projet5sae.gestiontransactioncontrat.Controller;

import com.projet5sae.gestiontransactioncontrat.Services.ContratService;
import com.projet5sae.gestiontransactioncontrat.entities.Contrat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContratRestAPI
{
    private  String title="Hello, i'm the contrat micro service";
    @RequestMapping("/hello2")
    public String sayHello()
    {
        System.out.println(title);
        return title;
    }
    @Autowired
    private ContratService contratService;
    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Contrat> createCandidat(@RequestBody Contrat candidat) {  return new ResponseEntity<>(contratService.addCandidat(candidat), HttpStatus.OK); }
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Contrat> updateCandidat(@PathVariable(value = "id") int id,  @RequestBody Contrat candidat){  return new ResponseEntity<>(contratService.updateCandidat(id, candidat),  HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteCandidat(@PathVariable(value = "id") int id){  return new ResponseEntity<>(contratService.deleteCandidat(id), HttpStatus.OK); }


}
