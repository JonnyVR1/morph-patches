package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class q84 {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f153115a;

    /* JADX INFO: renamed from: b */
    public int f153116b;

    /* JADX INFO: renamed from: c */
    public int f153117c;

    /* JADX INFO: renamed from: d */
    public int f153118d;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f153119e;

    /* JADX INFO: renamed from: f */
    public int f153120f;

    /* JADX INFO: renamed from: g */
    public int f153121g;

    /* JADX INFO: renamed from: h */
    public int f153122h;

    /* JADX INFO: renamed from: i */
    public ByteBuffer f153123i;

    /* JADX INFO: renamed from: j */
    public int f153124j;

    /* JADX INFO: renamed from: k */
    public int f153125k;

    /* JADX INFO: renamed from: l */
    public int f153126l;

    /* JADX INFO: renamed from: m */
    public int f153127m;

    /* JADX INFO: renamed from: n */
    public int f153128n;

    /* JADX INFO: renamed from: o */
    public int f153129o;

    /* JADX INFO: renamed from: p */
    public boolean f153130p;

    /* JADX INFO: renamed from: q */
    public byte[] f153131q;

    public q84(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, int i9, int i10, int i11, boolean z) {
        this.f153115a = byteBuffer;
        this.f153116b = i;
        this.f153117c = i2;
        this.f153118d = i3;
        this.f153119e = byteBuffer2;
        this.f153120f = i4;
        this.f153121g = i5;
        this.f153122h = i6;
        this.f153123i = byteBuffer3;
        this.f153124j = i7;
        this.f153125k = i8;
        this.f153126l = i9;
        this.f153127m = i10;
        this.f153128n = i11;
        this.f153130p = z;
    }

    /* JADX INFO: renamed from: a */
    public ByteBuffer m173332a() {
        return this.f153115a;
    }

    /* JADX INFO: renamed from: b */
    public int m173333b() {
        return this.f153118d;
    }

    /* JADX INFO: renamed from: c */
    public int m173334c() {
        return this.f153117c;
    }

    /* JADX INFO: renamed from: d */
    public int m173335d() {
        return this.f153116b;
    }

    /* JADX INFO: renamed from: e */
    public int m173336e() {
        return this.f153128n;
    }

    /* JADX INFO: renamed from: f */
    public int m173337f() {
        return this.f153127m;
    }

    /* JADX INFO: renamed from: g */
    public int m173338g() {
        return this.f153129o;
    }

    /* JADX INFO: renamed from: h */
    public q84 m173339h(int i) {
        this.f153129o = i;
        return this;
    }

    public String toString() {
        return "CameraData{, mColorWidth=" + this.f153116b + ", mColorHeight=" + this.f153117c + ", mColorFrameMode=" + this.f153118d + ", mDepthWidth=" + this.f153120f + ", mDepthHeight=" + this.f153121g + ", mPreviewWidth=" + this.f153127m + ", mPreviewHeight=" + this.f153128n + ", mMirror=" + this.f153130p + '}';
    }

    public q84(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5, int i6, int i7) {
        this(byteBuffer, i, i2, i3, byteBuffer2, i4, i5, i6, i7, false);
    }

    public q84(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5, int i6, int i7, boolean z) {
        this(byteBuffer, i, i2, i3, byteBuffer2, i4, i5, -1, null, 0, 0, -1, i6, i7, z);
    }

    public q84() {
    }
}
