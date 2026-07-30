package com.immomo.mmutil.log;

import com.cosmos.mdlog.MDLog;
import java.io.BufferedWriter;
import java.io.File;
import p153l.jv0;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class Log4Android {

    /* JADX INFO: renamed from: g */
    private static Log4Android f13671g;

    /* JADX INFO: renamed from: a */
    private String f13672a = "momo";

    /* JADX INFO: renamed from: b */
    private String f13673b = "";

    /* JADX INFO: renamed from: c */
    private String f13674c = "";

    /* JADX INFO: renamed from: d */
    private File f13675d = null;

    /* JADX INFO: renamed from: e */
    private BufferedWriter f13676e = null;

    /* JADX INFO: renamed from: f */
    private boolean f13677f = jv0.f122756b;

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

    /* JADX INFO: renamed from: d */
    public static Log4Android m19406d() {
        if (f13671g == null) {
            synchronized (Log4Android.class) {
                try {
                    if (f13671g == null) {
                        f13671g = new Log4Android();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13671g;
    }

    /* JADX INFO: renamed from: a */
    public void m19407a(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13673b);
        sb.append(str2 != null ? str2.toString() : "null");
        sb.append(this.f13674c);
        MDLog.printErrStackTrace(str, th, "%s", sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public void m19408b(String str, Throwable th) {
        m19407a(this.f13672a, str, th);
    }

    /* JADX INFO: renamed from: c */
    public void m19409c(Throwable th) {
        m19408b(this.f13672a, th);
    }

    /* JADX INFO: renamed from: e */
    public void m19410e(Object obj) {
        m19411f(this.f13672a, obj);
    }

    /* JADX INFO: renamed from: f */
    public void m19411f(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13673b);
        sb.append(obj != null ? obj.toString() : "null");
        sb.append(this.f13674c);
        MDLog.m7449i(str, sb.toString());
    }
}
