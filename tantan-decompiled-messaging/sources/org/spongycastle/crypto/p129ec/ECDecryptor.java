package org.spongycastle.crypto.p129ec;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.math.p131ec.ECPoint;

/* JADX INFO: loaded from: classes3.dex */
public interface ECDecryptor {
    ECPoint decrypt(ECPair eCPair);

    void init(CipherParameters cipherParameters);
}
