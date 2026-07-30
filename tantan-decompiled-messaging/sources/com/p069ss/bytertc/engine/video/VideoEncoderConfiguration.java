package com.p069ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes13.dex */
public class VideoEncoderConfiguration {
    public VideoDimensions dimensions;
    public FrameRate frameRate;
    public int kBitrate;
    public int kMinBitrate;
    public OrientationMode orientationMode;

    public enum OrientationMode {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);

        private int value;

        OrientationMode(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public VideoEncoderConfiguration(VideoDimensions videoDimensions, FrameRate frameRate, int i, int i2, OrientationMode orientationMode) {
        this.dimensions = videoDimensions;
        this.frameRate = frameRate;
        this.kBitrate = i;
        this.kMinBitrate = i2;
        this.orientationMode = orientationMode;
    }

    public String toString() {
        return "VideoEncoderConfiguration{dimensions=" + this.dimensions + ", frameRate=" + this.frameRate + ", bitrate=" + this.kBitrate + ", minBitrate=" + this.kMinBitrate + ", orienttationMode=" + this.orientationMode + '}';
    }
}
