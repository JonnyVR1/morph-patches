package org.fourthline.cling.protocol.sync;

import java.net.URL;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.gena.LocalGENASubscription;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.gena.IncomingSubscribeRequestMessage;
import org.fourthline.cling.model.message.gena.OutgoingSubscribeResponseMessage;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.resource.ServiceEventSubscriptionResource;
import org.fourthline.cling.protocol.ReceivingSync;
import org.fourthline.cling.transport.RouterException;
import org.seamless.util.Exceptions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ReceivingSubscribe extends ReceivingSync<StreamRequestMessage, OutgoingSubscribeResponseMessage> {
    private static final Logger log = Logger.getLogger(ReceivingSubscribe.class.getName());
    protected LocalGENASubscription subscription;

    public ReceivingSubscribe(UpnpService upnpService, StreamRequestMessage streamRequestMessage) {
        super(upnpService, streamRequestMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.fourthline.cling.protocol.ReceivingSync
    public OutgoingSubscribeResponseMessage executeSync() throws RouterException {
        ServiceEventSubscriptionResource serviceEventSubscriptionResource = (ServiceEventSubscriptionResource) getUpnpService().getRegistry().getResource(ServiceEventSubscriptionResource.class, ((StreamRequestMessage) getInputMessage()).getUri());
        if (serviceEventSubscriptionResource == null) {
            log.fine("No local resource found: " + getInputMessage());
            return null;
        }
        Logger logger = log;
        logger.fine("Found local event subscription matching relative request URI: " + ((StreamRequestMessage) getInputMessage()).getUri());
        IncomingSubscribeRequestMessage incomingSubscribeRequestMessage = new IncomingSubscribeRequestMessage((StreamRequestMessage) getInputMessage(), serviceEventSubscriptionResource.getModel());
        if (incomingSubscribeRequestMessage.getSubscriptionId() != null && (incomingSubscribeRequestMessage.hasNotificationHeader() || incomingSubscribeRequestMessage.getCallbackURLs() != null)) {
            logger.fine("Subscription ID and NT or Callback in subscribe request: " + getInputMessage());
            return new OutgoingSubscribeResponseMessage(UpnpResponse.Status.BAD_REQUEST);
        }
        if (incomingSubscribeRequestMessage.getSubscriptionId() != null) {
            return processRenewal(serviceEventSubscriptionResource.getModel(), incomingSubscribeRequestMessage);
        }
        if (incomingSubscribeRequestMessage.hasNotificationHeader() && incomingSubscribeRequestMessage.getCallbackURLs() != null) {
            return processNewSubscription(serviceEventSubscriptionResource.getModel(), incomingSubscribeRequestMessage);
        }
        logger.fine("No subscription ID, no NT or Callback, neither subscription or renewal: " + getInputMessage());
        return new OutgoingSubscribeResponseMessage(UpnpResponse.Status.PRECONDITION_FAILED);
    }

    public OutgoingSubscribeResponseMessage processNewSubscription(LocalService localService, IncomingSubscribeRequestMessage incomingSubscribeRequestMessage) {
        List<URL> callbackURLs = incomingSubscribeRequestMessage.getCallbackURLs();
        if (callbackURLs == null || callbackURLs.size() == 0) {
            log.fine("Missing or invalid Callback URLs in subscribe request: " + getInputMessage());
            return new OutgoingSubscribeResponseMessage(UpnpResponse.Status.PRECONDITION_FAILED);
        }
        if (!incomingSubscribeRequestMessage.hasNotificationHeader()) {
            log.fine("Missing or invalid NT header in subscribe request: " + getInputMessage());
            return new OutgoingSubscribeResponseMessage(UpnpResponse.Status.PRECONDITION_FAILED);
        }
        try {
            this.subscription = new LocalGENASubscription(localService, getUpnpService().getConfiguration().isReceivedSubscriptionTimeoutIgnored() ? null : incomingSubscribeRequestMessage.getRequestedTimeoutSeconds(), callbackURLs) { // from class: org.fourthline.cling.protocol.sync.ReceivingSubscribe.1
                @Override // org.fourthline.cling.model.gena.LocalGENASubscription
                public void ended(CancelReason cancelReason) {
                }

                @Override // org.fourthline.cling.model.gena.GENASubscription
                public void established() {
                }

                @Override // org.fourthline.cling.model.gena.GENASubscription
                public void eventReceived() {
                    ReceivingSubscribe.this.getUpnpService().getConfiguration().getSyncProtocolExecutorService().execute(ReceivingSubscribe.this.getUpnpService().getProtocolFactory().createSendingEvent(this));
                }
            };
            Logger logger = log;
            logger.fine("Adding subscription to registry: " + this.subscription);
            getUpnpService().getRegistry().addLocalSubscription(this.subscription);
            logger.fine("Returning subscription response, waiting to send initial event");
            return new OutgoingSubscribeResponseMessage(this.subscription);
        } catch (Exception e) {
            log.warning("Couldn't create local subscription to service: " + Exceptions.unwrap(e));
            return new OutgoingSubscribeResponseMessage(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
        }
    }

    public OutgoingSubscribeResponseMessage processRenewal(LocalService localService, IncomingSubscribeRequestMessage incomingSubscribeRequestMessage) {
        LocalGENASubscription localSubscription = getUpnpService().getRegistry().getLocalSubscription(incomingSubscribeRequestMessage.getSubscriptionId());
        this.subscription = localSubscription;
        if (localSubscription == null) {
            log.fine("Invalid subscription ID for renewal request: " + getInputMessage());
            return new OutgoingSubscribeResponseMessage(UpnpResponse.Status.PRECONDITION_FAILED);
        }
        Logger logger = log;
        logger.fine("Renewing subscription: " + this.subscription);
        this.subscription.setSubscriptionDuration(incomingSubscribeRequestMessage.getRequestedTimeoutSeconds());
        if (getUpnpService().getRegistry().updateLocalSubscription(this.subscription)) {
            return new OutgoingSubscribeResponseMessage(this.subscription);
        }
        logger.fine("Subscription went away before it could be renewed: " + getInputMessage());
        return new OutgoingSubscribeResponseMessage(UpnpResponse.Status.PRECONDITION_FAILED);
    }

    @Override // org.fourthline.cling.protocol.ReceivingSync
    public void responseException(Throwable th) {
        if (this.subscription == null) {
            return;
        }
        log.fine("Response could not be send to subscriber, removing local GENA subscription: " + this.subscription);
        getUpnpService().getRegistry().removeLocalSubscription(this.subscription);
    }

    @Override // org.fourthline.cling.protocol.ReceivingSync
    public void responseSent(StreamResponseMessage streamResponseMessage) {
        if (this.subscription == null) {
            return;
        }
        if (streamResponseMessage != null && !streamResponseMessage.getOperation().isFailed() && this.subscription.getCurrentSequence().getValue().longValue() == 0) {
            Logger logger = log;
            logger.fine("Establishing subscription");
            this.subscription.registerOnService();
            this.subscription.establish();
            logger.fine("Response to subscription sent successfully, now sending initial event asynchronously");
            getUpnpService().getConfiguration().getAsyncProtocolExecutor().execute(getUpnpService().getProtocolFactory().createSendingEvent(this.subscription));
            return;
        }
        if (this.subscription.getCurrentSequence().getValue().longValue() == 0) {
            Logger logger2 = log;
            logger2.fine("Subscription request's response aborted, not sending initial event");
            if (streamResponseMessage == null) {
                logger2.fine("Reason: No response at all from subscriber");
            } else {
                logger2.fine("Reason: " + streamResponseMessage.getOperation());
            }
            logger2.fine("Removing subscription from registry: " + this.subscription);
            getUpnpService().getRegistry().removeLocalSubscription(this.subscription);
        }
    }
}
