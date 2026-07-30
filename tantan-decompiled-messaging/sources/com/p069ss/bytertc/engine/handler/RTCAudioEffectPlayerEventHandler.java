package com.p069ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.IAudioEffectPlayerEventHandler;
import com.p069ss.bytertc.engine.data.PlayerError;
import com.p069ss.bytertc.engine.data.PlayerState;

/* JADX INFO: loaded from: classes13.dex */
public class RTCAudioEffectPlayerEventHandler {
    private IAudioEffectPlayerEventHandler mAudioEffectHandler;

    @CalledByNative
    public synchronized void onAudioEffectPlayerStateChanged(int i, PlayerState playerState, PlayerError playerError) {
        IAudioEffectPlayerEventHandler iAudioEffectPlayerEventHandler = this.mAudioEffectHandler;
        if (iAudioEffectPlayerEventHandler != null) {
            iAudioEffectPlayerEventHandler.onAudioEffectPlayerStateChanged(i, playerState, playerError);
        }
    }

    public synchronized void setAudioEffectPlayerEventHandler(IAudioEffectPlayerEventHandler iAudioEffectPlayerEventHandler) {
        this.mAudioEffectHandler = iAudioEffectPlayerEventHandler;
    }
}
