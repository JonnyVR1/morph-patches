package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;
import org.spongycastle.crypto.signers.DSASigner;
import org.spongycastle.crypto.signers.HMacDSAKCalculator;

/* JADX INFO: loaded from: classes3.dex */
public class TlsDSSSigner extends TlsDSASigner {
    @Override // org.spongycastle.crypto.tls.TlsDSASigner
    public DSA createDSAImpl(short s) {
        return new DSASigner(new HMacDSAKCalculator(TlsUtils.createHash(s)));
    }

    @Override // org.spongycastle.crypto.tls.TlsDSASigner
    public short getSignatureAlgorithm() {
        return (short) 2;
    }

    @Override // org.spongycastle.crypto.tls.TlsSigner
    public boolean isValidPublicKey(AsymmetricKeyParameter asymmetricKeyParameter) {
        return asymmetricKeyParameter instanceof DSAPublicKeyParameters;
    }
}
