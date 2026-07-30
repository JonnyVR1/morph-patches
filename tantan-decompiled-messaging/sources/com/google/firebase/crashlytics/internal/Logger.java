package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class Logger {
    private int logLevel = 4;
    private final String tag;
    public static final String TAG = "FirebaseCrashlytics";
    static final Logger DEFAULT_LOGGER = new Logger(TAG);

    public Logger(String str) {
        this.tag = str;
    }

    private boolean canLog(int i) {
        return this.logLevel <= i || Log.isLoggable(this.tag, i);
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    /* JADX INFO: renamed from: d */
    public void m16722d(String str, Throwable th) {
        canLog(3);
    }

    /* JADX INFO: renamed from: e */
    public void m16724e(String str, Throwable th) {
        if (canLog(6)) {
            Log.e(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m16726i(String str, Throwable th) {
        canLog(4);
    }

    public void log(int i, String str, boolean z) {
        if (z || canLog(i)) {
            Log.println(i, this.tag, str);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m16728v(String str, Throwable th) {
        canLog(2);
    }

    /* JADX INFO: renamed from: w */
    public void m16730w(String str, Throwable th) {
        canLog(5);
    }

    /* JADX INFO: renamed from: d */
    public void m16721d(String str) {
        m16722d(str, null);
    }

    /* JADX INFO: renamed from: i */
    public void m16725i(String str) {
        m16726i(str, null);
    }

    /* JADX INFO: renamed from: v */
    public void m16727v(String str) {
        m16728v(str, null);
    }

    /* JADX INFO: renamed from: w */
    public void m16729w(String str) {
        m16730w(str, null);
    }

    /* JADX INFO: renamed from: e */
    public void m16723e(String str) {
        m16724e(str, null);
    }

    public void log(int i, String str) {
        log(i, str, false);
    }
}
