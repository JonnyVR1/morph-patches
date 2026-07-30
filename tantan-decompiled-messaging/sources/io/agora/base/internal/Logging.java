package io.agora.base.internal;

import androidx.annotation.Nullable;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import p149l.ig3;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
public class Logging {
    private static final int AGORA_LOG_DEBUG = 2048;
    private static final int AGORA_LOG_ERROR = 4;
    private static final int AGORA_LOG_INFO = 1;
    private static final int AGORA_LOG_WARN = 2;

    @Nullable
    private static Loggable loggable;
    private static final Logger fallbackLogger = createFallbackLogger();
    private static volatile boolean loggingEnabled = true;
    private static Severity loggableSeverity = Severity.LS_INFO;
    private static int nativeLogLevel = 2055;

    /* JADX INFO: renamed from: io.agora.base.internal.Logging$1 */
    public static /* synthetic */ class C149431 {
        static final /* synthetic */ int[] $SwitchMap$io$agora$base$internal$Logging$Severity;

        static {
            int[] iArr = new int[Severity.values().length];
            $SwitchMap$io$agora$base$internal$Logging$Severity = iArr;
            try {
                iArr[Severity.LS_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$base$internal$Logging$Severity[Severity.LS_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$agora$base$internal$Logging$Severity[Severity.LS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum Severity {
        LS_SENSITIVE,
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
    public static void m87208d(String str, String str2) {
        if ((nativeLogLevel & 2048) != 0) {
            log(Severity.LS_VERBOSE, str, str2);
        }
    }

    public static void deleteInjectedLoggable() {
        loggable = null;
    }

    /* JADX INFO: renamed from: e */
    public static void m87210e(String str, String str2, Throwable th) {
        if ((nativeLogLevel & 4) != 0) {
            Severity severity = Severity.LS_ERROR;
            log(severity, str, str2);
            log(severity, str, th.toString());
            log(severity, str, getStackTraceString(th));
        }
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
        try {
            ThrowableExtension.printStackTrace(th, new PrintWriter(stringWriter));
            return stringWriter.toString();
        } catch (Throwable unused) {
            String message = th.getMessage();
            return message == null ? "" : message;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m87211i(String str, String str2) {
        if ((nativeLogLevel & 1) != 0) {
            log(Severity.LS_INFO, str, str2);
        }
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
        int i = C149431.$SwitchMap$io$agora$base$internal$Logging$Severity[severity.ordinal()];
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

    public static void setNativeLogLevel(int i) {
        nativeLogLevel = i;
    }

    /* JADX INFO: renamed from: v */
    public static void m87212v(String str, String str2) {
        if ((nativeLogLevel & 2048) != 0) {
            log(Severity.LS_VERBOSE, str, str2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m87214w(String str, String str2, Throwable th) {
        if ((nativeLogLevel & 2) != 0) {
            Severity severity = Severity.LS_WARNING;
            log(severity, str, str2);
            log(severity, str, th.toString());
            log(severity, str, getStackTraceString(th));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m87209e(String str, String str2) {
        if ((nativeLogLevel & 4) != 0) {
            log(Severity.LS_ERROR, str, str2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m87213w(String str, String str2) {
        if ((nativeLogLevel & 2) != 0) {
            log(Severity.LS_WARNING, str, str2);
        }
    }
}
