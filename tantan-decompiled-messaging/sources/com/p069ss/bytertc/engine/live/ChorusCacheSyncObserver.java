package com.p069ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.video.IVideoFrame;

/* JADX INFO: loaded from: classes13.dex */
public class ChorusCacheSyncObserver {
    private IChorusCacheSyncObserver observer = null;

    @CalledByNative
    public void onSyncEvent(ChorusCacheSyncEvent chorusCacheSyncEvent, ChorusCacheSyncError chorusCacheSyncError) {
        IChorusCacheSyncObserver iChorusCacheSyncObserver = this.observer;
        if (iChorusCacheSyncObserver != null) {
            iChorusCacheSyncObserver.onSyncEvent(chorusCacheSyncEvent, chorusCacheSyncError);
        }
    }

    @CalledByNative
    public void onSyncedUsersChanged(int i, String[] strArr) {
        IChorusCacheSyncObserver iChorusCacheSyncObserver = this.observer;
        if (iChorusCacheSyncObserver != null) {
            iChorusCacheSyncObserver.onSyncedUsersChanged(i, strArr);
        }
    }

    @CalledByNative
    public void onSyncedVideoFrames(int i, String[] strArr, IVideoFrame[] iVideoFrameArr) {
        IChorusCacheSyncObserver iChorusCacheSyncObserver = this.observer;
        if (iChorusCacheSyncObserver != null) {
            iChorusCacheSyncObserver.onSyncedVideoFrames(i, strArr, iVideoFrameArr);
        }
    }

    public void setUserObserver(IChorusCacheSyncObserver iChorusCacheSyncObserver) {
        if (iChorusCacheSyncObserver != null) {
            this.observer = iChorusCacheSyncObserver;
        }
    }
}
