package com.p074ss.bytertc.engine.audio;

import com.p074ss.bytertc.engine.IMediaPlayerAudioFrameObserver;
import com.p074ss.bytertc.engine.IMediaPlayerEventHandler;
import com.p074ss.bytertc.engine.data.AudioMixingDualMonoMode;
import com.p074ss.bytertc.engine.data.AudioMixingType;
import com.p074ss.bytertc.engine.data.MediaPlayerConfig;
import com.p074ss.bytertc.engine.data.MediaPlayerCustomSource;
import com.p074ss.bytertc.engine.data.PlayerState;
import com.p074ss.bytertc.engine.utils.AudioFrame;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IMediaPlayer {
    public abstract int getAudioTrackCount();

    public abstract int getPlaybackDuration();

    public abstract int getPosition();

    public abstract PlayerState getState();

    public abstract int getTotalDuration();

    public abstract int getVolume(AudioMixingType audioMixingType);

    public abstract int open(String str, MediaPlayerConfig mediaPlayerConfig);

    public abstract int openWithCustomSource(MediaPlayerCustomSource mediaPlayerCustomSource, MediaPlayerConfig mediaPlayerConfig);

    public abstract int pause();

    public abstract int pushExternalAudioFrame(AudioFrame audioFrame);

    public abstract int registerAudioFrameObserver(IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver);

    public abstract int resume();

    public abstract int selectAudioTrack(int i);

    public abstract int setAudioDualMonoMode(AudioMixingDualMonoMode audioMixingDualMonoMode);

    public abstract int setAudioPitch(int i);

    public abstract int setEventHandler(IMediaPlayerEventHandler iMediaPlayerEventHandler);

    public abstract int setLoudness(float f);

    public abstract int setPlaybackSpeed(int i);

    public abstract int setPosition(int i);

    public abstract int setProgressInterval(long j);

    public abstract int setVolume(int i, AudioMixingType audioMixingType);

    public abstract int start();

    public abstract int stop();
}
