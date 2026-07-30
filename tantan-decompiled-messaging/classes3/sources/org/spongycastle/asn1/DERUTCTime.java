package org.spongycastle.asn1;

import java.util.Date;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DERUTCTime extends ASN1UTCTime {
    public DERUTCTime(byte[] bArr) {
        super(bArr);
    }

    public DERUTCTime(Date date) {
        super(date);
    }

    public DERUTCTime(String str) {
        super(str);
    }
}
