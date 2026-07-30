package p006l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.VipAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.List;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.mkd0;
import l.osi0;
import l.vwb;
import l.w9j;
import l.xdl0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class uzd0 extends kxd0 {
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m25632j() {
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Activity activityD;
        if (TextUtils.isEmpty(w2e0Var.m26161g()) || (activityD = xdl0.D(w2e0Var.m26156b())) == null || !(activityD instanceof Act)) {
            return;
        }
        String strReplaceFirst = w2e0Var.m26161g().replaceFirst("/", "");
        String str = w2e0Var.m26160f().get("membershipType");
        String str2 = w2e0Var.m26160f().get("quantity");
        if (TextUtils.equals("recall", strReplaceFirst)) {
            CoreModule.f1534c.f3544C0.m27420u4();
            m25638p(str, str2, (Act) activityD);
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final ProductCategory m25634l(String str) {
        if (TextUtils.equals("svip", str)) {
            return ProductCategory.get("tttSvipGoogleplay");
        }
        return TextUtils.equals("see", str) ? ProductCategory.get("tttSeeWhoLikedMe") : ProductCategory.get("tttVip");
    }

    /* JADX INFO: renamed from: m */
    public final boolean m25635m(String str) {
        if (!xma.m27379e4()) {
            return false;
        }
        if (TextUtils.equals("svip", str)) {
            return true;
        }
        return TextUtils.equals("see", str) ? xma.m27385h4() : xma.m27395m4();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m25636n(final String str, Act act, List list) {
        Merchandise merchandise = (Merchandise) vwb.r(list, new w9j() { // from class: l.qzd0
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(TextUtils.equals(String.valueOf(merchandise2.quantity), str) && merchandise2.monthType());
            }
        });
        if (merchandise == null && !vwb.J(list)) {
            merchandise = (Merchandise) vwb.N(list);
        }
        m25637o(merchandise.defaultStockKeepUnit.affiliateProducts.getProductId(), act);
    }

    /* JADX INFO: renamed from: o */
    public final void m25637o(String str, Act act) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CoreModule.m1854P().m11706a().m5249Eo(act, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, true, new d30() { // from class: l.rzd0
            public final void call() {
                e51.H(CoreModule.f1533b, new Runnable() { // from class: l.tzd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f1534c.f3544C0.m27420u4();
                    }
                }, 1000L);
            }
        }, new d30() { // from class: l.szd0
            public final void call() {
                uzd0.m25632j();
            }
        }, str);
    }

    /* JADX INFO: renamed from: p */
    public final void m25638p(String str, final String str2, final Act act) {
        if (TextUtils.equals("svip", str) && xma.m27379e4() && (!xma.m27395m4() || !xma.m27385h4())) {
            act.startActivity(VipAct.m9670b2(act, khl0.m18123a("svip")));
        } else if (m25635m(str)) {
            act.duringCreated(c.just(m25634l(str)).flatMap(new w9j() { // from class: l.nzd0
                public final Object call(Object obj) {
                    return CoreModule.f1534c.f3643j0.m2572y5((ProductCategory) obj);
                }
            }).filter(new w9j() { // from class: l.ozd0
                public final Object call(Object obj) {
                    return Boolean.valueOf(!vwb.J((List) obj));
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.pzd0
                public final void call(Object obj) {
                    this.f19467a.m25636n(str2, act, (List) obj);
                }
            }));
        } else {
            osi0.f(R$string.f2287Yb);
        }
    }
}
