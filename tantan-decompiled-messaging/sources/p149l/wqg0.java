package p149l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class wqg0 extends FilterInputStream {
    private long bytesRead;

    public wqg0(InputStream inputStream) {
        super(inputStream);
    }

    public final void count(long j) {
        if (j != -1) {
            this.bytesRead += j;
        }
    }

    public long getBytesRead() {
        return this.bytesRead;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 >= 0) {
            count(i3);
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i >= 0) {
            count(1L);
        }
        return i;
    }
}
