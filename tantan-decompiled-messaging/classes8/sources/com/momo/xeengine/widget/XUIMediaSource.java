package com.momo.xeengine.widget;

import android.media.MediaDataSource;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class XUIMediaSource extends MediaDataSource {
    private long nativeHandle;
    private final String path;

    public XUIMediaSource(String str) {
        this.nativeHandle = 0L;
        this.path = str;
        this.nativeHandle = nativeOpen(str);
    }

    private native void nativeClose(long j);

    private native long nativeGetSize(long j);

    private native long nativeOpen(String str);

    private native int nativeReadAt(long j, long j2, byte[] bArr, int i, int i2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                long j = this.nativeHandle;
                if (j != 0) {
                    nativeClose(j);
                    this.nativeHandle = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getPath() {
        return this.path;
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        synchronized (this) {
            try {
                long j = this.nativeHandle;
                if (j == 0) {
                    return 0L;
                }
                return nativeGetSize(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) throws Throwable {
        synchronized (this) {
            try {
                try {
                    long j2 = this.nativeHandle;
                    if (j2 == 0) {
                        return 0;
                    }
                    return nativeReadAt(j2, j, bArr, i, i2);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
