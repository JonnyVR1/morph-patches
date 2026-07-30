package com.bytedance.realx.video;

import androidx.annotation.Nullable;
import com.bytedance.realx.base.CalledByNative;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import p149l.k250;

/* JADX INFO: loaded from: classes.dex */
public class EncodedImage {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final boolean completeFrame;
    public final long compositionTimeUs;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;

    /* JADX INFO: renamed from: qp */
    public final Integer f4731qp;
    public final int rotation;
    public final int svcLayerNum;

    public static class Builder {
        private ByteBuffer buffer;
        private long captureTimeNs;
        private boolean completeFrame;
        private long compositionTimeUs;
        private int encodedHeight;
        private int encodedWidth;
        private FrameType frameType;

        /* JADX INFO: renamed from: qp */
        private Integer f4732qp;
        private int rotation;
        private int svcLayerNum;

        private Builder() {
            this.f4732qp = -1;
        }

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.completeFrame, this.f4732qp, this.svcLayerNum, this.compositionTimeUs);
        }

        public Builder setBuffer(ByteBuffer byteBuffer) {
            this.buffer = byteBuffer;
            return this;
        }

        @Deprecated
        public Builder setCaptureTimeMs(long j) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j);
            return this;
        }

        public Builder setCaptureTimeNs(long j) {
            this.captureTimeNs = j;
            return this;
        }

        public Builder setCompleteFrame(boolean z) {
            this.completeFrame = z;
            return this;
        }

        public Builder setCompositionTimeUs(long j) {
            this.compositionTimeUs = j;
            return this;
        }

        public Builder setEncodedHeight(int i) {
            this.encodedHeight = i;
            return this;
        }

        public Builder setEncodedWidth(int i) {
            this.encodedWidth = i;
            return this;
        }

        public Builder setFrameType(FrameType frameType) {
            this.frameType = frameType;
            return this;
        }

        public Builder setQp(Integer num) {
            this.f4732qp = num;
            return this;
        }

        public Builder setRotation(int i) {
            this.rotation = i;
            return this;
        }

        public Builder setSvcLayerNum(int i) {
            this.svcLayerNum = i;
            return this;
        }
    }

    public enum FrameType {
        kUnknow(0),
        kIntra(1),
        kPredicted(2),
        kBiPredicted(3),
        kEmpty(4),
        kLtrRecovery(5);

        private final int nativeIndex;

        FrameType(int i) {
            this.nativeIndex = i;
        }

        @CalledByNative("FrameType")
        public static FrameType fromNativeIndex(int i) {
            for (FrameType frameType : values()) {
                if (frameType.getNative() == i) {
                    return frameType;
                }
            }
            k250.m144273a("Unknown native frame type: ", i);
            return null;
        }

        public static FrameType valueOf(int i) {
            for (FrameType frameType : values()) {
                if (frameType.nativeIndex == i) {
                    return frameType;
                }
            }
            return kUnknow;
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    @CalledByNative
    private EncodedImage(ByteBuffer byteBuffer, int i, int i2, long j, FrameType frameType, int i3, boolean z, Integer num, int i4, long j2) {
        this.buffer = byteBuffer;
        this.encodedWidth = i;
        this.encodedHeight = i2;
        this.captureTimeMs = j / 1000000;
        this.captureTimeNs = j;
        this.frameType = frameType;
        this.rotation = i3;
        this.completeFrame = z;
        this.f4731qp = num;
        this.svcLayerNum = i4;
        this.compositionTimeUs = j2;
    }

    public static Builder builder() {
        return new Builder();
    }

    @CalledByNative
    private ByteBuffer getBuffer() {
        return this.buffer;
    }

    @CalledByNative
    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    @CalledByNative
    private boolean getCompleteFrame() {
        return this.completeFrame;
    }

    @CalledByNative
    private long getCompositionTimeUs() {
        return this.compositionTimeUs;
    }

    @CalledByNative
    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    @CalledByNative
    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    @CalledByNative
    private int getFrameType() {
        return this.frameType.getNative();
    }

    @Nullable
    @CalledByNative
    private Integer getQp() {
        return this.f4731qp;
    }

    @CalledByNative
    private int getRotation() {
        return this.rotation;
    }

    @CalledByNative
    private int getSvcLayerNum() {
        return this.svcLayerNum;
    }
}
