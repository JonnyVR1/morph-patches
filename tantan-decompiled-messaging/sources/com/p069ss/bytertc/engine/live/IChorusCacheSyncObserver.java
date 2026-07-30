package com.p069ss.bytertc.engine.live;

import com.p069ss.bytertc.engine.video.IVideoFrame;

/* JADX INFO: loaded from: classes13.dex */
public interface IChorusCacheSyncObserver {
    void onSyncEvent(ChorusCacheSyncEvent chorusCacheSyncEvent, ChorusCacheSyncError chorusCacheSyncError);

    void onSyncedUsersChanged(int i, String[] strArr);

    void onSyncedVideoFrames(int i, String[] strArr, IVideoFrame[] iVideoFrameArr);
}
