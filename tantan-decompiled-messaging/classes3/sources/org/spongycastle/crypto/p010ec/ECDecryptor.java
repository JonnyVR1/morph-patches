package org.spongycastle.crypto.p010ec;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.math.p012ec.ECPoint;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface ECDecryptor {
    ECPoint decrypt(ECPair eCPair);

    void init(CipherParameters cipherParameters);
}
