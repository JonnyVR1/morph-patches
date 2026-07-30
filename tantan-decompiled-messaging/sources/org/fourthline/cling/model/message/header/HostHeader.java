package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.Constants;
import org.fourthline.cling.model.types.HostPort;
import p149l.sel;

/* JADX INFO: loaded from: classes3.dex */
public class HostHeader extends UpnpHeader<HostPort> {
    int port = Constants.UPNP_MULTICAST_PORT;
    String group = Constants.IPV4_UPNP_MULTICAST_GROUP;

    public HostHeader() {
        setValue(new HostPort(Constants.IPV4_UPNP_MULTICAST_GROUP, Constants.UPNP_MULTICAST_PORT));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (!str.contains(":")) {
            this.group = str;
            setValue(new HostPort(str, this.port));
            return;
        }
        try {
            this.port = Integer.valueOf(str.substring(str.indexOf(":") + 1)).intValue();
            String strSubstring = str.substring(0, str.indexOf(":"));
            this.group = strSubstring;
            setValue(new HostPort(strSubstring, this.port));
        } catch (NumberFormatException e) {
            sel.m183674a("Invalid HOST header value, can't parse port: ", str, " - ", e.getMessage());
        }
    }

    public HostHeader(int i) {
        setValue(new HostPort(Constants.IPV4_UPNP_MULTICAST_GROUP, i));
    }

    public HostHeader(String str, int i) {
        setValue(new HostPort(str, i));
    }
}
