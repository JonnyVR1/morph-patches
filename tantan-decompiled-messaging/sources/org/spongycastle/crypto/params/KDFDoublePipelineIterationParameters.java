package org.spongycastle.crypto.params;

import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.util.Arrays;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public final class KDFDoublePipelineIterationParameters implements DerivationParameters {
    private static final int UNUSED_R = 32;
    private final byte[] fixedInputData;

    /* JADX INFO: renamed from: ki */
    private final byte[] f206728ki;

    /* JADX INFO: renamed from: r */
    private final int f206729r;
    private final boolean useCounter;

    private KDFDoublePipelineIterationParameters(byte[] bArr, byte[] bArr2, int i, boolean z) {
        if (bArr == null) {
            ig3.m135964a("A KDF requires Ki (a seed) as input");
            throw null;
        }
        this.f206728ki = Arrays.clone(bArr);
        if (bArr2 == null) {
            this.fixedInputData = new byte[0];
        } else {
            this.fixedInputData = Arrays.clone(bArr2);
        }
        if (i != 8 && i != 16 && i != 24 && i != 32) {
            ig3.m135964a("Length of counter should be 8, 16, 24 or 32");
            throw null;
        }
        this.f206729r = i;
        this.useCounter = z;
    }

    public static KDFDoublePipelineIterationParameters createWithCounter(byte[] bArr, byte[] bArr2, int i) {
        return new KDFDoublePipelineIterationParameters(bArr, bArr2, i, true);
    }

    public static KDFDoublePipelineIterationParameters createWithoutCounter(byte[] bArr, byte[] bArr2) {
        return new KDFDoublePipelineIterationParameters(bArr, bArr2, 32, false);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputData);
    }

    public byte[] getKI() {
        return this.f206728ki;
    }

    public int getR() {
        return this.f206729r;
    }

    public boolean useCounter() {
        return this.useCounter;
    }
}
