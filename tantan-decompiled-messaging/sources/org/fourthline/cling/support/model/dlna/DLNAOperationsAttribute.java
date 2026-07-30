package org.fourthline.cling.support.model.dlna;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import p149l.g0c;

/* JADX INFO: loaded from: classes3.dex */
public class DLNAOperationsAttribute extends DLNAAttribute<EnumSet<DLNAOperations>> {
    public DLNAOperationsAttribute(DLNAOperations... dLNAOperationsArr) {
        if (dLNAOperationsArr == null || dLNAOperationsArr.length <= 0) {
            return;
        }
        DLNAOperations dLNAOperations = dLNAOperationsArr[0];
        if (dLNAOperationsArr.length <= 1) {
            setValue(EnumSet.of(dLNAOperations));
        } else {
            System.arraycopy(dLNAOperationsArr, 1, dLNAOperationsArr, 0, dLNAOperationsArr.length - 1);
            setValue(EnumSet.of(dLNAOperations, dLNAOperationsArr));
        }
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public String getString() {
        int code = DLNAOperations.NONE.getCode();
        Iterator<DLNAOperations> it = getValue().iterator();
        while (it.hasNext()) {
            code |= it.next().getCode();
        }
        return String.format(Locale.ROOT, "%02x", Integer.valueOf(code));
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public void setString(String str, String str2) throws InvalidDLNAProtocolAttributeException {
        EnumSet enumSetNoneOf = EnumSet.noneOf(DLNAOperations.class);
        try {
            int i = Integer.parseInt(str, 16);
            for (DLNAOperations dLNAOperations : DLNAOperations.values()) {
                int code = dLNAOperations.getCode() & i;
                if (dLNAOperations != DLNAOperations.NONE && dLNAOperations.getCode() == code) {
                    enumSetNoneOf.add(dLNAOperations);
                }
            }
        } catch (NumberFormatException unused) {
        }
        if (enumSetNoneOf.isEmpty()) {
            g0c.m123955a("Can't parse DLNA operations integer from: ", str);
        } else {
            setValue(enumSetNoneOf);
        }
    }

    public DLNAOperationsAttribute() {
        setValue(EnumSet.of(DLNAOperations.NONE));
    }
}
