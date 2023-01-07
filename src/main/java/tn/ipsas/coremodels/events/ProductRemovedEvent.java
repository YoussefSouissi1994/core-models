package tn.ipsas.coremodels.events;

import org.springframework.context.ApplicationEvent;
import tn.ipsas.coremodels.models.produit.Product;

import java.time.Clock;

public class ProductRemovedEvent extends ApplicationEvent {
    public ProductRemovedEvent(Product source) {
        super(source);
    }

    public ProductRemovedEvent(Product source, Clock clock) {
        super(source, clock);
    }
}
