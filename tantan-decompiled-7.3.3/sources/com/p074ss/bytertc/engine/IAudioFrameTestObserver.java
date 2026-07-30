package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.utils.AudioFrame;

/* JADX INFO: loaded from: classes11.dex */
public interface IAudioFrameTestObserver {
    void onAudioRecordFrame(AudioFrame audioFrame);

    void onLocalAudioVolume(int i, int i2);

    boolean onPlayoutBufferSink(int i, AudioFrame audioFrame);
}
