package com.p006ss.bytertc.base.media;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.VideoFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface VideoSink {
    @CalledByNative
    void onFrame(VideoFrame videoFrame);
}
