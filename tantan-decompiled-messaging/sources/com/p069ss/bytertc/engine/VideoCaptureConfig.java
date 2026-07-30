package com.p069ss.bytertc.engine;

/* JADX INFO: loaded from: classes13.dex */
public class VideoCaptureConfig {
    public CapturePreference capturePreference;
    public int frameRate;
    public int height;
    public int width;

    public enum CapturePreference {
        AUTO(0),
        MANUAL(1),
        AUTO_PERFORMANCE(2);

        private int value;

        CapturePreference(int i) {
            this.value = i;
        }

        public static CapturePreference convertFromInt(int i) {
            return values()[i];
        }

        public int getValue() {
            return this.value;
        }
    }

    public VideoCaptureConfig(int i, int i2, int i3) {
        this.capturePreference = CapturePreference.AUTO;
        this.capturePreference = CapturePreference.MANUAL;
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
    }

    public String toString() {
        return "VideoCaptureConfig{capturePreference=" + this.capturePreference + "width=" + this.width + ", height=" + this.height + ", frameRate=" + this.frameRate + '}';
    }

    public VideoCaptureConfig() {
        this.capturePreference = CapturePreference.AUTO;
    }
}
