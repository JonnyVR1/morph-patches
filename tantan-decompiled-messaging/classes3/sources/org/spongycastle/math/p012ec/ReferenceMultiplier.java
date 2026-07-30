package org.spongycastle.math.p012ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ReferenceMultiplier extends AbstractECMultiplier {
    @Override // org.spongycastle.math.p012ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        return ECAlgorithms.referenceMultiply(eCPoint, bigInteger);
    }
}
