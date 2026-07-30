package com.google.common.base;

import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import p149l.cc60;
import p149l.sf80;
import p149l.tk5;

/* JADX INFO: renamed from: com.google.common.base.b */
/* JADX INFO: loaded from: classes7.dex */
public final class C2655b {

    /* JADX INFO: renamed from: a */
    public static final Logger f10634a = Logger.getLogger(C2655b.class.getName());

    /* JADX INFO: renamed from: b */
    public static final cc60 f10635b = m15442d();

    /* JADX INFO: renamed from: com.google.common.base.b$b */
    public static final class b implements cc60 {
        public b() {
        }

        @Override // p149l.cc60
        /* JADX INFO: renamed from: a */
        public boolean mo15447a() {
            return true;
        }

        @Override // p149l.cc60
        public tk5 compile(String str) {
            return new JdkPattern(Pattern.compile(str));
        }
    }

    /* JADX INFO: renamed from: a */
    public static tk5 m15439a(String str) {
        sf80.m183894p(str);
        return f10635b.compile(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m15440b(String str) {
        if (m15445g(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static String m15441c(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    /* JADX INFO: renamed from: d */
    public static cc60 m15442d() {
        return new b();
    }

    /* JADX INFO: renamed from: e */
    public static String m15443e(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m15444f() {
        return f10635b.mo15447a();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m15445g(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: renamed from: h */
    public static long m15446h() {
        return System.nanoTime();
    }
}
