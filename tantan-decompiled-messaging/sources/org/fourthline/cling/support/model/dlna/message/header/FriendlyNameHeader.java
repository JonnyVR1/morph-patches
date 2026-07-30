package org.fourthline.cling.support.model.dlna.message.header;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import p149l.xie;

/* JADX INFO: loaded from: classes3.dex */
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
            xie.m209638a("Invalid GetAvailableSeekRange header value: ".concat(str));
        }
    }

    public FriendlyNameHeader(String str) {
        setValue(str);
    }
}
