package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.liteav.audio.TXEAudioDef;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: classes13.dex */
public class VideoEncoderConfig {
    public EncoderPreference encodePreference;
    public int frameRate;
    public int height;
    public int maxBitrate;
    public int minBitrate;
    public int width;
    public static final VideoDimensions VD_120x120 = new VideoDimensions(120, 120);
    public static final VideoDimensions VD_160x120 = new VideoDimensions(160, 120);
    public static final VideoDimensions VD_180x180 = new VideoDimensions(180, 180);
    public static final VideoDimensions VD_240x180 = new VideoDimensions(240, 180);
    public static final VideoDimensions VD_320x180 = new VideoDimensions(320, 180);
    public static final VideoDimensions VD_240x240 = new VideoDimensions(240, 240);
    public static final VideoDimensions VD_320x240 = new VideoDimensions(320, 240);
    public static final VideoDimensions VD_424x240 = new VideoDimensions(HttpStatus.FAILED_DEPENDENCY_424, 240);
    public static final VideoDimensions VD_360x360 = new VideoDimensions(360, 360);
    public static final VideoDimensions VD_480x360 = new VideoDimensions(480, 360);
    public static final VideoDimensions VD_640x360 = new VideoDimensions(640, 360);
    public static final VideoDimensions VD_480x480 = new VideoDimensions(480, 480);
    public static final VideoDimensions VD_640x480 = new VideoDimensions(640, 480);
    public static final VideoDimensions VD_840x480 = new VideoDimensions(840, 480);
    public static final VideoDimensions VD_960x540 = new VideoDimensions(TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 540);
    public static final VideoDimensions VD_960x720 = new VideoDimensions(TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 720);
    public static final VideoDimensions VD_1280x720 = new VideoDimensions(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 720);
    public static final VideoDimensions VD_1920x1080 = new VideoDimensions(WBConstants.SDK_NEW_PAY_VERSION, 1080);
    public static final VideoDimensions VD_2540x1440 = new VideoDimensions(2540, 1440);
    public static final VideoDimensions VD_3840x2160 = new VideoDimensions(3840, 2160);

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
        DISABLED(0),
        MAINTAIN_FRAMERATE(1),
        MAINTAIN_QUALITY(2),
        AUTO(3);

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

    public enum FrameRate {
        FRAME_RATE_FPS_1(1),
        FRAME_RATE_FPS_7(7),
        FRAME_RATE_FPS_10(10),
        FRAME_RATE_FPS_15(15),
        FRAME_RATE_FPS_24(24),
        FRAME_RATE_FPS_30(30),
        FRAME_RATE_FPS_60(60);

        private int value;

        FrameRate(int i) {
            this.value = i;
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

    public VideoEncoderConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.maxBitrate = -1;
        this.minBitrate = 0;
        this.encodePreference = EncoderPreference.MAINTAIN_FRAMERATE;
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
        this.maxBitrate = i4;
        this.minBitrate = i5;
        this.encodePreference = EncoderPreference.convertFromInt(i8);
    }

    @CalledByNative
    private static VideoEncoderConfig create(int i, int i2, int i3, int i4, int i5) {
        return new VideoEncoderConfig(i, i2, i3, i4, i5);
    }

    public boolean isValid() {
        return true;
    }

    public String toString() {
        return "VideoEncoderConfig{width=" + this.width + "height=" + this.height + ", frameRate=" + this.frameRate + ", maxBitrate=" + this.maxBitrate + ", minBitrate=" + this.minBitrate + ", encodePreference=" + this.encodePreference + '}';
    }

    public static class VideoDimensions {
        public int height;
        public int width;

        public VideoDimensions() {
            this.width = 0;
            this.height = 0;
        }

        public VideoDimensions(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    public VideoEncoderConfig(int i, int i2, int i3, int i4, int i5) {
        this.maxBitrate = -1;
        this.minBitrate = 0;
        this.encodePreference = EncoderPreference.MAINTAIN_FRAMERATE;
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
        this.maxBitrate = i4;
        this.minBitrate = i5;
    }

    public VideoEncoderConfig() {
        this.maxBitrate = -1;
        this.minBitrate = 0;
        this.encodePreference = EncoderPreference.MAINTAIN_FRAMERATE;
    }
}
