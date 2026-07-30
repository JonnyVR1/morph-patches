package io.agora.base.internal.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import androidx.annotation.Nullable;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.Logging;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VideoEncoderUtils {
    public static final List<String> H264_HW_EXCEPTION_MODELS = Arrays.asList("Lenovo S90-u", "CHM-CL00", "CHM-TL00H", "CHM-UL00", "E6533", "HUAWEI CRR-UL00", "HUAWEI MT7-TL00", "HONOR H30-L01", "CHE-TL00H", "CHE-TL00", "Che2-TL00", "Che2-TL00M", "HTC D820mt", "HUAWEI P7-L10", "HUAWEI P7-L07", "M5s", "SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4", "P6-C00", "HM 2A", "XT105", "XT109", "XT1060");
    private static final List<String> H265_HW_EXCEPTION_HARDWARES = Arrays.asList("mt6771", "mt6762");
    private static final String TAG = "HardwareVideoEncoderUtils";

    /* JADX INFO: renamed from: io.agora.base.internal.video.VideoEncoderUtils$1 */
    public static /* synthetic */ class C150201 {
        static final /* synthetic */ int[] $SwitchMap$io$agora$base$internal$video$VideoCodecType;

        static {
            int[] iArr = new int[VideoCodecType.values().length];
            $SwitchMap$io$agora$base$internal$video$VideoCodecType = iArr;
            try {
                iArr[VideoCodecType.VP8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$VideoCodecType[VideoCodecType.VP9.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$VideoCodecType[VideoCodecType.H264.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$VideoCodecType[VideoCodecType.H265.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$VideoCodecType[VideoCodecType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Nullable
    public static MediaCodecInfo findCodecForType(VideoCodecType videoCodecType, boolean z) {
        int i = 0;
        while (true) {
            MediaCodecInfo codecInfoAt = null;
            if (i >= MediaCodecList.getCodecCount()) {
                return null;
            }
            try {
                codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                Logging.m87210e(TAG, "Cannot retrieve encoder codec info", e);
            }
            if (codecInfoAt != null && codecInfoAt.isEncoder() && isSupportedCodec(codecInfoAt, videoCodecType, z)) {
                Logging.m87208d(TAG, "found available encodec: " + codecInfoAt.getName());
                return codecInfoAt;
            }
            i++;
        }
    }

    public static int getRecommendedEncoderType() {
        return getRecommendedEncoderTypeImpl(Build.MODEL, Build.VERSION.SDK_INT);
    }

    public static int getRecommendedEncoderTypeImpl(String str, int i) {
        return (!H264_HW_EXCEPTION_MODELS.contains(str) && i > 18) ? 0 : 1;
    }

    public static int getSupportedEncoders() {
        int i = 0;
        for (int i2 = 0; i2 < MediaCodecList.getCodecCount(); i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    if (str.equals(VideoCodecType.VP8.mimeType())) {
                        i |= 1;
                    } else if (str.equals(VideoCodecType.H264.mimeType())) {
                        i |= 2;
                    } else if (str.equals(VideoCodecType.H265.mimeType())) {
                        i |= 4;
                    }
                }
            }
        }
        return i;
    }

    public static boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        int i = C150201.$SwitchMap$io$agora$base$internal$video$VideoCodecType[videoCodecType.ordinal()];
        if (i == 1) {
            return isHardwareSupportedInCurrentSdkVp8(mediaCodecInfo);
        }
        if (i == 2) {
            return isHardwareSupportedInCurrentSdkVp9(mediaCodecInfo);
        }
        if (i == 3) {
            return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
        }
        if (i == 4) {
            return isHardwareSupportedInCurrentSdkH265();
        }
        if (i != 5) {
            return false;
        }
        Logging.m87209e(TAG, "UNKNOWN is not excepted!!!");
        return false;
    }

    public static boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            return false;
        }
        mediaCodecInfo.getName().startsWith("OMX.qcom.");
        return true;
    }

    public static boolean isHardwareSupportedInCurrentSdkH265() {
        List<String> list = H265_HW_EXCEPTION_HARDWARES;
        String str = Build.HARDWARE;
        if (!list.contains(str)) {
            return true;
        }
        Logging.m87213w(TAG, "Hardware: " + str + " has black listed H.265 encoder.");
        return false;
    }

    public static boolean isHardwareSupportedInCurrentSdkVp8(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.") || name.startsWith("OMX.Intel.");
    }

    public static boolean isHardwareSupportedInCurrentSdkVp9(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.");
    }

    public static boolean isHardwareTextureSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        int i = C150201.$SwitchMap$io$agora$base$internal$video$VideoCodecType[videoCodecType.ordinal()];
        if (i == 1) {
            return isHardwareSupportedInCurrentSdkVp8(mediaCodecInfo);
        }
        if (i == 2) {
            return isHardwareSupportedInCurrentSdkVp9(mediaCodecInfo);
        }
        if (i == 3) {
            if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
                return false;
            }
            mediaCodecInfo.getName().startsWith("OMX.k3.");
            return true;
        }
        if (i == 4) {
            return isHardwareSupportedInCurrentSdkH265();
        }
        if (i != 5) {
            return false;
        }
        Logging.m87209e(TAG, "UNKNOWN is not excepted!!!");
        return false;
    }

    @CalledByNative
    public static boolean isSupportHwEncoderByType(String str) {
        return VideoCodecType.contains(str) && !(findCodecForType(VideoCodecType.valueOf(str), false) == null && findCodecForType(VideoCodecType.valueOf(str), true) == null);
    }

    public static boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType, boolean z) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecType)) {
            Logging.m87213w(TAG, "not support codec type:" + videoCodecType);
            return false;
        }
        try {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.encoderColorFormats(mediaCodecInfo.getName()), mediaCodecInfo.getCapabilitiesForType(videoCodecType.mimeType())) == null) {
                Logging.m87209e(TAG, "no match color format");
                return false;
            }
            if (MediaCodecUtils.checkInvalidEncoder(mediaCodecInfo.getName())) {
                return false;
            }
            return z ? isHardwareTextureSupportedInCurrentSdk(mediaCodecInfo, videoCodecType) : isHardwareSupportedInCurrentSdk(mediaCodecInfo, videoCodecType);
        } catch (Exception unused) {
            Logging.m87213w(TAG, "fail to selectColorFormat, not support mimeType:" + videoCodecType.mimeType());
            return false;
        }
    }
}
