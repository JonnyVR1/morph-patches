package org.fourthline.cling.transport.spi;

import java.util.logging.Logger;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.protocol.ProtocolCreationException;
import org.fourthline.cling.protocol.ProtocolFactory;
import org.fourthline.cling.protocol.ReceivingSync;
import org.seamless.util.Exceptions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class UpnpStream implements Runnable {
    private static Logger log = Logger.getLogger(UpnpStream.class.getName());
    protected final ProtocolFactory protocolFactory;
    protected ReceivingSync syncProtocol;

    public UpnpStream(ProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public ProtocolFactory getProtocolFactory() {
        return this.protocolFactory;
    }

    public StreamResponseMessage process(StreamRequestMessage streamRequestMessage) {
        log.fine("Processing stream request message: " + streamRequestMessage);
        try {
            this.syncProtocol = getProtocolFactory().createReceivingSync(streamRequestMessage);
            log.fine("Running protocol for synchronous message processing: " + this.syncProtocol);
            this.syncProtocol.run();
            StreamResponseMessage outputMessage = this.syncProtocol.getOutputMessage();
            if (outputMessage == null) {
                log.finer("Protocol did not return any response message");
                return null;
            }
            log.finer("Protocol returned response: " + outputMessage);
            return outputMessage;
        } catch (ProtocolCreationException e) {
            log.warning("Processing stream request failed - " + Exceptions.unwrap(e).toString());
            return new StreamResponseMessage(UpnpResponse.Status.NOT_IMPLEMENTED);
        }
    }

    public void responseException(Throwable th) {
        ReceivingSync receivingSync = this.syncProtocol;
        if (receivingSync != null) {
            receivingSync.responseException(th);
        }
    }

    public void responseSent(StreamResponseMessage streamResponseMessage) {
        ReceivingSync receivingSync = this.syncProtocol;
        if (receivingSync != null) {
            receivingSync.responseSent(streamResponseMessage);
        }
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
