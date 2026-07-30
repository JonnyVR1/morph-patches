package io.agora.musiccontentcenter;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class MusicCacheInfo {
    public long songCode;
    public int status;

    @CalledByNative
    public MusicCacheInfo(long j, int i) {
        this.songCode = j;
        this.status = i;
    }

    @CalledByNative
    public long getSongCode() {
        return this.songCode;
    }

    @CalledByNative
    public int getStatus() {
        return this.status;
    }

    public String toString() {
        return "MusicCacheInfo{songCode=" + this.songCode + ", status=" + this.status + '}';
    }

    public MusicCacheInfo() {
    }
}
