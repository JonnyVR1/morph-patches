package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class SSL3Mac implements Mac {
    private Digest digest;
    private int padLength;
    private byte[] secret;
    private static final byte IPAD_BYTE = 54;
    static final byte[] IPAD = genPad(IPAD_BYTE, 48);
    private static final byte OPAD_BYTE = 92;
    static final byte[] OPAD = genPad(OPAD_BYTE, 48);

    public SSL3Mac(Digest digest) {
        this.digest = digest;
        if (digest.getDigestSize() == 20) {
            this.padLength = 40;
        } else {
            this.padLength = 48;
        }
    }

    private static byte[] genPad(byte b, int i) {
        byte[] bArr = new byte[i];
        Arrays.fill(bArr, b);
        return bArr;
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        int digestSize = this.digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        this.digest.doFinal(bArr2, 0);
        Digest digest = this.digest;
        byte[] bArr3 = this.secret;
        digest.update(bArr3, 0, bArr3.length);
        this.digest.update(OPAD, 0, this.padLength);
        this.digest.update(bArr2, 0, digestSize);
        int iDoFinal = this.digest.doFinal(bArr, i);
        reset();
        return iDoFinal;
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.digest.getAlgorithmName() + "/SSL3MAC";
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return this.digest.getDigestSize();
    }

    public Digest getUnderlyingDigest() {
        return this.digest;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        this.secret = Arrays.clone(((KeyParameter) cipherParameters).getKey());
        reset();
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        this.digest.reset();
        Digest digest = this.digest;
        byte[] bArr = this.secret;
        digest.update(bArr, 0, bArr.length);
        this.digest.update(IPAD, 0, this.padLength);
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b) {
        this.digest.update(b);
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }
}
