package cxp.ingest.service;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandlingException;

import java.io.Serializable;

/**
 * Created by markmo on 12/07/2015.
 */
public interface PersistentMessageAdapter {

    /**
     * Removes and returns the next message. Messages are returned in the order
     * they are added.
     *
     * @return the next message to process.
     */
    <T extends Serializable> Message<T> removeNext();

    /**
     * Handles a message that failed during processing. Different behaviors could
     * occur here such as incrementing a counter in the message for a number of
     * retries or sending the message to a different destination.
     *
     * @param message
     *          message to be handled.
     */
    void handleFailedMessage(Message<MessageHandlingException> message);
}
