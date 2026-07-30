package org.spongycastle.crypto.params;

import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.util.Arrays;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public final class KDFDoublePipelineIterationParameters implements DerivationParameters {
    private static final int UNUSED_R = 32;
    private final byte[] fixedInputData;

    /* JADX INFO: renamed from: ki */
    private final byte[] f207650ki;

    /* JADX INFO: renamed from: r */
    private final int f207651r;
    private final boolean useCounter;

    private KDFDoublePipelineIterationParameters(byte[] bArr, byte[] bArr2, int i, boolean z) {
        if (bArr == null) {
            wg3.m206174a("A KDF requires Ki (a seed) as input");
            throw null;
        }
        this.f207650ki = Arrays.clone(bArr);
        if (bArr2 == null) {
            this.fixedInputData = new byte[0];
        } else {
            this.fixedInputData = Arrays.clone(bArr2);
        }
        if (i != 8 && i != 16 && i != 24 && i != 32) {
            wg3.m206174a("Length of counter should be 8, 16, 24 or 32");
            throw null;
        }
        this.f207651r = i;
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
        return this.f207650ki;
    }

    public int getR() {
        return this.f207651r;
    }

    public boolean useCounter() {
        return this.useCounter;
    }
}
