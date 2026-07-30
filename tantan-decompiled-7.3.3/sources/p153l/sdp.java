package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.IntlSlGuideConfig;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class sdp {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f167451a = false;

    /* JADX INFO: renamed from: b */
    public static volatile String f167452b;

    /* JADX INFO: renamed from: a */
    public static boolean m185484a(boolean z) {
        IntlSlGuideConfig intlSlGuideConfigM114642A = d79.m114642A();
        if (!NullChecker.m82486a(intlSlGuideConfigM114642A)) {
            return false;
        }
        int i = z ? intlSlGuideConfigM114642A.intl_sl_card_guide_dlg_women : intlSlGuideConfigM114642A.intl_sl_card_guide_dlg_men;
        if (i <= 0) {
            return false;
        }
        dkb dkbVarM185486c = m185486c();
        byd0 byd0Var = z ? dkbVarM185486c.f89204c6 : dkbVarM185486c.f89196b6;
        vxd0 vxd0Var = z ? m185486c().f89188a6 : m185486c().f89180Z5;
        if (!pzi0.m174439D(byd0Var.get().longValue())) {
            vxd0Var.put(0);
            byd0Var.put(Long.valueOf(pzi0.m174454o()));
        }
        return vxd0Var.get().intValue() < i;
    }

    /* JADX INFO: renamed from: b */
    public static void m185485b() {
        f167452b = null;
    }

    /* JADX INFO: renamed from: c */
    public static dkb m185486c() {
        return CoreModule.f18264c.f20381e0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m185487d() {
        return a5i0.m96178w0(CoreModule.f18264c.m32487o3().superLikeLimit.remainToday()) > 0;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m185488e(String str) {
        if (str == null || f167452b == null) {
            return false;
        }
        return str.equals(f167452b);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m185489f() {
        return f167451a;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m185490g(CoreSuggested.UserInfo userInfo) {
        return !NullChecker.m82486a(userInfo) || userInfo.isUserLikeMe() || qap.INSTANCE.m175975m(userInfo) || userInfo.isVirtualCard() || userInfo.isLivingCard() || NullChecker.m82486a(userInfo.intlInsertCardData);
    }

    /* JADX INFO: renamed from: h */
    public static void m185491h(boolean z) {
        dkb dkbVarM185486c = m185486c();
        byd0 byd0Var = z ? dkbVarM185486c.f89204c6 : dkbVarM185486c.f89196b6;
        vxd0 vxd0Var = z ? m185486c().f89188a6 : m185486c().f89180Z5;
        if (!pzi0.m174439D(byd0Var.get().longValue())) {
            vxd0Var.put(0);
            byd0Var.put(Long.valueOf(pzi0.m174454o()));
        }
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: i */
    public static void m185492i(String str) {
        f167452b = str;
    }

    /* JADX INFO: renamed from: j */
    public static void m185493j(boolean z) {
        f167451a = z;
    }
}
