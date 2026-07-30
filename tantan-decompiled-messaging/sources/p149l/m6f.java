package p149l;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class m6f extends FilterInputStream {

    /* JADX INFO: renamed from: c */
    private static final byte[] f131674c;

    /* JADX INFO: renamed from: d */
    private static final int f131675d;

    /* JADX INFO: renamed from: e */
    private static final int f131676e;

    /* JADX INFO: renamed from: a */
    private final byte f131677a;

    /* JADX INFO: renamed from: b */
    private int f131678b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f131674c = bArr;
        int length = bArr.length;
        f131675d = length;
        f131676e = length + 2;
    }

    public m6f(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            k250.m144273a("Cannot add invalid orientation: ", i);
            throw null;
        }
        this.f131677a = (byte) i;
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
        int i4 = this.f131678b;
        int i5 = f131676e;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f131677a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f131674c, this.f131678b - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f131678b += i3;
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
            this.f131678b = (int) (((long) this.f131678b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f131678b;
        if (i3 < 2 || i3 > (i2 = f131676e)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f131677a;
        } else {
            i = f131674c[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f131678b++;
        }
        return i;
    }
}
