package org.spongycastle.crypto.tls;

import l.ohg0;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Signer;
import org.spongycastle.crypto.digests.NullDigest;
import org.spongycastle.crypto.encodings.PKCS1Encoding;
import org.spongycastle.crypto.engines.RSABlindedEngine;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.signers.GenericSigner;
import org.spongycastle.crypto.signers.RSADigestSigner;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TlsRSASigner extends AbstractTlsSigner {
    public AsymmetricBlockCipher createRSAImpl() {
        return new PKCS1Encoding(new RSABlindedEngine());
    }

    @Override // org.spongycastle.crypto.tls.TlsSigner
    public Signer createSigner(SignatureAndHashAlgorithm signatureAndHashAlgorithm, AsymmetricKeyParameter asymmetricKeyParameter) {
        return makeSigner(signatureAndHashAlgorithm, false, true, new ParametersWithRandom(asymmetricKeyParameter, this.context.getSecureRandom()));
    }

    @Override // org.spongycastle.crypto.tls.TlsSigner
    public Signer createVerifyer(SignatureAndHashAlgorithm signatureAndHashAlgorithm, AsymmetricKeyParameter asymmetricKeyParameter) {
        return makeSigner(signatureAndHashAlgorithm, false, false, asymmetricKeyParameter);
    }

    @Override // org.spongycastle.crypto.tls.TlsSigner
    public byte[] generateRawSignature(SignatureAndHashAlgorithm signatureAndHashAlgorithm, AsymmetricKeyParameter asymmetricKeyParameter, byte[] bArr) throws CryptoException {
        Signer signerMakeSigner = makeSigner(signatureAndHashAlgorithm, true, true, new ParametersWithRandom(asymmetricKeyParameter, this.context.getSecureRandom()));
        signerMakeSigner.update(bArr, 0, bArr.length);
        return signerMakeSigner.generateSignature();
    }

    @Override // org.spongycastle.crypto.tls.TlsSigner
    public boolean isValidPublicKey(AsymmetricKeyParameter asymmetricKeyParameter) {
        return (asymmetricKeyParameter instanceof RSAKeyParameters) && !asymmetricKeyParameter.isPrivate();
    }

    public Signer makeSigner(SignatureAndHashAlgorithm signatureAndHashAlgorithm, boolean z, boolean z2, CipherParameters cipherParameters) {
        Digest combinedHash;
        if ((signatureAndHashAlgorithm != null) != TlsUtils.isTLSv12(this.context)) {
            ohg0.a();
            return null;
        }
        if (signatureAndHashAlgorithm != null && signatureAndHashAlgorithm.getSignature() != 1) {
            ohg0.a();
            return null;
        }
        if (z) {
            combinedHash = new NullDigest();
        } else {
            combinedHash = signatureAndHashAlgorithm == null ? new CombinedHash() : TlsUtils.createHash(signatureAndHashAlgorithm.getHash());
        }
        Signer rSADigestSigner = signatureAndHashAlgorithm != null ? new RSADigestSigner(combinedHash, TlsUtils.getOIDForHashAlgorithm(signatureAndHashAlgorithm.getHash())) : new GenericSigner(createRSAImpl(), combinedHash);
        rSADigestSigner.init(z2, cipherParameters);
        return rSADigestSigner;
    }

    @Override // org.spongycastle.crypto.tls.TlsSigner
    public boolean verifyRawSignature(SignatureAndHashAlgorithm signatureAndHashAlgorithm, byte[] bArr, AsymmetricKeyParameter asymmetricKeyParameter, byte[] bArr2) throws CryptoException {
        Signer signerMakeSigner = makeSigner(signatureAndHashAlgorithm, true, false, asymmetricKeyParameter);
        signerMakeSigner.update(bArr2, 0, bArr2.length);
        return signerMakeSigner.verifySignature(bArr);
    }
}
