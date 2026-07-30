package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.modes.gcm.GCMExponentiator;
import org.spongycastle.crypto.modes.gcm.GCMMultiplier;
import org.spongycastle.crypto.modes.gcm.GCMUtil;
import org.spongycastle.crypto.modes.gcm.Tables1kGCMExponentiator;
import org.spongycastle.crypto.modes.gcm.Tables8kGCMMultiplier;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;
import p153l.C17103g;
import p153l.psl;
import p153l.tyk0;
import p153l.wg3;
import p153l.za50;

/* JADX INFO: loaded from: classes3.dex */
public class GCMBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* JADX INFO: renamed from: H */
    private byte[] f207580H;

    /* JADX INFO: renamed from: J0 */
    private byte[] f207581J0;

    /* JADX INFO: renamed from: S */
    private byte[] f207582S;
    private byte[] S_at;
    private byte[] S_atPre;
    private byte[] atBlock;
    private int atBlockPos;
    private long atLength;
    private long atLengthPre;
    private byte[] bufBlock;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] counter;
    private GCMExponentiator exp;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private int macSize;
    private GCMMultiplier multiplier;
    private byte[] nonce;
    private long totalLength;

    public GCMBlockCipher(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
        if (blockCipher.getBlockSize() != 16) {
            wg3.m206174a("cipher required with a block size of 16.");
            throw null;
        }
        gCMMultiplier = gCMMultiplier == null ? new Tables8kGCMMultiplier() : gCMMultiplier;
        this.cipher = blockCipher;
        this.multiplier = gCMMultiplier;
    }

    private void gCTRBlock(byte[] bArr, byte[] bArr2, int i) {
        byte[] nextCounterBlock = getNextCounterBlock();
        GCMUtil.xor(nextCounterBlock, bArr);
        System.arraycopy(nextCounterBlock, 0, bArr2, i, 16);
        byte[] bArr3 = this.f207582S;
        if (this.forEncryption) {
            bArr = nextCounterBlock;
        }
        gHASHBlock(bArr3, bArr);
        this.totalLength += 16;
    }

    private void gCTRPartial(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] nextCounterBlock = getNextCounterBlock();
        GCMUtil.xor(nextCounterBlock, bArr, i, i2);
        System.arraycopy(nextCounterBlock, 0, bArr2, i3, i2);
        byte[] bArr3 = this.f207582S;
        if (this.forEncryption) {
            bArr = nextCounterBlock;
        }
        gHASHPartial(bArr3, bArr, 0, i2);
        this.totalLength += (long) i2;
    }

    private void gHASH(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2 += 16) {
            gHASHPartial(bArr, bArr2, i2, Math.min(i - i2, 16));
        }
    }

    private void gHASHBlock(byte[] bArr, byte[] bArr2) {
        GCMUtil.xor(bArr, bArr2);
        this.multiplier.multiplyH(bArr);
    }

    private void gHASHPartial(byte[] bArr, byte[] bArr2, int i, int i2) {
        GCMUtil.xor(bArr, bArr2, i, i2);
        this.multiplier.multiplyH(bArr);
    }

    private byte[] getNextCounterBlock() {
        byte[] bArr = this.counter;
        int i = (bArr[15] & 255) + 1;
        bArr[15] = (byte) i;
        int i2 = (i >>> 8) + (bArr[14] & 255);
        bArr[14] = (byte) i2;
        int i3 = (i2 >>> 8) + (bArr[13] & 255);
        bArr[13] = (byte) i3;
        bArr[12] = (byte) ((i3 >>> 8) + (bArr[12] & 255));
        byte[] bArr2 = new byte[16];
        this.cipher.processBlock(bArr, 0, bArr2, 0);
        return bArr2;
    }

    private void initCipher() {
        if (this.atLength > 0) {
            System.arraycopy(this.S_at, 0, this.S_atPre, 0, 16);
            this.atLengthPre = this.atLength;
        }
        int i = this.atBlockPos;
        if (i > 0) {
            gHASHPartial(this.S_atPre, this.atBlock, 0, i);
            this.atLengthPre += (long) this.atBlockPos;
        }
        if (this.atLengthPre > 0) {
            System.arraycopy(this.S_atPre, 0, this.f207582S, 0, 16);
        }
    }

    private void outputBlock(byte[] bArr, int i) {
        if (bArr.length < i + 16) {
            C17103g.m128363a("Output buffer too short");
            return;
        }
        if (this.totalLength == 0) {
            initCipher();
        }
        gCTRBlock(this.bufBlock, bArr, i);
        if (this.forEncryption) {
            this.bufOff = 0;
            return;
        }
        byte[] bArr2 = this.bufBlock;
        System.arraycopy(bArr2, 16, bArr2, 0, this.macSize);
        this.bufOff = this.macSize;
    }

    private void reset(boolean z) {
        this.cipher.reset();
        this.f207582S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.f207581J0);
        this.bufOff = 0;
        this.totalLength = 0L;
        byte[] bArr = this.bufBlock;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        if (z) {
            this.macBlock = null;
        }
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        GCMBlockCipher gCMBlockCipher;
        byte[] bArr2;
        int i2;
        if (this.totalLength == 0) {
            initCipher();
        }
        int i3 = this.bufOff;
        if (!this.forEncryption) {
            int i4 = this.macSize;
            if (i3 < i4) {
                psl.m173659a("data too short");
                return 0;
            }
            i3 -= i4;
            if (bArr.length < i + i3) {
                C17103g.m128363a("Output buffer too short");
                return 0;
            }
        } else if (bArr.length < i + i3 + this.macSize) {
            C17103g.m128363a("Output buffer too short");
            return 0;
        }
        int i5 = i3;
        if (i5 > 0) {
            gCMBlockCipher = this;
            bArr2 = bArr;
            i2 = i;
            gCMBlockCipher.gCTRPartial(this.bufBlock, 0, i5, bArr2, i2);
        } else {
            gCMBlockCipher = this;
            bArr2 = bArr;
            i2 = i;
        }
        long j = gCMBlockCipher.atLength;
        int i6 = gCMBlockCipher.atBlockPos;
        long j2 = j + ((long) i6);
        gCMBlockCipher.atLength = j2;
        if (j2 > gCMBlockCipher.atLengthPre) {
            if (i6 > 0) {
                gCMBlockCipher.gHASHPartial(gCMBlockCipher.S_at, gCMBlockCipher.atBlock, 0, i6);
            }
            if (gCMBlockCipher.atLengthPre > 0) {
                GCMUtil.xor(gCMBlockCipher.S_at, gCMBlockCipher.S_atPre);
            }
            long j3 = ((gCMBlockCipher.totalLength * 8) + 127) >>> 7;
            byte[] bArr3 = new byte[16];
            if (gCMBlockCipher.exp == null) {
                Tables1kGCMExponentiator tables1kGCMExponentiator = new Tables1kGCMExponentiator();
                gCMBlockCipher.exp = tables1kGCMExponentiator;
                tables1kGCMExponentiator.init(gCMBlockCipher.f207580H);
            }
            gCMBlockCipher.exp.exponentiateX(j3, bArr3);
            GCMUtil.multiply(gCMBlockCipher.S_at, bArr3);
            GCMUtil.xor(gCMBlockCipher.f207582S, gCMBlockCipher.S_at);
        }
        byte[] bArr4 = new byte[16];
        Pack.longToBigEndian(gCMBlockCipher.atLength * 8, bArr4, 0);
        Pack.longToBigEndian(gCMBlockCipher.totalLength * 8, bArr4, 8);
        gCMBlockCipher.gHASHBlock(gCMBlockCipher.f207582S, bArr4);
        byte[] bArr5 = new byte[16];
        gCMBlockCipher.cipher.processBlock(gCMBlockCipher.f207581J0, 0, bArr5, 0);
        GCMUtil.xor(bArr5, gCMBlockCipher.f207582S);
        int i7 = gCMBlockCipher.macSize;
        byte[] bArr6 = new byte[i7];
        gCMBlockCipher.macBlock = bArr6;
        System.arraycopy(bArr5, 0, bArr6, 0, i7);
        if (gCMBlockCipher.forEncryption) {
            System.arraycopy(gCMBlockCipher.macBlock, 0, bArr2, i2 + gCMBlockCipher.bufOff, gCMBlockCipher.macSize);
            i5 += gCMBlockCipher.macSize;
        } else {
            int i8 = gCMBlockCipher.macSize;
            byte[] bArr7 = new byte[i8];
            System.arraycopy(gCMBlockCipher.bufBlock, i5, bArr7, 0, i8);
            if (!Arrays.constantTimeAreEqual(gCMBlockCipher.macBlock, bArr7)) {
                psl.m173659a("mac check in GCM failed");
                return 0;
            }
        }
        gCMBlockCipher.reset(false);
        return i5;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/GCM";
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public byte[] getMac() {
        return Arrays.clone(this.macBlock);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getOutputSize(int i) {
        int i2 = i + this.bufOff;
        boolean z = this.forEncryption;
        int i3 = this.macSize;
        if (z) {
            return i2 + i3;
        }
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.bufOff;
        if (!this.forEncryption) {
            int i3 = this.macSize;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % 16);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        KeyParameter key;
        this.forEncryption = z;
        this.macBlock = null;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            this.nonce = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 32 || macSize > 128 || macSize % 8 != 0) {
                za50.m219101a("Invalid value for MAC size: ", macSize);
                return;
            } else {
                this.macSize = macSize / 8;
                key = aEADParameters.getKey();
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                wg3.m206174a("invalid parameters passed to GCM");
                return;
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.nonce = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            key = (KeyParameter) parametersWithIV.getParameters();
        }
        this.bufBlock = new byte[z ? 16 : this.macSize + 16];
        byte[] bArr = this.nonce;
        if (bArr == null || bArr.length < 1) {
            wg3.m206174a("IV must be at least 1 byte");
            return;
        }
        if (key != null) {
            this.cipher.init(true, key);
            byte[] bArr2 = new byte[16];
            this.f207580H = bArr2;
            this.cipher.processBlock(bArr2, 0, bArr2, 0);
            this.multiplier.init(this.f207580H);
            this.exp = null;
        } else if (this.f207580H == null) {
            wg3.m206174a("Key must be specified in initial init");
            return;
        }
        byte[] bArr3 = new byte[16];
        this.f207581J0 = bArr3;
        byte[] bArr4 = this.nonce;
        if (bArr4.length == 12) {
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            this.f207581J0[15] = 1;
        } else {
            gHASH(bArr3, bArr4, bArr4.length);
            byte[] bArr5 = new byte[16];
            Pack.longToBigEndian(((long) this.nonce.length) * 8, bArr5, 8);
            gHASHBlock(this.f207581J0, bArr5);
        }
        this.f207582S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.f207581J0);
        this.bufOff = 0;
        this.totalLength = 0L;
        byte[] bArr6 = this.initialAssociatedText;
        if (bArr6 != null) {
            processAADBytes(bArr6, 0, bArr6.length);
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADByte(byte b) {
        byte[] bArr = this.atBlock;
        int i = this.atBlockPos;
        bArr[i] = b;
        int i2 = i + 1;
        this.atBlockPos = i2;
        if (i2 == 16) {
            gHASHBlock(this.S_at, bArr);
            this.atBlockPos = 0;
            this.atLength += 16;
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.atBlock;
            int i4 = this.atBlockPos;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.atBlockPos = i5;
            if (i5 == 16) {
                gHASHBlock(this.S_at, bArr2);
                this.atBlockPos = 0;
                this.atLength += 16;
            }
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
        byte[] bArr2 = this.bufBlock;
        int i2 = this.bufOff;
        bArr2[i2] = b;
        int i3 = i2 + 1;
        this.bufOff = i3;
        if (i3 != bArr2.length) {
            return 0;
        }
        outputBlock(bArr, i);
        return 16;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (bArr.length < i + i2) {
            tyk0.m193596a("Input buffer too short");
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            byte[] bArr3 = this.bufBlock;
            int i6 = this.bufOff;
            bArr3[i6] = bArr[i + i5];
            int i7 = i6 + 1;
            this.bufOff = i7;
            if (i7 == bArr3.length) {
                outputBlock(bArr2, i3 + i4);
                i4 += 16;
            }
        }
        return i4;
    }

    public GCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, null);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void reset() {
        reset(true);
    }
}
