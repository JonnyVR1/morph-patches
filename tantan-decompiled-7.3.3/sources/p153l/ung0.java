package p153l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ung0 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final InputStream f179727a;

    /* JADX INFO: renamed from: b */
    public long f179728b;

    public ung0(InputStream inputStream, long j) {
        this.f179727a = inputStream;
        this.f179728b = j;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f179728b;
        if (j == 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        int i3 = this.f179727a.read(bArr, i, i2);
        if (i3 >= 0) {
            this.f179728b -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.f179727a.skip(Math.min(this.f179728b, j));
        this.f179728b -= jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.f179728b;
        if (j <= 0) {
            return -1;
        }
        this.f179728b = j - 1;
        return this.f179727a.read();
    }
}
