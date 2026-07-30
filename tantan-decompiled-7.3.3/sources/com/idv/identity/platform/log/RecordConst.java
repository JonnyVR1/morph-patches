package com.idv.identity.platform.log;

/* JADX INFO: loaded from: classes7.dex */
public class RecordConst {
    private static String ANDROID_VERSION = "";
    private static String CLIENT_ID = "";
    private static String CLIENT_VERSION = "";
    private static String DEVICE_ID = "";
    private static String LOG_FILE_NAME = "/sdcard/idv_identity_platform_log";
    private static String LOG_VERSION = "1.0.2";
    private static String NET_TYPE = "";
    private static String OS_VERSION = "";
    private static String PACKAGE_NAME = "";
    private static String PHONE_PRINT = "";
    private static String SCREEN_METRICS = "";
    private static String SESSION_ID = "";

    public static String getClientId() {
        return CLIENT_ID;
    }

    public static String getClientVersion() {
        return CLIENT_VERSION;
    }

    public static String getDeviceId() {
        return DEVICE_ID;
    }

    public static String getLogFilePath() {
        return LOG_FILE_NAME;
    }

    public static String getLogVersion() {
        return LOG_VERSION;
    }

    public static String getNetType() {
        return NET_TYPE;
    }

    public static String getOsVersion() {
        return OS_VERSION;
    }

    public static String getPackageName() {
        return PACKAGE_NAME;
    }

    public static String getPhonePrint() {
        return PHONE_PRINT;
    }

    public static String getScreenMetrics() {
        return SCREEN_METRICS;
    }

    public static String getSessionId() {
        return SESSION_ID;
    }

    public static void setClientId(String str) {
        CLIENT_ID = str;
    }

    public static void setClientVersion(String str) {
        CLIENT_VERSION = str;
    }

    public static void setDeviceId(String str) {
        DEVICE_ID = str;
    }

    public static void setLogFilePath(String str) {
        LOG_FILE_NAME = str;
    }

    public static void setLogVersion(String str) {
        LOG_VERSION = str;
    }

    public static void setNetType(String str) {
        NET_TYPE = str;
    }

    public static void setOsVersion(String str) {
        OS_VERSION = "android_version" + str;
    }

    public static void setPackageName(String str) {
        PACKAGE_NAME = str;
    }

    public static void setPhonePrint(String str) {
        PHONE_PRINT = str;
    }

    public static void setScreenMetrics(String str) {
        SCREEN_METRICS = str;
    }

    public static void setSessionId(String str) {
        SESSION_ID = str;
    }
}
