package org.fourthline.cling.model.message.header;

import java.net.URI;
import org.fourthline.cling.model.types.DeviceType;
import p153l.ikc0;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceTypeHeader extends UpnpHeader<DeviceType> {
    public DeviceTypeHeader(URI uri) {
        setString(uri.toString());
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        try {
            setValue(DeviceType.valueOf(str));
        } catch (RuntimeException e) {
            ikc0.m140270a("Invalid device type header value, ", e.getMessage());
        }
    }

    public DeviceTypeHeader() {
    }

    public DeviceTypeHeader(DeviceType deviceType) {
        setValue(deviceType);
    }
}
