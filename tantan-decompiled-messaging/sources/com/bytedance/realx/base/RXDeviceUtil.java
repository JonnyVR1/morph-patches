package com.bytedance.realx.base;

import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

/* JADX INFO: loaded from: classes.dex */
public class RXDeviceUtil {
    private static final String KEY_COLOROS_VERSION_NAME = "ro.build.version.opporom";
    private static final String KEY_EMUI_VERSION_NAME = "ro.build.version.emui";
    private static final String KEY_FLYME_VERSION_NAME = "ro.build.display.id";
    private static final String KEY_HARMONYOS_VERSION_NAME = "hw_sc.build.platform.version";
    private static final String KEY_MAGICUI_VERSION = "ro.build.version.magic";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    private static final String KEY_NUBIA_VERSION_CODE = "ro.build.nubia.rom.code";
    private static final String KEY_NUBIA_VERSION_NAME = "ro.build.nubia.rom.name";
    private static final String KEY_ONEPLUS_VERSION_NAME = "ro.rom.version";
    private static final String KEY_VIVO_VERSION = "ro.vivo.os.version";
    private static final String KEY_VIVO_VERSION_NAME = "ro.vivo.os.name";
    private static String customOS = "";
    private static String customOSVersion = "";

    public static String deleteSpaceAndToUpperCase(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replaceAll(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "").toUpperCase();
    }

    public static String getCustomOSVersion(String str) {
        if (TextUtils.isEmpty(customOS)) {
            setCustomOSInfo(str);
        }
        return customOSVersion;
    }

    public static String getPhoneSystem(String str) {
        if (TextUtils.isEmpty(customOS)) {
            setCustomOSInfo(str);
        }
        return customOS + "_" + customOSVersion;
    }

    private static String getSystemPropertyValue(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static boolean isHarmonyOS() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return !TextUtils.isEmpty((String) cls.getMethod("getOsBrand", null).invoke(cls, null));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean isMagicUI() {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ec, code lost:
    
        if (r6.equals("XIAOMI") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0101, code lost:
    
        if (r6.equals("REALME") != false) goto L59;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void setCustomOSInfo(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.base.RXDeviceUtil.setCustomOSInfo(java.lang.String):void");
    }
}
