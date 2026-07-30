package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.data.PlayerError;
import com.p074ss.bytertc.engine.data.PlayerEvent;
import com.p074ss.bytertc.engine.data.PlayerState;

/* JADX INFO: loaded from: classes11.dex */
public interface IMediaPlayerEventHandler {
    void onMediaPlayerEvent(int i, PlayerEvent playerEvent, String str);

    void onMediaPlayerPlayingProgress(int i, long j);

    void onMediaPlayerStateChanged(int i, PlayerState playerState, PlayerError playerError);
}
