package cxp.ingest.dao;

import org.springframework.messaging.Message;

import java.io.Serializable;

/**
 * Created by markmo on 12/07/2015.
 */
public interface MessageDao {

    /**
     * Gets the next message to process.
     *
     * @return next message to process.
     */
    <T extends Serializable> Message<T> getNextMessage();
}
