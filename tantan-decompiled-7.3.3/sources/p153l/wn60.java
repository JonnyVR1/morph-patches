package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SignPaymentParam;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class wn60 {

    /* JADX INFO: renamed from: a */
    public PurchaseType f189858a;

    /* JADX INFO: renamed from: b */
    public final Act f189859b;

    /* JADX INFO: renamed from: c */
    public final String f189860c;

    /* JADX INFO: renamed from: d */
    public C8928d f189861d;

    /* JADX INFO: renamed from: e */
    public Privilege f189862e;

    /* JADX INFO: renamed from: f */
    public String f189863f;

    /* JADX INFO: renamed from: g */
    public y3m f189864g;

    /* JADX INFO: renamed from: j */
    public String f189867j;

    /* JADX INFO: renamed from: l */
    public Merchandise f189869l;

    /* JADX INFO: renamed from: n */
    public String f189871n;

    /* JADX INFO: renamed from: o */
    public String f189872o;

    /* JADX INFO: renamed from: p */
    public boolean f189873p;

    /* JADX INFO: renamed from: q */
    public boolean f189874q;

    /* JADX INFO: renamed from: h */
    public boolean f189865h = true;

    /* JADX INFO: renamed from: i */
    public boolean f189866i = false;

    /* JADX INFO: renamed from: k */
    public boolean f189868k = false;

    /* JADX INFO: renamed from: m */
    public String f189870m = niw.m163315e(CoreModule.m30929H().userId() + pzi0.m174454o());

    /* JADX INFO: renamed from: r */
    public boolean f189875r = false;

    public wn60(PurchaseType purchaseType, Act act, String str, Object obj) {
        this.f189858a = purchaseType;
        this.f189859b = act;
        this.f189860c = str;
    }

    /* JADX INFO: renamed from: A */
    public void m207142A(String str) {
        this.f189871n = str;
    }

    /* JADX INFO: renamed from: B */
    public wn60 m207143B(y3m y3mVar) {
        this.f189864g = y3mVar;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public void m207144C(@Nullable String str) {
        this.f189870m = str;
    }

    /* JADX INFO: renamed from: D */
    public void m207145D(boolean z) {
        this.f189865h = z;
    }

    /* JADX INFO: renamed from: E */
    public void m207146E(Act act, final String str, String str2, final y20<Integer> y20Var) {
        String string;
        ArrayList arrayList = new ArrayList();
        if (wib0.m206575s(this.f189858a)) {
            string = act.getString(R$string.f28446s7, str2);
        } else {
            PurchaseType purchaseType = this.f189858a;
            if (purchaseType == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS) {
                string = "微信购买年费闪聊特权暂无优惠且不可连续包年，每个月" + str2 + "元";
            } else if (wib0.m206573q(purchaseType)) {
                string = "微信购买年费“SVIP超级会员”暂无优惠且不可连续包年，每个月" + str2 + "元";
            } else {
                string = act.getString(R$string.f28492w9, str2);
            }
        }
        String string2 = act.getString(R$string.f28514y9);
        String string3 = act.getString(R$string.f28503x9);
        arrayList.add(str2);
        new th0.C20312a(act).m191151j(q8g0.m175796b0(string, arrayList, act.color(h9c0.f108379l), lyh0.m156283c(3))).m191159r(string2).m191156o(new View.OnClickListener() { // from class: l.un60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179700a.m207161l(y20Var, str, view);
            }
        }).m191147f(string3).m191144c(new View.OnClickListener() { // from class: l.vn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184838a.m207162m(y20Var, view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: F */
    public final void m207147F(Act act, String str, y20<Integer> y20Var) {
        String strValueOf;
        if (NullChecker.m82486a(this.f189861d.m54705d())) {
            strValueOf = String.valueOf(this.f189861d.m54705d().m54784s().defaultStockKeepUnit.prices.unitPrice);
        } else {
            strValueOf = NullChecker.m82486a(this.f189869l) ? String.valueOf(this.f189869l.defaultStockKeepUnit.prices.unitPrice) : "";
        }
        m207146E(act, str, strValueOf, y20Var);
    }

    /* JADX INFO: renamed from: G */
    public void m207148G(PayMethod payMethod, String str, y20<Integer> y20Var) {
        C4883c c4883c = CoreModule.f18264c;
        c4883c.f20396j0.f20032c0.put(Boolean.valueOf(c4883c.f20381e0.m116600p9().isVIP()));
        SignPaymentParam signPaymentParamM117177b = new do60(this.f189858a).m117183h(str).m117190o(CoreModule.m30933P().m143405a().mo34428U() && TEnum.equals(payMethod, "alipay") && this.f189865h && CoreModule.m30933P().m143405a().mo34286Ab(this.f189858a) && s7a.m184978g(this.f189860c, this.f189862e)).m117181f(CoreModule.m30933P().m143405a().mo34352K4() && this.f189866i).m117180e(this.f189867j).m117189n(CoreModule.f18264c.f20396j0.m31599M4(str)).m117188m(this.f189868k).m117185j(this.f189863f).m117182g(this.f189872o).m117186k(this.f189871n).m117177b();
        signPaymentParamM117177b.setPurchaseTrackId(this.f189870m);
        mdf0 mdf0VarM162700a = new ndf0().m162701b(this.f189862e).m162704e(signPaymentParamM117177b).m162703d(payMethod).m162700a();
        m207163n();
        boolean zM207160k = m207160k(payMethod);
        Act act = this.f189859b;
        if (zM207160k) {
            xl60.m211495C(act, payMethod, mdf0VarM162700a, this.f189858a);
        } else {
            xl60.m211496E(act, payMethod, mdf0VarM162700a, this.f189858a);
        }
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(0);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m207149H(String str, y20<Integer> y20Var) {
        if (gta.m132210e().m132214d().mo34851ib()) {
            r1j0.m179420g("账号已冻结，功能受限");
            lib0.INSTANCE.m154349a(this.f189870m, str, "user block");
            return;
        }
        SignPaymentParam signPaymentParamM117177b = new do60(this.f189858a).m117183h(str).m117190o(CoreModule.m30933P().m143405a().mo34286Ab(this.f189858a) && s7a.m184978g(this.f189860c, this.f189862e)).m117181f(CoreModule.m30933P().m143405a().mo34352K4() && this.f189866i).m117180e(this.f189867j).m117185j(this.f189863f).m117188m(this.f189868k).m117189n(CoreModule.f18264c.f20396j0.m31599M4(str)).m117182g(this.f189872o).m117186k(this.f189871n).m117177b();
        signPaymentParamM117177b.setPurchaseTrackId(this.f189870m);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(0);
        }
        bn60.m105338U(this.f189859b);
        mdf0 mdf0VarM162700a = new ndf0().m162701b(this.f189862e).m162702c(true).m162704e(signPaymentParamM117177b).m162703d(PayMethod.get("alipay")).m162700a();
        m207163n();
        boolean zM207160k = m207160k(PayMethod.get("alipay"));
        Act act = this.f189859b;
        if (zM207160k) {
            xl60.m211495C(act, PayMethod.get("alipay"), mdf0VarM162700a, this.f189858a);
        } else {
            xl60.m211496E(act, PayMethod.get("alipay"), mdf0VarM162700a, this.f189858a);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m207150I(boolean z, String str, y20<Integer> y20Var) {
        if (z) {
            if (xl60.m211511p()) {
                m207148G(PayMethod.get("wechat"), str, y20Var);
                return;
            } else {
                lib0.INSTANCE.m154355g(this.f189870m, str, "wx not install");
                return;
            }
        }
        if (m207153d() && !CoreModule.f18264c.f20333O0.m31084u3(this.f189858a)) {
            m207149H(str, y20Var);
        } else if (xl60.m211506k()) {
            m207148G(PayMethod.get("alipay"), str, y20Var);
        } else {
            lib0.INSTANCE.m154349a(this.f189870m, str, "alipay not install");
        }
    }

    /* JADX INFO: renamed from: J */
    public boolean m207151J(boolean z) {
        if (z && this.f189861d.m54709h()) {
            return true;
        }
        return !z && this.f189861d.m54710i();
    }

    /* JADX INFO: renamed from: c */
    public void m207152c(String str, y20<Integer> y20Var) {
        m207165p(PayMethod.get("alipay"), str, y20Var);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m207153d() {
        return ((CoreModule.m30933P().m143405a().mo180463f() && wib0.m206565i(this.f189858a)) || wib0.m206572p(this.f189858a) || wib0.m206566j(this.f189858a) || !this.f189865h || !CoreModule.m30933P().m143405a().mo34527j3()) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public String m207154e() {
        if (!NullChecker.m82486a(this.f189861d)) {
            return null;
        }
        boolean zM54714m = this.f189861d.m54714m();
        C8928d c8928d = this.f189861d;
        C8928d.a aVarM54703b = zM54714m ? c8928d.m54703b() : c8928d.m54705d();
        if (NullChecker.m82486a(aVarM54703b)) {
            return aVarM54703b.m54784s().defaultStockKeepUnit.f21249id;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public String m207155f(y20<Integer> y20Var) {
        if (!NullChecker.m82486a(this.f189861d)) {
            return "";
        }
        boolean zM54714m = this.f189861d.m54714m();
        C8928d c8928d = this.f189861d;
        C8928d.a aVarM54703b = zM54714m ? c8928d.m54703b() : c8928d.m54705d();
        if (!NullChecker.m82486a(aVarM54703b)) {
            return "";
        }
        String str = aVarM54703b.m54784s().defaultStockKeepUnit.f21249id;
        m207166q(m207151J(zM54714m), aVarM54703b.m54784s());
        if (zM54714m) {
            m207149H(str, y20Var);
            return str;
        }
        m207152c(str, y20Var);
        return str;
    }

    /* JADX INFO: renamed from: g */
    public String m207156g(y20<Integer> y20Var) {
        if (m207153d()) {
            return m207155f(y20Var);
        }
        if (NullChecker.m82486a(this.f189861d)) {
            boolean zM54715n = this.f189861d.m54715n();
            C8928d c8928d = this.f189861d;
            C8928d.a aVarM54703b = zM54715n ? c8928d.m54703b() : c8928d.m54705d();
            if (NullChecker.m82486a(aVarM54703b)) {
                String str = aVarM54703b.m54784s().defaultStockKeepUnit.f21249id;
                m207166q(m207151J(zM54715n), aVarM54703b.m54784s());
                if (!zM54715n) {
                    m207165p(PayMethod.get("alipay"), str, y20Var);
                    return str;
                }
                if (xl60.m211506k()) {
                    m207148G(PayMethod.get("alipay"), str, y20Var);
                    return str;
                }
                i4g0.m138495D("e_purchase_order_response", "p_purchase_page", jyb.m147494Y("skuID", ""), jyb.m147494Y("platform", "alipay"), jyb.m147494Y("code", 202001), jyb.m147494Y("contract_id", ""), jyb.m147494Y("order_type", "contract"), jyb.m147494Y("error_message", "alipay not install"));
                lib0.INSTANCE.m154349a(this.f189870m, m207154e(), "alipay not install");
                return str;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: h */
    public String m207157h(y20<Integer> y20Var) {
        if (!NullChecker.m82486a(this.f189861d)) {
            return "";
        }
        C8928d.a aVarM54705d = this.f189861d.m54705d();
        if (!NullChecker.m82486a(aVarM54705d)) {
            return "";
        }
        String str = aVarM54705d.m54784s().defaultStockKeepUnit.f21249id;
        if (s7a.m184985n()) {
            m207166q(m207151J(false), aVarM54705d.m54784s());
        } else if (m207151J(false)) {
            r1j0.m179415b("京东支付暂不享受优惠，将以原价购买");
        }
        m207165p(PayMethod.get(PayMethod.jingdong), str, y20Var);
        return str;
    }

    /* JADX INFO: renamed from: i */
    public void m207158i(y20<Integer> y20Var, Merchandise merchandise) {
        if (NullChecker.m82486a(merchandise)) {
            m207165p(PayMethod.get(PayMethod.jingdong), merchandise.defaultStockKeepUnit.f21249id, y20Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (p153l.wib0.m206573q(r1) == false) goto L26;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m207159j(y20<Integer> y20Var) {
        boolean zM211511p = xl60.m211511p();
        C8928d c8928d = this.f189861d;
        String str = "";
        if (!zM211511p) {
            boolean zM54714m = NullChecker.m82486a(c8928d) ? this.f189861d.m54714m() : true;
            i4g0.m138495D("e_purchase_order_response", "p_purchase_page", jyb.m147494Y("skuID", ""), jyb.m147494Y("platform", "wechat"), jyb.m147494Y("code", 202001), jyb.m147494Y("order_type", zM54714m ? "contract" : "pay"), jyb.m147494Y(zM54714m ? "contract_id" : "order_id", ""), jyb.m147494Y("error_message", "wx not install"));
            lib0.INSTANCE.m154355g(this.f189870m, m207154e(), "wx not install");
            return "";
        }
        if (NullChecker.m82486a(c8928d)) {
            boolean zM54714m2 = this.f189861d.m54714m();
            C8928d c8928d2 = this.f189861d;
            C8928d.a aVarM54703b = zM54714m2 ? c8928d2.m54703b() : c8928d2.m54705d();
            if (NullChecker.m82486a(aVarM54703b)) {
                str = aVarM54703b.m54784s().defaultStockKeepUnit.f21249id;
                m207166q(m207151J(zM54714m2), aVarM54703b.m54784s());
                int iM54788w = aVarM54703b.m54788w();
                if (zM54714m2) {
                    if (iM54788w == 12) {
                        if (!wib0.m206579w(this.f189858a) && !wib0.m206575s(this.f189858a)) {
                            PurchaseType purchaseType = PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS;
                            PurchaseType purchaseType2 = this.f189858a;
                            if (purchaseType != purchaseType2) {
                            }
                        }
                        m207147F(this.f189859b, str, y20Var);
                        return str;
                    }
                    m207148G(PayMethod.get("wechat"), str, y20Var);
                    return str;
                }
                m207165p(PayMethod.get("wechat"), str, y20Var);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m207160k(PayMethod payMethod) {
        return this.f189873p || !this.f189874q;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m207161l(y20 y20Var, String str, View view) {
        if (NullChecker.m82486a(y20Var) && !TextUtils.isEmpty(this.f189860c) && cok0.f82895a.equals(this.f189860c)) {
            y20Var.call(3);
        }
        if (xl60.m211506k()) {
            m207148G(PayMethod.get("alipay"), str, y20Var);
        } else {
            i4g0.m138495D("e_purchase_order_response", "p_purchase_page", jyb.m147494Y("skuID", ""), jyb.m147494Y("platform", "alipay"), jyb.m147494Y("code", 202001), jyb.m147494Y("contract_id", ""), jyb.m147494Y("order_type", "contract"), jyb.m147494Y("error_message", "alipay not install"));
            lib0.INSTANCE.m154349a(this.f189870m, str, "alipay not install");
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m207162m(y20 y20Var, View view) {
        String str;
        if (NullChecker.m82486a(this.f189861d.m54705d())) {
            str = this.f189861d.m54705d().m54784s().defaultStockKeepUnit.f21249id;
        } else {
            str = NullChecker.m82486a(this.f189869l) ? this.f189869l.defaultStockKeepUnit.f21249id : "";
        }
        if (NullChecker.m82486a(this.f189861d.m54705d())) {
            m207166q(this.f189861d.m54710i(), this.f189861d.m54705d().m54784s());
        }
        m207165p(PayMethod.get("wechat"), str, y20Var);
    }

    /* JADX INFO: renamed from: n */
    public final void m207163n() {
        if (s7a.m184987p()) {
            br60.m106057m().m106059B();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m207164o(String str, boolean z, y20<Integer> y20Var) {
        if (!z && m207153d()) {
            m207152c(str, y20Var);
            return;
        }
        if (!z) {
            m207165p(PayMethod.get("alipay"), str, y20Var);
        } else if (xl60.m211511p()) {
            m207165p(PayMethod.get("wechat"), str, y20Var);
        } else {
            lib0.INSTANCE.m154355g(this.f189870m, m207154e(), "wx not install");
        }
    }

    /* JADX INFO: renamed from: p */
    public void m207165p(PayMethod payMethod, String str, y20<Integer> y20Var) {
        PurchasePaymentParam purchasePaymentParamM117176a = new do60(this.f189858a).m117183h(str).m117190o(TEnum.equals(payMethod, "alipay") && m207153d() && CoreModule.m30933P().m143405a().mo34286Ab(this.f189858a) && s7a.m184978g(this.f189860c, this.f189862e)).m117180e(this.f189867j).m117189n(CoreModule.f18264c.f20396j0.m31599M4(str)).m117185j(this.f189863f).m117182g(this.f189872o).m117186k(this.f189871n).m117176a();
        purchasePaymentParamM117176a.setPurchaseTrackId(this.f189870m);
        peb0 peb0VarM176234a = new qeb0().m176235b(purchasePaymentParamM117176a).m176236c(new pow(this.f189859b, this.f189858a, this.f189864g)).m176234a();
        m207163n();
        xl60.m211513y(this.f189859b, payMethod, this.f189858a, peb0VarM176234a);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(0);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m207166q(boolean z, Merchandise merchandise) {
        if (CoreModule.m30933P().m143405a().mo34320F4()) {
            if (jyb.m147481L(this.f189867j) || this.f189875r) {
                this.f189875r = true;
                if (!z || jyb.m147479J(merchandise.localCoupons)) {
                    m207167r("");
                } else {
                    m207167r(merchandise.localCoupons.get(0).couponID);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public wn60 m207167r(String str) {
        this.f189867j = str;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public wn60 m207168s(C8928d c8928d) {
        this.f189861d = c8928d;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public void m207169t(boolean z) {
        this.f189866i = z;
    }

    /* JADX INFO: renamed from: u */
    public void m207170u(String str) {
        this.f189872o = str;
    }

    /* JADX INFO: renamed from: v */
    public wn60 m207171v(Privilege privilege) {
        this.f189862e = privilege;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public void m207172w(boolean z) {
        this.f189873p = z;
    }

    /* JADX INFO: renamed from: x */
    public void m207173x(boolean z) {
        this.f189874q = z;
    }

    /* JADX INFO: renamed from: y */
    public wn60 m207174y(Merchandise merchandise) {
        this.f189869l = merchandise;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public wn60 m207175z(String str) {
        this.f189863f = str;
        return this;
    }
}
