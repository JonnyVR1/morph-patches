package com.momo.rtcbase;

import android.graphics.Matrix;
import java.nio.ByteBuffer;
import p149l.ig3;

/* JADX INFO: loaded from: classes8.dex */
public class VideoFrame implements RefCounted {
    private final Buffer buffer;
    private final int rotation;
    private final long timestampNs;

    public interface Buffer extends RefCounted {
        @CalledByNative("Buffer")
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        @CalledByNative("Buffer")
        int getHeight();

        @CalledByNative("Buffer")
        int getWidth();

        @Override // com.momo.rtcbase.RefCounted
        @CalledByNative("Buffer")
        void release();

        @Override // com.momo.rtcbase.RefCounted
        @CalledByNative("Buffer")
        void retain();

        @CalledByNative("Buffer")
        I420Buffer toI420();
    }

    public interface I420Buffer extends Buffer {
        @CalledByNative("I420Buffer")
        ByteBuffer getDataU();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataV();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataY();

        @CalledByNative("I420Buffer")
        int getStrideU();

        @CalledByNative("I420Buffer")
        int getStrideV();

        @CalledByNative("I420Buffer")
        int getStrideY();
    }

    public interface TextureBuffer extends Buffer {

        public enum Type {
            OES(36197),
            RGB(3553);

            private final int glTarget;

            Type(int i) {
                this.glTarget = i;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();
    }

    @CalledByNative
    public VideoFrame(Buffer buffer, int i, long j) {
        if (buffer == null) {
            ig3.m135964a("buffer not allowed to be null");
            throw null;
        }
        if (i % 90 != 0) {
            ig3.m135964a("rotation must be a multiple of 90");
            throw null;
        }
        this.buffer = buffer;
        this.rotation = i;
        this.timestampNs = j;
    }

    @CalledByNative
    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotatedHeight() {
        int i = this.rotation % 180;
        Buffer buffer = this.buffer;
        return i == 0 ? buffer.getHeight() : buffer.getWidth();
    }

    public int getRotatedWidth() {
        int i = this.rotation % 180;
        Buffer buffer = this.buffer;
        return i == 0 ? buffer.getWidth() : buffer.getHeight();
    }

    @CalledByNative
    public int getRotation() {
        return this.rotation;
    }

    @CalledByNative
    public long getTimestampNs() {
        return this.timestampNs;
    }

    @Override // com.momo.rtcbase.RefCounted
    @CalledByNative
    public void release() {
        this.buffer.release();
    }

    @Override // com.momo.rtcbase.RefCounted
    public void retain() {
        this.buffer.retain();
    }
}
