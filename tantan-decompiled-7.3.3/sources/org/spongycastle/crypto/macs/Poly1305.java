package org.spongycastle.crypto.macs;

import io.agora.rtc2.internal.AudioRoutingController;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.generators.Poly1305KeyGenerator;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Pack;
import p153l.tyk0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;

    /* JADX INFO: renamed from: h0 */
    private int f207541h0;

    /* JADX INFO: renamed from: h1 */
    private int f207542h1;

    /* JADX INFO: renamed from: h2 */
    private int f207543h2;

    /* JADX INFO: renamed from: h3 */
    private int f207544h3;

    /* JADX INFO: renamed from: h4 */
    private int f207545h4;

    /* JADX INFO: renamed from: k0 */
    private int f207546k0;

    /* JADX INFO: renamed from: k1 */
    private int f207547k1;

    /* JADX INFO: renamed from: k2 */
    private int f207548k2;

    /* JADX INFO: renamed from: k3 */
    private int f207549k3;

    /* JADX INFO: renamed from: r0 */
    private int f207550r0;

    /* JADX INFO: renamed from: r1 */
    private int f207551r1;

    /* JADX INFO: renamed from: r2 */
    private int f207552r2;

    /* JADX INFO: renamed from: r3 */
    private int f207553r3;

    /* JADX INFO: renamed from: r4 */
    private int f207554r4;

    /* JADX INFO: renamed from: s1 */
    private int f207555s1;

    /* JADX INFO: renamed from: s2 */
    private int f207556s2;

    /* JADX INFO: renamed from: s3 */
    private int f207557s3;

    /* JADX INFO: renamed from: s4 */
    private int f207558s4;
    private final byte[] singleByte;

    public Poly1305(BlockCipher blockCipher) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        if (blockCipher.getBlockSize() == 16) {
            this.cipher = blockCipher;
        } else {
            wg3.m206174a("Poly1305 requires a 128 bit block cipher.");
            throw null;
        }
    }

    private static final long mul32x32_64(int i, int i2) {
        return ((long) i) * ((long) i2);
    }

    private void processBlock() {
        int i = this.currentBlockOffset;
        if (i < 16) {
            this.currentBlock[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                this.currentBlock[i2] = 0;
            }
        }
        long jLittleEndianToInt = Pack.littleEndianToInt(this.currentBlock, 0);
        long j = jLittleEndianToInt & 4294967295L;
        long jLittleEndianToInt2 = ((long) Pack.littleEndianToInt(this.currentBlock, 4)) & 4294967295L;
        long jLittleEndianToInt3 = ((long) Pack.littleEndianToInt(this.currentBlock, 8)) & 4294967295L;
        long jLittleEndianToInt4 = 4294967295L & ((long) Pack.littleEndianToInt(this.currentBlock, 12));
        int i3 = (int) (((long) this.f207541h0) + (jLittleEndianToInt & 67108863));
        this.f207541h0 = i3;
        this.f207542h1 = (int) (((long) this.f207542h1) + ((((jLittleEndianToInt2 << 32) | j) >>> 26) & 67108863));
        this.f207543h2 = (int) (((long) this.f207543h2) + (((jLittleEndianToInt2 | (jLittleEndianToInt3 << 32)) >>> 20) & 67108863));
        this.f207544h3 = (int) (((long) this.f207544h3) + ((((jLittleEndianToInt4 << 32) | jLittleEndianToInt3) >>> 14) & 67108863));
        int i4 = (int) (((long) this.f207545h4) + (jLittleEndianToInt4 >>> 8));
        this.f207545h4 = i4;
        if (this.currentBlockOffset == 16) {
            this.f207545h4 = i4 + 16777216;
        }
        long jMul32x32_64 = mul32x32_64(i3, this.f207550r0) + mul32x32_64(this.f207542h1, this.f207558s4) + mul32x32_64(this.f207543h2, this.f207557s3) + mul32x32_64(this.f207544h3, this.f207556s2) + mul32x32_64(this.f207545h4, this.f207555s1);
        long jMul32x32_65 = mul32x32_64(this.f207541h0, this.f207551r1) + mul32x32_64(this.f207542h1, this.f207550r0) + mul32x32_64(this.f207543h2, this.f207558s4) + mul32x32_64(this.f207544h3, this.f207557s3) + mul32x32_64(this.f207545h4, this.f207556s2);
        long jMul32x32_66 = mul32x32_64(this.f207541h0, this.f207552r2) + mul32x32_64(this.f207542h1, this.f207551r1) + mul32x32_64(this.f207543h2, this.f207550r0) + mul32x32_64(this.f207544h3, this.f207558s4) + mul32x32_64(this.f207545h4, this.f207557s3);
        long jMul32x32_67 = mul32x32_64(this.f207541h0, this.f207553r3) + mul32x32_64(this.f207542h1, this.f207552r2) + mul32x32_64(this.f207543h2, this.f207551r1) + mul32x32_64(this.f207544h3, this.f207550r0) + mul32x32_64(this.f207545h4, this.f207558s4);
        long jMul32x32_68 = mul32x32_64(this.f207541h0, this.f207554r4) + mul32x32_64(this.f207542h1, this.f207553r3) + mul32x32_64(this.f207543h2, this.f207552r2) + mul32x32_64(this.f207544h3, this.f207551r1) + mul32x32_64(this.f207545h4, this.f207550r0);
        long j2 = jMul32x32_65 + (jMul32x32_64 >>> 26);
        this.f207542h1 = ((int) j2) & 67108863;
        long j3 = jMul32x32_66 + (j2 >>> 26);
        this.f207543h2 = ((int) j3) & 67108863;
        long j4 = jMul32x32_67 + (j3 >>> 26);
        this.f207544h3 = ((int) j4) & 67108863;
        long j5 = jMul32x32_68 + (j4 >>> 26);
        this.f207545h4 = ((int) j5) & 67108863;
        this.f207541h0 = (int) (((long) (((int) jMul32x32_64) & 67108863)) + ((j5 >>> 26) * 5));
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        if (this.cipher != null && (bArr2 == null || bArr2.length != 16)) {
            wg3.m206174a("Poly1305 requires a 128 bit IV.");
            return;
        }
        Poly1305KeyGenerator.checkKey(bArr);
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 16);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 20);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 24);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 28);
        this.f207550r0 = 67108863 & iLittleEndianToInt;
        int i = ((iLittleEndianToInt >>> 26) | (iLittleEndianToInt2 << 6)) & 67108611;
        this.f207551r1 = i;
        int i2 = ((iLittleEndianToInt2 >>> 20) | (iLittleEndianToInt3 << 12)) & 67092735;
        this.f207552r2 = i2;
        int i3 = ((iLittleEndianToInt3 >>> 14) | (iLittleEndianToInt4 << 18)) & 66076671;
        this.f207553r3 = i3;
        int i4 = (iLittleEndianToInt4 >>> 8) & 1048575;
        this.f207554r4 = i4;
        this.f207555s1 = i * 5;
        this.f207556s2 = i2 * 5;
        this.f207557s3 = i3 * 5;
        this.f207558s4 = i4 * 5;
        BlockCipher blockCipher = this.cipher;
        if (blockCipher != null) {
            byte[] bArr3 = new byte[16];
            blockCipher.init(true, new KeyParameter(bArr, 0, 16));
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            bArr = bArr3;
        }
        this.f207546k0 = Pack.littleEndianToInt(bArr, 0);
        this.f207547k1 = Pack.littleEndianToInt(bArr, 4);
        this.f207548k2 = Pack.littleEndianToInt(bArr, 8);
        this.f207549k3 = Pack.littleEndianToInt(bArr, 12);
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        if (i + 16 > bArr.length) {
            tyk0.m193596a("Output buffer is too short.");
            return 0;
        }
        if (this.currentBlockOffset > 0) {
            processBlock();
        }
        int i2 = this.f207541h0;
        int i3 = this.f207542h1 + (i2 >>> 26);
        int i4 = i3 >>> 26;
        int i5 = i3 & 67108863;
        int i6 = this.f207543h2 + i4;
        int i7 = i6 >>> 26;
        int i8 = i6 & 67108863;
        int i9 = this.f207544h3 + i7;
        int i10 = i9 >>> 26;
        int i11 = i9 & 67108863;
        int i12 = this.f207545h4 + i10;
        int i13 = i12 >>> 26;
        int i14 = i12 & 67108863;
        int i15 = (i2 & 67108863) + (i13 * 5);
        int i16 = i15 + 5;
        int i17 = (i16 >>> 26) + i5;
        int i18 = (i17 >>> 26) + i8;
        int i19 = (i18 >>> 26) + i11;
        int i20 = 67108863 & i19;
        int i21 = ((i19 >>> 26) + i14) - AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        int i22 = (i21 >>> 31) - 1;
        int i23 = ~i22;
        int i24 = (i15 & i23) | (i16 & 67108863 & i22);
        this.f207541h0 = i24;
        int i25 = (i5 & i23) | (i17 & 67108863 & i22);
        this.f207542h1 = i25;
        int i26 = (i8 & i23) | (i18 & 67108863 & i22);
        this.f207543h2 = i26;
        int i27 = (i20 & i22) | (i11 & i23);
        this.f207544h3 = i27;
        int i28 = (i14 & i23) | (i21 & i22);
        this.f207545h4 = i28;
        long j = (((long) (i24 | (i25 << 26))) & 4294967295L) + (((long) this.f207546k0) & 4294967295L);
        long j2 = (((long) ((i25 >>> 6) | (i26 << 20))) & 4294967295L) + (((long) this.f207547k1) & 4294967295L);
        long j3 = (((long) ((i26 >>> 12) | (i27 << 14))) & 4294967295L) + (((long) this.f207548k2) & 4294967295L);
        long j4 = (((long) ((i27 >>> 18) | (i28 << 8))) & 4294967295L) + (4294967295L & ((long) this.f207549k3));
        Pack.intToLittleEndian((int) j, bArr, i);
        long j5 = j2 + (j >>> 32);
        Pack.intToLittleEndian((int) j5, bArr, i + 4);
        long j6 = j3 + (j5 >>> 32);
        Pack.intToLittleEndian((int) j6, bArr, i + 8);
        Pack.intToLittleEndian((int) (j4 + (j6 >>> 32)), bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        if (this.cipher == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.cipher.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] iv;
        if (this.cipher == null) {
            iv = null;
        } else if (!(cipherParameters instanceof ParametersWithIV)) {
            wg3.m206174a("Poly1305 requires an IV when used with a block cipher.");
            return;
        } else {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            wg3.m206174a("Poly1305 requires a key.");
        } else {
            setKey(((KeyParameter) cipherParameters).getKey(), iv);
            reset();
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        this.currentBlockOffset = 0;
        this.f207545h4 = 0;
        this.f207544h3 = 0;
        this.f207543h2 = 0;
        this.f207542h1 = 0;
        this.f207541h0 = 0;
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws IllegalStateException, DataLengthException {
        int i3 = 0;
        while (i2 > i3) {
            if (this.currentBlockOffset == 16) {
                processBlock();
                this.currentBlockOffset = 0;
            }
            int iMin = Math.min(i2 - i3, 16 - this.currentBlockOffset);
            System.arraycopy(bArr, i3 + i, this.currentBlock, this.currentBlockOffset, iMin);
            i3 += iMin;
            this.currentBlockOffset += iMin;
        }
    }

    public Poly1305() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        this.cipher = null;
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b) throws IllegalStateException {
        byte[] bArr = this.singleByte;
        bArr[0] = b;
        update(bArr, 0, 1);
    }
}
