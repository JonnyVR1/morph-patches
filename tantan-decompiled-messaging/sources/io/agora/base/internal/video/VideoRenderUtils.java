package io.agora.base.internal.video;

import android.content.Context;
import android.graphics.ColorSpace;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;

/* JADX INFO: loaded from: classes2.dex */
class VideoRenderUtils {
    private static final String TAG = "VideoRenderUtils";

    public static class ColorSpaceNamed {
        public static final int BT2020 = 5;
        public static final int BT709 = 4;
        public static final int DCI_P3 = 6;
        public static final int DISPLAY_P3 = 7;
        public static final int SRGB = 0;
    }

    public static class HDRType {
        public static final int HDR_TYPE_DOLBY_VISION = 1;
        public static final int HDR_TYPE_HDR10 = 2;
        public static final int HDR_TYPE_HDR10_PLUS = 4;
        public static final int HDR_TYPE_HLG = 3;
    }

    public static float getDesiredMaxAverageLuminance() {
        WindowManager windowManager;
        Display defaultDisplay;
        Display.HdrCapabilities hdrCapabilities;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService(BLiveBottomPopupStyleTypeEnum.window)) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null || (hdrCapabilities = defaultDisplay.getHdrCapabilities()) == null) {
            return -1.0f;
        }
        float desiredMaxAverageLuminance = hdrCapabilities.getDesiredMaxAverageLuminance();
        Logging.m87211i(TAG, "hdrcap:average luma:" + desiredMaxAverageLuminance);
        return desiredMaxAverageLuminance;
    }

    public static float getDesiredMaxLuminance() {
        WindowManager windowManager;
        Display defaultDisplay;
        Display.HdrCapabilities hdrCapabilities;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService(BLiveBottomPopupStyleTypeEnum.window)) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null || (hdrCapabilities = defaultDisplay.getHdrCapabilities()) == null) {
            return -1.0f;
        }
        float desiredMaxLuminance = hdrCapabilities.getDesiredMaxLuminance();
        Logging.m87211i(TAG, "hdrcap:max luma:" + desiredMaxLuminance);
        return desiredMaxLuminance;
    }

    public static float getDesiredMinLuminance() {
        WindowManager windowManager;
        Display defaultDisplay;
        Display.HdrCapabilities hdrCapabilities;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService(BLiveBottomPopupStyleTypeEnum.window)) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null || (hdrCapabilities = defaultDisplay.getHdrCapabilities()) == null) {
            return -1.0f;
        }
        float desiredMinLuminance = hdrCapabilities.getDesiredMinLuminance();
        Logging.m87211i(TAG, "hdrcap:min luma:" + desiredMinLuminance);
        return desiredMinLuminance;
    }

    @CalledByNative
    public static int getPreferredWideGamutColorSpaceId() {
        WindowManager windowManager;
        Display defaultDisplay;
        ColorSpace preferredWideGamutColorSpace;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (Build.VERSION.SDK_INT < 29 || applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService(BLiveBottomPopupStyleTypeEnum.window)) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null || (preferredWideGamutColorSpace = defaultDisplay.getPreferredWideGamutColorSpace()) == null) {
            return -1;
        }
        int id = preferredWideGamutColorSpace.getId();
        Logging.m87211i(TAG, "hdrcap:color space id:" + id);
        return id;
    }

    @CalledByNative
    public static boolean isSupportedHDRByType(int i) {
        Display defaultDisplay;
        Display.HdrCapabilities hdrCapabilities;
        WindowManager windowManager;
        Display defaultDisplay2;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26 && (windowManager = (WindowManager) applicationContext.getSystemService(BLiveBottomPopupStyleTypeEnum.window)) != null && (defaultDisplay2 = windowManager.getDefaultDisplay()) != null && !defaultDisplay2.isHdr()) {
            Logging.m87211i(TAG, "hdrcap:ishdr:false");
            return false;
        }
        WindowManager windowManager2 = (WindowManager) applicationContext.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        if (windowManager2 != null && (defaultDisplay = windowManager2.getDefaultDisplay()) != null && (hdrCapabilities = defaultDisplay.getHdrCapabilities()) != null) {
            for (int i2 = 0; i2 < hdrCapabilities.getSupportedHdrTypes().length; i2++) {
                Logging.m87211i(TAG, "hdrcap:" + hdrCapabilities.getSupportedHdrTypes()[i2]);
                if (hdrCapabilities.getSupportedHdrTypes()[i2] == i) {
                    Logging.m87211i(TAG, "hdrcap: got:" + hdrCapabilities.getSupportedHdrTypes()[i2]);
                    return true;
                }
            }
        }
        return false;
    }

    @CalledByNative
    public static boolean isWideColorGamut() {
        WindowManager windowManager;
        Display defaultDisplay;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (Build.VERSION.SDK_INT < 26 || applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService(BLiveBottomPopupStyleTypeEnum.window)) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return false;
        }
        boolean zIsWideColorGamut = defaultDisplay.isWideColorGamut();
        Logging.m87211i(TAG, "hdrcap:is wide:" + zIsWideColorGamut);
        return zIsWideColorGamut;
    }
}
