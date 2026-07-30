package io.agora.musiccontentcenter;

import io.agora.musiccontentcenter.internal.MusicContentCenterImpl;
import io.agora.rtc2.RtcEngine;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IAgoraMusicContentCenter {
    private static IAgoraMusicContentCenter mInstance;

    public class MusicCacheStatusType {
        public static final int MUSIC_CACHE_STATUS_TYPE_CACHED = 0;
        public static final int MUSIC_CACHE_STATUS_TYPE_CACHING = 1;

        private MusicCacheStatusType() {
        }
    }

    public class MusicContentCenterStateReason {
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_ERROR = 1;
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_GATEWAY = 2;
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_HTTP_INTERNAL = 7;
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_INTERNAL_DATA_PARSE = 4;
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_MUSIC_DECRYPTION = 6;
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_MUSIC_LOADING = 5;
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_OK = 0;
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_PERMISSION_AND_RESOURCE = 3;

        private MusicContentCenterStateReason() {
        }
    }

    public class PreloadState {
        public static final int PRELOAD_STATE_COMPLETED = 0;
        public static final int PRELOAD_STATE_FAILED = 1;
        public static final int PRELOAD_STATE_PRELOADING = 2;
        public static final int PRELOAD_STATE_REMOVED = 3;

        private PreloadState() {
        }
    }

    public static synchronized IAgoraMusicContentCenter create(RtcEngine rtcEngine) {
        try {
            if (mInstance == null) {
                mInstance = new MusicContentCenterImpl(rtcEngine);
            }
        } catch (Throwable th) {
            throw th;
        }
        return mInstance;
    }

    public static synchronized void destroy() {
        IAgoraMusicContentCenter iAgoraMusicContentCenter = mInstance;
        if (iAgoraMusicContentCenter == null) {
            return;
        }
        iAgoraMusicContentCenter.doDestroy();
        mInstance = null;
    }

    public abstract IAgoraMusicPlayer createMusicPlayer();

    public abstract int destroyMusicPlayer(IAgoraMusicPlayer iAgoraMusicPlayer);

    public abstract void doDestroy();

    public abstract MusicCacheInfo[] getCaches();

    public abstract long getInternalSongCode(long j, String str);

    public abstract String getLyric(long j, int i);

    public abstract String getMusicCharts();

    public String getMusicCollectionByMusicChartId(int i, int i2, int i3) {
        return getMusicCollectionByMusicChartId(i, i2, i3, null);
    }

    public abstract String getMusicCollectionByMusicChartId(int i, int i2, int i3, String str);

    public abstract String getSongSimpleInfo(long j);

    public abstract int initialize(MusicContentCenterConfiguration musicContentCenterConfiguration);

    public abstract int isPreloaded(long j);

    @Deprecated
    public abstract int preload(long j, String str);

    public abstract String preload(long j);

    public abstract int registerEventHandler(IMusicContentCenterEventHandler iMusicContentCenterEventHandler);

    public abstract int removeCache(long j);

    public abstract int renewToken(String str);

    public String searchMusic(String str, int i, int i2) {
        return searchMusic(str, i, i2, null);
    }

    public abstract String searchMusic(String str, int i, int i2, String str2);

    public abstract int unregisterEventHandler();
}
