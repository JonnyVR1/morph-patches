package com.p046p1.mobile.putong.core.pay.module;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinAct;
import com.p046p1.mobile.putong.core.pay.module.CorePayServiceImpl;
import com.p046p1.mobile.putong.data.PayMethod;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p149l.ah60;
import p149l.b1f;
import p149l.cll0;
import p149l.cwf0;
import p149l.d30;
import p149l.dsa;
import p149l.e30;
import p149l.f2f0;
import p149l.fd5;
import p149l.fy80;
import p149l.g30;
import p149l.g6a;
import p149l.hab0;
import p149l.iab0;
import p149l.j760;
import p149l.km80;
import p149l.kwo;
import p149l.lya0;
import p149l.mqi0;
import p149l.n3b0;
import p149l.n4i0;
import p149l.o6n;
import p149l.ogw;
import p149l.p2b0;
import p149l.rf60;
import p149l.rxa0;
import p149l.swh0;
import p149l.we60;
import p149l.wf60;
import p149l.wi60;
import p149l.wx80;
import p149l.x5b0;
import p149l.zb90;
import p149l.zl80;

/* JADX INFO: loaded from: classes11.dex */
@Route(name = "CorePayInnerService", path = "/pay_service/service")
public class CorePayServiceImpl implements CorePayInnerService {
    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m43884H(hab0 hab0Var, Merchandise merchandise, PayMethod payMethod, Boolean bool, PurchaseType purchaseType, d30 d30Var) {
        hab0Var.m130119r(merchandise, payMethod, false, bool.booleanValue(), hab0Var.mo130106e(), purchaseType, true);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: A6 */
    public int mo34993A6(String str) {
        if (TextUtils.equals(str, CoreModule.m29935P().m94652b().mo35103Wh())) {
            return 27;
        }
        if (TextUtils.equals(str, CoreModule.m29935P().m94652b().mo35125tj())) {
            return 28;
        }
        if (TextUtils.equals(str, CoreModule.m29935P().m94652b().mo35123ra())) {
            return 29;
        }
        return TextUtils.equals(str, CoreModule.m29935P().m94652b().mo35110Zq()) ? 30 : 0;
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Ag */
    public long mo34994Ag() {
        return wi60.m203291m().m203307p();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Am */
    public void mo34995Am(Act act, String str, e30<String> e30Var) {
        swh0.m186266t1(act, str, e30Var);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Bk */
    public void mo34996Bk(Act act, String str, e30<PurchaseType> e30Var) {
        C8764c.m53448d1(act, str, e30Var);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Bl */
    public void mo34997Bl(PurchaseType purchaseType, Privilege privilege) {
        cll0.m107560g(purchaseType, privilege);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Cd */
    public List<Merchandise> mo34998Cd(ProductCategory productCategory) {
        return zl80.m219252g().m219258e(productCategory);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Cg */
    public void mo34999Cg(Act act, e30<Boolean> e30Var, Merchandise merchandise, Coupon coupon, String str, PayMethod payMethod, Object obj) {
        lya0.m152183T0(act, e30Var, merchandise, coupon, str, payMethod, obj);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Ci */
    public void mo35000Ci(Act act, Merchandise merchandise, PurchaseType purchaseType, PayMethod payMethod, String str, PendingPaymentGuidance pendingPaymentGuidance, Coupon coupon, String str2, e30<Integer> e30Var) {
        wi60.m203291m().m203296E(act, merchandise, purchaseType, payMethod, str, pendingPaymentGuidance, coupon, str2, e30Var);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Cl */
    public boolean mo35001Cl() {
        return swh0.m186198I1();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Cp */
    public void mo35002Cp(Act act, PurchaseType purchaseType, Merchandise merchandise, PayMethod payMethod, e30<PayMethod> e30Var) {
        new wf60(act, purchaseType).m202975r(payMethod).m202977t(p2b0.m167133h().m167155x(merchandise)).m202974q(e30Var).m202976s();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: D7 */
    public boolean mo35003D7(String str) {
        return wi60.m203291m().m203313v(str);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: D9 */
    public boolean mo35004D9() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Dq */
    public ArrayList<Privilege> mo35005Dq() {
        return fy80.m123729y();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Ds */
    public void mo35006Ds(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var) {
        C8764c.m53478o0(act, str, privilege, e30Var, null, null, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Ed */
    public boolean mo35007Ed() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Fd */
    public boolean mo35008Fd() {
        return zb90.m217832i();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Fh */
    public int mo35009Fh() {
        return swh0.m186246m0();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Fn */
    public void mo35010Fn(Act act) {
        new f2f0(act).m119183b();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Fs */
    public boolean mo35011Fs() {
        return zb90.m217831h();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Gs */
    public void mo35012Gs(Act act, PurchaseType purchaseType, PayMethod payMethod, String str, List<PayMethod> list, e30<PayMethod> e30Var) {
        new wf60(act, purchaseType).m202975r(payMethod).m202977t(list).m202974q(e30Var).m202971n(!wi60.m203291m().m203313v(str)).m202976s();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Hm */
    public wx80 mo35013Hm(PurchaseType purchaseType, Privilege privilege) {
        return fy80.m123717m(purchaseType, privilege);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: I8 */
    public void mo35014I8(PurchaseType purchaseType) {
        swh0.m186205M1(purchaseType);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Jf */
    public String mo35015Jf(ProductCategory productCategory) {
        return wi60.m203291m().m203305n(productCategory);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Kd */
    public void mo35016Kd(Act act, String str, g30<PurchaseType, Act, String> g30Var, d30 d30Var) {
        o6n.m162887A(act, str, g30Var, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Ki */
    public boolean mo35017Ki() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Ko */
    public void mo35018Ko() {
        swh0.m186255p0().m186302V0();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Le */
    public boolean mo35019Le(Merchandise merchandise) {
        return rxa0.m181504y(merchandise);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Of */
    public boolean mo35020Of(Merchandise merchandise, String str) {
        return wi60.m203291m().m203312u(merchandise, str);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Og */
    public void mo35021Og(Act act, String str, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, Privilege privilege) {
        C8764c.m53439a0(act, str, e30Var, d30Var, d30Var2, privilege);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: On */
    public C22306c<PaymentResultWrapper> mo35022On() {
        return ah60.m96370E();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Pc */
    public boolean mo35023Pc() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Pk */
    public void mo35024Pk(Act act, String str, e30<String> e30Var) {
        swh0.m186271v1(act, str, e30Var);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Pr */
    public void mo35025Pr(PurchaseType purchaseType) {
        cll0.m107561h(purchaseType);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Qk */
    public int mo35026Qk() {
        return swh0.m186218X();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Qs */
    public void mo35027Qs(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3) {
        C8764c.m53424R0(act, str, privilege, e30Var, d30Var, d30Var2, d30Var3);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: S7 */
    public List<Merchandise> mo35028S7(boolean z) {
        return zl80.m219252g().m219257d(z);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: S9 */
    public boolean mo35029S9() {
        return swh0.m186191G();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Sb */
    public String mo35030Sb(Merchandise merchandise, PayMethod payMethod, boolean z, boolean z2, String str, String str2) {
        x5b0 x5b0Var = new x5b0(merchandise.category, PurchaseTrackPageType.none, str);
        x5b0Var.m130117p(str2);
        x5b0Var.m130123w(merchandise, payMethod, z, z2);
        return x5b0Var.getPurchaseTrackId();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Sj */
    public boolean mo35031Sj() {
        return g6a.m124567p();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: To */
    public void mo35032To(PurchaseType purchaseType, Act act, String str, boolean z, boolean z2, String str2, String str3, @Nullable e30<Integer> e30Var) {
        rf60 rf60Var = new rf60(purchaseType, act, str, "");
        rf60Var.m179078C(ogw.m164284e(CoreModule.m29931H().userId() + mqi0.m155944o()));
        if (!TextUtils.isEmpty(str3)) {
            rf60Var.m179101r(str3);
        }
        if (z) {
            rf60Var.m179084I(z2, str2, e30Var);
        } else {
            rf60Var.m179098o(str2, z2, e30Var);
        }
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Uk */
    public String mo35033Uk(String str) {
        return wi60.m203291m().m203311t(str, true);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Va */
    public void mo35034Va() {
        swh0.m186255p0().m186294Q();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Wa */
    public boolean mo35035Wa() {
        return g6a.m124577z();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Wi */
    public boolean mo35036Wi() {
        return swh0.m186255p0().m186314h1();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Xa */
    public int mo35037Xa() {
        return swh0.m186217W();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Xe */
    public void mo35038Xe() {
        swh0.m186255p0().m186304X0();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Y4 */
    public int mo35039Y4() {
        return n3b0.m157737l();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Ya */
    public boolean mo35040Ya() {
        return swh0.m186255p0().m186321u();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Yi */
    public List<String> mo35041Yi() {
        return n3b0.m157736k();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Yl */
    public boolean mo35042Yl() {
        return swh0.m186255p0().m186309c1();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Z7 */
    public String mo35043Z7(Coupon coupon) {
        return b1f.m99831d(coupon);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Zn */
    public boolean mo35044Zn(Act act) {
        return act instanceof TanTanCoinAct;
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Zs */
    public boolean mo35045Zs(Merchandise merchandise) {
        return rxa0.m181502w(merchandise);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: ae */
    public boolean mo35046ae(Merchandise merchandise, String str) {
        return rxa0.m181489j(merchandise, str);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: at */
    public boolean mo35047at() {
        return swh0.m186278y();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: b8 */
    public boolean mo35048b8() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: bf */
    public wx80 mo35049bf(Privilege privilege) {
        return fy80.m123716l(privilege);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: bg */
    public boolean mo35050bg() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: cf */
    public boolean mo35051cf() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: d4 */
    public boolean mo35052d4() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: d6 */
    public String mo35053d6(PurchaseType purchaseType) {
        return iab0.m135150k(purchaseType);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: d9 */
    public boolean mo35054d9() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: dh */
    public boolean mo35055dh() {
        return g6a.m124559h();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: e */
    public boolean mo35056e() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: e2 */
    public boolean mo35057e2() {
        return n3b0.m157742q();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: e8 */
    public void mo35058e8(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3) {
        C8764c.m53490s0(act, str, privilege, e30Var, d30Var, d30Var2, d30Var3);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: ej */
    public wx80 mo35059ej(Privilege privilege) {
        return fy80.m123719o(privilege);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: fj */
    public String mo35060fj(String str) {
        return wi60.m203291m().m203310s(str);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: fk */
    public Merchandise mo35061fk(ProductCategory productCategory, String str) {
        return rxa0.m181485f(productCategory, str);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: gr */
    public void mo35062gr() {
        wi60.m203291m().m203292A();
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: je */
    public CharSequence mo35063je(String str, Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        return we60.m202871l(str, act, merchandise, purchaseType, z);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: kr */
    public boolean mo35064kr() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: lf */
    public void mo35065lf(long j) {
        wi60.m203291m().m203298G(j);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: na */
    public void mo35066na(Act act, String str) {
        new fd5.C16808e(act).m120958j(n4i0.m157865a(PurchaseType.TYPE_INTL_TTT_COIN)).m120952d(str).m120951c(1).m120960l();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: nb */
    public boolean mo35067nb() {
        return swh0.m186255p0().m186312f1();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: ng */
    public boolean mo35068ng(String str, PayMethod payMethod, PurchaseType purchaseType) {
        return wi60.m203291m().m203299H(str, payMethod, purchaseType);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: ok */
    public cwf0 mo35069ok(PurchaseType purchaseType) {
        return swh0.m186207N1(purchaseType);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: om */
    public List<PayMethod> mo35070om(String str, Merchandise merchandise, String str2) {
        return wi60.m203291m().m203309r(str, merchandise, str2);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: ot */
    public void mo35071ot(Act act, String str) {
        swh0.m186264s1(act, str);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: pj */
    public boolean mo35072pj(String str, Merchandise merchandise) {
        return rxa0.m181501v(str, merchandise);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: pk */
    public j760<Boolean, String> mo35073pk(Coupon coupon) {
        return b1f.m99830c(coupon);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: sb */
    public void mo35074sb(boolean z) {
        swh0.m186255p0().m186286J0(z);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: sm */
    public void mo35075sm(Act act, String str, int i, e30<PurchaseType> e30Var) {
        swh0.m186250n1(act, str, i, e30Var);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: td */
    public void mo35076td(Act act, final Merchandise merchandise, final PayMethod payMethod, final Boolean bool, final PurchaseType purchaseType, String str, String str2, String str3, final d30 d30Var) {
        final x5b0 x5b0Var = new x5b0(merchandise.category, PurchaseTrackPageType.none, str2);
        x5b0Var.m130117p(str);
        x5b0Var.m130116o(merchandise.category);
        x5b0Var.m130118q(str3);
        dsa.m113426C(act, x5b0Var.mo130106e(), new d30() { // from class: l.j6a
            @Override // p149l.d30
            public final void call() {
                CorePayServiceImpl.m43884H(x5b0Var, merchandise, payMethod, bool, purchaseType, d30Var);
            }
        }, new d30() { // from class: l.k6a
            @Override // p149l.d30
            public final void call() {
                hab0 hab0Var = x5b0Var;
                hab0Var.m130119r(merchandise, payMethod, false, bool.booleanValue(), hab0Var.mo130106e(), purchaseType, false);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: to */
    public void mo35077to() {
        swh0.m186255p0().m186299S0();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: v9 */
    public boolean mo35078v9() {
        return g6a.m124568q();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: vt */
    public j760<Boolean, String> mo35079vt(long j) {
        return wi60.m203291m().m203304l(j);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: wg */
    public j760<Merchandise, Coupon> mo35080wg() {
        return b1f.m99829a().m99835b();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: wm */
    public void mo35081wm(Act act, e30<Boolean> e30Var, List<Merchandise> list, String str, PayMethod payMethod, Object obj) {
        km80.m146459h0(act, e30Var, list, str, obj);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: wn */
    public void mo35082wn(PurchaseType purchaseType) {
        cll0.m107555b(purchaseType);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: x7 */
    public void mo35083x7(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3) {
        C8764c.m53447d0(act, str, privilege, e30Var, d30Var, d30Var2, d30Var3);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: xj */
    public boolean mo35084xj() {
        return g6a.m124564m();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: xn */
    public boolean mo35085xn() {
        return g6a.m124570s();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: ya */
    public void mo35086ya(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3) {
        C8764c.m53432W(act, str, privilege, e30Var, d30Var, d30Var2, d30Var3);
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: yc */
    public boolean mo35087yc() {
        return g6a.m124562k();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: zl */
    public boolean mo35088zl() {
        return swh0.m186197I();
    }

    @Override // com.p046p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: zr */
    public void mo35089zr(Act act, String str) {
        kwo.m147617l(act, str, null, null, null);
    }
}
