package com.facebook.animated.webp;

import android.graphics.Bitmap;
import p153l.nq0;
import p153l.w6e;

/* JADX INFO: loaded from: classes.dex */
public class WebPFrame implements nq0 {

    @w6e
    private long mNativeContext;

    @w6e
    public WebPFrame(long j) {
        this.mNativeContext = j;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

    @Override // p153l.nq0
    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getDurationMs() {
        return nativeGetDurationMs();
    }

    @Override // p153l.nq0
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // p153l.nq0
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // p153l.nq0
    public int getXOffset() {
        return nativeGetXOffset();
    }

    @Override // p153l.nq0
    public int getYOffset() {
        return nativeGetYOffset();
    }

    public boolean isBlendWithPreviousFrame() {
        return nativeIsBlendWithPreviousFrame();
    }

    @Override // p153l.nq0
    public void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }

    public boolean shouldDisposeToBackgroundColor() {
        return nativeShouldDisposeToBackgroundColor();
    }
}
