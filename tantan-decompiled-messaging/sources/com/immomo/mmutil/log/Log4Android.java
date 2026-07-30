package com.immomo.mmutil.log;

import com.cosmos.mdlog.MDLog;
import java.io.BufferedWriter;
import java.io.File;
import p149l.ev0;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class Log4Android {

    /* JADX INFO: renamed from: g */
    private static Log4Android f12966g;

    /* JADX INFO: renamed from: a */
    private String f12967a = "momo";

    /* JADX INFO: renamed from: b */
    private String f12968b = "";

    /* JADX INFO: renamed from: c */
    private String f12969c = "";

    /* JADX INFO: renamed from: d */
    private File f12970d = null;

    /* JADX INFO: renamed from: e */
    private BufferedWriter f12971e = null;

    /* JADX INFO: renamed from: f */
    private boolean f12972f = ev0.f93301b;

    public enum LOG_LEVEL {
        LOG_INFO,
        LOG_DEBUG,
        LOG_ERROR,
        LOG_WARNING,
        LOG_VERBOSE
    }

    @Deprecated
    public Log4Android() {
    }

    /* JADX INFO: renamed from: f */
    public static Log4Android m18417f() {
        if (f12966g == null) {
            synchronized (Log4Android.class) {
                try {
                    if (f12966g == null) {
                        f12966g = new Log4Android();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12966g;
    }

    /* JADX INFO: renamed from: a */
    public void m18418a(Object obj) {
        m18419b(this.f12967a, obj);
    }

    /* JADX INFO: renamed from: b */
    public void m18419b(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12968b);
        sb.append(obj != null ? obj.toString() : "null");
        sb.append(this.f12969c);
        MDLog.m7389d(str, sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public void m18420c(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12968b);
        sb.append(str2 != null ? str2.toString() : "null");
        sb.append(this.f12969c);
        MDLog.printErrStackTrace(str, th, "%s", sb.toString());
    }

    /* JADX INFO: renamed from: d */
    public void m18421d(String str, Throwable th) {
        m18420c(this.f12967a, str, th);
    }

    /* JADX INFO: renamed from: e */
    public void m18422e(Throwable th) {
        m18421d(this.f12967a, th);
    }

    /* JADX INFO: renamed from: g */
    public void m18423g(Object obj) {
        m18424h(this.f12967a, obj);
    }

    /* JADX INFO: renamed from: h */
    public void m18424h(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12968b);
        sb.append(obj != null ? obj.toString() : "null");
        sb.append(this.f12969c);
        MDLog.m7395i(str, sb.toString());
    }
}
