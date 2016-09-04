package cxp.ingest.dao;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

import java.io.Serializable;

/**
 * Created by markmo on 12/07/2015.
 */
public class TestMessageDao implements MessageDao {

    @Override
    @SuppressWarnings("unchecked")
    public <T extends Serializable> Message<T> getNextMessage() {
        return (Message<T>)MessageBuilder.withPayload("I'm a teapot").build();
    }
}
