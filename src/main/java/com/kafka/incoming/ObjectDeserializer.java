package com.kafka.incoming;

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ObjectDeserializer extends ObjectMapperDeserializer<Object> {

    public ObjectDeserializer() {
        super(Object.class);
    }

}
