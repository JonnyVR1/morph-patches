package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LongDigest implements ExtendedDigest, Memoable, EncodableDigest {
    private static final int BYTE_LENGTH = 128;

    /* JADX INFO: renamed from: K */
    static final long[] f206380K = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* JADX INFO: renamed from: H1 */
    protected long f206381H1;

    /* JADX INFO: renamed from: H2 */
    protected long f206382H2;

    /* JADX INFO: renamed from: H3 */
    protected long f206383H3;

    /* JADX INFO: renamed from: H4 */
    protected long f206384H4;

    /* JADX INFO: renamed from: H5 */
    protected long f206385H5;

    /* JADX INFO: renamed from: H6 */
    protected long f206386H6;

    /* JADX INFO: renamed from: H7 */
    protected long f206387H7;

    /* JADX INFO: renamed from: H8 */
    protected long f206388H8;

    /* JADX INFO: renamed from: W */
    private long[] f206389W;
    private long byteCount1;
    private long byteCount2;
    private int wOff;
    private byte[] xBuf;
    private int xBufOff;

    public LongDigest() {
        this.xBuf = new byte[8];
        this.f206389W = new long[80];
        this.xBufOff = 0;
        reset();
    }

    /* JADX INFO: renamed from: Ch */
    private long m221150Ch(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    private long Maj(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    private long Sigma0(long j) {
        return (j >>> 7) ^ (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8)));
    }

    private long Sigma1(long j) {
        return (j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)));
    }

    private long Sum0(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    private long Sum1(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    private void adjustByteCounts() {
        long j = this.byteCount1;
        if (j > 2305843009213693951L) {
            this.byteCount2 += j >>> 61;
            this.byteCount1 = j & 2305843009213693951L;
        }
    }

    public void copyIn(LongDigest longDigest) {
        byte[] bArr = longDigest.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = longDigest.xBufOff;
        this.byteCount1 = longDigest.byteCount1;
        this.byteCount2 = longDigest.byteCount2;
        this.f206381H1 = longDigest.f206381H1;
        this.f206382H2 = longDigest.f206382H2;
        this.f206383H3 = longDigest.f206383H3;
        this.f206384H4 = longDigest.f206384H4;
        this.f206385H5 = longDigest.f206385H5;
        this.f206386H6 = longDigest.f206386H6;
        this.f206387H7 = longDigest.f206387H7;
        this.f206388H8 = longDigest.f206388H8;
        long[] jArr = longDigest.f206389W;
        System.arraycopy(jArr, 0, this.f206389W, 0, jArr.length);
        this.wOff = longDigest.wOff;
    }

    public void finish() {
        adjustByteCounts();
        long j = this.byteCount1 << 3;
        long j2 = this.byteCount2;
        update((byte) -128);
        while (this.xBufOff != 0) {
            update((byte) 0);
        }
        processLength(j, j2);
        processBlock();
    }

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    public int getEncodedStateSize() {
        return (this.wOff * 8) + 96;
    }

    public void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 8);
        Pack.longToBigEndian(this.byteCount1, bArr, 12);
        Pack.longToBigEndian(this.byteCount2, bArr, 20);
        Pack.longToBigEndian(this.f206381H1, bArr, 28);
        Pack.longToBigEndian(this.f206382H2, bArr, 36);
        Pack.longToBigEndian(this.f206383H3, bArr, 44);
        Pack.longToBigEndian(this.f206384H4, bArr, 52);
        Pack.longToBigEndian(this.f206385H5, bArr, 60);
        Pack.longToBigEndian(this.f206386H6, bArr, 68);
        Pack.longToBigEndian(this.f206387H7, bArr, 76);
        Pack.longToBigEndian(this.f206388H8, bArr, 84);
        Pack.intToBigEndian(this.wOff, bArr, 92);
        for (int i = 0; i < this.wOff; i++) {
            Pack.longToBigEndian(this.f206389W[i], bArr, (i * 8) + 96);
        }
    }

    public void processBlock() {
        adjustByteCounts();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.f206389W;
            long jSigma1 = Sigma1(jArr[i - 2]);
            long[] jArr2 = this.f206389W;
            jArr[i] = jSigma1 + jArr2[i - 7] + Sigma0(jArr2[i - 15]) + this.f206389W[i - 16];
        }
        long j = this.f206381H1;
        long j2 = this.f206382H2;
        long j3 = this.f206383H3;
        long j4 = this.f206384H4;
        long j5 = this.f206385H5;
        long j6 = j4;
        long j7 = this.f206386H6;
        int i2 = 0;
        int i3 = 0;
        long j8 = j3;
        long j9 = this.f206387H7;
        long j10 = this.f206388H8;
        long jSum0 = j;
        long j11 = j5;
        long j12 = j2;
        while (i2 < 10) {
            long j13 = j7;
            long j14 = j11;
            long j15 = j9;
            long jSum1 = Sum1(j11) + m221150Ch(j11, j13, j9);
            long[] jArr3 = f206380K;
            int i4 = i3 + 1;
            long j16 = j10 + jSum1 + jArr3[i3] + this.f206389W[i3];
            long j17 = j6 + j16;
            long j18 = jSum0;
            long j19 = j12;
            long j20 = j8;
            long jSum2 = j16 + Sum0(jSum0) + Maj(j18, j19, j20);
            int i5 = i3 + 2;
            long jSum3 = j15 + Sum1(j17) + m221150Ch(j17, j14, j13) + jArr3[i4] + this.f206389W[i4];
            long j21 = j20 + jSum3;
            long jSum4 = jSum3 + Sum0(jSum2) + Maj(jSum2, j18, j19);
            int i6 = i3 + 3;
            long jSum5 = j13 + Sum1(j21) + m221150Ch(j21, j17, j14) + jArr3[i5] + this.f206389W[i5];
            long j22 = j19 + jSum5;
            long jSum6 = jSum5 + Sum0(jSum4) + Maj(jSum4, jSum2, j18);
            int i7 = i3 + 4;
            long jSum7 = j14 + Sum1(j22) + m221150Ch(j22, j21, j17) + jArr3[i6] + this.f206389W[i6];
            long j23 = j18 + jSum7;
            long jSum8 = jSum7 + Sum0(jSum6) + Maj(jSum6, jSum4, jSum2);
            int i8 = i3 + 5;
            long jSum9 = j17 + Sum1(j23) + m221150Ch(j23, j22, j21) + jArr3[i7] + this.f206389W[i7];
            long j24 = jSum2 + jSum9;
            long jSum10 = jSum9 + Sum0(jSum8) + Maj(jSum8, jSum6, jSum4);
            int i9 = i3 + 6;
            long jSum11 = j21 + Sum1(j24) + m221150Ch(j24, j23, j22) + jArr3[i8] + this.f206389W[i8];
            long j25 = jSum4 + jSum11;
            long jSum12 = jSum11 + Sum0(jSum10) + Maj(jSum10, jSum8, jSum6);
            int i10 = i3 + 7;
            long jSum13 = j22 + Sum1(j25) + m221150Ch(j25, j24, j23) + jArr3[i9] + this.f206389W[i9];
            long j26 = jSum6 + jSum13;
            long jSum14 = jSum13 + Sum0(jSum12) + Maj(jSum12, jSum10, jSum8);
            i3 += 8;
            long jSum15 = j23 + Sum1(j26) + m221150Ch(j26, j25, j24) + jArr3[i10] + this.f206389W[i10];
            long j27 = jSum8 + jSum15;
            jSum0 = jSum15 + Sum0(jSum14) + Maj(jSum14, jSum12, jSum10);
            i2++;
            j12 = jSum14;
            j11 = j27;
            j8 = jSum12;
            j10 = j24;
            j7 = j26;
            j9 = j25;
            j6 = jSum10;
        }
        this.f206381H1 += jSum0;
        this.f206382H2 += j12;
        this.f206383H3 += j8;
        this.f206384H4 += j6;
        this.f206385H5 += j11;
        this.f206386H6 += j7;
        this.f206387H7 += j9;
        this.f206388H8 += j10;
        this.wOff = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            this.f206389W[i11] = 0;
        }
    }

    public void processLength(long j, long j2) {
        if (this.wOff > 14) {
            processBlock();
        }
        long[] jArr = this.f206389W;
        jArr[14] = j2;
        jArr[15] = j;
    }

    public void processWord(byte[] bArr, int i) {
        this.f206389W[this.wOff] = Pack.bigEndianToLong(bArr, i);
        int i2 = this.wOff + 1;
        this.wOff = i2;
        if (i2 == 16) {
            processBlock();
        }
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        this.byteCount1 = 0L;
        this.byteCount2 = 0L;
        int i = 0;
        this.xBufOff = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.wOff = 0;
        while (true) {
            long[] jArr = this.f206389W;
            if (i == jArr.length) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    public void restoreState(byte[] bArr) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, 8);
        this.xBufOff = iBigEndianToInt;
        System.arraycopy(bArr, 0, this.xBuf, 0, iBigEndianToInt);
        this.byteCount1 = Pack.bigEndianToLong(bArr, 12);
        this.byteCount2 = Pack.bigEndianToLong(bArr, 20);
        this.f206381H1 = Pack.bigEndianToLong(bArr, 28);
        this.f206382H2 = Pack.bigEndianToLong(bArr, 36);
        this.f206383H3 = Pack.bigEndianToLong(bArr, 44);
        this.f206384H4 = Pack.bigEndianToLong(bArr, 52);
        this.f206385H5 = Pack.bigEndianToLong(bArr, 60);
        this.f206386H6 = Pack.bigEndianToLong(bArr, 68);
        this.f206387H7 = Pack.bigEndianToLong(bArr, 76);
        this.f206388H8 = Pack.bigEndianToLong(bArr, 84);
        this.wOff = Pack.bigEndianToInt(bArr, 92);
        for (int i = 0; i < this.wOff; i++) {
            this.f206389W[i] = Pack.bigEndianToLong(bArr, (i * 8) + 96);
        }
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (this.xBufOff != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.xBuf.length) {
            processWord(bArr, i);
            byte[] bArr2 = this.xBuf;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.byteCount1 += (long) bArr2.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    public LongDigest(LongDigest longDigest) {
        this.xBuf = new byte[8];
        this.f206389W = new long[80];
        copyIn(longDigest);
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this.xBuf;
        int i = this.xBufOff;
        int i2 = i + 1;
        this.xBufOff = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            processWord(bArr, 0);
            this.xBufOff = 0;
        }
        this.byteCount1++;
    }
}
