package p149l;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class nlx0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public byte[] f139592a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public byte[] f139593b;

    /* JADX INFO: renamed from: c */
    public int f139594c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public int[] f139595d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public int[] f139596e;

    /* JADX INFO: renamed from: f */
    public int f139597f;

    /* JADX INFO: renamed from: g */
    public int f139598g;

    /* JADX INFO: renamed from: h */
    public int f139599h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f139600i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final ilx0 f139601j;

    public nlx0() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f139600i = cryptoInfo;
        this.f139601j = ggw0.f102568a >= 24 ? new ilx0(cryptoInfo, null) : null;
    }

    /* JADX INFO: renamed from: a */
    public final MediaCodec.CryptoInfo m160077a() {
        return this.f139600i;
    }

    /* JADX INFO: renamed from: b */
    public final void m160078b(int i) {
        if (i == 0) {
            return;
        }
        if (this.f139595d == null) {
            int[] iArr = new int[1];
            this.f139595d = iArr;
            this.f139600i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f139595d;
        iArr2[0] = iArr2[0] + i;
    }

    /* JADX INFO: renamed from: c */
    public final void m160079c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f139597f = i;
        this.f139595d = iArr;
        this.f139596e = iArr2;
        this.f139593b = bArr;
        this.f139592a = bArr2;
        this.f139594c = i2;
        this.f139598g = i3;
        this.f139599h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f139600i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (ggw0.f102568a >= 24) {
            ilx0 ilx0Var = this.f139601j;
            ilx0Var.getClass();
            ilx0.m137057a(ilx0Var, i3, i4);
        }
    }
}
