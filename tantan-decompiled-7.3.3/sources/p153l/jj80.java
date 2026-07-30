package p153l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class jj80 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a */
    private final vq3 f121151a;

    public jj80(vq3 vq3Var, int i) {
        this.f121151a = vq3Var;
        ((ByteArrayOutputStream) this).buf = vq3Var.m202354a(Math.max(i, 256));
    }

    /* JADX INFO: renamed from: d */
    private void m145022d(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] bArrM202354a = this.f121151a.m202354a((i2 + i) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrM202354a, 0, ((ByteArrayOutputStream) this).count);
        this.f121151a.m202355b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrM202354a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f121151a.m202355b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.f121151a.m202355b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        m145022d(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        m145022d(i2);
        super.write(bArr, i, i2);
    }
}
