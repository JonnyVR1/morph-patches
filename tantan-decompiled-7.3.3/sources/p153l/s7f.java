package p153l;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class s7f extends FilterInputStream {

    /* JADX INFO: renamed from: c */
    private static final byte[] f166683c;

    /* JADX INFO: renamed from: d */
    private static final int f166684d;

    /* JADX INFO: renamed from: e */
    private static final int f166685e;

    /* JADX INFO: renamed from: a */
    private final byte f166686a;

    /* JADX INFO: renamed from: b */
    private int f166687b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f166683c = bArr;
        int length = bArr.length;
        f166684d = length;
        f166685e = length + 2;
    }

    public s7f(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            za50.m219101a("Cannot add invalid orientation: ", i);
            throw null;
        }
        this.f166686a = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f166687b;
        int i5 = f166685e;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f166686a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f166683c, this.f166687b - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f166687b += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f166687b = (int) (((long) this.f166687b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f166687b;
        if (i3 < 2 || i3 > (i2 = f166685e)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f166686a;
        } else {
            i = f166683c[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f166687b++;
        }
        return i;
    }
}
