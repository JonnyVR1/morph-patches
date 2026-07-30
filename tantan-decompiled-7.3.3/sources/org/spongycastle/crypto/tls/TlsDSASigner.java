package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.Signer;
import org.spongycastle.crypto.digests.NullDigest;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.signers.DSADigestSigner;
import p153l.wpg0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TlsDSASigner extends AbstractTlsSigner {
    public abstract DSA createDSAImpl(short s);

    @Override // org.spongycastle.crypto.tls.TlsSigner
    public Signer createSigner(SignatureAndHashAlgorithm signatureAndHashAlgorithm, AsymmetricKeyParameter asymmetricKeyParameter) {
        return makeSigner(signatureAndHashAlgorithm, false, true, asymmetricKeyParameter);
    }

    @Override // org.spongycastle.crypto.tls.TlsSigner
    public Signer createVerifyer(SignatureAndHashAlgorithm signatureAndHashAlgorithm, AsymmetricKeyParameter asymmetricKeyParameter) {
        return makeSigner(signatureAndHashAlgorithm, false, false, asymmetricKeyParameter);
    }

    @Override // org.spongycastle.crypto.tls.TlsSigner
    public byte[] generateRawSignature(SignatureAndHashAlgorithm signatureAndHashAlgorithm, AsymmetricKeyParameter asymmetricKeyParameter, byte[] bArr) throws CryptoException {
        Signer signerMakeSigner = makeSigner(signatureAndHashAlgorithm, true, true, new ParametersWithRandom(asymmetricKeyParameter, this.context.getSecureRandom()));
        if (signatureAndHashAlgorithm == null) {
            signerMakeSigner.update(bArr, 16, 20);
        } else {
            signerMakeSigner.update(bArr, 0, bArr.length);
        }
        return signerMakeSigner.generateSignature();
    }

    public abstract short getSignatureAlgorithm();

    public CipherParameters makeInitParameters(boolean z, CipherParameters cipherParameters) {
        return cipherParameters;
    }

    public Signer makeSigner(SignatureAndHashAlgorithm signatureAndHashAlgorithm, boolean z, boolean z2, CipherParameters cipherParameters) {
        if ((signatureAndHashAlgorithm != null) != TlsUtils.isTLSv12(this.context)) {
            wpg0.m207458a();
            return null;
        }
        if (signatureAndHashAlgorithm != null && signatureAndHashAlgorithm.getSignature() != getSignatureAlgorithm()) {
            wpg0.m207458a();
            return null;
        }
        short hash = signatureAndHashAlgorithm == null ? (short) 2 : signatureAndHashAlgorithm.getHash();
        DSADigestSigner dSADigestSigner = new DSADigestSigner(createDSAImpl(hash), z ? new NullDigest() : TlsUtils.createHash(hash));
        dSADigestSigner.init(z2, makeInitParameters(z2, cipherParameters));
        return dSADigestSigner;
    }

    @Override // org.spongycastle.crypto.tls.TlsSigner
    public boolean verifyRawSignature(SignatureAndHashAlgorithm signatureAndHashAlgorithm, byte[] bArr, AsymmetricKeyParameter asymmetricKeyParameter, byte[] bArr2) throws CryptoException {
        Signer signerMakeSigner = makeSigner(signatureAndHashAlgorithm, true, false, asymmetricKeyParameter);
        if (signatureAndHashAlgorithm == null) {
            signerMakeSigner.update(bArr2, 16, 20);
        } else {
            signerMakeSigner.update(bArr2, 0, bArr2.length);
        }
        return signerMakeSigner.verifySignature(bArr);
    }
}
