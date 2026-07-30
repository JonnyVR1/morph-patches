package p153l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class wxr0 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a */
    public final xwr0 f191521a;

    public wxr0(xwr0 xwr0Var, int i) {
        this.f191521a = xwr0Var;
        ((ByteArrayOutputStream) this).buf = xwr0Var.m213437b(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f191521a.m213436a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m208441d(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i3 = i2 + i;
        byte[] bArrM213437b = this.f191521a.m213437b(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrM213437b, 0, ((ByteArrayOutputStream) this).count);
        this.f191521a.m213436a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrM213437b;
    }

    public final void finalize() {
        this.f191521a.m213436a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        m208441d(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        m208441d(i2);
        super.write(bArr, i, i2);
    }
}
