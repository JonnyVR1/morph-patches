package p153l;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class tux0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public byte[] f176221a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public byte[] f176222b;

    /* JADX INFO: renamed from: c */
    public int f176223c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public int[] f176224d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public int[] f176225e;

    /* JADX INFO: renamed from: f */
    public int f176226f;

    /* JADX INFO: renamed from: g */
    public int f176227g;

    /* JADX INFO: renamed from: h */
    public int f176228h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f176229i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final oux0 f176230j;

    public tux0() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f176229i = cryptoInfo;
        this.f176230j = mpw0.f137957a >= 24 ? new oux0(cryptoInfo, null) : null;
    }

    /* JADX INFO: renamed from: a */
    public final MediaCodec.CryptoInfo m192763a() {
        return this.f176229i;
    }

    /* JADX INFO: renamed from: b */
    public final void m192764b(int i) {
        if (i == 0) {
            return;
        }
        if (this.f176224d == null) {
            int[] iArr = new int[1];
            this.f176224d = iArr;
            this.f176229i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f176224d;
        iArr2[0] = iArr2[0] + i;
    }

    /* JADX INFO: renamed from: c */
    public final void m192765c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f176226f = i;
        this.f176224d = iArr;
        this.f176225e = iArr2;
        this.f176222b = bArr;
        this.f176221a = bArr2;
        this.f176223c = i2;
        this.f176227g = i3;
        this.f176228h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f176229i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (mpw0.f137957a >= 24) {
            oux0 oux0Var = this.f176230j;
            oux0Var.getClass();
            oux0.m169409a(oux0Var, i3, i4);
        }
    }
}
