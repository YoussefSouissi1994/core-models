package tn.ipsas.coremodels.events;

import org.springframework.context.ApplicationEvent;
import tn.ipsas.coremodels.models.produit.Product;

import java.time.Clock;

public class ProductAddedEvent extends ApplicationEvent {
    public ProductAddedEvent(Product source) {
        super(source);
    }

    public ProductAddedEvent(Product source, Clock clock) {
        super(source, clock);
    }
}
