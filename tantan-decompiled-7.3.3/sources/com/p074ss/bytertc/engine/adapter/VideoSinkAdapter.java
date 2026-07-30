package com.p074ss.bytertc.engine.adapter;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.video.IVideoFrame;
import com.p074ss.bytertc.engine.video.IVideoSink;

/* JADX INFO: loaded from: classes11.dex */
public class VideoSinkAdapter implements IVideoSink {
    private IVideoSink mSink;

    public VideoSinkAdapter(IVideoSink iVideoSink) {
        this.mSink = iVideoSink;
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoSink
    @CalledByNative
    public int getRenderElapse() {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            return iVideoSink.getRenderElapse();
        }
        return 0;
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoSink
    @CalledByNative
    public void onFrame(IVideoFrame iVideoFrame) {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            iVideoSink.onFrame(iVideoFrame);
        }
    }

    @CalledByNative
    public void release() {
    }
}
