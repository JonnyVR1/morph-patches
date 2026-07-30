package com.p074ss.bytertc.engine.utils;

import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p153l.m31;

/* JADX INFO: loaded from: classes11.dex */
public class LogUtil {
    private static final String DEBUG_LEVEL = "DEBUG";
    public static final String DIR_TAIL = "logs";
    private static final String ERROR_LEVEL = "ERROR";
    private static final String INFO_LEVEL = "INFO";
    private static final String LOG_TAG = "ByteRTC";
    private static final String WARN_LEVEL = "WARNING";
    private static AtomicReference<ILoggerSink> sLoggerSink = new AtomicReference<>();
    private static String sDeviceID = null;
    private static LogLevel sLogLevel = LogLevel.LOG_LEVEL_INFO;
    private static String sLogDir = null;

    public interface ILoggerSink {
        void onLoggerMessage(LogLevel logLevel, String str, Throwable th);
    }

    public enum LogLevel {
        LOG_LEVEL_TRACE,
        LOG_LEVEL_DEBUG,
        LOG_LEVEL_INFO,
        LOG_LEVEL_WARNING,
        LOG_LEVEL_ERROR
    }

    /* JADX INFO: renamed from: d */
    public static void m82083d(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_DEBUG;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, String.format("[%s:%s]:%s", LOG_TAG, str, String.format("[msg:%s]", str2)), null);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m82084e(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_ERROR;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, String.format("[%s:%s]:%s", LOG_TAG, str, String.format("[msg:%s]", str2)), null);
        }
    }

    public static String getDeviceID() {
        return sDeviceID;
    }

    public static String getLogDir(Context context) {
        String str = sLogDir;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getExternalFilesDir(null));
        String str2 = File.separator;
        sb.append(str2);
        sb.append("RTCEngine");
        sb.append(str2);
        sb.append("Log");
        sb.append(str2);
        sb.append(DIR_TAIL);
        String string = sb.toString();
        sLogDir = string;
        return string;
    }

    public static LogLevel getLogLevel() {
        return sLogLevel;
    }

    private static ILoggerSink getLoggerSink() {
        return sLoggerSink.get();
    }

    /* JADX INFO: renamed from: i */
    public static void m82086i(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_INFO;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, String.format("[%s:%s]:%s", LOG_TAG, str, String.format("[msg:%s]", str2)), null);
        }
    }

    private static void notifyLoggerSinks(LogLevel logLevel, String str, Throwable th) {
        ILoggerSink loggerSink;
        if (sLoggerSink == null || (loggerSink = getLoggerSink()) == null) {
            return;
        }
        loggerSink.onLoggerMessage(logLevel, str, th);
    }

    public static void setDebug(boolean z) {
    }

    public static void setDeviceID(String str) {
        sDeviceID = str;
    }

    public static void setLogDir(String str) {
        sLogDir = str + File.separator + DIR_TAIL;
    }

    public static void setLogLevel(LogLevel logLevel) {
        sLogLevel = logLevel;
    }

    public static void setLoggerSink(ILoggerSink iLoggerSink) {
        if (iLoggerSink != null) {
            sLoggerSink.set(iLoggerSink);
        } else {
            m31.m156916a(sLoggerSink, getLoggerSink(), null);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m82087w(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_WARNING;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, String.format("[%s:%s]:%s", LOG_TAG, str, String.format("[msg:%s]", str2)), null);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m82085e(String str, String str2, Throwable th) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_ERROR;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, String.format("[%s:%s]:%s", LOG_TAG, str, String.format("[msg:%s]", str2)), th);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m82088w(String str, String str2, Throwable th) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_WARNING;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, String.format("[%s:%s]:%s", LOG_TAG, str, String.format("[msg:%s]", str2)), th);
        }
    }
}
