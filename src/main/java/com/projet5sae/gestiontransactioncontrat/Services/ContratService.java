package com.projet5sae.gestiontransactioncontrat.Services;

import com.projet5sae.gestiontransactioncontrat.entities.Contrat;
import com.projet5sae.gestiontransactioncontrat.repositories.ContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratService {

    @Autowired
    private ContratRepository contratRepository;
    public Contrat addCandidat(Contrat candidate) {
        return contratRepository.save(candidate);
    }
    public Contrat updateCandidat(int id, Contrat newContrat) {
        if (contratRepository.findById(id).isPresent()) {

            Contrat existingContrat = contratRepository.findById(id).get();
            existingContrat.setDuréContrat(newContrat.getDuréContrat());
            existingContrat.setStatutContrat(newContrat.getStatutContrat());
            existingContrat.setTypeContrat(newContrat.getTypeContrat());
            return contratRepository.save(existingContrat);
        } else
            return null;
    }
    public String deleteCandidat(int id) {
        if (contratRepository.findById(id).isPresent()) {
            contratRepository.deleteById(id);
            return "candidat supprimé";
        } else
            return "candidat non supprimé";
    }

}


