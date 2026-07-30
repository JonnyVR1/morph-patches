package com.momo.xeengine.svgaplayer.utils;

import com.momo.xeengine.widget.XUIMediaSource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import l.rhg0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class SVGAInputStream extends InputStream {
    private final XUIMediaSource mediaSource;
    private final long size;
    private long position = 0;
    private boolean closed = false;

    public SVGAInputStream(File file) {
        XUIMediaSource xUIMediaSource = new XUIMediaSource(file.getAbsolutePath());
        this.mediaSource = xUIMediaSource;
        this.size = xUIMediaSource.getSize();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (!this.closed) {
            return (int) Math.min(2147483647L, this.size - this.position);
        }
        rhg0.a("Stream closed");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.mediaSource.close();
        this.closed = true;
    }

    public long getPosition() {
        return this.position;
    }

    public long getTotalSize() {
        return this.size;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws Throwable {
        if (this.closed) {
            rhg0.a("Stream closed");
            return 0;
        }
        long j = this.position;
        long j2 = this.size;
        if (j >= j2) {
            return -1;
        }
        int at = this.mediaSource.readAt(this.position, bArr, i, (int) Math.min(i2, j2 - j));
        if (at <= 0) {
            return -1;
        }
        this.position += (long) at;
        return at;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (this.closed) {
            rhg0.a("Stream closed");
            return 0L;
        }
        long jMin = Math.min(j, this.size - this.position);
        this.position += jMin;
        return jMin;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
