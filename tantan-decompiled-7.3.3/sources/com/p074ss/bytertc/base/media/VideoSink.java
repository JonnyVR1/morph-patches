package com.p074ss.bytertc.base.media;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.VideoFrame;

/* JADX INFO: loaded from: classes11.dex */
public interface VideoSink {
    @CalledByNative
    void onFrame(VideoFrame videoFrame);
}
