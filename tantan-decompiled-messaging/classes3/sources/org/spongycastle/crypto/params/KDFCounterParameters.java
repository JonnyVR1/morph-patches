package org.spongycastle.crypto.params;

import l.ig3;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class KDFCounterParameters implements DerivationParameters {
    private byte[] fixedInputDataCounterPrefix;
    private byte[] fixedInputDataCounterSuffix;

    /* JADX INFO: renamed from: ki */
    private byte[] f10351ki;

    /* JADX INFO: renamed from: r */
    private int f10352r;

    public KDFCounterParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        if (bArr == null) {
            ig3.a("A KDF requires Ki (a seed) as input");
            throw null;
        }
        this.f10351ki = Arrays.clone(bArr);
        if (bArr2 == null) {
            this.fixedInputDataCounterPrefix = new byte[0];
        } else {
            this.fixedInputDataCounterPrefix = Arrays.clone(bArr2);
        }
        if (bArr3 == null) {
            this.fixedInputDataCounterSuffix = new byte[0];
        } else {
            this.fixedInputDataCounterSuffix = Arrays.clone(bArr3);
        }
        if (i == 8 || i == 16 || i == 24 || i == 32) {
            this.f10352r = i;
        } else {
            ig3.a("Length of counter should be 8, 16, 24 or 32");
            throw null;
        }
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputDataCounterSuffix);
    }

    public byte[] getFixedInputDataCounterPrefix() {
        return Arrays.clone(this.fixedInputDataCounterPrefix);
    }

    public byte[] getFixedInputDataCounterSuffix() {
        return Arrays.clone(this.fixedInputDataCounterSuffix);
    }

    public byte[] getKI() {
        return this.f10351ki;
    }

    public int getR() {
        return this.f10352r;
    }

    public KDFCounterParameters(byte[] bArr, byte[] bArr2, int i) {
        this(bArr, null, bArr2, i);
    }
}
