package org.fourthline.cling.model.message.header;

import java.net.URI;
import org.fourthline.cling.model.types.ServiceType;
import p153l.ikc0;

/* JADX INFO: loaded from: classes3.dex */
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
            ikc0.m140270a("Invalid service type header value, ", e.getMessage());
        }
    }

    public ServiceTypeHeader() {
    }

    public ServiceTypeHeader(ServiceType serviceType) {
        setValue(serviceType);
    }
}
