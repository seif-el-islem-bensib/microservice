package com.projet5sae.gestiontransactioncontrat.entities;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    @GeneratedValue
    private  int id;
    private float montant;
    private Date dateTransaction;
    private String StatutTransaction;
    private String TypeTransaction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public Date getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(Date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public String getStatutTransaction() {
        return StatutTransaction;
    }

    public void setStatutTransaction(String statutTransaction) {
        StatutTransaction = statutTransaction;
    }

    public String getTypeTransaction() {
        return TypeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        TypeTransaction = typeTransaction;
    }

    public Transaction() {
    }

    public Transaction(int id, float montant, Date dateTransaction, String statutTransaction, String typeTransaction) {
        this.id = id;
        this.montant = montant;
        this.dateTransaction = dateTransaction;
        StatutTransaction = statutTransaction;
        TypeTransaction = typeTransaction;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", montant=" + montant +
                ", dateTransaction=" + dateTransaction +
                ", StatutTransaction='" + StatutTransaction + '\'' +
                ", TypeTransaction='" + TypeTransaction + '\'' +
                '}';
    }
}
