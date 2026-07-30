package io.requery.android.database.sqlite;

import p149l.jfd0;

/* JADX INFO: loaded from: classes2.dex */
public final class CloseGuard {
    private Throwable allocationSite;
    private static final CloseGuard NOOP = new CloseGuard();
    private static volatile boolean ENABLED = true;
    private static volatile Reporter REPORTER = new DefaultReporter();

    public static final class DefaultReporter implements Reporter {
        private DefaultReporter() {
        }

        @Override // io.requery.android.database.sqlite.CloseGuard.Reporter
        public void report(String str, Throwable th) {
        }
    }

    public interface Reporter {
        void report(String str, Throwable th);
    }

    private CloseGuard() {
    }

    public static CloseGuard get() {
        return !ENABLED ? NOOP : new CloseGuard();
    }

    public static Reporter getReporter() {
        return REPORTER;
    }

    public static void setEnabled(boolean z) {
        ENABLED = z;
    }

    public static void setReporter(Reporter reporter) {
        if (reporter != null) {
            REPORTER = reporter;
        } else {
            jfd0.m141176a("reporter == null");
        }
    }

    public void close() {
        this.allocationSite = null;
    }

    public void open(String str) {
        if (str == null) {
            jfd0.m141176a("closer == null");
            return;
        }
        if (this == NOOP || !ENABLED) {
            return;
        }
        this.allocationSite = new Throwable("Explicit termination method '" + str + "' not called");
    }

    public void warnIfOpen() {
        if (this.allocationSite == null || !ENABLED) {
            return;
        }
        REPORTER.report("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", this.allocationSite);
    }
}
