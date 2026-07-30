package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.UDN;
import p003l.xie;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class UDNHeader extends UpnpHeader<UDN> {
    public UDNHeader(UDN udn) {
        setValue(udn);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (!str.startsWith("uuid:")) {
            xie.m8707a("Invalid UDA header value, must start with 'uuid:': ".concat(str));
        } else if (str.contains("::urn")) {
            xie.m8707a("Invalid UDA header value, must not contain '::urn': ".concat(str));
        } else {
            setValue(new UDN(str.substring(5)));
        }
    }

    public UDNHeader() {
    }
}
