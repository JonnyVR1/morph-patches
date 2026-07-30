package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class p94 {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f151090a;

    /* JADX INFO: renamed from: b */
    public int f151091b;

    /* JADX INFO: renamed from: c */
    public int f151092c;

    /* JADX INFO: renamed from: d */
    public int f151093d;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f151094e;

    /* JADX INFO: renamed from: f */
    public int f151095f;

    /* JADX INFO: renamed from: g */
    public int f151096g;

    /* JADX INFO: renamed from: h */
    public int f151097h;

    /* JADX INFO: renamed from: i */
    public ByteBuffer f151098i;

    /* JADX INFO: renamed from: j */
    public int f151099j;

    /* JADX INFO: renamed from: k */
    public int f151100k;

    /* JADX INFO: renamed from: l */
    public int f151101l;

    /* JADX INFO: renamed from: m */
    public int f151102m;

    /* JADX INFO: renamed from: n */
    public int f151103n;

    /* JADX INFO: renamed from: o */
    public int f151104o;

    /* JADX INFO: renamed from: p */
    public boolean f151105p;

    /* JADX INFO: renamed from: q */
    public byte[] f151106q;

    public p94(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, int i9, int i10, int i11, boolean z) {
        this.f151090a = byteBuffer;
        this.f151091b = i;
        this.f151092c = i2;
        this.f151093d = i3;
        this.f151094e = byteBuffer2;
        this.f151095f = i4;
        this.f151096g = i5;
        this.f151097h = i6;
        this.f151098i = byteBuffer3;
        this.f151099j = i7;
        this.f151100k = i8;
        this.f151101l = i9;
        this.f151102m = i10;
        this.f151103n = i11;
        this.f151105p = z;
    }

    /* JADX INFO: renamed from: a */
    public ByteBuffer m171334a() {
        return this.f151090a;
    }

    /* JADX INFO: renamed from: b */
    public int m171335b() {
        return this.f151093d;
    }

    /* JADX INFO: renamed from: c */
    public int m171336c() {
        return this.f151092c;
    }

    /* JADX INFO: renamed from: d */
    public int m171337d() {
        return this.f151091b;
    }

    /* JADX INFO: renamed from: e */
    public int m171338e() {
        return this.f151103n;
    }

    /* JADX INFO: renamed from: f */
    public int m171339f() {
        return this.f151102m;
    }

    /* JADX INFO: renamed from: g */
    public int m171340g() {
        return this.f151104o;
    }

    /* JADX INFO: renamed from: h */
    public p94 m171341h(int i) {
        this.f151104o = i;
        return this;
    }

    public String toString() {
        return "CameraData{, mColorWidth=" + this.f151091b + ", mColorHeight=" + this.f151092c + ", mColorFrameMode=" + this.f151093d + ", mDepthWidth=" + this.f151095f + ", mDepthHeight=" + this.f151096g + ", mPreviewWidth=" + this.f151102m + ", mPreviewHeight=" + this.f151103n + ", mMirror=" + this.f151105p + '}';
    }

    public p94(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5, int i6, int i7) {
        this(byteBuffer, i, i2, i3, byteBuffer2, i4, i5, i6, i7, false);
    }

    public p94(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5, int i6, int i7, boolean z) {
        this(byteBuffer, i, i2, i3, byteBuffer2, i4, i5, -1, null, 0, 0, -1, i6, i7, z);
    }

    public p94() {
    }
}
