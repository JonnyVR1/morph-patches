package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.BytesRange;
import org.fourthline.cling.model.types.InvalidValueException;
import p153l.ikc0;

/* JADX INFO: loaded from: classes3.dex */
public class RangeHeader extends UpnpHeader<BytesRange> {
    public RangeHeader(BytesRange bytesRange) {
        setValue(bytesRange);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().getString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        try {
            setValue(BytesRange.valueOf(str));
        } catch (InvalidValueException e) {
            ikc0.m140270a("Invalid Range Header: ", e.getMessage());
        }
    }

    public RangeHeader() {
    }

    public RangeHeader(String str) {
        setString(str);
    }
}
