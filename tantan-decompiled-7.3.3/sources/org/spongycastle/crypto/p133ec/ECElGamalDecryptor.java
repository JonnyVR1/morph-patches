package org.spongycastle.crypto.p133ec;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.math.p135ec.ECPoint;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class ECElGamalDecryptor implements ECDecryptor {
    private ECPrivateKeyParameters key;

    @Override // org.spongycastle.crypto.p133ec.ECDecryptor
    public ECPoint decrypt(ECPair eCPair) {
        if (this.key != null) {
            return eCPair.getY().subtract(eCPair.getX().multiply(this.key.getD())).normalize();
        }
        wtq0.m207906a("ECElGamalDecryptor not initialised");
        return null;
    }

    @Override // org.spongycastle.crypto.p133ec.ECDecryptor
    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ECPrivateKeyParameters) {
            this.key = (ECPrivateKeyParameters) cipherParameters;
        } else {
            wg3.m206174a("ECPrivateKeyParameters are required for decryption.");
        }
    }
}
