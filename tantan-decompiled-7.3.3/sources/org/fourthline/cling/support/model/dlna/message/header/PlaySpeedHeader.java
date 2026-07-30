package org.fourthline.cling.support.model.dlna.message.header;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.support.avtransport.lastchange.AVTransportVariable;
import p153l.bke;

/* JADX INFO: loaded from: classes3.dex */
public class PlaySpeedHeader extends DLNAHeader<AVTransportVariable.TransportPlaySpeed> {
    public PlaySpeedHeader(AVTransportVariable.TransportPlaySpeed transportPlaySpeed) {
        setValue(transportPlaySpeed);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().getValue();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (str.length() != 0) {
            try {
                setValue(new AVTransportVariable.TransportPlaySpeed(str));
                return;
            } catch (InvalidValueException unused) {
            }
        }
        bke.m104797a("Invalid PlaySpeed header value: ".concat(str));
    }

    public PlaySpeedHeader() {
    }
}
