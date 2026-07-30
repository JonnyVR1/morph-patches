package org.fourthline.cling.model.message.gena;

import org.fourthline.cling.model.gena.LocalGENASubscription;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.ServerHeader;
import org.fourthline.cling.model.message.header.SubscriptionIdHeader;
import org.fourthline.cling.model.message.header.TimeoutHeader;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class OutgoingSubscribeResponseMessage extends StreamResponseMessage {
    public OutgoingSubscribeResponseMessage(LocalGENASubscription localGENASubscription) {
        super(new UpnpResponse(UpnpResponse.Status.OK));
        getHeaders().add(UpnpHeader.Type.SERVER, new ServerHeader());
        getHeaders().add(UpnpHeader.Type.SID, new SubscriptionIdHeader(localGENASubscription.getSubscriptionId()));
        getHeaders().add(UpnpHeader.Type.TIMEOUT, new TimeoutHeader(localGENASubscription.getActualDurationSeconds()));
    }

    public OutgoingSubscribeResponseMessage(UpnpResponse.Status status) {
        super(status);
    }
}
