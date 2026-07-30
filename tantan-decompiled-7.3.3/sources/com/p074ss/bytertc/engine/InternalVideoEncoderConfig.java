package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class InternalVideoEncoderConfig {
    public InternalVideoEncoderPreference encodePreference;
    public int frameRate;
    public int height;
    public int maxBitrate;
    public int minBitrate;
    public int width;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.InternalVideoEncoderConfig$1 */
    public static /* synthetic */ class C135621 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode;

        /* JADX INFO: renamed from: $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference */
        static final /* synthetic */ int[] f56455x813d4dec;

        /* JADX INFO: renamed from: $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType */
        static final /* synthetic */ int[] f56456x7fb11380;

        static {
            int[] iArr = new int[VideoEncoderConfig.EncoderPreference.values().length];
            f56455x813d4dec = iArr;
            try {
                iArr[VideoEncoderConfig.EncoderPreference.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56455x813d4dec[VideoEncoderConfig.EncoderPreference.MAINTAIN_FRAMERATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56455x813d4dec[VideoEncoderConfig.EncoderPreference.MAINTAIN_QUALITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56455x813d4dec[VideoEncoderConfig.EncoderPreference.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[VideoEncoderConfig.VideoCodecType.values().length];
            f56456x7fb11380 = iArr2;
            try {
                iArr2[VideoEncoderConfig.VideoCodecType.CODEC_TYPE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56456x7fb11380[VideoEncoderConfig.VideoCodecType.CODEC_TYPE_H264.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56456x7fb11380[VideoEncoderConfig.VideoCodecType.CODEC_TYPE_BYTEVC1.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[VideoEncoderConfig.CodecMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode = iArr3;
            try {
                iArr3[VideoEncoderConfig.CodecMode.CODEC_MODE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode[VideoEncoderConfig.CodecMode.CODEC_MODE_HARDWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode[VideoEncoderConfig.CodecMode.CODEC_MODE_SOFTWARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum InternalVideoCodecMode {
        VIDEO_CODEC_MODE_AUTO(0),
        VIDEO_CODEC_MODE_HARDWARE(1),
        VIDEO_CODEC_MODE_SOFTWARE(2);

        private int value;

        InternalVideoCodecMode(int i) {
            this.value = i;
        }

        @CalledByNative("InternalVideoCodecMode")
        public int getIntValue() {
            return this.value;
        }
    }

    public enum InternalVideoCodecType {
        VIDEO_CODEC_TYPE_AUTO(0),
        VIDEO_CODEC_TYPE_H264(1),
        VIDEO_CODEC_TYPE_BYTEVC1(2);

        private int value;

        InternalVideoCodecType(int i) {
            this.value = i;
        }

        @CalledByNative("InternalVideoCodecType")
        public int getIntValue() {
            return this.value;
        }
    }

    public enum InternalVideoEncoderPreference {
        VIDEO_ENCODER_PREFERENCE_DISABLED(0),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE(1),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY(2),
        VIDEO_ENCODER_PREFERENCE_AUTO(3);

        private int value;

        InternalVideoEncoderPreference(int i) {
            this.value = i;
        }

        @CalledByNative("InternalVideoEncoderPreference")
        public int getIntValue() {
            return this.value;
        }
    }

    public InternalVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig) {
        this.minBitrate = 0;
        this.encodePreference = InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        this.width = videoEncoderConfig.width;
        this.height = videoEncoderConfig.height;
        this.frameRate = videoEncoderConfig.frameRate;
        this.maxBitrate = videoEncoderConfig.maxBitrate;
        this.minBitrate = videoEncoderConfig.minBitrate;
        this.encodePreference = ConvertEnumValue(videoEncoderConfig.encodePreference);
    }

    private InternalVideoEncoderPreference ConvertEnumValue(VideoEncoderConfig.EncoderPreference encoderPreference) {
        InternalVideoEncoderPreference internalVideoEncoderPreference = InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        int i = C135621.f56455x813d4dec[encoderPreference.ordinal()];
        if (i == 1) {
            return InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_DISABLED;
        }
        if (i == 2) {
            return internalVideoEncoderPreference;
        }
        if (i != 3) {
            return i != 4 ? internalVideoEncoderPreference : InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_AUTO;
        }
        return InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY;
    }

    @CalledByNative
    public InternalVideoEncoderPreference getEncoderPreference() {
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
        return this.maxBitrate;
    }

    @CalledByNative
    public int getMinKBps() {
        return this.minBitrate;
    }

    @CalledByNative
    public int getWidth() {
        return this.width;
    }

    private InternalVideoCodecType ConvertEnumValue(VideoEncoderConfig.VideoCodecType videoCodecType) {
        InternalVideoCodecType internalVideoCodecType = InternalVideoCodecType.VIDEO_CODEC_TYPE_AUTO;
        int i = C135621.f56456x7fb11380[videoCodecType.ordinal()];
        if (i == 1) {
            return InternalVideoCodecType.VIDEO_CODEC_TYPE_AUTO;
        }
        if (i == 2) {
            return InternalVideoCodecType.VIDEO_CODEC_TYPE_H264;
        }
        if (i != 3) {
            return InternalVideoCodecType.VIDEO_CODEC_TYPE_AUTO;
        }
        return InternalVideoCodecType.VIDEO_CODEC_TYPE_BYTEVC1;
    }

    private InternalVideoCodecMode ConvertEnumValue(VideoEncoderConfig.CodecMode codecMode) {
        InternalVideoCodecMode internalVideoCodecMode = InternalVideoCodecMode.VIDEO_CODEC_MODE_AUTO;
        int i = C135621.$SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode[codecMode.ordinal()];
        if (i == 1) {
            return InternalVideoCodecMode.VIDEO_CODEC_MODE_AUTO;
        }
        if (i == 2) {
            return InternalVideoCodecMode.VIDEO_CODEC_MODE_HARDWARE;
        }
        if (i != 3) {
            return InternalVideoCodecMode.VIDEO_CODEC_MODE_AUTO;
        }
        return InternalVideoCodecMode.VIDEO_CODEC_MODE_SOFTWARE;
    }
}
