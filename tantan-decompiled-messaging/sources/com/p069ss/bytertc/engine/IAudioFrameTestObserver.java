package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.utils.AudioFrame;

/* JADX INFO: loaded from: classes13.dex */
public interface IAudioFrameTestObserver {
    void onAudioRecordFrame(AudioFrame audioFrame);

    void onLocalAudioVolume(int i, int i2);

    boolean onPlayoutBufferSink(int i, AudioFrame audioFrame);
}
