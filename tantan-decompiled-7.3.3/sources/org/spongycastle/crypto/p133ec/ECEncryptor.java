package org.spongycastle.crypto.p133ec;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.math.p135ec.ECPoint;

/* JADX INFO: loaded from: classes3.dex */
public interface ECEncryptor {
    ECPair encrypt(ECPoint eCPoint);

    void init(CipherParameters cipherParameters);
}
