package com.facebook.animated.gif;

import android.graphics.Bitmap;
import p149l.i5e;
import p149l.rq0;

/* JADX INFO: loaded from: classes.dex */
public class GifFrame implements rq0 {

    @i5e
    private long mNativeContext;

    @i5e
    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    @i5e
    private native void nativeDispose();

    @i5e
    private native void nativeFinalize();

    @i5e
    private native int nativeGetDisposalMode();

    @i5e
    private native int nativeGetDurationMs();

    @i5e
    private native int nativeGetHeight();

    @i5e
    private native int nativeGetTransparentPixelColor();

    @i5e
    private native int nativeGetWidth();

    @i5e
    private native int nativeGetXOffset();

    @i5e
    private native int nativeGetYOffset();

    @i5e
    private native boolean nativeHasTransparency();

    @i5e
    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    @Override // p149l.rq0
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

    @Override // p149l.rq0
    public int getHeight() {
        return nativeGetHeight();
    }

    public int getTransparentPixelColor() {
        return nativeGetTransparentPixelColor();
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

    public boolean hasTransparency() {
        return nativeHasTransparency();
    }

    @Override // p149l.rq0
    public void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}
