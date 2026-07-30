package org.spongycastle.crypto;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface DSA {
    BigInteger[] generateSignature(byte[] bArr);

    void init(boolean z, CipherParameters cipherParameters);

    boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2);
}
