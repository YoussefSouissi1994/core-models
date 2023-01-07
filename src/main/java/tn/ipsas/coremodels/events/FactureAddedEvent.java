package tn.ipsas.coremodels.events;

import org.springframework.context.ApplicationEvent;
import tn.ipsas.coremodels.models.facture.Facture;

import java.time.Clock;

public class FactureAddedEvent extends ApplicationEvent {
    public FactureAddedEvent(Facture source) {
        super(source);
    }

    public FactureAddedEvent(Facture source, Clock clock) {
        super(source, clock);
    }
}
