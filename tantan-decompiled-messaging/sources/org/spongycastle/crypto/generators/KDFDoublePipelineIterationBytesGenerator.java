package org.spongycastle.crypto.generators;

import com.google.android.gms.common.api.Api;
import java.math.BigInteger;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.MacDerivationFunction;
import org.spongycastle.crypto.params.KDFDoublePipelineIterationParameters;
import org.spongycastle.crypto.params.KeyParameter;
import p149l.ap50;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class KDFDoublePipelineIterationBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: a */
    private byte[] f206608a;
    private byte[] fixedInputData;
    private int generatedBytes;

    /* JADX INFO: renamed from: h */
    private final int f206609h;
    private byte[] ios;

    /* JADX INFO: renamed from: k */
    private byte[] f206610k;
    private int maxSizeExcl;
    private final Mac prf;
    private boolean useCounter;

    public KDFDoublePipelineIterationBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f206609h = macSize;
        this.f206608a = new byte[macSize];
        this.f206610k = new byte[macSize];
    }

    private void generateNext() {
        int i = this.generatedBytes;
        Mac mac = this.prf;
        if (i == 0) {
            byte[] bArr = this.fixedInputData;
            mac.update(bArr, 0, bArr.length);
            this.prf.doFinal(this.f206608a, 0);
        } else {
            byte[] bArr2 = this.f206608a;
            mac.update(bArr2, 0, bArr2.length);
            this.prf.doFinal(this.f206608a, 0);
        }
        Mac mac2 = this.prf;
        byte[] bArr3 = this.f206608a;
        mac2.update(bArr3, 0, bArr3.length);
        if (this.useCounter) {
            int i2 = (this.generatedBytes / this.f206609h) + 1;
            byte[] bArr4 = this.ios;
            int length = bArr4.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            qkq0.m175383a("Unsupported size of counter i");
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
        this.prf.doFinal(this.f206610k, 0);
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = this.generatedBytes;
        int i4 = i3 + i2;
        if (i4 < 0 || i4 >= this.maxSizeExcl) {
            ap50.m98028a("Current KDFCTR may only be used for ", this.maxSizeExcl, " bytes");
            return 0;
        }
        if (i3 % this.f206609h == 0) {
            generateNext();
        }
        int i5 = this.generatedBytes;
        int i6 = this.f206609h;
        int i7 = i5 % i6;
        int iMin = Math.min(i6 - (i5 % i6), i2);
        System.arraycopy(this.f206610k, i7, bArr, i, iMin);
        this.generatedBytes += iMin;
        int i8 = i2 - iMin;
        while (true) {
            i += iMin;
            if (i8 <= 0) {
                return i2;
            }
            generateNext();
            iMin = Math.min(this.f206609h, i8);
            System.arraycopy(this.f206610k, 0, bArr, i, iMin);
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
            ig3.m135964a("Wrong type of arguments given");
            return;
        }
        KDFDoublePipelineIterationParameters kDFDoublePipelineIterationParameters = (KDFDoublePipelineIterationParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFDoublePipelineIterationParameters.getKI()));
        this.fixedInputData = kDFDoublePipelineIterationParameters.getFixedInputData();
        int r = kDFDoublePipelineIterationParameters.getR();
        this.ios = new byte[r / 8];
        boolean zUseCounter = kDFDoublePipelineIterationParameters.useCounter();
        int iIntValue = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (zUseCounter) {
            BigInteger bigIntegerMultiply = TWO.pow(r).multiply(BigInteger.valueOf(this.f206609h));
            if (bigIntegerMultiply.compareTo(INTEGER_MAX) != 1) {
                iIntValue = bigIntegerMultiply.intValue();
            }
            this.maxSizeExcl = iIntValue;
        } else {
            this.maxSizeExcl = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.useCounter = kDFDoublePipelineIterationParameters.useCounter();
        this.generatedBytes = 0;
    }
}
