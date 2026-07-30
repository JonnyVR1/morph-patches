package io.agora.rtc2.video;

import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.liteav.audio.TXEAudioDef;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: classes2.dex */
public class VideoEncoderConfiguration {
    public static final int COMPATIBLE_BITRATE = -1;
    public static final int DEFAULT_MIN_BITRATE = -1;
    public static final int DEFAULT_MIN_BITRATE_EQUAL_TO_TARGET_BITRATE = -2;
    public static final int DEFAULT_MIN_FRAMERATE = -1;
    public static final int STANDARD_BITRATE = 0;
    public AdvanceOptions advanceOptions;
    public int bitrate;
    public VIDEO_CODEC_TYPE codecType;
    public DEGRADATION_PREFERENCE degradationPrefer;
    public VideoDimensions dimensions;
    public int frameRate;
    public int minBitrate;
    public int minFrameRate;
    public MIRROR_MODE_TYPE mirrorMode;
    public ORIENTATION_MODE orientationMode;
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

    public static class AdvanceOptions {
        public COMPRESSION_PREFERENCE compressionPreference;
        public boolean encodeAlpha;
        public ENCODING_PREFERENCE encodingPreference;

        public AdvanceOptions() {
            this.encodingPreference = ENCODING_PREFERENCE.PREFER_AUTO;
            this.compressionPreference = COMPRESSION_PREFERENCE.PREFER_COMPRESSION_AUTO;
            this.encodeAlpha = false;
        }

        public AdvanceOptions(ENCODING_PREFERENCE encoding_preference, COMPRESSION_PREFERENCE compression_preference, boolean z) {
            this.encodingPreference = encoding_preference;
            this.compressionPreference = compression_preference;
            this.encodeAlpha = z;
        }
    }

    public enum CODEC_CAP_MASK {
        CODEC_CAP_MASK_NONE(0),
        CODEC_CAP_MASK_HW_DEC(1),
        CODEC_CAP_MASK_HW_ENC(2),
        CODEC_CAP_MASK_SW_DEC(4),
        CODEC_CAP_MASK_SW_ENC(8);

        private int value;

