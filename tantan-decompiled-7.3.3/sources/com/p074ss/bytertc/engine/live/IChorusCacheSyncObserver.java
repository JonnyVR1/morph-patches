package com.p074ss.bytertc.engine.live;

import com.p074ss.bytertc.engine.video.IVideoFrame;

/* JADX INFO: loaded from: classes11.dex */
public interface IChorusCacheSyncObserver {
    void onSyncEvent(ChorusCacheSyncEvent chorusCacheSyncEvent, ChorusCacheSyncError chorusCacheSyncError);

    void onSyncedUsersChanged(int i, String[] strArr);

    void onSyncedVideoFrames(int i, String[] strArr, IVideoFrame[] iVideoFrameArr);
}
