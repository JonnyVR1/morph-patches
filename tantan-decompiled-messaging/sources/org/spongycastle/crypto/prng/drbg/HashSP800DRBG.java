package org.spongycastle.crypto.prng.drbg;

import java.util.Hashtable;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.prng.EntropySource;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class HashSP800DRBG implements SP80090DRBG {
    private static final int MAX_BITS_REQUEST = 262144;
    private static final byte[] ONE = {1};
    private static final long RESEED_MAX = 140737488355328L;
    private static final Hashtable seedlens;

    /* JADX INFO: renamed from: _C */
    private byte[] f206759_C;

    /* JADX INFO: renamed from: _V */
    private byte[] f206760_V;
    private Digest _digest;
    private EntropySource _entropySource;
    private long _reseedCounter;
    private int _securityStrength;
    private int _seedLength;

    static {
        Hashtable hashtable = new Hashtable();
        seedlens = hashtable;
        hashtable.put("SHA-1", Integers.valueOf(440));
        hashtable.put("SHA-224", Integers.valueOf(440));
        hashtable.put("SHA-256", Integers.valueOf(440));
        hashtable.put("SHA-512/256", Integers.valueOf(440));
        hashtable.put("SHA-512/224", Integers.valueOf(440));
        hashtable.put("SHA-384", Integers.valueOf(888));
        hashtable.put("SHA-512", Integers.valueOf(888));
    }

    public HashSP800DRBG(Digest digest, int i, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        if (i > Utils.getMaxSecurityStrength(digest)) {
            ig3.m135964a("Requested security strength is not supported by the derivation function");
            throw null;
        }
        if (entropySource.entropySize() < i) {
            ig3.m135964a("Not enough entropy for security strength required");
            throw null;
        }
        this._digest = digest;
        this._entropySource = entropySource;
        this._securityStrength = i;
        this._seedLength = ((Integer) seedlens.get(digest.getAlgorithmName())).intValue();
        byte[] bArrHash_df = Utils.hash_df(this._digest, Arrays.concatenate(getEntropy(), bArr2, bArr), this._seedLength);
        this.f206760_V = bArrHash_df;
        byte[] bArr3 = new byte[bArrHash_df.length + 1];
        System.arraycopy(bArrHash_df, 0, bArr3, 1, bArrHash_df.length);
        this.f206759_C = Utils.hash_df(this._digest, bArr3, this._seedLength);
        this._reseedCounter = 1L;
    }

    private void addTo(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 1; i2 <= bArr2.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & 255) + (bArr2[bArr2.length - i2] & 255) + i;
            i = i3 > 255 ? 1 : 0;
            bArr[bArr.length - i2] = (byte) i3;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i4 = (bArr[bArr.length - length] & 255) + i;
            i = i4 > 255 ? 1 : 0;
            bArr[bArr.length - length] = (byte) i4;
        }
    }

    private void doHash(byte[] bArr, byte[] bArr2) {
        this._digest.update(bArr, 0, bArr.length);
        this._digest.doFinal(bArr2, 0);
    }

    private byte[] getEntropy() {
        byte[] entropy = this._entropySource.getEntropy();
        if (entropy.length >= (this._securityStrength + 7) / 8) {
            return entropy;
        }
        qkq0.m175383a("Insufficient entropy provided by entropy source");
        return null;
    }

    private byte[] hash(byte[] bArr) {
        byte[] bArr2 = new byte[this._digest.getDigestSize()];
        doHash(bArr, bArr2);
        return bArr2;
    }

    private byte[] hashgen(byte[] bArr, int i) {
        int i2 = i / 8;
        int digestSize = i2 / this._digest.getDigestSize();
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[i2];
        int digestSize2 = this._digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        for (int i3 = 0; i3 <= digestSize; i3++) {
            doHash(bArr2, bArr4);
            int i4 = i3 * digestSize2;
            int i5 = i2 - i4;
            if (i5 > digestSize2) {
                i5 = digestSize2;
            }
            System.arraycopy(bArr4, 0, bArr3, i4, i5);
            addTo(bArr2, ONE);
        }
        return bArr3;
    }

    @Override // org.spongycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            ig3.m135964a("Number of bits per request limited to 262144");
            return 0;
        }
        if (this._reseedCounter > RESEED_MAX) {
            return -1;
        }
        if (z) {
            reseed(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            byte[] bArr3 = this.f206760_V;
            byte[] bArr4 = new byte[bArr3.length + 1 + bArr2.length];
            bArr4[0] = 2;
            System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
            System.arraycopy(bArr2, 0, bArr4, this.f206760_V.length + 1, bArr2.length);
            addTo(this.f206760_V, hash(bArr4));
        }
        byte[] bArrHashgen = hashgen(this.f206760_V, length);
        byte[] bArr5 = this.f206760_V;
        byte[] bArr6 = new byte[bArr5.length + 1];
        System.arraycopy(bArr5, 0, bArr6, 1, bArr5.length);
        bArr6[0] = 3;
        addTo(this.f206760_V, hash(bArr6));
        addTo(this.f206760_V, this.f206759_C);
        long j = this._reseedCounter;
        addTo(this.f206760_V, new byte[]{(byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j});
        this._reseedCounter++;
        System.arraycopy(bArrHashgen, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // org.spongycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this._digest.getDigestSize() * 8;
    }

    @Override // org.spongycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        byte[] bArrHash_df = Utils.hash_df(this._digest, Arrays.concatenate(ONE, this.f206760_V, getEntropy(), bArr), this._seedLength);
        this.f206760_V = bArrHash_df;
        byte[] bArr2 = new byte[bArrHash_df.length + 1];
        bArr2[0] = 0;
        System.arraycopy(bArrHash_df, 0, bArr2, 1, bArrHash_df.length);
        this.f206759_C = Utils.hash_df(this._digest, bArr2, this._seedLength);
        this._reseedCounter = 1L;
    }
}
