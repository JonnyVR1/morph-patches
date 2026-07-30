package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.UDN;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class USNRootDeviceHeader extends UpnpHeader<UDN> {
    public static final String ROOT_DEVICE_SUFFIX = "::upnp:rootdevice";

    public USNRootDeviceHeader(UDN udn) {
        setValue(udn);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString() + ROOT_DEVICE_SUFFIX;
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (str.startsWith("uuid:") && str.endsWith(ROOT_DEVICE_SUFFIX)) {
            setValue(new UDN(str.substring(5, str.length() - 17)));
            return;
        }
        throw new InvalidHeaderException("Invalid root device USN header value, must start with 'uuid:' and end with '::upnp:rootdevice' but is '" + str + "'");
    }

    public USNRootDeviceHeader() {
    }
}
