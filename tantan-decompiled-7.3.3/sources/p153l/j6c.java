package p153l;

import com.google.android.exoplayer2.upstream.C2070a;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class j6c extends InputStream {

    /* JADX INFO: renamed from: a */
    public final g6c f118540a;

    /* JADX INFO: renamed from: b */
    public final C2070a f118541b;

    /* JADX INFO: renamed from: f */
    public long f118545f;

    /* JADX INFO: renamed from: d */
    public boolean f118543d = false;

    /* JADX INFO: renamed from: e */
    public boolean f118544e = false;

    /* JADX INFO: renamed from: c */
    public final byte[] f118542c = new byte[1];

    public j6c(g6c g6cVar, C2070a c2070a) {
        this.f118540a = g6cVar;
        this.f118541b = c2070a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f118544e) {
            return;
        }
        this.f118540a.close();
        this.f118544e = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m143635k() throws IOException {
        if (this.f118543d) {
            return;
        }
        this.f118540a.mo11179n(this.f118541b);
        this.f118543d = true;
    }

    /* JADX INFO: renamed from: m */
    public void m143636m() throws IOException {
        m143635k();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        w11.m204371g(!this.f118544e);
        m143635k();
        int i3 = this.f118540a.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f118545f += (long) i3;
        return i3;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f118542c) == -1) {
            return -1;
        }
        return this.f118542c[0] & 255;
    }
}
