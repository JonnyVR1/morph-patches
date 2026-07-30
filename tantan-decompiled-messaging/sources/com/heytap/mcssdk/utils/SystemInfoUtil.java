package com.heytap.mcssdk.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.SystemProperties;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"DefaultLocale"})
public class SystemInfoUtil {
    private static final String MODEL_NULL = "0";
    private static final int SDK_INT_21 = 21;

    public static String getAndroidVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getCarrierName(Context context) {
        String lowerCase = getOperator(context).toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "china net":
            case "中国电信":
            case "chinanet":
                return "China Net";
            case "chinamobile":
            case "china mobile":
            case "中国移动":
                return "China Mobile";
            case "chinaunicom":
            case "中国联通":
            case "china unicom":
                return "China Unicom";
            default:
                return "none";
        }
    }

    public static String getModel() {
        String str = Build.MODEL;
        if (!isEmpty(str)) {
            return str.toUpperCase();
        }
        LogUtil.m17475w("No MODEL.");
        return "0";
    }

    public static String getOperator(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? telephonyManager.getNetworkOperatorName() : "";
        } catch (Exception e) {
            LogUtil.m17467e(e);
            return "";
        }
    }

    public static String getRomVersion() {
        return SystemProperties.get("ro.build.display.id", "");
    }

    private static boolean isEmpty(String str) {
        return TextUtils.isEmpty(str) || "null".equals(str);
    }
}
