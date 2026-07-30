package org.fourthline.cling.model.message.header;

import java.net.URI;
import org.fourthline.cling.model.types.UDAServiceType;
import p149l.bcc0;

/* JADX INFO: loaded from: classes3.dex */
public class UDAServiceTypeHeader extends ServiceTypeHeader {
    public UDAServiceTypeHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.ServiceTypeHeader, org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        try {
            setValue(UDAServiceType.valueOf(str));
        } catch (Exception e) {
            bcc0.m101054a("Invalid UDA service type header value, ", e.getMessage());
        }
    }

    public UDAServiceTypeHeader(URI uri) {
        super(uri);
    }

    public UDAServiceTypeHeader(UDAServiceType uDAServiceType) {
        super(uDAServiceType);
    }
}
