package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class m6h0 {

    /* JADX INFO: renamed from: d */
    public static final String f131686d;

    /* JADX INFO: renamed from: e */
    public static m6h0 f131687e;

    /* JADX INFO: renamed from: a */
    public final zpd0 f131688a = new zpd0("svip_trial_dlg_show" + CoreModule.m29931H().userId(), -1L);

    /* JADX INFO: renamed from: b */
    public final zpd0 f131689b = new zpd0("svip_trial_dot_show" + CoreModule.m29931H().userId(), -1L);

    /* JADX INFO: renamed from: c */
    public c4g0 f131690c;

    static {
        f131686d = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/svipTryout/index.html?speed=true&_bid=1003871&hideNavigationBar=1&hideNotch=1");
    }

    /* JADX INFO: renamed from: d */
    public static int m153218d(long j) {
        if (j <= 0) {
            return 1;
        }
        return Math.max((int) ((j - mqi0.m155944o()) / 86400000), 1);
    }

    /* JADX INFO: renamed from: e */
    public static long m153219e(Merchandise merchandise) {
        if (vwb.m200296J(merchandise.localCoupons)) {
            return -1L;
        }
        return (long) merchandise.localCoupons.get(0).endTime;
    }

    /* JADX INFO: renamed from: f */
    public static String m153220f(String str, boolean z, long j, int i) {
        return String.format("%s&merchandiseId=%s&couponExpireTime=%s&isAutoPay=%s&price=%s", f131686d, str, Long.valueOf(j), Boolean.valueOf(z), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public static m6h0 m153221g() {
        if (f131687e == null) {
            synchronized (m6h0.class) {
                try {
                    if (f131687e == null) {
                        f131687e = new m6h0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f131687e;
    }

    /* JADX INFO: renamed from: h */
    public static Intent m153222h(Act act, Merchandise merchandise) {
        long jM153219e = m153219e(merchandise);
        return m153226l(act, m153220f(merchandise.f56011id, CoreModule.f17545c.f19591O0.m30079n3(), jM153219e, (int) merchandise.defaultStockKeepUnit.prices.price));
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static Merchandise m153223i() {
        return m153224j(CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get("svip")));
    }

    /* JADX INFO: renamed from: j */
    public static Merchandise m153224j(List<Merchandise> list) {
        if (vwb.m200296J(list)) {
            return null;
        }
        return (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.k6h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf(merchandise.monthly() && merchandise.autoRenewable() && rxa0.m181490k(merchandise));
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static void m153225k(Act act, Merchandise merchandise) {
        act.startActivity(m153222h(act, merchandise));
    }

    /* JADX INFO: renamed from: l */
    public static Intent m153226l(Act act, String str) {
        Intent intentMo33883md = CoreModule.f17557o.m195057d().mo33883md(act, null, str, true, false, true);
        intentMo33883md.putExtra("hideNotch", true);
        return intentMo33883md;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m153227m(C8765d c8765d, PurchaseType purchaseType, Act act) {
        if (!NullChecker.m81303a(c8765d) || purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || !c8765d.m53531m()) {
            return false;
        }
        Merchandise merchandiseM53601s = c8765d.m53520b().m53601s();
        if (!NullChecker.m81303a(merchandiseM53601s) || !merchandiseM53601s.monthly() || !rxa0.m181490k(merchandiseM53601s)) {
            return false;
        }
        m153225k(act, merchandiseM53601s);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m153228n(Merchandise merchandise) {
        return merchandise.category == ProductCategory.get("svip") && merchandise.monthly() && merchandise.autoRenewable() && rxa0.m181490k(merchandise);
    }

    /* JADX INFO: renamed from: o */
    public static Merchandise m153229o(final String str) {
        List<Merchandise> listM221515e = CoreModule.f17545c.f19654j0.m30580E4().m221515e();
        if (vwb.m200296J(listM221515e)) {
            return null;
        }
        return (Merchandise) vwb.m200346r(listM221515e, new w9j() { // from class: l.l6h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Merchandise) obj).f56011id, str));
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static void m153230p() {
        f131687e = null;
    }

    /* JADX INFO: renamed from: r */
    public static void m153231r(Act act, Merchandise merchandise) {
        m153221g().m153233q();
        new i6h0().m134620j(act, merchandise);
    }

    /* JADX INFO: renamed from: c */
    public void m153232c() {
        mkd0.m154992z(this.f131690c);
        this.f131690c = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m153233q() {
        this.f131688a.put(Long.valueOf(mqi0.m155944o()));
    }
}
