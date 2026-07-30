package org.fourthline.cling.model.message.header;

import p153l.bke;

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
        bke.m104797a("Invalid EXT header, it has no value: ".concat(str));
    }
}
