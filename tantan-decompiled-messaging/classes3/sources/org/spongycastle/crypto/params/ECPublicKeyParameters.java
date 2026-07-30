package org.spongycastle.crypto.params;

import org.spongycastle.math.p012ec.ECPoint;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ECPublicKeyParameters extends ECKeyParameters {

    /* JADX INFO: renamed from: Q */
    ECPoint f10337Q;

    public ECPublicKeyParameters(ECPoint eCPoint, ECDomainParameters eCDomainParameters) {
        super(false, eCDomainParameters);
        this.f10337Q = eCPoint.normalize();
    }

    public ECPoint getQ() {
        return this.f10337Q;
    }
}
