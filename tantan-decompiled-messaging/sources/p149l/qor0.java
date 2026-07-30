package p149l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class qor0 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a */
    public final rnr0 f155628a;

    public qor0(rnr0 rnr0Var, int i) {
        this.f155628a = rnr0Var;
        ((ByteArrayOutputStream) this).buf = rnr0Var.m180154b(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f155628a.m180153a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m175769d(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i3 = i2 + i;
        byte[] bArrM180154b = this.f155628a.m180154b(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrM180154b, 0, ((ByteArrayOutputStream) this).count);
        this.f155628a.m180153a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrM180154b;
    }

    public final void finalize() {
        this.f155628a.m180153a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        m175769d(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        m175769d(i2);
        super.write(bArr, i, i2);
    }
}
