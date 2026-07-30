package p153l;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wxb {

    /* JADX INFO: renamed from: a */
    @Nullable
    public byte[] f191469a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public byte[] f191470b;

    /* JADX INFO: renamed from: c */
    public int f191471c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public int[] f191472d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public int[] f191473e;

    /* JADX INFO: renamed from: f */
    public int f191474f;

    /* JADX INFO: renamed from: g */
    public int f191475g;

    /* JADX INFO: renamed from: h */
    public int f191476h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f191477i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final C21198b f191478j;

    /* JADX INFO: renamed from: l.wxb$b */
    @RequiresApi(24)
    public static final class C21198b {

        /* JADX INFO: renamed from: a */
        public final MediaCodec.CryptoInfo f191479a;

        /* JADX INFO: renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f191480b;

        public C21198b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f191479a = cryptoInfo;
            this.f191480b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: renamed from: b */
        public final void m208400b(int i, int i2) {
            this.f191480b.set(i, i2);
            this.f191479a.setPattern(this.f191480b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wxb() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f191477i = cryptoInfo;
        this.f191478j = bmk0.f77313a >= 24 ? new C21198b(cryptoInfo) : null;
    }

    /* JADX INFO: renamed from: a */
    public MediaCodec.CryptoInfo m208396a() {
        return this.f191477i;
    }

    /* JADX INFO: renamed from: b */
    public void m208397b(int i) {
        if (i == 0) {
            return;
        }
        if (this.f191472d == null) {
            int[] iArr = new int[1];
            this.f191472d = iArr;
            this.f191477i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f191472d;
        iArr2[0] = iArr2[0] + i;
    }

    /* JADX INFO: renamed from: c */
    public void m208398c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f191474f = i;
        this.f191472d = iArr;
        this.f191473e = iArr2;
        this.f191470b = bArr;
        this.f191469a = bArr2;
        this.f191471c = i2;
        this.f191475g = i3;
        this.f191476h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f191477i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (bmk0.f77313a >= 24) {
            ((C21198b) w11.m204369e(this.f191478j)).m208400b(i3, i4);
        }
    }
}
