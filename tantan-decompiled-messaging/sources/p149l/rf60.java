package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SignPaymentParam;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class rf60 {

    /* JADX INFO: renamed from: a */
    public PurchaseType f159109a;

    /* JADX INFO: renamed from: b */
    public final Act f159110b;

    /* JADX INFO: renamed from: c */
    public final String f159111c;

    /* JADX INFO: renamed from: d */
    public C8765d f159112d;

    /* JADX INFO: renamed from: e */
    public Privilege f159113e;

    /* JADX INFO: renamed from: f */
    public String f159114f;

    /* JADX INFO: renamed from: g */
    public f1m f159115g;

    /* JADX INFO: renamed from: j */
    public String f159118j;

    /* JADX INFO: renamed from: l */
    public Merchandise f159120l;

    /* JADX INFO: renamed from: n */
    public String f159122n;

    /* JADX INFO: renamed from: o */
    public String f159123o;

    /* JADX INFO: renamed from: p */
    public boolean f159124p;

    /* JADX INFO: renamed from: q */
    public boolean f159125q;

    /* JADX INFO: renamed from: h */
    public boolean f159116h = true;

    /* JADX INFO: renamed from: i */
    public boolean f159117i = false;

    /* JADX INFO: renamed from: k */
    public boolean f159119k = false;

    /* JADX INFO: renamed from: m */
    public String f159121m = ogw.m164284e(CoreModule.m29931H().userId() + mqi0.m155944o());

    /* JADX INFO: renamed from: r */
    public boolean f159126r = false;

    public rf60(PurchaseType purchaseType, Act act, String str, Object obj) {
        this.f159109a = purchaseType;
        this.f159110b = act;
        this.f159111c = str;
    }

    /* JADX INFO: renamed from: A */
    public void m179076A(String str) {
        this.f159122n = str;
    }

    /* JADX INFO: renamed from: B */
    public rf60 m179077B(f1m f1mVar) {
        this.f159115g = f1mVar;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public void m179078C(@Nullable String str) {
        this.f159121m = str;
    }

    /* JADX INFO: renamed from: D */
    public void m179079D(boolean z) {
        this.f159116h = z;
    }

    /* JADX INFO: renamed from: E */
    public void m179080E(Act act, final String str, String str2, final e30<Integer> e30Var) {
        String string;
        ArrayList arrayList = new ArrayList();
        if (sab0.m182901s(this.f159109a)) {
            string = act.getString(R$string.f27598s7, str2);
        } else {
            PurchaseType purchaseType = this.f159109a;
            if (purchaseType == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS) {
                string = "微信购买年费闪聊特权暂无优惠且不可连续包年，每个月" + str2 + "元";
            } else if (sab0.m182899q(purchaseType)) {
                string = "微信购买年费“SVIP超级会员”暂无优惠且不可连续包年，每个月" + str2 + "元";
            } else {
                string = act.getString(R$string.f27644w9, str2);
            }
        }
        String string2 = act.getString(R$string.f27666y9);
        String string3 = act.getString(R$string.f27655x9);
        arrayList.add(str2);
        new xh0.C21150a(act).m208731j(i0g0.m133861b0(string, arrayList, act.color(b1c0.f72559l), eqh0.m117752c(3))).m208739r(string2).m208736o(new View.OnClickListener() { // from class: l.pf60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148529a.m179095l(e30Var, str, view);
            }
        }).m208727f(string3).m208724c(new View.OnClickListener() { // from class: l.qf60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154089a.m179096m(e30Var, view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: F */
    public final void m179081F(Act act, String str, e30<Integer> e30Var) {
        String strValueOf;
        if (NullChecker.m81303a(this.f159112d.m53522d())) {
            strValueOf = String.valueOf(this.f159112d.m53522d().m53601s().defaultStockKeepUnit.prices.unitPrice);
        } else {
            strValueOf = NullChecker.m81303a(this.f159120l) ? String.valueOf(this.f159120l.defaultStockKeepUnit.prices.unitPrice) : "";
        }
        m179080E(act, str, strValueOf, e30Var);
    }

    /* JADX INFO: renamed from: G */
    public void m179082G(PayMethod payMethod, String str, e30<Integer> e30Var) {
        C4732c c4732c = CoreModule.f17545c;
        c4732c.f19654j0.f19290c0.put(Boolean.valueOf(c4732c.f19639e0.m169527p9().isVIP()));
        SignPaymentParam signPaymentParamM214468b = new yf60(this.f159109a).m214474h(str).m214481o(CoreModule.m29935P().m94651a().mo33425U() && TEnum.equals(payMethod, "alipay") && this.f159116h && CoreModule.m29935P().m94651a().mo33283Ab(this.f159109a) && g6a.m124558g(this.f159111c, this.f159113e)).m214472f(CoreModule.m29935P().m94651a().mo33349K4() && this.f159117i).m214471e(this.f159118j).m214480n(CoreModule.f17545c.f19654j0.m30596M4(str)).m214479m(this.f159119k).m214476j(this.f159114f).m214473g(this.f159123o).m214477k(this.f159122n).m214468b();
        signPaymentParamM214468b.setPurchaseTrackId(this.f159121m);
        f5f0 f5f0VarM124518a = new g5f0().m124519b(this.f159113e).m124522e(signPaymentParamM214468b).m124521d(payMethod).m124518a();
        m179097n();
        boolean zM179094k = m179094k(payMethod);
        Act act = this.f159110b;
        if (zM179094k) {
            sd60.m183449C(act, payMethod, f5f0VarM124518a, this.f159109a);
        } else {
            sd60.m183450E(act, payMethod, f5f0VarM124518a, this.f159109a);
        }
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m179083H(String str, e30<Integer> e30Var) {
        if (ura.m195053e().m195057d().mo33848ib()) {
            osi0.m165783g("账号已冻结，功能受限");
            hab0.INSTANCE.m130127a(this.f159121m, str, "user block");
            return;
        }
        SignPaymentParam signPaymentParamM214468b = new yf60(this.f159109a).m214474h(str).m214481o(CoreModule.m29935P().m94651a().mo33283Ab(this.f159109a) && g6a.m124558g(this.f159111c, this.f159113e)).m214472f(CoreModule.m29935P().m94651a().mo33349K4() && this.f159117i).m214471e(this.f159118j).m214476j(this.f159114f).m214479m(this.f159119k).m214480n(CoreModule.f17545c.f19654j0.m30596M4(str)).m214473g(this.f159123o).m214477k(this.f159122n).m214468b();
        signPaymentParamM214468b.setPurchaseTrackId(this.f159121m);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(0);
        }
        we60.m202856U(this.f159110b);
        f5f0 f5f0VarM124518a = new g5f0().m124519b(this.f159113e).m124520c(true).m124522e(signPaymentParamM214468b).m124521d(PayMethod.get("alipay")).m124518a();
        m179097n();
        boolean zM179094k = m179094k(PayMethod.get("alipay"));
        Act act = this.f159110b;
        if (zM179094k) {
            sd60.m183449C(act, PayMethod.get("alipay"), f5f0VarM124518a, this.f159109a);
        } else {
            sd60.m183450E(act, PayMethod.get("alipay"), f5f0VarM124518a, this.f159109a);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m179084I(boolean z, String str, e30<Integer> e30Var) {
        if (z) {
            if (sd60.m183465p()) {
                m179082G(PayMethod.get("wechat"), str, e30Var);
                return;
            } else {
                hab0.INSTANCE.m130133g(this.f159121m, str, "wx not install");
                return;
            }
        }
        if (m179087d() && !CoreModule.f17545c.f19591O0.m30086u3(this.f159109a)) {
            m179083H(str, e30Var);
        } else if (sd60.m183460k()) {
            m179082G(PayMethod.get("alipay"), str, e30Var);
        } else {
            hab0.INSTANCE.m130127a(this.f159121m, str, "alipay not install");
        }
    }

    /* JADX INFO: renamed from: J */
    public boolean m179085J(boolean z) {
        if (z && this.f159112d.m53526h()) {
            return true;
        }
        return !z && this.f159112d.m53527i();
    }

    /* JADX INFO: renamed from: c */
    public void m179086c(String str, e30<Integer> e30Var) {
        m179099p(PayMethod.get("alipay"), str, e30Var);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m179087d() {
        return ((CoreModule.m29935P().m94651a().mo158371f() && sab0.m182891i(this.f159109a)) || sab0.m182898p(this.f159109a) || sab0.m182892j(this.f159109a) || !this.f159116h || !CoreModule.m29935P().m94651a().mo33524j3()) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public String m179088e() {
        if (!NullChecker.m81303a(this.f159112d)) {
            return null;
        }
        boolean zM53531m = this.f159112d.m53531m();
        C8765d c8765d = this.f159112d;
        C8765d.a aVarM53520b = zM53531m ? c8765d.m53520b() : c8765d.m53522d();
        if (NullChecker.m81303a(aVarM53520b)) {
            return aVarM53520b.m53601s().defaultStockKeepUnit.f20507id;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public String m179089f(e30<Integer> e30Var) {
        if (!NullChecker.m81303a(this.f159112d)) {
            return "";
        }
        boolean zM53531m = this.f159112d.m53531m();
        C8765d c8765d = this.f159112d;
        C8765d.a aVarM53520b = zM53531m ? c8765d.m53520b() : c8765d.m53522d();
        if (!NullChecker.m81303a(aVarM53520b)) {
            return "";
        }
        String str = aVarM53520b.m53601s().defaultStockKeepUnit.f20507id;
        m179100q(m179085J(zM53531m), aVarM53520b.m53601s());
        if (zM53531m) {
            m179083H(str, e30Var);
            return str;
        }
        m179086c(str, e30Var);
        return str;
    }

    /* JADX INFO: renamed from: g */
    public String m179090g(e30<Integer> e30Var) {
        if (m179087d()) {
            return m179089f(e30Var);
        }
        if (NullChecker.m81303a(this.f159112d)) {
            boolean zM53532n = this.f159112d.m53532n();
            C8765d c8765d = this.f159112d;
            C8765d.a aVarM53520b = zM53532n ? c8765d.m53520b() : c8765d.m53522d();
            if (NullChecker.m81303a(aVarM53520b)) {
                String str = aVarM53520b.m53601s().defaultStockKeepUnit.f20507id;
                m179100q(m179085J(zM53532n), aVarM53520b.m53601s());
                if (!zM53532n) {
                    m179099p(PayMethod.get("alipay"), str, e30Var);
                    return str;
                }
                if (sd60.m183460k()) {
                    m179082G(PayMethod.get("alipay"), str, e30Var);
                    return str;
                }
                zvf0.m220371D("e_purchase_order_response", "p_purchase_page", vwb.m200311Y("skuID", ""), vwb.m200311Y("platform", "alipay"), vwb.m200311Y("code", 202001), vwb.m200311Y("contract_id", ""), vwb.m200311Y("order_type", "contract"), vwb.m200311Y("error_message", "alipay not install"));
                hab0.INSTANCE.m130127a(this.f159121m, m179088e(), "alipay not install");
                return str;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: h */
    public String m179091h(e30<Integer> e30Var) {
        if (!NullChecker.m81303a(this.f159112d)) {
            return "";
        }
        C8765d.a aVarM53522d = this.f159112d.m53522d();
        if (!NullChecker.m81303a(aVarM53522d)) {
            return "";
        }
        String str = aVarM53522d.m53601s().defaultStockKeepUnit.f20507id;
        if (g6a.m124565n()) {
            m179100q(m179085J(false), aVarM53522d.m53601s());
        } else if (m179085J(false)) {
            osi0.m165778b("京东支付暂不享受优惠，将以原价购买");
        }
        m179099p(PayMethod.get(PayMethod.jingdong), str, e30Var);
        return str;
    }

    /* JADX INFO: renamed from: i */
    public void m179092i(e30<Integer> e30Var, Merchandise merchandise) {
        if (NullChecker.m81303a(merchandise)) {
            m179099p(PayMethod.get(PayMethod.jingdong), merchandise.defaultStockKeepUnit.f20507id, e30Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (p149l.sab0.m182899q(r1) == false) goto L26;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m179093j(p149l.e30<java.lang.Integer> r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.rf60.m179093j(l.e30):java.lang.String");
    }

    /* JADX INFO: renamed from: k */
    public final boolean m179094k(PayMethod payMethod) {
        return this.f159124p || !this.f159125q;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m179095l(e30 e30Var, String str, View view) {
        if (NullChecker.m81303a(e30Var) && !TextUtils.isEmpty(this.f159111c) && wek0.f185947a.equals(this.f159111c)) {
            e30Var.call(3);
        }
        if (sd60.m183460k()) {
            m179082G(PayMethod.get("alipay"), str, e30Var);
        } else {
            zvf0.m220371D("e_purchase_order_response", "p_purchase_page", vwb.m200311Y("skuID", ""), vwb.m200311Y("platform", "alipay"), vwb.m200311Y("code", 202001), vwb.m200311Y("contract_id", ""), vwb.m200311Y("order_type", "contract"), vwb.m200311Y("error_message", "alipay not install"));
            hab0.INSTANCE.m130127a(this.f159121m, str, "alipay not install");
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m179096m(e30 e30Var, View view) {
        String str;
        if (NullChecker.m81303a(this.f159112d.m53522d())) {
            str = this.f159112d.m53522d().m53601s().defaultStockKeepUnit.f20507id;
        } else {
            str = NullChecker.m81303a(this.f159120l) ? this.f159120l.defaultStockKeepUnit.f20507id : "";
        }
        if (NullChecker.m81303a(this.f159112d.m53522d())) {
            m179100q(this.f159112d.m53527i(), this.f159112d.m53522d().m53601s());
        }
        m179099p(PayMethod.get("wechat"), str, e30Var);
    }

    /* JADX INFO: renamed from: n */
    public final void m179097n() {
        if (g6a.m124567p()) {
            wi60.m203291m().m203293B();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m179098o(String str, boolean z, e30<Integer> e30Var) {
        if (!z && m179087d()) {
            m179086c(str, e30Var);
            return;
        }
        if (!z) {
            m179099p(PayMethod.get("alipay"), str, e30Var);
        } else if (sd60.m183465p()) {
            m179099p(PayMethod.get("wechat"), str, e30Var);
        } else {
            hab0.INSTANCE.m130133g(this.f159121m, m179088e(), "wx not install");
        }
    }

    /* JADX INFO: renamed from: p */
    public void m179099p(PayMethod payMethod, String str, e30<Integer> e30Var) {
        PurchasePaymentParam purchasePaymentParamM214467a = new yf60(this.f159109a).m214474h(str).m214481o(TEnum.equals(payMethod, "alipay") && m179087d() && CoreModule.m29935P().m94651a().mo33283Ab(this.f159109a) && g6a.m124558g(this.f159111c, this.f159113e)).m214471e(this.f159118j).m214480n(CoreModule.f17545c.f19654j0.m30596M4(str)).m214476j(this.f159114f).m214473g(this.f159123o).m214477k(this.f159122n).m214467a();
        purchasePaymentParamM214467a.setPurchaseTrackId(this.f159121m);
        l6b0 l6b0VarM153188a = new m6b0().m153189b(purchasePaymentParamM214467a).m153190c(new qlw(this.f159110b, this.f159109a, this.f159115g)).m153188a();
        m179097n();
        sd60.m183467y(this.f159110b, payMethod, this.f159109a, l6b0VarM153188a);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m179100q(boolean z, Merchandise merchandise) {
        if (CoreModule.m29935P().m94651a().mo33317F4()) {
            if (vwb.m200298L(this.f159118j) || this.f159126r) {
                this.f159126r = true;
                if (!z || vwb.m200296J(merchandise.localCoupons)) {
                    m179101r("");
                } else {
                    m179101r(merchandise.localCoupons.get(0).couponID);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public rf60 m179101r(String str) {
        this.f159118j = str;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public rf60 m179102s(C8765d c8765d) {
        this.f159112d = c8765d;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public void m179103t(boolean z) {
        this.f159117i = z;
    }

    /* JADX INFO: renamed from: u */
    public void m179104u(String str) {
        this.f159123o = str;
    }

    /* JADX INFO: renamed from: v */
    public rf60 m179105v(Privilege privilege) {
        this.f159113e = privilege;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public void m179106w(boolean z) {
        this.f159124p = z;
    }

    /* JADX INFO: renamed from: x */
    public void m179107x(boolean z) {
        this.f159125q = z;
    }

    /* JADX INFO: renamed from: y */
    public rf60 m179108y(Merchandise merchandise) {
        this.f159120l = merchandise;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public rf60 m179109z(String str) {
        this.f159114f = str;
        return this;
    }
}
