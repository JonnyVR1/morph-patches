package com.momo.rtcbase;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.opengl.EGLContext;
import android.os.Build;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p153l.ypg0;

/* JADX INFO: loaded from: classes8.dex */
public class HardwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final List<String> H264_HW_EXCEPTION_MODELS = Arrays.asList("SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4");
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    private static final String TAG = "HardwareVideoEncoderFactory";
    private int brmodecq;
    private final Predicate<MediaCodecInfo> codecAllowedPredicate;
    private final boolean enableH264HighProfile;
    private final boolean enableIntelVp8Encoder;
    private int resetCodecInterval;
    private final EglBase14.Context sharedContext;

    /* JADX INFO: renamed from: com.momo.rtcbase.HardwareVideoEncoderFactory$1 */
    public static /* synthetic */ class C42881 {
        static final /* synthetic */ int[] $SwitchMap$com$momo$rtcbase$VideoCodecType;

        static {
            int[] iArr = new int[VideoCodecType.values().length];
            $SwitchMap$com$momo$rtcbase$VideoCodecType = iArr;
            try {
                iArr[VideoCodecType.H264.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$momo$rtcbase$VideoCodecType[VideoCodecType.VP8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$momo$rtcbase$VideoCodecType[VideoCodecType.VP9.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, Predicate<MediaCodecInfo> predicate) {
        this.resetCodecInterval = 0;
        this.brmodecq = 0;
        if (context instanceof EglBase14.Context) {
            this.sharedContext = (EglBase14.Context) context;
        } else {
            Logging.m21200w(TAG, "No shared EglBase.Context.  Encoders will not use texture mode.");
            this.sharedContext = null;
        }
        this.enableIntelVp8Encoder = z;
        this.enableH264HighProfile = z2;
        this.codecAllowedPredicate = predicate;
    }

    private BitrateAdjuster createBitrateAdjuster(VideoCodecType videoCodecType, String str) {
        if (str.startsWith("OMX.Exynos.")) {
            return videoCodecType == VideoCodecType.VP8 ? new DynamicBitrateAdjuster() : new FramerateBitrateAdjuster();
        }
        return new BaseBitrateAdjuster();
    }

    private MediaCodecInfo findCodecForType(VideoCodecType videoCodecType) {
        int i = 0;
        while (true) {
            MediaCodecInfo codecInfoAt = null;
            if (i >= MediaCodecList.getCodecCount()) {
                return null;
            }
            try {
                codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                Logging.m21198e(TAG, "Cannot retrieve encoder codec info", e);
            }
            if (codecInfoAt != null && codecInfoAt.isEncoder()) {
                Logging.m21197e("HardwareVideoEncoderFactory->", codecInfoAt.getName());
                if (isSupportedCodec(codecInfoAt, videoCodecType)) {
                    return codecInfoAt;
                }
            }
            i++;
        }
    }

    private int getForcedKeyFrameIntervalMs(VideoCodecType videoCodecType, String str) {
        if (videoCodecType == VideoCodecType.VP8 && str.startsWith("OMX.qcom.")) {
            return NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
        }
        return 0;
    }

    private int getKeyFrameIntervalSec(VideoCodecType videoCodecType) {
        int i = C42881.$SwitchMap$com$momo$rtcbase$VideoCodecType[videoCodecType.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 100;
        }
        ypg0.m217021a("Unsupported VideoCodecType ", videoCodecType);
        return 0;
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        return this.enableH264HighProfile && mediaCodecInfo.getName().startsWith("OMX.Exynos.");
    }

    private boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        if (C42881.$SwitchMap$com$momo$rtcbase$VideoCodecType[videoCodecType.ordinal()] != 1) {
            return false;
        }
        return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
    }

    private boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            return false;
        }
        mediaCodecInfo.getName();
        return true;
    }

    private boolean isHardwareSupportedInCurrentSdkVp8(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.")) {
            return true;
        }
        return name.startsWith("OMX.Intel.") && this.enableIntelVp8Encoder;
    }

    private boolean isHardwareSupportedInCurrentSdkVp9(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.");
    }

    private boolean isMediaCodecAllowed(MediaCodecInfo mediaCodecInfo) {
        Predicate<MediaCodecInfo> predicate = this.codecAllowedPredicate;
        if (predicate == null) {
            return true;
        }
        return predicate.test(mediaCodecInfo);
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        return MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecType) && MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecType.mimeType())) != null && isHardwareSupportedInCurrentSdk(mediaCodecInfo, videoCodecType) && isMediaCodecAllowed(mediaCodecInfo);
    }

    @Override // com.momo.rtcbase.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        VideoCodecType videoCodecTypeValueOf = VideoCodecType.valueOf(videoCodecInfo.name);
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(videoCodecTypeValueOf);
        if (mediaCodecInfoFindCodecForType == null) {
            return null;
        }
        String name = mediaCodecInfoFindCodecForType.getName();
        String strMimeType = videoCodecTypeValueOf.mimeType();
        Integer numSelectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType));
        Integer numSelectColorFormat2 = MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType));
        if (videoCodecTypeValueOf == VideoCodecType.H264) {
            boolean zIsSameH264Profile = H264Utils.isSameH264Profile(videoCodecInfo.params, MediaCodecUtils.getCodecProperties(videoCodecTypeValueOf, true));
            boolean zIsSameH264Profile2 = H264Utils.isSameH264Profile(videoCodecInfo.params, MediaCodecUtils.getCodecProperties(videoCodecTypeValueOf, false));
            if (!zIsSameH264Profile && !zIsSameH264Profile2) {
                return null;
            }
            if (zIsSameH264Profile && !isH264HighProfileSupported(mediaCodecInfoFindCodecForType)) {
                return null;
            }
        }
        return new HardwareVideoEncoder(new MediaCodecWrapperFactoryImpl(), name, videoCodecTypeValueOf, numSelectColorFormat, numSelectColorFormat2, videoCodecInfo.params, getKeyFrameIntervalSec(videoCodecTypeValueOf), getForcedKeyFrameIntervalMs(videoCodecTypeValueOf, name), createBitrateAdjuster(videoCodecTypeValueOf, name), this.sharedContext, this.resetCodecInterval, this.brmodecq);
    }

    @Override // com.momo.rtcbase.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        VideoCodecType videoCodecType = VideoCodecType.H264;
        VideoCodecType videoCodecType2 = new VideoCodecType[]{videoCodecType}[0];
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(videoCodecType2);
        if (mediaCodecInfoFindCodecForType != null) {
            String strName = videoCodecType2.name();
            if (videoCodecType2 == videoCodecType && isH264HighProfileSupported(mediaCodecInfoFindCodecForType)) {
                arrayList.add(new VideoCodecInfo(strName, MediaCodecUtils.getCodecProperties(videoCodecType2, true)));
            }
            arrayList.add(new VideoCodecInfo(strName, MediaCodecUtils.getCodecProperties(videoCodecType2, false)));
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2) {
        this(context, z, z2, null);
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, int i, int i2) {
        this(context, z, z2, null);
        this.resetCodecInterval = i;
        this.brmodecq = i2;
    }

    public HardwareVideoEncoderFactory(EGLContext eGLContext) {
        this(new EglBase14.Context(eGLContext), false, true, null);
    }

    @Deprecated
    public HardwareVideoEncoderFactory(boolean z, boolean z2) {
        this(null, z, z2);
    }
}
