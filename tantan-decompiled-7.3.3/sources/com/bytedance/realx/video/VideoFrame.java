package com.bytedance.realx.video;

import android.graphics.Matrix;
import android.opengl.EGLContext;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.RefCounted;
import java.nio.ByteBuffer;
import p153l.wg3;

/* JADX INFO: loaded from: classes.dex */
public class VideoFrame implements RefCounted {
    private final Buffer buffer;
    private int colorSpace;
    private final ByteBuffer extendedData;
    private boolean isFlip;
    private int iso;
    private final int rotation;
    private final long timestampNs;

    public interface Buffer extends RefCounted {

        public interface BufferType {
            public static final int I420 = 3;
            public static final int Null = 0;
            public static final int Nv12 = 1;
            public static final int Nv21 = 2;
            public static final int RGBA = 5;
            public static final int Texture = 4;
        }

        @CalledByNative("Buffer")
        Buffer copyData();

        @CalledByNative("Buffer")
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        @CalledByNative("Buffer")
        int getBufferType();

        @CalledByNative("Buffer")
        int getHeight();

        @CalledByNative("Buffer")
        int getWidth();

        @Override // com.bytedance.realx.base.RefCounted
        @CalledByNative("Buffer")
        void release();

        @Override // com.bytedance.realx.base.RefCounted
        @CalledByNative("Buffer")
        void retain();

        @CalledByNative("Buffer")
        Buffer scaleAndFill(int i, int i2, int i3, int i4);

        @CalledByNative("Buffer")
        I420Buffer toI420();

        @CalledByNative("Buffer")
        default NV12Buffer toNV12() {
            RXLogging.m5742e("VideoFrame", "toNV12 has not been implemented, default return null");
            return null;
        }
    }

    public enum ColorSpace {
        kUnknown(0),
        kYCbCrBT601LimitedRange(1),
        kYCbCrBT601FullRange(2),
        kYCbCrBT709LimitedRange(3),
        kYCbCrBT709FullRange(4);

        private int colorSpace;

        ColorSpace(int i) {
            this.colorSpace = i;
        }

        public int getColorSpace() {
            return this.colorSpace;
        }
    }

    public interface I420Buffer extends Buffer {
        @Override // com.bytedance.realx.video.VideoFrame.Buffer
        @CalledByNative("I420Buffer")
        default int getBufferType() {
            return 3;
        }

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

    public interface NV12Buffer extends Buffer {
        @Override // com.bytedance.realx.video.VideoFrame.Buffer
        @CalledByNative("NV12Buffer")
        default int getBufferType() {
            return 1;
        }

        @CalledByNative("NV12Buffer")
        ByteBuffer getDataUV();

        @CalledByNative("NV12Buffer")
        ByteBuffer getDataY();

        @CalledByNative("NV12Buffer")
        int getStrideUV();

        @CalledByNative("NV12Buffer")
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

            @CalledByNative("TextureBuffer")
            public int getGlTarget() {
                return this.glTarget;
            }
        }

        @CalledByNative("TextureBuffer")
        Buffer cropAndScaleWithFilter(int i, int i2, int i3, int i4, int i5, int i6, int i7);

        @Override // com.bytedance.realx.video.VideoFrame.Buffer
        @CalledByNative("TextureBuffer")
        default int getBufferType() {
            return 4;
        }

        @CalledByNative("TextureBuffer")
        EGLContext getEglContext();

        @CalledByNative("TextureBuffer")
        long getNativeEglContext();

        @CalledByNative("TextureBuffer")
        FilterType getScaleFilter();

        @CalledByNative("TextureBuffer")
        int getTextureId();

        @CalledByNative("TextureBuffer")
        Matrix getTransformMatrix();

        @CalledByNative("TextureBuffer")
        Type getType();

        @CalledByNative("TextureBuffer")
        int getTypeGlTarget();

        @CalledByNative("TextureBuffer")
        int getUnscaledHeight();

        @CalledByNative("TextureBuffer")
        int getUnscaledWidth();

        @CalledByNative("TextureBuffer")
        float[] nativeGetTransFormMatrix();
    }

    @CalledByNative
    public VideoFrame(Buffer buffer, ByteBuffer byteBuffer, int i, long j, boolean z, int i2) {
        this.isFlip = false;
        this.colorSpace = 0;
        this.iso = -1;
        if (buffer == null) {
            wg3.m206174a("buffer not allowed to be null");
            throw null;
        }
        if (i % 90 != 0) {
            wg3.m206174a("rotation must be a multiple of 90");
            throw null;
        }
        this.buffer = buffer;
        this.rotation = i;
        this.timestampNs = j;
        this.extendedData = byteBuffer;
        this.isFlip = z;
        this.colorSpace = i2;
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
    public int getColorSpace() {
        return this.colorSpace;
    }

    public ByteBuffer getExtendedData() {
        return this.extendedData;
    }

    @CalledByNative
    public boolean getFlipState() {
        return this.isFlip;
    }

    @CalledByNative
    public int getIso() {
        return this.iso;
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

    @Override // com.bytedance.realx.base.RefCounted
    @CalledByNative
    public void release() {
        this.buffer.release();
    }

    @Override // com.bytedance.realx.base.RefCounted
    public void retain() {
        this.buffer.retain();
    }

    @CalledByNative
    public void setFlipState(boolean z) {
        this.isFlip = z;
    }

    public void setIso(int i) {
        this.iso = i;
    }

    public VideoFrame(Buffer buffer, int i, long j, boolean z) {
        this.isFlip = false;
        this.colorSpace = 0;
        this.iso = -1;
        if (buffer != null) {
            if (i % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i;
                this.timestampNs = j;
                this.extendedData = null;
                this.isFlip = z;
                return;
            }
            wg3.m206174a("rotation must be a multiple of 90");
            throw null;
        }
        wg3.m206174a("buffer not allowed to be null");
        throw null;
    }

    public VideoFrame(Buffer buffer, ByteBuffer byteBuffer, int i, long j) {
        this.isFlip = false;
        this.colorSpace = 0;
        this.iso = -1;
        if (buffer != null) {
            if (i % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i;
                this.timestampNs = j;
                this.extendedData = byteBuffer;
                return;
            }
            wg3.m206174a("rotation must be a multiple of 90");
            throw null;
        }
        wg3.m206174a("buffer not allowed to be null");
        throw null;
    }

    public VideoFrame(Buffer buffer, ByteBuffer byteBuffer, int i, long j, boolean z) {
        this.isFlip = false;
        this.colorSpace = 0;
        this.iso = -1;
        if (buffer != null) {
            if (i % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i;
                this.timestampNs = j;
                this.extendedData = byteBuffer;
                this.isFlip = z;
                return;
            }
            wg3.m206174a("rotation must be a multiple of 90");
            throw null;
        }
        wg3.m206174a("buffer not allowed to be null");
        throw null;
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        this(buffer, (ByteBuffer) null, i, j);
    }
}
