package tn.ipsas.coremodels.kafka.listeners;

import tn.ipsas.coremodels.events.ClientAddedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import tn.ipsas.coremodels.events.FactureAddedEvent;
import tn.ipsas.coremodels.events.ProductAddedEvent;
import tn.ipsas.coremodels.events.ProductRemovedEvent;
import tn.ipsas.coremodels.models.client.Client;
import tn.ipsas.coremodels.models.facture.Facture;
import tn.ipsas.coremodels.models.produit.Product;

@Configuration
public class KafkaListeners {

    private final ApplicationEventPublisher publisher;

    public KafkaListeners(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

   @KafkaListener(topics = "product_add")
    public void listenAddProduct(Product product) {
        this.publisher.publishEvent(new ProductAddedEvent(product));
    }
    @KafkaListener(topics = "facture_add")
    public void listenAddFacture(Facture facture) {
        this.publisher.publishEvent(new FactureAddedEvent(facture));
    }
    @KafkaListener(topics = "product_remove")
    public void listenRemoveProduct(Product product) {
        this.publisher.publishEvent(new ProductRemovedEvent(product));
    }
}
