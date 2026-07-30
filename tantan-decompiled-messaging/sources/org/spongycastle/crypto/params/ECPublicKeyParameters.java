package org.spongycastle.crypto.params;

import org.spongycastle.math.p131ec.ECPoint;

/* JADX INFO: loaded from: classes3.dex */
public class ECPublicKeyParameters extends ECKeyParameters {

    /* JADX INFO: renamed from: Q */
    ECPoint f206712Q;

    public ECPublicKeyParameters(ECPoint eCPoint, ECDomainParameters eCDomainParameters) {
        super(false, eCDomainParameters);
        this.f206712Q = eCPoint.normalize();
    }

    public ECPoint getQ() {
        return this.f206712Q;
    }
}
