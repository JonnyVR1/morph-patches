package com.momo.rtcbase;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p153l.azk0;
import p153l.mce;

/* JADX INFO: loaded from: classes8.dex */
@TargetApi(19)
@Deprecated
public class MediaCodecVideoEncoder {
    private static final int BITRATE_ADJUSTMENT_FPS = 30;
    private static final double BITRATE_CORRECTION_MAX_SCALE = 4.0d;
    private static final double BITRATE_CORRECTION_SEC = 3.0d;
    private static final int BITRATE_CORRECTION_STEPS = 20;
    private static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    private static final int DEQUEUE_TIMEOUT = 0;
    private static final String[] H264_HW_EXCEPTION_MODELS;
    private static final String H264_MIME_TYPE = "video/avc";
    private static final int MAXIMUM_INITIAL_FPS = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final long QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    private static final long QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    private static final long QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    private static final String TAG = "MediaCodecVideoEncoder";
    private static final int VIDEO_AVCLevel3 = 256;
    private static final int VIDEO_AVCProfileHigh = 8;
    private static final int VIDEO_ControlRateConstant = 2;
    private static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    private static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    private static int codecErrors;
    private static MediaCodecVideoEncoderErrorCallback errorCallback;
    private static final MediaCodecProperties exynosH264HighProfileHwProperties;
    private static final MediaCodecProperties exynosH264HwProperties;
    private static final MediaCodecProperties exynosVp8HwProperties;
    private static final MediaCodecProperties exynosVp9HwProperties;
    private static final MediaCodecProperties[] h264HighProfileHwList;
    private static Set<String> hwEncoderDisabledTypes = new HashSet();
    private static final MediaCodecProperties intelVp8HwProperties;
    private static final MediaCodecProperties mediatekH264HwProperties;
    private static final MediaCodecProperties qcomH264HwProperties;
    private static final MediaCodecProperties qcomVp8HwProperties;
    private static final MediaCodecProperties qcomVp9HwProperties;
    private static MediaCodecVideoEncoder runningInstance;
    private static EglBase staticEglBase;
    private static final int[] supportedColorList;
    private static final int[] supportedSurfaceColorList;
    private static final MediaCodecProperties[] vp9HwList;
    private double bitrateAccumulator;
    private double bitrateAccumulatorMax;
    private int bitrateAdjustmentScaleExp;
    private BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
    private double bitrateObservationTimeMs;
    private int colorFormat;
    private ByteBuffer configData;
    private GlRectDrawer drawer;
    private EglBase14 eglBase;
    private long forcedKeyFrameMs;
    private int height;
    private Surface inputSurface;
    private long lastKeyFrameMs;
    private MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private ByteBuffer[] outputBuffers;
    private int profile;
    private int targetBitrateBps;
    private int targetFps;
    private VideoCodecType type;
    private int width;

    /* JADX INFO: renamed from: com.momo.rtcbase.MediaCodecVideoEncoder$1CaughtException, reason: invalid class name */
    public class C1CaughtException {

        /* JADX INFO: renamed from: e */
        Exception f15264e;

        public C1CaughtException() {
        }
    }

    public enum BitrateAdjustmentType {
        NO_ADJUSTMENT,
        FRAMERATE_ADJUSTMENT,
        DYNAMIC_ADJUSTMENT
    }

    public static class EncoderProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecName;
        public final int colorFormat;

