package org.spongycastle.math.p131ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ReferenceMultiplier extends AbstractECMultiplier {
    @Override // org.spongycastle.math.p131ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        return ECAlgorithms.referenceMultiply(eCPoint, bigInteger);
    }
}
