package io.agora.musiccontentcenter.internal;

import android.net.Uri;
import android.view.View;
import io.agora.mediaplayer.Constants;
import io.agora.mediaplayer.IMediaPlayerAudioFrameObserver;
import io.agora.mediaplayer.IMediaPlayerObserver;
import io.agora.mediaplayer.IMediaPlayerVideoFrameObserver;
import io.agora.mediaplayer.data.MediaPlayerSource;
import io.agora.mediaplayer.data.MediaStreamInfo;
import io.agora.musiccontentcenter.IAgoraMusicPlayer;
import io.agora.rtc2.SpatialAudioParams;
import io.agora.rtc2.audio.IAudioSpectrumObserver;
import io.agora.rtc2.internal.RtcEngineImpl;
import io.agora.utils2.internal.CommonUtility;
import io.agora.utils2.internal.Logging;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class AgoraMusicPlayerImpl implements IAgoraMusicPlayer {
    private static final String TAG = "AgoraMusicPlayerImpl";
    private final AtomicBoolean mIsDestroying = new AtomicBoolean(false);
    private long mNativeHandle;
    private final int mNativeMediaPlayerSourceId;
    private final RtcEngineImpl mRtcEngineImpl;

    public AgoraMusicPlayerImpl(RtcEngineImpl rtcEngineImpl, long j, int i) {
        this.mNativeHandle = 0L;
        this.mNativeHandle = j;
        this.mNativeMediaPlayerSourceId = i;
        this.mRtcEngineImpl = rtcEngineImpl;
    }

    private native int nativeAdjustPlayoutVolume(long j, int i);

    private native int nativeAdjustPublishSignalVolume(long j, int i);

    private native int nativeChangePlaybackSpeed(long j, int i);

    private static native int nativeDestroy(long j);

    private native int nativeEnableAutoSwitchAgoraCDN(long j, boolean z);

    private native int nativeGetAgoraCDNLineCount(long j);

    private native int nativeGetCurrentAgoraCDNIndex(long j);

    private native long nativeGetDuration(long j);

    private native boolean nativeGetMute(long j);

    private native long nativeGetPlayPosition(long j);

    private native String nativeGetPlaySrc(long j);

    private native int nativeGetPlayoutVolume(long j);

    private native int nativeGetPublishSignalVolume(long j);

    private native int nativeGetState(long j);

    private native int nativeGetStreamCount(long j);

    private native MediaStreamInfo nativeGetStreamInfo(long j, int i);

    private native int nativeMute(long j, boolean z);

    private native int nativeOpen(long j, long j2, long j3);

    private native int nativeOpenWithAgoraCDNSrc(long j, String str, long j2);

    private native int nativeOpenWithSource(long j, MediaPlayerSource mediaPlayerSource);

    private native int nativeOpenWithUrl(long j, String str, long j2);

    private native int nativePause(long j);

    private native int nativePlay(long j);

    private native int nativePlayPreloadedSrc(long j, String str);

    private native int nativePreloadSrc(long j, String str, long j2);

    private native int nativeRegisterAudioFrameObserver(long j, IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver, int i);

    private native int nativeRegisterAudioSpectrumObserver(long j, IAudioSpectrumObserver iAudioSpectrumObserver, int i);

    private native int nativeRegisterPlayerObserver(long j, IMediaPlayerObserver iMediaPlayerObserver);

    private native int nativeRegisterVideoFrameObserver(long j, IMediaPlayerVideoFrameObserver iMediaPlayerVideoFrameObserver);

    private native int nativeRenewAgoraCDNSrcToken(long j, String str, long j2);

    private native int nativeResume(long j);

    private native int nativeSeek(long j, long j2);

    private native int nativeSelectAudioTrack(long j, int i);

    private native int nativeSelectInternalSubtitle(long j, int i);

    private native int nativeSelectMultiAudioTrack(long j, int i, int i2);

    private native int nativeSetAudioDualMonoMode(long j, int i);

    private native int nativeSetAudioPitch(long j, int i);

    private native int nativeSetExternalSubtitle(long j, String str);

    private native int nativeSetLoopCount(long j, int i);

    private static native int nativeSetPlayMode(long j, int i);

    private native int nativeSetPlayerOption(long j, String str, int i);

    private native int nativeSetPlayerOptionString(long j, String str, String str2);

    private native int nativeSetRenderMode(long j, int i);

    private native int nativeSetSpatialAudioParams(long j, SpatialAudioParams spatialAudioParams);

    private native int nativeSetView(long j, View view);

    private native int nativeStop(long j);

    private native int nativeSwitchAgoraCDNLineByIndex(long j, int i);

    private native int nativeSwitchAgoraCDNSrc(long j, String str, boolean z);

    private native int nativeSwitchSrc(long j, String str, boolean z);

    private native int nativeTakeScreenshot(long j, String str);

    private native int nativeUnRegisterAudioSpectrumObserver(long j, IAudioSpectrumObserver iAudioSpectrumObserver);

    private native int nativeUnRegisterPlayerObserver(long j, IMediaPlayerObserver iMediaPlayerObserver);

    private native int nativeUnloadSrc(long j, String str);

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int adjustPlayoutVolume(int i) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeAdjustPlayoutVolume(j, i);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (adjustPlayoutVolume)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int adjustPublishSignalVolume(int i) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeAdjustPublishSignalVolume(j, i);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (adjustPublishSignalVolume)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicPlayer, io.agora.mediaplayer.IMediaPlayer
    public int destroy() {
        RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl;
        if (rtcEngineImpl == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle == 0) {
                    Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (destroy)");
                    return -7;
                }
                this.mIsDestroying.set(true);
                int iNativeDestroy = nativeDestroy(this.mNativeHandle);
                this.mNativeHandle = 0L;
                this.mIsDestroying.set(false);
                return iNativeDestroy;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int enableAutoSwitchAgoraCDN(boolean z) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeEnableAutoSwitchAgoraCDN(j, z);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (enableAutoSwitchAgoraCDN)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getAgoraCDNLineCount() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeGetAgoraCDNLineCount(j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getAgoraCDNLineCount)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getCurrentAgoraCDNIndex() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeGetCurrentAgoraCDNIndex(j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getCurrentAgoraCDNIndex)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public long getDuration() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8L;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeGetDuration(j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getDuration)");
                return -7L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getMediaPlayerId() {
        return this.mNativeMediaPlayerSourceId;
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public boolean getMute() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return false;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeGetMute(j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getMute)");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public long getPlayPosition() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8L;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeGetPlayPosition(j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getPlayPosition)");
                return -7L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicPlayer, io.agora.mediaplayer.IMediaPlayer
    public String getPlaySrc() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeGetPlaySrc(j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getPlaySrc)");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getPlayoutVolume() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeGetPlayoutVolume(j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getPlayoutVolume)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getPublishSignalVolume() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeGetPublishSignalVolume(j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getPublishSignalVolume)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public Constants.MediaPlayerState getState() {
        RtcEngineImpl rtcEngineImpl;
        Constants.MediaPlayerState stateByValue;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return Constants.MediaPlayerState.PLAYER_STATE_UNKNOWN;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getState)");
                    stateByValue = Constants.MediaPlayerState.PLAYER_STATE_UNKNOWN;
                } else {
                    stateByValue = Constants.MediaPlayerState.getStateByValue(nativeGetState(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return stateByValue;
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getStreamCount() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeGetStreamCount(j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getStreamCount)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public MediaStreamInfo getStreamInfo(int i) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeGetStreamInfo(j, i);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getStreamInfo)");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int mute(boolean z) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeMute(j, z);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (mute)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int open(Uri uri, long j) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle == 0) {
                    Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (open with uri)");
                    return -7;
                }
                String contentFilePath = CommonUtility.getContentFilePath(this.mRtcEngineImpl.getContext(), uri);
                if (contentFilePath != null && !contentFilePath.equals("")) {
                    return nativeOpenWithUrl(this.mNativeHandle, contentFilePath, j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer Can not open incorrect Uri Param");
                return -2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int openWithAgoraCDNSrc(String str, long j) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j2 = this.mNativeHandle;
                if (j2 != 0) {
                    return nativeOpenWithAgoraCDNSrc(j2, str, j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (openWithAgoraCDNSrc)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int openWithMediaSource(MediaPlayerSource mediaPlayerSource) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeOpenWithSource(j, mediaPlayerSource);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (openWithMediaSource)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int pause() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativePause(j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (pause)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int play() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativePlay(j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (play)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int playPreloadedSrc(String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativePlayPreloadedSrc(j, str);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (playPreloadedSrc)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int preloadSrc(String str, long j) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j2 = this.mNativeHandle;
                if (j2 != 0) {
                    return nativePreloadSrc(j2, str, j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (preloadSrc)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int registerAudioFrameObserver(IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver, int i) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeRegisterAudioFrameObserver(j, iMediaPlayerAudioFrameObserver, i);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (registerAudioFrameObserver)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int registerMediaPlayerAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver, int i) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeRegisterAudioSpectrumObserver(j, iAudioSpectrumObserver, i);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (registerMediaPlayerAudioSpectrumObserver)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int registerPlayerObserver(IMediaPlayerObserver iMediaPlayerObserver) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeRegisterPlayerObserver(j, iMediaPlayerObserver);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (registerPlayerObserver)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int registerVideoFrameObserver(IMediaPlayerVideoFrameObserver iMediaPlayerVideoFrameObserver) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeRegisterVideoFrameObserver(j, iMediaPlayerVideoFrameObserver);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (registerVideoFrameObserver)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int renewAgoraCDNSrcToken(String str, long j) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j2 = this.mNativeHandle;
                if (j2 != 0) {
                    return nativeRenewAgoraCDNSrcToken(j2, str, j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (renewAgoraCDNSrcToken)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int resume() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeResume(j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (resume)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int seek(long j) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j2 = this.mNativeHandle;
                if (j2 != 0) {
                    return nativeSeek(j2, j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (seek)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int selectAudioTrack(int i) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSelectAudioTrack(j, i);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (selectAudioTrack)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int selectInternalSubtitle(int i) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSelectInternalSubtitle(j, i);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (selectInternalSubtitle)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int selectMultiAudioTrack(int i, int i2) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSelectMultiAudioTrack(j, i, i2);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (selectMultiAudioTrack)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setAudioDualMonoMode(int i) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSetAudioDualMonoMode(j, i);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setAudioDualMonoMode)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setAudioPitch(int i) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSetAudioPitch(j, i);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setAudioPitch)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setExternalSubtitle(String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSetExternalSubtitle(j, str);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setExternalSubtitle)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setLoopCount(int i) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSetLoopCount(j, i);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setLoopCount)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicPlayer
    public int setPlayMode(IAgoraMusicPlayer.MusicPlayMode musicPlayMode) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null || musicPlayMode == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSetPlayMode(j, musicPlayMode.getValue());
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setPlayMode)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setPlaybackSpeed(int i) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeChangePlaybackSpeed(j, i);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setPlaybackSpeed)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setPlayerOption(String str, int i) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSetPlayerOption(j, str, i);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setPlayerOption)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setPlayerOptionString(String str, String str2) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSetPlayerOptionString(j, str, str2);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setPlayerOptionString)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setRenderMode(int i) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSetRenderMode(j, i);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setRenderMode)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setSpatialAudioParams(SpatialAudioParams spatialAudioParams) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSetSpatialAudioParams(j, spatialAudioParams);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setSpatialAudioParams)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setView(View view) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSetView(j, view);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setView)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicPlayer, io.agora.mediaplayer.IMediaPlayer
    public int stop() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeStop(j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (stop)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int switchAgoraCDNLineByIndex(int i) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSwitchAgoraCDNLineByIndex(j, i);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (switchAgoraCDNLineByIndex)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int switchAgoraCDNSrc(String str, boolean z) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSwitchAgoraCDNSrc(j, str, z);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (switchAgoraCDNSrc)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int switchSrc(String str, boolean z) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeSwitchSrc(j, str, z);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (switchSrc)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int takeScreenshot(String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeTakeScreenshot(j, str);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (takeScreenshot)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int unRegisterPlayerObserver(IMediaPlayerObserver iMediaPlayerObserver) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeUnRegisterPlayerObserver(j, iMediaPlayerObserver);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (unRegisterPlayerObserver)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int unloadSrc(String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeUnloadSrc(j, str);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (unloadSrc)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int unregisterMediaPlayerAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeUnRegisterAudioSpectrumObserver(j, iAudioSpectrumObserver);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (unregisterMediaPlayerAudioSpectrumObserver)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicPlayer
    public int open(long j, long j2) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j3 = this.mNativeHandle;
                if (j3 != 0) {
                    return nativeOpen(j3, j, j2);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (open with songCode)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicPlayer, io.agora.mediaplayer.IMediaPlayer
    public int open(String str, long j) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j2 = this.mNativeHandle;
                if (j2 != 0) {
                    return nativeOpenWithUrl(j2, str, j);
                }
                Logging.m87219e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (open with url)");
                return -7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
