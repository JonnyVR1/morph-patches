package org.fourthline.cling.model.message.header;

import p003l.xie;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class EXTHeader extends UpnpHeader<String> {
    public static final String DEFAULT_VALUE = "";

    public EXTHeader() {
        setValue("");
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (str == null || str.length() <= 0) {
            return;
        }
        xie.m8707a("Invalid EXT header, it has no value: ".concat(str));
    }
}
