package io.agora.base.internal.video;

import android.os.Build;
import io.agora.base.internal.Logging;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class BitrateAdjusterHelper {
    private static final String TAG = "BitrateAdjusterHelper";
    private static final String[] H264_HW_QCOM_EXCEPTION_MODELS = {"mi note lte", "redmi note 4x", "1605-a01", "aosp on hammerhead", "lm-x210", "oppo r9s"};
    private static final String[] MTK_NO_ADJUSTMENT_MODELS = {"vivo y83a", "vivo x21i", "vivo X21i A"};
    private static final String[] EXYNOS_CONSTANT_UNIT_BITRATE_CHIPS = {"exynos 5 hexa", "exynos 7 octa"};
    private static final String[] MTK_CONSTANT_UNIT_BITRATE_CHIPS = {"helio x25", "helio p20"};
    private static final String[] HISI_CONSTANT_UNIT_BITRATE_CHIPS = {"hi3650", "hi3660", "hi6250", "kirin 710", "kirin 810", "kirin8000", "kirin 980", "kirin 9000e", "kirin985", "kirin990", "kirin990e", "vendor kirin820 kirin820", "vendor kirin970 kirin970", "vendor kirin985 kirin985", "vendor kirin990 kirin990"};
    private static final String[] UNISOC_CONSTANT_UNIT_BITRATE_CHIPS = {"unisoc t610", "unisoc sc9832e"};

    public static VideoEncoder.EncoderStyle getEncoderStyle(String str, String str2, boolean z) {
        VideoEncoder.EncoderStyle encoderStyle = new VideoEncoder.EncoderStyle();
        Logging.m87211i(TAG, "getEncoderStyle codecName: " + str + ", cpuName: " + str2 + ", rebootScheme: " + z);
        if (!z) {
            if (Arrays.asList(EXYNOS_CONSTANT_UNIT_BITRATE_CHIPS).contains(str2)) {
                Logging.m87211i(TAG, "constant unit bitrate for exynos, cpuName: " + str2);
                encoderStyle.bitrateAdjustment = 4;
                return encoderStyle;
            }
            if (Arrays.asList(MTK_CONSTANT_UNIT_BITRATE_CHIPS).contains(str2)) {
                Logging.m87211i(TAG, "constant unit bitrate for mtk, cpuName: " + str2);
                encoderStyle.bitrateAdjustment = 4;
                return encoderStyle;
            }
            if (Arrays.asList(HISI_CONSTANT_UNIT_BITRATE_CHIPS).contains(str2)) {
                Logging.m87211i(TAG, "constant unit bitrate for hisi, cpuName: " + str2);
                encoderStyle.bitrateAdjustment = 4;
                return encoderStyle;
            }
            if (!Arrays.asList(UNISOC_CONSTANT_UNIT_BITRATE_CHIPS).contains(str2)) {
                encoderStyle.bitrateAdjustment = 0;
                return encoderStyle;
            }
            Logging.m87211i(TAG, "constant unit bitrate for unisoc, cpuName: " + str2);
            encoderStyle.bitrateAdjustment = 4;
            return encoderStyle;
        }
        if (str.startsWith("OMX.qcom.") || str.toLowerCase().contains("c2.qti.")) {
            List listAsList = Arrays.asList(H264_HW_QCOM_EXCEPTION_MODELS);
            String str3 = Build.MODEL;
            if (listAsList.contains(str3.toLowerCase())) {
                Logging.m87213w(TAG, "Qcom Exception Model: " + str3);
                encoderStyle.isNeedResetWhenDownBps = true;
            }
            encoderStyle.highProfileSupported = true;
            return encoderStyle;
        }
        if (str.startsWith("OMX.MTK.") || str.toLowerCase().startsWith("c2.mtk.")) {
            StringBuilder sb = new StringBuilder("MTK hardware: ");
            String str4 = Build.HARDWARE;
            sb.append(str4);
            Logging.m87212v(TAG, sb.toString());
            if (str4.equalsIgnoreCase("mt6763") || str4.equalsIgnoreCase("mt6763t")) {
                encoderStyle.highProfileSupported = true;
                return encoderStyle;
            }
            if (Arrays.asList(MTK_NO_ADJUSTMENT_MODELS).contains(Build.MODEL)) {
                encoderStyle.highProfileSupported = true;
                return encoderStyle;
            }
            if (str4.equalsIgnoreCase("mt6735")) {
                encoderStyle.bitrateAdjustment = 2;
                encoderStyle.highProfileSupported = false;
                return encoderStyle;
            }
            encoderStyle.bitrateAdjustment = 2;
            encoderStyle.highProfileSupported = true;
            return encoderStyle;
        }
        if (str.startsWith("OMX.Exynos.") || str.toLowerCase().startsWith("c2.exynos.")) {
            String str5 = Build.MODEL;
            if (str5.equalsIgnoreCase("MX4 Pro")) {
                encoderStyle.bitrateAdjustment = 2;
                encoderStyle.highProfileSupported = false;
                return encoderStyle;
            }
            if (Build.MANUFACTURER.equalsIgnoreCase(HardwareEarMonitorUtils.MANUFACTURER_VIVO) && str5.equalsIgnoreCase("V1938CT")) {
                encoderStyle.bitrateAdjustment = 2;
                encoderStyle.highProfileSupported = true;
                return encoderStyle;
            }
            if (Build.VERSION.SDK_INT > 28) {
                encoderStyle.bitrateAdjustment = 2;
                encoderStyle.highProfileSupported = true;
                return encoderStyle;
            }
            encoderStyle.bitrateAdjustment = 1;
            encoderStyle.highProfileSupported = true;
            return encoderStyle;
        }
        if (str.startsWith("OMX.IMG.TOPAZ.") || str.toLowerCase().startsWith("c2.img.")) {
            if (Build.HARDWARE.equalsIgnoreCase("hi6250")) {
                encoderStyle.bitrateAdjustment = 2;
                return encoderStyle;
            }
            encoderStyle.highProfileSupported = false;
            encoderStyle.bitrateAdjustment = 1;
            return encoderStyle;
        }
        if (str.startsWith("OMX.hisi.") || str.toLowerCase().startsWith("c2.hisi.")) {
            encoderStyle.highProfileSupported = false;
            encoderStyle.bitrateAdjustment = 2;
            return encoderStyle;
        }
        if (str.startsWith("OMX.k3.") || str.toLowerCase().startsWith("c2.k3.")) {
            encoderStyle.bitrateAdjustment = 1;
            encoderStyle.highProfileSupported = true;
            return encoderStyle;
        }
        if (str.startsWith("OMX.amlogic.") || str.toLowerCase().startsWith("c2.amlogic.")) {
            Logging.m87212v(TAG, "getChipProperties for amlogic");
            encoderStyle.bitrateAdjustment = 1;
            encoderStyle.highProfileSupported = false;
            return encoderStyle;
        }
        if (str.startsWith("OMX.rk.") || str.toLowerCase().startsWith("c2.rk.")) {
            encoderStyle.bitrateAdjustment = 1;
            encoderStyle.highProfileSupported = false;
            return encoderStyle;
        }
        Logging.m87212v(TAG, "getChipProperties from unsupported chip list");
        encoderStyle.highProfileSupported = true;
        return encoderStyle;
    }
}
