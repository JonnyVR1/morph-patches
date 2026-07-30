package com.p074ss.bytertc.base.media;

import android.view.Choreographer;
import android.view.Surface;

/* JADX INFO: loaded from: classes11.dex */
public class ChoreographerFrameCallback implements Choreographer.FrameCallback {
    public Surface currentSurface;
    public long nativeCallbackHandle = 0;
    public String renderTaskUUID;

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.nativeCallbackHandle != 0) {
            Choreographer.getInstance().postFrameCallback(this);
            Surface surface = this.currentSurface;
            if (surface != null) {
                RTCNativeFunctions.nativeNotifyChoreographerDoFrame(this.nativeCallbackHandle, surface, this.renderTaskUUID);
            }
        }
    }

    public void resetCallback() {
        this.nativeCallbackHandle = 0L;
    }
}
