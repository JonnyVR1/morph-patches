package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.NotificationSubtype;
import p149l.kow;

/* JADX INFO: loaded from: classes3.dex */
public class NTSHeader extends UpnpHeader<NotificationSubtype> {
    public NTSHeader(NotificationSubtype notificationSubtype) {
        setValue(notificationSubtype);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().getHeaderString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        for (NotificationSubtype notificationSubtype : NotificationSubtype.values()) {
            if (str.equals(notificationSubtype.getHeaderString())) {
                setValue(notificationSubtype);
                break;
            }
        }
        if (getValue() != null) {
            return;
        }
        kow.m146757a("Invalid NTS header value: ", str);
    }

    public NTSHeader() {
    }
}
