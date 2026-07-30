package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ECPrivateKeyParameters extends ECKeyParameters {

    /* JADX INFO: renamed from: d */
    BigInteger f10336d;

    public ECPrivateKeyParameters(BigInteger bigInteger, ECDomainParameters eCDomainParameters) {
        super(true, eCDomainParameters);
        this.f10336d = bigInteger;
    }

    public BigInteger getD() {
        return this.f10336d;
    }
}
