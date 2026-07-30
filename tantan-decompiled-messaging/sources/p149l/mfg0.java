package p149l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class mfg0 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final InputStream f133591a;

    /* JADX INFO: renamed from: b */
    public long f133592b;

    public mfg0(InputStream inputStream, long j) {
        this.f133591a = inputStream;
        this.f133592b = j;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f133592b;
        if (j == 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        int i3 = this.f133591a.read(bArr, i, i2);
        if (i3 >= 0) {
            this.f133592b -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.f133591a.skip(Math.min(this.f133592b, j));
        this.f133592b -= jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.f133592b;
        if (j <= 0) {
            return -1;
        }
        this.f133592b = j - 1;
        return this.f133591a.read();
    }
}
