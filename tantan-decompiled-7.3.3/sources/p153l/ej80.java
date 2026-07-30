package p153l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ej80 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final InputStream f94276a;

    /* JADX INFO: renamed from: b */
    public final byte[] f94277b;

    /* JADX INFO: renamed from: c */
    public final w4d0<byte[]> f94278c;

    /* JADX INFO: renamed from: d */
    public int f94279d = 0;

    /* JADX INFO: renamed from: e */
    public int f94280e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f94281f = false;

    public ej80(InputStream inputStream, byte[] bArr, w4d0<byte[]> w4d0Var) {
        this.f94276a = (InputStream) wn80.m207182g(inputStream);
        this.f94277b = (byte[]) wn80.m207182g(bArr);
        this.f94278c = (w4d0) wn80.m207182g(w4d0Var);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        wn80.m207184i(this.f94280e <= this.f94279d);
        m120981m();
        return (this.f94279d - this.f94280e) + this.f94276a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f94281f) {
            return;
        }
        this.f94281f = true;
        this.f94278c.release(this.f94277b);
        super.close();
    }

    public void finalize() throws Throwable {
        if (!this.f94281f) {
            huf.m137180h("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m120980k() throws IOException {
        if (this.f94280e < this.f94279d) {
            return true;
        }
        int i = this.f94276a.read(this.f94277b);
        if (i <= 0) {
            return false;
        }
        this.f94279d = i;
        this.f94280e = 0;
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m120981m() throws IOException {
        if (this.f94281f) {
            zpg0.m220844a("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        wn80.m207184i(this.f94280e <= this.f94279d);
        m120981m();
        if (!m120980k()) {
            return -1;
        }
        int iMin = Math.min(this.f94279d - this.f94280e, i2);
        System.arraycopy(this.f94277b, this.f94280e, bArr, i, iMin);
        this.f94280e += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        wn80.m207184i(this.f94280e <= this.f94279d);
        m120981m();
        int i = this.f94279d;
        int i2 = this.f94280e;
        long j2 = i - i2;
        if (j2 >= j) {
            this.f94280e = (int) (((long) i2) + j);
            return j;
        }
        this.f94280e = i;
        return j2 + this.f94276a.skip(j - j2);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        wn80.m207184i(this.f94280e <= this.f94279d);
        m120981m();
        if (!m120980k()) {
            return -1;
        }
        byte[] bArr = this.f94277b;
        int i = this.f94280e;
        this.f94280e = i + 1;
        return bArr[i] & 255;
    }
}
