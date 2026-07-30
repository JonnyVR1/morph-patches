package org.fourthline.cling.protocol.sync;

import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.gena.RemoteGENASubscription;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.gena.IncomingEventRequestMessage;
import org.fourthline.cling.model.message.gena.OutgoingEventResponseMessage;
import org.fourthline.cling.model.resource.ServiceEventCallbackResource;
import org.fourthline.cling.protocol.ReceivingSync;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ReceivingEvent extends ReceivingSync<StreamRequestMessage, OutgoingEventResponseMessage> {
    private static final Logger log = Logger.getLogger(ReceivingEvent.class.getName());

    public ReceivingEvent(UpnpService upnpService, StreamRequestMessage streamRequestMessage) {
        super(upnpService, streamRequestMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.fourthline.cling.protocol.ReceivingSync
    public OutgoingEventResponseMessage executeSync() throws RouterException {
        if (!((StreamRequestMessage) getInputMessage()).isContentTypeTextUDA()) {
            log.warning("Received without or with invalid Content-Type: " + getInputMessage());
        }
        ServiceEventCallbackResource serviceEventCallbackResource = (ServiceEventCallbackResource) getUpnpService().getRegistry().getResource(ServiceEventCallbackResource.class, ((StreamRequestMessage) getInputMessage()).getUri());
        if (serviceEventCallbackResource == null) {
            log.fine("No local resource found: " + getInputMessage());
            return new OutgoingEventResponseMessage(new UpnpResponse(UpnpResponse.Status.NOT_FOUND));
        }
        final IncomingEventRequestMessage incomingEventRequestMessage = new IncomingEventRequestMessage((StreamRequestMessage) getInputMessage(), serviceEventCallbackResource.getModel());
        if (incomingEventRequestMessage.getSubscrptionId() == null) {
            log.fine("Subscription ID missing in event request: " + getInputMessage());
            return new OutgoingEventResponseMessage(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        }
        if (!incomingEventRequestMessage.hasValidNotificationHeaders()) {
            log.fine("Missing NT and/or NTS headers in event request: " + getInputMessage());
            return new OutgoingEventResponseMessage(new UpnpResponse(UpnpResponse.Status.BAD_REQUEST));
        }
        if (!incomingEventRequestMessage.hasValidNotificationHeaders()) {
            log.fine("Invalid NT and/or NTS headers in event request: " + getInputMessage());
            return new OutgoingEventResponseMessage(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        }
        if (incomingEventRequestMessage.getSequence() == null) {
            log.fine("Sequence missing in event request: " + getInputMessage());
            return new OutgoingEventResponseMessage(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        }
        try {
            getUpnpService().getConfiguration().getGenaEventProcessor().readBody(incomingEventRequestMessage);
            final RemoteGENASubscription waitRemoteSubscription = getUpnpService().getRegistry().getWaitRemoteSubscription(incomingEventRequestMessage.getSubscrptionId());
            if (waitRemoteSubscription != null) {
                getUpnpService().getConfiguration().getRegistryListenerExecutor().execute(new Runnable() { // from class: org.fourthline.cling.protocol.sync.ReceivingEvent.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ReceivingEvent.log.fine("Calling active subscription with event state variable values");
                        waitRemoteSubscription.receive(incomingEventRequestMessage.getSequence(), incomingEventRequestMessage.getStateVariableValues());
                    }
                });
                return new OutgoingEventResponseMessage();
            }
            log.severe("Invalid subscription ID, no active subscription: " + incomingEventRequestMessage);
            return new OutgoingEventResponseMessage(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        } catch (UnsupportedDataException e) {
            log.fine("Can't read event message request body, " + e);
            final RemoteGENASubscription remoteSubscription = getUpnpService().getRegistry().getRemoteSubscription(incomingEventRequestMessage.getSubscrptionId());
            if (remoteSubscription != null) {
                getUpnpService().getConfiguration().getRegistryListenerExecutor().execute(new Runnable() { // from class: org.fourthline.cling.protocol.sync.ReceivingEvent.1
                    @Override // java.lang.Runnable
                    public void run() {
                        remoteSubscription.invalidMessage(e);
                    }
                });
            }
            return new OutgoingEventResponseMessage(new UpnpResponse(UpnpResponse.Status.INTERNAL_SERVER_ERROR));
        }
    }
}
