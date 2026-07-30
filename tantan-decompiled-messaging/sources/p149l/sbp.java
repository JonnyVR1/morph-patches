package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.IntlSlGuideConfig;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class sbp {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f163572a = false;

    /* JADX INFO: renamed from: b */
    public static volatile String f163573b;

    /* JADX INFO: renamed from: a */
    public static boolean m183241a(boolean z) {
        IntlSlGuideConfig intlSlGuideConfigM191792A = u59.m191792A();
        if (!NullChecker.m81303a(intlSlGuideConfigM191792A)) {
            return false;
        }
        int i = z ? intlSlGuideConfigM191792A.intl_sl_card_guide_dlg_women : intlSlGuideConfigM191792A.intl_sl_card_guide_dlg_men;
        if (i <= 0) {
            return false;
        }
        pib pibVarM183243c = m183243c();
        zpd0 zpd0Var = z ? pibVarM183243c.f149347c6 : pibVarM183243c.f149339b6;
        tpd0 tpd0Var = z ? m183243c().f149331a6 : m183243c().f149323Z5;
        if (!mqi0.m155929D(zpd0Var.get().longValue())) {
            tpd0Var.put(0);
            zpd0Var.put(Long.valueOf(mqi0.m155944o()));
        }
        return tpd0Var.get().intValue() < i;
    }

    /* JADX INFO: renamed from: b */
    public static void m183242b() {
        f163573b = null;
    }

    /* JADX INFO: renamed from: c */
    public static pib m183243c() {
        return CoreModule.f17545c.f19639e0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m183244d() {
        return swh0.m186273w0(CoreModule.f17545c.m31484o3().superLikeLimit.remainToday()) > 0;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m183245e(String str) {
        if (str == null || f163573b == null) {
            return false;
        }
        return str.equals(f163573b);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m183246f() {
        return f163572a;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m183247g(CoreSuggested.UserInfo userInfo) {
        return !NullChecker.m81303a(userInfo) || userInfo.isUserLikeMe() || q8p.INSTANCE.m173438m(userInfo) || userInfo.isVirtualCard() || userInfo.isLivingCard() || NullChecker.m81303a(userInfo.intlInsertCardData);
    }

    /* JADX INFO: renamed from: h */
    public static void m183248h(boolean z) {
        pib pibVarM183243c = m183243c();
        zpd0 zpd0Var = z ? pibVarM183243c.f149347c6 : pibVarM183243c.f149339b6;
        tpd0 tpd0Var = z ? m183243c().f149331a6 : m183243c().f149323Z5;
        if (!mqi0.m155929D(zpd0Var.get().longValue())) {
            tpd0Var.put(0);
            zpd0Var.put(Long.valueOf(mqi0.m155944o()));
        }
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: i */
    public static void m183249i(String str) {
        f163573b = str;
    }

    /* JADX INFO: renamed from: j */
    public static void m183250j(boolean z) {
        f163572a = z;
    }
}
