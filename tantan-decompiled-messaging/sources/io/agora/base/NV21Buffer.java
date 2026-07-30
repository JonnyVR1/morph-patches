package io.agora.base;

import androidx.annotation.Nullable;
import io.agora.base.internal.RefCountDelegate;
import java.nio.ByteBuffer;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public class NV21Buffer implements VideoFrame.Buffer {
    private final byte[] data;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private int sliceHeight;
    private int stride;
    private final int width;

    public NV21Buffer(int i, int i2, int i3, int i4, ByteBuffer byteBuffer, @Nullable Runnable runnable) {
        if (!byteBuffer.isDirect()) {
            ig3.m135964a("Data buffers must be direct byte buffers.");
            throw null;
        }
        this.width = i;
        this.height = i2;
        this.stride = i3;
        this.sliceHeight = i4;
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.data = bArr;
        byteBuffer.get(bArr, 0, bArr.length);
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, int i8, ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11);

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(i5, i6);
        int i7 = this.stride;
        if (i7 == 0) {
            i7 = this.width;
        }
        int i8 = i7;
        int i9 = this.sliceHeight;
        if (i9 == 0) {
            i9 = this.height;
        }
        nativeCropAndScale(i, i2, i3, i4, i5, i6, this.data, i8, i9, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV());
        return javaI420BufferAllocate;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
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
        int i = this.width;
        int i2 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i, i2, i, i2);
    }

    @Override // io.agora.base.VideoFrame.Buffer
    @Nullable
    public VideoFrame.Buffer transform(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return null;
    }

    public NV21Buffer(byte[] bArr, int i, int i2, @Nullable Runnable runnable) {
        this.data = bArr;
        this.width = i;
        this.height = i2;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}
