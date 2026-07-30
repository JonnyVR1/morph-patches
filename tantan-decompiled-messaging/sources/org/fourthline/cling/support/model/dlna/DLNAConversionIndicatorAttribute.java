package org.fourthline.cling.support.model.dlna;

import p149l.g0c;

/* JADX INFO: loaded from: classes3.dex */
public class DLNAConversionIndicatorAttribute extends DLNAAttribute<DLNAConversionIndicator> {
    public DLNAConversionIndicatorAttribute() {
        setValue(DLNAConversionIndicator.NONE);
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public String getString() {
        return Integer.toString(getValue().getCode());
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public void setString(String str, String str2) throws InvalidDLNAProtocolAttributeException {
        DLNAConversionIndicator dLNAConversionIndicatorValueOf;
        try {
            dLNAConversionIndicatorValueOf = DLNAConversionIndicator.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            dLNAConversionIndicatorValueOf = null;
        }
        if (dLNAConversionIndicatorValueOf != null) {
            setValue(dLNAConversionIndicatorValueOf);
        } else {
            g0c.m123955a("Can't parse DLNA play speed integer from: ", str);
        }
    }

    public DLNAConversionIndicatorAttribute(DLNAConversionIndicator dLNAConversionIndicator) {
        setValue(dLNAConversionIndicator);
    }
}
