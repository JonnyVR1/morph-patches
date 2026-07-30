package org.fourthline.cling.support.model.dlna.message.header;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import p003l.xie;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GetAvailableSeekRangeHeader extends DLNAHeader<Integer> {
    public GetAvailableSeekRangeHeader() {
        setValue(1);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (str.length() != 0) {
            try {
                if (Integer.parseInt(str) == 1) {
                    return;
                }
            } catch (Exception unused) {
            }
        }
        xie.m8707a("Invalid GetAvailableSeekRange header value: ".concat(str));
    }
}
