package io.agora.mediaplayer.data;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class CacheStatistics {
    private long fileSize = 0;
    private long cacheSize = 0;
    private long downloadSize = 0;

    @CalledByNative
    public CacheStatistics() {
    }

    public long getCacheSize() {
        return this.cacheSize;
    }

    public long getDownloadSize() {
        return this.downloadSize;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    @CalledByNative
    public void setCacheSize(long j) {
        this.cacheSize = j;
    }

    @CalledByNative
    public void setDownloadSize(long j) {
        this.downloadSize = j;
    }

    @CalledByNative
    public void setFileSize(long j) {
        this.fileSize = j;
    }

    public String toString() {
        return "CacheStatistics{fileSize=" + this.fileSize + ", cacheSize=" + this.cacheSize + ", downloadSize=" + this.downloadSize + '}';
    }
}
