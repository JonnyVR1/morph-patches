package com.facebook.animated.gif;

import android.graphics.Bitmap;
import p153l.nq0;
import p153l.w6e;

/* JADX INFO: loaded from: classes.dex */
public class GifFrame implements nq0 {

    @w6e
    private long mNativeContext;

    @w6e
    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    @w6e
    private native void nativeDispose();

    @w6e
    private native void nativeFinalize();

    @w6e
    private native int nativeGetDisposalMode();

    @w6e
    private native int nativeGetDurationMs();

    @w6e
    private native int nativeGetHeight();

    @w6e
    private native int nativeGetTransparentPixelColor();

    @w6e
    private native int nativeGetWidth();

    @w6e
    private native int nativeGetXOffset();

    @w6e
    private native int nativeGetYOffset();

    @w6e
    private native boolean nativeHasTransparency();

    @w6e
    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    @Override // p153l.nq0
    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getDisposalMode() {
        return nativeGetDisposalMode();
    }

    public int getDurationMs() {
        return nativeGetDurationMs();
    }

    @Override // p153l.nq0
    public int getHeight() {
        return nativeGetHeight();
    }

    public int getTransparentPixelColor() {
        return nativeGetTransparentPixelColor();
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

    public boolean hasTransparency() {
        return nativeHasTransparency();
    }

    @Override // p153l.nq0
    public void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}
