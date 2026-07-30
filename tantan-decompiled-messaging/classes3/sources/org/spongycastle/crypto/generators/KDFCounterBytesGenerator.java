package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import l.ig3;
import l.qkq0;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.MacDerivationFunction;
import org.spongycastle.crypto.params.KDFCounterParameters;
import org.spongycastle.crypto.params.KeyParameter;
import p003l.ap50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class KDFCounterBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private byte[] fixedInputDataCtrPrefix;
    private byte[] fixedInputData_afterCtr;
    private int generatedBytes;

    /* JADX INFO: renamed from: h */
    private final int f10231h;
    private byte[] ios;

    /* JADX INFO: renamed from: k */
    private byte[] f10232k;
    private int maxSizeExcl;
    private final Mac prf;

    public KDFCounterBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f10231h = macSize;
        this.f10232k = new byte[macSize];
    }

    private void generateNext() {
        int i = (this.generatedBytes / this.f10231h) + 1;
        byte[] bArr = this.ios;
        int length = bArr.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    if (length != 4) {
                        qkq0.a("Unsupported size of counter i");
                        return;
                    }
                    bArr[0] = (byte) (i >>> 24);
                }
                bArr[bArr.length - 3] = (byte) (i >>> 16);
            }
            bArr[bArr.length - 2] = (byte) (i >>> 8);
        }
        bArr[bArr.length - 1] = (byte) i;
        Mac mac = this.prf;
        byte[] bArr2 = this.fixedInputDataCtrPrefix;
        mac.update(bArr2, 0, bArr2.length);
        Mac mac2 = this.prf;
        byte[] bArr3 = this.ios;
        mac2.update(bArr3, 0, bArr3.length);
        Mac mac3 = this.prf;
        byte[] bArr4 = this.fixedInputData_afterCtr;
        mac3.update(bArr4, 0, bArr4.length);
        this.prf.doFinal(this.f10232k, 0);
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = this.generatedBytes;
        int i4 = i3 + i2;
        if (i4 < 0 || i4 >= this.maxSizeExcl) {
            ap50.m2905a("Current KDFCTR may only be used for ", this.maxSizeExcl, " bytes");
            return 0;
        }
        if (i3 % this.f10231h == 0) {
            generateNext();
        }
        int i5 = this.generatedBytes;
        int i6 = this.f10231h;
        int i7 = i5 % i6;
        int iMin = Math.min(i6 - (i5 % i6), i2);
        System.arraycopy(this.f10232k, i7, bArr, i, iMin);
        this.generatedBytes += iMin;
        int i8 = i2 - iMin;
        while (true) {
            i += iMin;
            if (i8 <= 0) {
                return i2;
            }
            generateNext();
            iMin = Math.min(this.f10231h, i8);
            System.arraycopy(this.f10232k, 0, bArr, i, iMin);
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
        if (!(derivationParameters instanceof KDFCounterParameters)) {
            ig3.a("Wrong type of arguments given");
            return;
        }
        KDFCounterParameters kDFCounterParameters = (KDFCounterParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFCounterParameters.getKI()));
        this.fixedInputDataCtrPrefix = kDFCounterParameters.getFixedInputDataCounterPrefix();
        this.fixedInputData_afterCtr = kDFCounterParameters.getFixedInputDataCounterSuffix();
        int r = kDFCounterParameters.getR();
        this.ios = new byte[r / 8];
        BigInteger bigIntegerMultiply = TWO.pow(r).multiply(BigInteger.valueOf(this.f10231h));
        this.maxSizeExcl = bigIntegerMultiply.compareTo(INTEGER_MAX) == 1 ? Integer.MAX_VALUE : bigIntegerMultiply.intValue();
        this.generatedBytes = 0;
    }
}
