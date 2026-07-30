package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class nh3 extends OutputStream {

    /* JADX INFO: renamed from: a */
    @NonNull
    private final OutputStream f141903a;

    /* JADX INFO: renamed from: b */
    private byte[] f141904b;

    /* JADX INFO: renamed from: c */
    private o01 f141905c;

    /* JADX INFO: renamed from: d */
    private int f141906d;

    @VisibleForTesting
    public nh3(@NonNull OutputStream outputStream, o01 o01Var, int i) {
        this.f141903a = outputStream;
        this.f141905c = o01Var;
        this.f141904b = (byte[]) o01Var.mo165411c(i, byte[].class);
    }

    /* JADX INFO: renamed from: k */
    private void m163024k() throws IOException {
        int i = this.f141906d;
        if (i > 0) {
            this.f141903a.write(this.f141904b, 0, i);
            this.f141906d = 0;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m163025m() throws IOException {
        if (this.f141906d == this.f141904b.length) {
            m163024k();
        }
    }

    private void release() {
        byte[] bArr = this.f141904b;
        if (bArr != null) {
            this.f141905c.put(bArr);
            this.f141904b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f141903a.close();
            release();
        } catch (Throwable th) {
            this.f141903a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m163024k();
        this.f141903a.flush();
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f141906d;
            if (i6 == 0 && i4 >= this.f141904b.length) {
                this.f141903a.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f141904b.length - i6);
            System.arraycopy(bArr, i5, this.f141904b, this.f141906d, iMin);
            this.f141906d += iMin;
            i3 += iMin;
            m163025m();
        } while (i3 < i2);
    }

    public nh3(@NonNull OutputStream outputStream, @NonNull o01 o01Var) {
        this(outputStream, o01Var, 65536);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f141904b;
        int i2 = this.f141906d;
        this.f141906d = i2 + 1;
        bArr[i2] = (byte) i;
        m163025m();
    }
}
