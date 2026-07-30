package com.p074ss.bytertc.engine.video;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
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
