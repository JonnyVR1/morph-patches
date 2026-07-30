package p149l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ya80 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final InputStream f197151a;

    /* JADX INFO: renamed from: b */
    public final byte[] f197152b;

    /* JADX INFO: renamed from: c */
    public final twc0<byte[]> f197153c;

    /* JADX INFO: renamed from: d */
    public int f197154d = 0;

    /* JADX INFO: renamed from: e */
    public int f197155e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f197156f = false;

    public ya80(InputStream inputStream, byte[] bArr, twc0<byte[]> twc0Var) {
        this.f197151a = (InputStream) rf80.m179116g(inputStream);
        this.f197152b = (byte[]) rf80.m179116g(bArr);
        this.f197153c = (twc0) rf80.m179116g(twc0Var);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        rf80.m179118i(this.f197155e <= this.f197154d);
        m213807m();
        return (this.f197154d - this.f197155e) + this.f197151a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f197156f) {
            return;
        }
        this.f197156f = true;
        this.f197153c.release(this.f197152b);
        super.close();
    }

    public void finalize() throws Throwable {
        if (!this.f197156f) {
            tsf.m190542h("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m213806k() throws IOException {
        if (this.f197155e < this.f197154d) {
            return true;
        }
        int i = this.f197151a.read(this.f197152b);
        if (i <= 0) {
            return false;
        }
        this.f197154d = i;
        this.f197155e = 0;
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m213807m() throws IOException {
        if (this.f197156f) {
            rhg0.m179353a("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        rf80.m179118i(this.f197155e <= this.f197154d);
        m213807m();
        if (!m213806k()) {
            return -1;
        }
        int iMin = Math.min(this.f197154d - this.f197155e, i2);
        System.arraycopy(this.f197152b, this.f197155e, bArr, i, iMin);
        this.f197155e += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        rf80.m179118i(this.f197155e <= this.f197154d);
        m213807m();
        int i = this.f197154d;
        int i2 = this.f197155e;
        long j2 = i - i2;
        if (j2 >= j) {
            this.f197155e = (int) (((long) i2) + j);
            return j;
        }
        this.f197155e = i;
        return j2 + this.f197151a.skip(j - j2);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        rf80.m179118i(this.f197155e <= this.f197154d);
        m213807m();
        if (!m213806k()) {
            return -1;
        }
        byte[] bArr = this.f197152b;
        int i = this.f197155e;
        this.f197155e = i + 1;
        return bArr[i] & 255;
    }
}
