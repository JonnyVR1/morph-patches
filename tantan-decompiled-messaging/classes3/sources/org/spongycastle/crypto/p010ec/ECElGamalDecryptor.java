package org.spongycastle.crypto.p010ec;

import l.ig3;
import l.qkq0;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.math.p012ec.ECPoint;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ECElGamalDecryptor implements ECDecryptor {
    private ECPrivateKeyParameters key;

    @Override // org.spongycastle.crypto.p010ec.ECDecryptor
    public ECPoint decrypt(ECPair eCPair) {
        if (this.key != null) {
            return eCPair.getY().subtract(eCPair.getX().multiply(this.key.getD())).normalize();
        }
        qkq0.a("ECElGamalDecryptor not initialised");
        return null;
    }

    @Override // org.spongycastle.crypto.p010ec.ECDecryptor
    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ECPrivateKeyParameters) {
            this.key = (ECPrivateKeyParameters) cipherParameters;
        } else {
            ig3.a("ECPrivateKeyParameters are required for decryption.");
        }
    }
}
