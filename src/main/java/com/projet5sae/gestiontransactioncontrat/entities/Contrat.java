package com.projet5sae.gestiontransactioncontrat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Contrat
{
    @Id
    @GeneratedValue
    private  int id;
    private Date dateSignature;
    private String duréContrat;
    private String typeContrat;
    private String statutContrat;

    public Contrat() {
    }

    public Contrat( Date dateSignature, String duréContrat, String typeContrat, String statutContrat) {

        this.dateSignature = dateSignature;
        this.duréContrat = duréContrat;
        this.typeContrat = typeContrat;
        this.statutContrat = statutContrat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateSignature() {
        return dateSignature;
    }

    public void setDateSignature(Date dateSignature) {
        this.dateSignature = dateSignature;
    }

    public String getDuréContrat() {
        return duréContrat;
    }

    public void setDuréContrat(String duréContrat) {
        this.duréContrat = duréContrat;
    }

    public String getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(String typeContrat) {
        this.typeContrat = typeContrat;
    }

    public String getStatutContrat() {
        return statutContrat;
    }

    public void setStatutContrat(String statutContrat) {
        this.statutContrat = statutContrat;
    }

    @Override
    public String toString() {
        return "Contrat{" +
                "id=" + id +
                ", dateSignature=" + dateSignature +
                ", duréContrat='" + duréContrat + '\'' +
                ", typeContrat='" + typeContrat + '\'' +
                ", statutContrat='" + statutContrat + '\'' +
                '}';
    }
}
