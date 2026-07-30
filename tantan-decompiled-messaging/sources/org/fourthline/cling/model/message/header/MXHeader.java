package org.fourthline.cling.model.message.header;

import p149l.kow;

/* JADX INFO: loaded from: classes3.dex */
public class MXHeader extends UpnpHeader<Integer> {
    public static final Integer DEFAULT_VALUE = 3;

    public MXHeader() {
        setValue(DEFAULT_VALUE);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        try {
            int i = Integer.parseInt(str);
            Integer numValueOf = Integer.valueOf(i);
            if (i < 0 || i > 120) {
                setValue(DEFAULT_VALUE);
            } else {
                setValue(numValueOf);
            }
        } catch (Exception unused) {
            kow.m146757a("Can't parse MX seconds integer from: ", str);
        }
    }

    public MXHeader(Integer num) {
        setValue(num);
    }
}
