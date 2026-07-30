package org.apache.commons.sudcompress.archivers;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ArchiveInputStream extends InputStream {
    private static final int BYTE_MASK = 255;
    private final byte[] single = new byte[1];
    private long bytesRead = 0;

    public boolean canReadEntryData(ArchiveEntry archiveEntry) {
        return true;
    }

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

    public abstract ArchiveEntry getNextEntry();

    public void pushedBackBytes(long j) {
        this.bytesRead -= j;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.single, 0, 1) == -1) {
            return -1;
        }
        return this.single[0] & 255;
    }

    public void count(int i) {
        count(i);
    }
}
