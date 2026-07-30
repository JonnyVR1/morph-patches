package p149l;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class v4w0 {
    /* JADX INFO: renamed from: a */
    public static void m197065a(gnr gnrVar, w4w0 w4w0Var, l4w0 l4w0Var) {
        m197071g(gnrVar, w4w0Var, l4w0Var, false);
    }

    /* JADX INFO: renamed from: b */
    public static void m197066b(gnr gnrVar, w4w0 w4w0Var, l4w0 l4w0Var) {
        m197071g(gnrVar, w4w0Var, l4w0Var, true);
    }

    /* JADX INFO: renamed from: c */
    public static void m197067c(gnr gnrVar, w4w0 w4w0Var, l4w0 l4w0Var) {
        if (((Boolean) l9s0.f127142c.m115379e()).booleanValue()) {
            jmw0.m142245r(amw0.m97696C(gnrVar), new u4w0(w4w0Var, l4w0Var), i3t0.f111377f);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m197068d(gnr gnrVar, l4w0 l4w0Var) {
        if (((Boolean) l9s0.f127142c.m115379e()).booleanValue()) {
            jmw0.m142245r(amw0.m97696C(gnrVar), new s4w0(l4w0Var), i3t0.f111377f);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m197069e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) d1s0.m109677c().m144697a(m7s0.f131937H8), str);
    }

    /* JADX INFO: renamed from: f */
    public static int m197070f(iyv0 iyv0Var) {
        int iM146891e = kpv0.m146891e(iyv0Var) - 1;
        return (iM146891e == 0 || iM146891e == 1) ? 7 : 23;
    }

    /* JADX INFO: renamed from: g */
    public static void m197071g(gnr gnrVar, w4w0 w4w0Var, l4w0 l4w0Var, boolean z) {
        if (((Boolean) l9s0.f127142c.m115379e()).booleanValue()) {
            jmw0.m142245r(amw0.m97696C(gnrVar), new t4w0(w4w0Var, l4w0Var, z), i3t0.f111377f);
        }
    }
}
