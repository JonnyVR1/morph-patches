package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.NotificationSubtype;

/* JADX INFO: loaded from: classes3.dex */
public class STAllHeader extends UpnpHeader<NotificationSubtype> {
    public STAllHeader() {
        setValue(NotificationSubtype.ALL);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().getHeaderString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        NotificationSubtype notificationSubtype = NotificationSubtype.ALL;
        if (str.equals(notificationSubtype.getHeaderString())) {
            return;
        }
        throw new InvalidHeaderException("Invalid ST header value (not " + notificationSubtype + "): " + str);
    }
}
