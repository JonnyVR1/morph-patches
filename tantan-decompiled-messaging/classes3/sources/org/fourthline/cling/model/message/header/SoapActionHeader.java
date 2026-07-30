package org.fourthline.cling.model.message.header;

import java.net.URI;
import org.fourthline.cling.model.types.SoapActionType;
import p003l.bcc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SoapActionHeader extends UpnpHeader<SoapActionType> {
    public SoapActionHeader(URI uri) {
        setValue(SoapActionType.valueOf(uri.toString()));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return "\"" + getValue().toString() + "\"";
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        try {
            if (!str.startsWith("\"") && str.endsWith("\"")) {
                throw new InvalidHeaderException("Invalid SOAP action header, must be enclosed in doublequotes:".concat(str));
            }
            setValue(SoapActionType.valueOf(str.substring(1, str.length() - 1)));
        } catch (RuntimeException e) {
            bcc0.m2942a("Invalid SOAP action header value, ", e.getMessage());
        }
    }

    public SoapActionHeader() {
    }

    public SoapActionHeader(SoapActionType soapActionType) {
        setValue(soapActionType);
    }

    public SoapActionHeader(String str) throws InvalidHeaderException {
        setString(str);
    }
}
