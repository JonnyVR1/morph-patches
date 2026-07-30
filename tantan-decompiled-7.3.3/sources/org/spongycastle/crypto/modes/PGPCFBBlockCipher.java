package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.ParametersWithIV;
import p153l.tyk0;

/* JADX INFO: loaded from: classes3.dex */
public class PGPCFBBlockCipher implements BlockCipher {

    /* JADX INFO: renamed from: FR */
    private byte[] f207592FR;
    private byte[] FRE;

    /* JADX INFO: renamed from: IV */
    private byte[] f207593IV;
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;
    private boolean inlineIv;
    private byte[] tmp;

    public PGPCFBBlockCipher(BlockCipher blockCipher, boolean z) {
        this.cipher = blockCipher;
        this.inlineIv = z;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.f207593IV = new byte[blockSize];
        this.f207592FR = new byte[blockSize];
        this.FRE = new byte[blockSize];
        this.tmp = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3 = this.blockSize;
        int i4 = 0;
        if (i + i3 > bArr.length) {
            tyk0.m193596a("input buffer too short");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            tyk0.m193596a("output buffer too short");
            return 0;
        }
        this.cipher.processBlock(this.f207592FR, 0, this.FRE, 0);
        for (int i5 = 0; i5 < this.blockSize; i5++) {
            bArr2[i2 + i5] = encryptByte(bArr[i + i5], i5);
        }
        while (true) {
            int i6 = this.blockSize;
            if (i4 >= i6) {
                return i6;
            }
            this.f207592FR[i4] = bArr[i + i4];
            i4++;
        }
    }

    private int decryptBlockWithIV(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3;
        byte[] bArr3;
        int i4 = this.blockSize;
        if (i + i4 > bArr.length) {
            tyk0.m193596a("input buffer too short");
            return 0;
        }
        if (i2 + i4 > bArr2.length) {
            tyk0.m193596a("output buffer too short");
            return 0;
        }
        int i5 = this.count;
        if (i5 == 0) {
            for (int i6 = 0; i6 < this.blockSize; i6++) {
                this.f207592FR[i6] = bArr[i + i6];
            }
            this.cipher.processBlock(this.f207592FR, 0, this.FRE, 0);
            this.count += this.blockSize;
            return 0;
        }
        if (i5 != i4) {
            if (i5 >= i4 + 2) {
                System.arraycopy(bArr, i, this.tmp, 0, i4);
                bArr2[i2] = encryptByte(this.tmp[0], this.blockSize - 2);
                bArr2[i2 + 1] = encryptByte(this.tmp[1], this.blockSize - 1);
                System.arraycopy(this.tmp, 0, this.f207592FR, this.blockSize - 2, 2);
                this.cipher.processBlock(this.f207592FR, 0, this.FRE, 0);
                int i7 = 0;
                while (true) {
                    i3 = this.blockSize;
                    int i8 = i3 - 2;
                    bArr3 = this.tmp;
                    if (i7 >= i8) {
                        break;
                    }
                    bArr2[i2 + i7 + 2] = encryptByte(bArr3[i7 + 2], i7);
                    i7++;
                }
                System.arraycopy(bArr3, 2, this.f207592FR, 0, i3 - 2);
            }
            return this.blockSize;
        }
        System.arraycopy(bArr, i, this.tmp, 0, i4);
        byte[] bArr4 = this.f207592FR;
        System.arraycopy(bArr4, 2, bArr4, 0, this.blockSize - 2);
        byte[] bArr5 = this.f207592FR;
        int i9 = this.blockSize;
        byte[] bArr6 = this.tmp;
        bArr5[i9 - 2] = bArr6[0];
        bArr5[i9 - 1] = bArr6[1];
        this.cipher.processBlock(bArr5, 0, this.FRE, 0);
        int i10 = 0;
        while (true) {
            int i11 = this.blockSize;
            int i12 = i11 - 2;
            byte[] bArr7 = this.tmp;
            if (i10 >= i12) {
                System.arraycopy(bArr7, 2, this.f207592FR, 0, i11 - 2);
                this.count += 2;
                return this.blockSize - 2;
            }
            bArr2[i2 + i10] = encryptByte(bArr7[i10 + 2], i10);
            i10++;
        }
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3 = this.blockSize;
        int i4 = 0;
        if (i + i3 > bArr.length) {
            tyk0.m193596a("input buffer too short");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            tyk0.m193596a("output buffer too short");
            return 0;
        }
        this.cipher.processBlock(this.f207592FR, 0, this.FRE, 0);
        for (int i5 = 0; i5 < this.blockSize; i5++) {
            bArr2[i2 + i5] = encryptByte(bArr[i + i5], i5);
        }
        while (true) {
            int i6 = this.blockSize;
            if (i4 >= i6) {
                return i6;
            }
            this.f207592FR[i4] = bArr2[i2 + i4];
            i4++;
        }
    }

