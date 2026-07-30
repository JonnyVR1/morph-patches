package org.spongycastle.crypto.engines;

import l.ig3;
import l.qkq0;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;
import p003l.dql;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RFC5649WrapEngine implements Wrapper {
    private BlockCipher engine;
    private byte[] extractedAIV = null;
    private boolean forWrapping;
    private byte[] highOrderIV;
    private KeyParameter param;
    private byte[] preIV;

    public RFC5649WrapEngine(BlockCipher blockCipher) {
        byte[] bArr = {-90, 89, 89, -90};
        this.highOrderIV = bArr;
        this.preIV = bArr;
        this.engine = blockCipher;
    }

    private byte[] padPlaintext(byte[] bArr) {
        int length = bArr.length;
        int i = (8 - (length % 8)) % 8;
        byte[] bArr2 = new byte[length + i];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        if (i != 0) {
            System.arraycopy(new byte[i], 0, bArr2, length, i);
        }
        return bArr2;
    }

    private byte[] rfc3394UnwrapNoIvCheck(byte[] bArr, int i, int i2) {
        int i3 = i2 - 8;
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[8];
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, i, bArr3, 0, 8);
        System.arraycopy(bArr, i + 8, bArr2, 0, i3);
        this.engine.init(false, this.param);
        int i4 = (i2 / 8) - 1;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = i4; i6 >= 1; i6--) {
                System.arraycopy(bArr3, 0, bArr4, 0, 8);
                int i7 = (i6 - 1) * 8;
                System.arraycopy(bArr2, i7, bArr4, 8, 8);
                int i8 = (i4 * i5) + i6;
                int i9 = 1;
                while (i8 != 0) {
                    int i10 = 8 - i9;
                    bArr4[i10] = (byte) (((byte) i8) ^ bArr4[i10]);
                    i8 >>>= 8;
                    i9++;
                }
                this.engine.processBlock(bArr4, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr2, i7, 8);
            }
        }
        this.extractedAIV = bArr3;
        return bArr2;
    }

    @Override // org.spongycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.Wrapper
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forWrapping = z;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.param = (KeyParameter) cipherParameters;
            return;
        }
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.preIV = parametersWithIV.getIV();
            this.param = (KeyParameter) parametersWithIV.getParameters();
            if (this.preIV.length == 4) {
                return;
            }
            ig3.a("IV length not equal to 4");
        }
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArrRfc3394UnwrapNoIvCheck;
        if (this.forWrapping) {
            qkq0.a("not set for unwrapping");
            return null;
        }
        int i3 = i2 / 8;
        if (i3 * 8 != i2) {
            dql.m3633a("unwrap data must be a multiple of 8 bytes");
            return null;
        }
        if (i3 == 1) {
            dql.m3633a("unwrap data must be at least 16 bytes");
            return null;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        byte[] bArr3 = new byte[i2];
        if (i3 == 2) {
            this.engine.init(false, this.param);
            int blockSize = 0;
            while (blockSize < i2) {
                this.engine.processBlock(bArr2, blockSize, bArr3, blockSize);
                blockSize += this.engine.getBlockSize();
            }
            byte[] bArr4 = new byte[8];
            this.extractedAIV = bArr4;
            System.arraycopy(bArr3, 0, bArr4, 0, bArr4.length);
            byte[] bArr5 = this.extractedAIV;
            int length = i2 - bArr5.length;
            bArrRfc3394UnwrapNoIvCheck = new byte[length];
            System.arraycopy(bArr3, bArr5.length, bArrRfc3394UnwrapNoIvCheck, 0, length);
        } else {
            bArrRfc3394UnwrapNoIvCheck = rfc3394UnwrapNoIvCheck(bArr, i, i2);
        }
        byte[] bArr6 = new byte[4];
        byte[] bArr7 = new byte[4];
        System.arraycopy(this.extractedAIV, 0, bArr6, 0, 4);
        System.arraycopy(this.extractedAIV, 4, bArr7, 0, 4);
        int iBigEndianToInt = Pack.bigEndianToInt(bArr7, 0);
        boolean zConstantTimeAreEqual = Arrays.constantTimeAreEqual(bArr6, this.preIV);
        int length2 = bArrRfc3394UnwrapNoIvCheck.length;
        if (iBigEndianToInt <= length2 - 8) {
            zConstantTimeAreEqual = false;
        }
        if (iBigEndianToInt > length2) {
            zConstantTimeAreEqual = false;
        }
        int length3 = length2 - iBigEndianToInt;
        if (length3 >= bArrRfc3394UnwrapNoIvCheck.length) {
            length3 = bArrRfc3394UnwrapNoIvCheck.length;
            zConstantTimeAreEqual = false;
        }
        byte[] bArr8 = new byte[length3];
        System.arraycopy(bArrRfc3394UnwrapNoIvCheck, bArrRfc3394UnwrapNoIvCheck.length - length3, bArr8, 0, length3);
        if (!Arrays.constantTimeAreEqual(bArr8, new byte[length3])) {
            zConstantTimeAreEqual = false;
        }
        if (!zConstantTimeAreEqual) {
            dql.m3633a("checksum failed");
            return null;
        }
        byte[] bArr9 = new byte[iBigEndianToInt];
        System.arraycopy(bArrRfc3394UnwrapNoIvCheck, 0, bArr9, 0, iBigEndianToInt);
        return bArr9;
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        if (!this.forWrapping) {
            qkq0.a("not set for wrapping");
            return null;
        }
        byte[] bArr2 = new byte[8];
        byte[] bArrIntToBigEndian = Pack.intToBigEndian(i2);
        byte[] bArr3 = this.preIV;
        int blockSize = 0;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        System.arraycopy(bArrIntToBigEndian, 0, bArr2, this.preIV.length, bArrIntToBigEndian.length);
        byte[] bArr4 = new byte[i2];
        System.arraycopy(bArr, i, bArr4, 0, i2);
        byte[] bArrPadPlaintext = padPlaintext(bArr4);
        if (bArrPadPlaintext.length != 8) {
            RFC3394WrapEngine rFC3394WrapEngine = new RFC3394WrapEngine(this.engine);
            rFC3394WrapEngine.init(true, new ParametersWithIV(this.param, bArr2));
            return rFC3394WrapEngine.wrap(bArrPadPlaintext, 0, bArrPadPlaintext.length);
        }
        int length = bArrPadPlaintext.length + 8;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, 8);
        System.arraycopy(bArrPadPlaintext, 0, bArr5, 8, bArrPadPlaintext.length);
        this.engine.init(true, this.param);
        while (blockSize < length) {
            this.engine.processBlock(bArr5, blockSize, bArr5, blockSize);
            blockSize += this.engine.getBlockSize();
        }
        return bArr5;
    }
}
