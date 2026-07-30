package io.agora.rtc2.internal;

import android.net.Uri;
import android.view.View;
import io.agora.mediaplayer.Constants;
import io.agora.mediaplayer.IMediaPlayer;
import io.agora.mediaplayer.IMediaPlayerAudioFrameObserver;
import io.agora.mediaplayer.IMediaPlayerObserver;
import io.agora.mediaplayer.IMediaPlayerVideoFrameObserver;
import io.agora.mediaplayer.data.MediaPlayerSource;
import io.agora.mediaplayer.data.MediaStreamInfo;
import io.agora.rtc2.SpatialAudioParams;
import io.agora.rtc2.audio.IAudioSpectrumObserver;
import io.agora.utils2.internal.CommonUtility;
import io.agora.utils2.internal.Logging;

/* JADX INFO: loaded from: classes2.dex */
public class MediaPlayerImpl implements IMediaPlayer {
    private static final String TAG = "MediaPlayerImpl";
    private final int mNativeMediaPlayerSourceId;
    private final RtcEngineImpl mRtcEngineImpl;

    public MediaPlayerImpl(RtcEngineImpl rtcEngineImpl, int i) {
        this.mRtcEngineImpl = rtcEngineImpl;
        this.mNativeMediaPlayerSourceId = i;
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int adjustPlayoutVolume(int i) {
        return this.mRtcEngineImpl.mediaPlayerAdjustPlayoutVolume(this.mNativeMediaPlayerSourceId, i);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int adjustPublishSignalVolume(int i) {
        return this.mRtcEngineImpl.mediaPlayerAdjustPublishSignalVolume(this.mNativeMediaPlayerSourceId, i);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int destroy() {
        return this.mRtcEngineImpl.mediaPlayerDestroy(this.mNativeMediaPlayerSourceId);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int enableAutoSwitchAgoraCDN(boolean z) {
        return this.mRtcEngineImpl.mediaPlayerEnableAutoSwitchAgoraCDN(this.mNativeMediaPlayerSourceId, z);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getAgoraCDNLineCount() {
        return this.mRtcEngineImpl.mediaPlayerGetAgoraCDNLineCount(this.mNativeMediaPlayerSourceId);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getCurrentAgoraCDNIndex() {
        return this.mRtcEngineImpl.mediaPlayerGetCurrentAgoraCDNIndex(this.mNativeMediaPlayerSourceId);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public long getDuration() {
        return this.mRtcEngineImpl.mediaPlayerGetDuration(this.mNativeMediaPlayerSourceId);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getMediaPlayerId() {
        return this.mNativeMediaPlayerSourceId;
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public boolean getMute() {
        return this.mRtcEngineImpl.mediaPlayerGetMute(this.mNativeMediaPlayerSourceId);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public long getPlayPosition() {
        return this.mRtcEngineImpl.mediaPlayerGetPlayPosition(this.mNativeMediaPlayerSourceId);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public String getPlaySrc() {
        return this.mRtcEngineImpl.mediaPlayerGetPlaySrc(this.mNativeMediaPlayerSourceId);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getPlayoutVolume() {
        return this.mRtcEngineImpl.mediaPlayerGetPlayoutVolume(this.mNativeMediaPlayerSourceId);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getPublishSignalVolume() {
        return this.mRtcEngineImpl.mediaPlayerGetPublishSignalVolume(this.mNativeMediaPlayerSourceId);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public Constants.MediaPlayerState getState() {
        return Constants.MediaPlayerState.getStateByValue(this.mRtcEngineImpl.mediaPlayerGetState(this.mNativeMediaPlayerSourceId));
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getStreamCount() {
        return this.mRtcEngineImpl.mediaPlayerGetStreamCount(this.mNativeMediaPlayerSourceId);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public MediaStreamInfo getStreamInfo(int i) {
        return this.mRtcEngineImpl.mediaPlayerGetStreamInfo(this.mNativeMediaPlayerSourceId, i);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int mute(boolean z) {
        return this.mRtcEngineImpl.mediaPlayerMute(this.mNativeMediaPlayerSourceId, z);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int open(Uri uri, long j) throws Throwable {
        String contentFilePath = CommonUtility.getContentFilePath(this.mRtcEngineImpl.getContext(), uri);
        if (contentFilePath != null && !contentFilePath.equals("")) {
            return this.mRtcEngineImpl.mediaPlayerOpen(this.mNativeMediaPlayerSourceId, contentFilePath, j);
        }
        Logging.m88108e(TAG, "Media Player Can not open incorrect Uri Param");
        return -2;
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int openWithAgoraCDNSrc(String str, long j) {
        return this.mRtcEngineImpl.mediaPlayerOpenWithAgoraCDNSrc(this.mNativeMediaPlayerSourceId, str, j);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int openWithMediaSource(MediaPlayerSource mediaPlayerSource) {
        return this.mRtcEngineImpl.mediaPlayerOpenWithMediaSource(this.mNativeMediaPlayerSourceId, mediaPlayerSource);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int pause() {
        return this.mRtcEngineImpl.mediaPlayerPause(this.mNativeMediaPlayerSourceId);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int play() {
        return this.mRtcEngineImpl.mediaPlayerPlay(this.mNativeMediaPlayerSourceId);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int playPreloadedSrc(String str) {
        return this.mRtcEngineImpl.mediaPlayerPlayPreloadedSrc(this.mNativeMediaPlayerSourceId, str);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int preloadSrc(String str, long j) {
        return this.mRtcEngineImpl.mediaPlayerPreloadSrc(this.mNativeMediaPlayerSourceId, str, j);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int registerAudioFrameObserver(IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver, int i) {
        return this.mRtcEngineImpl.mediaPlayerRegisterAudioFrameObserver(this.mNativeMediaPlayerSourceId, iMediaPlayerAudioFrameObserver, i);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int registerMediaPlayerAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver, int i) {
        return this.mRtcEngineImpl.registerMediaPlayerAudioSpectrumObserver(this.mNativeMediaPlayerSourceId, iAudioSpectrumObserver, i);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int registerPlayerObserver(IMediaPlayerObserver iMediaPlayerObserver) {
        return this.mRtcEngineImpl.mediaPlayerRegisterPlayerObserver(this.mNativeMediaPlayerSourceId, iMediaPlayerObserver);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int registerVideoFrameObserver(IMediaPlayerVideoFrameObserver iMediaPlayerVideoFrameObserver) {
        return this.mRtcEngineImpl.mediaPlayerRegisterVideoFrameObserver(this.mNativeMediaPlayerSourceId, iMediaPlayerVideoFrameObserver);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int renewAgoraCDNSrcToken(String str, long j) {
        return this.mRtcEngineImpl.mediaPlayerRenewAgoraCDNSrcToken(this.mNativeMediaPlayerSourceId, str, j);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int resume() {
        return this.mRtcEngineImpl.mediaPlayerResume(this.mNativeMediaPlayerSourceId);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int seek(long j) {
        return this.mRtcEngineImpl.mediaPlayerSeek(this.mNativeMediaPlayerSourceId, j);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int selectAudioTrack(int i) {
        return this.mRtcEngineImpl.mediaPlayerSelectAudioTrack(this.mNativeMediaPlayerSourceId, i);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int selectInternalSubtitle(int i) {
        return this.mRtcEngineImpl.mediaPlayerSelectInternalSubtitle(this.mNativeMediaPlayerSourceId, i);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int selectMultiAudioTrack(int i, int i2) {
        return this.mRtcEngineImpl.mediaPlayerSelectMultiAudioTrack(this.mNativeMediaPlayerSourceId, i, i2);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setAudioDualMonoMode(int i) {
        return this.mRtcEngineImpl.mediaPlayerSetAudioDualMonoMode(this.mNativeMediaPlayerSourceId, i);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setAudioPitch(int i) {
        return this.mRtcEngineImpl.mediaPlayerSetAudioPitch(this.mNativeMediaPlayerSourceId, i);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setExternalSubtitle(String str) {
        return this.mRtcEngineImpl.mediaPlayerSetExternalSubtitle(this.mNativeMediaPlayerSourceId, str);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setLoopCount(int i) {
        return this.mRtcEngineImpl.mediaPlayerSetLoopCount(this.mNativeMediaPlayerSourceId, i);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setPlaybackSpeed(int i) {
        return this.mRtcEngineImpl.mediaPlayerChangePlaybackSpeed(this.mNativeMediaPlayerSourceId, i);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setPlayerOption(String str, int i) {
        return this.mRtcEngineImpl.mediaPlayerSetPlayerOption(this.mNativeMediaPlayerSourceId, str, i);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setPlayerOptionString(String str, String str2) {
        return this.mRtcEngineImpl.mediaPlayerSetPlayerOptionString(this.mNativeMediaPlayerSourceId, str, str2);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setRenderMode(int i) {
        return this.mRtcEngineImpl.mediaPlayerSetRenderMode(this.mNativeMediaPlayerSourceId, i);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setSpatialAudioParams(SpatialAudioParams spatialAudioParams) {
        return this.mRtcEngineImpl.mediaPlayerSetSpatialAudioParams(this.mNativeMediaPlayerSourceId, spatialAudioParams);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setView(View view) {
        return this.mRtcEngineImpl.mediaPlayerSetView(this.mNativeMediaPlayerSourceId, view);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int stop() {
        return this.mRtcEngineImpl.mediaPlayerStop(this.mNativeMediaPlayerSourceId);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int switchAgoraCDNLineByIndex(int i) {
        return this.mRtcEngineImpl.mediaPlayerSwitchAgoraCDNLineByIndex(this.mNativeMediaPlayerSourceId, i);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int switchAgoraCDNSrc(String str, boolean z) {
        return this.mRtcEngineImpl.mediaPlayerSwitchAgoraCDNSrc(this.mNativeMediaPlayerSourceId, str, z);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int switchSrc(String str, boolean z) {
        return this.mRtcEngineImpl.mediaPlayerSwitchSrc(this.mNativeMediaPlayerSourceId, str, z);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int takeScreenshot(String str) {
        return this.mRtcEngineImpl.mediaPlayerTakeScreenshot(this.mNativeMediaPlayerSourceId, str);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int unRegisterPlayerObserver(IMediaPlayerObserver iMediaPlayerObserver) {
        return this.mRtcEngineImpl.mediaPlayerUnRegisterPlayerObserver(this.mNativeMediaPlayerSourceId, iMediaPlayerObserver);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int unloadSrc(String str) {
        return this.mRtcEngineImpl.mediaPlayerUnloadSrc(this.mNativeMediaPlayerSourceId, str);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int unregisterMediaPlayerAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver) {
        return this.mRtcEngineImpl.unregisterMediaPlayerAudioSpectrumObserver(this.mNativeMediaPlayerSourceId, iAudioSpectrumObserver);
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int open(String str, long j) {
        return this.mRtcEngineImpl.mediaPlayerOpen(this.mNativeMediaPlayerSourceId, str, j);
    }
}
