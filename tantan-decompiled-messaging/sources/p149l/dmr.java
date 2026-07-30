package p149l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class dmr extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public int f86983a;

    /* JADX INFO: renamed from: b */
    public int f86984b;

    public dmr(InputStream inputStream, int i) {
        super(inputStream);
        inputStream.getClass();
        if (i < 0) {
            ig3.m135964a("limit must be >= 0");
            throw null;
        }
        this.f86983a = i;
        this.f86984b = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(((FilterInputStream) this).in.available(), this.f86983a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i);
            this.f86984b = this.f86983a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f86983a;
        if (i3 == 0) {
            return -1;
        }
        int i4 = ((FilterInputStream) this).in.read(bArr, i, Math.min(i2, i3));
        if (i4 > 0) {
            this.f86983a -= i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            rhg0.m179353a("mark is not supported");
        } else if (this.f86984b == -1) {
            rhg0.m179353a("mark not set");
        } else {
            ((FilterInputStream) this).in.reset();
            this.f86983a = this.f86984b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.f86983a));
        this.f86983a = (int) (((long) this.f86983a) - jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f86983a == 0) {
            return -1;
        }
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f86983a--;
        }
        return i;
    }
}
