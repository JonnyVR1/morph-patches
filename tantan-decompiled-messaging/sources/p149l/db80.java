package p149l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class db80 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a */
    private final vp3 f85301a;

    public db80(vp3 vp3Var, int i) {
        this.f85301a = vp3Var;
        ((ByteArrayOutputStream) this).buf = vp3Var.m199217a(Math.max(i, 256));
    }

    /* JADX INFO: renamed from: d */
    private void m110644d(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] bArrM199217a = this.f85301a.m199217a((i2 + i) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrM199217a, 0, ((ByteArrayOutputStream) this).count);
        this.f85301a.m199218b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrM199217a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f85301a.m199218b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.f85301a.m199218b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        m110644d(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        m110644d(i2);
        super.write(bArr, i, i2);
    }
}
