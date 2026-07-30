package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.IntlSlGuideConfig;
import com.tantanapp.common.utils.NullChecker;
import l.pib;
import l.q8p;
import l.swh0;
import l.tpd0;
import l.u59;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sbp {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f20158a = false;

    /* JADX INFO: renamed from: b */
    public static volatile String f20159b;

    /* JADX INFO: renamed from: a */
    public static boolean m22044a(boolean z) {
        IntlSlGuideConfig intlSlGuideConfigA = u59.A();
        if (!NullChecker.a(intlSlGuideConfigA)) {
            return false;
        }
        int i = z ? intlSlGuideConfigA.intl_sl_card_guide_dlg_women : intlSlGuideConfigA.intl_sl_card_guide_dlg_men;
        if (i <= 0) {
            return false;
        }
        pib pibVarM22046c = m22046c();
        zpd0 zpd0Var = z ? pibVarM22046c.c6 : pibVarM22046c.b6;
        tpd0 tpd0Var = z ? m22046c().a6 : m22046c().Z5;
        if (!mqi0.m18535D(((Long) zpd0Var.get()).longValue())) {
            tpd0Var.put(0);
            zpd0Var.put(Long.valueOf(mqi0.m18550o()));
        }
        return ((Integer) tpd0Var.get()).intValue() < i;
    }

    /* JADX INFO: renamed from: b */
    public static void m22045b() {
        f20159b = null;
    }

    /* JADX INFO: renamed from: c */
    public static pib m22046c() {
        return CoreModule.c.e0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m22047d() {
        return swh0.w0(CoreModule.c.o3().superLikeLimit.remainToday()) > 0;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m22048e(String str) {
        if (str == null || f20159b == null) {
            return false;
        }
        return str.equals(f20159b);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m22049f() {
        return f20158a;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m22050g(CoreSuggested.UserInfo userInfo) {
        return !NullChecker.a(userInfo) || userInfo.isUserLikeMe() || q8p.Companion.m(userInfo) || userInfo.isVirtualCard() || userInfo.isLivingCard() || NullChecker.a(userInfo.intlInsertCardData);
    }

    /* JADX INFO: renamed from: h */
    public static void m22051h(boolean z) {
        pib pibVarM22046c = m22046c();
        zpd0 zpd0Var = z ? pibVarM22046c.c6 : pibVarM22046c.b6;
        tpd0 tpd0Var = z ? m22046c().a6 : m22046c().Z5;
        if (!mqi0.m18535D(((Long) zpd0Var.get()).longValue())) {
            tpd0Var.put(0);
            zpd0Var.put(Long.valueOf(mqi0.m18550o()));
        }
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
    }

    /* JADX INFO: renamed from: i */
    public static void m22052i(String str) {
        f20159b = str;
    }

    /* JADX INFO: renamed from: j */
    public static void m22053j(boolean z) {
        f20158a = z;
    }
}
