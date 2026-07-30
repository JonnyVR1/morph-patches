package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.NamedServiceType;
import org.fourthline.cling.model.types.ServiceType;
import org.fourthline.cling.model.types.UDN;
import p153l.ikc0;

/* JADX INFO: loaded from: classes3.dex */
public class ServiceUSNHeader extends UpnpHeader<NamedServiceType> {
    public ServiceUSNHeader(UDN udn, ServiceType serviceType) {
        setValue(new NamedServiceType(udn, serviceType));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        try {
            setValue(NamedServiceType.valueOf(str));
        } catch (Exception e) {
            ikc0.m140270a("Invalid service USN header value, ", e.getMessage());
        }
    }

    public ServiceUSNHeader() {
    }

    public ServiceUSNHeader(NamedServiceType namedServiceType) {
        setValue(namedServiceType);
    }
}
