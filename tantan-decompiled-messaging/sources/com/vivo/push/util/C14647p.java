package com.vivo.push.util;

import android.content.Context;

/* JADX INFO: renamed from: com.vivo.push.util.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C14647p {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC14646o f61130a = new C14645n();

    /* JADX INFO: renamed from: b */
    private static boolean f61131b;

    /* JADX INFO: renamed from: c */
    private static boolean f61132c;

    static {
        m85017b();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85014a() {
        return f61131b && f61132c;
    }

    /* JADX INFO: renamed from: b */
    private static void m85017b() {
        f61131b = C14657z.m85062b("persist.sys.log.ctrl", "no").equals("yes");
    }

    /* JADX INFO: renamed from: c */
    public static int m85019c(String str, String str2) {
        return f61130a.mo85004c(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static int m85021d(String str, String str2) {
        return f61130a.mo85006d(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static int m85022e(String str, String str2) {
        return f61130a.mo85007e(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m85020c(Context context, String str) {
        f61130a.mo85005c(context, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m85013a(boolean z) {
        m85017b();
        f61132c = z;
    }

    /* JADX INFO: renamed from: a */
    public static int m85008a(String str, String str2) {
        return f61130a.mo84996a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static int m85010a(String str, Throwable th) {
        return f61130a.mo84998a(str, th);
    }

    /* JADX INFO: renamed from: a */
    public static int m85009a(String str, String str2, Throwable th) {
        return f61130a.mo84997a(str, str2, th);
    }

    /* JADX INFO: renamed from: a */
    public static String m85011a(Throwable th) {
        return f61130a.mo84999a(th);
    }

    /* JADX INFO: renamed from: b */
    public static int m85015b(String str, String str2) {
        return f61130a.mo85001b(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m85012a(Context context, String str) {
        f61130a.mo85000a(context, str);
    }

    /* JADX INFO: renamed from: b */
    public static int m85016b(String str, String str2, Throwable th) {
        return f61130a.mo85002b(str, str2, th);
    }

    /* JADX INFO: renamed from: b */
    public static void m85018b(Context context, String str) {
        f61130a.mo85003b(context, str);
    }
}
