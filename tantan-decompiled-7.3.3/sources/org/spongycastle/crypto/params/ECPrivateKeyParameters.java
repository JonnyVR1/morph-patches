package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ECPrivateKeyParameters extends ECKeyParameters {

    /* JADX INFO: renamed from: d */
    BigInteger f207633d;

    public ECPrivateKeyParameters(BigInteger bigInteger, ECDomainParameters eCDomainParameters) {
        super(true, eCDomainParameters);
        this.f207633d = bigInteger;
    }

    public BigInteger getD() {
        return this.f207633d;
    }
}
