package tn.ipsas.coremodels.models.reglement;

import org.springframework.data.mongodb.core.mapping.DBRef;
import tn.ipsas.coremodels.models.facture.Facture;

public class ReglementItem {
    @DBRef
    private Facture facture;
    private double amount;

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
