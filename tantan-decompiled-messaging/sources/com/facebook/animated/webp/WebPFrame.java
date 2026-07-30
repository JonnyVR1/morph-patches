package com.facebook.animated.webp;

import android.graphics.Bitmap;
import p149l.i5e;
import p149l.rq0;

/* JADX INFO: loaded from: classes.dex */
public class WebPFrame implements rq0 {

    @i5e
    private long mNativeContext;

    @i5e
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

    @Override // p149l.rq0
    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getDurationMs() {
        return nativeGetDurationMs();
    }

    @Override // p149l.rq0
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // p149l.rq0
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // p149l.rq0
    public int getXOffset() {
        return nativeGetXOffset();
    }

    @Override // p149l.rq0
    public int getYOffset() {
        return nativeGetYOffset();
    }

    public boolean isBlendWithPreviousFrame() {
        return nativeIsBlendWithPreviousFrame();
    }

    @Override // p149l.rq0
    public void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }

    public boolean shouldDisposeToBackgroundColor() {
        return nativeShouldDisposeToBackgroundColor();
    }
}
