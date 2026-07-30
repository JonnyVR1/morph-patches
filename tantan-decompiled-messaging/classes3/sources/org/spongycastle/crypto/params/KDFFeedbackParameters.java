package org.spongycastle.crypto.params;

import l.ig3;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class KDFFeedbackParameters implements DerivationParameters {
    private static final int UNUSED_R = -1;
    private final byte[] fixedInputData;

    /* JADX INFO: renamed from: iv */
    private final byte[] f10355iv;

    /* JADX INFO: renamed from: ki */
    private final byte[] f10356ki;

    /* JADX INFO: renamed from: r */
    private final int f10357r;
    private final boolean useCounter;

    private KDFFeedbackParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, boolean z) {
        if (bArr == null) {
            ig3.a("A KDF requires Ki (a seed) as input");
            throw null;
        }
        this.f10356ki = Arrays.clone(bArr);
        if (bArr3 == null) {
            this.fixedInputData = new byte[0];
        } else {
            this.fixedInputData = Arrays.clone(bArr3);
        }
        this.f10357r = i;
        if (bArr2 == null) {
            this.f10355iv = new byte[0];
        } else {
            this.f10355iv = Arrays.clone(bArr2);
        }
        this.useCounter = z;
    }

    public static KDFFeedbackParameters createWithCounter(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        if (i == 8 || i == 16 || i == 24 || i == 32) {
            return new KDFFeedbackParameters(bArr, bArr2, bArr3, i, true);
        }
        ig3.a("Length of counter should be 8, 16, 24 or 32");
        return null;
    }

    public static KDFFeedbackParameters createWithoutCounter(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new KDFFeedbackParameters(bArr, bArr2, bArr3, -1, false);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputData);
    }

    public byte[] getIV() {
        return this.f10355iv;
    }

    public byte[] getKI() {
        return this.f10356ki;
    }

    public int getR() {
        return this.f10357r;
    }

    public boolean useCounter() {
        return this.useCounter;
    }
}
