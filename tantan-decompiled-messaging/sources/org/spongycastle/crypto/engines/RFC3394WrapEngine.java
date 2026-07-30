package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.Arrays;
import p149l.dql;
import p149l.ig3;
import p149l.npk0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class RFC3394WrapEngine implements Wrapper {
    private BlockCipher engine;
    private boolean forWrapping;

    /* JADX INFO: renamed from: iv */
    private byte[] f206567iv;
    private KeyParameter param;
    private boolean wrapCipherMode;

    public RFC3394WrapEngine(BlockCipher blockCipher, boolean z) {
        this.f206567iv = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
        this.engine = blockCipher;
        this.wrapCipherMode = !z;
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
            this.f206567iv = parametersWithIV.getIV();
            this.param = (KeyParameter) parametersWithIV.getParameters();
            if (this.f206567iv.length == 8) {
                return;
            }
            ig3.m135964a("IV not equal to 8");
        }
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.forWrapping) {
            qkq0.m175383a("not set for unwrapping");
            return null;
        }
        int i3 = i2 / 8;
        if (i3 * 8 != i2) {
            dql.m113082a("unwrap data must be a multiple of 8 bytes");
            return null;
        }
        byte[] bArr2 = this.f206567iv;
        byte[] bArr3 = new byte[i2 - bArr2.length];
        byte[] bArr4 = new byte[bArr2.length];
        byte[] bArr5 = new byte[bArr2.length + 8];
        System.arraycopy(bArr, i, bArr4, 0, bArr2.length);
        byte[] bArr6 = this.f206567iv;
        System.arraycopy(bArr, i + bArr6.length, bArr3, 0, i2 - bArr6.length);
        this.engine.init(!this.wrapCipherMode, this.param);
        int i4 = i3 - 1;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = i4; i6 >= 1; i6--) {
                System.arraycopy(bArr4, 0, bArr5, 0, this.f206567iv.length);
                int i7 = (i6 - 1) * 8;
                System.arraycopy(bArr3, i7, bArr5, this.f206567iv.length, 8);
                int i8 = (i4 * i5) + i6;
                int i9 = 1;
                while (i8 != 0) {
                    int length = this.f206567iv.length - i9;
                    bArr5[length] = (byte) (((byte) i8) ^ bArr5[length]);
                    i8 >>>= 8;
                    i9++;
                }
                this.engine.processBlock(bArr5, 0, bArr5, 0);
                System.arraycopy(bArr5, 0, bArr4, 0, 8);
                System.arraycopy(bArr5, 8, bArr3, i7, 8);
            }
        }
        if (Arrays.constantTimeAreEqual(bArr4, this.f206567iv)) {
            return bArr3;
        }
        dql.m113082a("checksum failed");
        return null;
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        if (!this.forWrapping) {
            qkq0.m175383a("not set for wrapping");
            return null;
        }
        int i3 = i2 / 8;
        if (i3 * 8 != i2) {
            npk0.m160508a("wrap data must be a multiple of 8 bytes");
            return null;
        }
        byte[] bArr2 = this.f206567iv;
        byte[] bArr3 = new byte[bArr2.length + i2];
        byte[] bArr4 = new byte[bArr2.length + 8];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, this.f206567iv.length, i2);
        this.engine.init(this.wrapCipherMode, this.param);
        for (int i4 = 0; i4 != 6; i4++) {
            for (int i5 = 1; i5 <= i3; i5++) {
                System.arraycopy(bArr3, 0, bArr4, 0, this.f206567iv.length);
                int i6 = i5 * 8;
                System.arraycopy(bArr3, i6, bArr4, this.f206567iv.length, 8);
                this.engine.processBlock(bArr4, 0, bArr4, 0);
                int i7 = (i3 * i4) + i5;
                int i8 = 1;
                while (i7 != 0) {
                    int length = this.f206567iv.length - i8;
                    bArr4[length] = (byte) (((byte) i7) ^ bArr4[length]);
                    i7 >>>= 8;
                    i8++;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr3, i6, 8);
            }
        }
        return bArr3;
    }

    public RFC3394WrapEngine(BlockCipher blockCipher) {
        this(blockCipher, false);
    }
}