    private int encryptBlockWithIV(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3;
        int i4;
        int i5 = this.blockSize;
        if (i + i5 > bArr.length) {
            tyk0.m193596a("input buffer too short");
            return 0;
        }
        int i6 = this.count;
        if (i6 != 0) {
            if (i6 >= i5 + 2) {
                if (i5 + i2 > bArr2.length) {
                    tyk0.m193596a("output buffer too short");
                    return 0;
                }
                this.cipher.processBlock(this.f207592FR, 0, this.FRE, 0);
                int i7 = 0;
                while (true) {
                    i3 = this.blockSize;
                    if (i7 >= i3) {
                        break;
                    }
                    bArr2[i2 + i7] = encryptByte(bArr[i + i7], i7);
                    i7++;
                }
                System.arraycopy(bArr2, i2, this.f207592FR, 0, i3);
            }
            return this.blockSize;
        }
        if ((i5 * 2) + i2 + 2 > bArr2.length) {
            tyk0.m193596a("output buffer too short");
            return 0;
        }
        this.cipher.processBlock(this.f207592FR, 0, this.FRE, 0);
        int i8 = 0;
        while (true) {
            i4 = this.blockSize;
            if (i8 >= i4) {
                break;
            }
            bArr2[i2 + i8] = encryptByte(this.f207593IV[i8], i8);
            i8++;
        }
        System.arraycopy(bArr2, i2, this.f207592FR, 0, i4);
        this.cipher.processBlock(this.f207592FR, 0, this.FRE, 0);
        int i9 = this.blockSize;
        bArr2[i2 + i9] = encryptByte(this.f207593IV[i9 - 2], 0);
        int i10 = this.blockSize;
        bArr2[i2 + i10 + 1] = encryptByte(this.f207593IV[i10 - 1], 1);
        System.arraycopy(bArr2, i2 + 2, this.f207592FR, 0, this.blockSize);
        this.cipher.processBlock(this.f207592FR, 0, this.FRE, 0);
        int i11 = 0;
        while (true) {
            int i12 = this.blockSize;
            if (i11 >= i12) {
                System.arraycopy(bArr2, i2 + i12 + 2, this.f207592FR, 0, i12);
                int i13 = this.count;
                int i14 = this.blockSize;
                this.count = i13 + (i14 * 2) + 2;
                return (i14 * 2) + 2;
            }
            bArr2[i12 + i2 + 2 + i11] = encryptByte(bArr[i + i11], i11);
            i11++;
        }
    }

    private byte encryptByte(byte b, int i) {
        return (byte) (this.FRE[i] ^ b);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        boolean z = this.inlineIv;
        BlockCipher blockCipher = this.cipher;
        if (z) {
            return blockCipher.getAlgorithmName() + "/PGPCFBwithIV";
        }
        return blockCipher.getAlgorithmName() + "/PGPCFB";
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
        if (!(cipherParameters instanceof ParametersWithIV)) {
            reset();
            this.cipher.init(true, cipherParameters);
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        int length = iv.length;
        byte[] bArr = this.f207593IV;
        if (length < bArr.length) {
            System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
            int i = 0;
            while (true) {
                byte[] bArr2 = this.f207593IV;
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
        this.cipher.init(true, parametersWithIV.getParameters());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        boolean z = this.inlineIv;
        boolean z2 = this.forEncryption;
        if (z) {
            return z2 ? encryptBlockWithIV(bArr, i, bArr2, i2) : decryptBlockWithIV(bArr, i, bArr2, i2);
        }
        return z2 ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
        this.count = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f207592FR;
            if (i == bArr.length) {
                this.cipher.reset();
                return;
            }
            if (this.inlineIv) {
                bArr[i] = 0;
            } else {
                bArr[i] = this.f207593IV[i];
            }
            i++;
        }
    }
}
