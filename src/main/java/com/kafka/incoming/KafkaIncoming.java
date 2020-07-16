package com.kafka.incoming;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class KafkaIncoming {

    @Incoming("prices")
    public void lerPedido(Object obj){
        System.out.println("object"+obj.toString());
    }
}
