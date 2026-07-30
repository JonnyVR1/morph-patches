package io.agora.base.internal.video;

import androidx.annotation.Nullable;
import io.agora.base.JavaI010Buffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.JniCommon;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
class WrappedNativeI010Buffer extends JavaI010Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final long nativeBuffer;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    @CalledByNative
    public WrappedNativeI010Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, long j) {
        super(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, null);
        this.width = i;
        this.height = i2;
        this.dataY = byteBuffer;
        this.strideY = i3;
        this.dataU = byteBuffer2;
        this.strideU = i4;
        this.dataV = byteBuffer3;
        this.strideV = i5;
        this.nativeBuffer = j;
        retain();
    }

    @Override // io.agora.base.JavaI010Buffer, io.agora.base.VideoFrame.Buffer
    @Nullable
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return null;
    }

    @Override // io.agora.base.JavaI010Buffer, io.agora.base.VideoFrame.I010Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // io.agora.base.JavaI010Buffer, io.agora.base.VideoFrame.I010Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // io.agora.base.JavaI010Buffer, io.agora.base.VideoFrame.I010Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // io.agora.base.JavaI010Buffer, io.agora.base.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // io.agora.base.JavaI010Buffer, io.agora.base.VideoFrame.I010Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // io.agora.base.JavaI010Buffer, io.agora.base.VideoFrame.I010Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // io.agora.base.JavaI010Buffer, io.agora.base.VideoFrame.I010Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // io.agora.base.JavaI010Buffer, io.agora.base.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // io.agora.base.JavaI010Buffer, io.agora.base.VideoFrame.Buffer
    @Nullable
    public VideoFrame.Buffer mirror(int i) {
        return null;
    }

    @Override // io.agora.base.JavaI010Buffer, io.agora.base.VideoFrame.Buffer, io.agora.base.internal.RefCounted
    public void release() {
        JniCommon.nativeReleaseRef(this.nativeBuffer);
    }

    @Override // io.agora.base.JavaI010Buffer, io.agora.base.VideoFrame.Buffer, io.agora.base.internal.RefCounted
    public void retain() {
        JniCommon.nativeAddRef(this.nativeBuffer);
    }

    @Override // io.agora.base.JavaI010Buffer, io.agora.base.VideoFrame.Buffer
    @Nullable
    public VideoFrame.Buffer rotate(int i) {
        return null;
    }

    @Override // io.agora.base.JavaI010Buffer, io.agora.base.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return super.toI420();
    }

    @Override // io.agora.base.JavaI010Buffer, io.agora.base.VideoFrame.Buffer
    @Nullable
    public VideoFrame.Buffer transform(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return null;
    }
}
