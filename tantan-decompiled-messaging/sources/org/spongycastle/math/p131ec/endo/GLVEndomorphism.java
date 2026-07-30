package org.spongycastle.math.p131ec.endo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public interface GLVEndomorphism extends ECEndomorphism {
    BigInteger[] decomposeScalar(BigInteger bigInteger);
}
