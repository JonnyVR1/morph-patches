package com.facebook.animated.webp;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import java.nio.ByteBuffer;
import p153l.h4g0;
import p153l.jq0;
import p153l.kq0;
import p153l.phm;
import p153l.w6e;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
@w6e
public class WebPImage implements jq0, kq0 {
    private Bitmap.Config mDecodeBitmapConfig = null;

    @w6e
    private long mNativeContext;

    @w6e
    public WebPImage(long j) {
        this.mNativeContext = j;
    }

    public static WebPImage createFromByteArray(byte[] bArr, phm phmVar) {
        h4g0.m133574a();
        wn80.m207182g(bArr);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.rewind();
        WebPImage webPImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBufferAllocateDirect);
        if (phmVar != null) {
            webPImageNativeCreateFromDirectByteBuffer.mDecodeBitmapConfig = phmVar.f152456i;
        }
        return webPImageNativeCreateFromDirectByteBuffer;
    }

    public static WebPImage createFromByteBuffer(ByteBuffer byteBuffer, phm phmVar) {
        h4g0.m133574a();
        byteBuffer.rewind();
        WebPImage webPImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        if (phmVar != null) {
            webPImageNativeCreateFromDirectByteBuffer.mDecodeBitmapConfig = phmVar.f152456i;
        }
        return webPImageNativeCreateFromDirectByteBuffer;
    }

    public static WebPImage createFromNativeMemory(long j, int i, phm phmVar) {
        h4g0.m133574a();
        wn80.m207177b(Boolean.valueOf(j != 0));
        WebPImage webPImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i);
        if (phmVar != null) {
            webPImageNativeCreateFromNativeMemory.mDecodeBitmapConfig = phmVar.f152456i;
        }
        return webPImageNativeCreateFromNativeMemory;
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // p153l.kq0
    public jq0 decodeFromByteBuffer(ByteBuffer byteBuffer, phm phmVar) {
        return createFromByteBuffer(byteBuffer, phmVar);
    }

    @Override // p153l.kq0
    public jq0 decodeFromNativeMemory(long j, int i, phm phmVar) {
        return createFromNativeMemory(j, i, phmVar);
    }

    public void dispose() {
        nativeDispose();
    }

    @Override // p153l.jq0
    public boolean doesRenderSupportScaling() {
        return true;
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // p153l.jq0
    public Bitmap.Config getAnimatedBitmapConfig() {
        return this.mDecodeBitmapConfig;
    }

    public int getDuration() {
        return nativeGetDuration();
    }

    @Override // p153l.jq0
    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    @Override // p153l.jq0
    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    @Override // p153l.jq0
    public AnimatedDrawableFrameInfo getFrameInfo(int i) {
        WebPFrame frame = getFrame(i);
        try {
            return new AnimatedDrawableFrameInfo(i, frame.getXOffset(), frame.getYOffset(), frame.getWidth(), frame.getHeight(), frame.isBlendWithPreviousFrame() ? AnimatedDrawableFrameInfo.BlendOperation.BLEND_WITH_PREVIOUS : AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND, frame.shouldDisposeToBackgroundColor() ? AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND : AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT);
        } finally {
            frame.dispose();
        }
    }

    @Override // p153l.jq0
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // p153l.jq0
    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    @Override // p153l.jq0
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // p153l.jq0
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // p153l.jq0
    public WebPFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    @w6e
    public WebPImage() {
    }
}
