package p149l;

import com.google.android.exoplayer2.upstream.C2047a;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class d5c extends InputStream {

    /* JADX INFO: renamed from: a */
    public final a5c f84400a;

    /* JADX INFO: renamed from: b */
    public final C2047a f84401b;

    /* JADX INFO: renamed from: f */
    public long f84405f;

    /* JADX INFO: renamed from: d */
    public boolean f84403d = false;

    /* JADX INFO: renamed from: e */
    public boolean f84404e = false;

    /* JADX INFO: renamed from: c */
    public final byte[] f84402c = new byte[1];

    public d5c(a5c a5cVar, C2047a c2047a) {
        this.f84400a = a5cVar;
        this.f84401b = c2047a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f84404e) {
            return;
        }
        this.f84400a.close();
        this.f84404e = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m110048k() throws IOException {
        if (this.f84403d) {
            return;
        }
        this.f84400a.mo11125n(this.f84401b);
        this.f84403d = true;
    }

    /* JADX INFO: renamed from: m */
    public void m110049m() throws IOException {
        m110048k();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        p11.m167013g(!this.f84404e);
        m110048k();
        int i3 = this.f84400a.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f84405f += (long) i3;
        return i3;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f84402c) == -1) {
            return -1;
        }
        return this.f84402c[0] & 255;
    }
}
