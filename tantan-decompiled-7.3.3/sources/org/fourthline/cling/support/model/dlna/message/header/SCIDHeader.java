package org.fourthline.cling.support.model.dlna.message.header;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import p153l.bke;

/* JADX INFO: loaded from: classes3.dex */
public class SCIDHeader extends DLNAHeader<String> {
    public SCIDHeader() {
        setValue("");
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (str.length() != 0) {
            setValue(str);
        } else {
            bke.m104797a("Invalid SCID header value: ".concat(str));
        }
    }
}
