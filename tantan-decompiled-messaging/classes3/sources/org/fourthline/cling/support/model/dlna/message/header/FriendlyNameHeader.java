package org.fourthline.cling.support.model.dlna.message.header;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import p003l.xie;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class FriendlyNameHeader extends DLNAHeader<String> {
    public FriendlyNameHeader() {
        setValue("");
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (str.length() != 0) {
            setValue(str);
        } else {
            xie.m8707a("Invalid GetAvailableSeekRange header value: ".concat(str));
        }
    }

    public FriendlyNameHeader(String str) {
        setValue(str);
    }
}
