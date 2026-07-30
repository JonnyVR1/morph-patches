package org.fourthline.cling.model.message.header;

import java.net.MalformedURLException;
import java.net.URL;
import p003l.bcc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class LocationHeader extends UpnpHeader<URL> {
    public LocationHeader(URL url) {
        setValue(url);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        try {
            setValue(new URL(str));
        } catch (MalformedURLException e) {
            bcc0.m2942a("Invalid URI: ", e.getMessage());
        }
    }

    public LocationHeader() {
    }

    public LocationHeader(String str) {
        setString(str);
    }
}
