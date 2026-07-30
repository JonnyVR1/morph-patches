package com.tencent.cloud.p080ai.network.helper;

/* JADX INFO: loaded from: classes12.dex */
public class NetworkLogger {
    public static final String LOG_DEBUG = "[ai-network-debug]";
    public static final String LOG_ERROR = "[ai-network]";
    public static LOG_LEVEL logLevel = LOG_LEVEL.LEVEL_INFO;

    public enum LOG_LEVEL {
        LEVEL_VERBOSE,
        LEVEL_DEBUG,
        LEVEL_INFO,
        LEVEL_WARN,
        LEVEL_ERROR,
        LEVEL_NONE
    }

    public static void debug(String str, String str2, NetworkLoggerCallBack networkLoggerCallBack) {
        if (LOG_LEVEL.LEVEL_DEBUG.compareTo(logLevel) >= 0) {
            doLogInfo(true, str, str2, networkLoggerCallBack);
        }
    }

    public static void doLogInfo(boolean z, String str, String str2, NetworkLoggerCallBack networkLoggerCallBack) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(LOG_DEBUG);
        } else {
            sb.append(LOG_ERROR);
        }
        sb.append(str2);
        if (networkLoggerCallBack != null) {
            networkLoggerCallBack.logger(str, sb.toString());
        }
    }

    public static void error(String str, String str2, NetworkLoggerCallBack networkLoggerCallBack) {
        if (LOG_LEVEL.LEVEL_ERROR.compareTo(logLevel) >= 0) {
            doLogInfo(false, str, str2, networkLoggerCallBack);
        }
    }

    public static void info(String str, String str2, NetworkLoggerCallBack networkLoggerCallBack) {
        if (LOG_LEVEL.LEVEL_INFO.compareTo(logLevel) >= 0) {
            doLogInfo(true, str, str2, networkLoggerCallBack);
        }
    }

    public static void setLogLevel(LOG_LEVEL log_level) {
        logLevel = log_level;
    }
}
