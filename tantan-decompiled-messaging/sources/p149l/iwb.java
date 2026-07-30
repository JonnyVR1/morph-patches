package p149l;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class iwb {

    /* JADX INFO: renamed from: a */
    @Nullable
    public byte[] f115245a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public byte[] f115246b;

    /* JADX INFO: renamed from: c */
    public int f115247c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public int[] f115248d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public int[] f115249e;

    /* JADX INFO: renamed from: f */
    public int f115250f;

    /* JADX INFO: renamed from: g */
    public int f115251g;

    /* JADX INFO: renamed from: h */
    public int f115252h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f115253i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final C17636b f115254j;

    /* JADX INFO: renamed from: l.iwb$b */
    @RequiresApi(24)
    public static final class C17636b {

        /* JADX INFO: renamed from: a */
        public final MediaCodec.CryptoInfo f115255a;

        /* JADX INFO: renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f115256b;

        public C17636b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f115255a = cryptoInfo;
            this.f115256b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: renamed from: b */
        public final void m138724b(int i, int i2) {
            this.f115256b.set(i, i2);
            this.f115255a.setPattern(this.f115256b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iwb() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f115253i = cryptoInfo;
        this.f115254j = vck0.f180948a >= 24 ? new C17636b(cryptoInfo) : null;
    }

    /* JADX INFO: renamed from: a */
    public MediaCodec.CryptoInfo m138720a() {
        return this.f115253i;
    }

    /* JADX INFO: renamed from: b */
    public void m138721b(int i) {
        if (i == 0) {
            return;
        }
        if (this.f115248d == null) {
            int[] iArr = new int[1];
            this.f115248d = iArr;
            this.f115253i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f115248d;
        iArr2[0] = iArr2[0] + i;
    }

    /* JADX INFO: renamed from: c */
    public void m138722c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f115250f = i;
        this.f115248d = iArr;
        this.f115249e = iArr2;
        this.f115246b = bArr;
        this.f115245a = bArr2;
        this.f115247c = i2;
        this.f115251g = i3;
        this.f115252h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f115253i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (vck0.f180948a >= 24) {
            ((C17636b) p11.m167011e(this.f115254j)).m138724b(i3, i4);
        }
    }
}
