package p149l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.VipAct;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class uzd0 extends kxd0 {
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m196404j() {
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Activity activityM208326D;
        if (TextUtils.isEmpty(w2e0Var.m201099g()) || (activityM208326D = xdl0.m208326D(w2e0Var.m201094b())) == null || !(activityM208326D instanceof Act)) {
            return;
        }
        String strReplaceFirst = w2e0Var.m201099g().replaceFirst("/", "");
        String str = w2e0Var.m201098f().get("membershipType");
        String str2 = w2e0Var.m201098f().get(FirebaseAnalytics.Param.QUANTITY);
        if (TextUtils.equals("recall", strReplaceFirst)) {
            CoreModule.f17545c.f19555C0.m210112u4();
            m196410p(str, str2, (Act) activityM208326D);
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final ProductCategory m196406l(String str) {
        if (TextUtils.equals("svip", str)) {
            return ProductCategory.get(ProductCategory.tttSvipGoogleplay);
        }
        return TextUtils.equals("see", str) ? ProductCategory.get(ProductCategory.tttSeeWhoLikedMe) : ProductCategory.get(ProductCategory.tttVip);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m196407m(String str) {
        if (!xma.m210071e4()) {
            return false;
        }
        if (TextUtils.equals("svip", str)) {
            return true;
        }
        return TextUtils.equals("see", str) ? xma.m210077h4() : xma.m210087m4();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m196408n(final String str, Act act, List list) {
        Merchandise merchandise = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.qzd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(TextUtils.equals(String.valueOf(merchandise2.quantity), str) && merchandise2.monthType());
            }
        });
        if (merchandise == null && !vwb.m200296J(list)) {
            merchandise = (Merchandise) vwb.m200300N(list);
        }
        m196409o(merchandise.defaultStockKeepUnit.affiliateProducts.getProductId(), act);
    }

    /* JADX INFO: renamed from: o */
    public final void m196409o(String str, Act act) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CoreModule.m29935P().m94651a().mo33312Eo(act, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, true, new d30() { // from class: l.rzd0
            @Override // p149l.d30
            public final void call() {
                e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.tzd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f17545c.f19555C0.m210112u4();
                    }
                }, 1000L);
            }
        }, new d30() { // from class: l.szd0
            @Override // p149l.d30
            public final void call() {
                uzd0.m196404j();
            }
        }, str);
    }

    /* JADX INFO: renamed from: p */
    public final void m196410p(String str, final String str2, final Act act) {
        if (TextUtils.equals("svip", str) && xma.m210071e4() && (!xma.m210087m4() || !xma.m210077h4())) {
            act.startActivity(VipAct.m56237b2(act, khl0.m145975a("svip")));
        } else if (m196407m(str)) {
            act.duringCreated(C22306c.just(m196406l(str)).flatMap(new w9j() { // from class: l.nzd0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19654j0.m30644y5((ProductCategory) obj);
                }
            }).filter(new w9j() { // from class: l.ozd0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!vwb.m200296J((List) obj));
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.pzd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f151943a.m196408n(str2, act, (List) obj);
                }
            }));
        } else {
            osi0.m165782f(R$string.f18298Yb);
        }
    }
}
