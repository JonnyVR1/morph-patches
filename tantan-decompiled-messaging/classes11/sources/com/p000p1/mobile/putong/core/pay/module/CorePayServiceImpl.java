package com.p000p1.mobile.putong.core.pay.module;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.pay.module.CorePayServiceImpl;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p1.mobile.putong.core.ui.wallet.TanTanCoinAct;
import com.p1.mobile.putong.data.PayMethod;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.cll0;
import l.cwf0;
import l.d30;
import l.dsa;
import l.e30;
import l.f2f0;
import l.fd5;
import l.g30;
import l.g6a;
import l.hab0;
import l.iab0;
import l.j760;
import l.km80;
import l.kwo;
import l.lya0;
import l.n3b0;
import l.n4i0;
import l.o6n;
import l.ogw;
import l.p2b0;
import l.swh0;
import l.wf60;
import l.wi60;
import l.wx80;
import l.x5b0;
import l.zb90;
import l.zl80;
import p009l.ah60;
import p009l.b1f;
import p009l.fy80;
import p009l.mqi0;
import p009l.rf60;
import p009l.rxa0;
import p009l.we60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Route(name = "CorePayInnerService", path = "/pay_service/service")
public class CorePayServiceImpl implements CorePayInnerService {
    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m8158H(hab0 hab0Var, Merchandise merchandise, PayMethod payMethod, Boolean bool, PurchaseType purchaseType, d30 d30Var) {
        hab0Var.r(merchandise, payMethod, false, bool.booleanValue(), hab0Var.e(), purchaseType, true);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: A6 */
    public int m8159A6(String str) {
        if (TextUtils.equals(str, CoreModule.P().b().Wh())) {
            return 27;
        }
        if (TextUtils.equals(str, CoreModule.P().b().tj())) {
            return 28;
        }
        if (TextUtils.equals(str, CoreModule.P().b().ra())) {
            return 29;
        }
        return TextUtils.equals(str, CoreModule.P().b().Zq()) ? 30 : 0;
    }

    /* JADX INFO: renamed from: Ag */
    public long m8160Ag() {
        return wi60.m().p();
    }

    /* JADX INFO: renamed from: Am */
    public void m8161Am(Act act, String str, e30<String> e30Var) {
        swh0.t1(act, str, e30Var);
    }

    /* JADX INFO: renamed from: Bk */
    public void m8162Bk(Act act, String str, e30<PurchaseType> e30Var) {
        c.d1(act, str, e30Var);
    }

    /* JADX INFO: renamed from: Bl */
    public void m8163Bl(PurchaseType purchaseType, Privilege privilege) {
        cll0.g(purchaseType, privilege);
    }

    /* JADX INFO: renamed from: Cd */
    public List<Merchandise> m8164Cd(ProductCategory productCategory) {
        return zl80.g().e(productCategory);
    }

    /* JADX INFO: renamed from: Cg */
    public void m8165Cg(Act act, e30<Boolean> e30Var, Merchandise merchandise, Coupon coupon, String str, PayMethod payMethod, Object obj) {
        lya0.T0(act, e30Var, merchandise, coupon, str, payMethod, obj);
    }

    /* JADX INFO: renamed from: Ci */
    public void m8166Ci(Act act, Merchandise merchandise, PurchaseType purchaseType, PayMethod payMethod, String str, PendingPaymentGuidance pendingPaymentGuidance, Coupon coupon, String str2, e30<Integer> e30Var) {
        wi60.m().E(act, merchandise, purchaseType, payMethod, str, pendingPaymentGuidance, coupon, str2, e30Var);
    }

    /* JADX INFO: renamed from: Cl */
    public boolean m8167Cl() {
        return swh0.I1();
    }

    /* JADX INFO: renamed from: Cp */
    public void m8168Cp(Act act, PurchaseType purchaseType, Merchandise merchandise, PayMethod payMethod, e30<PayMethod> e30Var) {
        new wf60(act, purchaseType).r(payMethod).t(p2b0.h().x(merchandise)).q(e30Var).s();
    }

    /* JADX INFO: renamed from: D7 */
    public boolean m8169D7(String str) {
        return wi60.m().v(str);
    }

    /* JADX INFO: renamed from: D9 */
    public boolean m8170D9() {
        return false;
    }

    /* JADX INFO: renamed from: Dq */
    public ArrayList<Privilege> m8171Dq() {
        return fy80.m14659y();
    }

    /* JADX INFO: renamed from: Ds */
    public void m8172Ds(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var) {
        c.o0(act, str, privilege, e30Var, (d30) null, (d30) null, d30Var);
    }

    /* JADX INFO: renamed from: Ed */
    public boolean m8173Ed() {
        return false;
    }

    /* JADX INFO: renamed from: Fd */
    public boolean m8174Fd() {
        return zb90.i();
    }

    /* JADX INFO: renamed from: Fh */
    public int m8175Fh() {
        return swh0.m0();
    }

    /* JADX INFO: renamed from: Fn */
    public void m8176Fn(Act act) {
        new f2f0(act).b();
    }

    /* JADX INFO: renamed from: Fs */
    public boolean m8177Fs() {
        return zb90.h();
    }

    /* JADX INFO: renamed from: Gs */
    public void m8178Gs(Act act, PurchaseType purchaseType, PayMethod payMethod, String str, List<PayMethod> list, e30<PayMethod> e30Var) {
        new wf60(act, purchaseType).r(payMethod).t(list).q(e30Var).n(!wi60.m().v(str)).s();
    }

    /* JADX INFO: renamed from: Hm */
    public wx80 m8179Hm(PurchaseType purchaseType, Privilege privilege) {
        return fy80.m14647m(purchaseType, privilege);
    }

    /* JADX INFO: renamed from: I8 */
    public void m8180I8(PurchaseType purchaseType) {
        swh0.M1(purchaseType);
    }

    /* JADX INFO: renamed from: Jf */
    public String m8181Jf(ProductCategory productCategory) {
        return wi60.m().n(productCategory);
    }

    /* JADX INFO: renamed from: Kd */
    public void m8182Kd(Act act, String str, g30<PurchaseType, Act, String> g30Var, d30 d30Var) {
        o6n.A(act, str, g30Var, d30Var);
    }

    /* JADX INFO: renamed from: Ki */
    public boolean m8183Ki() {
        return false;
    }

    /* JADX INFO: renamed from: Ko */
    public void m8184Ko() {
        swh0.p0().V0();
    }

    /* JADX INFO: renamed from: Le */
    public boolean m8185Le(Merchandise merchandise) {
        return rxa0.m21888y(merchandise);
    }

    /* JADX INFO: renamed from: Of */
    public boolean m8186Of(Merchandise merchandise, String str) {
        return wi60.m().u(merchandise, str);
    }

    /* JADX INFO: renamed from: Og */
    public void m8187Og(Act act, String str, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, Privilege privilege) {
        c.a0(act, str, e30Var, d30Var, d30Var2, privilege);
    }

    /* JADX INFO: renamed from: On */
    public rx.c<PaymentResultWrapper> m8188On() {
        return ah60.m11408E();
    }

    /* JADX INFO: renamed from: Pc */
    public boolean m8189Pc() {
        return false;
    }

    /* JADX INFO: renamed from: Pk */
    public void m8190Pk(Act act, String str, e30<String> e30Var) {
        swh0.v1(act, str, e30Var);
    }

    /* JADX INFO: renamed from: Pr */
    public void m8191Pr(PurchaseType purchaseType) {
        cll0.h(purchaseType);
    }

    /* JADX INFO: renamed from: Qk */
    public int m8192Qk() {
        return swh0.X();
    }

    /* JADX INFO: renamed from: Qs */
    public void m8193Qs(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3) {
        c.R0(act, str, privilege, e30Var, d30Var, d30Var2, d30Var3);
    }

    /* JADX INFO: renamed from: S7 */
    public List<Merchandise> m8194S7(boolean z) {
        return zl80.g().d(z);
    }

    /* JADX INFO: renamed from: S9 */
    public boolean m8195S9() {
        return swh0.G();
    }

    /* JADX INFO: renamed from: Sb */
    public String m8196Sb(Merchandise merchandise, PayMethod payMethod, boolean z, boolean z2, String str, String str2) {
        x5b0 x5b0Var = new x5b0(merchandise.category, PurchaseTrackPageType.none, str);
        x5b0Var.p(str2);
        x5b0Var.w(merchandise, payMethod, z, z2);
        return x5b0Var.n();
    }

    /* JADX INFO: renamed from: Sj */
    public boolean m8197Sj() {
        return g6a.p();
    }

    /* JADX INFO: renamed from: To */
    public void m8198To(PurchaseType purchaseType, Act act, String str, boolean z, boolean z2, String str2, String str3, @Nullable e30<Integer> e30Var) {
        rf60 rf60Var = new rf60(purchaseType, act, str, "");
        rf60Var.m21625C(ogw.e(CoreModule.H().userId() + mqi0.m18550o()));
        if (!TextUtils.isEmpty(str3)) {
            rf60Var.m21648r(str3);
        }
        if (z) {
            rf60Var.m21631I(z2, str2, e30Var);
        } else {
            rf60Var.m21645o(str2, z2, e30Var);
        }
    }

    /* JADX INFO: renamed from: Uk */
    public String m8199Uk(String str) {
        return wi60.m().t(str, true);
    }

    /* JADX INFO: renamed from: Va */
    public void m8200Va() {
        swh0.p0().Q();
    }

    /* JADX INFO: renamed from: Wa */
    public boolean m8201Wa() {
        return g6a.z();
    }

    /* JADX INFO: renamed from: Wi */
    public boolean m8202Wi() {
        return swh0.p0().h1();
    }

    /* JADX INFO: renamed from: Xa */
    public int m8203Xa() {
        return swh0.W();
    }

    /* JADX INFO: renamed from: Xe */
    public void m8204Xe() {
        swh0.p0().X0();
    }

    /* JADX INFO: renamed from: Y4 */
    public int m8205Y4() {
        return n3b0.l();
    }

    /* JADX INFO: renamed from: Ya */
    public boolean m8206Ya() {
        return swh0.p0().u();
    }

    /* JADX INFO: renamed from: Yi */
    public List<String> m8207Yi() {
        return n3b0.k();
    }

    /* JADX INFO: renamed from: Yl */
    public boolean m8208Yl() {
        return swh0.p0().c1();
    }

    /* JADX INFO: renamed from: Z7 */
    public String m8209Z7(Coupon coupon) {
        return b1f.m11806d(coupon);
    }

    /* JADX INFO: renamed from: Zn */
    public boolean m8210Zn(Act act) {
        return act instanceof TanTanCoinAct;
    }

    /* JADX INFO: renamed from: Zs */
    public boolean m8211Zs(Merchandise merchandise) {
        return rxa0.m21886w(merchandise);
    }

    /* JADX INFO: renamed from: ae */
    public boolean m8212ae(Merchandise merchandise, String str) {
        return rxa0.m21873j(merchandise, str);
    }

    /* JADX INFO: renamed from: at */
    public boolean m8213at() {
        return swh0.y();
    }

    /* JADX INFO: renamed from: b8 */
    public boolean m8214b8() {
        return false;
    }

    /* JADX INFO: renamed from: bf */
    public wx80 m8215bf(Privilege privilege) {
        return fy80.m14646l(privilege);
    }

    /* JADX INFO: renamed from: bg */
    public boolean m8216bg() {
        return false;
    }

    /* JADX INFO: renamed from: cf */
    public boolean m8217cf() {
        return false;
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m8218d4() {
        return false;
    }

    /* JADX INFO: renamed from: d6 */
    public String m8219d6(PurchaseType purchaseType) {
        return iab0.k(purchaseType);
    }

    /* JADX INFO: renamed from: d9 */
    public boolean m8220d9() {
        return false;
    }

    /* JADX INFO: renamed from: dh */
    public boolean m8221dh() {
        return g6a.h();
    }

    /* JADX INFO: renamed from: e */
    public boolean m8222e() {
        return false;
    }

    /* JADX INFO: renamed from: e2 */
    public boolean m8223e2() {
        return n3b0.q();
    }

    /* JADX INFO: renamed from: e8 */
    public void m8224e8(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3) {
        c.s0(act, str, privilege, e30Var, d30Var, d30Var2, d30Var3);
    }

    /* JADX INFO: renamed from: ej */
    public wx80 m8225ej(Privilege privilege) {
        return fy80.m14649o(privilege);
    }

    /* JADX INFO: renamed from: fj */
    public String m8226fj(String str) {
        return wi60.m().s(str);
    }

    /* JADX INFO: renamed from: fk */
    public Merchandise m8227fk(ProductCategory productCategory, String str) {
        return rxa0.m21869f(productCategory, str);
    }

    /* JADX INFO: renamed from: gr */
    public void m8228gr() {
        wi60.m().A();
    }

    public void init(Context context) {
    }

    /* JADX INFO: renamed from: je */
    public CharSequence m8229je(String str, Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        return we60.m24174l(str, act, merchandise, purchaseType, z);
    }

    /* JADX INFO: renamed from: kr */
    public boolean m8230kr() {
        return false;
    }

    /* JADX INFO: renamed from: lf */
    public void m8231lf(long j) {
        wi60.m().G(j);
    }

    /* JADX INFO: renamed from: na */
    public void m8232na(Act act, String str) {
        new fd5.e(act).j(n4i0.a(PurchaseType.TYPE_INTL_TTT_COIN)).d(str).c(1).l();
    }

    /* JADX INFO: renamed from: nb */
    public boolean m8233nb() {
        return swh0.p0().f1();
    }

    /* JADX INFO: renamed from: ng */
    public boolean m8234ng(String str, PayMethod payMethod, PurchaseType purchaseType) {
        return wi60.m().H(str, payMethod, purchaseType);
    }

    /* JADX INFO: renamed from: ok */
    public cwf0 m8235ok(PurchaseType purchaseType) {
        return swh0.N1(purchaseType);
    }

    /* JADX INFO: renamed from: om */
    public List<PayMethod> m8236om(String str, Merchandise merchandise, String str2) {
        return wi60.m().r(str, merchandise, str2);
    }

    /* JADX INFO: renamed from: ot */
    public void m8237ot(Act act, String str) {
        swh0.s1(act, str);
    }

    /* JADX INFO: renamed from: pj */
    public boolean m8238pj(String str, Merchandise merchandise) {
        return rxa0.m21885v(str, merchandise);
    }

    /* JADX INFO: renamed from: pk */
    public j760<Boolean, String> m8239pk(Coupon coupon) {
        return b1f.m11805c(coupon);
    }

    /* JADX INFO: renamed from: sb */
    public void m8240sb(boolean z) {
        swh0.p0().J0(z);
    }

    /* JADX INFO: renamed from: sm */
    public void m8241sm(Act act, String str, int i, e30<PurchaseType> e30Var) {
        swh0.n1(act, str, i, e30Var);
    }

    /* JADX INFO: renamed from: td */
    public void m8242td(Act act, final Merchandise merchandise, final PayMethod payMethod, final Boolean bool, final PurchaseType purchaseType, String str, String str2, String str3, final d30 d30Var) {
        final x5b0 x5b0Var = new x5b0(merchandise.category, PurchaseTrackPageType.none, str2);
        x5b0Var.p(str);
        x5b0Var.o(merchandise.category);
        x5b0Var.q(str3);
        dsa.C(act, x5b0Var.e(), new d30() { // from class: l.j6a
            public final void call() {
                CorePayServiceImpl.m8158H(x5b0Var, merchandise, payMethod, bool, purchaseType, d30Var);
            }
        }, new d30() { // from class: l.k6a
            public final void call() {
                hab0 hab0Var = x5b0Var;
                hab0Var.r(merchandise, payMethod, false, bool.booleanValue(), hab0Var.e(), purchaseType, false);
            }
        });
    }

    /* JADX INFO: renamed from: to */
    public void m8243to() {
        swh0.p0().S0();
    }

    /* JADX INFO: renamed from: v9 */
    public boolean m8244v9() {
        return g6a.q();
    }

    /* JADX INFO: renamed from: vt */
    public j760<Boolean, String> m8245vt(long j) {
        return wi60.m().l(j);
    }

    /* JADX INFO: renamed from: wg */
    public j760<Merchandise, Coupon> m8246wg() {
        return b1f.m11804a().m11810b();
    }

    /* JADX INFO: renamed from: wm */
    public void m8247wm(Act act, e30<Boolean> e30Var, List<Merchandise> list, String str, PayMethod payMethod, Object obj) {
        km80.h0(act, e30Var, list, str, obj);
    }

    /* JADX INFO: renamed from: wn */
    public void m8248wn(PurchaseType purchaseType) {
        cll0.b(purchaseType);
    }

    /* JADX INFO: renamed from: x7 */
    public void m8249x7(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3) {
        c.d0(act, str, privilege, e30Var, d30Var, d30Var2, d30Var3);
    }

    /* JADX INFO: renamed from: xj */
    public boolean m8250xj() {
        return g6a.m();
    }

    /* JADX INFO: renamed from: xn */
    public boolean m8251xn() {
        return g6a.s();
    }

    /* JADX INFO: renamed from: ya */
    public void m8252ya(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3) {
        c.W(act, str, privilege, e30Var, d30Var, d30Var2, d30Var3);
    }

    /* JADX INFO: renamed from: yc */
    public boolean m8253yc() {
        return g6a.k();
    }

    /* JADX INFO: renamed from: zl */
    public boolean m8254zl() {
        return swh0.I();
    }

    /* JADX INFO: renamed from: zr */
    public void m8255zr(Act act, String str) {
        kwo.l(act, str, (e30) null, (d30) null, (d30) null);
    }
}
