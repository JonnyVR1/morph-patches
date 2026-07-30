package com.momo.rtcbase;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import p149l.ig3;
import p149l.j6f;

/* JADX INFO: loaded from: classes8.dex */
public class Logging {
    private static final Logger fallbackLogger = createFallbackLogger();
    private static Loggable loggable;
    private static Severity loggableSeverity;
    private static volatile boolean loggingEnabled;

    /* JADX INFO: renamed from: com.momo.rtcbase.Logging$1 */
    public static /* synthetic */ class C41381 {
        static final /* synthetic */ int[] $SwitchMap$com$momo$rtcbase$Logging$Severity;

        static {
            int[] iArr = new int[Severity.values().length];
            $SwitchMap$com$momo$rtcbase$Logging$Severity = iArr;
            try {
                iArr[Severity.LS_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$momo$rtcbase$Logging$Severity[Severity.LS_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$momo$rtcbase$Logging$Severity[Severity.LS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum Severity {
        LS_VERBOSE,
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
        TRACE_ALL(j6f.COLOR_SPACE_UNCALIBRATED);

        public final int level;

        TraceLevel(int i) {
            this.level = i;
        }
    }

    private static Logger createFallbackLogger() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    /* JADX INFO: renamed from: d */
    public static void m20197d(String str, String str2) {
        log(Severity.LS_INFO, str, str2);
    }

    public static void deleteInjectedLoggable() {
        loggable = null;
    }

    /* JADX INFO: renamed from: e */
    public static void m20199e(String str, String str2, Throwable th) {
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
        if (loggable != null) {
            throw new IllegalStateException("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
        }
        nativeEnableLogToDebugOutput(severity.ordinal());
        loggingEnabled = true;
    }

    @Deprecated
    public static void enableTracing(String str, EnumSet<TraceLevel> enumSet) {
    }

    private static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void injectLoggable(Loggable loggable2, Severity severity) {
        if (loggable2 != null) {
            loggable = loggable2;
            loggableSeverity = severity;
        }
    }

    public static void log(Severity severity, String str, String str2) {
        Level level;
        if (str == null || str2 == null) {
            ig3.m135964a("Logging tag or message may not be null.");
            return;
        }
        if (loggable != null) {
            if (severity.ordinal() < loggableSeverity.ordinal()) {
                return;
            }
            loggable.onLogMessage(str2, severity, str);
            return;
        }
        if (loggingEnabled) {
            nativeLog(severity.ordinal(), str, str2);
            return;
        }
        int i = C41381.$SwitchMap$com$momo$rtcbase$Logging$Severity[severity.ordinal()];
        if (i == 1) {
            level = Level.SEVERE;
        } else if (i != 2) {
            level = i != 3 ? Level.FINE : Level.INFO;
        } else {
            level = Level.WARNING;
        }
        fallbackLogger.log(level, str + ": " + str2);
    }

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i);

    private static native void nativeLog(int i, String str, String str2);

    /* JADX INFO: renamed from: v */
    public static void m20200v(String str, String str2) {
        log(Severity.LS_VERBOSE, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m20202w(String str, String str2, Throwable th) {
        Severity severity = Severity.LS_WARNING;
        log(severity, str, str2);
        log(severity, str, th.toString());
        log(severity, str, getStackTraceString(th));
    }

    /* JADX INFO: renamed from: e */
    public static void m20198e(String str, String str2) {
        log(Severity.LS_ERROR, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m20201w(String str, String str2) {
        log(Severity.LS_WARNING, str, str2);
    }
}
