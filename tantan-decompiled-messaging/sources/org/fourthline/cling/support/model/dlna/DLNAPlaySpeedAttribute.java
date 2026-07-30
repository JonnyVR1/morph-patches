package org.fourthline.cling.support.model.dlna;

import com.clevertap.android.sdk.Constants;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.support.avtransport.lastchange.AVTransportVariable;
import p149l.g0c;

/* JADX INFO: loaded from: classes3.dex */
public class DLNAPlaySpeedAttribute extends DLNAAttribute<AVTransportVariable.TransportPlaySpeed[]> {
    public DLNAPlaySpeedAttribute(String[] strArr) {
        AVTransportVariable.TransportPlaySpeed[] transportPlaySpeedArr = new AVTransportVariable.TransportPlaySpeed[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            try {
                transportPlaySpeedArr[i] = new AVTransportVariable.TransportPlaySpeed(strArr[i]);
            } catch (InvalidValueException unused) {
                throw new InvalidDLNAProtocolAttributeException("Can't parse DLNA play speeds.");
            }
        }
        setValue(transportPlaySpeedArr);
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public String getString() {
        String string = "";
        for (AVTransportVariable.TransportPlaySpeed transportPlaySpeed : getValue()) {
            if (!transportPlaySpeed.getValue().equals("1")) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(string.length() == 0 ? "" : Constants.SEPARATOR_COMMA);
                sb.append(transportPlaySpeed);
                string = sb.toString();
            }
        }
        return string;
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public void setString(String str, String str2) throws InvalidDLNAProtocolAttributeException {
        AVTransportVariable.TransportPlaySpeed[] transportPlaySpeedArr = null;
        if (str != null && str.length() != 0) {
            String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
            try {
                AVTransportVariable.TransportPlaySpeed[] transportPlaySpeedArr2 = new AVTransportVariable.TransportPlaySpeed[strArrSplit.length];
                for (int i = 0; i < strArrSplit.length; i++) {
                    transportPlaySpeedArr2[i] = new AVTransportVariable.TransportPlaySpeed(strArrSplit[i]);
                }
                transportPlaySpeedArr = transportPlaySpeedArr2;
            } catch (InvalidValueException unused) {
            }
        }
        if (transportPlaySpeedArr != null) {
            setValue(transportPlaySpeedArr);
        } else {
            g0c.m123955a("Can't parse DLNA play speeds from: ", str);
        }
    }

    public DLNAPlaySpeedAttribute(AVTransportVariable.TransportPlaySpeed[] transportPlaySpeedArr) {
        setValue(transportPlaySpeedArr);
    }

    public DLNAPlaySpeedAttribute() {
        setValue(new AVTransportVariable.TransportPlaySpeed[0]);
    }
}
