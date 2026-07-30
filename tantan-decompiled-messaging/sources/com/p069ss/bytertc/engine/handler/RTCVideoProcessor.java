package com.p069ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.video.IVideoFrame;
import com.p069ss.bytertc.engine.video.IVideoProcessor;

/* JADX INFO: loaded from: classes13.dex */
public class RTCVideoProcessor {
    private IVideoProcessor mProc = null;

    public void dispose() {
    }

    @CalledByNative
    public IVideoFrame processVideoFrame(IVideoFrame iVideoFrame) {
        synchronized (this) {
            try {
                IVideoProcessor iVideoProcessor = this.mProc;
                if (iVideoProcessor == null) {
                    return null;
                }
                return iVideoProcessor.processVideoFrame(iVideoFrame);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int registerLocalVideoProcessor(IVideoProcessor iVideoProcessor) {
        synchronized (this) {
            this.mProc = iVideoProcessor;
        }
        return 0;
    }
}
