package org.spongycastle.pqc.crypto;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Signer;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ParametersWithRandom;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class DigestingMessageSigner implements Signer {
    private boolean forSigning;
    private final Digest messDigest;
    private final MessageSigner messSigner;

    public DigestingMessageSigner(MessageSigner messageSigner, Digest digest) {
        this.messSigner = messageSigner;
        this.messDigest = digest;
    }

    @Override // org.spongycastle.crypto.Signer
    public byte[] generateSignature() {
        if (!this.forSigning) {
            wtq0.m207906a("RainbowDigestSigner not initialised for signature generation.");
            return null;
        }
        byte[] bArr = new byte[this.messDigest.getDigestSize()];
        this.messDigest.doFinal(bArr, 0);
        return this.messSigner.generateSignature(bArr);
    }

    @Override // org.spongycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forSigning = z;
        AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof ParametersWithRandom ? (AsymmetricKeyParameter) ((ParametersWithRandom) cipherParameters).getParameters() : (AsymmetricKeyParameter) cipherParameters;
        if (z && !asymmetricKeyParameter.isPrivate()) {
            wg3.m206174a("Signing Requires Private Key.");
        } else if (!z && asymmetricKeyParameter.isPrivate()) {
            wg3.m206174a("Verification Requires Public Key.");
        } else {
            reset();
            this.messSigner.init(z, cipherParameters);
        }
    }

    @Override // org.spongycastle.crypto.Signer
    public void reset() {
        this.messDigest.reset();
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte b) {
        this.messDigest.update(b);
    }

    public boolean verify(byte[] bArr) {
        if (this.forSigning) {
            wtq0.m207906a("RainbowDigestSigner not initialised for verification");
            return false;
        }
        byte[] bArr2 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.doFinal(bArr2, 0);
        return this.messSigner.verifySignature(bArr2, bArr);
    }

    @Override // org.spongycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        return verify(bArr);
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.messDigest.update(bArr, i, i2);
    }
}
