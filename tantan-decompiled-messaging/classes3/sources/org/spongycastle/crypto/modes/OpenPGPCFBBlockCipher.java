package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import p003l.npk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class OpenPGPCFBBlockCipher implements BlockCipher {

    /* JADX INFO: renamed from: FR */
    private byte[] f10293FR;
    private byte[] FRE;

    /* JADX INFO: renamed from: IV */
    private byte[] f10294IV;
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;

    public OpenPGPCFBBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.f10294IV = new byte[blockSize];
        this.f10293FR = new byte[blockSize];
        this.FRE = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3;
        int i4;
        int i5 = this.blockSize;
        int i6 = 0;
        if (i + i5 > bArr.length) {
            npk0.m6558a("input buffer too short");
            return 0;
        }
        if (i2 + i5 > bArr2.length) {
            npk0.m6558a("output buffer too short");
            return 0;
        }
        int i7 = this.count;
        int i8 = 2;
        if (i7 > i5) {
            byte b = bArr[i];
            this.f10293FR[i5 - 2] = b;
            bArr2[i2] = encryptByte(b, i5 - 2);
            byte b2 = bArr[i + 1];
            byte[] bArr3 = this.f10293FR;
            int i9 = this.blockSize;
            bArr3[i9 - 1] = b2;
            bArr2[i2 + 1] = encryptByte(b2, i9 - 1);
            this.cipher.processBlock(this.f10293FR, 0, this.FRE, 0);
            while (i8 < this.blockSize) {
                byte b3 = bArr[i + i8];
                int i10 = i8 - 2;
                this.f10293FR[i10] = b3;
                bArr2[i2 + i8] = encryptByte(b3, i10);
                i8++;
            }
        } else if (i7 == 0) {
            this.cipher.processBlock(this.f10293FR, 0, this.FRE, 0);
            while (true) {
                i4 = this.blockSize;
                if (i6 >= i4) {
                    break;
                }
                int i11 = i + i6;
                this.f10293FR[i6] = bArr[i11];
                bArr2[i6] = encryptByte(bArr[i11], i6);
                i6++;
            }
            this.count += i4;
        } else if (i7 == i5) {
            this.cipher.processBlock(this.f10293FR, 0, this.FRE, 0);
            byte b4 = bArr[i];
            byte b5 = bArr[i + 1];
            bArr2[i2] = encryptByte(b4, 0);
            bArr2[i2 + 1] = encryptByte(b5, 1);
            byte[] bArr4 = this.f10293FR;
            System.arraycopy(bArr4, 2, bArr4, 0, this.blockSize - 2);
            byte[] bArr5 = this.f10293FR;
            int i12 = this.blockSize;
            bArr5[i12 - 2] = b4;
            bArr5[i12 - 1] = b5;
            this.cipher.processBlock(bArr5, 0, this.FRE, 0);
            while (true) {
                i3 = this.blockSize;
                if (i8 >= i3) {
                    break;
                }
                byte b6 = bArr[i + i8];
                int i13 = i8 - 2;
                this.f10293FR[i13] = b6;
                bArr2[i2 + i8] = encryptByte(b6, i13);
                i8++;
            }
            this.count += i3;
        }
        return this.blockSize;
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3;
        int i4;
        int i5 = this.blockSize;
        int i6 = 0;
        if (i + i5 > bArr.length) {
            npk0.m6558a("input buffer too short");
            return 0;
        }
        if (i2 + i5 > bArr2.length) {
            npk0.m6558a("output buffer too short");
            return 0;
        }
        int i7 = this.count;
        int i8 = 2;
        if (i7 > i5) {
            byte[] bArr3 = this.f10293FR;
            int i9 = i5 - 2;
            byte bEncryptByte = encryptByte(bArr[i], i5 - 2);
            bArr2[i2] = bEncryptByte;
            bArr3[i9] = bEncryptByte;
            byte[] bArr4 = this.f10293FR;
            int i10 = this.blockSize;
            int i11 = i10 - 1;
            byte bEncryptByte2 = encryptByte(bArr[i + 1], i10 - 1);
            bArr2[i2 + 1] = bEncryptByte2;
            bArr4[i11] = bEncryptByte2;
            this.cipher.processBlock(this.f10293FR, 0, this.FRE, 0);
            while (i8 < this.blockSize) {
                byte[] bArr5 = this.f10293FR;
                int i12 = i8 - 2;
                byte bEncryptByte3 = encryptByte(bArr[i + i8], i12);
                bArr2[i2 + i8] = bEncryptByte3;
                bArr5[i12] = bEncryptByte3;
                i8++;
            }
        } else if (i7 == 0) {
            this.cipher.processBlock(this.f10293FR, 0, this.FRE, 0);
            while (true) {
                i4 = this.blockSize;
                if (i6 >= i4) {
                    break;
                }
                byte[] bArr6 = this.f10293FR;
                byte bEncryptByte4 = encryptByte(bArr[i + i6], i6);
                bArr2[i2 + i6] = bEncryptByte4;
                bArr6[i6] = bEncryptByte4;
                i6++;
            }
            this.count += i4;
        } else if (i7 == i5) {
            this.cipher.processBlock(this.f10293FR, 0, this.FRE, 0);
            bArr2[i2] = encryptByte(bArr[i], 0);
            bArr2[i2 + 1] = encryptByte(bArr[i + 1], 1);
            byte[] bArr7 = this.f10293FR;
            System.arraycopy(bArr7, 2, bArr7, 0, this.blockSize - 2);
            System.arraycopy(bArr2, i2, this.f10293FR, this.blockSize - 2, 2);
            this.cipher.processBlock(this.f10293FR, 0, this.FRE, 0);
            while (true) {
                i3 = this.blockSize;
                if (i8 >= i3) {
                    break;
                }
                byte[] bArr8 = this.f10293FR;
                int i13 = i8 - 2;
                byte bEncryptByte5 = encryptByte(bArr[i + i8], i13);
                bArr2[i2 + i8] = bEncryptByte5;
                bArr8[i13] = bEncryptByte5;
                i8++;
            }
            this.count += i3;
        }
        return this.blockSize;
    }

    private byte encryptByte(byte b, int i) {
        return (byte) (this.FRE[i] ^ b);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/OpenPGPCFB";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.forEncryption = z;
        reset();
        this.cipher.init(true, cipherParameters);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        return this.forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
        this.count = 0;
        byte[] bArr = this.f10294IV;
        byte[] bArr2 = this.f10293FR;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.cipher.reset();
    }
}
