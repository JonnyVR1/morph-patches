package p153l;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class bew0 {
    /* JADX INFO: renamed from: a */
    public static void m103785a(hpr hprVar, cew0 cew0Var, rdw0 rdw0Var) {
        m103791g(hprVar, cew0Var, rdw0Var, false);
    }

    /* JADX INFO: renamed from: b */
    public static void m103786b(hpr hprVar, cew0 cew0Var, rdw0 rdw0Var) {
        m103791g(hprVar, cew0Var, rdw0Var, true);
    }

    /* JADX INFO: renamed from: c */
    public static void m103787c(hpr hprVar, cew0 cew0Var, rdw0 rdw0Var) {
        if (((Boolean) ris0.f163391c.m149974e()).booleanValue()) {
            pvw0.m173991r(gvw0.m132580C(hprVar), new aew0(cew0Var, rdw0Var), oct0.f146738f);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m103788d(hpr hprVar, rdw0 rdw0Var) {
        if (((Boolean) ris0.f163391c.m149974e()).booleanValue()) {
            pvw0.m173991r(gvw0.m132580C(hprVar), new ydw0(rdw0Var), oct0.f146738f);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m103789e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) jas0.m144075c().m176505a(sgs0.f168008H8), str);
    }

    /* JADX INFO: renamed from: f */
    public static int m103790f(o7w0 o7w0Var) {
        int iM178754e = qyv0.m178754e(o7w0Var) - 1;
        return (iM178754e == 0 || iM178754e == 1) ? 7 : 23;
    }

    /* JADX INFO: renamed from: g */
    public static void m103791g(hpr hprVar, cew0 cew0Var, rdw0 rdw0Var, boolean z) {
        if (((Boolean) ris0.f163391c.m149974e()).booleanValue()) {
            pvw0.m173991r(gvw0.m132580C(hprVar), new zdw0(cew0Var, rdw0Var, z), oct0.f146738f);
        }
    }
}
