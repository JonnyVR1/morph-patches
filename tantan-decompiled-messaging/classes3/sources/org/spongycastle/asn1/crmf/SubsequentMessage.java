package org.spongycastle.asn1.crmf;

import org.spongycastle.asn1.ASN1Integer;
import p003l.k250;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
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
        k250.m5546a("unknown value: ", i);
        return null;
    }
}
