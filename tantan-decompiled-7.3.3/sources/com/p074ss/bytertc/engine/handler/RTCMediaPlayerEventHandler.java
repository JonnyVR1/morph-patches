package com.p074ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.IMediaPlayerEventHandler;
import com.p074ss.bytertc.engine.data.PlayerError;
import com.p074ss.bytertc.engine.data.PlayerEvent;
import com.p074ss.bytertc.engine.data.PlayerState;

/* JADX INFO: loaded from: classes11.dex */
public class RTCMediaPlayerEventHandler {
    private IMediaPlayerEventHandler mMediaPlayerHandler;

    @CalledByNative
    public synchronized void onMediaPlayerEvent(int i, PlayerEvent playerEvent, String str) {
        IMediaPlayerEventHandler iMediaPlayerEventHandler = this.mMediaPlayerHandler;
        if (iMediaPlayerEventHandler != null) {
            iMediaPlayerEventHandler.onMediaPlayerEvent(i, playerEvent, str);
        }
    }

    @CalledByNative
    public synchronized void onMediaPlayerPlayingProgress(int i, long j) {
        IMediaPlayerEventHandler iMediaPlayerEventHandler = this.mMediaPlayerHandler;
        if (iMediaPlayerEventHandler != null) {
            iMediaPlayerEventHandler.onMediaPlayerPlayingProgress(i, j);
        }
    }

    @CalledByNative
    public synchronized void onMediaPlayerStateChanged(int i, PlayerState playerState, PlayerError playerError) {
        IMediaPlayerEventHandler iMediaPlayerEventHandler = this.mMediaPlayerHandler;
        if (iMediaPlayerEventHandler != null) {
            iMediaPlayerEventHandler.onMediaPlayerStateChanged(i, playerState, playerError);
        }
    }

    public synchronized void setMediaPlayerEventHandler(IMediaPlayerEventHandler iMediaPlayerEventHandler) {
        this.mMediaPlayerHandler = iMediaPlayerEventHandler;
    }
}
