package p009l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.pay.R$string;
import com.p000p1.mobile.share_sdk.ShareEventActivity;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SignPaymentParam;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.PurchasePaymentParam;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.eqh0;
import l.f1m;
import l.g6a;
import l.hab0;
import l.j760;
import l.ogw;
import l.osi0;
import l.sab0;
import l.ura;
import l.vwb;
import l.wek0;
import l.wi60;
import l.xh0;
import l.zvf0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rf60 {

    /* JADX INFO: renamed from: a */
    public PurchaseType f19794a;

    /* JADX INFO: renamed from: b */
    public final Act f19795b;

    /* JADX INFO: renamed from: c */
    public final String f19796c;

    /* JADX INFO: renamed from: d */
    public d f19797d;

    /* JADX INFO: renamed from: e */
    public Privilege f19798e;

    /* JADX INFO: renamed from: f */
    public String f19799f;

    /* JADX INFO: renamed from: g */
    public f1m f19800g;

    /* JADX INFO: renamed from: j */
    public String f19803j;

    /* JADX INFO: renamed from: l */
    public Merchandise f19805l;

    /* JADX INFO: renamed from: n */
    public String f19807n;

    /* JADX INFO: renamed from: o */
    public String f19808o;

    /* JADX INFO: renamed from: p */
    public boolean f19809p;

    /* JADX INFO: renamed from: q */
    public boolean f19810q;

    /* JADX INFO: renamed from: h */
    public boolean f19801h = true;

    /* JADX INFO: renamed from: i */
    public boolean f19802i = false;

    /* JADX INFO: renamed from: k */
    public boolean f19804k = false;

    /* JADX INFO: renamed from: m */
    public String f19806m = ogw.e(CoreModule.H().userId() + mqi0.m18550o());

    /* JADX INFO: renamed from: r */
    public boolean f19811r = false;

    public rf60(PurchaseType purchaseType, Act act, String str, Object obj) {
        this.f19794a = purchaseType;
        this.f19795b = act;
        this.f19796c = str;
    }

    /* JADX INFO: renamed from: A */
    public void m21623A(String str) {
        this.f19807n = str;
    }

    /* JADX INFO: renamed from: B */
    public rf60 m21624B(f1m f1mVar) {
        this.f19800g = f1mVar;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public void m21625C(@Nullable String str) {
        this.f19806m = str;
    }

    /* JADX INFO: renamed from: D */
    public void m21626D(boolean z) {
        this.f19801h = z;
    }

    /* JADX INFO: renamed from: E */
    public void m21627E(Act act, final String str, String str2, final e30<Integer> e30Var) {
        String string;
        ArrayList arrayList = new ArrayList();
        if (sab0.s(this.f19794a)) {
            string = act.getString(R$string.f6376s7, str2);
        } else {
            PurchaseType purchaseType = this.f19794a;
            if (purchaseType == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS) {
                string = "微信购买年费闪聊特权暂无优惠且不可连续包年，每个月" + str2 + "元";
            } else if (sab0.q(purchaseType)) {
                string = "微信购买年费“SVIP超级会员”暂无优惠且不可连续包年，每个月" + str2 + "元";
            } else {
                string = act.getString(R$string.f6422w9, str2);
            }
        }
        String string2 = act.getString(R$string.f6444y9);
        String string3 = act.getString(R$string.f6433x9);
        arrayList.add(str2);
        new xh0.a(act).j(i0g0.m16129b0(string, arrayList, act.color(b1c0.f9840l), eqh0.c(3))).r(string2).o(new View.OnClickListener() { // from class: l.pf60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18519a.m21642l(e30Var, str, view);
            }
        }).f(string3).c(new View.OnClickListener() { // from class: l.qf60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19204a.m21643m(e30Var, view);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: F */
    public final void m21628F(Act act, String str, e30<Integer> e30Var) {
        String strValueOf;
        if (NullChecker.a(this.f19797d.d())) {
            strValueOf = String.valueOf(this.f19797d.d().s().defaultStockKeepUnit.prices.unitPrice);
        } else {
            strValueOf = NullChecker.a(this.f19805l) ? String.valueOf(this.f19805l.defaultStockKeepUnit.prices.unitPrice) : "";
        }
        m21627E(act, str, strValueOf, e30Var);
    }

    /* JADX INFO: renamed from: G */
    public void m21629G(PayMethod payMethod, String str, e30<Integer> e30Var) {
        c cVar = CoreModule.c;
        cVar.j0.c0.put(Boolean.valueOf(cVar.e0.p9().isVIP()));
        SignPaymentParam signPaymentParamM25335b = new yf60(this.f19794a).m25341h(str).m25348o(CoreModule.P().a().U() && TEnum.equals(payMethod, "alipay") && this.f19801h && CoreModule.P().a().Ab(this.f19794a) && g6a.g(this.f19796c, this.f19798e)).m25339f(CoreModule.P().a().K4() && this.f19802i).m25338e(this.f19803j).m25347n(CoreModule.c.j0.M4(str)).m25346m(this.f19804k).m25343j(this.f19799f).m25340g(this.f19808o).m25344k(this.f19807n).m25335b();
        signPaymentParamM25335b.setPurchaseTrackId(this.f19806m);
        f5f0 f5f0VarM14789a = new g5f0().m14790b(this.f19798e).m14793e(signPaymentParamM25335b).m14792d(payMethod).m14789a();
        m21644n();
        boolean zM21641k = m21641k(payMethod);
        Act act = this.f19795b;
        if (zM21641k) {
            sd60.m22069C(act, payMethod, f5f0VarM14789a, this.f19794a);
        } else {
            sd60.m22070E(act, payMethod, f5f0VarM14789a, this.f19794a);
        }
        if (NullChecker.a(e30Var)) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m21630H(String str, e30<Integer> e30Var) {
        if (ura.e().d().ib()) {
            osi0.g("账号已冻结，功能受限");
            hab0.Companion.a(this.f19806m, str, "user block");
            return;
        }
        SignPaymentParam signPaymentParamM25335b = new yf60(this.f19794a).m25341h(str).m25348o(CoreModule.P().a().Ab(this.f19794a) && g6a.g(this.f19796c, this.f19798e)).m25339f(CoreModule.P().a().K4() && this.f19802i).m25338e(this.f19803j).m25343j(this.f19799f).m25346m(this.f19804k).m25347n(CoreModule.c.j0.M4(str)).m25340g(this.f19808o).m25344k(this.f19807n).m25335b();
        signPaymentParamM25335b.setPurchaseTrackId(this.f19806m);
        if (NullChecker.a(e30Var)) {
            e30Var.call(0);
        }
        we60.m24159U(this.f19795b);
        f5f0 f5f0VarM14789a = new g5f0().m14790b(this.f19798e).m14791c(true).m14793e(signPaymentParamM25335b).m14792d(PayMethod.get("alipay")).m14789a();
        m21644n();
        boolean zM21641k = m21641k(PayMethod.get("alipay"));
        Act act = this.f19795b;
        if (zM21641k) {
            sd60.m22069C(act, PayMethod.get("alipay"), f5f0VarM14789a, this.f19794a);
        } else {
            sd60.m22070E(act, PayMethod.get("alipay"), f5f0VarM14789a, this.f19794a);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m21631I(boolean z, String str, e30<Integer> e30Var) {
        if (z) {
            if (sd60.m22085p()) {
                m21629G(PayMethod.get("wechat"), str, e30Var);
                return;
            } else {
                hab0.Companion.g(this.f19806m, str, "wx not install");
                return;
            }
        }
        if (m21634d() && !CoreModule.c.O0.u3(this.f19794a)) {
            m21630H(str, e30Var);
        } else if (sd60.m22080k()) {
            m21629G(PayMethod.get("alipay"), str, e30Var);
        } else {
            hab0.Companion.a(this.f19806m, str, "alipay not install");
        }
    }

    /* JADX INFO: renamed from: J */
    public boolean m21632J(boolean z) {
        if (z && this.f19797d.h()) {
            return true;
        }
        return !z && this.f19797d.i();
    }

    /* JADX INFO: renamed from: c */
    public void m21633c(String str, e30<Integer> e30Var) {
        m21646p(PayMethod.get("alipay"), str, e30Var);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m21634d() {
        return ((CoreModule.P().a().f() && sab0.i(this.f19794a)) || sab0.p(this.f19794a) || sab0.j(this.f19794a) || !this.f19801h || !CoreModule.P().a().j3()) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public String m21635e() {
        if (!NullChecker.a(this.f19797d)) {
            return null;
        }
        boolean zM = this.f19797d.m();
        d dVar = this.f19797d;
        d.a aVarB = zM ? dVar.b() : dVar.d();
        if (NullChecker.a(aVarB)) {
            return aVarB.s().defaultStockKeepUnit.id;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public String m21636f(e30<Integer> e30Var) {
        if (!NullChecker.a(this.f19797d)) {
            return "";
        }
        boolean zM = this.f19797d.m();
        d dVar = this.f19797d;
        d.a aVarB = zM ? dVar.b() : dVar.d();
        if (!NullChecker.a(aVarB)) {
            return "";
        }
        String str = aVarB.s().defaultStockKeepUnit.id;
        m21647q(m21632J(zM), aVarB.s());
        if (zM) {
            m21630H(str, e30Var);
            return str;
        }
        m21633c(str, e30Var);
        return str;
    }

    /* JADX INFO: renamed from: g */
    public String m21637g(e30<Integer> e30Var) {
        if (m21634d()) {
            return m21636f(e30Var);
        }
        if (NullChecker.a(this.f19797d)) {
            boolean zN = this.f19797d.n();
            d dVar = this.f19797d;
            d.a aVarB = zN ? dVar.b() : dVar.d();
            if (NullChecker.a(aVarB)) {
                String str = aVarB.s().defaultStockKeepUnit.id;
                m21647q(m21632J(zN), aVarB.s());
                if (!zN) {
                    m21646p(PayMethod.get("alipay"), str, e30Var);
                    return str;
                }
                if (sd60.m22080k()) {
                    m21629G(PayMethod.get("alipay"), str, e30Var);
                    return str;
                }
                zvf0.D("e_purchase_order_response", "p_purchase_page", new j760[]{vwb.Y("skuID", ""), vwb.Y(ShareEventActivity.PLATFORM, "alipay"), vwb.Y(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, 202001), vwb.Y("contract_id", ""), vwb.Y("order_type", "contract"), vwb.Y("error_message", "alipay not install")});
                hab0.Companion.a(this.f19806m, m21635e(), "alipay not install");
                return str;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: h */
    public String m21638h(e30<Integer> e30Var) {
        if (!NullChecker.a(this.f19797d)) {
            return "";
        }
        d.a aVarD = this.f19797d.d();
        if (!NullChecker.a(aVarD)) {
            return "";
        }
        String str = aVarD.s().defaultStockKeepUnit.id;
        if (g6a.n()) {
            m21647q(m21632J(false), aVarD.s());
        } else if (m21632J(false)) {
            osi0.b("京东支付暂不享受优惠，将以原价购买");
        }
        m21646p(PayMethod.get("jingdong"), str, e30Var);
        return str;
    }

    /* JADX INFO: renamed from: i */
    public void m21639i(e30<Integer> e30Var, Merchandise merchandise) {
        if (NullChecker.a(merchandise)) {
            m21646p(PayMethod.get("jingdong"), merchandise.defaultStockKeepUnit.id, e30Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (l.sab0.q(r1) == false) goto L26;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m21640j(l.e30<java.lang.Integer> r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p009l.rf60.m21640j(l.e30):java.lang.String");
    }

    /* JADX INFO: renamed from: k */
    public final boolean m21641k(PayMethod payMethod) {
        return this.f19809p || !this.f19810q;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m21642l(e30 e30Var, String str, View view) {
        if (NullChecker.a(e30Var) && !TextUtils.isEmpty(this.f19796c) && wek0.a.equals(this.f19796c)) {
            e30Var.call(3);
        }
        if (sd60.m22080k()) {
            m21629G(PayMethod.get("alipay"), str, e30Var);
        } else {
            zvf0.D("e_purchase_order_response", "p_purchase_page", new j760[]{vwb.Y("skuID", ""), vwb.Y(ShareEventActivity.PLATFORM, "alipay"), vwb.Y(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, 202001), vwb.Y("contract_id", ""), vwb.Y("order_type", "contract"), vwb.Y("error_message", "alipay not install")});
            hab0.Companion.a(this.f19806m, str, "alipay not install");
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m21643m(e30 e30Var, View view) {
        String str;
        if (NullChecker.a(this.f19797d.d())) {
            str = this.f19797d.d().s().defaultStockKeepUnit.id;
        } else {
            str = NullChecker.a(this.f19805l) ? this.f19805l.defaultStockKeepUnit.id : "";
        }
        if (NullChecker.a(this.f19797d.d())) {
            m21647q(this.f19797d.i(), this.f19797d.d().s());
        }
        m21646p(PayMethod.get("wechat"), str, e30Var);
    }

    /* JADX INFO: renamed from: n */
    public final void m21644n() {
        if (g6a.p()) {
            wi60.m().B();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m21645o(String str, boolean z, e30<Integer> e30Var) {
        if (!z && m21634d()) {
            m21633c(str, e30Var);
            return;
        }
        if (!z) {
            m21646p(PayMethod.get("alipay"), str, e30Var);
        } else if (sd60.m22085p()) {
            m21646p(PayMethod.get("wechat"), str, e30Var);
        } else {
            hab0.Companion.g(this.f19806m, m21635e(), "wx not install");
        }
    }

    /* JADX INFO: renamed from: p */
    public void m21646p(PayMethod payMethod, String str, e30<Integer> e30Var) {
        PurchasePaymentParam purchasePaymentParamM25334a = new yf60(this.f19794a).m25341h(str).m25348o(TEnum.equals(payMethod, "alipay") && m21634d() && CoreModule.P().a().Ab(this.f19794a) && g6a.g(this.f19796c, this.f19798e)).m25338e(this.f19803j).m25347n(CoreModule.c.j0.M4(str)).m25343j(this.f19799f).m25340g(this.f19808o).m25344k(this.f19807n).m25334a();
        purchasePaymentParamM25334a.setPurchaseTrackId(this.f19806m);
        l6b0 l6b0VarM18247a = new m6b0().m18248b(purchasePaymentParamM25334a).m18249c(new qlw(this.f19795b, this.f19794a, this.f19800g)).m18247a();
        m21644n();
        sd60.m22087y(this.f19795b, payMethod, this.f19794a, l6b0VarM18247a);
        if (NullChecker.a(e30Var)) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m21647q(boolean z, Merchandise merchandise) {
        if (CoreModule.P().a().F4()) {
            if (vwb.L(this.f19803j) || this.f19811r) {
                this.f19811r = true;
                if (!z || vwb.J(merchandise.localCoupons)) {
                    m21648r("");
                } else {
                    m21648r(((Coupon) merchandise.localCoupons.get(0)).couponID);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public rf60 m21648r(String str) {
        this.f19803j = str;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public rf60 m21649s(d dVar) {
        this.f19797d = dVar;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public void m21650t(boolean z) {
        this.f19802i = z;
    }

    /* JADX INFO: renamed from: u */
    public void m21651u(String str) {
        this.f19808o = str;
    }

    /* JADX INFO: renamed from: v */
    public rf60 m21652v(Privilege privilege) {
        this.f19798e = privilege;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public void m21653w(boolean z) {
        this.f19809p = z;
    }

    /* JADX INFO: renamed from: x */
    public void m21654x(boolean z) {
        this.f19810q = z;
    }

    /* JADX INFO: renamed from: y */
    public rf60 m21655y(Merchandise merchandise) {
        this.f19805l = merchandise;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public rf60 m21656z(String str) {
        this.f19799f = str;
        return this;
    }
}
