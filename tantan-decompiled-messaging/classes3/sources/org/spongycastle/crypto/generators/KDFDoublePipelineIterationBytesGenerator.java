package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import l.ig3;
import l.qkq0;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.MacDerivationFunction;
import org.spongycastle.crypto.params.KDFDoublePipelineIterationParameters;
import org.spongycastle.crypto.params.KeyParameter;
import p003l.ap50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class KDFDoublePipelineIterationBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: a */
    private byte[] f10233a;
    private byte[] fixedInputData;
    private int generatedBytes;

    /* JADX INFO: renamed from: h */
    private final int f10234h;
    private byte[] ios;

    /* JADX INFO: renamed from: k */
    private byte[] f10235k;
    private int maxSizeExcl;
    private final Mac prf;
    private boolean useCounter;

    public KDFDoublePipelineIterationBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f10234h = macSize;
        this.f10233a = new byte[macSize];
        this.f10235k = new byte[macSize];
    }

    private void generateNext() {
        int i = this.generatedBytes;
        Mac mac = this.prf;
        if (i == 0) {
            byte[] bArr = this.fixedInputData;
            mac.update(bArr, 0, bArr.length);
            this.prf.doFinal(this.f10233a, 0);
        } else {
            byte[] bArr2 = this.f10233a;
            mac.update(bArr2, 0, bArr2.length);
            this.prf.doFinal(this.f10233a, 0);
        }
        Mac mac2 = this.prf;
        byte[] bArr3 = this.f10233a;
        mac2.update(bArr3, 0, bArr3.length);
        if (this.useCounter) {
            int i2 = (this.generatedBytes / this.f10234h) + 1;
            byte[] bArr4 = this.ios;
            int length = bArr4.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            qkq0.a("Unsupported size of counter i");
                            return;
                        }
                        bArr4[0] = (byte) (i2 >>> 24);
                    }
                    bArr4[bArr4.length - 3] = (byte) (i2 >>> 16);
                }
                bArr4[bArr4.length - 2] = (byte) (i2 >>> 8);
            }
            bArr4[bArr4.length - 1] = (byte) i2;
            this.prf.update(bArr4, 0, bArr4.length);
        }
        Mac mac3 = this.prf;
        byte[] bArr5 = this.fixedInputData;
        mac3.update(bArr5, 0, bArr5.length);
        this.prf.doFinal(this.f10235k, 0);
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = this.generatedBytes;
        int i4 = i3 + i2;
        if (i4 < 0 || i4 >= this.maxSizeExcl) {
            ap50.m2905a("Current KDFCTR may only be used for ", this.maxSizeExcl, " bytes");
            return 0;
        }
        if (i3 % this.f10234h == 0) {
            generateNext();
        }
        int i5 = this.generatedBytes;
        int i6 = this.f10234h;
        int i7 = i5 % i6;
        int iMin = Math.min(i6 - (i5 % i6), i2);
        System.arraycopy(this.f10235k, i7, bArr, i, iMin);
        this.generatedBytes += iMin;
        int i8 = i2 - iMin;
        while (true) {
            i += iMin;
            if (i8 <= 0) {
                return i2;
            }
            generateNext();
            iMin = Math.min(this.f10234h, i8);
            System.arraycopy(this.f10235k, 0, bArr, i, iMin);
            this.generatedBytes += iMin;
            i8 -= iMin;
        }
    }

    @Override // org.spongycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.prf;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFDoublePipelineIterationParameters)) {
            ig3.a("Wrong type of arguments given");
            return;
        }
        KDFDoublePipelineIterationParameters kDFDoublePipelineIterationParameters = (KDFDoublePipelineIterationParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFDoublePipelineIterationParameters.getKI()));
        this.fixedInputData = kDFDoublePipelineIterationParameters.getFixedInputData();
        int r = kDFDoublePipelineIterationParameters.getR();
        this.ios = new byte[r / 8];
        if (kDFDoublePipelineIterationParameters.useCounter()) {
            BigInteger bigIntegerMultiply = TWO.pow(r).multiply(BigInteger.valueOf(this.f10234h));
            this.maxSizeExcl = bigIntegerMultiply.compareTo(INTEGER_MAX) != 1 ? bigIntegerMultiply.intValue() : Integer.MAX_VALUE;
        } else {
            this.maxSizeExcl = Integer.MAX_VALUE;
        }
        this.useCounter = kDFDoublePipelineIterationParameters.useCounter();
        this.generatedBytes = 0;
    }
}
