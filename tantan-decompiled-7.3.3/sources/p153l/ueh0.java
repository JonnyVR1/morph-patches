package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ueh0 {

    /* JADX INFO: renamed from: d */
    public static final String f178653d;

    /* JADX INFO: renamed from: e */
    public static ueh0 f178654e;

    /* JADX INFO: renamed from: a */
    public final byd0 f178655a = new byd0("svip_trial_dlg_show" + CoreModule.m30929H().userId(), -1L);

    /* JADX INFO: renamed from: b */
    public final byd0 f178656b = new byd0("svip_trial_dot_show" + CoreModule.m30929H().userId(), -1L);

    /* JADX INFO: renamed from: c */
    public kcg0 f178657c;

    static {
        f178653d = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/svipTryout/index.html?speed=true&_bid=1003871&hideNavigationBar=1&hideNotch=1");
    }

    /* JADX INFO: renamed from: d */
    public static int m195750d(long j) {
        if (j <= 0) {
            return 1;
        }
        return Math.max((int) ((j - pzi0.m174454o()) / 86400000), 1);
    }

    /* JADX INFO: renamed from: e */
    public static long m195751e(Merchandise merchandise) {
        if (jyb.m147479J(merchandise.localCoupons)) {
            return -1L;
        }
        return (long) merchandise.localCoupons.get(0).endTime;
    }

    /* JADX INFO: renamed from: f */
    public static String m195752f(String str, boolean z, long j, int i) {
        return String.format("%s&merchandiseId=%s&couponExpireTime=%s&isAutoPay=%s&price=%s", f178653d, str, Long.valueOf(j), Boolean.valueOf(z), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public static ueh0 m195753g() {
        if (f178654e == null) {
            synchronized (ueh0.class) {
                try {
                    if (f178654e == null) {
                        f178654e = new ueh0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f178654e;
    }

    /* JADX INFO: renamed from: h */
    public static Intent m195754h(Act act, Merchandise merchandise) {
        long jM195751e = m195751e(merchandise);
        return m195758l(act, m195752f(merchandise.f56859id, CoreModule.f18264c.f20333O0.m31077n3(), jM195751e, (int) merchandise.defaultStockKeepUnit.prices.price));
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static Merchandise m195755i() {
        return m195756j(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get("svip")));
    }

    /* JADX INFO: renamed from: j */
    public static Merchandise m195756j(List<Merchandise> list) {
        if (jyb.m147479J(list)) {
            return null;
        }
        return (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.seh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf(merchandise.monthly() && merchandise.autoRenewable() && v5b0.m199785k(merchandise));
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static void m195757k(Act act, Merchandise merchandise) {
        act.startActivity(m195754h(act, merchandise));
    }

    /* JADX INFO: renamed from: l */
    public static Intent m195758l(Act act, String str) {
        Intent intentMo34886md = CoreModule.f18276o.m132214d().mo34886md(act, null, str, true, false, true);
        intentMo34886md.putExtra("hideNotch", true);
        return intentMo34886md;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m195759m(C8928d c8928d, PurchaseType purchaseType, Act act) {
        if (!NullChecker.m82486a(c8928d) || purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || !c8928d.m54714m()) {
            return false;
        }
        Merchandise merchandiseM54784s = c8928d.m54703b().m54784s();
        if (!NullChecker.m82486a(merchandiseM54784s) || !merchandiseM54784s.monthly() || !v5b0.m199785k(merchandiseM54784s)) {
            return false;
        }
        m195757k(act, merchandiseM54784s);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m195760n(Merchandise merchandise) {
        return merchandise.category == ProductCategory.get("svip") && merchandise.monthly() && merchandise.autoRenewable() && v5b0.m199785k(merchandise);
    }

    /* JADX INFO: renamed from: o */
    public static Merchandise m195761o(final String str) {
        List<Merchandise> listM222761e = CoreModule.f18264c.f20396j0.m31583E4().m222761e();
        if (jyb.m147479J(listM222761e)) {
            return null;
        }
        return (Merchandise) jyb.m147529r(listM222761e, new qcj() { // from class: l.teh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Merchandise) obj).f56859id, str));
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static void m195762p() {
        f178654e = null;
    }

    /* JADX INFO: renamed from: r */
    public static void m195763r(Act act, Merchandise merchandise) {
        m195753g().m195765q();
        new qeh0().m176249j(act, merchandise);
    }

    /* JADX INFO: renamed from: c */
    public void m195764c() {
        psd0.m173633z(this.f178657c);
        this.f178657c = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m195765q() {
        this.f178655a.put(Long.valueOf(pzi0.m174454o()));
    }
}
