package p149l;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class u06 extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    private final long f172846a;

    /* JADX INFO: renamed from: b */
    private int f172847b;

    private u06(@NonNull InputStream inputStream, long j) {
        super(inputStream);
        this.f172846a = j;
    }

    /* JADX INFO: renamed from: d */
    private int m191286d(int i) throws IOException {
        if (i >= 0) {
            this.f172847b += i;
            return i;
        }
        if (this.f172846a - ((long) this.f172847b) <= 0) {
            return i;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f172846a + ", but read: " + this.f172847b);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static InputStream m191287e(@NonNull InputStream inputStream, long j) {
        return new u06(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f172846a - ((long) this.f172847b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i;
        i = super.read();
        m191286d(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return m191286d(super.read(bArr, i, i2));
    }
}
