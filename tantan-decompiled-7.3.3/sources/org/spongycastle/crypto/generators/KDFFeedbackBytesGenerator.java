package org.spongycastle.crypto.generators;

import com.google.android.gms.common.api.Api;
import java.math.BigInteger;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.MacDerivationFunction;
import org.spongycastle.crypto.params.KDFFeedbackParameters;
import org.spongycastle.crypto.params.KeyParameter;
import p153l.gx50;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class KDFFeedbackBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private byte[] fixedInputData;
    private int generatedBytes;

    /* JADX INFO: renamed from: h */
    private final int f207533h;
    private byte[] ios;

    /* JADX INFO: renamed from: iv */
    private byte[] f207534iv;

    /* JADX INFO: renamed from: k */
    private byte[] f207535k;
    private int maxSizeExcl;
    private final Mac prf;
    private boolean useCounter;

    public KDFFeedbackBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f207533h = macSize;
        this.f207535k = new byte[macSize];
    }

    private void generateNext() {
        int i = this.generatedBytes;
        Mac mac = this.prf;
        if (i == 0) {
            byte[] bArr = this.f207534iv;
            mac.update(bArr, 0, bArr.length);
        } else {
            byte[] bArr2 = this.f207535k;
            mac.update(bArr2, 0, bArr2.length);
        }
        if (this.useCounter) {
            int i2 = (this.generatedBytes / this.f207533h) + 1;
            byte[] bArr3 = this.ios;
            int length = bArr3.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            wtq0.m207906a("Unsupported size of counter i");
                            return;
                        }
                        bArr3[0] = (byte) (i2 >>> 24);
                    }
                    bArr3[bArr3.length - 3] = (byte) (i2 >>> 16);
                }
                bArr3[bArr3.length - 2] = (byte) (i2 >>> 8);
            }
            bArr3[bArr3.length - 1] = (byte) i2;
            this.prf.update(bArr3, 0, bArr3.length);
        }
        Mac mac2 = this.prf;
        byte[] bArr4 = this.fixedInputData;
        mac2.update(bArr4, 0, bArr4.length);
        this.prf.doFinal(this.f207535k, 0);
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = this.generatedBytes;
        int i4 = i3 + i2;
        if (i4 < 0 || i4 >= this.maxSizeExcl) {
            gx50.m132745a("Current KDFCTR may only be used for ", this.maxSizeExcl, " bytes");
            return 0;
        }
        if (i3 % this.f207533h == 0) {
            generateNext();
        }
        int i5 = this.generatedBytes;
        int i6 = this.f207533h;
        int i7 = i5 % i6;
        int iMin = Math.min(i6 - (i5 % i6), i2);
        System.arraycopy(this.f207535k, i7, bArr, i, iMin);
        this.generatedBytes += iMin;
        int i8 = i2 - iMin;
        while (true) {
            i += iMin;
            if (i8 <= 0) {
                return i2;
            }
            generateNext();
            iMin = Math.min(this.f207533h, i8);
            System.arraycopy(this.f207535k, 0, bArr, i, iMin);
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
        if (!(derivationParameters instanceof KDFFeedbackParameters)) {
            wg3.m206174a("Wrong type of arguments given");
            return;
        }
        KDFFeedbackParameters kDFFeedbackParameters = (KDFFeedbackParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFFeedbackParameters.getKI()));
        this.fixedInputData = kDFFeedbackParameters.getFixedInputData();
        int r = kDFFeedbackParameters.getR();
        this.ios = new byte[r / 8];
        boolean zUseCounter = kDFFeedbackParameters.useCounter();
        int iIntValue = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (zUseCounter) {
            BigInteger bigIntegerMultiply = TWO.pow(r).multiply(BigInteger.valueOf(this.f207533h));
            if (bigIntegerMultiply.compareTo(INTEGER_MAX) != 1) {
                iIntValue = bigIntegerMultiply.intValue();
            }
            this.maxSizeExcl = iIntValue;
        } else {
            this.maxSizeExcl = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.f207534iv = kDFFeedbackParameters.getIV();
        this.useCounter = kDFFeedbackParameters.useCounter();
        this.generatedBytes = 0;
    }
}
