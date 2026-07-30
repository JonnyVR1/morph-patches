package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;
import p153l.ikc0;

/* JADX INFO: loaded from: classes3.dex */
public class EventSequenceHeader extends UpnpHeader<UnsignedIntegerFourBytes> {
    public EventSequenceHeader(long j) {
        setValue(new UnsignedIntegerFourBytes(j));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (!"0".equals(str)) {
            while (str.startsWith("0")) {
                str = str.substring(1);
            }
        }
        try {
            setValue(new UnsignedIntegerFourBytes(str));
        } catch (NumberFormatException e) {
            ikc0.m140270a("Invalid event sequence, ", e.getMessage());
        }
    }

    public EventSequenceHeader() {
    }
}
