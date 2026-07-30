package com.bytedance.realx.video.memory;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RefCounted;
import com.bytedance.realx.video.RXColorSpace;
import com.bytedance.realx.video.RXVideoRotation;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface RXVideoFrameInterface extends RefCounted {
    RXVideoMemoryInterface getAndRetainVideoFrameMemory();

    RXColorSpace getColorSpace();

    int getHeight();

    @CalledByNative
    long getNativeHandle();

    int getRotatedHeight();

    int getRotatedWidth();

    RXVideoRotation getRotation();

    ByteBuffer getSupplementData();

    long getTimestampNs();

    long getTimestampUs();

    int getWidth();

    @Override // com.bytedance.realx.base.RefCounted
    @CalledByNative
    void release();

    @Override // com.bytedance.realx.base.RefCounted
    void retain();

    void setRotation(RXVideoRotation rXVideoRotation);

    void setTimestampNs(long j);

    void setTimestampUs(long j);

    RXVideoFrameInterface toI420();
}
