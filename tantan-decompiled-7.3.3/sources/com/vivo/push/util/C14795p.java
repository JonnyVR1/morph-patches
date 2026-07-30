package com.vivo.push.util;

import android.content.Context;

/* JADX INFO: renamed from: com.vivo.push.util.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C14795p {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC14794o f61977a = new C14793n();

    /* JADX INFO: renamed from: b */
    private static boolean f61978b;

    /* JADX INFO: renamed from: c */
    private static boolean f61979c;

    static {
        m86188b();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86185a() {
        return f61978b && f61979c;
    }

    /* JADX INFO: renamed from: b */
    private static void m86188b() {
        f61978b = C14805z.m86233b("persist.sys.log.ctrl", "no").equals("yes");
    }

    /* JADX INFO: renamed from: c */
    public static int m86190c(String str, String str2) {
        return f61977a.mo86175c(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static int m86192d(String str, String str2) {
        return f61977a.mo86177d(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static int m86193e(String str, String str2) {
        return f61977a.mo86178e(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m86191c(Context context, String str) {
        f61977a.mo86176c(context, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m86184a(boolean z) {
        m86188b();
        f61979c = z;
    }

    /* JADX INFO: renamed from: a */
    public static int m86179a(String str, String str2) {
        return f61977a.mo86167a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static int m86181a(String str, Throwable th) {
        return f61977a.mo86169a(str, th);
    }

    /* JADX INFO: renamed from: a */
    public static int m86180a(String str, String str2, Throwable th) {
        return f61977a.mo86168a(str, str2, th);
    }

    /* JADX INFO: renamed from: a */
    public static String m86182a(Throwable th) {
        return f61977a.mo86170a(th);
    }

    /* JADX INFO: renamed from: b */
    public static int m86186b(String str, String str2) {
        return f61977a.mo86172b(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m86183a(Context context, String str) {
        f61977a.mo86171a(context, str);
    }

    /* JADX INFO: renamed from: b */
    public static int m86187b(String str, String str2, Throwable th) {
        return f61977a.mo86173b(str, str2, th);
    }

    /* JADX INFO: renamed from: b */
    public static void m86189b(Context context, String str) {
        f61977a.mo86174b(context, str);
    }
}
