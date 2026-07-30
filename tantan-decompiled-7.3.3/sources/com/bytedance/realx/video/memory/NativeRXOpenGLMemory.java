package com.bytedance.realx.video.memory;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import androidx.annotation.NonNull;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.MediaCodecTextureBufferHelper;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoMemoryType;
import com.bytedance.realx.video.RXVideoRotation;
import com.bytedance.realx.video.RXVideoScaleFilter;
import com.bytedance.realx.video.RendererCommon;

/* JADX INFO: loaded from: classes.dex */
public class NativeRXOpenGLMemory extends RXVideoMemory implements RXVideoOpenGLMemoryInterface {
    @CalledByNative
    public NativeRXOpenGLMemory(long j) {
        super(j);
    }

    @NonNull
    public static NativeRXOpenGLMemory createRXOpenGLMemory(int i, int i2, int i3, int i4, int i5, RXPixelFormat rXPixelFormat, float[] fArr, EGLContext eGLContext, RXVideoScaleFilter rXVideoScaleFilter, RXVideoRotation rXVideoRotation, Runnable runnable) {
        return new NativeRXOpenGLMemory(nativeCreateOpenGLMemory(i, i2, i3, i4, i5, rXPixelFormat, fArr, eGLContext, rXVideoScaleFilter, rXVideoRotation, runnable));
    }

    private static native long nativeCreateOpenGLMemory(int i, int i2, int i3, int i4, int i5, RXPixelFormat rXPixelFormat, float[] fArr, EGLContext eGLContext, RXVideoScaleFilter rXVideoScaleFilter, RXVideoRotation rXVideoRotation, Runnable runnable);

    private static native int nativeGetHeight(long j);

    private static native EGLContext nativeGetJavaEGLContext(long j);

    private static native long nativeGetNativeEGLContext(long j);

    private static native RXVideoRotation nativeGetRotation(long j);

    private static native RXVideoScaleFilter nativeGetScaleFilter(long j);

    private static native int nativeGetTextureId(long j);

    private static native float[] nativeGetTextureMatrix(long j);

    private static native RXPixelFormat nativeGetTextureTarget(long j);

    private static native int nativeGetUnscaledHeight(long j);

    private static native int nativeGetUnscaledWidth(long j);

    private static native RXVideoMemoryType nativeGetVideoMemoryType(long j);

    private static native int nativeGetWidth(long j);

    private static native void nativeReleaseTextureVideoMemory(long j);

    private static native void nativeSetRenderHelper(long j, MediaCodecTextureBufferHelper mediaCodecTextureBufferHelper);

    @CalledByNative
    private static void release(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public Matrix getAndroidTextureMatrix() {
        return isNullPointer() ? new Matrix() : RendererCommon.convertMatrixToAndroidGraphicsMatrix(nativeGetTextureMatrix(this.nativeHandle));
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public EGLContext getEGLContext() {
        return isNullPointer() ? EGL14.EGL_NO_CONTEXT : nativeGetJavaEGLContext(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public int getHeight() {
        return nativeGetHeight(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public RXVideoMemoryType getMemoryType() {
        if (isNullPointer()) {
            return null;
        }
        return nativeGetVideoMemoryType(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public long getNativeEGLContext() {
        if (isNullPointer()) {
            return 0L;
        }
        return nativeGetNativeEGLContext(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public RXPixelFormat getPixelFormat() {
        return getTextureTarget();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public RXVideoRotation getRotation() {
        if (isNullPointer()) {
            return null;
        }
        return nativeGetRotation(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public RXVideoScaleFilter getScaleFilter() {
        return nativeGetScaleFilter(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public int getTextureId() {
        if (isNullPointer()) {
            return 0;
        }
        return nativeGetTextureId(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public float[] getTextureMatrix() {
        if (!isNullPointer()) {
            return nativeGetTextureMatrix(this.nativeHandle);
        }
        float[] fArr = new float[16];
        fArr[0] = 1.0f;
        fArr[5] = 1.0f;
        fArr[10] = 1.0f;
        fArr[15] = 1.0f;
        return fArr;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public RXPixelFormat getTextureTarget() {
        return isNullPointer() ? RXPixelFormat.kUnknown : nativeGetTextureTarget(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public int getUnScaledHeight() {
        return nativeGetUnscaledHeight(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public int getUnScaledWidth() {
        return nativeGetUnscaledWidth(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public int getWidth() {
        return nativeGetWidth(this.nativeHandle);
    }

    public void setRenderHelper(MediaCodecTextureBufferHelper mediaCodecTextureBufferHelper) {
        nativeSetRenderHelper(this.nativeHandle, mediaCodecTextureBufferHelper);
    }
}
