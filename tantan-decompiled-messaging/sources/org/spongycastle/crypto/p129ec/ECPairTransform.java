package org.spongycastle.crypto.p129ec;

import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public interface ECPairTransform {
    void init(CipherParameters cipherParameters);

    ECPair transform(ECPair eCPair);
}
