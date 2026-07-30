package com.p069ss.bytertc.engine;

import android.util.Pair;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class VideoStreamDescription {
    public EncoderPreference encodePreference;
    public int frameRate;
    public int maxKbps;
    public int minKbps;
    public Pair<Integer, Integer> videoSize;

    public enum CodecMode {
        CODEC_MODE_AUTO(0),
        CODEC_MODE_HARDWARE(1),
        CODEC_MODE_SOFTWARE(2);

        private int value;

        CodecMode(int i) {
            this.value = i;
        }

        public static CodecMode convertFromInt(int i) {
            return values()[i];
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum EncoderPreference {
        Disabled(0),
        MaintainFramerate(1),
        MaintainQuality(2),
        Balance(3);

        private int value;

        EncoderPreference(int i) {
            this.value = i;
        }

        public static EncoderPreference convertFromInt(int i) {
            return values()[i];
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum VideoCodecType {
        CODEC_TYPE_AUTO(0),
        CODEC_TYPE_H264(1),
        CODEC_TYPE_BYTEVC1(2);

        private int value;

        VideoCodecType(int i) {
            this.value = i;
        }

        public static VideoCodecType convertFromInt(int i) {
            return values()[i];
        }

        public int getValue() {
            return this.value;
        }
    }

    public VideoStreamDescription(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.minKbps = 0;
        this.encodePreference = EncoderPreference.MaintainFramerate;
        this.videoSize = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.frameRate = i3;
        this.maxKbps = i4;
        this.minKbps = i5;
        this.encodePreference = EncoderPreference.convertFromInt(i8);
    }

    @CalledByNative
    private static VideoStreamDescription create(int i, int i2, int i3, int i4, int i5) {
        return new VideoStreamDescription(i, i2, i3, i4, i5);
    }

    public boolean isValid() {
        Pair<Integer, Integer> pair = this.videoSize;
        if (pair == null || ((Integer) pair.first).intValue() <= 0 || ((Integer) this.videoSize.second).intValue() <= 0 || this.frameRate <= 0) {
            return false;
        }
        int i = this.maxKbps;
        return i <= 0 || this.minKbps <= i;
    }

    public String toString() {
        return "VideoStreamDescription{videoSize=" + this.videoSize + ", frameRate=" + this.frameRate + ", maxKbps=" + this.maxKbps + ", minKbps=" + this.minKbps + ", encodePreference=" + this.encodePreference + '}';
    }

    public VideoStreamDescription(int i, int i2, int i3, int i4, int i5) {
        this.minKbps = 0;
        this.encodePreference = EncoderPreference.MaintainFramerate;
        this.videoSize = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.frameRate = i3;
        this.maxKbps = i4;
        this.minKbps = i5;
    }

    public VideoStreamDescription() {
        this.minKbps = 0;
        this.encodePreference = EncoderPreference.MaintainFramerate;
    }
}
