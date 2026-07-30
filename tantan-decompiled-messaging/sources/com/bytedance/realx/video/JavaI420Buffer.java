package com.bytedance.realx.video;

import androidx.annotation.Nullable;
import com.bytedance.realx.base.JniCommon;
import com.bytedance.realx.base.RefCountDelegate;
import java.nio.ByteBuffer;
import p149l.ig3;
import p149l.yfq0;

/* JADX INFO: loaded from: classes.dex */
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    private JavaI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, @Nullable Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i3;
        this.strideU = i4;
        this.strideV = i5;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaI420Buffer allocate(int i, int i2) {
        int i3 = (i2 + 1) / 2;
        int i4 = (i + 1) / 2;
        int i5 = i * i2;
        int i6 = i4 * i3;
        int i7 = i5 + i6;
        final ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i4 * 2 * i3) + i5);
        if (byteBufferNativeAllocateByteBuffer == null) {
            return null;
        }
        byteBufferNativeAllocateByteBuffer.position(0);
        byteBufferNativeAllocateByteBuffer.limit(i5);
        ByteBuffer byteBufferSlice = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i5);
        byteBufferNativeAllocateByteBuffer.limit(i7);
        ByteBuffer byteBufferSlice2 = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i7);
        byteBufferNativeAllocateByteBuffer.limit(i7 + i6);
        return new JavaI420Buffer(i, i2, byteBufferSlice, i, byteBufferSlice2, i4, byteBufferNativeAllocateByteBuffer.slice(), i4, new Runnable() { // from class: l.hkq
            @Override // java.lang.Runnable
            public final void run() {
                JniCommon.nativeFreeByteBuffer(byteBufferNativeAllocateByteBuffer);
            }
        });
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4 = (i3 * (i2 - 1)) + i;
        if (byteBuffer.capacity() >= i4) {
            return;
        }
        yfq0.m214580a("Buffer must be at least ", i4, " bytes, but was ", byteBuffer.capacity());
    }

    public static VideoFrame.Buffer cropAndScaleI420(final VideoFrame.I420Buffer i420Buffer, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 != i5 || i4 != i6) {
            JavaI420Buffer javaI420BufferAllocate = allocate(i5, i6);
            if (javaI420BufferAllocate == null) {
                return null;
            }
            nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i, i2, i3, i4, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV(), i5, i6);
            return javaI420BufferAllocate;
        }
        ByteBuffer dataY = i420Buffer.getDataY();
        ByteBuffer dataU = i420Buffer.getDataU();
        ByteBuffer dataV = i420Buffer.getDataV();
        dataY.position(i + (i420Buffer.getStrideY() * i2));
        int i7 = i / 2;
        int i8 = i2 / 2;
        dataU.position((i420Buffer.getStrideU() * i8) + i7);
        dataV.position(i7 + (i8 * i420Buffer.getStrideV()));
        i420Buffer.retain();
        return wrap(i5, i6, dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new Runnable() { // from class: l.ikq
            @Override // java.lang.Runnable
            public final void run() {
                i420Buffer.release();
            }
        });
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12);

    private static native void nativeScaleAndFillI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, ByteBuffer byteBuffer4, int i6, ByteBuffer byteBuffer5, int i7, ByteBuffer byteBuffer6, int i8, int i9, int i10, int i11, int i12);

    public static VideoFrame.Buffer scaleAndFillI420(VideoFrame.I420Buffer i420Buffer, int i, int i2, int i3, int i4) {
        JavaI420Buffer javaI420BufferAllocate = allocate(i, i2);
        if (javaI420BufferAllocate == null) {
            return null;
        }
        nativeScaleAndFillI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i420Buffer.getWidth(), i420Buffer.getHeight(), javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV(), i, i2, i3, i4);
        return javaI420BufferAllocate;
    }

    public static JavaI420Buffer wrap(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, @Nullable Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            ig3.m135964a("Data buffers cannot be null.");
            return null;
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            ig3.m135964a("Data buffers must be direct byte buffers.");
            return null;
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
        ByteBuffer byteBufferSlice3 = byteBuffer3.slice();
        int i6 = (i + 1) / 2;
        int i7 = i2 / 2;
        checkCapacity(byteBufferSlice, i, i2, i3);
        checkCapacity(byteBufferSlice2, i6, i7, i4);
        checkCapacity(byteBufferSlice3, i6, i7, i5);
        return new JavaI420Buffer(i, i2, byteBufferSlice, i3, byteBufferSlice2, i4, byteBufferSlice3, i5, runnable);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return cropAndScaleI420(this, i, i2, i3, i4, i5, i6);
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        return scaleAndFillI420(this, i, i2, i3, i4);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }

    public static JavaI420Buffer allocate(int i, int i2, int i3, int i4) {
        int i5 = i3 / 2;
        int i6 = i3 * i4;
        int i7 = i5 * i4;
        int i8 = (i7 / 2) + i6;
        final ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i5 * 2 * i4) + i6);
        if (byteBufferNativeAllocateByteBuffer == null) {
            return null;
        }
        byteBufferNativeAllocateByteBuffer.position(0);
        byteBufferNativeAllocateByteBuffer.limit(i6);
        ByteBuffer byteBufferSlice = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i6);
        byteBufferNativeAllocateByteBuffer.limit(i8);
        ByteBuffer byteBufferSlice2 = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i8);
        byteBufferNativeAllocateByteBuffer.limit(i8 + i7);
        return new JavaI420Buffer(i, i2, byteBufferSlice, i3, byteBufferSlice2, i5, byteBufferNativeAllocateByteBuffer.slice(), i5, new Runnable() { // from class: l.fkq
            @Override // java.lang.Runnable
            public final void run() {
                JniCommon.nativeFreeByteBuffer(byteBufferNativeAllocateByteBuffer);
            }
        });
    }
}
