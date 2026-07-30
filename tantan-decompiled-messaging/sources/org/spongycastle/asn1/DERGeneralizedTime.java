package org.spongycastle.asn1;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class DERGeneralizedTime extends ASN1GeneralizedTime {
    public DERGeneralizedTime(byte[] bArr) {
        super(bArr);
    }

    public DERGeneralizedTime(Date date) {
        super(date);
    }

    public DERGeneralizedTime(String str) {
        super(str);
    }
}
