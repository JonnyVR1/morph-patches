package com.p051p1.mobile.putong.core.pay.module;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinAct;
import com.p051p1.mobile.putong.core.pay.module.CorePayServiceImpl;
import com.p051p1.mobile.putong.data.PayMethod;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p153l.a30;
import p153l.a5i0;
import p153l.a690;
import p153l.beb0;
import p153l.bn60;
import p153l.bo60;
import p153l.br60;
import p153l.dk90;
import p153l.du80;
import p153l.fe5;
import p153l.fp60;
import p153l.g2f;
import p153l.gul0;
import p153l.j690;
import p153l.kyo;
import p153l.l4g0;
import p153l.lib0;
import p153l.maf0;
import p153l.mib0;
import p153l.niw;
import p153l.o8n;
import p153l.ou80;
import p153l.p6b0;
import p153l.pf60;
import p153l.pta;
import p153l.pzi0;
import p153l.rbb0;
import p153l.s7a;
import p153l.tab0;
import p153l.v5b0;
import p153l.wci0;
import p153l.wn60;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
@Route(name = "CorePayInnerService", path = "/pay_service/service")
public class CorePayServiceImpl implements CorePayInnerService {
    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m45070H(lib0 lib0Var, Merchandise merchandise, PayMethod payMethod, Boolean bool, PurchaseType purchaseType, x20 x20Var) {
        lib0Var.m154341r(merchandise, payMethod, false, bool.booleanValue(), lib0Var.mo103692e(), purchaseType, true);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: A6 */
    public int mo35996A6(String str) {
        if (TextUtils.equals(str, CoreModule.m30933P().m143406b().mo36106Wh())) {
            return 27;
        }
        if (TextUtils.equals(str, CoreModule.m30933P().m143406b().mo36128tj())) {
            return 28;
        }
        if (TextUtils.equals(str, CoreModule.m30933P().m143406b().mo36126ra())) {
            return 29;
        }
        return TextUtils.equals(str, CoreModule.m30933P().m143406b().mo36113Zq()) ? 30 : 0;
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Ag */
    public long mo35997Ag() {
        return br60.m106057m().m106073p();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Am */
    public void mo35998Am(Act act, String str, y20<String> y20Var) {
        a5i0.m96171t1(act, str, y20Var);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Bk */
    public void mo35999Bk(Act act, String str, y20<PurchaseType> y20Var) {
        C8927c.m54631d1(act, str, y20Var);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Bl */
    public void mo36000Bl(PurchaseType purchaseType, Privilege privilege) {
        gul0.m132342g(purchaseType, privilege);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Cd */
    public List<Merchandise> mo36001Cd(ProductCategory productCategory) {
        return du80.m118106g().m118112e(productCategory);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Cg */
    public void mo36002Cg(Act act, y20<Boolean> y20Var, Merchandise merchandise, Coupon coupon, String str, PayMethod payMethod, Object obj) {
        p6b0.m170799T0(act, y20Var, merchandise, coupon, str, payMethod, obj);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Ci */
    public void mo36003Ci(Act act, Merchandise merchandise, PurchaseType purchaseType, PayMethod payMethod, String str, PendingPaymentGuidance pendingPaymentGuidance, Coupon coupon, String str2, y20<Integer> y20Var) {
        br60.m106057m().m106062E(act, merchandise, purchaseType, payMethod, str, pendingPaymentGuidance, coupon, str2, y20Var);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Cl */
    public boolean mo36004Cl() {
        return a5i0.m96103I1();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Cp */
    public void mo36005Cp(Act act, PurchaseType purchaseType, Merchandise merchandise, PayMethod payMethod, y20<PayMethod> y20Var) {
        new bo60(act, purchaseType).m105668r(payMethod).m105670t(tab0.m189811h().m189833x(merchandise)).m105667q(y20Var).m105669s();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: D7 */
    public boolean mo36006D7(String str) {
        return br60.m106057m().m106079v(str);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: D9 */
    public boolean mo36007D9() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Dq */
    public ArrayList<Privilege> mo36008Dq() {
        return j690.m143633y();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Ds */
    public void mo36009Ds(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var, x20 x20Var) {
        C8927c.m54661o0(act, str, privilege, y20Var, null, null, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Ed */
    public boolean mo36010Ed() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Fd */
    public boolean mo36011Fd() {
        return dk90.m116230i();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Fh */
    public int mo36012Fh() {
        return a5i0.m96151m0();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Fn */
    public void mo36013Fn(Act act) {
        new maf0(act).m157642b();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Fs */
    public boolean mo36014Fs() {
        return dk90.m116229h();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Gs */
    public void mo36015Gs(Act act, PurchaseType purchaseType, PayMethod payMethod, String str, List<PayMethod> list, y20<PayMethod> y20Var) {
        new bo60(act, purchaseType).m105668r(payMethod).m105670t(list).m105667q(y20Var).m105664n(!br60.m106057m().m106079v(str)).m105669s();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Hm */
    public a690 mo36016Hm(PurchaseType purchaseType, Privilege privilege) {
        return j690.m143621m(purchaseType, privilege);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: I8 */
    public void mo36017I8(PurchaseType purchaseType) {
        a5i0.m96110M1(purchaseType);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Jf */
    public String mo36018Jf(ProductCategory productCategory) {
        return br60.m106057m().m106071n(productCategory);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Kd */
    public void mo36019Kd(Act act, String str, a30<PurchaseType, Act, String> a30Var, x20 x20Var) {
        o8n.m166578A(act, str, a30Var, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Ki */
    public boolean mo36020Ki() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Ko */
    public void mo36021Ko() {
        a5i0.m96160p0().m96207V0();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Le */
    public boolean mo36022Le(Merchandise merchandise) {
        return v5b0.m199799y(merchandise);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Of */
    public boolean mo36023Of(Merchandise merchandise, String str) {
        return br60.m106057m().m106078u(merchandise, str);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Og */
    public void mo36024Og(Act act, String str, y20<PurchaseType> y20Var, x20 x20Var, x20 x20Var2, Privilege privilege) {
        C8927c.m54622a0(act, str, y20Var, x20Var, x20Var2, privilege);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: On */
    public C22421c<PaymentResultWrapper> mo36025On() {
        return fp60.m126543E();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Pc */
    public boolean mo36026Pc() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Pk */
    public void mo36027Pk(Act act, String str, y20<String> y20Var) {
        a5i0.m96176v1(act, str, y20Var);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Pr */
    public void mo36028Pr(PurchaseType purchaseType) {
        gul0.m132343h(purchaseType);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Qk */
    public int mo36029Qk() {
        return a5i0.m96123X();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Qs */
    public void mo36030Qs(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var, x20 x20Var, x20 x20Var2, x20 x20Var3) {
        C8927c.m54607R0(act, str, privilege, y20Var, x20Var, x20Var2, x20Var3);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: S7 */
    public List<Merchandise> mo36031S7(boolean z) {
        return du80.m118106g().m118111d(z);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: S9 */
    public boolean mo36032S9() {
        return a5i0.m96096G();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Sb */
    public String mo36033Sb(Merchandise merchandise, PayMethod payMethod, boolean z, boolean z2, String str, String str2) {
        beb0 beb0Var = new beb0(merchandise.category, PurchaseTrackPageType.none, str);
        beb0Var.m154339p(str2);
        beb0Var.m154345w(merchandise, payMethod, z, z2);
        return beb0Var.getPurchaseTrackId();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Sj */
    public boolean mo36034Sj() {
        return s7a.m184987p();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: To */
    public void mo36035To(PurchaseType purchaseType, Act act, String str, boolean z, boolean z2, String str2, String str3, @Nullable y20<Integer> y20Var) {
        wn60 wn60Var = new wn60(purchaseType, act, str, "");
        wn60Var.m207144C(niw.m163315e(CoreModule.m30929H().userId() + pzi0.m174454o()));
        if (!TextUtils.isEmpty(str3)) {
            wn60Var.m207167r(str3);
        }
        if (z) {
            wn60Var.m207150I(z2, str2, y20Var);
        } else {
            wn60Var.m207164o(str2, z2, y20Var);
        }
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Uk */
    public String mo36036Uk(String str) {
        return br60.m106057m().m106077t(str, true);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Va */
    public void mo36037Va() {
        a5i0.m96160p0().m96199Q();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Wa */
    public boolean mo36038Wa() {
        return s7a.m184997z();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Wi */
    public boolean mo36039Wi() {
        return a5i0.m96160p0().m96219h1();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Xa */
    public int mo36040Xa() {
        return a5i0.m96122W();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Xe */
    public void mo36041Xe() {
        a5i0.m96160p0().m96209X0();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Y4 */
    public int mo36042Y4() {
        return rbb0.m180739l();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Ya */
    public boolean mo36043Ya() {
        return a5i0.m96160p0().m96226u();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Yi */
    public List<String> mo36044Yi() {
        return rbb0.m180738k();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Yl */
    public boolean mo36045Yl() {
        return a5i0.m96160p0().m96214c1();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Z7 */
    public String mo36046Z7(Coupon coupon) {
        return g2f.m128612d(coupon);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Zn */
    public boolean mo36047Zn(Act act) {
        return act instanceof TanTanCoinAct;
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: Zs */
    public boolean mo36048Zs(Merchandise merchandise) {
        return v5b0.m199797w(merchandise);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: ae */
    public boolean mo36049ae(Merchandise merchandise, String str) {
        return v5b0.m199784j(merchandise, str);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: at */
    public boolean mo36050at() {
        return a5i0.m96183y();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: b8 */
    public boolean mo36051b8() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: bf */
    public a690 mo36052bf(Privilege privilege) {
        return j690.m143620l(privilege);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: bg */
    public boolean mo36053bg() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: cf */
    public boolean mo36054cf() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: d4 */
    public boolean mo36055d4() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: d6 */
    public String mo36056d6(PurchaseType purchaseType) {
        return mib0.m158482k(purchaseType);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: d9 */
    public boolean mo36057d9() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: dh */
    public boolean mo36058dh() {
        return s7a.m184979h();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: e */
    public boolean mo36059e() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: e2 */
    public boolean mo36060e2() {
        return rbb0.m180744q();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: e8 */
    public void mo36061e8(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var, x20 x20Var, x20 x20Var2, x20 x20Var3) {
        C8927c.m54673s0(act, str, privilege, y20Var, x20Var, x20Var2, x20Var3);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: ej */
    public a690 mo36062ej(Privilege privilege) {
        return j690.m143623o(privilege);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: fj */
    public String mo36063fj(String str) {
        return br60.m106057m().m106076s(str);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: fk */
    public Merchandise mo36064fk(ProductCategory productCategory, String str) {
        return v5b0.m199780f(productCategory, str);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: gr */
    public void mo36065gr() {
        br60.m106057m().m106058A();
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: je */
    public CharSequence mo36066je(String str, Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        return bn60.m105353l(str, act, merchandise, purchaseType, z);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: kr */
    public boolean mo36067kr() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: lf */
    public void mo36068lf(long j) {
        br60.m106057m().m106064G(j);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: na */
    public void mo36069na(Act act, String str) {
        new fe5.C16962e(act).m125281j(wci0.m205820a(PurchaseType.TYPE_INTL_TTT_COIN)).m125275d(str).m125274c(1).m125283l();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: nb */
    public boolean mo36070nb() {
        return a5i0.m96160p0().m96217f1();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: ng */
    public boolean mo36071ng(String str, PayMethod payMethod, PurchaseType purchaseType) {
        return br60.m106057m().m106065H(str, payMethod, purchaseType);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: ok */
    public l4g0 mo36072ok(PurchaseType purchaseType) {
        return a5i0.m96112N1(purchaseType);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: om */
    public List<PayMethod> mo36073om(String str, Merchandise merchandise, String str2) {
        return br60.m106057m().m106075r(str, merchandise, str2);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: ot */
    public void mo36074ot(Act act, String str) {
        a5i0.m96169s1(act, str);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: pj */
    public boolean mo36075pj(String str, Merchandise merchandise) {
        return v5b0.m199796v(str, merchandise);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: pk */
    public pf60<Boolean, String> mo36076pk(Coupon coupon) {
        return g2f.m128611c(coupon);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: sb */
    public void mo36077sb(boolean z) {
        a5i0.m96160p0().m96191J0(z);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: sm */
    public void mo36078sm(Act act, String str, int i, y20<PurchaseType> y20Var) {
        a5i0.m96155n1(act, str, i, y20Var);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: td */
    public void mo36079td(Act act, final Merchandise merchandise, final PayMethod payMethod, final Boolean bool, final PurchaseType purchaseType, String str, String str2, String str3, final x20 x20Var) {
        final beb0 beb0Var = new beb0(merchandise.category, PurchaseTrackPageType.none, str2);
        beb0Var.m154339p(str);
        beb0Var.m154338o(merchandise.category);
        beb0Var.m154340q(str3);
        pta.m173706C(act, beb0Var.mo103692e(), new x20() { // from class: l.v7a
            @Override // p153l.x20
            public final void call() {
                CorePayServiceImpl.m45070H(beb0Var, merchandise, payMethod, bool, purchaseType, x20Var);
            }
        }, new x20() { // from class: l.w7a
            @Override // p153l.x20
            public final void call() {
                lib0 lib0Var = beb0Var;
                lib0Var.m154341r(merchandise, payMethod, false, bool.booleanValue(), lib0Var.mo103692e(), purchaseType, false);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: to */
    public void mo36080to() {
        a5i0.m96160p0().m96204S0();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: v9 */
    public boolean mo36081v9() {
        return s7a.m184988q();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: vt */
    public pf60<Boolean, String> mo36082vt(long j) {
        return br60.m106057m().m106070l(j);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: wg */
    public pf60<Merchandise, Coupon> mo36083wg() {
        return g2f.m128610a().m128616b();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: wm */
    public void mo36084wm(Act act, y20<Boolean> y20Var, List<Merchandise> list, String str, PayMethod payMethod, Object obj) {
        ou80.m169253h0(act, y20Var, list, str, obj);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: wn */
    public void mo36085wn(PurchaseType purchaseType) {
        gul0.m132337b(purchaseType);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: x7 */
    public void mo36086x7(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var, x20 x20Var, x20 x20Var2, x20 x20Var3) {
        C8927c.m54630d0(act, str, privilege, y20Var, x20Var, x20Var2, x20Var3);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: xj */
    public boolean mo36087xj() {
        return s7a.m184984m();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: xn */
    public boolean mo36088xn() {
        return s7a.m184990s();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: ya */
    public void mo36089ya(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var, x20 x20Var, x20 x20Var2, x20 x20Var3) {
        C8927c.m54615W(act, str, privilege, y20Var, x20Var, x20Var2, x20Var3);
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: yc */
    public boolean mo36090yc() {
        return s7a.m184982k();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: zl */
    public boolean mo36091zl() {
        return a5i0.m96102I();
    }

    @Override // com.p051p1.mobile.putong.core.biz.service.CorePayInnerService
    /* JADX INFO: renamed from: zr */
    public void mo36092zr(Act act, String str) {
        kyo.m152056l(act, str, null, null, null);
    }
}
