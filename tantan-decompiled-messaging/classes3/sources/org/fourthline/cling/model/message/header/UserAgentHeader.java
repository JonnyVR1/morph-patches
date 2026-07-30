package org.fourthline.cling.model.message.header;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class UserAgentHeader extends UpnpHeader<String> {
    public UserAgentHeader(String str) {
        setValue(str);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        setValue(str);
    }

    public UserAgentHeader() {
    }
}
