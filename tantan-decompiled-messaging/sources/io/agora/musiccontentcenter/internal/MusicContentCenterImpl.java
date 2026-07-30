package io.agora.musiccontentcenter.internal;

import io.agora.musiccontentcenter.IAgoraMusicContentCenter;
import io.agora.musiccontentcenter.IAgoraMusicPlayer;
import io.agora.musiccontentcenter.IMusicContentCenterEventHandler;
import io.agora.musiccontentcenter.MusicCacheInfo;
import io.agora.musiccontentcenter.MusicContentCenterConfiguration;
import io.agora.rtc2.RtcEngine;
import io.agora.rtc2.internal.RtcEngineImpl;
import io.agora.utils2.internal.Logging;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class MusicContentCenterImpl extends IAgoraMusicContentCenter {
    private static final String TAG = "MusicContentCenterImpl";
    private final AtomicBoolean mIsDestroying = new AtomicBoolean(false);
    private long mNativeHandle;
    private final RtcEngineImpl mRtcEngine;

    public MusicContentCenterImpl(RtcEngine rtcEngine) {
        this.mNativeHandle = 0L;
        if (!(rtcEngine instanceof RtcEngineImpl)) {
            this.mRtcEngine = null;
            return;
        }
        RtcEngineImpl rtcEngineImpl = (RtcEngineImpl) rtcEngine;
        this.mRtcEngine = rtcEngineImpl;
        synchronized (rtcEngineImpl) {
            this.mNativeHandle = nativeObjectInit(rtcEngine.getNativeHandle());
        }
    }

    private native MusicPlayerProperty nativeCreateMusicPlayer(long j);

    private static native int nativeDestroy(long j, long j2);

    private native int nativeDestroyMusicPlayer(long j, int i);

    private native MusicCacheInfo[] nativeGetCaches(long j);

    private native long nativeGetInternalSongCode(long j, long j2, String str);

    private native String nativeGetLyric(long j, long j2, int i);

    private native String nativeGetMusicCharts(long j);

    private native String nativeGetMusicCollectionByMusicChartId(long j, int i, int i2, int i3, String str);

    private native String nativeGetSongSimpleInfo(long j, long j2);

    private native int nativeInitialize(long j, Object obj);

    private native int nativeIsPreloaded(long j, long j2);

    private native long nativeObjectInit(long j);

    private native int nativePreload(long j, long j2, String str);

    private native String nativePreloadWithSongCode(long j, long j2);

    private native int nativeRegisterEventHandler(long j, Object obj);

    private native int nativeRemoveCache(long j, long j2);

    private native int nativeRenewToken(long j, String str);

    private native String nativeSearchMusic(long j, String str, int i, int i2, String str2);

    private native int nativeUnregisterEventHandler(long j);

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public IAgoraMusicPlayer createMusicPlayer() {
        RtcEngineImpl rtcEngineImpl;
        AgoraMusicPlayerImpl agoraMusicPlayerImpl = null;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle == 0 || this.mRtcEngine.getNativeHandle() == 0) {
                    Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (createMusicPlayer)");
                } else {
                    MusicPlayerProperty musicPlayerPropertyNativeCreateMusicPlayer = nativeCreateMusicPlayer(this.mNativeHandle);
                    long j = musicPlayerPropertyNativeCreateMusicPlayer.handler;
                    if (j != 0) {
                        agoraMusicPlayerImpl = new AgoraMusicPlayerImpl(this.mRtcEngine, j, musicPlayerPropertyNativeCreateMusicPlayer.f63345id);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return agoraMusicPlayerImpl;
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int destroyMusicPlayer(IAgoraMusicPlayer iAgoraMusicPlayer) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null || iAgoraMusicPlayer == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeDestroyMusicPlayer(this.mNativeHandle, iAgoraMusicPlayer.getMediaPlayerId());
                }
                Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (destroyMusicPlayer)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public void doDestroy() {
        RtcEngineImpl rtcEngineImpl = this.mRtcEngine;
        if (rtcEngineImpl == null) {
            return;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0) {
                    this.mIsDestroying.set(true);
                    nativeDestroy(this.mNativeHandle, this.mRtcEngine.getNativeHandle());
                    this.mNativeHandle = 0L;
                    this.mIsDestroying.set(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public MusicCacheInfo[] getCaches() {
        RtcEngineImpl rtcEngineImpl;
        MusicCacheInfo[] musicCacheInfoArrNativeGetCaches;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return new MusicCacheInfo[0];
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle == 0 || this.mRtcEngine.getNativeHandle() == 0) {
                    Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (getCaches)");
                    musicCacheInfoArrNativeGetCaches = new MusicCacheInfo[0];
                } else {
                    musicCacheInfoArrNativeGetCaches = nativeGetCaches(this.mNativeHandle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return musicCacheInfoArrNativeGetCaches;
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public long getInternalSongCode(long j, String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return 0L;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeGetInternalSongCode(this.mNativeHandle, j, str);
                }
                Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (getInternalSongCode)");
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public String getLyric(long j, int i) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeGetLyric(this.mNativeHandle, j, i);
                }
                Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (getLyric)");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public String getMusicCharts() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeGetMusicCharts(this.mNativeHandle);
                }
                Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (getMusicCharts)");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public String getMusicCollectionByMusicChartId(int i, int i2, int i3, String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeGetMusicCollectionByMusicChartId(this.mNativeHandle, i, i2, i3, str);
                }
                Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (getMusicCollectionByMusicChartId)");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public String getSongSimpleInfo(long j) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeGetSongSimpleInfo(this.mNativeHandle, j);
                }
                Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (getSongSimpleInfo)");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int initialize(MusicContentCenterConfiguration musicContentCenterConfiguration) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeInitialize(this.mNativeHandle, musicContentCenterConfiguration);
                }
                Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (initialize)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int isPreloaded(long j) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeIsPreloaded(this.mNativeHandle, j);
                }
                Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (isPreloaded)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int preload(long j, String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativePreload(this.mNativeHandle, j, str);
                }
                Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (preload)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int registerEventHandler(IMusicContentCenterEventHandler iMusicContentCenterEventHandler) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeRegisterEventHandler(this.mNativeHandle, iMusicContentCenterEventHandler);
                }
                Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (registerEventHandler)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int removeCache(long j) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeRemoveCache(this.mNativeHandle, j);
                }
                Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (removeCache)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int renewToken(String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeRenewToken(this.mNativeHandle, str);
                }
                Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (renewToken)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public String searchMusic(String str, int i, int i2, String str2) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeSearchMusic(this.mNativeHandle, str, i, i2, str2);
                }
                Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (searchMusic)");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int unregisterEventHandler() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeUnregisterEventHandler(this.mNativeHandle);
                }
                Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (unregisterEventHandler)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public String preload(long j) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativePreloadWithSongCode(this.mNativeHandle, j);
                }
                Logging.m87219e(TAG, "MusicContentCenter does not initialize or it may be destroyed (preload)");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
