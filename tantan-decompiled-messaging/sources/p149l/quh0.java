package p149l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class quh0 extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public final byte[] f156509a;

    /* JADX INFO: renamed from: b */
    public int f156510b;

    /* JADX INFO: renamed from: c */
    public int f156511c;

    public quh0(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.f156509a = bArr;
    }

    /* JADX INFO: renamed from: k */
    public final int m176619k() {
        int i = this.f156510b;
        byte[] bArr = this.f156509a;
        if (i >= bArr.length) {
            return -1;
        }
        this.f156510b = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.f156511c = this.f156510b;
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
            int iM176619k = m176619k();
            if (iM176619k == -1) {
                break;
            }
            bArr[i + i4] = (byte) iM176619k;
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
            rhg0.m179353a("mark is not supported");
        } else {
            ((FilterInputStream) this).in.reset();
            this.f156510b = this.f156511c;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        return i != -1 ? i : m176619k();
    }
}
