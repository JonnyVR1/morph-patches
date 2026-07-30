package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Pack;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class SipHash implements Mac {

    /* JADX INFO: renamed from: c */
    protected final int f206637c;

    /* JADX INFO: renamed from: d */
    protected final int f206638d;

    /* JADX INFO: renamed from: k0 */
    protected long f206639k0;

    /* JADX INFO: renamed from: k1 */
    protected long f206640k1;

    /* JADX INFO: renamed from: m */
    protected long f206641m;

    /* JADX INFO: renamed from: v0 */
    protected long f206642v0;

    /* JADX INFO: renamed from: v1 */
    protected long f206643v1;

    /* JADX INFO: renamed from: v2 */
    protected long f206644v2;

    /* JADX INFO: renamed from: v3 */
    protected long f206645v3;
    protected int wordCount;
    protected int wordPos;

    public SipHash() {
        this.f206641m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f206637c = 2;
        this.f206638d = 4;
    }

    public static long rotateLeft(long j, int i) {
        return (j >>> (-i)) | (j << i);
    }

    public void applySipRounds(int i) {
        long jRotateLeft = this.f206642v0;
        long jRotateLeft2 = this.f206643v1;
        long jRotateLeft3 = this.f206644v2;
        long jRotateLeft4 = this.f206645v3;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jRotateLeft + jRotateLeft2;
            long j2 = jRotateLeft3 + jRotateLeft4;
            long jRotateLeft5 = rotateLeft(jRotateLeft2, 13) ^ j;
            long jRotateLeft6 = rotateLeft(jRotateLeft4, 16) ^ j2;
            long j3 = j2 + jRotateLeft5;
            jRotateLeft = rotateLeft(j, 32) + jRotateLeft6;
            jRotateLeft2 = rotateLeft(jRotateLeft5, 17) ^ j3;
            jRotateLeft4 = rotateLeft(jRotateLeft6, 21) ^ jRotateLeft;
            jRotateLeft3 = rotateLeft(j3, 32);
        }
        this.f206642v0 = jRotateLeft;
        this.f206643v1 = jRotateLeft2;
        this.f206644v2 = jRotateLeft3;
        this.f206645v3 = jRotateLeft4;
    }

    public long doFinal() throws IllegalStateException, DataLengthException {
        long j = this.f206641m;
        int i = this.wordPos;
        this.f206641m = ((j >>> ((7 - i) << 3)) >>> 8) | ((((long) ((this.wordCount << 3) + i)) & 255) << 56);
        processMessageWord();
        this.f206644v2 ^= 255;
        applySipRounds(this.f206638d);
        long j2 = ((this.f206642v0 ^ this.f206643v1) ^ this.f206644v2) ^ this.f206645v3;
        reset();
        return j2;
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash-" + this.f206637c + "-" + this.f206638d;
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            ig3.m135964a("'params' must be an instance of KeyParameter");
            return;
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            ig3.m135964a("'params' must be a 128-bit key");
            return;
        }
        this.f206639k0 = Pack.littleEndianToLong(key, 0);
        this.f206640k1 = Pack.littleEndianToLong(key, 8);
        reset();
    }

    public void processMessageWord() {
        this.wordCount++;
        this.f206645v3 ^= this.f206641m;
        applySipRounds(this.f206637c);
        this.f206642v0 ^= this.f206641m;
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        long j = this.f206639k0;
        this.f206642v0 = 8317987319222330741L ^ j;
        long j2 = this.f206640k1;
        this.f206643v1 = 7237128888997146477L ^ j2;
        this.f206644v2 = j ^ 7816392313619706465L;
        this.f206645v3 = 8387220255154660723L ^ j2;
        this.f206641m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws IllegalStateException, DataLengthException {
        int i3 = i2 & (-8);
        int i4 = this.wordPos;
        char c = '8';
        long j = 255;
        int i5 = 0;
        if (i4 == 0) {
            while (i5 < i3) {
                this.f206641m = Pack.littleEndianToLong(bArr, i + i5);
                processMessageWord();
                i5 += 8;
            }
            while (i5 < i2) {
                long j2 = this.f206641m >>> 8;
                this.f206641m = j2;
                this.f206641m = j2 | ((((long) bArr[i + i5]) & 255) << 56);
                i5++;
            }
            this.wordPos = i2 - i3;
            return;
        }
        int i6 = i4 << 3;
        int i7 = 0;
        while (i7 < i3) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i + i7);
            this.f206641m = (this.f206641m >>> (-i6)) | (jLittleEndianToLong << i6);
            processMessageWord();
            this.f206641m = jLittleEndianToLong;
            i7 += 8;
            c = c;
            j = j;
        }
        char c2 = c;
        long j3 = j;
        while (i7 < i2) {
            long j4 = this.f206641m >>> 8;
            this.f206641m = j4;
            this.f206641m = j4 | ((((long) bArr[i + i7]) & j3) << c2);
            int i8 = this.wordPos + 1;
            this.wordPos = i8;
            if (i8 == 8) {
                processMessageWord();
                this.wordPos = 0;
            }
            i7++;
        }
    }

    public SipHash(int i, int i2) {
        this.f206641m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f206637c = i;
        this.f206638d = i2;
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        Pack.longToLittleEndian(doFinal(), bArr, i);
        return 8;
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b) throws IllegalStateException {
        this.f206641m = (this.f206641m >>> 8) | ((((long) b) & 255) << 56);
        int i = this.wordPos + 1;
        this.wordPos = i;
        if (i == 8) {
            processMessageWord();
            this.wordPos = 0;
        }
    }
}
