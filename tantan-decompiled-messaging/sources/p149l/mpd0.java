package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class mpd0 {

    /* JADX INFO: renamed from: a */
    public byte[] f135035a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f135036b;

    /* JADX INFO: renamed from: c */
    public long f135037c;

    /* JADX INFO: renamed from: d */
    public String f135038d;

    /* JADX INFO: renamed from: e */
    public int f135039e;

    /* JADX INFO: renamed from: f */
    public int f135040f;

    /* JADX INFO: renamed from: g */
    private boolean f135041g;

    public mpd0(byte[] bArr, long j, int i) {
        this.f135036b = null;
        this.f135037c = 0L;
        this.f135038d = null;
        this.f135039e = 0;
        this.f135040f = 2;
        this.f135041g = true;
        this.f135035a = bArr;
        this.f135036b = ByteBuffer.wrap(bArr);
        this.f135040f = i;
        this.f135037c = j;
        if (bArr != null) {
            this.f135039e = bArr.length;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m155798a() {
        return this.f135041g;
    }

    /* JADX INFO: renamed from: b */
    public ByteBuffer m155799b() {
        return this.f135036b;
    }

    /* JADX INFO: renamed from: c */
    public byte[] m155800c() {
        return this.f135035a;
    }

    /* JADX INFO: renamed from: d */
    public long m155801d() {
        return this.f135037c;
    }

    /* JADX INFO: renamed from: e */
    public int m155802e() {
        return this.f135039e;
    }

    /* JADX INFO: renamed from: f */
    public void m155803f() {
        this.f135039e = 0;
        this.f135035a = null;
        this.f135036b = null;
        this.f135037c = 0L;
        this.f135038d = null;
    }

    /* JADX INFO: renamed from: g */
    public void m155804g(boolean z) {
        this.f135041g = z;
    }

    public mpd0(ByteBuffer byteBuffer, long j, int i) {
        this.f135035a = null;
        this.f135038d = null;
        this.f135039e = 0;
        this.f135041g = true;
        this.f135036b = byteBuffer;
        this.f135037c = j;
        this.f135040f = i;
        byte[] bArrArray = byteBuffer.array();
        this.f135035a = bArrArray;
        if (bArrArray != null) {
            this.f135039e = this.f135036b.limit();
        }
    }

    public mpd0() {
        this.f135036b = null;
        this.f135040f = 2;
        this.f135041g = true;
        this.f135039e = 0;
        this.f135035a = new byte[0];
        this.f135037c = 0L;
        this.f135038d = null;
    }
}
