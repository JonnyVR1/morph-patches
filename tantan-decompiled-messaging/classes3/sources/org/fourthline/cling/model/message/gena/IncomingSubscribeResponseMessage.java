package org.fourthline.cling.model.message.gena;

import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.message.header.SubscriptionIdHeader;
import org.fourthline.cling.model.message.header.TimeoutHeader;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class IncomingSubscribeResponseMessage extends StreamResponseMessage {
    public IncomingSubscribeResponseMessage(StreamResponseMessage streamResponseMessage) {
        super(streamResponseMessage);
    }

    public int getSubscriptionDurationSeconds() {
        return ((TimeoutHeader) getHeaders().getFirstHeader(UpnpHeader.Type.TIMEOUT, TimeoutHeader.class)).getValue().intValue();
    }

    public String getSubscriptionId() {
        return ((SubscriptionIdHeader) getHeaders().getFirstHeader(UpnpHeader.Type.SID, SubscriptionIdHeader.class)).getValue();
    }

    public boolean isValidHeaders() {
        return (getHeaders().getFirstHeader(UpnpHeader.Type.SID, SubscriptionIdHeader.class) == null || getHeaders().getFirstHeader(UpnpHeader.Type.TIMEOUT, TimeoutHeader.class) == null) ? false : true;
    }
}
