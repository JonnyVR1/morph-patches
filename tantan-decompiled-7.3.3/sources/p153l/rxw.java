package p153l;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class rxw extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    private int f165383a;

    public rxw(@NonNull InputStream inputStream) {
        super(inputStream);
        this.f165383a = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: h */
    private long m183568h(long j) {
        int i = this.f165383a;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    /* JADX INFO: renamed from: i */
    private void m183569i(long j) {
        int i = this.f165383a;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f165383a = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.f165383a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        super.mark(i);
        this.f165383a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m183568h(1L) == -1) {
            return -1;
        }
        int i = super.read();
        m183569i(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f165383a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jM183568h = m183568h(j);
        if (jM183568h == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM183568h);
        m183569i(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int iM183568h = (int) m183568h(i2);
        if (iM183568h == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iM183568h);
        m183569i(i3);
        return i3;
    }
}
