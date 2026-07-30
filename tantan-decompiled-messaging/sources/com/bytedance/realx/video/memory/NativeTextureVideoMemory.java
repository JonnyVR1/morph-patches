package com.bytedance.realx.video.memory;

import android.opengl.EGLContext;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoMemoryType;
import com.bytedance.realx.video.RXVideoRotation;
import com.bytedance.realx.video.RXVideoScaleFilter;
import com.bytedance.realx.video.memory.NativeTextureVideoMemory;

/* JADX INFO: loaded from: classes.dex */
public class NativeTextureVideoMemory extends RXVideoTextureMemory {
    private long nativeHandle;

    @CalledByNative
    public NativeTextureVideoMemory(long j) {
        this.nativeHandle = j;
        setReleaseCallback(new Runnable() { // from class: l.r620
            @Override // java.lang.Runnable
            public final void run() {
                NativeTextureVideoMemory.m5725b(this.f157890a);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5725b(NativeTextureVideoMemory nativeTextureVideoMemory) {
        long j = nativeTextureVideoMemory.nativeHandle;
        if (j != 0) {
            nativeReleaseTextureVideoMemory(j);
            nativeTextureVideoMemory.nativeHandle = 0L;
        }
    }

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

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public EGLContext getEGLContext() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetJavaEGLContext(j);
    }

    @Override // com.bytedance.realx.video.memory.RTCVideoMemory
    public int getHeight() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetHeight(j);
    }

    @Override // com.bytedance.realx.video.memory.RTCVideoMemory
    public RXVideoMemoryType getMemoryType() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetVideoMemoryType(j);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public long getNativeEGLContext() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetNativeEGLContext(j);
    }

    @Override // com.bytedance.realx.video.memory.RTCVideoMemory
    public RXVideoRotation getRotation() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetRotation(j);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public RXVideoScaleFilter getScaleFilter() {
        return nativeGetScaleFilter(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public int getTextureId() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetTextureId(j);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public float[] getTextureMatrix() {
        long j = this.nativeHandle;
        if (j != 0) {
            return nativeGetTextureMatrix(j);
        }
        float[] fArr = new float[16];
        fArr[0] = 1.0f;
        fArr[5] = 1.0f;
        fArr[10] = 1.0f;
        fArr[15] = 1.0f;
        return fArr;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public RXPixelFormat getTextureTarget() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetTextureTarget(j);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public int getUnScaledHeight() {
        return nativeGetUnscaledHeight(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public int getUnScaledWidth() {
        return nativeGetUnscaledWidth(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RTCVideoMemory
    public int getWidth() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetWidth(j);
    }
}
