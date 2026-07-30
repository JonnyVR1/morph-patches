package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.model.types.PragmaType;
import p149l.bcc0;

/* JADX INFO: loaded from: classes3.dex */
public class PragmaHeader extends UpnpHeader<PragmaType> {
    public PragmaHeader(PragmaType pragmaType) {
        setValue(pragmaType);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().getString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        try {
            setValue(PragmaType.valueOf(str));
        } catch (InvalidValueException e) {
            bcc0.m101054a("Invalid Range Header: ", e.getMessage());
        }
    }

    public PragmaHeader() {
    }

    public PragmaHeader(String str) {
        setString(str);
    }
}
