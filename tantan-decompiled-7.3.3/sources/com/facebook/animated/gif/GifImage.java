package com.facebook.animated.gif;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import java.nio.ByteBuffer;
import p153l.jq0;
import p153l.kq0;
import p153l.phm;
import p153l.re20;
import p153l.w6e;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
@w6e
public class GifImage implements jq0, kq0 {
    private static final int LOOP_COUNT_FOREVER = 0;
    private static final int LOOP_COUNT_MISSING = -1;
    private static volatile boolean sInitialized;
    private Bitmap.Config mDecodeBitmapConfig = null;

    @w6e
    private long mNativeContext;

    @w6e
    public GifImage(long j) {
        this.mNativeContext = j;
    }

    public static GifImage createFromByteArray(byte[] bArr) {
        wn80.m207182g(bArr);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.rewind();
        return createFromByteBuffer(byteBufferAllocateDirect, phm.m172328a());
    }

    public static GifImage createFromByteBuffer(ByteBuffer byteBuffer, phm phmVar) {
        ensure();
        byteBuffer.rewind();
        GifImage gifImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, phmVar.f152449b, phmVar.f152454g);
        gifImageNativeCreateFromDirectByteBuffer.mDecodeBitmapConfig = phmVar.f152456i;
        return gifImageNativeCreateFromDirectByteBuffer;
    }

    public static GifImage createFromFileDescriptor(int i, phm phmVar) {
        ensure();
        return nativeCreateFromFileDescriptor(i, phmVar.f152449b, phmVar.f152454g);
    }

    public static GifImage createFromNativeMemory(long j, int i, phm phmVar) {
        ensure();
        wn80.m207177b(Boolean.valueOf(j != 0));
        GifImage gifImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i, phmVar.f152449b, phmVar.f152454g);
        gifImageNativeCreateFromNativeMemory.mDecodeBitmapConfig = phmVar.f152456i;
        return gifImageNativeCreateFromNativeMemory;
    }

    private static synchronized void ensure() {
        if (!sInitialized) {
            sInitialized = true;
            re20.m180963d("gifimage");
        }
    }

    private static AnimatedDrawableFrameInfo.DisposalMethod fromGifDisposalMethod(int i) {
        if (i == 0) {
            return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT;
        }
        if (i == 1) {
            return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT;
        }
        if (i == 2) {
            return AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND;
        }
        return i == 3 ? AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS : AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT;
    }

    @w6e
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    @w6e
    private static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    @w6e
    private static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    @w6e
    private native void nativeDispose();

    @w6e
    private native void nativeFinalize();

    @w6e
    private native int nativeGetDuration();

    @w6e
    private native GifFrame nativeGetFrame(int i);

    @w6e
    private native int nativeGetFrameCount();

    @w6e
    private native int[] nativeGetFrameDurations();

    @w6e
    private native int nativeGetHeight();

    @w6e
    private native int nativeGetLoopCount();

    @w6e
    private native int nativeGetSizeInBytes();

    @w6e
    private native int nativeGetWidth();

    @w6e
    private native boolean nativeIsAnimated();

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
        return false;
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
        GifFrame frame = getFrame(i);
        try {
            return new AnimatedDrawableFrameInfo(i, frame.getXOffset(), frame.getYOffset(), frame.getWidth(), frame.getHeight(), AnimatedDrawableFrameInfo.BlendOperation.BLEND_WITH_PREVIOUS, fromGifDisposalMethod(frame.getDisposalMode()));
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
        int iNativeGetLoopCount = nativeGetLoopCount();
        if (iNativeGetLoopCount == -1) {
            return 1;
        }
        if (iNativeGetLoopCount != 0) {
            return iNativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // p153l.jq0
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // p153l.jq0
    public int getWidth() {
        return nativeGetWidth();
    }

    public boolean isAnimated() {
        return nativeIsAnimated();
    }

    @Override // p153l.jq0
    public GifFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    @w6e
    public GifImage() {
    }

    public static GifImage createFromByteBuffer(ByteBuffer byteBuffer) {
        return createFromByteBuffer(byteBuffer, phm.m172328a());
    }
}
