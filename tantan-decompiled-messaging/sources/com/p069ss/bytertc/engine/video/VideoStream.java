package com.p069ss.bytertc.engine.video;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RefCounted;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class VideoStream implements RefCounted {
    private final Buffer buffer;
    private final int height;
    private final int width;

    public interface Buffer extends RefCounted {
        @CalledByNative("Buffer")
        ByteBuffer getData();

        @CalledByNative("Buffer")
        int getDataSize();

        @Override // com.bytedance.realx.base.RefCounted
        @CalledByNative("VideoStreamBuffer")
        void release();

        @Override // com.bytedance.realx.base.RefCounted
        @CalledByNative("VideoStreamBuffer")
        void retain();
    }

    @CalledByNative
    public VideoStream(Buffer buffer, int i, int i2) {
        this.buffer = buffer;
        this.width = i;
        this.height = i2;
    }

    @CalledByNative
    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    @CalledByNative
    public Buffer getBuffer() {
        return this.buffer;
    }

    @CalledByNative
    public int getHeight() {
        return this.height;
    }

    @CalledByNative
    public int getWidth() {
        return this.width;
    }

    @Override // com.bytedance.realx.base.RefCounted
    @CalledByNative
    public void release() {
        this.buffer.release();
    }

    @Override // com.bytedance.realx.base.RefCounted
    public void retain() {
        this.buffer.retain();
    }
}
