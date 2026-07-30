package org.spongycastle.crypto.p129ec;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.math.p131ec.ECPoint;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class ECElGamalDecryptor implements ECDecryptor {
    private ECPrivateKeyParameters key;

    @Override // org.spongycastle.crypto.p129ec.ECDecryptor
    public ECPoint decrypt(ECPair eCPair) {
        if (this.key != null) {
            return eCPair.getY().subtract(eCPair.getX().multiply(this.key.getD())).normalize();
        }
        qkq0.m175383a("ECElGamalDecryptor not initialised");
        return null;
    }

    @Override // org.spongycastle.crypto.p129ec.ECDecryptor
    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ECPrivateKeyParameters) {
            this.key = (ECPrivateKeyParameters) cipherParameters;
        } else {
            ig3.m135964a("ECPrivateKeyParameters are required for decryption.");
        }
    }
}
