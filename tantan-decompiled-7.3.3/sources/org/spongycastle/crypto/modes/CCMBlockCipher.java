package org.spongycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.macs.CBCBlockCipherMac;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import p153l.C17103g;
import p153l.psl;
import p153l.tyk0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class CCMBlockCipher implements AEADBlockCipher {
    private int blockSize;
    private BlockCipher cipher;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private CipherParameters keyParam;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonce;
    private ExposedByteArrayOutputStream associatedText = new ExposedByteArrayOutputStream();
    private ExposedByteArrayOutputStream data = new ExposedByteArrayOutputStream();

    public class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public ExposedByteArrayOutputStream() {
        }

        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public CCMBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.macBlock = new byte[blockSize];
        if (blockSize == 16) {
            return;
        }
        wg3.m206174a("cipher required with a block size of 16.");
        throw null;
    }

    private int calculateMac(byte[] bArr, int i, int i2, byte[] bArr2) {
        CBCBlockCipherMac cBCBlockCipherMac = new CBCBlockCipherMac(this.cipher, this.macSize * 8);
        cBCBlockCipherMac.init(this.keyParam);
        byte[] bArr3 = new byte[16];
        if (hasAssociatedText()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i3 = 2;
        byte macSize = (byte) (bArr3[0] | ((((cBCBlockCipherMac.getMacSize() - 2) / 2) & 7) << 3));
        bArr3[0] = macSize;
        byte[] bArr4 = this.nonce;
        bArr3[0] = (byte) (macSize | ((14 - bArr4.length) & 7));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i4 = i2;
        int i5 = 1;
        while (i4 > 0) {
            bArr3[16 - i5] = (byte) (i4 & 255);
            i4 >>>= 8;
            i5++;
        }
        cBCBlockCipherMac.update(bArr3, 0, 16);
        if (hasAssociatedText()) {
            int associatedTextLength = getAssociatedTextLength();
            if (associatedTextLength < 65280) {
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 8));
                cBCBlockCipherMac.update((byte) associatedTextLength);
            } else {
                cBCBlockCipherMac.update((byte) -1);
                cBCBlockCipherMac.update((byte) -2);
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 24));
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 16));
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 8));
                cBCBlockCipherMac.update((byte) associatedTextLength);
                i3 = 6;
            }
            byte[] bArr5 = this.initialAssociatedText;
            if (bArr5 != null) {
                cBCBlockCipherMac.update(bArr5, 0, bArr5.length);
            }
            if (this.associatedText.size() > 0) {
                cBCBlockCipherMac.update(this.associatedText.getBuffer(), 0, this.associatedText.size());
            }
            int i6 = (i3 + associatedTextLength) % 16;
            if (i6 != 0) {
                while (i6 != 16) {
                    cBCBlockCipherMac.update((byte) 0);
                    i6++;
                }
            }
        }
        cBCBlockCipherMac.update(bArr, i, i2);
        return cBCBlockCipherMac.doFinal(bArr2, 0);
    }

    private int getAssociatedTextLength() {
        int size = this.associatedText.size();
        byte[] bArr = this.initialAssociatedText;
        return size + (bArr == null ? 0 : bArr.length);
    }

    private boolean hasAssociatedText() {
        return getAssociatedTextLength() > 0;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        int iProcessPacket = processPacket(this.data.getBuffer(), 0, this.data.size(), bArr, i);
        reset();
        return iProcessPacket;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CCM";
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public byte[] getMac() {
        int i = this.macSize;
        byte[] bArr = new byte[i];
        System.arraycopy(this.macBlock, 0, bArr, 0, i);
        return bArr;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getOutputSize(int i) {
        int size = i + this.data.size();
        boolean z = this.forEncryption;
        int i2 = this.macSize;
        if (z) {
            return size + i2;
        }
        if (size < i2) {
            return 0;
        }
        return size - i2;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getUpdateOutputSize(int i) {
        return 0;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters parameters;
        this.forEncryption = z;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            this.nonce = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            this.macSize = aEADParameters.getMacSize() / 8;
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                wg3.m206174a("invalid parameters passed to CCM: ".concat(cipherParameters.getClass().getName()));
                return;
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.nonce = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = this.macBlock.length / 2;
            parameters = parametersWithIV.getParameters();
        }
        if (parameters != null) {
            this.keyParam = parameters;
        }
        byte[] bArr = this.nonce;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            wg3.m206174a("nonce must have length from 7 to 13 octets");
        } else {
            reset();
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADByte(byte b) throws IOException {
        this.associatedText.write(b);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADBytes(byte[] bArr, int i, int i2) throws IOException {
        this.associatedText.write(bArr, i, i2);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processByte(byte b, byte[] bArr, int i) throws IllegalStateException, DataLengthException, IOException {
        this.data.write(b);
        return 0;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException, IOException {
        if (bArr.length >= i + i2) {
            this.data.write(bArr, i, i2);
            return 0;
        }
        tyk0.m193596a("Input buffer too short");
        return 0;
    }

    public int processPacket(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, InvalidCipherTextException, DataLengthException {
        int i4;
        if (this.keyParam == null) {
            wtq0.m207906a("CCM cipher unitialized.");
            return 0;
        }
        byte[] bArr3 = this.nonce;
        int length = bArr3.length;
        int i5 = 15 - length;
        if (i5 < 4 && i2 >= (1 << (i5 * 8))) {
            wtq0.m207906a("CCM packet too large for choice of q.");
            return 0;
        }
        byte[] bArr4 = new byte[this.blockSize];
        bArr4[0] = (byte) ((14 - length) & 7);
        System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        SICBlockCipher sICBlockCipher = new SICBlockCipher(this.cipher);
        sICBlockCipher.init(this.forEncryption, new ParametersWithIV(this.keyParam, bArr4));
        boolean z = this.forEncryption;
        int i6 = this.macSize;
        if (!z) {
            if (i2 < i6) {
                psl.m173659a("data too short");
                return 0;
            }
            int i7 = i2 - i6;
            if (bArr2.length < i7 + i3) {
                C17103g.m128363a("Output buffer too short.");
                return 0;
            }
            int i8 = i + i7;
            System.arraycopy(bArr, i8, this.macBlock, 0, i6);
            byte[] bArr5 = this.macBlock;
            sICBlockCipher.processBlock(bArr5, 0, bArr5, 0);
            int i9 = this.macSize;
            while (true) {
                byte[] bArr6 = this.macBlock;
                if (i9 == bArr6.length) {
                    break;
                }
                bArr6[i9] = 0;
                i9++;
            }
            int i10 = i;
            int i11 = i3;
            while (true) {
                i4 = this.blockSize;
                if (i10 >= i8 - i4) {
                    break;
                }
                sICBlockCipher.processBlock(bArr, i10, bArr2, i11);
                int i12 = this.blockSize;
                i11 += i12;
                i10 += i12;
            }
            byte[] bArr7 = new byte[i4];
            int i13 = i7 - (i10 - i);
            System.arraycopy(bArr, i10, bArr7, 0, i13);
            sICBlockCipher.processBlock(bArr7, 0, bArr7, 0);
            System.arraycopy(bArr7, 0, bArr2, i11, i13);
            byte[] bArr8 = new byte[this.blockSize];
            calculateMac(bArr2, i3, i7, bArr8);
            if (Arrays.constantTimeAreEqual(this.macBlock, bArr8)) {
                return i7;
            }
            psl.m173659a("mac check in CCM failed");
            return 0;
        }
        int i14 = i6 + i2;
        if (bArr2.length < i14 + i3) {
            C17103g.m128363a("Output buffer too short.");
            return 0;
        }
        calculateMac(bArr, i, i2, this.macBlock);
        byte[] bArr9 = new byte[this.blockSize];
        sICBlockCipher.processBlock(this.macBlock, 0, bArr9, 0);
        int i15 = i;
        int i16 = i3;
        while (true) {
            int i17 = i + i2;
            int i18 = this.blockSize;
            if (i15 >= i17 - i18) {
                byte[] bArr10 = new byte[i18];
                int i19 = i17 - i15;
                System.arraycopy(bArr, i15, bArr10, 0, i19);
                sICBlockCipher.processBlock(bArr10, 0, bArr10, 0);
                System.arraycopy(bArr10, 0, bArr2, i16, i19);
                System.arraycopy(bArr9, 0, bArr2, i3 + i2, this.macSize);
                return i14;
            }
            sICBlockCipher.processBlock(bArr, i15, bArr2, i16);
            int i20 = this.blockSize;
            i16 += i20;
            i15 += i20;
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void reset() {
        this.cipher.reset();
        this.associatedText.reset();
        this.data.reset();
    }

    public byte[] processPacket(byte[] bArr, int i, int i2) throws IllegalStateException, InvalidCipherTextException {
        byte[] bArr2;
        boolean z = this.forEncryption;
        int i3 = this.macSize;
        if (z) {
            bArr2 = new byte[i3 + i2];
        } else if (i2 >= i3) {
            bArr2 = new byte[i2 - i3];
        } else {
            psl.m173659a("data too short");
            return null;
        }
        byte[] bArr3 = bArr2;
        processPacket(bArr, i, i2, bArr3, 0);
        return bArr3;
    }
}
