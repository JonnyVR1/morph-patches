package com.bytedance.realx.video.memory;

import android.graphics.Matrix;
import android.opengl.EGLContext;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoRotation;
import com.bytedance.realx.video.RXVideoScaleFilter;

/* JADX INFO: loaded from: classes.dex */
public interface RXVideoOpenGLMemoryInterface extends RXVideoMemoryInterface {
    Matrix getAndroidTextureMatrix();

    EGLContext getEGLContext();

    long getNativeEGLContext();

    RXVideoRotation getRotation();

    RXVideoScaleFilter getScaleFilter();

    int getTextureId();

    float[] getTextureMatrix();

    RXPixelFormat getTextureTarget();

    int getUnScaledHeight();

    int getUnScaledWidth();
}
