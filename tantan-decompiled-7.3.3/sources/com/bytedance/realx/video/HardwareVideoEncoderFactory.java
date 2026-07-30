package com.bytedance.realx.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RXDeviceInfoAndroid;
import com.bytedance.realx.base.RXLogging;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import java.util.ArrayList;
import p153l.ypg0;

/* JADX INFO: loaded from: classes.dex */
public class HardwareVideoEncoderFactory {
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    private static final String TAG = "HwVideoEncoderFactory";

    /* JADX INFO: renamed from: com.bytedance.realx.video.HardwareVideoEncoderFactory$1 */
    public static /* synthetic */ class C11631 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard;

        static {
            int[] iArr = new int[RXVideoCodecStandard.values().length];
            $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard = iArr;
            try {
                iArr[RXVideoCodecStandard.H264.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[RXVideoCodecStandard.ByteVC1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[RXVideoCodecStandard.VP8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[RXVideoCodecStandard.VP9.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Nullable
    @CalledByNative
    public static VideoEncoder createEncoder(RXVideoCodecDesc rXVideoCodecDesc) {
        RXVideoCodecStandard standard = rXVideoCodecDesc.getStandard();
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(standard);
        if (mediaCodecInfoFindCodecForType == null) {
            return null;
        }
        String name = mediaCodecInfoFindCodecForType.getName();
        String strMimeType = standard.mimeType();
        Integer numSelectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType));
        if (numSelectColorFormat == null) {
            Log.e(TAG, "surfaceColorFormat is null object.");
            return null;
        }
        Integer numSelectColorFormat2 = MediaCodecUtils.selectColorFormat(name.contains("OMX.hisi.") ? MediaCodecUtils.ENCODER_COLOR_FORMATS_FOR_HISI : MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType));
        if (numSelectColorFormat2 != null) {
            return new HardwareVideoEncoder(new MediaCodecWrapperFactoryImpl(), name, rXVideoCodecDesc, numSelectColorFormat, numSelectColorFormat2, getKeyFrameIntervalSec(standard), getForcedKeyFrameIntervalMs(standard, name));
        }
        Log.e(TAG, "yuvColorFormat is null object.");
        return null;
    }

    @Nullable
    private static MediaCodecInfo findCodecForType(RXVideoCodecStandard rXVideoCodecStandard) {
        MediaCodecInfo codecInfoAt;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                try {
                    codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                } catch (IllegalArgumentException e) {
                    Log.e(TAG, "Cannot retrieve encoder codec info", e);
                    codecInfoAt = null;
                }
                if (codecInfoAt != null && codecInfoAt.isEncoder() && !isSoftwareOnly(codecInfoAt) && isSupportedCodec(codecInfoAt, rXVideoCodecStandard)) {
                    return codecInfoAt;
                }
            }
            return null;
        } catch (Exception e2) {
            Log.e(TAG, "Cannot getCodecCount", e2);
            return null;
        }
    }

    private static int getForcedKeyFrameIntervalMs(RXVideoCodecStandard rXVideoCodecStandard, String str) {
        if (rXVideoCodecStandard == RXVideoCodecStandard.VP8 && str.startsWith("OMX.qcom.")) {
            return NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
        }
        return 0;
    }

    private static int getKeyFrameIntervalSec(RXVideoCodecStandard rXVideoCodecStandard) {
        int i = C11631.$SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[rXVideoCodecStandard.ordinal()];
        if (i == 1 || i == 2) {
            return 720;
        }
        if (i == 3 || i == 4) {
            return 100;
        }
        ypg0.m217021a("Unsupported VideoCodecType ", rXVideoCodecStandard);
        return 0;
    }

    @CalledByNative
    public static RXVideoCodecDesc[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        RXVideoCodecStandard[] rXVideoCodecStandardArr = {RXVideoCodecStandard.ByteVC1, RXVideoCodecStandard.H264, RXVideoCodecStandard.VP8};
        for (int i = 0; i < 3; i++) {
            RXVideoCodecStandard rXVideoCodecStandard = rXVideoCodecStandardArr[i];
            MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(rXVideoCodecStandard);
            if (mediaCodecInfoFindCodecForType != null) {
                if (rXVideoCodecStandard == RXVideoCodecStandard.ByteVC1 && isSupportedCodec(mediaCodecInfoFindCodecForType, rXVideoCodecStandard)) {
                    arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ByteVC1ProfileMain));
                }
                if (rXVideoCodecStandard == RXVideoCodecStandard.H264) {
                    if (isH264HighProfileSupported(mediaCodecInfoFindCodecForType)) {
                        arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileHigh));
                    }
                    arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileBaseline));
                }
                if (rXVideoCodecStandard == RXVideoCodecStandard.VP8) {
                    arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.VP8ProfileMain));
                }
            }
        }
        return (RXVideoCodecDesc[]) arrayList.toArray(new RXVideoCodecDesc[arrayList.size()]);
    }

    @RequiresApi(api = 21)
    public static boolean isBitrateModeSupported(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard, int i) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType());
        if (capabilitiesForType == null) {
            RXLogging.m5742e(TAG, "get capability return null.");
            return false;
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            return encoderCapabilities.isBitrateModeSupported(i);
        }
        RXLogging.m5742e(TAG, "get EncoderCapabilities return null.");
        return false;
    }

    private static boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        String strGetDeviceModel = RXDeviceInfoAndroid.GetDeviceModel();
        String strGetDeviceBrand = RXDeviceInfoAndroid.GetDeviceBrand();
        if (RXDeviceInfoAndroid.GetCpuModel().contains("Amlogic")) {
            return false;
        }
        return (strGetDeviceModel.equalsIgnoreCase("T730") && strGetDeviceBrand.equalsIgnoreCase("VHD")) ? false : true;
    }

    private static boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        int i = C11631.$SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[rXVideoCodecStandard.ordinal()];
        if (i == 1) {
            return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
        }
        if (i == 2) {
            return isHardwareSupportedInCurrentSdkByteVC1(mediaCodecInfo);
        }
        if (i != 3) {
            return false;
        }
        return isHardwareSupportedInCurrentSdkVP8(mediaCodecInfo);
    }

    private static boolean isHardwareSupportedInCurrentSdkByteVC1(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.")) {
            return true;
        }
        name.startsWith("OMX.Exynos.");
        return true;
    }

    private static boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.") || name.startsWith("OMX.sprd.")) {
            return true;
        }
        name.startsWith("OMX.Exynos.");
        return true;
    }

    private static boolean isHardwareSupportedInCurrentSdkVP8(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.")) {
            return true;
        }
        name.startsWith("OMX.Intel.");
        return true;
    }

    private static boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return mediaCodecInfo.isSoftwareOnly();
            }
            String name = mediaCodecInfo.getName();
            if (name == null) {
                return false;
            }
            String lowerCase = name.toLowerCase();
            if (lowerCase.startsWith("arc.")) {
                return false;
            }
            if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
                return true;
            }
            return (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")) ? false : true;
        } catch (Exception e) {
            RXLogging.m5743e(TAG, "check encoder softonly error.", e);
            return false;
        }
    }

    private static boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, rXVideoCodecStandard)) {
            return false;
        }
        try {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType())) == null) {
                return false;
            }
            return isHardwareSupportedInCurrentSdk(mediaCodecInfo, rXVideoCodecStandard);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
