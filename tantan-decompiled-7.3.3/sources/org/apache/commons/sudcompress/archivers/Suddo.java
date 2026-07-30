package org.apache.commons.sudcompress.archivers;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Suddo extends OutputStream {
    static final int BYTE_MASK = 255;
    private final byte[] oneByte = new byte[1];
    private long bytesWritten = 0;

    public void count(long j) {
        if (j != -1) {
            this.bytesWritten += j;
        }
    }

    public long getBytesWritten() {
        return this.bytesWritten;
    }

    @Deprecated
    public int getCount() {
        return (int) this.bytesWritten;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.oneByte;
        bArr[0] = (byte) (i & 255);
        write(bArr, 0, 1);
    }

    public void count(int i) {
        count(i);
    }
}
