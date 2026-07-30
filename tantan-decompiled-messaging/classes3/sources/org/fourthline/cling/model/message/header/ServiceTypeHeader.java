package org.fourthline.cling.model.message.header;

import java.net.URI;
import org.fourthline.cling.model.types.ServiceType;
import p003l.bcc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ServiceTypeHeader extends UpnpHeader<ServiceType> {
    public ServiceTypeHeader(URI uri) {
        setString(uri.toString());
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        try {
            setValue(ServiceType.valueOf(str));
        } catch (RuntimeException e) {
            bcc0.m2942a("Invalid service type header value, ", e.getMessage());
        }
    }

    public ServiceTypeHeader() {
    }

    public ServiceTypeHeader(ServiceType serviceType) {
        setValue(serviceType);
    }
}
