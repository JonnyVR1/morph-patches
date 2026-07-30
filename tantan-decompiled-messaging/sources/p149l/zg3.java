package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class zg3 extends OutputStream {

    /* JADX INFO: renamed from: a */
    @NonNull
    private final OutputStream f203005a;

    /* JADX INFO: renamed from: b */
    private byte[] f203006b;

    /* JADX INFO: renamed from: c */
    private h01 f203007c;

    /* JADX INFO: renamed from: d */
    private int f203008d;

    @VisibleForTesting
    public zg3(@NonNull OutputStream outputStream, h01 h01Var, int i) {
        this.f203005a = outputStream;
        this.f203007c = h01Var;
        this.f203006b = (byte[]) h01Var.mo128942c(i, byte[].class);
    }

    /* JADX INFO: renamed from: k */
    private void m218626k() throws IOException {
        int i = this.f203008d;
        if (i > 0) {
            this.f203005a.write(this.f203006b, 0, i);
            this.f203008d = 0;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m218627m() throws IOException {
        if (this.f203008d == this.f203006b.length) {
            m218626k();
        }
    }

    private void release() {
        byte[] bArr = this.f203006b;
        if (bArr != null) {
            this.f203007c.put(bArr);
            this.f203006b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f203005a.close();
            release();
        } catch (Throwable th) {
            this.f203005a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m218626k();
        this.f203005a.flush();
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f203008d;
            if (i6 == 0 && i4 >= this.f203006b.length) {
                this.f203005a.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f203006b.length - i6);
            System.arraycopy(bArr, i5, this.f203006b, this.f203008d, iMin);
            this.f203008d += iMin;
            i3 += iMin;
            m218627m();
        } while (i3 < i2);
    }

    public zg3(@NonNull OutputStream outputStream, @NonNull h01 h01Var) {
        this(outputStream, h01Var, 65536);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f203006b;
        int i2 = this.f203008d;
        this.f203008d = i2 + 1;
        bArr[i2] = (byte) i;
        m218627m();
    }
}
