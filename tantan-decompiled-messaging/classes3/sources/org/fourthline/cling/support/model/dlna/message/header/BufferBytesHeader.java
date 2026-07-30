package org.fourthline.cling.support.model.dlna.message.header;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;
import p003l.kow;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BufferBytesHeader extends DLNAHeader<UnsignedIntegerFourBytes> {
    public BufferBytesHeader() {
        setValue(new UnsignedIntegerFourBytes(0L));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        try {
            setValue(new UnsignedIntegerFourBytes(str));
        } catch (NumberFormatException unused) {
            kow.m5724a("Invalid header value: ", str);
        }
    }
}
