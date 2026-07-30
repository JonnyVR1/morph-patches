package com.cmic.sso.sdk.p023e;

import android.content.Context;
import android.text.TextUtils;
import com.cmic.sso.sdk.C1339a;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.h */
/* JADX INFO: loaded from: classes.dex */
public class C1391h {

    /* JADX INFO: renamed from: a */
    private static String f5736a = null;

    /* JADX INFO: renamed from: b */
    private static String f5737b = null;

    /* JADX INFO: renamed from: c */
    private static long f5738c = 0;

    /* JADX INFO: renamed from: d */
    private static int f5739d = -1;

    /* JADX INFO: renamed from: a */
    public static void m7305a(final Context context, final String str, long j, final String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || j <= 0) {
            return;
        }
        C1386c.m7288b("PhoneScripUtils", "save phone scrip simKey = " + str2);
        f5736a = str;
        long j2 = j * 1000;
        f5738c = System.currentTimeMillis() + j2;
        C1386c.m7288b("sLifeTime", f5738c + "");
        f5737b = str2;
        f5739d = 2;
        if (!"operator".equals(str3)) {
            C1397n.m7353a(new C1397n.a() { // from class: com.cmic.sso.sdk.e.h.1
                @Override // com.cmic.sso.sdk.p023e.C1397n.a
                /* JADX INFO: renamed from: a */
                public void mo7083a() {
                    C1386c.m7288b("PhoneScripUtils", "start save scrip to sp in sub thread");
                    C1391h.m7310b(context, str, C1391h.f5738c, str2);
                }
            });
        } else if (j2 > 3600000) {
            f5738c = System.currentTimeMillis() + 3600000;
        } else {
            f5738c = System.currentTimeMillis() + j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m7310b(Context context, String str, long j, String str2) {
        String strM7278a = C1385b.m7278a(context, str);
        if (TextUtils.isEmpty(strM7278a)) {
            return;
        }
        C1394k.a aVarM7328a = C1394k.m7328a();
        aVarM7328a.m7340a("phonescripcache", strM7278a);
        aVarM7328a.m7339a("phonescripstarttime", j);
        aVarM7328a.m7338a("phonescripversion", 2);
        aVarM7328a.m7340a("pre_sim_key", str2);
        aVarM7328a.m7341b();
    }

    /* JADX INFO: renamed from: c */
    private static boolean m7311c() {
        if (TextUtils.isEmpty(f5736a)) {
            return !TextUtils.isEmpty(C1394k.m7335b("phonescripcache", "")) && m7307a(C1394k.m7326a("phonescripstarttime", 0L));
        }
        C1386c.m7288b("PhoneScripUtils", f5737b + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + f5738c);
        return m7307a(f5738c);
    }

    /* JADX INFO: renamed from: a */
    public static void m7306a(boolean z, boolean z2) {
        C1394k.a aVarM7328a = C1394k.m7328a();
        aVarM7328a.m7337a("phonescripstarttime");
        aVarM7328a.m7337a("phonescripcache");
        aVarM7328a.m7337a("pre_sim_key");
        aVarM7328a.m7337a("phonescripversion");
        if (z2) {
            aVarM7328a.m7336a();
        } else {
            aVarM7328a.m7341b();
        }
        if (z) {
            f5736a = null;
            f5737b = null;
            f5738c = 0L;
            f5739d = -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m7303a(Context context) {
        if (TextUtils.isEmpty(f5736a)) {
            String strM7335b = C1394k.m7335b("phonescripcache", "");
            if (TextUtils.isEmpty(strM7335b)) {
                C1386c.m7286a("PhoneScripUtils", "null");
                return null;
            }
            f5738c = C1394k.m7326a("phonescripstarttime", 0L);
            f5737b = C1394k.m7335b("pre_sim_key", "");
            f5739d = C1394k.m7324a("phonescripversion", -1);
            String strM7283b = C1385b.m7283b(context, strM7335b);
            f5736a = strM7283b;
            return strM7283b;
        }
        return f5736a;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7307a(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1386c.m7288b("PhoneScripUtils", j + "");
        C1386c.m7288b("PhoneScripUtils", jCurrentTimeMillis + "");
        return j - jCurrentTimeMillis > 10000;
    }

    /* JADX INFO: renamed from: a */
    public static long m7302a() {
        long jM7326a;
        long j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(f5736a)) {
            C1386c.m7288b("PhoneScripUtils", f5737b + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + f5738c);
            jM7326a = f5738c;
        } else {
            String strM7335b = C1394k.m7335b("phonescripcache", "");
            jM7326a = C1394k.m7326a("phonescripstarttime", 0L);
            if (TextUtils.isEmpty(strM7335b)) {
                j = 0;
            }
            return Math.max(j / 1000, 0L);
        }
        j = (jM7326a - jCurrentTimeMillis) - 10000;
        return Math.max(j / 1000, 0L);
    }

    /* JADX INFO: renamed from: a */
    private static int m7301a(String str) {
        String strM7335b;
        if (!TextUtils.isEmpty(f5737b)) {
            strM7335b = f5737b;
        } else {
            strM7335b = C1394k.m7335b("pre_sim_key", "");
            f5737b = strM7335b;
        }
        if (TextUtils.isEmpty(strM7335b)) {
            return 0;
        }
        return strM7335b.equals(str) ? 1 : 2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7308a(C1339a c1339a) {
        int iM7301a = m7301a(c1339a.m7022b("scripKey"));
        c1339a.m7015a("imsiState", iM7301a + "");
        StringBuilder sb = new StringBuilder("simState = ");
        sb.append(iM7301a);
        C1386c.m7288b("PhoneScripUtils", sb.toString());
        if (iM7301a == 0) {
            return false;
        }
        if (f5739d == -1) {
            f5739d = C1394k.m7324a("phonescripversion", -1);
        }
        if (f5739d != 2) {
            m7306a(true, false);
            C1385b.m7279a();
            C1386c.m7288b("PhoneScripUtils", "phoneScriptVersion change");
            return false;
        }
        if (iM7301a == 2) {
            m7306a(true, false);
            return false;
        }
        return m7311c();
    }
}
