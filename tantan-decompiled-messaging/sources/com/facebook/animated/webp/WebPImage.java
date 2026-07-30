package com.facebook.animated.webp;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import java.nio.ByteBuffer;
import p149l.i5e;
import p149l.nq0;
import p149l.oq0;
import p149l.rf80;
import p149l.yvf0;
import p149l.zem;

/* JADX INFO: loaded from: classes.dex */
@i5e
public class WebPImage implements nq0, oq0 {
    private Bitmap.Config mDecodeBitmapConfig = null;

    @i5e
    private long mNativeContext;

    @i5e
    public WebPImage(long j) {
        this.mNativeContext = j;
    }

    public static WebPImage createFromByteArray(byte[] bArr, zem zemVar) {
        yvf0.m216215a();
        rf80.m179116g(bArr);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.rewind();
        WebPImage webPImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBufferAllocateDirect);
        if (zemVar != null) {
            webPImageNativeCreateFromDirectByteBuffer.mDecodeBitmapConfig = zemVar.f202846i;
        }
        return webPImageNativeCreateFromDirectByteBuffer;
    }

    public static WebPImage createFromByteBuffer(ByteBuffer byteBuffer, zem zemVar) {
        yvf0.m216215a();
        byteBuffer.rewind();
        WebPImage webPImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        if (zemVar != null) {
            webPImageNativeCreateFromDirectByteBuffer.mDecodeBitmapConfig = zemVar.f202846i;
        }
        return webPImageNativeCreateFromDirectByteBuffer;
    }

    public static WebPImage createFromNativeMemory(long j, int i, zem zemVar) {
        yvf0.m216215a();
        rf80.m179111b(Boolean.valueOf(j != 0));
        WebPImage webPImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i);
        if (zemVar != null) {
            webPImageNativeCreateFromNativeMemory.mDecodeBitmapConfig = zemVar.f202846i;
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

    @Override // p149l.oq0
    public nq0 decodeFromByteBuffer(ByteBuffer byteBuffer, zem zemVar) {
        return createFromByteBuffer(byteBuffer, zemVar);
    }

    @Override // p149l.oq0
    public nq0 decodeFromNativeMemory(long j, int i, zem zemVar) {
        return createFromNativeMemory(j, i, zemVar);
    }

    public void dispose() {
        nativeDispose();
    }

    @Override // p149l.nq0
    public boolean doesRenderSupportScaling() {
        return true;
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // p149l.nq0
    public Bitmap.Config getAnimatedBitmapConfig() {
        return this.mDecodeBitmapConfig;
    }

    public int getDuration() {
        return nativeGetDuration();
    }

    @Override // p149l.nq0
    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    @Override // p149l.nq0
    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    @Override // p149l.nq0
    public AnimatedDrawableFrameInfo getFrameInfo(int i) {
        WebPFrame frame = getFrame(i);
        try {
            return new AnimatedDrawableFrameInfo(i, frame.getXOffset(), frame.getYOffset(), frame.getWidth(), frame.getHeight(), frame.isBlendWithPreviousFrame() ? AnimatedDrawableFrameInfo.BlendOperation.BLEND_WITH_PREVIOUS : AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND, frame.shouldDisposeToBackgroundColor() ? AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND : AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT);
        } finally {
            frame.dispose();
        }
    }

    @Override // p149l.nq0
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // p149l.nq0
    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    @Override // p149l.nq0
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // p149l.nq0
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // p149l.nq0
    public WebPFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    @i5e
    public WebPImage() {
    }
}
