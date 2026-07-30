package com.bytedance.realx.video;

import android.media.MediaCodecInfo;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import p149l.qhg0;

/* JADX INFO: loaded from: classes.dex */
class MediaCodecUtils {
    static final String EXYNOS_PREFIX = "OMX.Exynos.";
    static final String HISI_PREFIX = "OMX.hisi.";
    static final String INTEL_PREFIX = "OMX.Intel.";
    static final String NVIDIA_PREFIX = "OMX.Nvidia.";
    static final String QCOM_PREFIX = "OMX.qcom.";
    static final String SPRD_PREFIX = "OMX.sprd.";
    private static final String TAG = "MediaCodecUtils";
    static final String[] SOFTWARE_IMPLEMENTATION_PREFIXES = {"OMX.google.", "OMX.SEC."};
    static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka = 2141391873;
    static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka = 2141391874;
    static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka = 2141391875;
    static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    static final int[] DECODER_COLOR_FORMATS = {19, 21, 2141391872, COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka, COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka, COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
    static final int[] ENCODER_COLOR_FORMATS = {19, 21, 2141391872, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
    static final int[] ENCODER_COLOR_FORMATS_FOR_HISI = {21, 19};
    static final int[] TEXTURE_COLOR_FORMATS = getTextureColorFormats();

    /* JADX INFO: renamed from: com.bytedance.realx.video.MediaCodecUtils$1 */
    public static /* synthetic */ class C11411 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard;

        static {
            int[] iArr = new int[RXVideoCodecStandard.values().length];
            $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard = iArr;
            try {
                iArr[RXVideoCodecStandard.VP8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[RXVideoCodecStandard.VP9.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[RXVideoCodecStandard.H264.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private MediaCodecUtils() {
    }

    public static boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            if (rXVideoCodecStandard.mimeType().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Map<String, String> getCodecProperties(RXVideoCodecStandard rXVideoCodecStandard, boolean z) {
        int i = C11411.$SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[rXVideoCodecStandard.ordinal()];
        if (i == 1 || i == 2) {
            return new HashMap();
        }
        if (i == 3) {
            return new HashMap();
        }
        qhg0.m174539a("Unsupported codec: ", rXVideoCodecStandard);
        return null;
    }

    private static int[] getTextureColorFormats() {
        return new int[]{2130708361};
    }

    @Nullable
    public static Integer selectColorFormat(int[] iArr, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        for (int i : iArr) {
            for (int i2 : codecCapabilities.colorFormats) {
                if (i2 == i) {
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }
}
