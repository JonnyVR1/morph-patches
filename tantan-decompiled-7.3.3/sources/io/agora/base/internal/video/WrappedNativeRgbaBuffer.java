package io.agora.base.internal.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.JniCommon;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
class WrappedNativeRgbaBuffer implements VideoFrame.RgbaBuffer {
    private final ByteBuffer data;
    private final int height;
    private long nativeBuffer;
    private final int width;

    @CalledByNative
    public WrappedNativeRgbaBuffer(int i, int i2, @NonNull ByteBuffer byteBuffer, long j) {
        this.nativeBuffer = j;
        this.width = i;
        this.height = i2;
        this.data = byteBuffer;
        retain();
    }

    @Override // io.agora.base.VideoFrame.Buffer
    @Nullable
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return null;
    }

    @Override // io.agora.base.VideoFrame.RgbaBuffer
    public ByteBuffer getData() {
        return this.data.slice();
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
        JniCommon.nativeReleaseRef(this.nativeBuffer);
    }

    @Override // io.agora.base.VideoFrame.Buffer, io.agora.base.internal.RefCounted
    public void retain() {
        JniCommon.nativeAddRef(this.nativeBuffer);
    }

    @Override // io.agora.base.VideoFrame.Buffer
    @Nullable
    public VideoFrame.Buffer rotate(int i) {
        return null;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    @Nullable
    public VideoFrame.I420Buffer toI420() {
        return null;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    @Nullable
    public VideoFrame.Buffer transform(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return null;
    }
}
