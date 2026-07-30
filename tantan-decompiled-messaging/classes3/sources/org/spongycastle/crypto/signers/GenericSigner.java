package org.spongycastle.crypto.signers;

import l.ig3;
import l.qkq0;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Signer;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GenericSigner implements Signer {
    private final Digest digest;
    private final AsymmetricBlockCipher engine;
    private boolean forSigning;

    public GenericSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this.engine = asymmetricBlockCipher;
        this.digest = digest;
    }

    @Override // org.spongycastle.crypto.Signer
    public byte[] generateSignature() throws DataLengthException, CryptoException {
        if (!this.forSigning) {
            qkq0.a("GenericSigner not initialised for signature generation.");
            return null;
        }
        int digestSize = this.digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        this.digest.doFinal(bArr, 0);
        return this.engine.processBlock(bArr, 0, digestSize);
    }

    @Override // org.spongycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forSigning = z;
        AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof ParametersWithRandom ? (AsymmetricKeyParameter) ((ParametersWithRandom) cipherParameters).getParameters() : (AsymmetricKeyParameter) cipherParameters;
        if (z && !asymmetricKeyParameter.isPrivate()) {
            ig3.a("signing requires private key");
        } else if (!z && asymmetricKeyParameter.isPrivate()) {
            ig3.a("verification requires public key");
        } else {
            reset();
            this.engine.init(z, cipherParameters);
        }
    }

    @Override // org.spongycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte b) {
        this.digest.update(b);
    }

    @Override // org.spongycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (this.forSigning) {
            qkq0.a("GenericSigner not initialised for verification");
            return false;
        }
        int digestSize = this.digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        this.digest.doFinal(bArr2, 0);
        try {
            byte[] bArrProcessBlock = this.engine.processBlock(bArr, 0, bArr.length);
            if (bArrProcessBlock.length < digestSize) {
                byte[] bArr3 = new byte[digestSize];
                System.arraycopy(bArrProcessBlock, 0, bArr3, digestSize - bArrProcessBlock.length, bArrProcessBlock.length);
                bArrProcessBlock = bArr3;
            }
            return Arrays.constantTimeAreEqual(bArrProcessBlock, bArr2);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }
}
