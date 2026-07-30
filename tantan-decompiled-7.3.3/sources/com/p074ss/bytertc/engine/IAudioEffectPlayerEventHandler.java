package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.data.PlayerError;
import com.p074ss.bytertc.engine.data.PlayerState;

/* JADX INFO: loaded from: classes11.dex */
public interface IAudioEffectPlayerEventHandler {
    void onAudioEffectPlayerStateChanged(int i, PlayerState playerState, PlayerError playerError);
}
