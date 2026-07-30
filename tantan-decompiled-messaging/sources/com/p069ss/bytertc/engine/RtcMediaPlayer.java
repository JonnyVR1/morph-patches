package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.audio.IMediaPlayer;
import com.p069ss.bytertc.engine.data.AudioMixingDualMonoMode;
import com.p069ss.bytertc.engine.data.AudioMixingType;
import com.p069ss.bytertc.engine.data.MediaPlayerConfig;
import com.p069ss.bytertc.engine.data.MediaPlayerCustomSource;
import com.p069ss.bytertc.engine.data.PlayerState;
import com.p069ss.bytertc.engine.data.ReturnStatus;
import com.p069ss.bytertc.engine.handler.RTCMediaPlayerAudioFrameObserver;
import com.p069ss.bytertc.engine.handler.RTCMediaPlayerCustomSourceProvider;
import com.p069ss.bytertc.engine.handler.RTCMediaPlayerEventHandler;
import com.p069ss.bytertc.engine.utils.AudioFrame;
import com.p069ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: loaded from: classes13.dex */
public class RtcMediaPlayer extends IMediaPlayer {
    private static final String TAG = "MediaPlayer";
    private RTCMediaPlayerAudioFrameObserver mAudioFrameObserver;
    private RTCMediaPlayerCustomSourceProvider mMediaPlayerCustomSourceProvider;
    private RTCMediaPlayerEventHandler mMediaPlayerEventHandler;
    private long mNativeMediaPlayer;
    private long mNativeRTCEngine;

    public RtcMediaPlayer(long j, long j2) {
        this.mAudioFrameObserver = null;
        this.mMediaPlayerEventHandler = null;
        this.mMediaPlayerCustomSourceProvider = null;
        this.mNativeMediaPlayer = j;
        this.mNativeRTCEngine = j2;
        this.mAudioFrameObserver = new RTCMediaPlayerAudioFrameObserver();
        this.mMediaPlayerEventHandler = new RTCMediaPlayerEventHandler();
        this.mMediaPlayerCustomSourceProvider = new RTCMediaPlayerCustomSourceProvider();
    }

    public synchronized void destroy() {
        NativeMediaPlayerFunctions.nativeDestory(this.mNativeMediaPlayer);
        this.mNativeMediaPlayer = 0L;
        this.mNativeRTCEngine = 0L;
        this.mAudioFrameObserver = null;
        this.mMediaPlayerEventHandler = null;
        this.mMediaPlayerCustomSourceProvider = null;
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int getAudioTrackCount() {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeGetAudioTrackCount(j);
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, getAudioTrackCount failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int getPlaybackDuration() {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeGetPlaybackDuration(j);
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, getPlaybackDuration failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int getPosition() {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeGetPosition(j);
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, getPosition failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized PlayerState getState() {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return PlayerState.fromId(NativeMediaPlayerFunctions.nativeGetState(j));
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, getState failed.");
        return PlayerState.IDLE;
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int getTotalDuration() {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeGetTotalDuration(j);
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, getTotalDuration failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int getVolume(AudioMixingType audioMixingType) {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeGetVolume(j, audioMixingType.value());
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, getVolume failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int open(String str, MediaPlayerConfig mediaPlayerConfig) {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeOpen(j, str, mediaPlayerConfig.type.value(), mediaPlayerConfig.playCount, mediaPlayerConfig.startPos, mediaPlayerConfig.autoPlay, mediaPlayerConfig.callbackOnProgressInterval, mediaPlayerConfig.syncProgressToRecordFrame);
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, open failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int openWithCustomSource(MediaPlayerCustomSource mediaPlayerCustomSource, MediaPlayerConfig mediaPlayerConfig) {
        if (this.mNativeMediaPlayer == 0) {
            LogUtil.m80901e(TAG, "native MediaPlayer is invalid, openWithCustomSource failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        this.mMediaPlayerCustomSourceProvider.setCustomSourceProvider(mediaPlayerCustomSource.provider);
        return NativeMediaPlayerFunctions.nativeOpenWithCustomSource(this.mNativeMediaPlayer, mediaPlayerCustomSource.mode.value(), mediaPlayerCustomSource.type.value(), this.mMediaPlayerCustomSourceProvider, mediaPlayerConfig.type.value(), mediaPlayerConfig.playCount, mediaPlayerConfig.startPos, mediaPlayerConfig.autoPlay, mediaPlayerConfig.callbackOnProgressInterval, mediaPlayerConfig.syncProgressToRecordFrame);
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int pause() {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativePause(j);
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, pause failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int pushExternalAudioFrame(AudioFrame audioFrame) {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativePushExternalAudioFrame(j, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, pushExternalAudioFrame failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int registerAudioFrameObserver(IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver) {
        if (this.mNativeMediaPlayer == 0) {
            LogUtil.m80901e(TAG, "native MediaPlayer is invalid, registerAudioFrameObserver failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        this.mAudioFrameObserver.setAudioFrameObserver(iMediaPlayerAudioFrameObserver);
        long j = this.mNativeMediaPlayer;
        if (iMediaPlayerAudioFrameObserver == null) {
            return NativeMediaPlayerFunctions.nativeRegisterAudioFrameObserver(j, null);
        }
        return NativeMediaPlayerFunctions.nativeRegisterAudioFrameObserver(j, this.mAudioFrameObserver);
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int resume() {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeResume(j);
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, resume failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int selectAudioTrack(int i) {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeSelectAudioTrack(j, i);
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, selectAudioTrack failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setAudioDualMonoMode(AudioMixingDualMonoMode audioMixingDualMonoMode) {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeSetAudioDualMonoMode(j, audioMixingDualMonoMode.value());
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, setAudioDualMonoMode failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setAudioPitch(int i) {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeSetAudioPitch(j, i);
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, setAudioPitch failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setEventHandler(IMediaPlayerEventHandler iMediaPlayerEventHandler) {
        if (this.mNativeMediaPlayer == 0) {
            LogUtil.m80901e(TAG, "native MediaPlayer is invalid, setEventHandler failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        this.mMediaPlayerEventHandler.setMediaPlayerEventHandler(iMediaPlayerEventHandler);
        long j = this.mNativeMediaPlayer;
        if (iMediaPlayerEventHandler == null) {
            return NativeMediaPlayerFunctions.nativeSetEventHandler(j, null);
        }
        return NativeMediaPlayerFunctions.nativeSetEventHandler(j, this.mMediaPlayerEventHandler);
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setLoudness(float f) {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeSetLoudness(j, f);
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, setLoudness failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setPlaybackSpeed(int i) {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeSetPlaybackSpeed(j, i);
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, setPlaybackSpeed failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setPosition(int i) {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeSetPosition(j, i);
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, setPosition failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setProgressInterval(long j) {
        long j2 = this.mNativeMediaPlayer;
        if (j2 != 0) {
            return NativeMediaPlayerFunctions.nativeSetProgressInterval(j2, j);
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, setProgressInterval failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setVolume(int i, AudioMixingType audioMixingType) {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeSetVolume(j, i, audioMixingType.value());
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, setVolume failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int start() {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeStart(j);
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, start failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.p069ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int stop() {
        long j = this.mNativeMediaPlayer;
        if (j != 0) {
            return NativeMediaPlayerFunctions.nativeStop(j);
        }
        LogUtil.m80901e(TAG, "native MediaPlayer is invalid, stop failed.");
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    public RtcMediaPlayer(long j) {
        this(j, 0L);
    }
}
