package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.data.PlayerError;
import com.p069ss.bytertc.engine.data.PlayerState;

/* JADX INFO: loaded from: classes13.dex */
public interface IAudioEffectPlayerEventHandler {
    void onAudioEffectPlayerStateChanged(int i, PlayerState playerState, PlayerError playerError);
}