        public EncoderProperties(String str, int i, BitrateAdjustmentType bitrateAdjustmentType) {
            this.codecName = str;
            this.colorFormat = i;
            this.bitrateAdjustmentType = bitrateAdjustmentType;
        }
    }

    public enum H264Profile {
        CONSTRAINED_BASELINE(0),
        BASELINE(1),
        MAIN(2),
        CONSTRAINED_HIGH(3),
        HIGH(4);

        private final int value;

        H264Profile(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static class HwEncoderFactory implements VideoEncoderFactory {
        private final VideoCodecInfo[] supportedHardwareCodecs = getSupportedHardwareCodecs();

        private static VideoCodecInfo[] getSupportedHardwareCodecs() {
            ArrayList arrayList = new ArrayList();
            if (MediaCodecVideoEncoder.isVp8HwSupported()) {
                Logging.m21196d(MediaCodecVideoEncoder.TAG, "VP8 HW Encoder supported.");
                arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
            }
            if (MediaCodecVideoEncoder.isVp9HwSupported()) {
                Logging.m21196d(MediaCodecVideoEncoder.TAG, "VP9 HW Encoder supported.");
                arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
            }
            if (MediaCodecVideoDecoder.isH264HighProfileHwSupported()) {
                Logging.m21196d(MediaCodecVideoEncoder.TAG, "H.264 High Profile HW Encoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_HIGH_PROFILE_CODEC);
            }
            if (MediaCodecVideoEncoder.isH264HwSupported()) {
                Logging.m21196d(MediaCodecVideoEncoder.TAG, "H.264 HW Encoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_BASELINE_PROFILE_CODEC);
            }
            return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
        }

        private static boolean isCodecSupported(VideoCodecInfo[] videoCodecInfoArr, VideoCodecInfo videoCodecInfo) {
            for (VideoCodecInfo videoCodecInfo2 : videoCodecInfoArr) {
                if (isSameCodec(videoCodecInfo2, videoCodecInfo)) {
                    return true;
                }
            }
            return false;
        }

        private static boolean isSameCodec(VideoCodecInfo videoCodecInfo, VideoCodecInfo videoCodecInfo2) {
            if (!videoCodecInfo.name.equalsIgnoreCase(videoCodecInfo2.name)) {
                return false;
            }
            if (videoCodecInfo.name.equalsIgnoreCase("H264")) {
                return H264Utils.isSameH264Profile(videoCodecInfo.params, videoCodecInfo2.params);
            }
            return true;
        }

        @Override // com.momo.rtcbase.VideoEncoderFactory
        public VideoEncoder createEncoder(final VideoCodecInfo videoCodecInfo) {
            if (isCodecSupported(this.supportedHardwareCodecs, videoCodecInfo)) {
                Logging.m21196d(MediaCodecVideoEncoder.TAG, "Create HW video encoder for " + videoCodecInfo.name);
                return new WrappedNativeVideoEncoder() { // from class: com.momo.rtcbase.MediaCodecVideoEncoder.HwEncoderFactory.1
                    @Override // com.momo.rtcbase.WrappedNativeVideoEncoder, com.momo.rtcbase.VideoEncoder
                    public long createNativeVideoEncoder() {
                        return MediaCodecVideoEncoder.nativeCreateEncoder(videoCodecInfo, MediaCodecVideoEncoder.staticEglBase instanceof EglBase14);
                    }

                    @Override // com.momo.rtcbase.WrappedNativeVideoEncoder, com.momo.rtcbase.VideoEncoder
                    public boolean isHardwareEncoder() {
                        return true;
                    }
                };
            }
            Logging.m21196d(MediaCodecVideoEncoder.TAG, "No HW video encoder for codec " + videoCodecInfo.name);
            return null;
        }

        @Override // com.momo.rtcbase.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            return this.supportedHardwareCodecs;
        }
    }

    public static class MediaCodecProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecPrefix;
        public final int minSdk;

        public MediaCodecProperties(String str, int i, BitrateAdjustmentType bitrateAdjustmentType) {
            this.codecPrefix = str;
            this.minSdk = i;
            this.bitrateAdjustmentType = bitrateAdjustmentType;
        }
    }

    public interface MediaCodecVideoEncoderErrorCallback {
        void onMediaCodecVideoEncoderCriticalError(int i);
    }

    public static class OutputBufferInfo {
        public final ByteBuffer buffer;
        public final int index;
        public final boolean isKeyFrame;
        public final long presentationTimestampUs;

        public OutputBufferInfo(int i, ByteBuffer byteBuffer, boolean z, long j) {
            this.index = i;
            this.buffer = byteBuffer;
            this.isKeyFrame = z;
            this.presentationTimestampUs = j;
        }

        @CalledByNative("OutputBufferInfo")
        public ByteBuffer getBuffer() {
            return this.buffer;
        }

        @CalledByNative("OutputBufferInfo")
        public int getIndex() {
            return this.index;
        }

        @CalledByNative("OutputBufferInfo")
        public long getPresentationTimestampUs() {
            return this.presentationTimestampUs;
        }

        @CalledByNative("OutputBufferInfo")
        public boolean isKeyFrame() {
            return this.isKeyFrame;
        }
    }

    public enum VideoCodecType {
        VIDEO_CODEC_UNKNOWN,
        VIDEO_CODEC_VP8,
        VIDEO_CODEC_VP9,
        VIDEO_CODEC_H264;

        @CalledByNative("VideoCodecType")
        public static VideoCodecType fromNativeIndex(int i) {
            return values()[i];
        }
    }

    static {
        BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
        qcomVp8HwProperties = new MediaCodecProperties("OMX.qcom.", 19, bitrateAdjustmentType);
        exynosVp8HwProperties = new MediaCodecProperties("OMX.Exynos.", 23, BitrateAdjustmentType.DYNAMIC_ADJUSTMENT);
        intelVp8HwProperties = new MediaCodecProperties("OMX.Intel.", 21, bitrateAdjustmentType);
        MediaCodecProperties mediaCodecProperties = new MediaCodecProperties("OMX.qcom.", 24, bitrateAdjustmentType);
        qcomVp9HwProperties = mediaCodecProperties;
        BitrateAdjustmentType bitrateAdjustmentType2 = BitrateAdjustmentType.FRAMERATE_ADJUSTMENT;
        MediaCodecProperties mediaCodecProperties2 = new MediaCodecProperties("OMX.Exynos.", 24, bitrateAdjustmentType2);
        exynosVp9HwProperties = mediaCodecProperties2;
        vp9HwList = new MediaCodecProperties[]{mediaCodecProperties, mediaCodecProperties2};
        qcomH264HwProperties = new MediaCodecProperties("OMX.qcom.", 19, bitrateAdjustmentType);
        exynosH264HwProperties = new MediaCodecProperties("OMX.Exynos.", 21, bitrateAdjustmentType2);
        mediatekH264HwProperties = new MediaCodecProperties("OMX.MTK.", 27, bitrateAdjustmentType2);
        MediaCodecProperties mediaCodecProperties3 = new MediaCodecProperties("OMX.Exynos.", 23, bitrateAdjustmentType2);
        exynosH264HighProfileHwProperties = mediaCodecProperties3;
        h264HighProfileHwList = new MediaCodecProperties[]{mediaCodecProperties3};
        H264_HW_EXCEPTION_MODELS = new String[]{"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"};
        supportedColorList = new int[]{19, 21, 2141391872, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
        supportedSurfaceColorList = new int[]{2130708361};
    }

    @CalledByNative
    public MediaCodecVideoEncoder() {
    }

    private void checkOnMediaCodecThread() {
        if (this.mediaCodecThread.getId() == Thread.currentThread().getId()) {
            return;
        }
        StringBuilder sb = new StringBuilder("MediaCodecVideoEncoder previously operated on ");
        sb.append(this.mediaCodecThread);
        Thread threadCurrentThread = Thread.currentThread();
        sb.append(" but is now called on ");
        sb.append(threadCurrentThread);
        throw new RuntimeException(sb.toString());
    }

    public static MediaCodec createByCodecName(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static VideoEncoderFactory createFactory() {
        return new DefaultVideoEncoderFactory(new HwEncoderFactory());
    }

    public static void disableH264HwCodec() {
        Logging.m21200w(TAG, "H.264 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/avc");
    }

    public static void disableVp8HwCodec() {
        Logging.m21200w(TAG, "VP8 encoding is disabled by application.");
        hwEncoderDisabledTypes.add(VP8_MIME_TYPE);
    }

    public static void disableVp9HwCodec() {
        Logging.m21200w(TAG, "VP9 encoding is disabled by application.");
        hwEncoderDisabledTypes.add(VP9_MIME_TYPE);
    }

    public static void disposeEglContext() {
        EglBase eglBase = staticEglBase;
        if (eglBase != null) {
            eglBase.release();
            staticEglBase = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[PHI: r4
      0x0052: PHI (r4v2 com.momo.rtcbase.MediaCodecVideoEncoder$EncoderProperties) = 
      (r4v1 com.momo.rtcbase.MediaCodecVideoEncoder$EncoderProperties)
      (r4v1 com.momo.rtcbase.MediaCodecVideoEncoder$EncoderProperties)
      (r4v1 com.momo.rtcbase.MediaCodecVideoEncoder$EncoderProperties)
      (r4v1 com.momo.rtcbase.MediaCodecVideoEncoder$EncoderProperties)
      (r4v5 com.momo.rtcbase.MediaCodecVideoEncoder$EncoderProperties)
     binds: [B:15:0x004a, B:17:0x0050, B:26:0x006f, B:41:0x00cf, B:77:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    private static EncoderProperties findHwEncoder(String str, MediaCodecProperties[] mediaCodecPropertiesArr, int[] iArr) {
        MediaCodecInfo codecInfoAt;
        EncoderProperties encoderProperties;
        String name;
        boolean z;
        EncoderProperties encoderProperties2 = null;
        if (str.equals("video/avc")) {
            List listAsList = Arrays.asList(H264_HW_EXCEPTION_MODELS);
            String str2 = Build.MODEL;
            if (listAsList.contains(str2)) {
                Logging.m21200w(TAG, "Model: " + str2 + " has black listed H.264 encoder.");
                return null;
            }
        }
        int i = 0;
        while (i < MediaCodecList.getCodecCount()) {
            try {
                codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                Logging.m21198e(TAG, "Cannot retrieve encoder codec info", e);
                codecInfoAt = encoderProperties2;
            }
            if (codecInfoAt == 0 || !codecInfoAt.isEncoder()) {
                encoderProperties = encoderProperties2;
            } else {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                int length = supportedTypes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        name = encoderProperties2;
                        break;
                    }
                    if (supportedTypes[i2].equals(str)) {
                        name = codecInfoAt.getName();
                        break;
                    }
                    i2++;
                }
                if (name == 0) {
                    encoderProperties = encoderProperties2;
                } else {
                    Logging.m21199v(TAG, "Found candidate encoder ".concat(name));
                    BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
                    int length2 = mediaCodecPropertiesArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            z = false;
                            break;
                        }
                        MediaCodecProperties mediaCodecProperties = mediaCodecPropertiesArr[i3];
                        if (name.startsWith(mediaCodecProperties.codecPrefix)) {
                            int i4 = Build.VERSION.SDK_INT;
                            if (i4 >= mediaCodecProperties.minSdk) {
                                BitrateAdjustmentType bitrateAdjustmentType2 = mediaCodecProperties.bitrateAdjustmentType;
                                if (bitrateAdjustmentType2 != BitrateAdjustmentType.NO_ADJUSTMENT) {
                                    Logging.m21200w(TAG, "Codec " + name + " requires bitrate adjustment: " + bitrateAdjustmentType2);
                                    bitrateAdjustmentType = bitrateAdjustmentType2;
                                }
                                z = true;
                                break;
                            }
                            Logging.m21200w(TAG, "Codec " + name + " is disabled due to SDK version " + i4);
                        }
                        i3++;
                    }
                    if (z) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str);
                            for (int i5 : capabilitiesForType.colorFormats) {
                                Logging.m21199v(TAG, "   Color: 0x" + Integer.toHexString(i5));
                            }
                            for (int i6 : iArr) {
                                int[] iArr2 = capabilitiesForType.colorFormats;
                                int length3 = iArr2.length;
                                int i7 = 0;
                                while (i7 < length3) {
                                    EncoderProperties encoderProperties3 = encoderProperties2;
                                    int i8 = iArr2[i7];
                                    if (i8 == i6) {
                                        Logging.m21196d(TAG, "Found target encoder for mime " + str + " : " + name + ". Color: 0x" + Integer.toHexString(i8) + ". Bitrate adjustment: " + bitrateAdjustmentType);
                                        return new EncoderProperties(name, i8, bitrateAdjustmentType);
                                    }
                                    i7++;
                                    encoderProperties2 = encoderProperties3;
                                }
                            }
                        } catch (IllegalArgumentException e2) {
                            encoderProperties = encoderProperties2;
                            Logging.m21198e(TAG, "Cannot retrieve encoder capabilities", e2);
                        }
                    }
                    encoderProperties = encoderProperties2;
                }
            }
            i++;
            encoderProperties2 = encoderProperties;
        }
        return encoderProperties2;
    }

    private double getBitrateScale(int i) {
        return Math.pow(BITRATE_CORRECTION_MAX_SCALE, ((double) i) / 20.0d);
    }

    public static EglBase.Context getEglContext() {
        EglBase eglBase = staticEglBase;
        if (eglBase == null) {
            return null;
        }
        return eglBase.getEglBaseContext();
    }

    private static final MediaCodecProperties[] h264HwList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qcomH264HwProperties);
        arrayList.add(exynosH264HwProperties);
        return (MediaCodecProperties[]) arrayList.toArray(new MediaCodecProperties[arrayList.size()]);
    }

    public static boolean isH264HighProfileHwSupported() {
        return (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", h264HighProfileHwList, supportedColorList) == null) ? false : true;
    }

    public static boolean isH264HwSupported() {
        return (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", h264HwList(), supportedColorList) == null) ? false : true;
    }

    public static boolean isH264HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", h264HwList(), supportedSurfaceColorList) == null) ? false : true;
    }

    @CalledByNative
    public static boolean isTextureBuffer(VideoFrame.Buffer buffer) {
        return buffer instanceof VideoFrame.TextureBuffer;
    }

    public static boolean isVp8HwSupported() {
        return (hwEncoderDisabledTypes.contains(VP8_MIME_TYPE) || findHwEncoder(VP8_MIME_TYPE, vp8HwList(), supportedColorList) == null) ? false : true;
    }

    public static boolean isVp8HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains(VP8_MIME_TYPE) || findHwEncoder(VP8_MIME_TYPE, vp8HwList(), supportedSurfaceColorList) == null) ? false : true;
    }

    public static boolean isVp9HwSupported() {
        return (hwEncoderDisabledTypes.contains(VP9_MIME_TYPE) || findHwEncoder(VP9_MIME_TYPE, vp9HwList, supportedColorList) == null) ? false : true;
    }

    public static boolean isVp9HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains(VP9_MIME_TYPE) || findHwEncoder(VP9_MIME_TYPE, vp9HwList, supportedSurfaceColorList) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeCreateEncoder(VideoCodecInfo videoCodecInfo, boolean z);

    private static native void nativeFillInputBuffer(long j, int i, ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4);

    public static void printStackTrace() {
        Thread thread;
        MediaCodecVideoEncoder mediaCodecVideoEncoder = runningInstance;
        if (mediaCodecVideoEncoder == null || (thread = mediaCodecVideoEncoder.mediaCodecThread) == null) {
            return;
        }
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace.length > 0) {
            Logging.m21196d(TAG, "MediaCodecVideoEncoder stacks trace:");
            for (StackTraceElement stackTraceElement : stackTrace) {
                Logging.m21196d(TAG, stackTraceElement.toString());
            }
        }
    }

    private void reportEncodedFrame(int i) {
        int i2 = this.targetFps;
        if (i2 == 0 || this.bitrateAdjustmentType != BitrateAdjustmentType.DYNAMIC_ADJUSTMENT) {
            return;
        }
        double d = this.bitrateAccumulator + (((double) i) - (((double) this.targetBitrateBps) / (((double) i2) * 8.0d)));
        this.bitrateAccumulator = d;
        this.bitrateObservationTimeMs += 1000.0d / ((double) i2);
        double d2 = this.bitrateAccumulatorMax * BITRATE_CORRECTION_SEC;
        double dMin = Math.min(d, d2);
        this.bitrateAccumulator = dMin;
        this.bitrateAccumulator = Math.max(dMin, -d2);
        if (this.bitrateObservationTimeMs > 3000.0d) {
            Logging.m21196d(TAG, "Acc: " + ((int) this.bitrateAccumulator) + ". Max: " + ((int) this.bitrateAccumulatorMax) + ". ExpScale: " + this.bitrateAdjustmentScaleExp);
            double d3 = this.bitrateAccumulator;
            double d4 = this.bitrateAccumulatorMax;
            if (d3 <= d4) {
                if (d3 < (-d4)) {
                    this.bitrateAdjustmentScaleExp += (int) (((-d3) / d4) + 0.5d);
                    this.bitrateAccumulator = -d4;
                }
                this.bitrateObservationTimeMs = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            this.bitrateAdjustmentScaleExp -= (int) ((d3 / d4) + 0.5d);
            this.bitrateAccumulator = d4;
            int iMin = Math.min(this.bitrateAdjustmentScaleExp, 20);
            this.bitrateAdjustmentScaleExp = iMin;
            this.bitrateAdjustmentScaleExp = Math.max(iMin, -20);
            Logging.m21196d(TAG, "Adjusting bitrate scale to " + this.bitrateAdjustmentScaleExp + ". Value: " + getBitrateScale(this.bitrateAdjustmentScaleExp));
            setRates(this.targetBitrateBps / 1000, this.targetFps);
            this.bitrateObservationTimeMs = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    public static void setEglContext(EglBase.Context context) {
        if (staticEglBase != null) {
            Logging.m21200w(TAG, "Egl context already set.");
            staticEglBase.release();
        }
        staticEglBase = EglBase.create(context);
    }

    public static void setErrorCallback(MediaCodecVideoEncoderErrorCallback mediaCodecVideoEncoderErrorCallback) {
        Logging.m21196d(TAG, "Set error callback");
        errorCallback = mediaCodecVideoEncoderErrorCallback;
    }

    @CalledByNativeUnchecked
    private boolean setRates(int i, int i2) {
        checkOnMediaCodecThread();
        int bitrateScale = i * 1000;
        BitrateAdjustmentType bitrateAdjustmentType = this.bitrateAdjustmentType;
        BitrateAdjustmentType bitrateAdjustmentType2 = BitrateAdjustmentType.DYNAMIC_ADJUSTMENT;
        if (bitrateAdjustmentType == bitrateAdjustmentType2) {
            double d = bitrateScale;
            this.bitrateAccumulatorMax = d / 8.0d;
            int i3 = this.targetBitrateBps;
            if (i3 > 0 && bitrateScale < i3) {
                this.bitrateAccumulator = (this.bitrateAccumulator * d) / ((double) i3);
            }
        }
        this.targetBitrateBps = bitrateScale;
        this.targetFps = i2;
        if (bitrateAdjustmentType == BitrateAdjustmentType.FRAMERATE_ADJUSTMENT && i2 > 0) {
            bitrateScale = (i * 30000) / i2;
            Logging.m21199v(TAG, "setRates: " + i + " -> " + (bitrateScale / 1000) + " kbps. Fps: " + this.targetFps);
        } else if (bitrateAdjustmentType == bitrateAdjustmentType2) {
            Logging.m21199v(TAG, "setRates: " + i + " kbps. Fps: " + this.targetFps + ". ExpScale: " + this.bitrateAdjustmentScaleExp);
            int i4 = this.bitrateAdjustmentScaleExp;
            if (i4 != 0) {
                bitrateScale = (int) (((double) bitrateScale) * getBitrateScale(i4));
            }
        } else {
            Logging.m21199v(TAG, "setRates: " + i + " kbps. Fps: " + this.targetFps);
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", bitrateScale);
            this.mediaCodec.setParameters(bundle);
            return true;
        } catch (IllegalStateException e) {
            Logging.m21198e(TAG, "setRates failed", e);
            return false;
        }
    }

    public static EncoderProperties vp8HwEncoderProperties() {
        if (hwEncoderDisabledTypes.contains(VP8_MIME_TYPE)) {
            return null;
        }
        return findHwEncoder(VP8_MIME_TYPE, vp8HwList(), supportedColorList);
    }

    private static MediaCodecProperties[] vp8HwList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qcomVp8HwProperties);
        arrayList.add(exynosVp8HwProperties);
        return (MediaCodecProperties[]) arrayList.toArray(new MediaCodecProperties[arrayList.size()]);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public void checkKeyFrameRequired(boolean z, long j) {
        boolean z2;
        long j2 = (j + 500) / 1000;
        if (this.lastKeyFrameMs < 0) {
            this.lastKeyFrameMs = j2;
        }
        if (z) {
            z2 = false;
        } else {
            long j3 = this.forcedKeyFrameMs;
            if (j3 <= 0 || j2 <= this.lastKeyFrameMs + j3) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (z || z2) {
            if (z) {
                Logging.m21196d(TAG, "Sync frame request");
            } else {
                Logging.m21196d(TAG, "Sync frame forced");
            }
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.mediaCodec.setParameters(bundle);
            this.lastKeyFrameMs = j2;
        }
    }

    @CalledByNativeUnchecked
    public int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(0L);
        } catch (IllegalStateException e) {
            Logging.m21198e(TAG, "dequeueIntputBuffer failed", e);
            return -2;
        }
    }

    @CalledByNativeUnchecked
    public OutputBufferInfo dequeueOutputBuffer() {
        checkOnMediaCodecThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer >= 0 && (bufferInfo.flags & 2) != 0) {
                Logging.m21196d(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                this.configData = ByteBuffer.allocateDirect(bufferInfo.size);
                this.outputBuffers[iDequeueOutputBuffer].position(bufferInfo.offset);
                this.outputBuffers[iDequeueOutputBuffer].limit(bufferInfo.offset + bufferInfo.size);
                this.configData.put(this.outputBuffers[iDequeueOutputBuffer]);
                String str = "";
                int i = 0;
                while (true) {
                    int i2 = bufferInfo.size;
                    if (i2 >= 8) {
                        i2 = 8;
                    }
                    if (i >= i2) {
                        break;
                    }
                    str = str + Integer.toHexString(this.configData.get(i) & 255) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                    i++;
                }
                Logging.m21196d(TAG, str);
                this.mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                iDequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            }
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer == -3) {
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                    return dequeueOutputBuffer();
                }
                if (iDequeueOutputBuffer == -2) {
                    return dequeueOutputBuffer();
                }
                if (iDequeueOutputBuffer == -1) {
                    return null;
                }
                throw new RuntimeException("dequeueOutputBuffer: " + iDequeueOutputBuffer);
            }
            ByteBuffer byteBufferDuplicate = this.outputBuffers[iDequeueOutputBuffer].duplicate();
            byteBufferDuplicate.position(bufferInfo.offset);
            byteBufferDuplicate.limit(bufferInfo.offset + bufferInfo.size);
            reportEncodedFrame(bufferInfo.size);
            boolean z = true;
            if ((bufferInfo.flags & 1) == 0) {
                z = false;
            }
            if (z) {
                Logging.m21196d(TAG, "Sync frame generated");
            }
            if (!z || this.type != VideoCodecType.VIDEO_CODEC_H264) {
                return new OutputBufferInfo(iDequeueOutputBuffer, byteBufferDuplicate.slice(), z, bufferInfo.presentationTimeUs);
            }
            Logging.m21196d(TAG, "Appending config frame of size " + this.configData.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.configData.capacity() + bufferInfo.size);
            this.configData.rewind();
            byteBufferAllocateDirect.put(this.configData);
            byteBufferAllocateDirect.put(byteBufferDuplicate);
            byteBufferAllocateDirect.position(0);
            return new OutputBufferInfo(iDequeueOutputBuffer, byteBufferAllocateDirect, z, bufferInfo.presentationTimeUs);
        } catch (IllegalStateException e) {
            Logging.m21198e(TAG, "dequeueOutputBuffer failed", e);
            return new OutputBufferInfo(-1, null, false, -1L);
        }
    }

    @CalledByNativeUnchecked
    public boolean encodeBuffer(boolean z, int i, int i2, long j) {
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z, j);
            this.mediaCodec.queueInputBuffer(i, 0, i2, j, 0);
            return true;
        } catch (IllegalStateException e) {
            Logging.m21198e(TAG, "encodeBuffer failed", e);
            return false;
        }
    }

    @CalledByNativeUnchecked
    public boolean encodeFrame(long j, boolean z, VideoFrame videoFrame, int i, long j2) {
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z, j2);
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            if (buffer instanceof VideoFrame.TextureBuffer) {
                this.eglBase.makeCurrent();
                GLES20.glClear(16384);
                GlRectDrawer glRectDrawer = this.drawer;
                Matrix matrix = new Matrix();
                int i2 = this.width;
                int i3 = this.height;
                VideoFrameDrawer.drawTexture(glRectDrawer, (VideoFrame.TextureBuffer) buffer, matrix, i2, i3, 0, 0, i2, i3);
                this.eglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j2));
            } else {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                int i4 = (this.height + 1) / 2;
                ByteBuffer dataY = i420.getDataY();
                ByteBuffer dataU = i420.getDataU();
                ByteBuffer dataV = i420.getDataV();
                int strideY = i420.getStrideY();
                int strideU = i420.getStrideU();
                int strideV = i420.getStrideV();
                if (dataY.capacity() < this.height * strideY) {
                    throw new RuntimeException("Y-plane buffer size too small.");
                }
                if (dataU.capacity() < strideU * i4) {
                    throw new RuntimeException("U-plane buffer size too small.");
                }
                if (dataV.capacity() < i4 * strideV) {
                    throw new RuntimeException("V-plane buffer size too small.");
                }
                nativeFillInputBuffer(j, i, dataY, strideY, dataU, strideU, dataV, strideV);
                i420.release();
                this.mediaCodec.queueInputBuffer(i, 0, ((this.width * this.height) * 3) / 2, j2, 0);
            }
            return true;
        } catch (RuntimeException e) {
            Logging.m21198e(TAG, "encodeFrame failed", e);
            return false;
        }
    }

    @CalledByNative
    public int getColorFormat() {
        return this.colorFormat;
    }

    @CalledByNativeUnchecked
    public ByteBuffer[] getInputBuffers() {
        ByteBuffer[] inputBuffers = this.mediaCodec.getInputBuffers();
        Logging.m21196d(TAG, "Input buffers: " + inputBuffers.length);
        return inputBuffers;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x0174 A[Catch: IllegalStateException -> 0x0183, TryCatch #0 {IllegalStateException -> 0x0183, blocks: (B:48:0x014e, B:50:0x0174, B:53:0x0185, B:55:0x01a0, B:57:0x01ab, B:59:0x01b2, B:60:0x01d5), top: B:71:0x014e }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01a0 A[Catch: IllegalStateException -> 0x0183, TryCatch #0 {IllegalStateException -> 0x0183, blocks: (B:48:0x014e, B:50:0x0174, B:53:0x0185, B:55:0x01a0, B:57:0x01ab, B:59:0x01b2, B:60:0x01d5), top: B:71:0x014e }] */
    /* JADX WARN: Code duplicated, block: B:57:0x01ab A[Catch: IllegalStateException -> 0x0183, TryCatch #0 {IllegalStateException -> 0x0183, blocks: (B:48:0x014e, B:50:0x0174, B:53:0x0185, B:55:0x01a0, B:57:0x01ab, B:59:0x01b2, B:60:0x01d5), top: B:71:0x014e }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b2 A[Catch: IllegalStateException -> 0x0183, TryCatch #0 {IllegalStateException -> 0x0183, blocks: (B:48:0x014e, B:50:0x0174, B:53:0x0185, B:55:0x01a0, B:57:0x01ab, B:59:0x01b2, B:60:0x01d5), top: B:71:0x014e }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0202  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00d2, please report this as an issue */
    @CalledByNativeUnchecked
    public boolean initEncode(VideoCodecType videoCodecType, int i, int i2, int i3, int i4, int i5, boolean z) {
        String str;
        boolean z2;
        int i6;
        boolean z3;
        EncoderProperties encoderPropertiesFindHwEncoder;
        boolean z4;
        MediaFormat mediaFormatCreateVideoFormat;
        MediaCodec mediaCodecCreateByCodecName;
        Logging.m21196d(TAG, "Java initEncode: " + videoCodecType + ". Profile: " + i + " : " + i2 + " x " + i3 + ". @ " + i4 + " kbps. Fps: " + i5 + ". Encode from texture : " + z);
        this.profile = i;
        this.width = i2;
        this.height = i3;
        if (this.mediaCodecThread != null) {
            azk0.m101074a("Forgot to release()?");
            return false;
        }
        VideoCodecType videoCodecType2 = VideoCodecType.VIDEO_CODEC_VP8;
        if (videoCodecType != videoCodecType2) {
            if (videoCodecType == VideoCodecType.VIDEO_CODEC_VP9) {
                encoderPropertiesFindHwEncoder = findHwEncoder(VP9_MIME_TYPE, vp9HwList, z ? supportedSurfaceColorList : supportedColorList);
                str = VP9_MIME_TYPE;
            } else {
                if (videoCodecType != VideoCodecType.VIDEO_CODEC_H264) {
                    mce.m157919a("initEncode: Non-supported codec ", videoCodecType);
                    return false;
                }
                str = "video/avc";
                EncoderProperties encoderPropertiesFindHwEncoder2 = findHwEncoder("video/avc", h264HwList(), z ? supportedSurfaceColorList : supportedColorList);
                if (i == H264Profile.CONSTRAINED_HIGH.getValue()) {
                    if (findHwEncoder("video/avc", h264HighProfileHwList, z ? supportedSurfaceColorList : supportedColorList) != null) {
                        Logging.m21196d(TAG, "High profile H.264 encoder supported.");
                        z2 = true;
                    } else {
                        Logging.m21196d(TAG, "High profile H.264 encoder requested, but not supported. Use baseline.");
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                i6 = 20;
                z3 = z2;
                encoderPropertiesFindHwEncoder = encoderPropertiesFindHwEncoder2;
            }
            if (encoderPropertiesFindHwEncoder != null) {
                mce.m157919a("Can not find HW encoder for ", videoCodecType);
                return false;
            }
            runningInstance = this;
            this.colorFormat = encoderPropertiesFindHwEncoder.colorFormat;
            BitrateAdjustmentType bitrateAdjustmentType = encoderPropertiesFindHwEncoder.bitrateAdjustmentType;
            this.bitrateAdjustmentType = bitrateAdjustmentType;
            z4 = z3;
            int iMin = bitrateAdjustmentType != BitrateAdjustmentType.FRAMERATE_ADJUSTMENT ? Math.min(i5, 30) : 30;
            this.forcedKeyFrameMs = 0L;
            this.lastKeyFrameMs = -1L;
            if (videoCodecType == videoCodecType2 && encoderPropertiesFindHwEncoder.codecName.startsWith(qcomVp8HwProperties.codecPrefix)) {
                this.forcedKeyFrameMs = 15000L;
            }
            Logging.m21196d(TAG, "Color format: " + this.colorFormat + ". Bitrate adjustment: " + this.bitrateAdjustmentType + ". Key frame interval: " + this.forcedKeyFrameMs + " . Initial fps: " + iMin);
            int i7 = i4 * 1000;
            this.targetBitrateBps = i7;
            this.targetFps = iMin;
            this.bitrateAccumulatorMax = ((double) i7) / 8.0d;
            this.bitrateAccumulator = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            this.bitrateObservationTimeMs = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            this.bitrateAdjustmentScaleExp = 0;
            this.mediaCodecThread = Thread.currentThread();
            try {
                mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, i2, i3);
                mediaFormatCreateVideoFormat.setInteger("bitrate", this.targetBitrateBps);
                mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 2);
                mediaFormatCreateVideoFormat.setInteger("color-format", encoderPropertiesFindHwEncoder.colorFormat);
                mediaFormatCreateVideoFormat.setInteger("frame-rate", this.targetFps);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i6);
                if (z4) {
                    mediaFormatCreateVideoFormat.setInteger("profile", 8);
                    mediaFormatCreateVideoFormat.setInteger(FirebaseAnalytics.Param.LEVEL, 256);
                }
                Logging.m21196d(TAG, "  Format: " + mediaFormatCreateVideoFormat);
                mediaCodecCreateByCodecName = createByCodecName(encoderPropertiesFindHwEncoder.codecName);
                this.mediaCodec = mediaCodecCreateByCodecName;
                this.type = videoCodecType;
                if (mediaCodecCreateByCodecName == null) {
                    Logging.m21197e(TAG, "Can not create media encoder");
                    release();
                    return false;
                }
                mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                if (z) {
                    this.eglBase = new EglBase14((EglBase14.Context) getEglContext(), EglBase.CONFIG_RECORDABLE);
                    Surface surfaceCreateInputSurface = this.mediaCodec.createInputSurface();
                    this.inputSurface = surfaceCreateInputSurface;
                    this.eglBase.createSurface(surfaceCreateInputSurface);
                    this.drawer = new GlRectDrawer();
                }
                this.mediaCodec.start();
                this.outputBuffers = this.mediaCodec.getOutputBuffers();
                Logging.m21196d(TAG, "Output buffers: " + this.outputBuffers.length);
                return true;
            } catch (IllegalStateException e) {
                Logging.m21198e(TAG, "initEncode failed", e);
                release();
                return false;
            }
        }
        encoderPropertiesFindHwEncoder = findHwEncoder(VP8_MIME_TYPE, vp8HwList(), z ? supportedSurfaceColorList : supportedColorList);
        str = VP8_MIME_TYPE;
        z3 = false;
        i6 = 100;
        if (encoderPropertiesFindHwEncoder != null) {
            mce.m157919a("Can not find HW encoder for ", videoCodecType);
            return false;
        }
        runningInstance = this;
        this.colorFormat = encoderPropertiesFindHwEncoder.colorFormat;
        BitrateAdjustmentType bitrateAdjustmentType2 = encoderPropertiesFindHwEncoder.bitrateAdjustmentType;
        this.bitrateAdjustmentType = bitrateAdjustmentType2;
        z4 = z3;
        if (bitrateAdjustmentType2 != BitrateAdjustmentType.FRAMERATE_ADJUSTMENT) {
        }
        this.forcedKeyFrameMs = 0L;
        this.lastKeyFrameMs = -1L;
        if (videoCodecType == videoCodecType2) {
            this.forcedKeyFrameMs = 15000L;
        }
        Logging.m21196d(TAG, "Color format: " + this.colorFormat + ". Bitrate adjustment: " + this.bitrateAdjustmentType + ". Key frame interval: " + this.forcedKeyFrameMs + " . Initial fps: " + iMin);
        int i8 = i4 * 1000;
        this.targetBitrateBps = i8;
        this.targetFps = iMin;
        this.bitrateAccumulatorMax = ((double) i8) / 8.0d;
        this.bitrateAccumulator = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.bitrateObservationTimeMs = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.bitrateAdjustmentScaleExp = 0;
        this.mediaCodecThread = Thread.currentThread();
        mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, i2, i3);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.targetBitrateBps);
        mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 2);
        mediaFormatCreateVideoFormat.setInteger("color-format", encoderPropertiesFindHwEncoder.colorFormat);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.targetFps);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i6);
        if (z4) {
            mediaFormatCreateVideoFormat.setInteger("profile", 8);
            mediaFormatCreateVideoFormat.setInteger(FirebaseAnalytics.Param.LEVEL, 256);
        }
        Logging.m21196d(TAG, "  Format: " + mediaFormatCreateVideoFormat);
        mediaCodecCreateByCodecName = createByCodecName(encoderPropertiesFindHwEncoder.codecName);
        this.mediaCodec = mediaCodecCreateByCodecName;
        this.type = videoCodecType;
        if (mediaCodecCreateByCodecName == null) {
            Logging.m21197e(TAG, "Can not create media encoder");
            release();
            return false;
        }
        mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        if (z) {
            this.eglBase = new EglBase14((EglBase14.Context) getEglContext(), EglBase.CONFIG_RECORDABLE);
            Surface surfaceCreateInputSurface2 = this.mediaCodec.createInputSurface();
            this.inputSurface = surfaceCreateInputSurface2;
            this.eglBase.createSurface(surfaceCreateInputSurface2);
            this.drawer = new GlRectDrawer();
        }
        this.mediaCodec.start();
        this.outputBuffers = this.mediaCodec.getOutputBuffers();
        Logging.m21196d(TAG, "Output buffers: " + this.outputBuffers.length);
        return true;
    }

    @CalledByNativeUnchecked
    public void release() {
        Logging.m21196d(TAG, "Java releaseEncoder");
        checkOnMediaCodecThread();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        boolean z = false;
        if (this.mediaCodec != null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new Runnable() { // from class: com.momo.rtcbase.MediaCodecVideoEncoder.1
                @Override // java.lang.Runnable
                public void run() {
                    Logging.m21196d(MediaCodecVideoEncoder.TAG, "Java releaseEncoder on release thread");
                    try {
                        MediaCodecVideoEncoder.this.mediaCodec.stop();
                    } catch (Exception e) {
                        Logging.m21198e(MediaCodecVideoEncoder.TAG, "Media encoder stop failed", e);
                    }
                    try {
                        MediaCodecVideoEncoder.this.mediaCodec.release();
                    } catch (Exception e2) {
                        Logging.m21198e(MediaCodecVideoEncoder.TAG, "Media encoder release failed", e2);
                        c1CaughtException.f15264e = e2;
                    }
                    Logging.m21196d(MediaCodecVideoEncoder.TAG, "Java releaseEncoder on release thread done");
                    countDownLatch.countDown();
                }
            }).start();
            if (!ThreadUtils.awaitUninterruptibly(countDownLatch, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS)) {
                Logging.m21197e(TAG, "Media encoder release timeout");
                z = true;
            }
            this.mediaCodec = null;
        }
        this.mediaCodecThread = null;
        GlRectDrawer glRectDrawer = this.drawer;
        if (glRectDrawer != null) {
            glRectDrawer.release();
            this.drawer = null;
        }
        EglBase14 eglBase14 = this.eglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.eglBase = null;
        }
        Surface surface = this.inputSurface;
        if (surface != null) {
            surface.release();
            this.inputSurface = null;
        }
        runningInstance = null;
        if (!z) {
            Exception exc = c1CaughtException.f15264e;
            if (exc == null) {
                Logging.m21196d(TAG, "Java releaseEncoder done");
                return;
            } else {
                RuntimeException runtimeException = new RuntimeException(exc);
                runtimeException.setStackTrace(ThreadUtils.concatStackTraces(c1CaughtException.f15264e.getStackTrace(), runtimeException.getStackTrace()));
                throw runtimeException;
            }
        }
        codecErrors++;
        if (errorCallback != null) {
            Logging.m21197e(TAG, "Invoke codec error callback. Errors: " + codecErrors);
            errorCallback.onMediaCodecVideoEncoderCriticalError(codecErrors);
        }
        azk0.m101074a("Media encoder release timeout.");
    }

    @CalledByNativeUnchecked
    public boolean releaseOutputBuffer(int i) {
        checkOnMediaCodecThread();
        try {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } catch (IllegalStateException e) {
            Logging.m21198e(TAG, "releaseOutputBuffer failed", e);
            return false;
        }
    }
}
