package com.p006ss.bytertc.base.media;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RXLogging;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RTCVSyncHelper {

    public static class ChoreographerFrameCallback implements Choreographer.FrameCallback {
        public long nativeCallbackHandle = 0;
        public String renderTaskUUID;

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            if (this.nativeCallbackHandle != 0) {
                Choreographer choreographer = Choreographer.getInstance();
                if (choreographer != null) {
                    choreographer.postFrameCallback(this);
                }
                RTCNativeFunctions.nativeNotifyVSyncDoFrame(this.nativeCallbackHandle, this.renderTaskUUID);
            }
        }

        public void resetCallback() {
            this.nativeCallbackHandle = 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8352a(ChoreographerFrameCallback choreographerFrameCallback) {
        Choreographer choreographer = Choreographer.getInstance();
        if (choreographer != null) {
            choreographer.postFrameCallback(choreographerFrameCallback);
        } else {
            RXLogging.e("RTCVSyncHelper", "Choreographer.getInstance() return null");
        }
    }

    @CalledByNative
    public static Object registerVSyncCallback(long j, String str) {
        if (j == 0) {
            return null;
        }
        final ChoreographerFrameCallback choreographerFrameCallback = new ChoreographerFrameCallback();
        choreographerFrameCallback.nativeCallbackHandle = j;
        choreographerFrameCallback.renderTaskUUID = str;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ss.bytertc.base.media.a
            @Override // java.lang.Runnable
            public final void run() {
                RTCVSyncHelper.m8352a(choreographerFrameCallback);
            }
        });
        return choreographerFrameCallback;
    }

    @CalledByNative
    public static void unregisterVSyncCallback(Object obj) {
        if (obj instanceof ChoreographerFrameCallback) {
            ((ChoreographerFrameCallback) obj).resetCallback();
        }
    }
}
