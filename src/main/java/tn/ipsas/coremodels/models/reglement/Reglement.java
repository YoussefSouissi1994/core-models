package tn.ipsas.coremodels.models.reglement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import tn.ipsas.coremodels.models.client.Client;

import java.util.Date;
import java.util.List;

public class Reglement {
    @Id
    private String id;
    private Double amount;
    private Date date;
    private List<ReglementItem> items;
    @DBRef
    private Client client;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<ReglementItem> getItems() {
        return items;
    }

    public void setItems(List<ReglementItem> items) {
        this.items = items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
