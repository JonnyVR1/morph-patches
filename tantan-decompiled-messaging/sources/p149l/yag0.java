package p149l;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class yag0 extends InputStream {
    private long bytesRead = 0;

    public void count(long j) {
        if (j != -1) {
            this.bytesRead += j;
        }
    }

    public long getBytesRead() {
        return this.bytesRead;
    }

    @Deprecated
    public int getCount() {
        return (int) this.bytesRead;
    }

    public long getUncompressedCount() {
        return getBytesRead();
    }

    public void pushedBackBytes(long j) {
        this.bytesRead -= j;
    }

    public void count(int i) {
        count(i);
    }
}
