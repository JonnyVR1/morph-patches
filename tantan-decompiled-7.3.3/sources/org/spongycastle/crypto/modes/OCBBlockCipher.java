package org.spongycastle.crypto.modes;

import java.util.Vector;
import okio.Utf8;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.util.Arrays;
import p153l.C17103g;
import p153l.psl;
import p153l.tyk0;
import p153l.wg3;
import p153l.za50;

/* JADX INFO: loaded from: classes3.dex */
public class OCBBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;
    private byte[] Checksum;

    /* JADX INFO: renamed from: L */
    private Vector f207588L;
    private byte[] L_Asterisk;
    private byte[] L_Dollar;
    private byte[] OffsetHASH;
    private byte[] Sum;
    private boolean forEncryption;
    private byte[] hashBlock;
    private long hashBlockCount;
    private int hashBlockPos;
    private BlockCipher hashCipher;
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private int macSize;
    private byte[] mainBlock;
    private long mainBlockCount;
    private int mainBlockPos;
    private BlockCipher mainCipher;
    private byte[] KtopInput = null;
    private byte[] Stretch = new byte[24];
    private byte[] OffsetMAIN_0 = new byte[16];
    private byte[] OffsetMAIN = new byte[16];

    public OCBBlockCipher(BlockCipher blockCipher, BlockCipher blockCipher2) {
        if (blockCipher == null) {
            wg3.m206174a("'hashCipher' cannot be null");
            throw null;
        }
        if (blockCipher.getBlockSize() != 16) {
            wg3.m206174a("'hashCipher' must have a block size of 16");
            throw null;
        }
        if (blockCipher2 == null) {
            wg3.m206174a("'mainCipher' cannot be null");
            throw null;
        }
        if (blockCipher2.getBlockSize() != 16) {
            wg3.m206174a("'mainCipher' must have a block size of 16");
            throw null;
        }
        if (!blockCipher.getAlgorithmName().equals(blockCipher2.getAlgorithmName())) {
            wg3.m206174a("'hashCipher' and 'mainCipher' must be the same algorithm");
            throw null;
        }
        this.hashCipher = blockCipher;
        this.mainCipher = blockCipher2;
    }

    public static byte[] OCB_double(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int iShiftLeft = shiftLeft(bArr, bArr2);
        bArr2[15] = (byte) ((CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA >>> ((1 - iShiftLeft) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    public static void OCB_extend(byte[] bArr, int i) {
        bArr[i] = -128;
        while (true) {
            i++;
            if (i >= 16) {
                return;
            } else {
                bArr[i] = 0;
            }
        }
    }

    public static int OCB_ntz(long j) {
        if (j == 0) {
            return 64;
        }
        int i = 0;
        while ((1 & j) == 0) {
            i++;
            j >>>= 1;
        }
        return i;
    }

    public static int shiftLeft(byte[] bArr, byte[] bArr2) {
        int i = 16;
        int i2 = 0;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            int i3 = bArr[i] & 255;
            bArr2[i] = (byte) (i2 | (i3 << 1));
            i2 = (i3 >>> 7) & 1;
        }
    }

    public static void xor(byte[] bArr, byte[] bArr2) {
        for (int i = 15; i >= 0; i--) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    public void clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        byte[] bArr2;
        if (this.forEncryption) {
            bArr2 = null;
        } else {
            int i2 = this.mainBlockPos;
            int i3 = this.macSize;
            if (i2 < i3) {
                psl.m173659a("data too short");
                return 0;
            }
            int i4 = i2 - i3;
            this.mainBlockPos = i4;
            bArr2 = new byte[i3];
            System.arraycopy(this.mainBlock, i4, bArr2, 0, i3);
        }
        int i5 = this.hashBlockPos;
        if (i5 > 0) {
            OCB_extend(this.hashBlock, i5);
            updateHASH(this.L_Asterisk);
        }
        int i6 = this.mainBlockPos;
        if (i6 > 0) {
            if (this.forEncryption) {
                OCB_extend(this.mainBlock, i6);
                xor(this.Checksum, this.mainBlock);
            }
            xor(this.OffsetMAIN, this.L_Asterisk);
            byte[] bArr3 = new byte[16];
            this.hashCipher.processBlock(this.OffsetMAIN, 0, bArr3, 0);
            xor(this.mainBlock, bArr3);
            int length = bArr.length;
            int i7 = this.mainBlockPos;
            if (length < i + i7) {
                C17103g.m128363a("Output buffer too short");
                return 0;
            }
            System.arraycopy(this.mainBlock, 0, bArr, i, i7);
            if (!this.forEncryption) {
                OCB_extend(this.mainBlock, this.mainBlockPos);
                xor(this.Checksum, this.mainBlock);
            }
        }
        xor(this.Checksum, this.OffsetMAIN);
        xor(this.Checksum, this.L_Dollar);
        BlockCipher blockCipher = this.hashCipher;
        byte[] bArr4 = this.Checksum;
        blockCipher.processBlock(bArr4, 0, bArr4, 0);
        xor(this.Checksum, this.Sum);
        int i8 = this.macSize;
        byte[] bArr5 = new byte[i8];
        this.macBlock = bArr5;
        System.arraycopy(this.Checksum, 0, bArr5, 0, i8);
        int i9 = this.mainBlockPos;
        if (this.forEncryption) {
            int length2 = bArr.length;
            int i10 = i + i9;
            int i11 = this.macSize;
            if (length2 < i10 + i11) {
                C17103g.m128363a("Output buffer too short");
                return 0;
            }
            System.arraycopy(this.macBlock, 0, bArr, i10, i11);
            i9 += this.macSize;
        } else if (!Arrays.constantTimeAreEqual(this.macBlock, bArr2)) {
            psl.m173659a("mac check in OCB failed");
            return 0;
        }
        reset(false);
        return i9;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public String getAlgorithmName() {
        return this.mainCipher.getAlgorithmName() + "/OCB";
    }

    public byte[] getLSub(int i) {
        while (true) {
            int size = this.f207588L.size();
            Vector vector = this.f207588L;
            if (i < size) {
                return (byte[]) vector.elementAt(i);
            }
            vector.addElement(OCB_double((byte[]) vector.lastElement()));
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public byte[] getMac() {
        return Arrays.clone(this.macBlock);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getOutputSize(int i) {
        int i2 = i + this.mainBlockPos;
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
        return this.mainCipher;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.mainBlockPos;
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
        byte[] iv;
        KeyParameter key;
        boolean z2 = this.forEncryption;
        this.forEncryption = z;
        this.macBlock = null;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > 128 || macSize % 8 != 0) {
                za50.m219101a("Invalid value for MAC size: ", macSize);
                return;
            } else {
                this.macSize = macSize / 8;
                key = aEADParameters.getKey();
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                wg3.m206174a("invalid parameters passed to OCB");
                return;
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            key = (KeyParameter) parametersWithIV.getParameters();
        }
        this.hashBlock = new byte[16];
        this.mainBlock = new byte[z ? 16 : this.macSize + 16];
        if (iv == null) {
            iv = new byte[0];
        }
        if (iv.length > 15) {
            wg3.m206174a("IV must be no more than 15 bytes");
            return;
        }
        if (key != null) {
            this.hashCipher.init(true, key);
            this.mainCipher.init(z, key);
            this.KtopInput = null;
        } else if (z2 != z) {
            wg3.m206174a("cannot change encrypting state without providing key.");
            return;
        }
        byte[] bArr = new byte[16];
        this.L_Asterisk = bArr;
        this.hashCipher.processBlock(bArr, 0, bArr, 0);
        this.L_Dollar = OCB_double(this.L_Asterisk);
        Vector vector = new Vector();
        this.f207588L = vector;
        vector.addElement(OCB_double(this.L_Dollar));
        int iProcessNonce = processNonce(iv);
        int i = iProcessNonce % 8;
        int i2 = iProcessNonce / 8;
        if (i == 0) {
            System.arraycopy(this.Stretch, i2, this.OffsetMAIN_0, 0, 16);
        } else {
            for (int i3 = 0; i3 < 16; i3++) {
                byte[] bArr2 = this.Stretch;
                int i4 = bArr2[i2] & 255;
                i2++;
                this.OffsetMAIN_0[i3] = (byte) (((bArr2[i2] & 255) >>> (8 - i)) | (i4 << i));
            }
        }
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        this.OffsetHASH = new byte[16];
        this.Sum = new byte[16];
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        this.Checksum = new byte[16];
        byte[] bArr3 = this.initialAssociatedText;
        if (bArr3 != null) {
            processAADBytes(bArr3, 0, bArr3.length);
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADByte(byte b) {
        byte[] bArr = this.hashBlock;
        int i = this.hashBlockPos;
        bArr[i] = b;
        int i2 = i + 1;
        this.hashBlockPos = i2;
        if (i2 == bArr.length) {
            processHashBlock();
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.hashBlock;
            int i4 = this.hashBlockPos;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.hashBlockPos = i5;
            if (i5 == bArr2.length) {
                processHashBlock();
            }
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
        byte[] bArr2 = this.mainBlock;
        int i2 = this.mainBlockPos;
        bArr2[i2] = b;
        int i3 = i2 + 1;
        this.mainBlockPos = i3;
        if (i3 != bArr2.length) {
            return 0;
        }
        processMainBlock(bArr, i);
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
            byte[] bArr3 = this.mainBlock;
            int i6 = this.mainBlockPos;
            bArr3[i6] = bArr[i + i5];
            int i7 = i6 + 1;
            this.mainBlockPos = i7;
            if (i7 == bArr3.length) {
                processMainBlock(bArr2, i3 + i4);
                i4 += 16;
            }
        }
        return i4;
    }

    public void processHashBlock() {
        long j = this.hashBlockCount + 1;
        this.hashBlockCount = j;
        updateHASH(getLSub(OCB_ntz(j)));
        this.hashBlockPos = 0;
    }

    public void processMainBlock(byte[] bArr, int i) {
        if (bArr.length < i + 16) {
            C17103g.m128363a("Output buffer too short");
            return;
        }
        if (this.forEncryption) {
            xor(this.Checksum, this.mainBlock);
            this.mainBlockPos = 0;
        }
        byte[] bArr2 = this.OffsetMAIN;
        long j = this.mainBlockCount + 1;
        this.mainBlockCount = j;
        xor(bArr2, getLSub(OCB_ntz(j)));
        xor(this.mainBlock, this.OffsetMAIN);
        BlockCipher blockCipher = this.mainCipher;
        byte[] bArr3 = this.mainBlock;
        blockCipher.processBlock(bArr3, 0, bArr3, 0);
        xor(this.mainBlock, this.OffsetMAIN);
        System.arraycopy(this.mainBlock, 0, bArr, i, 16);
        if (this.forEncryption) {
            return;
        }
        xor(this.Checksum, this.mainBlock);
        byte[] bArr4 = this.mainBlock;
        System.arraycopy(bArr4, 16, bArr4, 0, this.macSize);
        this.mainBlockPos = this.macSize;
    }

    public int processNonce(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.macSize << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        byte b = bArr2[15];
        int i2 = b & Utf8.REPLACEMENT_BYTE;
        bArr2[15] = (byte) (b & 192);
        byte[] bArr3 = this.KtopInput;
        if (bArr3 == null || !Arrays.areEqual(bArr2, bArr3)) {
            byte[] bArr4 = new byte[16];
            this.KtopInput = bArr2;
            this.hashCipher.processBlock(bArr2, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, this.Stretch, 0, 16);
            while (i < 8) {
                byte[] bArr5 = this.Stretch;
                int i3 = i + 16;
                byte b2 = bArr4[i];
                i++;
                bArr5[i3] = (byte) (b2 ^ bArr4[i]);
            }
        }
        return i2;
    }

    public void reset(boolean z) {
        this.hashCipher.reset();
        this.mainCipher.reset();
        clear(this.hashBlock);
        clear(this.mainBlock);
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        clear(this.OffsetHASH);
        clear(this.Sum);
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        clear(this.Checksum);
        if (z) {
            this.macBlock = null;
        }
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    public void updateHASH(byte[] bArr) {
        xor(this.OffsetHASH, bArr);
        xor(this.hashBlock, this.OffsetHASH);
        BlockCipher blockCipher = this.hashCipher;
        byte[] bArr2 = this.hashBlock;
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        xor(this.Sum, this.hashBlock);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void reset() {
        reset(true);
    }
}
