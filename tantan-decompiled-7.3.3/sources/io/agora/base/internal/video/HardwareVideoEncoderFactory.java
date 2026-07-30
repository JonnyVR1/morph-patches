package io.agora.base.internal.video;

import android.media.MediaCodecInfo;
import androidx.annotation.Nullable;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import io.agora.base.internal.Logging;
import java.util.ArrayList;
import p153l.ypg0;

/* JADX INFO: loaded from: classes2.dex */
public class HardwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    private static final String TAG = "HardwareVideoEncoderFactory";
    private final boolean enableH264HighProfile;
    private final boolean enableIntelVp8Encoder;

    @Nullable
    private final EglBase.Context sharedContext;

    /* JADX INFO: renamed from: io.agora.base.internal.video.HardwareVideoEncoderFactory$1 */
    public static /* synthetic */ class C150881 {
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

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2) {
        this.sharedContext = context;
        this.enableIntelVp8Encoder = z;
        this.enableH264HighProfile = z2;
    }

    private BitrateAdjuster createBitrateAdjuster(VideoCodecType videoCodecType, String str) {
        if (!str.startsWith("OMX.Exynos.")) {
            return ((videoCodecType == VideoCodecType.H264 || videoCodecType == VideoCodecType.H265) && (str.startsWith("OMX.qcom.") || str.startsWith("OMX.MTK.") || str.startsWith("OMX.hisi."))) ? new FactorBitrateAdjuster(FactorBitrateAdjuster.FACTOR_LEVEL1) : new BaseBitrateAdjuster();
        }
        if (videoCodecType == VideoCodecType.VP8) {
            return new DynamicBitrateAdjuster();
        }
        return (videoCodecType == VideoCodecType.H264 || videoCodecType == VideoCodecType.H265) ? new FactorBitrateAdjuster(FactorBitrateAdjuster.FACTOR_LEVEL1) : new FramerateBitrateAdjuster();
    }

    private int getForcedKeyFrameIntervalMs(VideoCodecType videoCodecType, String str) {
        if (videoCodecType == VideoCodecType.VP8 && str.startsWith("OMX.qcom.")) {
            return NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
        }
        return 0;
    }

    private int getKeyFrameIntervalSec(VideoCodecType videoCodecType) {
        int i = C150881.$SwitchMap$io$agora$base$internal$video$VideoCodecType[videoCodecType.ordinal()];
        if (i == 1 || i == 2) {
            return 100;
        }
        if (i == 3 || i == 4) {
            return 20;
        }
        if (i == 5) {
            Logging.m88098e(TAG, "UNKNOWN is not excepted but h264");
            return 20;
        }
        ypg0.m217021a("Unsupported VideoCodecType ", videoCodecType);
        return 0;
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        boolean z;
        boolean z2;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        if (mediaCodecInfo.getName().startsWith("OMX.qcom.") || mediaCodecInfo.getName().startsWith("OMX.hisi.") || mediaCodecInfo.getName().startsWith("OMX.Exynos.") || mediaCodecInfo.getName().startsWith("OMX.MTK.")) {
            z = true;
            z2 = false;
        } else {
            z2 = true;
            z = false;
        }
        if (this.enableH264HighProfile && (z || z2)) {
            try {
                capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(VideoCodecType.H264.mimeType());
            } catch (IllegalArgumentException e) {
                Logging.m88099e(TAG, "getCapabilitiesForType:", e);
                capabilitiesForType = null;
            }
            if (capabilitiesForType == null) {
                return false;
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                if (codecProfileLevel.profile == 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.agora.base.internal.video.VideoEncoderFactory
    @Nullable
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo, boolean z) {
        VideoCodecType videoCodecTypeValueOf;
        MediaCodecInfo mediaCodecInfoFindCodecForType;
        Integer numSelectColorFormat;
        int iSelectColorFormat = 0;
        if (!VideoCodecType.contains(videoCodecInfo.name) || (mediaCodecInfoFindCodecForType = VideoEncoderUtils.findCodecForType((videoCodecTypeValueOf = VideoCodecType.valueOf(videoCodecInfo.name)), z)) == null) {
            return null;
        }
        String name = mediaCodecInfoFindCodecForType.getName();
        String strMimeType = videoCodecTypeValueOf.mimeType();
        try {
            numSelectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType));
            try {
                iSelectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.encoderColorFormats(mediaCodecInfoFindCodecForType.getName()), mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType));
            } catch (IllegalArgumentException e) {
                e = e;
                Logging.m88099e(TAG, "getCapabilitiesForType:", e);
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            numSelectColorFormat = iSelectColorFormat;
        }
        Integer num = iSelectColorFormat;
        Integer num2 = numSelectColorFormat;
        if (videoCodecTypeValueOf == VideoCodecType.H264) {
            H264Utils.isSameH264Profile(videoCodecInfo.params, MediaCodecUtils.getCodecProperties(videoCodecTypeValueOf, true));
            H264Utils.isSameH264Profile(videoCodecInfo.params, MediaCodecUtils.getCodecProperties(videoCodecTypeValueOf, false));
            videoCodecInfo.params.put(VideoCodecInfo.H264_IS_HIGH_PROFILE_SUPPORTED, String.valueOf(isH264HighProfileSupported(mediaCodecInfoFindCodecForType)));
        }
        return new HardwareVideoEncoder(new MediaCodecWrapperFactoryImpl(), name, videoCodecTypeValueOf, num2, num, videoCodecInfo.params, getKeyFrameIntervalSec(videoCodecTypeValueOf), getForcedKeyFrameIntervalMs(videoCodecTypeValueOf, name), VideoEncoderUtils.getSupportedEncoders(), createBitrateAdjuster(videoCodecTypeValueOf, name), this.sharedContext);
    }

    @Override // io.agora.base.internal.video.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs(boolean z) {
        ArrayList arrayList = new ArrayList();
        VideoCodecType[] videoCodecTypeArr = {VideoCodecType.VP8, VideoCodecType.VP9, VideoCodecType.H264, VideoCodecType.H265};
        for (int i = 0; i < 4; i++) {
            VideoCodecType videoCodecType = videoCodecTypeArr[i];
            MediaCodecInfo mediaCodecInfoFindCodecForType = VideoEncoderUtils.findCodecForType(videoCodecType, z);
            if (mediaCodecInfoFindCodecForType != null) {
                String strName = videoCodecType.name();
                if (videoCodecType == VideoCodecType.H264 && isH264HighProfileSupported(mediaCodecInfoFindCodecForType)) {
                    arrayList.add(new VideoCodecInfo(strName, MediaCodecUtils.getCodecProperties(videoCodecType, true)));
                }
                arrayList.add(new VideoCodecInfo(strName, MediaCodecUtils.getCodecProperties(videoCodecType, false)));
            }
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }

    @Deprecated
    public HardwareVideoEncoderFactory(boolean z, boolean z2) {
        this(null, z, z2);
    }

    @Override // io.agora.base.internal.video.VideoEncoderFactory
    @Nullable
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo, boolean z, boolean z2) {
        return createEncoder(videoCodecInfo, z);
    }
}
