package io.agora.rtc2.internal;

import io.agora.mediaplayer.IMediaPlayerCacheManager;

/* JADX INFO: loaded from: classes2.dex */
public class MediaPlayerCacheManagerImpl implements IMediaPlayerCacheManager {
    protected static MediaPlayerCacheManagerImpl mInstance;
    private int cacheManagerInitStatus;
    private final RtcEngineImpl mRtcEngineImpl;

    private MediaPlayerCacheManagerImpl(RtcEngineImpl rtcEngineImpl) {
        this.cacheManagerInitStatus = -1;
        this.mRtcEngineImpl = rtcEngineImpl;
        this.cacheManagerInitStatus = rtcEngineImpl.initMediaPlayerCacheManager();
    }

    public static synchronized void destroyMediaPlayerCacheManager() {
        mInstance = null;
    }

    public static synchronized IMediaPlayerCacheManager getMediaPlayerCacheManager(RtcEngineImpl rtcEngineImpl) {
        if (rtcEngineImpl == null) {
            return null;
        }
        try {
            if (mInstance == null) {
                mInstance = new MediaPlayerCacheManagerImpl(rtcEngineImpl);
            }
            return mInstance;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int enableAutoRemoveCache(boolean z) {
        return this.mRtcEngineImpl.mediaPlayerCacheEnableAutoRemoveCache(z);
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public String getCacheDir() {
        return this.mRtcEngineImpl.mediaPlayerCacheGetCacheDir();
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int getCacheFileCount() {
        return this.mRtcEngineImpl.mediaPlayerCacheGetCacheFileCount();
    }

    public int getCacheManagerInitStatus() {
        return this.cacheManagerInitStatus;
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int getMaxCacheFileCount() {
        return this.mRtcEngineImpl.mediaPlayerCacheGetMaxCacheFileCount();
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public long getMaxCacheFileSize() {
        return this.mRtcEngineImpl.mediaPlayerCacheGetMaxCacheFileSize();
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int removeAllCaches() {
        return this.mRtcEngineImpl.mediaPlayerCacheRemoveAllCaches();
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int removeCacheByUri(String str) {
        return this.mRtcEngineImpl.mediaPlayerCacheRemoveCacheByUri(str);
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int removeOldCache() {
        return this.mRtcEngineImpl.mediaPlayerCacheRemoveOldCache();
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int setCacheDir(String str) {
        return this.mRtcEngineImpl.mediaPlayerCacheSetCacheDir(str);
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int setMaxCacheFileCount(int i) {
        return this.mRtcEngineImpl.mediaPlayerCacheSetMaxCacheFileCount(i);
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int setMaxCacheFileSize(long j) {
        return this.mRtcEngineImpl.mediaPlayerCacheSetMaxCacheFileSize(j);
    }
}
