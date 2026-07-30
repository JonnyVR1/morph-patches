package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class InternalVideoStreamDescription {
    public VideoEncoderPreference encodePreference;
    public int frameRate;
    public int height;
    public int maxKbps;
    public int minKbps;
    public int width;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.InternalVideoStreamDescription$1 */
    public static /* synthetic */ class C134001 {

        /* JADX INFO: renamed from: $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode */
        static final /* synthetic */ int[] f55609xfb2848c;

        /* JADX INFO: renamed from: $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference */
        static final /* synthetic */ int[] f55610x6ee2c9ca;

        /* JADX INFO: renamed from: $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType */
        static final /* synthetic */ int[] f55611xf8ea5462;

        static {
            int[] iArr = new int[VideoStreamDescription.EncoderPreference.values().length];
            f55610x6ee2c9ca = iArr;
            try {
                iArr[VideoStreamDescription.EncoderPreference.Disabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55610x6ee2c9ca[VideoStreamDescription.EncoderPreference.MaintainFramerate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55610x6ee2c9ca[VideoStreamDescription.EncoderPreference.MaintainQuality.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55610x6ee2c9ca[VideoStreamDescription.EncoderPreference.Balance.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[VideoStreamDescription.VideoCodecType.values().length];
            f55611xf8ea5462 = iArr2;
            try {
                iArr2[VideoStreamDescription.VideoCodecType.CODEC_TYPE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55611xf8ea5462[VideoStreamDescription.VideoCodecType.CODEC_TYPE_H264.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55611xf8ea5462[VideoStreamDescription.VideoCodecType.CODEC_TYPE_BYTEVC1.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[VideoStreamDescription.CodecMode.values().length];
            f55609xfb2848c = iArr3;
            try {
                iArr3[VideoStreamDescription.CodecMode.CODEC_MODE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55609xfb2848c[VideoStreamDescription.CodecMode.CODEC_MODE_HARDWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f55609xfb2848c[VideoStreamDescription.CodecMode.CODEC_MODE_SOFTWARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum VideoCodecMode {
        VIDEO_CODEC_MODE_AUTO(0),
        VIDEO_CODEC_MODE_HARDWARE(1),
        VIDEO_CODEC_MODE_SOFTWARE(2);

        private int value;

        VideoCodecMode(int i) {
            this.value = i;
        }

        @CalledByNative("VideoCodecMode")
        public int getIntValue() {
            return this.value;
        }
    }

    public enum VideoCodecType {
        VIDEO_CODEC_TYPE_AUTO(0),
        VIDEO_CODEC_TYPE_H264(1),
        VIDEO_CODEC_TYPE_BYTEVC1(2);

        private int value;

        VideoCodecType(int i) {
            this.value = i;
        }

        @CalledByNative("VideoCodecType")
        public int getIntValue() {
            return this.value;
        }
    }

    public enum VideoEncoderPreference {
        VIDEO_ENCODER_PREFERENCE_DISABLED(0),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE(1),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY(2),
        VIDEO_ENCODER_PREFERENCE_BALANCE(3);

        private int value;

        VideoEncoderPreference(int i) {
            this.value = i;
        }

        @CalledByNative("VideoEncoderPreference")
        public int getIntValue() {
            return this.value;
        }
    }

    public InternalVideoStreamDescription(VideoStreamDescription videoStreamDescription) {
        this.minKbps = 0;
        this.encodePreference = VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        this.width = ((Integer) videoStreamDescription.videoSize.first).intValue();
        this.height = ((Integer) videoStreamDescription.videoSize.second).intValue();
        this.frameRate = videoStreamDescription.frameRate;
        this.maxKbps = videoStreamDescription.maxKbps;
        this.minKbps = videoStreamDescription.minKbps;
        this.encodePreference = ConvertEnumValue(videoStreamDescription.encodePreference);
    }

    private VideoEncoderPreference ConvertEnumValue(VideoStreamDescription.EncoderPreference encoderPreference) {
        VideoEncoderPreference videoEncoderPreference = VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        int i = C134001.f55610x6ee2c9ca[encoderPreference.ordinal()];
        if (i == 1) {
            return VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_DISABLED;
        }
        if (i == 2) {
            return videoEncoderPreference;
        }
        if (i != 3) {
            return i != 4 ? videoEncoderPreference : VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_BALANCE;
        }
        return VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY;
    }

    @CalledByNative
    public VideoEncoderPreference getEncoderPreference() {
        return this.encodePreference;
    }

    @CalledByNative
    public int getFrameRate() {
        return this.frameRate;
    }

    @CalledByNative
    public int getHeight() {
        return this.height;
    }

    @CalledByNative
    public int getMaxKBps() {
        return this.maxKbps;
    }

    @CalledByNative
    public int getMinKBps() {
        return this.minKbps;
    }

    @CalledByNative
    public int getWidth() {
        return this.width;
    }

    private VideoCodecType ConvertEnumValue(VideoStreamDescription.VideoCodecType videoCodecType) {
        VideoCodecType videoCodecType2 = VideoCodecType.VIDEO_CODEC_TYPE_AUTO;
        int i = C134001.f55611xf8ea5462[videoCodecType.ordinal()];
        if (i == 1) {
            return VideoCodecType.VIDEO_CODEC_TYPE_AUTO;
        }
        if (i == 2) {
            return VideoCodecType.VIDEO_CODEC_TYPE_H264;
        }
        if (i != 3) {
            return VideoCodecType.VIDEO_CODEC_TYPE_AUTO;
        }
        return VideoCodecType.VIDEO_CODEC_TYPE_BYTEVC1;
    }

    private VideoCodecMode ConvertEnumValue(VideoStreamDescription.CodecMode codecMode) {
        VideoCodecMode videoCodecMode = VideoCodecMode.VIDEO_CODEC_MODE_AUTO;
        int i = C134001.f55609xfb2848c[codecMode.ordinal()];
        if (i == 1) {
            return VideoCodecMode.VIDEO_CODEC_MODE_AUTO;
        }
        if (i == 2) {
            return VideoCodecMode.VIDEO_CODEC_MODE_HARDWARE;
        }
        if (i != 3) {
            return VideoCodecMode.VIDEO_CODEC_MODE_AUTO;
        }
        return VideoCodecMode.VIDEO_CODEC_MODE_SOFTWARE;
    }
}
