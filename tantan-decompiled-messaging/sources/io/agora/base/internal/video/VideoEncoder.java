package io.agora.base.internal.video;

import androidx.annotation.Nullable;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public interface VideoEncoder {

    public @interface BitrateAdjustment {
        public static final int ACTUAL_FRAMERATE_ADJUSTMENT = 2;
        public static final int CONSTANT_UNIT_BITRATE_ADJUSTMENT = 4;
        public static final int DYNAMIC_ADJUSTMENT = 3;
        public static final int FRAMERATE_ADJUSTMENT = 1;
        public static final int NO_ADJUSTMENT = 0;
    }

    public static class BitrateAllocation {
        public final int[][] bitratesBbs;

        @CalledByNative("BitrateAllocation")
        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }

        public int getSum() {
            int i = 0;
            for (int[] iArr : this.bitratesBbs) {
                for (int i2 : iArr) {
                    i += i2;
                }
            }
            return i;
        }
    }

    public interface Callback {
        void onEncodeBufferPrepared(long j);

        void onEncodeReset();

        void onEncodedFrame(EncodedImage encodedImage, int i, int i2, int i3, int i4, int i5, CodecSpecificInfo codecSpecificInfo);
    }

    public static class EncodeInfo {
        public final EncodedImage.FrameType[] frameTypes;

        @CalledByNative("EncodeInfo")
        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    public static class EncoderStyle {
        boolean highProfileSupported;
        int bitrateAdjustment = 0;
        boolean isNeedResetWhenDownBps = false;
        int bitrateAdjustNumerator = 1;
        int bitrateAdjustDenominator = 1;

        @CalledByNative("EncoderStyle")
        public int getBitrateAdjustDenominator() {
            return this.bitrateAdjustDenominator;
        }

        @CalledByNative("EncoderStyle")
        public int getBitrateAdjustNumerator() {
            return this.bitrateAdjustNumerator;
        }

        @CalledByNative("EncoderStyle")
        public int getBitrateAdjustment() {
            return this.bitrateAdjustment;
        }

        @CalledByNative("EncoderStyle")
        public boolean isNeedResetWhenDownBps() {
            return this.isNeedResetWhenDownBps;
        }

        public String toString() {
            return "EncoderStyle{bitrateAdjustment=" + this.bitrateAdjustment + ", isNeedResetWhenDownBps=" + this.isNeedResetWhenDownBps + ", highProfileSupported=" + this.highProfileSupported + '}';
        }
    }

    public static class VideoHWCodecSpec {
        public final int bitrateMode;
        public final String codecName;
        public final int inputType;
        public final String maxResolution;
        public final int minSupportedBitrate;
        public final int platformid = 4;
        public final int profile;

        public VideoHWCodecSpec(String str, String str2, int i, int i2, int i3, int i4) {
            this.codecName = str;
            this.maxResolution = str2;
            this.bitrateMode = i;
            this.inputType = i2;
            this.profile = i3;
            this.minSupportedBitrate = i4;
        }

        @CalledByNative("VideoHWCodecSpec")
        public int getBitrateMode() {
            return this.bitrateMode;
        }

        @CalledByNative("VideoHWCodecSpec")
        public String getCodecName() {
            return this.codecName;
        }

        @CalledByNative("VideoHWCodecSpec")
        public int getInputType() {
            return this.inputType;
        }

        @CalledByNative("VideoHWCodecSpec")
        public String getMaxResolution() {
            return this.maxResolution;
        }

        @CalledByNative("VideoHWCodecSpec")
        public int getMinSupportedBitrate() {
            return this.minSupportedBitrate;
        }

        @CalledByNative("VideoHWCodecSpec")
        public int getPlatformid() {
            return this.platformid;
        }

        @CalledByNative("VideoHWCodecSpec")
        public int getProfile() {
            return this.profile;
        }
    }

    @CalledByNative
    VideoCodecStatus attachProxyThread();

    @CalledByNative
    long createNativeVideoEncoder();

    @CalledByNative
    VideoCodecStatus detachProxyThread();

    @CalledByNative
    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo, CodecSpecificInfo codecSpecificInfo);

    @CalledByNative
    VideoCodecStatus flush();

    @Nullable
    @CalledByNative
    EncoderStyle getEncoderStyle();

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    long getResetCoolDownTimeMs();

    @CalledByNative
    ScalingSettings getScalingSettings();

    @CalledByNative
    VideoHWCodecSpec getVideoHWCodecSpec();

    @CalledByNative
    VideoCodecStatus initEncode(Settings settings, Callback callback);

    @CalledByNative
    boolean isHardwareEncoder();

    @CalledByNative
    boolean isQcomHardware();

    @CalledByNative
    VideoCodecStatus release();

    @CalledByNative
    VideoCodecStatus resume();

    @CalledByNative
    VideoCodecStatus setChannelParameters(short s, long j);

    @CalledByNative
    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i);

    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();

        @Nullable
        public final Integer high;

        @Nullable
        public final Integer low;

        /* JADX INFO: renamed from: on */
        public final boolean f63342on;

        public ScalingSettings(int i, int i2) {
            this.f63342on = true;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        public String toString() {
            if (!this.f63342on) {
                return "OFF";
            }
            return "[ " + this.low + ", " + this.high + " ]";
        }

        private ScalingSettings() {
            this.f63342on = false;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z) {
            this.f63342on = z;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z, int i, int i2) {
            this.f63342on = z;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }
    }

    public static class Settings {
        public final boolean automaticResizeOn;
        public final boolean expectTexture;
        public final int height;
        public final int keyFrameInterval;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int numberOfSimulcastStreams;
        public final int rateControlMode;
        public final int startBitrate;
        public final int width;

        @CalledByNative("Settings")
        public Settings(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, int i8, boolean z2) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
            this.startBitrate = i4;
            this.maxFramerate = i5;
            this.numberOfSimulcastStreams = i6;
            this.automaticResizeOn = z;
            this.keyFrameInterval = i7;
            this.rateControlMode = i8;
            this.expectTexture = z2;
        }

        public Settings(int i, int i2, int i3, int i4, int i5, boolean z) {
            this(i, i2, i3, i4, i5, 1, z, 0, -1, true);
        }
    }
}
