package p149l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class uqb extends FilterOutputStream {

    /* JADX INFO: renamed from: a */
    public long f177734a;

    public uqb(OutputStream outputStream) {
        super(outputStream);
        this.f177734a = 0L;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    /* JADX INFO: renamed from: k */
    public long m194987k() {
        return this.f177734a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        this.f177734a++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f177734a += (long) i2;
    }
}
