package com.facebook.animated.gif;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import java.nio.ByteBuffer;
import p149l.i5e;
import p149l.j620;
import p149l.nq0;
import p149l.oq0;
import p149l.rf80;
import p149l.zem;

/* JADX INFO: loaded from: classes.dex */
@i5e
public class GifImage implements nq0, oq0 {
    private static final int LOOP_COUNT_FOREVER = 0;
    private static final int LOOP_COUNT_MISSING = -1;
    private static volatile boolean sInitialized;
    private Bitmap.Config mDecodeBitmapConfig = null;

    @i5e
    private long mNativeContext;

    @i5e
    public GifImage(long j) {
        this.mNativeContext = j;
    }

    public static GifImage createFromByteArray(byte[] bArr) {
        rf80.m179116g(bArr);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.rewind();
        return createFromByteBuffer(byteBufferAllocateDirect, zem.m218355a());
    }

    public static GifImage createFromByteBuffer(ByteBuffer byteBuffer, zem zemVar) {
        ensure();
        byteBuffer.rewind();
        GifImage gifImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, zemVar.f202839b, zemVar.f202844g);
        gifImageNativeCreateFromDirectByteBuffer.mDecodeBitmapConfig = zemVar.f202846i;
        return gifImageNativeCreateFromDirectByteBuffer;
    }

    public static GifImage createFromFileDescriptor(int i, zem zemVar) {
        ensure();
        return nativeCreateFromFileDescriptor(i, zemVar.f202839b, zemVar.f202844g);
    }

    public static GifImage createFromNativeMemory(long j, int i, zem zemVar) {
        ensure();
        rf80.m179111b(Boolean.valueOf(j != 0));
        GifImage gifImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i, zemVar.f202839b, zemVar.f202844g);
        gifImageNativeCreateFromNativeMemory.mDecodeBitmapConfig = zemVar.f202846i;
        return gifImageNativeCreateFromNativeMemory;
    }

    private static synchronized void ensure() {
        if (!sInitialized) {
            sInitialized = true;
            j620.m139879d("gifimage");
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

    @i5e
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    @i5e
    private static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    @i5e
    private static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    @i5e
    private native void nativeDispose();

    @i5e
    private native void nativeFinalize();

    @i5e
    private native int nativeGetDuration();

    @i5e
    private native GifFrame nativeGetFrame(int i);

    @i5e
    private native int nativeGetFrameCount();

    @i5e
    private native int[] nativeGetFrameDurations();

    @i5e
    private native int nativeGetHeight();

    @i5e
    private native int nativeGetLoopCount();

    @i5e
    private native int nativeGetSizeInBytes();

    @i5e
    private native int nativeGetWidth();

    @i5e
    private native boolean nativeIsAnimated();

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
        return false;
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
        GifFrame frame = getFrame(i);
        try {
            return new AnimatedDrawableFrameInfo(i, frame.getXOffset(), frame.getYOffset(), frame.getWidth(), frame.getHeight(), AnimatedDrawableFrameInfo.BlendOperation.BLEND_WITH_PREVIOUS, fromGifDisposalMethod(frame.getDisposalMode()));
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
        int iNativeGetLoopCount = nativeGetLoopCount();
        if (iNativeGetLoopCount == -1) {
            return 1;
        }
        if (iNativeGetLoopCount != 0) {
            return iNativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // p149l.nq0
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // p149l.nq0
    public int getWidth() {
        return nativeGetWidth();
    }

    public boolean isAnimated() {
        return nativeIsAnimated();
    }

    @Override // p149l.nq0
    public GifFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    @i5e
    public GifImage() {
    }

    public static GifImage createFromByteBuffer(ByteBuffer byteBuffer) {
        return createFromByteBuffer(byteBuffer, zem.m218355a());
    }
}
