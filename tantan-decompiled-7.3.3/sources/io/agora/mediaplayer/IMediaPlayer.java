package io.agora.mediaplayer;

import android.net.Uri;
import android.view.View;
import io.agora.mediaplayer.data.MediaPlayerSource;
import io.agora.mediaplayer.data.MediaStreamInfo;
import io.agora.rtc2.SpatialAudioParams;
import io.agora.rtc2.audio.IAudioSpectrumObserver;

/* JADX INFO: loaded from: classes2.dex */
public interface IMediaPlayer {
    int adjustPlayoutVolume(int i);

    int adjustPublishSignalVolume(int i);

    int destroy();

    int enableAutoSwitchAgoraCDN(boolean z);

    int getAgoraCDNLineCount();

    int getCurrentAgoraCDNIndex();

    long getDuration();

    int getMediaPlayerId();

    boolean getMute();

    long getPlayPosition();

    String getPlaySrc();

    int getPlayoutVolume();

    int getPublishSignalVolume();

    Constants.MediaPlayerState getState();

    int getStreamCount();

    MediaStreamInfo getStreamInfo(int i);

    int mute(boolean z);

    int open(Uri uri, long j);

    int open(String str, long j);

    int openWithAgoraCDNSrc(String str, long j);

    int openWithMediaSource(MediaPlayerSource mediaPlayerSource);

    int pause();

    int play();

    int playPreloadedSrc(String str);

    int preloadSrc(String str, long j);

    int registerAudioFrameObserver(IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver, int i);

    int registerMediaPlayerAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver, int i);

    int registerPlayerObserver(IMediaPlayerObserver iMediaPlayerObserver);

    int registerVideoFrameObserver(IMediaPlayerVideoFrameObserver iMediaPlayerVideoFrameObserver);

    int renewAgoraCDNSrcToken(String str, long j);

    int resume();

    int seek(long j);

    int selectAudioTrack(int i);

    int selectInternalSubtitle(int i);

    int selectMultiAudioTrack(int i, int i2);

    int setAudioDualMonoMode(int i);

    int setAudioPitch(int i);

    int setExternalSubtitle(String str);

    int setLoopCount(int i);

    int setPlaybackSpeed(int i);

    int setPlayerOption(String str, int i);

    int setPlayerOptionString(String str, String str2);

    int setRenderMode(int i);

    int setSpatialAudioParams(SpatialAudioParams spatialAudioParams);

    int setView(View view);

    int stop();

    int switchAgoraCDNLineByIndex(int i);

    int switchAgoraCDNSrc(String str, boolean z);

    int switchSrc(String str, boolean z);

    int takeScreenshot(String str);

    int unRegisterPlayerObserver(IMediaPlayerObserver iMediaPlayerObserver);

    int unloadSrc(String str);

    int unregisterMediaPlayerAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver);
}
