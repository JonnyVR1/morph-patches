package com.bytedance.realx.base;

import java.io.PrintWriter;
import java.io.StringWriter;
import p153l.p7f;
import p153l.wg3;

/* JADX INFO: loaded from: classes.dex */
public class RXLogging {
    private static Severity loggableSeverity = null;
    private static volatile boolean loggingEnabled = true;

    public enum Severity {
        LS_DEBUG,
        LS_TRACE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    @Deprecated
    public enum TraceLevel {
        TRACE_NONE(0),
        TRACE_STATEINFO(1),
        TRACE_WARNING(2),
        TRACE_ERROR(4),
        TRACE_CRITICAL(8),
        TRACE_APICALL(16),
        TRACE_DEFAULT(255),
        TRACE_MODULECALL(32),
        TRACE_MEMORY(256),
        TRACE_TIMER(512),
        TRACE_STREAM(1024),
        TRACE_DEBUG(2048),
        TRACE_INFO(4096),
        TRACE_TERSEINFO(8192),
        TRACE_ALL(p7f.COLOR_SPACE_UNCALIBRATED);

        public final int level;

        TraceLevel(int i) {
            this.level = i;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m5741d(String str, String str2) {
        log(Severity.LS_DEBUG, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m5743e(String str, String str2, Throwable th) {
        Severity severity = Severity.LS_ERROR;
        log(severity, str, str2);
        log(severity, str, th.toString());
        log(severity, str, getStackTraceString(th));
    }

    public static void enableLogThreads() {
        nativeEnableLogThreads();
    }

    public static void enableLogTimeStamps() {
        nativeEnableLogTimeStamps();
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        nativeEnableLogToDebugOutput(severity.ordinal());
        loggingEnabled = true;
    }

    private static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: i */
    public static void m5744i(String str, String str2) {
        log(Severity.LS_INFO, str, str2);
    }

    public static void log(Severity severity, String str, String str2) {
        if (str == null || str2 == null) {
            wg3.m206174a("Logging tag or message may not be null.");
        } else if (loggingEnabled) {
            nativeLog(severity.ordinal(), str, str2);
        }
    }

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i);

    private static native void nativeLog(int i, String str, String str2);

    /* JADX INFO: renamed from: t */
    public static void m5745t(String str, String str2) {
        log(Severity.LS_TRACE, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m5747w(String str, String str2, Throwable th) {
        Severity severity = Severity.LS_WARNING;
        log(severity, str, str2);
        log(severity, str, th.toString());
        log(severity, str, getStackTraceString(th));
    }

    /* JADX INFO: renamed from: e */
    public static void m5742e(String str, String str2) {
        log(Severity.LS_ERROR, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m5746w(String str, String str2) {
        log(Severity.LS_WARNING, str, str2);
    }
}
