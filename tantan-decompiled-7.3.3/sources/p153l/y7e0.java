package p153l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.VipAct;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class y7e0 extends o5e0 {
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m214532j() {
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        Activity activityM105506D;
        if (TextUtils.isEmpty(abe0Var.m96744g()) || (activityM105506D = bnl0.m105506D(abe0Var.m96739b())) == null || !(activityM105506D instanceof Act)) {
            return;
        }
        String strReplaceFirst = abe0Var.m96744g().replaceFirst("/", "");
        String str = abe0Var.m96743f().get("membershipType");
        String str2 = abe0Var.m96743f().get(FirebaseAnalytics.Param.QUANTITY);
        if (TextUtils.equals("recall", strReplaceFirst)) {
            CoreModule.f18264c.f20297C0.m146425v4();
            m214538p(str, str2, (Act) activityM105506D);
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final ProductCategory m214534l(String str) {
        if (TextUtils.equals("svip", str)) {
            return ProductCategory.get(ProductCategory.tttSvipGoogleplay);
        }
        return TextUtils.equals("see", str) ? ProductCategory.get(ProductCategory.tttSeeWhoLikedMe) : ProductCategory.get(ProductCategory.tttVip);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m214535m(String str) {
        if (!joa.m146386f4()) {
            return false;
        }
        if (TextUtils.equals("svip", str)) {
            return true;
        }
        return TextUtils.equals("see", str) ? joa.m146392i4() : joa.m146401n4();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m214536n(final String str, Act act, List list) {
        Merchandise merchandise = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.u7e0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(TextUtils.equals(String.valueOf(merchandise2.quantity), str) && merchandise2.monthType());
            }
        });
        if (merchandise == null && !jyb.m147479J(list)) {
            merchandise = (Merchandise) jyb.m147483N(list);
        }
        m214537o(merchandise.defaultStockKeepUnit.affiliateProducts.getProductId(), act);
    }

    /* JADX INFO: renamed from: o */
    public final void m214537o(String str, Act act) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CoreModule.m30933P().m143405a().mo34315Eo(act, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, true, new x20() { // from class: l.v7e0
            @Override // p153l.x20
            public final void call() {
                l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.x7e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f18264c.f20297C0.m146425v4();
                    }
                }, 1000L);
            }
        }, new x20() { // from class: l.w7e0
            @Override // p153l.x20
            public final void call() {
                y7e0.m214532j();
            }
        }, str);
    }

    /* JADX INFO: renamed from: p */
    public final void m214538p(String str, final String str2, final Act act) {
        if (TextUtils.equals("svip", str) && joa.m146386f4() && (!joa.m146401n4() || !joa.m146392i4())) {
            act.startActivity(VipAct.m57420c2(act, oql0.m168817a("svip")));
        } else if (m214535m(str)) {
            act.duringCreated(C22421c.just(m214534l(str)).flatMap(new qcj() { // from class: l.r7e0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20396j0.m31647y5((ProductCategory) obj);
                }
            }).filter(new qcj() { // from class: l.s7e0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!jyb.m147479J((List) obj));
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.t7e0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172425a.m214536n(str2, act, (List) obj);
                }
            }));
        } else {
            r1j0.m179419f(R$string.f19489nc);
        }
    }
}
