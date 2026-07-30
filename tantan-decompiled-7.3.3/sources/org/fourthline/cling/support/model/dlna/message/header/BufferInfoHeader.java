package org.fourthline.cling.support.model.dlna.message.header;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.support.model.dlna.types.BufferInfoType;
import p153l.bke;

/* JADX INFO: loaded from: classes3.dex */
public class BufferInfoHeader extends DLNAHeader<BufferInfoType> {
    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().getString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (str.length() != 0) {
            try {
                setValue(BufferInfoType.valueOf(str));
                return;
            } catch (Exception unused) {
            }
        }
        bke.m104797a("Invalid BufferInfo header value: ".concat(str));
    }
}
