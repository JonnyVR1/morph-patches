package p153l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class eor extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public int f94941a;

    /* JADX INFO: renamed from: b */
    public int f94942b;

    public eor(InputStream inputStream, int i) {
        super(inputStream);
        inputStream.getClass();
        if (i < 0) {
            wg3.m206174a("limit must be >= 0");
            throw null;
        }
        this.f94941a = i;
        this.f94942b = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(((FilterInputStream) this).in.available(), this.f94941a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i);
            this.f94942b = this.f94941a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f94941a;
        if (i3 == 0) {
            return -1;
        }
        int i4 = ((FilterInputStream) this).in.read(bArr, i, Math.min(i2, i3));
        if (i4 > 0) {
            this.f94941a -= i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            zpg0.m220844a("mark is not supported");
        } else if (this.f94942b == -1) {
            zpg0.m220844a("mark not set");
        } else {
            ((FilterInputStream) this).in.reset();
            this.f94941a = this.f94942b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.f94941a));
        this.f94941a = (int) (((long) this.f94941a) - jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f94941a == 0) {
            return -1;
        }
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f94941a--;
        }
        return i;
    }
}
