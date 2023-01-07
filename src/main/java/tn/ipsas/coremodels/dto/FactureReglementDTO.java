package tn.ipsas.coremodels.dto;

import tn.ipsas.coremodels.models.facture.Facture;
import tn.ipsas.coremodels.models.reglement.ReglementItem;

import java.util.List;
import java.util.Objects;

public class FactureReglementDTO {
    private Facture facture;
    private List<ReglementItem> items;

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public List<ReglementItem> getItems() {
        return items;
    }

    public void setItems(List<ReglementItem> items) {
        this.items = items;
    }

    public double getNeedToPay() {
        return facture.getTotal() - items
                .stream()
                .mapToDouble(ReglementItem::getAmount)
                .sum();
    }
}
