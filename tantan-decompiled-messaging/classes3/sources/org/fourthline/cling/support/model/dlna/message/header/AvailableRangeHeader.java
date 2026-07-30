package org.fourthline.cling.support.model.dlna.message.header;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.support.model.dlna.types.NormalPlayTimeRange;
import p003l.xie;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AvailableRangeHeader extends DLNAHeader<NormalPlayTimeRange> {
    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (str.length() != 0) {
            try {
                setValue(NormalPlayTimeRange.valueOf(str, true));
                return;
            } catch (Exception unused) {
            }
        }
        xie.m8707a("Invalid AvailableRange header value: ".concat(str));
    }
}
