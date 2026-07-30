package p149l;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class suw extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    private int f166504a;

    public suw(@NonNull InputStream inputStream) {
        super(inputStream);
        this.f166504a = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: h */
    private long m186028h(long j) {
        int i = this.f166504a;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    /* JADX INFO: renamed from: i */
    private void m186029i(long j) {
        int i = this.f166504a;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f166504a = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.f166504a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        super.mark(i);
        this.f166504a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m186028h(1L) == -1) {
            return -1;
        }
        int i = super.read();
        m186029i(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f166504a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jM186028h = m186028h(j);
        if (jM186028h == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM186028h);
        m186029i(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int iM186028h = (int) m186028h(i2);
        if (iM186028h == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iM186028h);
        m186029i(i3);
        return i3;
    }
}