        CODEC_CAP_MASK(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum COMPRESSION_PREFERENCE {
        PREFER_COMPRESSION_AUTO(-1),
        PREFER_LOW_LATENCY(0),
        PREFER_QUALITY(1);

        private int value;

        COMPRESSION_PREFERENCE(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum DEGRADATION_PREFERENCE {
        MAINTAIN_AUTO(-1),
        MAINTAIN_QUALITY(0),
        MAINTAIN_FRAMERATE(1),
        MAINTAIN_BALANCED(2),
        MAINTAIN_RESOLUTION(3),
        DISABLED(100);

        private int value;

        DEGRADATION_PREFERENCE(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum ENCODING_PREFERENCE {
        PREFER_AUTO(-1),
        PREFER_SOFTWARE(0),
        PREFER_HARDWARE(1);

        private int value;

        ENCODING_PREFERENCE(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum FRAME_RATE {
        FRAME_RATE_FPS_1(1),
        FRAME_RATE_FPS_7(7),
        FRAME_RATE_FPS_10(10),
        FRAME_RATE_FPS_15(15),
        FRAME_RATE_FPS_24(24),
        FRAME_RATE_FPS_30(30),
        FRAME_RATE_FPS_60(60);

        private int value;

        FRAME_RATE(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum MIRROR_MODE_TYPE {
        MIRROR_MODE_AUTO(0),
        MIRROR_MODE_ENABLED(1),
        MIRROR_MODE_DISABLED(2);

        private int value;

        MIRROR_MODE_TYPE(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum ORIENTATION_MODE {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);

        private int value;

        ORIENTATION_MODE(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum VIDEO_CODEC_TYPE {
        VIDEO_CODEC_NONE(0),
        VIDEO_CODEC_VP8(1),
        VIDEO_CODEC_H264(2),
        VIDEO_CODEC_H265(3),
        VIDEO_CODEC_GENERIC(6),
        VIDEO_CODEC_AV1(12),
        VIDEO_CODEC_VP9(13),
        VIDEO_CODEC_GENERIC_JPEG(20);

        private int value;

        VIDEO_CODEC_TYPE(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
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

    public VideoEncoderConfiguration() {
        this.dimensions = new VideoDimensions(TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 540);
        this.frameRate = FRAME_RATE.FRAME_RATE_FPS_15.getValue();
        this.minFrameRate = -1;
        this.bitrate = 0;
        this.minBitrate = -1;
        this.orientationMode = ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;
        this.degradationPrefer = DEGRADATION_PREFERENCE.MAINTAIN_AUTO;
        this.mirrorMode = MIRROR_MODE_TYPE.MIRROR_MODE_DISABLED;
        this.advanceOptions = new AdvanceOptions(ENCODING_PREFERENCE.PREFER_AUTO, COMPRESSION_PREFERENCE.PREFER_COMPRESSION_AUTO, false);
        this.codecType = VIDEO_CODEC_TYPE.VIDEO_CODEC_NONE;
    }

    public VideoEncoderConfiguration(int i, int i2, FRAME_RATE frame_rate, int i3, ORIENTATION_MODE orientation_mode) {
        this.dimensions = new VideoDimensions(i, i2);
        this.frameRate = frame_rate.getValue();
        this.minFrameRate = -1;
        this.bitrate = i3;
        this.minBitrate = -1;
        this.orientationMode = orientation_mode;
        this.degradationPrefer = DEGRADATION_PREFERENCE.MAINTAIN_AUTO;
        this.mirrorMode = MIRROR_MODE_TYPE.MIRROR_MODE_DISABLED;
        this.advanceOptions = new AdvanceOptions(ENCODING_PREFERENCE.PREFER_AUTO, COMPRESSION_PREFERENCE.PREFER_COMPRESSION_AUTO, false);
        this.codecType = VIDEO_CODEC_TYPE.VIDEO_CODEC_NONE;
    }

    public VideoEncoderConfiguration(int i, int i2, FRAME_RATE frame_rate, int i3, ORIENTATION_MODE orientation_mode, MIRROR_MODE_TYPE mirror_mode_type) {
        this.dimensions = new VideoDimensions(i, i2);
        this.frameRate = frame_rate.getValue();
        this.minFrameRate = -1;
        this.bitrate = i3;
        this.minBitrate = -1;
        this.orientationMode = orientation_mode;
        this.degradationPrefer = DEGRADATION_PREFERENCE.MAINTAIN_AUTO;
        this.mirrorMode = mirror_mode_type;
        this.advanceOptions = new AdvanceOptions(ENCODING_PREFERENCE.PREFER_AUTO, COMPRESSION_PREFERENCE.PREFER_COMPRESSION_AUTO, false);
        this.codecType = VIDEO_CODEC_TYPE.VIDEO_CODEC_NONE;
    }

    public VideoEncoderConfiguration(VideoDimensions videoDimensions, FRAME_RATE frame_rate, int i, ORIENTATION_MODE orientation_mode) {
        this.dimensions = videoDimensions;
        this.frameRate = frame_rate.getValue();
        this.minFrameRate = -1;
        this.bitrate = i;
        this.minBitrate = -1;
        this.orientationMode = orientation_mode;
        this.degradationPrefer = DEGRADATION_PREFERENCE.MAINTAIN_AUTO;
        this.mirrorMode = MIRROR_MODE_TYPE.MIRROR_MODE_DISABLED;
        this.advanceOptions = new AdvanceOptions(ENCODING_PREFERENCE.PREFER_AUTO, COMPRESSION_PREFERENCE.PREFER_COMPRESSION_AUTO, false);
        this.codecType = VIDEO_CODEC_TYPE.VIDEO_CODEC_NONE;
    }

    public VideoEncoderConfiguration(VideoDimensions videoDimensions, FRAME_RATE frame_rate, int i, ORIENTATION_MODE orientation_mode, MIRROR_MODE_TYPE mirror_mode_type) {
        this.dimensions = videoDimensions;
        this.frameRate = frame_rate.getValue();
        this.minFrameRate = -1;
        this.bitrate = i;
        this.minBitrate = -1;
        this.orientationMode = orientation_mode;
        this.degradationPrefer = DEGRADATION_PREFERENCE.MAINTAIN_AUTO;
        this.mirrorMode = mirror_mode_type;
        this.advanceOptions = new AdvanceOptions(ENCODING_PREFERENCE.PREFER_AUTO, COMPRESSION_PREFERENCE.PREFER_COMPRESSION_AUTO, false);
        this.codecType = VIDEO_CODEC_TYPE.VIDEO_CODEC_NONE;
    }
}
