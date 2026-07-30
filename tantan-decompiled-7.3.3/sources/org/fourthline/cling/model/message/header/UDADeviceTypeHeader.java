package org.fourthline.cling.model.message.header;

import java.net.URI;
import org.fourthline.cling.model.types.DeviceType;
import org.fourthline.cling.model.types.UDADeviceType;
import p153l.ikc0;

/* JADX INFO: loaded from: classes3.dex */
public class UDADeviceTypeHeader extends DeviceTypeHeader {
    public UDADeviceTypeHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.DeviceTypeHeader, org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        try {
            setValue(UDADeviceType.valueOf(str));
        } catch (Exception e) {
            ikc0.m140270a("Invalid UDA device type header value, ", e.getMessage());
        }
    }

    public UDADeviceTypeHeader(URI uri) {
        super(uri);
    }

    public UDADeviceTypeHeader(DeviceType deviceType) {
        super(deviceType);
    }
}
