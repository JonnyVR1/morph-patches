package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.BytesRange;
import org.fourthline.cling.model.types.InvalidValueException;
import p003l.bcc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ContentRangeHeader extends UpnpHeader<BytesRange> {
    public static final String PREFIX = "bytes ";

    public ContentRangeHeader(BytesRange bytesRange) {
        setValue(bytesRange);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().getString(true, PREFIX);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        try {
            setValue(BytesRange.valueOf(str, PREFIX));
        } catch (InvalidValueException e) {
            bcc0.m2942a("Invalid Range Header: ", e.getMessage());
        }
    }

    public ContentRangeHeader() {
    }

    public ContentRangeHeader(String str) {
        setString(str);
    }
}
