package tn.ipsas.coremodels.dto;

import tn.ipsas.coremodels.models.client.Client;
import tn.ipsas.coremodels.models.facture.Facture;
import tn.ipsas.coremodels.models.produit.Product;

import java.util.List;
import java.util.Map;

public class ClientDto {
    public static class ProductPrefere {
        private final Product product;
        private final int quantity;

        public ProductPrefere(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public Product getProduct() {
            return product;
        }

        public int getQuantity() {
            return quantity;
        }
    }
    private double chiffreAffaire;
    private Map<Integer, Double> chiffreAffaireParAn;

    private double montantNonPaye;

    private List<Facture> factureRegle;
    private List<Facture> factureNonRegle;
    private List<ProductPrefere> produitSollicite;

    private Client client;

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public Map<Integer, Double> getChiffreAffaireParAn() {
        return chiffreAffaireParAn;
    }

    public void setChiffreAffaireParAn(Map<Integer, Double> chiffreAffaireParAn) {
        this.chiffreAffaireParAn = chiffreAffaireParAn;
    }

    public double getMontantNonPaye() {
        return montantNonPaye;
    }

    public void setMontantNonPaye(double montantNonPaye) {
        this.montantNonPaye = montantNonPaye;
    }

    public List<Facture> getFactureRegle() {
        return factureRegle;
    }

    public void setFactureRegle(List<Facture> factureRegle) {
        this.factureRegle = factureRegle;
    }

    public List<Facture> getFactureNonRegle() {
        return factureNonRegle;
    }

    public void setFactureNonRegle(List<Facture> factureNonRegle) {
        this.factureNonRegle = factureNonRegle;
    }

    public List<ProductPrefere> getProduitSollicite() {
        return produitSollicite;
    }

    public void setProduitSollicite(List<ProductPrefere> produitSollicite) {
        this.produitSollicite = produitSollicite;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
