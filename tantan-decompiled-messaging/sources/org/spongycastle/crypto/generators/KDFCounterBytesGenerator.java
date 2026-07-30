package org.spongycastle.crypto.generators;

import com.google.android.gms.common.api.Api;
import java.math.BigInteger;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.MacDerivationFunction;
import org.spongycastle.crypto.params.KDFCounterParameters;
import org.spongycastle.crypto.params.KeyParameter;
import p149l.ap50;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class KDFCounterBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private byte[] fixedInputDataCtrPrefix;
    private byte[] fixedInputData_afterCtr;
    private int generatedBytes;

    /* JADX INFO: renamed from: h */
    private final int f206606h;
    private byte[] ios;

    /* JADX INFO: renamed from: k */
    private byte[] f206607k;
    private int maxSizeExcl;
    private final Mac prf;

    public KDFCounterBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f206606h = macSize;
        this.f206607k = new byte[macSize];
    }

    private void generateNext() {
        int i = (this.generatedBytes / this.f206606h) + 1;
        byte[] bArr = this.ios;
        int length = bArr.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    if (length != 4) {
                        qkq0.m175383a("Unsupported size of counter i");
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
        this.prf.doFinal(this.f206607k, 0);
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = this.generatedBytes;
        int i4 = i3 + i2;
        if (i4 < 0 || i4 >= this.maxSizeExcl) {
            ap50.m98028a("Current KDFCTR may only be used for ", this.maxSizeExcl, " bytes");
            return 0;
        }
        if (i3 % this.f206606h == 0) {
            generateNext();
        }
        int i5 = this.generatedBytes;
        int i6 = this.f206606h;
        int i7 = i5 % i6;
        int iMin = Math.min(i6 - (i5 % i6), i2);
        System.arraycopy(this.f206607k, i7, bArr, i, iMin);
        this.generatedBytes += iMin;
        int i8 = i2 - iMin;
        while (true) {
            i += iMin;
            if (i8 <= 0) {
                return i2;
            }
            generateNext();
            iMin = Math.min(this.f206606h, i8);
            System.arraycopy(this.f206607k, 0, bArr, i, iMin);
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
            ig3.m135964a("Wrong type of arguments given");
            return;
        }
        KDFCounterParameters kDFCounterParameters = (KDFCounterParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFCounterParameters.getKI()));
        this.fixedInputDataCtrPrefix = kDFCounterParameters.getFixedInputDataCounterPrefix();
        this.fixedInputData_afterCtr = kDFCounterParameters.getFixedInputDataCounterSuffix();
        int r = kDFCounterParameters.getR();
        this.ios = new byte[r / 8];
        BigInteger bigIntegerMultiply = TWO.pow(r).multiply(BigInteger.valueOf(this.f206606h));
        this.maxSizeExcl = bigIntegerMultiply.compareTo(INTEGER_MAX) == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : bigIntegerMultiply.intValue();
        this.generatedBytes = 0;
    }
}
