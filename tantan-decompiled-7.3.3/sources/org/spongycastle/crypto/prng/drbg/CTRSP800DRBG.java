package org.spongycastle.crypto.prng.drbg;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.prng.EntropySource;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.encoders.Hex;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class CTRSP800DRBG implements SP80090DRBG {
    private static final int AES_MAX_BITS_REQUEST = 262144;
    private static final long AES_RESEED_MAX = 140737488355328L;
    private static final byte[] K_BITS = Hex.decode("000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F");
    private static final int TDEA_MAX_BITS_REQUEST = 4096;
    private static final long TDEA_RESEED_MAX = 2147483648L;
    private byte[] _Key;

    /* JADX INFO: renamed from: _V */
    private byte[] f207673_V;
    private BlockCipher _engine;
    private EntropySource _entropySource;
    private boolean _isTDEA;
    private int _keySizeInBits;
    private long _reseedCounter = 0;
    private int _securityStrength;
    private int _seedLength;

    public CTRSP800DRBG(BlockCipher blockCipher, int i, int i2, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this._isTDEA = false;
        this._entropySource = entropySource;
        this._engine = blockCipher;
        this._keySizeInBits = i;
        this._securityStrength = i2;
        this._seedLength = (blockCipher.getBlockSize() * 8) + i;
        this._isTDEA = isTDEA(blockCipher);
        if (i2 > 256) {
            wg3.m206174a("Requested security strength is not supported by the derivation function");
            throw null;
        }
        if (getMaxSecurityStrength(blockCipher, i) < i2) {
            wg3.m206174a("Requested security strength is not supported by block cipher and key size");
            throw null;
        }
        if (entropySource.entropySize() >= i2) {
            CTR_DRBG_Instantiate_algorithm(getEntropy(), bArr2, bArr);
        } else {
            wg3.m206174a("Not enough entropy for security strength required");
            throw null;
        }
    }

    private void BCC(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int blockSize = this._engine.getBlockSize();
        byte[] bArr5 = new byte[blockSize];
        int length = bArr4.length / blockSize;
        byte[] bArr6 = new byte[blockSize];
        this._engine.init(true, new KeyParameter(expandKey(bArr2)));
        this._engine.processBlock(bArr3, 0, bArr5, 0);
        for (int i = 0; i < length; i++) {
            XOR(bArr6, bArr5, bArr4, i * blockSize);
            this._engine.processBlock(bArr6, 0, bArr5, 0);
        }
        System.arraycopy(bArr5, 0, bArr, 0, bArr.length);
    }

    private byte[] Block_Cipher_df(byte[] bArr, int i) {
        int blockSize = this._engine.getBlockSize();
        int length = bArr.length;
        byte[] bArr2 = new byte[((((length + 9) + blockSize) - 1) / blockSize) * blockSize];
        copyIntToByteArray(bArr2, length, 0);
        copyIntToByteArray(bArr2, i / 8, 4);
        System.arraycopy(bArr, 0, bArr2, 8, length);
        bArr2[length + 8] = -128;
        int i2 = this._keySizeInBits;
        int i3 = (i2 / 8) + blockSize;
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[blockSize];
        byte[] bArr5 = new byte[blockSize];
        int i4 = i2 / 8;
        byte[] bArr6 = new byte[i4];
        System.arraycopy(K_BITS, 0, bArr6, 0, i4);
        int i5 = 0;
        while (true) {
            int i6 = i5 * blockSize;
            if (i6 * 8 >= this._keySizeInBits + (blockSize * 8)) {
                break;
            }
            copyIntToByteArray(bArr5, i5, 0);
            BCC(bArr4, bArr6, bArr5, bArr2);
            int i7 = i3 - i6;
            if (i7 > blockSize) {
                i7 = blockSize;
            }
            System.arraycopy(bArr4, 0, bArr3, i6, i7);
            i5++;
        }
        byte[] bArr7 = new byte[blockSize];
        System.arraycopy(bArr3, 0, bArr6, 0, i4);
        System.arraycopy(bArr3, i4, bArr7, 0, blockSize);
        int i8 = i / 2;
        byte[] bArr8 = new byte[i8];
        this._engine.init(true, new KeyParameter(expandKey(bArr6)));
        int i9 = 0;
        while (true) {
            int i10 = i9 * blockSize;
            if (i10 >= i8) {
                return bArr8;
            }
            this._engine.processBlock(bArr7, 0, bArr7, 0);
            int i11 = i8 - i10;
            if (i11 > blockSize) {
                i11 = blockSize;
            }
            System.arraycopy(bArr7, 0, bArr8, i10, i11);
            i9++;
        }
    }

    private void CTR_DRBG_Instantiate_algorithm(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArrBlock_Cipher_df = Block_Cipher_df(Arrays.concatenate(bArr, bArr2, bArr3), this._seedLength);
        int blockSize = this._engine.getBlockSize();
        byte[] bArr4 = new byte[(this._keySizeInBits + 7) / 8];
        this._Key = bArr4;
        byte[] bArr5 = new byte[blockSize];
        this.f207673_V = bArr5;
        CTR_DRBG_Update(bArrBlock_Cipher_df, bArr4, bArr5);
        this._reseedCounter = 1L;
    }

    private void CTR_DRBG_Reseed_algorithm(byte[] bArr) {
        CTR_DRBG_Update(Block_Cipher_df(Arrays.concatenate(getEntropy(), bArr), this._seedLength), this._Key, this.f207673_V);
        this._reseedCounter = 1L;
    }

    private void CTR_DRBG_Update(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr.length;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[this._engine.getBlockSize()];
        int blockSize = this._engine.getBlockSize();
        this._engine.init(true, new KeyParameter(expandKey(bArr2)));
        int i = 0;
        while (true) {
            int i2 = i * blockSize;
            if (i2 >= bArr.length) {
                XOR(bArr4, bArr, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
                System.arraycopy(bArr4, bArr2.length, bArr3, 0, bArr3.length);
                return;
            } else {
                addOneTo(bArr3);
                this._engine.processBlock(bArr3, 0, bArr5, 0);
                int i3 = length - i2;
                if (i3 > blockSize) {
                    i3 = blockSize;
                }
                System.arraycopy(bArr5, 0, bArr4, i2, i3);
                i++;
            }
        }
    }

    private void XOR(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) (bArr2[i2] ^ bArr3[i2 + i]);
        }
    }

    private void addOneTo(byte[] bArr) {
        int i = 1;
        for (int i2 = 1; i2 <= bArr.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & 255) + i;
            i = i3 > 255 ? 1 : 0;
            bArr[bArr.length - i2] = (byte) i3;
        }
    }

    private void copyIntToByteArray(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    private byte[] getEntropy() {
        byte[] entropy = this._entropySource.getEntropy();
        if (entropy.length >= (this._securityStrength + 7) / 8) {
            return entropy;
        }
        wtq0.m207906a("Insufficient entropy provided by entropy source");
        return null;
    }

    private int getMaxSecurityStrength(BlockCipher blockCipher, int i) {
        if (isTDEA(blockCipher) && i == 168) {
            return 112;
        }
        if (blockCipher.getAlgorithmName().equals("AES")) {
            return i;
        }
        return -1;
    }

    private boolean isTDEA(BlockCipher blockCipher) {
        return blockCipher.getAlgorithmName().equals("DESede") || blockCipher.getAlgorithmName().equals("TDEA");
    }

    private void padKey(byte[] bArr, int i, byte[] bArr2, int i2) {
        bArr2[i2] = (byte) (bArr[i] & 254);
        int i3 = i + 1;
        bArr2[i2 + 1] = (byte) ((bArr[i] << 7) | ((bArr[i3] & 252) >>> 1));
        int i4 = bArr[i3] << 6;
        int i5 = i + 2;
        bArr2[i2 + 2] = (byte) (i4 | ((bArr[i5] & 248) >>> 2));
        int i6 = bArr[i5] << 5;
        int i7 = i + 3;
        bArr2[i2 + 3] = (byte) (i6 | ((bArr[i7] & 240) >>> 3));
        int i8 = bArr[i7] << 4;
        int i9 = i + 4;
        bArr2[i2 + 4] = (byte) (i8 | ((bArr[i9] & 224) >>> 4));
        int i10 = bArr[i9] << 3;
        int i11 = i + 5;
        bArr2[i2 + 5] = (byte) (i10 | ((bArr[i11] & 192) >>> 5));
        int i12 = i + 6;
        bArr2[i2 + 6] = (byte) ((bArr[i11] << 2) | ((bArr[i12] & 128) >>> 6));
        int i13 = i2 + 7;
        bArr2[i13] = (byte) (bArr[i12] << 1);
        while (i2 <= i13) {
            byte b = bArr2[i2];
            bArr2[i2] = (byte) (((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1) | (b & 254));
            i2++;
        }
    }

    public byte[] expandKey(byte[] bArr) {
        if (!this._isTDEA) {
            return bArr;
        }
        byte[] bArr2 = new byte[24];
        padKey(bArr, 0, bArr2, 0);
        padKey(bArr, 7, bArr2, 8);
        padKey(bArr, 14, bArr2, 16);
        return bArr2;
    }

    @Override // org.spongycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z) {
        byte[] bArrBlock_Cipher_df;
        boolean z2 = this._isTDEA;
        long j = this._reseedCounter;
        if (z2) {
            if (j > 2147483648L) {
                return -1;
            }
            if (Utils.isTooLarge(bArr, 512)) {
                wg3.m206174a("Number of bits per request limited to 4096");
                return 0;
            }
        } else {
            if (j > AES_RESEED_MAX) {
                return -1;
            }
            if (Utils.isTooLarge(bArr, 32768)) {
                wg3.m206174a("Number of bits per request limited to 262144");
                return 0;
            }
        }
        if (z) {
            CTR_DRBG_Reseed_algorithm(bArr2);
            bArr2 = null;
        }
        int i = this._seedLength;
        if (bArr2 != null) {
            bArrBlock_Cipher_df = Block_Cipher_df(bArr2, i);
            CTR_DRBG_Update(bArrBlock_Cipher_df, this._Key, this.f207673_V);
        } else {
            bArrBlock_Cipher_df = new byte[i];
        }
        int length = this.f207673_V.length;
        byte[] bArr3 = new byte[length];
        this._engine.init(true, new KeyParameter(expandKey(this._Key)));
        for (int i2 = 0; i2 <= bArr.length / length; i2++) {
            int i3 = i2 * length;
            int length2 = bArr.length - i3 > length ? length : bArr.length - (this.f207673_V.length * i2);
            if (length2 != 0) {
                addOneTo(this.f207673_V);
                this._engine.processBlock(this.f207673_V, 0, bArr3, 0);
                System.arraycopy(bArr3, 0, bArr, i3, length2);
            }
        }
        CTR_DRBG_Update(bArrBlock_Cipher_df, this._Key, this.f207673_V);
        this._reseedCounter++;
        return bArr.length * 8;
    }

    @Override // org.spongycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this.f207673_V.length * 8;
    }

    @Override // org.spongycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        CTR_DRBG_Reseed_algorithm(bArr);
    }
}
