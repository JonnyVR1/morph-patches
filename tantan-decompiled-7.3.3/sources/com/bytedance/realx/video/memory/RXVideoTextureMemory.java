package com.bytedance.realx.video.memory;

import android.opengl.EGLContext;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoScaleFilter;

/* JADX INFO: loaded from: classes.dex */
public abstract class RXVideoTextureMemory extends RTCVideoMemory {
    @CalledByNative
    public abstract EGLContext getEGLContext();

    @CalledByNative
    public abstract long getNativeEGLContext();

    @CalledByNative
    public abstract RXVideoScaleFilter getScaleFilter();

    @CalledByNative
    public abstract int getTextureId();

    @CalledByNative
    public abstract float[] getTextureMatrix();

    @CalledByNative
    public abstract RXPixelFormat getTextureTarget();

    @CalledByNative
    public abstract int getUnScaledHeight();

    @CalledByNative
    public abstract int getUnScaledWidth();
}
