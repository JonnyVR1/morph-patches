package org.fourthline.cling.support.model.dlna.message.header;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import p153l.jrw;

/* JADX INFO: loaded from: classes3.dex */
public class MaxPrateHeader extends DLNAHeader<Long> {
    public MaxPrateHeader() {
        setValue(0L);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        try {
            setValue(Long.valueOf(Long.parseLong(str)));
        } catch (NumberFormatException unused) {
            jrw.m146822a("Invalid SCID header value: ", str);
        }
    }
}
