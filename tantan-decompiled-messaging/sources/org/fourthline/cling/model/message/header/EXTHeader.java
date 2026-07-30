package org.fourthline.cling.model.message.header;

import p149l.xie;

/* JADX INFO: loaded from: classes3.dex */
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
        xie.m209638a("Invalid EXT header, it has no value: ".concat(str));
    }
}
