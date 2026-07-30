package p153l;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class z16 extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    private final long f202482a;

    /* JADX INFO: renamed from: b */
    private int f202483b;

    private z16(@NonNull InputStream inputStream, long j) {
        super(inputStream);
        this.f202482a = j;
    }

    /* JADX INFO: renamed from: d */
    private int m218277d(int i) throws IOException {
        if (i >= 0) {
            this.f202483b += i;
            return i;
        }
        if (this.f202482a - ((long) this.f202483b) <= 0) {
            return i;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f202482a + ", but read: " + this.f202483b);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static InputStream m218278e(@NonNull InputStream inputStream, long j) {
        return new z16(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f202482a - ((long) this.f202483b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i;
        i = super.read();
        m218277d(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return m218277d(super.read(bArr, i, i2));
    }
}
