package org.apache.commons.sudcompress.archivers.zip;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: loaded from: classes2.dex */
class InflaterInputStreamWithStatistics extends InflaterInputStream {
    private long compressedCount;
    private long uncompressedCount;

    public InflaterInputStreamWithStatistics(InputStream inputStream) {
        super(inputStream);
        this.compressedCount = 0L;
        this.uncompressedCount = 0L;
    }

    @Override // java.util.zip.InflaterInputStream
    public void fill() throws IOException {
        super.fill();
        this.compressedCount += (long) ((InflaterInputStream) this).inf.getRemaining();
    }

    public long getCompressedCount() {
        return this.compressedCount;
    }

    public long getUncompressedCount() {
        return this.uncompressedCount;
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = super.read();
        if (i > -1) {
            this.uncompressedCount++;
        }
        return i;
    }

    public InflaterInputStreamWithStatistics(InputStream inputStream, Inflater inflater) {
        super(inputStream, inflater);
        this.compressedCount = 0L;
        this.uncompressedCount = 0L;
    }

    public InflaterInputStreamWithStatistics(InputStream inputStream, Inflater inflater, int i) {
        super(inputStream, inflater, i);
        this.compressedCount = 0L;
        this.uncompressedCount = 0L;
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 > -1) {
            this.uncompressedCount += (long) i3;
        }
        return i3;
    }
}
