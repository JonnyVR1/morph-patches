package io.agora.mediaplayer;

/* JADX INFO: loaded from: classes2.dex */
public interface IMediaPlayerCacheManager {
    int enableAutoRemoveCache(boolean z);

    String getCacheDir();

    int getCacheFileCount();

    int getMaxCacheFileCount();

    long getMaxCacheFileSize();

    int removeAllCaches();

    int removeCacheByUri(String str);

    int removeOldCache();

    int setCacheDir(String str);

    int setMaxCacheFileCount(int i);

    int setMaxCacheFileSize(long j);
}
