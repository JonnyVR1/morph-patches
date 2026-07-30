package io.agora.base;

import androidx.annotation.Nullable;
import io.agora.base.internal.JniCommon;
import io.agora.base.internal.RefCountDelegate;
import java.nio.ByteBuffer;
import p149l.dkq;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public class JavaI010Buffer implements VideoFrame.I010Buffer {
    private static final int BYTE_PER_CHANNEL = 2;
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    public JavaI010Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, @Nullable Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.strideY = i3;
        this.strideU = i4;
        this.strideV = i5;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaI010Buffer allocate(int i, int i2) {
        int i3 = (i2 + 1) / 2;
        int i4 = (i + 1) / 2;
        int i5 = i * i2;
        int i6 = i5 * 2;
        int i7 = i4 * i3 * 2;
        int i8 = i6 + i7;
        final ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i5 + (i4 * 2 * i3)) * 2);
        byteBufferNativeAllocateByteBuffer.position(0);
        byteBufferNativeAllocateByteBuffer.limit(i6);
        ByteBuffer byteBufferSlice = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i6);
        byteBufferNativeAllocateByteBuffer.limit(i8);
        ByteBuffer byteBufferSlice2 = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i8);
        byteBufferNativeAllocateByteBuffer.limit(i8 + i7);
        return new JavaI010Buffer(i, i2, byteBufferSlice, i, byteBufferSlice2, i4, byteBufferNativeAllocateByteBuffer.slice(), i4, new Runnable() { // from class: io.agora.base.JavaI010Buffer.1
            @Override // java.lang.Runnable
            public void run() {
                JniCommon.nativeFreeByteBuffer(byteBufferNativeAllocateByteBuffer);
            }
        });
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 * i * 2;
        if (byteBuffer.capacity() >= i3) {
            return;
        }
        dkq.m112270a("I010 Buffer must be at least ", i3, " bytes, but was ", byteBuffer.capacity(), "in i010");
    }

    public static VideoFrame.I420Buffer i010BufferToI420(JavaI010Buffer javaI010Buffer) {
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(javaI010Buffer.width, javaI010Buffer.height);
        nativeI010toI420(javaI010Buffer.getDataY(), javaI010Buffer.getStrideY(), javaI010Buffer.getDataU(), javaI010Buffer.getStrideU(), javaI010Buffer.getDataV(), javaI010Buffer.getStrideV(), javaI010Buffer.width, javaI010Buffer.height, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV(), javaI420BufferAllocate.getWidth(), javaI420BufferAllocate.getHeight());
        return javaI420BufferAllocate;
    }

    private static native void nativeI010toI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, ByteBuffer byteBuffer4, int i6, ByteBuffer byteBuffer5, int i7, ByteBuffer byteBuffer6, int i8, int i9, int i10);

    public static JavaI010Buffer wrap(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, @Nullable Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            ig3.m135964a("Data i010 buffers cannot be null.");
            return null;
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            ig3.m135964a("Data i010 buffers must be direct byte buffers.");
            return null;
        }
        int i6 = (i2 + 1) / 2;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
        ByteBuffer byteBufferSlice3 = byteBuffer3.slice();
        checkCapacity(byteBufferSlice, i2, i3);
        checkCapacity(byteBufferSlice2, i6, i4);
        checkCapacity(byteBufferSlice3, i6, i5);
        return new JavaI010Buffer(i, i2, byteBufferSlice, i3, byteBufferSlice2, i4, byteBufferSlice3, i5, runnable);
    }

    @Override // io.agora.base.VideoFrame.Buffer
    @Nullable
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return null;
    }

    @Override // io.agora.base.VideoFrame.I010Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // io.agora.base.VideoFrame.I010Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // io.agora.base.VideoFrame.I010Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // io.agora.base.VideoFrame.I010Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // io.agora.base.VideoFrame.I010Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // io.agora.base.VideoFrame.I010Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    @Nullable
    public VideoFrame.Buffer mirror(int i) {
        return null;
    }

    @Override // io.agora.base.VideoFrame.Buffer, io.agora.base.internal.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // io.agora.base.VideoFrame.Buffer, io.agora.base.internal.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // io.agora.base.VideoFrame.Buffer
    @Nullable
    public VideoFrame.Buffer rotate(int i) {
        return null;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return i010BufferToI420(this);
    }

    @Override // io.agora.base.VideoFrame.Buffer
    @Nullable
    public VideoFrame.Buffer transform(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return null;
    }
}
