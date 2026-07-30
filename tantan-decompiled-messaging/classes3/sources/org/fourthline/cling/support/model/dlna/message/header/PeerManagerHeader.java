package org.fourthline.cling.support.model.dlna.message.header;

import org.fourthline.cling.model.ServiceReference;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import p003l.xie;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PeerManagerHeader extends DLNAHeader<ServiceReference> {
    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (str.length() != 0) {
            try {
                ServiceReference serviceReference = new ServiceReference(str);
                if (serviceReference.getUdn() != null && serviceReference.getServiceId() != null) {
                    setValue(serviceReference);
                    return;
                }
            } catch (Exception unused) {
            }
        }
        xie.m8707a("Invalid PeerManager header value: ".concat(str));
    }
}
