package com.cmic.sso.sdk.p022e;

import android.content.Context;
import android.text.TextUtils;
import com.cmic.sso.sdk.C1316a;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.h */
/* JADX INFO: loaded from: classes.dex */
public class C1368h {

    /* JADX INFO: renamed from: a */
    private static String f5699a = null;

    /* JADX INFO: renamed from: b */
    private static String f5700b = null;

    /* JADX INFO: renamed from: c */
    private static long f5701c = 0;

    /* JADX INFO: renamed from: d */
    private static int f5702d = -1;

    /* JADX INFO: renamed from: a */
    public static void m7251a(final Context context, final String str, long j, final String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || j <= 0) {
            return;
        }
        C1363c.m7234b("PhoneScripUtils", "save phone scrip simKey = " + str2);
        f5699a = str;
        long j2 = j * 1000;
        f5701c = System.currentTimeMillis() + j2;
        C1363c.m7234b("sLifeTime", f5701c + "");
        f5700b = str2;
        f5702d = 2;
        if (!"operator".equals(str3)) {
            C1374n.m7299a(new C1374n.a() { // from class: com.cmic.sso.sdk.e.h.1
                @Override // com.cmic.sso.sdk.p022e.C1374n.a
                /* JADX INFO: renamed from: a */
                public void mo7029a() {
                    C1363c.m7234b("PhoneScripUtils", "start save scrip to sp in sub thread");
                    C1368h.m7256b(context, str, C1368h.f5701c, str2);
                }
            });
        } else if (j2 > 3600000) {
            f5701c = System.currentTimeMillis() + 3600000;
        } else {
            f5701c = System.currentTimeMillis() + j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m7256b(Context context, String str, long j, String str2) {
        String strM7224a = C1362b.m7224a(context, str);
        if (TextUtils.isEmpty(strM7224a)) {
            return;
        }
        C1371k.a aVarM7274a = C1371k.m7274a();
        aVarM7274a.m7286a("phonescripcache", strM7224a);
        aVarM7274a.m7285a("phonescripstarttime", j);
        aVarM7274a.m7284a("phonescripversion", 2);
        aVarM7274a.m7286a("pre_sim_key", str2);
        aVarM7274a.m7287b();
    }

    /* JADX INFO: renamed from: c */
    private static boolean m7257c() {
        if (TextUtils.isEmpty(f5699a)) {
            return !TextUtils.isEmpty(C1371k.m7281b("phonescripcache", "")) && m7253a(C1371k.m7272a("phonescripstarttime", 0L));
        }
        C1363c.m7234b("PhoneScripUtils", f5700b + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + f5701c);
        return m7253a(f5701c);
    }

    /* JADX INFO: renamed from: a */
    public static void m7252a(boolean z, boolean z2) {
        C1371k.a aVarM7274a = C1371k.m7274a();
        aVarM7274a.m7283a("phonescripstarttime");
        aVarM7274a.m7283a("phonescripcache");
        aVarM7274a.m7283a("pre_sim_key");
        aVarM7274a.m7283a("phonescripversion");
        if (z2) {
            aVarM7274a.m7282a();
        } else {
            aVarM7274a.m7287b();
        }
        if (z) {
            f5699a = null;
            f5700b = null;
            f5701c = 0L;
            f5702d = -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m7249a(Context context) {
        if (TextUtils.isEmpty(f5699a)) {
            String strM7281b = C1371k.m7281b("phonescripcache", "");
            if (TextUtils.isEmpty(strM7281b)) {
                C1363c.m7232a("PhoneScripUtils", "null");
                return null;
            }
            f5701c = C1371k.m7272a("phonescripstarttime", 0L);
            f5700b = C1371k.m7281b("pre_sim_key", "");
            f5702d = C1371k.m7270a("phonescripversion", -1);
            String strM7229b = C1362b.m7229b(context, strM7281b);
            f5699a = strM7229b;
            return strM7229b;
        }
        return f5699a;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7253a(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1363c.m7234b("PhoneScripUtils", j + "");
        C1363c.m7234b("PhoneScripUtils", jCurrentTimeMillis + "");
        return j - jCurrentTimeMillis > 10000;
    }

    /* JADX INFO: renamed from: a */
    public static long m7248a() {
        long jM7272a;
        long j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(f5699a)) {
            C1363c.m7234b("PhoneScripUtils", f5700b + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + f5701c);
            jM7272a = f5701c;
        } else {
            String strM7281b = C1371k.m7281b("phonescripcache", "");
            jM7272a = C1371k.m7272a("phonescripstarttime", 0L);
            if (TextUtils.isEmpty(strM7281b)) {
                j = 0;
            }
            return Math.max(j / 1000, 0L);
        }
        j = (jM7272a - jCurrentTimeMillis) - 10000;
        return Math.max(j / 1000, 0L);
    }

    /* JADX INFO: renamed from: a */
    private static int m7247a(String str) {
        String strM7281b;
        if (!TextUtils.isEmpty(f5700b)) {
            strM7281b = f5700b;
        } else {
            strM7281b = C1371k.m7281b("pre_sim_key", "");
            f5700b = strM7281b;
        }
        if (TextUtils.isEmpty(strM7281b)) {
            return 0;
        }
        return strM7281b.equals(str) ? 1 : 2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7254a(C1316a c1316a) {
        int iM7247a = m7247a(c1316a.m6968b("scripKey"));
        c1316a.m6961a("imsiState", iM7247a + "");
        StringBuilder sb = new StringBuilder("simState = ");
        sb.append(iM7247a);
        C1363c.m7234b("PhoneScripUtils", sb.toString());
        if (iM7247a == 0) {
            return false;
        }
        if (f5702d == -1) {
            f5702d = C1371k.m7270a("phonescripversion", -1);
        }
        if (f5702d != 2) {
            m7252a(true, false);
            C1362b.m7225a();
            C1363c.m7234b("PhoneScripUtils", "phoneScriptVersion change");
            return false;
        }
        if (iM7247a == 2) {
            m7252a(true, false);
            return false;
        }
        return m7257c();
    }
}
