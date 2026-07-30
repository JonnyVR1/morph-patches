package org.fourthline.cling.model.message.header;

import p149l.xie;

/* JADX INFO: loaded from: classes3.dex */
public class SubscriptionIdHeader extends UpnpHeader<String> {
    public static final String PREFIX = "uuid:";

    public SubscriptionIdHeader(String str) {
        setValue(str);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (str.startsWith("uuid:")) {
            setValue(str);
        } else {
            xie.m209638a("Invalid subscription ID header value, must start with 'uuid:': ".concat(str));
        }
    }

    public SubscriptionIdHeader() {
    }
}
