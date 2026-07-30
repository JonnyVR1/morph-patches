package io.agora.base.internal.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import androidx.annotation.Nullable;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.Logging;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VideoDecoderUtils {
    private static final List<String> H264_HWDEC_EXCEPTION_MODELS = Arrays.asList("ASUS_T00J");
    private static final String TAG = "HardwareVideoDecoderUtils";
    private static MediaCodecInfo h264CodecInfo;
    private static MediaCodecInfo h265CodecInfo;
    private static MediaCodecInfo vp8CodecInfo;
    private static MediaCodecInfo vp9CodecInfo;

    /* JADX INFO: renamed from: io.agora.base.internal.video.VideoDecoderUtils$1 */
    public static /* synthetic */ class C151251 {
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
        }
    }

    @CalledByNative
    public static boolean IsSupportDecodeHEVC10Bit() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        VideoCodecType videoCodecType = VideoCodecType.H265;
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(videoCodecType);
        if (mediaCodecInfoFindCodecForType == null) {
            return false;
        }
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoFindCodecForType.getCapabilitiesForType(videoCodecType.mimeType());
            if (capabilitiesForType != null && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
                int length = codecProfileLevelArr.length;
                for (int i2 = 0; i2 < length && (i = codecProfileLevelArr[i2].profile) != 2 && i != 4096 && i != 8192; i2++) {
                }
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            ThrowableExtension.printStackTrace(e);
            return false;
        }
    }

    @Nullable
    public static MediaCodecInfo findCodecForType(VideoCodecType videoCodecType) {
        MediaCodecInfo mediaCodecInfo;
        MediaCodecInfo mediaCodecInfo2;
        MediaCodecInfo mediaCodecInfo3;
        MediaCodecInfo mediaCodecInfo4;
        if (videoCodecType == VideoCodecType.VP8 && (mediaCodecInfo4 = vp8CodecInfo) != null) {
            return mediaCodecInfo4;
        }
        if (videoCodecType == VideoCodecType.VP9 && (mediaCodecInfo3 = vp9CodecInfo) != null) {
            return mediaCodecInfo3;
        }
        if (videoCodecType == VideoCodecType.H264 && (mediaCodecInfo2 = h264CodecInfo) != null) {
            return mediaCodecInfo2;
        }
        if (videoCodecType == VideoCodecType.H265 && (mediaCodecInfo = h265CodecInfo) != null) {
            return mediaCodecInfo;
        }
        int i = 0;
        while (true) {
            MediaCodecInfo codecInfoAt = null;
            if (i >= MediaCodecList.getCodecCount()) {
                return null;
            }
            try {
                codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                Logging.m88099e(TAG, "Cannot retrieve encoder codec info", e);
            }
            if (codecInfoAt != null && !codecInfoAt.isEncoder() && isSupportedCodec(codecInfoAt, videoCodecType)) {
                Logging.m88097d(TAG, "found available decodec: " + codecInfoAt.getName());
                if (videoCodecType == VideoCodecType.VP8) {
                    vp8CodecInfo = codecInfoAt;
                } else if (videoCodecType == VideoCodecType.VP9) {
                    vp9CodecInfo = codecInfoAt;
                } else if (videoCodecType == VideoCodecType.H264) {
                    h264CodecInfo = codecInfoAt;
                } else if (videoCodecType == VideoCodecType.H265) {
                    h265CodecInfo = codecInfoAt;
                }
                return codecInfoAt;
            }
            i++;
        }
    }

    @CalledByNative
    public static int getMaxSupportedInstances(String str) {
        MediaCodecInfo mediaCodecInfoFindCodecForType;
        if (VideoCodecType.contains(str) && (mediaCodecInfoFindCodecForType = findCodecForType(VideoCodecType.valueOf(str))) != null) {
            try {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoFindCodecForType.getCapabilitiesForType(VideoCodecType.valueOf(str).mimeType());
                if (capabilitiesForType == null) {
                    return -1;
                }
                return capabilitiesForType.getMaxSupportedInstances();
            } catch (IllegalArgumentException e) {
                ThrowableExtension.printStackTrace(e);
            }
        }
        return -1;
    }

    public static int getSupportedDecoders() {
        int i = 0;
        for (int i2 = 0; i2 < MediaCodecList.getCodecCount(); i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (!codecInfoAt.isEncoder()) {
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

    public static boolean isHardwareSupported(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        String name = mediaCodecInfo.getName();
        int i = C151251.$SwitchMap$io$agora$base$internal$video$VideoCodecType[videoCodecType.ordinal()];
        if (i == 1) {
            return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Intel.") || name.startsWith("OMX.Exynos.") || name.startsWith("OMX.Nvidia.");
        }
        if (i == 2) {
            return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.");
        }
        if (i != 3) {
            return i == 4;
        }
        return !H264_HWDEC_EXCEPTION_MODELS.contains(Build.MODEL);
    }

    @CalledByNative
    public static boolean isSupportHwDecoderByType(String str) {
        return VideoCodecType.contains(str) && findCodecForType(VideoCodecType.valueOf(str)) != null;
    }

    @CalledByNative
    public static boolean isSupportHwDecoderByTypeAndProfile(String str, String str2) {
        MediaCodecInfo mediaCodecInfoFindCodecForType;
        Logging.m88102w(TAG, "isSupportHwDecoderByTypeAndProfile " + str + ":" + str2);
        if (!VideoCodecType.contains(str) || (mediaCodecInfoFindCodecForType = findCodecForType(VideoCodecType.valueOf(str))) == null) {
            return false;
        }
        try {
            return VideoCodecProfile.contains(str2) && isSupportedProfile(mediaCodecInfoFindCodecForType.getCapabilitiesForType(VideoCodecType.valueOf(str).mimeType()), VideoCodecProfile.valueOf(str2));
        } catch (IllegalArgumentException e) {
            ThrowableExtension.printStackTrace(e);
            return false;
        }
    }

    public static boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecType)) {
            return false;
        }
        try {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecType.mimeType())) == null) {
                Logging.m88102w(TAG, "selectColorFormat is null");
                return false;
            }
            if (MediaCodecUtils.checkInvalidDecoder(mediaCodecInfo.getName())) {
                return false;
            }
            return isHardwareSupported(mediaCodecInfo, videoCodecType);
        } catch (IllegalArgumentException e) {
            ThrowableExtension.printStackTrace(e);
            return false;
        }
    }

    public static boolean isSupportedProfile(MediaCodecInfo.CodecCapabilities codecCapabilities, VideoCodecProfile videoCodecProfile) {
        if (codecCapabilities != null) {
            for (int i = 0; i < codecCapabilities.profileLevels.length; i++) {
                Logging.m88100i(TAG, "device decoder profile:" + codecCapabilities.profileLevels[i].profile);
                if (codecCapabilities.profileLevels[i].profile == videoCodecProfile.profile()) {
                    Logging.m88100i(TAG, "match decoder profile:" + codecCapabilities.profileLevels[i].profile);
                    return true;
                }
            }
        }
        return false;
    }
}
