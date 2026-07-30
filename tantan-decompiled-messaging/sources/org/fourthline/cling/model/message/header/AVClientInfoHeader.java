package org.fourthline.cling.model.message.header;

/* JADX INFO: loaded from: classes3.dex */
public class AVClientInfoHeader extends UpnpHeader<String> {
    public AVClientInfoHeader(String str) {
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

    public AVClientInfoHeader() {
    }
}
