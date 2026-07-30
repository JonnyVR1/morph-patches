package com.google.common.base;

import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import p153l.hk60;
import p153l.wl5;
import p153l.xn80;

/* JADX INFO: renamed from: com.google.common.base.b */
/* JADX INFO: loaded from: classes7.dex */
public final class C2678b {

    /* JADX INFO: renamed from: a */
    public static final Logger f10671a = Logger.getLogger(C2678b.class.getName());

    /* JADX INFO: renamed from: b */
    public static final hk60 f10672b = m15496d();

    /* JADX INFO: renamed from: com.google.common.base.b$b */
    public static final class b implements hk60 {
        public b() {
        }

        @Override // p153l.hk60
        /* JADX INFO: renamed from: a */
        public boolean mo15501a() {
            return true;
        }

        @Override // p153l.hk60
        public wl5 compile(String str) {
            return new JdkPattern(Pattern.compile(str));
        }
    }

    /* JADX INFO: renamed from: a */
    public static wl5 m15493a(String str) {
        xn80.m212111p(str);
        return f10672b.compile(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m15494b(String str) {
        if (m15499g(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static String m15495c(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    /* JADX INFO: renamed from: d */
    public static hk60 m15496d() {
        return new b();
    }

    /* JADX INFO: renamed from: e */
    public static String m15497e(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m15498f() {
        return f10672b.mo15501a();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m15499g(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: renamed from: h */
    public static long m15500h() {
        return System.nanoTime();
    }
}
