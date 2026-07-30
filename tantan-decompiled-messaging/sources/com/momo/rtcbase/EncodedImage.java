package com.momo.rtcbase;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import p149l.k250;

/* JADX INFO: loaded from: classes8.dex */
public class EncodedImage {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final boolean completeFrame;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;

    /* JADX INFO: renamed from: qp */
    public final Integer f14543qp;
    public final int rotation;

    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);

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

        public int getNative() {
            return this.nativeIndex;
        }
    }

    @CalledByNative
    private EncodedImage(ByteBuffer byteBuffer, int i, int i2, long j, FrameType frameType, int i3, boolean z, Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i;
        this.encodedHeight = i2;
        this.captureTimeMs = j / 1000000;
        this.captureTimeNs = j;
        this.frameType = frameType;
        this.rotation = i3;
        this.completeFrame = z;
        this.f14543qp = num;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private ByteBuffer buffer;
        private long captureTimeNs;
        private boolean completeFrame;
        private int encodedHeight;
        private int encodedWidth;
        private FrameType frameType;

        /* JADX INFO: renamed from: qp */
        private Integer f14544qp;
        private int rotation;

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.completeFrame, this.f14544qp);
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
            this.f14544qp = num;
            return this;
        }

        public Builder setRotation(int i) {
            this.rotation = i;
            return this;
        }

        private Builder() {
        }
    }
}
