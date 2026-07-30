package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.DeviceType;
import org.fourthline.cling.model.types.NamedDeviceType;
import org.fourthline.cling.model.types.UDN;
import p003l.bcc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DeviceUSNHeader extends UpnpHeader<NamedDeviceType> {
    public DeviceUSNHeader(UDN udn, DeviceType deviceType) {
        setValue(new NamedDeviceType(udn, deviceType));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        try {
            setValue(NamedDeviceType.valueOf(str));
        } catch (Exception e) {
            bcc0.m2942a("Invalid device USN header value, ", e.getMessage());
        }
    }

    public DeviceUSNHeader() {
    }

    public DeviceUSNHeader(NamedDeviceType namedDeviceType) {
        setValue(namedDeviceType);
    }
}
