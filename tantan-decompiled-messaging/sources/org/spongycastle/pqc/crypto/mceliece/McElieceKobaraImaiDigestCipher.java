package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.pqc.crypto.MessageEncryptor;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class McElieceKobaraImaiDigestCipher {
    private boolean forEncrypting;
    private final MessageEncryptor mcElieceCCA2Cipher;
    private final Digest messDigest;

    public McElieceKobaraImaiDigestCipher(MessageEncryptor messageEncryptor, Digest digest) {
        this.mcElieceCCA2Cipher = messageEncryptor;
        this.messDigest = digest;
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        this.forEncrypting = z;
        AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof ParametersWithRandom ? (AsymmetricKeyParameter) ((ParametersWithRandom) cipherParameters).getParameters() : (AsymmetricKeyParameter) cipherParameters;
        if (z && asymmetricKeyParameter.isPrivate()) {
            ig3.m135964a("Encrypting Requires Public Key.");
        } else if (!z && !asymmetricKeyParameter.isPrivate()) {
            ig3.m135964a("Decrypting Requires Private Key.");
        } else {
            reset();
            this.mcElieceCCA2Cipher.init(z, cipherParameters);
        }
    }

    public byte[] messageDecrypt(byte[] bArr) {
        if (this.forEncrypting) {
            qkq0.m175383a("McElieceKobaraImaiDigestCipher not initialised for decrypting.");
            return null;
        }
        try {
            return this.mcElieceCCA2Cipher.messageDecrypt(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] messageEncrypt() {
        if (!this.forEncrypting) {
            qkq0.m175383a("McElieceKobaraImaiDigestCipher not initialised for encrypting.");
            return null;
        }
        byte[] bArr = new byte[this.messDigest.getDigestSize()];
        this.messDigest.doFinal(bArr, 0);
        try {
            return this.mcElieceCCA2Cipher.messageEncrypt(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void reset() {
        this.messDigest.reset();
    }

    public void update(byte b) {
        this.messDigest.update(b);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.messDigest.update(bArr, i, i2);
    }
}
