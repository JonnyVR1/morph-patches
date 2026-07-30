package com.bytedance.realx.video;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RefCounted;

/* JADX INFO: loaded from: classes.dex */
public interface RXVideoFrameHelperInterface extends RefCounted {
    @CalledByNative
    long getNativeHandle();

    @Override // com.bytedance.realx.base.RefCounted
    void release();

    @Override // com.bytedance.realx.base.RefCounted
    void retain();
}
