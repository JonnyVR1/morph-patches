package org.fourthline.cling.protocol.sync;

import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.gena.RemoteGENASubscription;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.message.gena.OutgoingUnsubscribeRequestMessage;
import org.fourthline.cling.protocol.SendingSync;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SendingUnsubscribe extends SendingSync<OutgoingUnsubscribeRequestMessage, StreamResponseMessage> {
    private static final Logger log = Logger.getLogger(SendingUnsubscribe.class.getName());
    protected final RemoteGENASubscription subscription;

    public SendingUnsubscribe(UpnpService upnpService, RemoteGENASubscription remoteGENASubscription) {
        super(upnpService, new OutgoingUnsubscribeRequestMessage(remoteGENASubscription, upnpService.getConfiguration().getEventSubscriptionHeaders(remoteGENASubscription.getService())));
        this.subscription = remoteGENASubscription;
    }

    @Override // org.fourthline.cling.protocol.SendingSync
    public StreamResponseMessage executeSync() throws RouterException {
        log.fine("Sending unsubscribe request: " + getInputMessage());
        try {
            StreamResponseMessage streamResponseMessageSend = getUpnpService().getRouter().send(getInputMessage());
            onUnsubscribe(streamResponseMessageSend);
            return streamResponseMessageSend;
        } catch (Throwable th) {
            onUnsubscribe(null);
            throw th;
        }
    }

    public void onUnsubscribe(final StreamResponseMessage streamResponseMessage) {
        getUpnpService().getRegistry().removeRemoteSubscription(this.subscription);
        getUpnpService().getConfiguration().getRegistryListenerExecutor().execute(new Runnable() { // from class: org.fourthline.cling.protocol.sync.SendingUnsubscribe.1
            @Override // java.lang.Runnable
            public void run() {
                StreamResponseMessage streamResponseMessage2 = streamResponseMessage;
                if (streamResponseMessage2 == null) {
                    SendingUnsubscribe.log.fine("Unsubscribe failed, no response received");
                    SendingUnsubscribe.this.subscription.end(CancelReason.UNSUBSCRIBE_FAILED, null);
                    return;
                }
                if (streamResponseMessage2.getOperation().isFailed()) {
                    SendingUnsubscribe.log.fine("Unsubscribe failed, response was: " + streamResponseMessage);
                    SendingUnsubscribe.this.subscription.end(CancelReason.UNSUBSCRIBE_FAILED, streamResponseMessage.getOperation());
                    return;
                }
                SendingUnsubscribe.log.fine("Unsubscribe successful, response was: " + streamResponseMessage);
                SendingUnsubscribe.this.subscription.end(null, streamResponseMessage.getOperation());
            }
        });
    }
}
