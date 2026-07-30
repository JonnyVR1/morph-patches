package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamBlockCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class CFBBlockCipher extends StreamBlockCipher {

    /* JADX INFO: renamed from: IV */
    private byte[] f206656IV;
    private int blockSize;
    private int byteCount;
    private byte[] cfbOutV;
    private byte[] cfbV;
    private BlockCipher cipher;
    private boolean encrypting;
    private byte[] inBuf;

    public CFBBlockCipher(BlockCipher blockCipher, int i) {
        super(blockCipher);
        this.cipher = blockCipher;
        this.blockSize = i / 8;
        this.f206656IV = new byte[blockCipher.getBlockSize()];
        this.cfbV = new byte[blockCipher.getBlockSize()];
        this.cfbOutV = new byte[blockCipher.getBlockSize()];
        this.inBuf = new byte[this.blockSize];
    }

    private byte decryptByte(byte b) {
        if (this.byteCount == 0) {
            this.cipher.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        }
        byte[] bArr = this.inBuf;
        int i = this.byteCount;
        bArr[i] = b;
        byte[] bArr2 = this.cfbOutV;
        int i2 = i + 1;
        this.byteCount = i2;
        byte b2 = (byte) (b ^ bArr2[i]);
        int i3 = this.blockSize;
        if (i2 == i3) {
            this.byteCount = 0;
            byte[] bArr3 = this.cfbV;
            System.arraycopy(bArr3, i3, bArr3, 0, bArr3.length - i3);
            byte[] bArr4 = this.inBuf;
            byte[] bArr5 = this.cfbV;
            int length = bArr5.length;
            int i4 = this.blockSize;
            System.arraycopy(bArr4, 0, bArr5, length - i4, i4);
        }
        return b2;
    }

    private byte encryptByte(byte b) {
        if (this.byteCount == 0) {
            this.cipher.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        }
        byte[] bArr = this.cfbOutV;
        int i = this.byteCount;
        byte b2 = (byte) (b ^ bArr[i]);
        byte[] bArr2 = this.inBuf;
        int i2 = i + 1;
        this.byteCount = i2;
        bArr2[i] = b2;
        int i3 = this.blockSize;
        if (i2 == i3) {
            this.byteCount = 0;
            byte[] bArr3 = this.cfbV;
            System.arraycopy(bArr3, i3, bArr3, 0, bArr3.length - i3);
            byte[] bArr4 = this.inBuf;
            byte[] bArr5 = this.cfbV;
            int length = bArr5.length;
            int i4 = this.blockSize;
            System.arraycopy(bArr4, 0, bArr5, length - i4, i4);
        }
        return b2;
    }

    @Override // org.spongycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b) throws IllegalStateException, DataLengthException {
        return this.encrypting ? encryptByte(b) : decryptByte(b);
    }

    public int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i, this.blockSize, bArr2, i2);
        return this.blockSize;
    }

    public int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i, this.blockSize, bArr2, i2);
        return this.blockSize;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CFB" + (this.blockSize * 8);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    public byte[] getCurrentIV() {
        return Arrays.clone(this.cfbV);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.encrypting = z;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            reset();
            if (cipherParameters != null) {
                this.cipher.init(true, cipherParameters);
                return;
            }
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        int length = iv.length;
        byte[] bArr = this.f206656IV;
        if (length < bArr.length) {
            System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
            int i = 0;
            while (true) {
                byte[] bArr2 = this.f206656IV;
                if (i >= bArr2.length - iv.length) {
                    break;
                }
                bArr2[i] = 0;
                i++;
            }
        } else {
            System.arraycopy(iv, 0, bArr, 0, bArr.length);
        }
        reset();
        if (parametersWithIV.getParameters() != null) {
            this.cipher.init(true, parametersWithIV.getParameters());
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i, this.blockSize, bArr2, i2);
        return this.blockSize;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.f206656IV;
        System.arraycopy(bArr, 0, this.cfbV, 0, bArr.length);
        Arrays.fill(this.inBuf, (byte) 0);
        this.byteCount = 0;
        this.cipher.reset();
    }
}
