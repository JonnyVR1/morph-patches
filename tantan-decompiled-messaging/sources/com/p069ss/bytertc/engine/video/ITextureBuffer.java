package com.p069ss.bytertc.engine.video;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public interface ITextureBuffer {
    @CalledByNative
    int getTextureId();

    @CalledByNative
    int getTypeGlTarget();

    @CalledByNative
    float[] nativeGetTransFormMatrix();

    @CalledByNative
    void release();

    @CalledByNative
    void retain();
}
