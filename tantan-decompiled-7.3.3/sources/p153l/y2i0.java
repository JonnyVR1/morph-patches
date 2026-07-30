package p153l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class y2i0 extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public final byte[] f197259a;

    /* JADX INFO: renamed from: b */
    public int f197260b;

    /* JADX INFO: renamed from: c */
    public int f197261c;

    public y2i0(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.f197259a = bArr;
    }

    /* JADX INFO: renamed from: k */
    public final int m214089k() {
        int i = this.f197260b;
        byte[] bArr = this.f197259a;
        if (i >= bArr.length) {
            return -1;
        }
        this.f197260b = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.f197261c = this.f197260b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i4 < i2) {
            int iM214089k = m214089k();
            if (iM214089k == -1) {
                break;
            }
            bArr[i + i4] = (byte) iM214089k;
            i4++;
        }
        if (i4 > 0) {
            return i4;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            zpg0.m220844a("mark is not supported");
        } else {
            ((FilterInputStream) this).in.reset();
            this.f197260b = this.f197261c;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        return i != -1 ? i : m214089k();
    }
}
