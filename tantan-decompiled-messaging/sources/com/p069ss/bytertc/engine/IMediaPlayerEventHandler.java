package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.data.PlayerError;
import com.p069ss.bytertc.engine.data.PlayerEvent;
import com.p069ss.bytertc.engine.data.PlayerState;

/* JADX INFO: loaded from: classes13.dex */
public interface IMediaPlayerEventHandler {
    void onMediaPlayerEvent(int i, PlayerEvent playerEvent, String str);

    void onMediaPlayerPlayingProgress(int i, long j);

    void onMediaPlayerStateChanged(int i, PlayerState playerState, PlayerError playerError);
}
