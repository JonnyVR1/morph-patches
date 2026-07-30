package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ECPrivateKeyParameters extends ECKeyParameters {

    /* JADX INFO: renamed from: d */
    BigInteger f206711d;

    public ECPrivateKeyParameters(BigInteger bigInteger, ECDomainParameters eCDomainParameters) {
        super(true, eCDomainParameters);
        this.f206711d = bigInteger;
    }

    public BigInteger getD() {
        return this.f206711d;
    }
}
