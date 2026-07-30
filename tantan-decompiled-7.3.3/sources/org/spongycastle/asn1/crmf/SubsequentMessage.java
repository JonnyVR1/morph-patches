package org.spongycastle.asn1.crmf;

import org.spongycastle.asn1.ASN1Integer;
import p153l.za50;

/* JADX INFO: loaded from: classes3.dex */
public class SubsequentMessage extends ASN1Integer {
    public static final SubsequentMessage encrCert = new SubsequentMessage(0);
    public static final SubsequentMessage challengeResp = new SubsequentMessage(1);

    private SubsequentMessage(int i) {
        super(i);
    }

    public static SubsequentMessage valueOf(int i) {
        if (i == 0) {
            return encrCert;
        }
        if (i == 1) {
            return challengeResp;
        }
        za50.m219101a("unknown value: ", i);
        return null;
    }
}
