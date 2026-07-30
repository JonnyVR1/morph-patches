package org.spongycastle.crypto.params;

import org.spongycastle.math.p135ec.ECPoint;

/* JADX INFO: loaded from: classes3.dex */
public class ECPublicKeyParameters extends ECKeyParameters {

    /* JADX INFO: renamed from: Q */
    ECPoint f207634Q;

    public ECPublicKeyParameters(ECPoint eCPoint, ECDomainParameters eCDomainParameters) {
        super(false, eCDomainParameters);
        this.f207634Q = eCPoint.normalize();
    }

    public ECPoint getQ() {
        return this.f207634Q;
    }
}
