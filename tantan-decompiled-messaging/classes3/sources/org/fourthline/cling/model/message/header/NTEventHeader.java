package org.fourthline.cling.model.message.header;

import java.util.Locale;
import p003l.xie;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NTEventHeader extends UpnpHeader<String> {
    public NTEventHeader() {
        setValue("upnp:event");
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (str.toLowerCase(Locale.ROOT).equals(getValue())) {
            return;
        }
        xie.m8707a("Invalid event NT header value: ".concat(str));
    }
}
