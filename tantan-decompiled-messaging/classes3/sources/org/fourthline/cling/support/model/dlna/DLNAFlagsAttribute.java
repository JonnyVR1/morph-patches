package org.fourthline.cling.support.model.dlna;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import p003l.g0c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DLNAFlagsAttribute extends DLNAAttribute<EnumSet<DLNAFlags>> {
    public DLNAFlagsAttribute(DLNAFlags... dLNAFlagsArr) {
        if (dLNAFlagsArr == null || dLNAFlagsArr.length <= 0) {
            return;
        }
        DLNAFlags dLNAFlags = dLNAFlagsArr[0];
        if (dLNAFlagsArr.length <= 1) {
            setValue(EnumSet.of(dLNAFlags));
        } else {
            System.arraycopy(dLNAFlagsArr, 1, dLNAFlagsArr, 0, dLNAFlagsArr.length - 1);
            setValue(EnumSet.of(dLNAFlags, dLNAFlagsArr));
        }
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public String getString() {
        Iterator<DLNAFlags> it = getValue().iterator();
        int code = 0;
        while (it.hasNext()) {
            code |= it.next().getCode();
        }
        return String.format(Locale.ROOT, "%08x%024x", Integer.valueOf(code), 0);
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public void setString(String str, String str2) throws InvalidDLNAProtocolAttributeException {
        EnumSet enumSetNoneOf = EnumSet.noneOf(DLNAFlags.class);
        try {
            int i = Integer.parseInt(str.substring(0, str.length() - 24), 16);
            for (DLNAFlags dLNAFlags : DLNAFlags.values()) {
                if (dLNAFlags.getCode() == (dLNAFlags.getCode() & i)) {
                    enumSetNoneOf.add(dLNAFlags);
                }
            }
        } catch (Exception unused) {
        }
        if (enumSetNoneOf.isEmpty()) {
            g0c.m4500a("Can't parse DLNA flags integer from: ", str);
        } else {
            setValue(enumSetNoneOf);
        }
    }

    public DLNAFlagsAttribute() {
        setValue(EnumSet.noneOf(DLNAFlags.class));
    }
}
