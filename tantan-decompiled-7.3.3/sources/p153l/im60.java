package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8924b;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.p058ui.purchase.PromotionPendantView;
import com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseView;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class im60 implements i2m, y3m {

    /* JADX INFO: renamed from: B */
    public Object f115662B;

    /* JADX INFO: renamed from: C */
    public double f115663C;

    /* JADX INFO: renamed from: D */
    public double f115664D;

    /* JADX INFO: renamed from: E */
    public Privilege f115665E;

    /* JADX INFO: renamed from: F */
    public String f115666F;

    /* JADX INFO: renamed from: G */
    public boolean f115667G;

    /* JADX INFO: renamed from: H */
    public kcg0 f115668H;

    /* JADX INFO: renamed from: I */
    public C8924b f115669I;

    /* JADX INFO: renamed from: J */
    public PurchaseView f115670J;

    /* JADX INFO: renamed from: K */
    public z3m f115671K;

    /* JADX INFO: renamed from: a */
    public LinearLayout f115678a;

    /* JADX INFO: renamed from: b */
    public VImage f115679b;

    /* JADX INFO: renamed from: c */
    public VText f115680c;

    /* JADX INFO: renamed from: d */
    public VText f115681d;

    /* JADX INFO: renamed from: e */
    public VText f115682e;

    /* JADX INFO: renamed from: f */
    public VImage f115683f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f115684g;

    /* JADX INFO: renamed from: h */
    public VText f115685h;

    /* JADX INFO: renamed from: i */
    public VText f115686i;

    /* JADX INFO: renamed from: j */
    public VFrame f115687j;

    /* JADX INFO: renamed from: k */
    public TextView f115688k;

    /* JADX INFO: renamed from: l */
    public VText f115689l;

    /* JADX INFO: renamed from: m */
    public TextView f115690m;

    /* JADX INFO: renamed from: n */
    public PromotionPendantView f115691n;

    /* JADX INFO: renamed from: o */
    public Space f115692o;

    /* JADX INFO: renamed from: p */
    public View f115693p;

    /* JADX INFO: renamed from: q */
    public Act f115694q;

    /* JADX INFO: renamed from: r */
    public PurchaseType f115695r;

    /* JADX INFO: renamed from: s */
    public boolean f115696s;

    /* JADX INFO: renamed from: t */
    public String f115697t;

    /* JADX INFO: renamed from: u */
    public boolean f115698u;

    /* JADX INFO: renamed from: v */
    public a30<PurchaseType, Act, String> f115699v;

    /* JADX INFO: renamed from: w */
    public a30<PurchaseType, Act, String> f115700w;

    /* JADX INFO: renamed from: x */
    public C8928d f115701x;

    /* JADX INFO: renamed from: y */
    public PayMethod f115702y;

    /* JADX INFO: renamed from: z */
    public y20<PayMethod> f115703z;

    /* JADX INFO: renamed from: A */
    public boolean f115661A = true;

    /* JADX INFO: renamed from: L */
    public CharSequence f115672L = "";

    /* JADX INFO: renamed from: M */
    public boolean f115673M = false;

    /* JADX INFO: renamed from: N */
    public boolean f115674N = false;

    /* JADX INFO: renamed from: O */
    public String f115675O = "";

    /* JADX INFO: renamed from: P */
    public boolean f115676P = true;

    /* JADX INFO: renamed from: Q */
    public y20<PayMethod> f115677Q = new y20() { // from class: l.zl60
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f204882a.m140768P((PayMethod) obj);
        }
    };

    public im60(Act act, PurchaseType purchaseType) {
        this.f115694q = null;
        this.f115695r = null;
        this.f115694q = act;
        this.f115695r = purchaseType;
    }

    /* JADX INFO: renamed from: u */
    private void m140752u() {
        if (wib0.m206565i(this.f115695r)) {
            this.f115684g.setBackgroundDrawable(this.f115694q.getDrawable(jbc0.f119410T4));
            this.f115685h.setTextColor(Color.parseColor("#cc000000"));
            this.f115685h.setTypeface(lyh0.m156283c(3));
            this.f115683f.setImageResource(jbc0.f119781u4);
            return;
        }
        if (wib0.m206563g(this.f115695r)) {
            this.f115684g.setBackgroundDrawable(this.f115694q.drawable(jbc0.f119296L));
            return;
        }
        if (wib0.m206580x(this.f115695r)) {
            this.f115684g.setBackgroundDrawable(this.f115694q.drawable(jbc0.f119830xb));
            return;
        }
        if (wib0.m206557a(this.f115695r)) {
            this.f115684g.setBackgroundDrawable(this.f115694q.drawable(jbc0.f119320M9));
            return;
        }
        if (wib0.m206571o(this.f115695r)) {
            this.f115684g.setBackgroundDrawable(this.f115694q.drawable(jbc0.f119306L9));
        } else if (wib0.m206561e(this.f115695r) || wib0.m206559c(this.f115695r)) {
            this.f115684g.setBackgroundDrawable(this.f115694q.drawable(jbc0.f119320M9));
        } else {
            this.f115684g.setBackgroundDrawable(this.f115694q.drawable(jbc0.f119334N9));
        }
    }

    /* JADX INFO: renamed from: A */
    public String m140753A() {
        return this.f115695r.productCategory().name();
    }

    /* JADX INFO: renamed from: B */
    public String m140754B() {
        if (!NullChecker.m82486a(this.f115701x)) {
            return "";
        }
        C8928d.a aVarM140800x = m140800x();
        return NullChecker.m82486a(aVarM140800x) ? aVarM140800x.m54784s().defaultStockKeepUnit.f21249id : "";
    }

    /* JADX INFO: renamed from: C */
    public String m140755C(y20<Integer> y20Var) {
        wn60 wn60Var = new wn60(this.f115695r, this.f115694q, this.f115697t, this.f115662B);
        if (pta.m173717j()) {
            wn60Var.m207145D(false);
            pta.m173731x(false);
        }
        return m140801y(wn60Var).m207156g(y20Var);
    }

    /* JADX INFO: renamed from: D */
    public void m140756D() {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_purchase_intermediate_page", getClass().getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", Active.TYPE), jyb.m147494Y("purchaseShowFrom", abb0.m96735b(this.f115697t)), jyb.m147494Y("productType", this.f115695r.productCategory().name()), jyb.m147494Y("skuID", m140754B() == null ? "" : m140754B()));
        new bo60(this.f115694q, this.f115695r).m105668r(this.f115702y).m105662l(this.f115676P).m105667q(this.f115677Q).m105666p(new DialogInterface.OnDismissListener() { // from class: l.hm60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m105669s();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: E */
    public String m140757E(y20<Integer> y20Var) {
        return m140801y(new wn60(this.f115695r, this.f115694q, this.f115697t, this.f115662B)).m207157h(y20Var);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m140758F() {
        return ueh0.m195759m(this.f115701x, this.f115695r, this.f115694q);
    }

    /* JADX INFO: renamed from: G */
    public String m140759G(y20<Integer> y20Var) {
        wn60 wn60VarM140801y = m140801y(new wn60(this.f115695r, this.f115694q, this.f115697t, this.f115662B));
        if (tab0.m189811h().m189835z() && NullChecker.m82486a(this.f115671K) && NullChecker.m82486a(this.f115701x) && NullChecker.m82486a(this.f115701x.m54703b())) {
            wn60VarM140801y.m207174y(this.f115671K.mo54382d(this.f115701x.m54703b().m54788w()));
        }
        return wn60VarM140801y.m207159j(y20Var);
    }

    /* JADX INFO: renamed from: H */
    public void m140760H(boolean z) {
        C8924b c8924b = this.f115669I;
        if (c8924b != null) {
            c8924b.m54458P(z);
            return;
        }
        PurchaseView purchaseView = this.f115670J;
        if (purchaseView != null) {
            purchaseView.m54345E(z);
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m140761I() {
        return NullChecker.m82486a(this.f115701x) && this.f115701x.m54714m();
    }

    /* JADX INFO: renamed from: J */
    public boolean m140762J() {
        return this.f115698u;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m140763K() {
        if (m140766N()) {
            this.f115675O = "PURCHASE_DIALOG_TAB";
        } else if (m140765M()) {
            this.f115675O = "PURCHASE_DIALOG_SINGLE";
        }
        if (pta.m173726s(this.f115675O) && wib0.m206560d(this.f115695r)) {
            return m140766N() || m140765M();
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m140764L() {
        C8928d c8928d = this.f115701x;
        if (c8928d == null) {
            return false;
        }
        boolean zM54714m = c8928d.m54714m();
        C8928d c8928d2 = this.f115701x;
        if (zM54714m) {
            return v5b0.m199788n(c8928d2.m54703b().m54784s()) || this.f115701x.m54709h();
        }
        return v5b0.m199788n(c8928d2.m54705d().m54784s()) || this.f115701x.m54710i();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m140765M() {
        return NullChecker.m82486a(this.f115669I) && !this.f115669I.m54467V() && m140761I();
    }

    /* JADX INFO: renamed from: N */
    public final boolean m140766N() {
        return NullChecker.m82486a(this.f115670J) && !this.f115670J.m54347G() && m140761I();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m140767O(View view) {
        if (NullChecker.m82486a(this.f115669I)) {
            this.f115669I.m54456O();
        }
        i4g0.m138520r("e_purchase_boost_svip_guide", "p_purchase_page");
        C8927c.m54687x0(this.f115694q, wib0.m206559c(this.f115695r) ? "p_accelerate_pop,svip_guide" : "p_purchase_page,e_purchase_boost_svip_guide,click", Privilege.see_who_likes_me);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m140768P(PayMethod payMethod) {
        if (TEnum.equals(payMethod, "alipay")) {
            m140779a0();
        } else if (TEnum.equals(payMethod, "wechat")) {
            m140783f0();
        } else if (TEnum.equals(payMethod, PayMethod.jingdong)) {
            m140780b0();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m140769Q(y20 y20Var) {
        if (NullChecker.m82486a(this.f115670J)) {
            this.f115670J.m54362V();
        }
        if (NullChecker.m82486a(this.f115669I)) {
            this.f115669I.m54489r0();
        }
        m140777Y(this.f115702y, y20Var);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m140770R() {
        if (NullChecker.m82486a(this.f115670J)) {
            this.f115670J.m54344D(Boolean.FALSE);
        }
        if (NullChecker.m82486a(this.f115669I)) {
            this.f115669I.m54454N(Boolean.FALSE);
        }
        if (m140800x().m54784s().monthType()) {
            pta.m173723p();
            this.f115671K.mo54380b(m140800x().m54784s().quantity);
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m140771S() {
        if (NullChecker.m82486a(this.f115670J)) {
            this.f115670J.m54362V();
        }
        if (NullChecker.m82486a(this.f115669I)) {
            this.f115669I.m54489r0();
        }
        this.f115684g.performClick();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m140772T(Merchandise merchandise) {
        this.f115671K.mo54379a(merchandise.quantity);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m140773U(y20 y20Var) {
        m140777Y(this.f115702y, y20Var);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m140774V(final y20 y20Var, View view) {
        boolean zM173718k = pta.m173718k();
        if (m140763K()) {
            if ((g6b.m129215e(this.f115695r) || g6b.m129213c(this.f115695r)) && ((NullChecker.m82486a(this.f115670J) || NullChecker.m82486a(this.f115669I)) && NullChecker.m82486a(m140800x()) && NullChecker.m82486a(m140800x().m54784s()))) {
                C8928d c8928dMo54381c = this.f115671K.mo54381c(m140800x().m54784s().quantity);
                if (NullChecker.m82486a(c8928dMo54381c)) {
                    pta.m173707D(this.f115694q, pta.m173719l(c8928dMo54381c.m54703b().m54781p(), this.f115695r), this.f115695r, null, new x20() { // from class: l.cm60
                        @Override // p153l.x20
                        public final void call() {
                            this.f82517a.m140769Q(y20Var);
                        }
                    }, new x20() { // from class: l.dm60
                        @Override // p153l.x20
                        public final void call() {
                            this.f89609a.m140770R();
                        }
                    });
                    return;
                }
            }
            pta.m173705B(this.f115694q, null, new x20() { // from class: l.em60
                @Override // p153l.x20
                public final void call() {
                    this.f94621a.m140771S();
                }
            });
            return;
        }
        if (NullChecker.m82486a(this.f115701x) && CoreModule.m30933P().m143405a().mo34510h5()) {
            boolean zM54714m = this.f115701x.m54714m();
            C8928d c8928d = this.f115701x;
            C8928d.a aVarM54703b = zM54714m ? c8928d.m54703b() : c8928d.m54705d();
            Merchandise merchandiseM54784s = aVarM54703b.m54784s();
            double d = merchandiseM54784s.defaultStockKeepUnit.prices.price;
            if (!merchandiseM54784s.yearly() && d <= this.f115663C && TEnum.equals(aVarM54703b.m54762f(), "svip")) {
                o1j0.m165649w(R$string.f28473v1);
                return;
            }
        }
        if (tab0.m189811h().m189835z() && !g6b.m129215e(this.f115695r) && ((!g6b.m129213c(this.f115695r) || !zM173718k) && NullChecker.m82486a(this.f115671K) && NullChecker.m82486a(this.f115701x))) {
            final Merchandise merchandiseM54784s2 = m140800x().m54784s();
            if ((merchandiseM54784s2.noneRenewable() && !merchandiseM54784s2.yearly()) || (merchandiseM54784s2.yearly() && merchandiseM54784s2.noneRenewable() && TEnum.equals(this.f115702y, "alipay"))) {
                C8928d c8928dMo54381c2 = this.f115671K.mo54381c(merchandiseM54784s2.quantity);
                if (NullChecker.m82486a(c8928dMo54381c2)) {
                    int iM54781p = c8928dMo54381c2.m54703b().m54781p();
                    Act act = this.f115694q;
                    bn60.m105340W(act, bn60.m105333P(act, iM54781p, this.f115695r), null, new x20() { // from class: l.fm60
                        @Override // p153l.x20
                        public final void call() {
                            this.f99730a.m140772T(merchandiseM54784s2);
                        }
                    }, new x20() { // from class: l.gm60
                        @Override // p153l.x20
                        public final void call() {
                            this.f104926a.m140773U(y20Var);
                        }
                    });
                    return;
                }
            }
        }
        m140777Y(this.f115702y, y20Var);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m140775W(View view) {
        m140756D();
    }

    /* JADX INFO: renamed from: X */
    public void m140776X(PayMethod payMethod) {
        double dM140802z = m140802z();
        String strM140754B = m140754B();
        JSONObject jSONObject = new JSONObject();
        String string = payMethod.toString();
        string.getClass();
        String str = PayMethod.jingdong;
        boolean z = false;
        switch (string) {
            case "alipay":
                str = "alipay";
                break;
            case "wechat":
                str = "wechat";
                break;
            case "jingdong":
                break;
            default:
                str = null;
                break;
        }
        try {
            jSONObject.put("platform", str);
            jSONObject.put("skuID", strM140754B);
            jSONObject.put("purchaseShowFrom", abb0.m96735b(this.f115697t));
            jSONObject.put("productType", m140753A());
            jSONObject.put(FirebaseAnalytics.Param.PRICE, dM140802z);
            jSONObject.put("if_discount", m140764L());
            if (NullChecker.m82486a(this.f115701x)) {
                jSONObject.put(BLiveOperationTitleShowType.duration, m140800x().m54788w() + "M");
            }
            boolean z2 = NullChecker.m82486a(this.f115701x) && this.f115701x.m54715n();
            boolean z3 = CoreModule.f18264c.f20333O0.m31086w3() && CoreModule.m30933P().m143405a().mo34428U();
            String str2 = "yes";
            if (z2) {
                if (TEnum.equals(payMethod, "alipay") && z3) {
                    z = true;
                }
                jSONObject.put("no_secret_payment", z ? "yes" : "no");
            } else {
                jSONObject.put("no_secret_payment", "no");
            }
            if (!z3) {
                str2 = "no";
            }
            jSONObject.put("user_secret_staus", str2);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        i4g0.m138522t("e_purchase_button", "p_purchase_page", jSONObject);
    }

    /* JADX INFO: renamed from: Y */
    public final void m140777Y(PayMethod payMethod, y20<Integer> y20Var) {
        if (m140758F()) {
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call(0);
            }
        } else if (TEnum.equals(payMethod, "alipay")) {
            m140755C(y20Var);
            m140776X(PayMethod.get("alipay"));
        } else if (TEnum.equals(payMethod, "wechat")) {
            m140759G(y20Var);
            m140776X(PayMethod.get("wechat"));
        } else if (TEnum.equals(payMethod, PayMethod.jingdong)) {
            m140757E(y20Var);
            m140776X(PayMethod.get(PayMethod.jingdong));
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m140778Z() {
        if (bnl0.m105529O0(this.f115686i) && TextUtils.equals(this.f115686i.getText(), this.f115672L)) {
            bnl0.m105524M(this.f115686i, false);
            this.f115672L = "";
        }
    }

    @Override // p153l.i2m
    /* JADX INFO: renamed from: a */
    public View mo115924a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f115694q.inflater().inflate(rec0.f162492S2, viewGroup, false);
        m140795t(viewInflate);
        this.f115685h.setTypeface(lyh0.m156283c(3));
        m140752u();
        this.f115691n.setPurchaseType(this.f115695r);
        this.f115680c.setTypeface(lyh0.m156283c(3));
        this.f115680c.setTextColor(this.f115694q.getResources().getColor(h9c0.f108358a0));
        bnl0.m105507D0(qa00.m175859d(3.0f), this.f115692o);
        bnl0.m105537U(this.f115691n, qa00.m175859d(43.0f));
        if (wib0.m206561e(this.f115695r)) {
            bnl0.m105505C0(this.f115691n, qa00.m175859d(30.0f));
            bnl0.m105537U(this.f115691n, qa00.m175859d(36.0f));
            this.f115685h.setTypeface(lyh0.m156283c(3), 1);
            this.f115691n.f35206a.setTypeface(lyh0.m156283c(3), 1);
        }
        if (wib0.m206559c(this.f115695r)) {
            bnl0.m105524M(this.f115688k, false);
            bnl0.m105505C0(this.f115687j, qa00.m175859d(56.0f));
        } else {
            bnl0.m105505C0(this.f115687j, qa00.m175859d(76.0f));
        }
        if (!wib0.m206561e(this.f115695r) && (!wib0.m206559c(this.f115695r) || CoreModule.f18273l.m143410g().mo36081v9() || joa.m146361M3())) {
            bnl0.m105524M(this.f115687j, false);
            return viewInflate;
        }
        bnl0.m105524M(this.f115687j, true);
        this.f115689l.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105509E0(this.f115689l, new View.OnClickListener() { // from class: l.yl60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200532a.m140767O(view);
            }
        });
        i4g0.m138526x("e_purchase_boost_svip_guide", "p_purchase_page");
        return viewInflate;
    }

    /* JADX INFO: renamed from: a0 */
    public void m140779a0() {
        bnl0.m105524M(this.f115681d, false);
        boolean zMo34527j3 = CoreModule.m30933P().m143405a().mo34527j3();
        VText vText = this.f115680c;
        if (zMo34527j3) {
            vText.setText(R$string.f28308h);
        } else {
            vText.setText(R$string.f28135R9);
        }
        int i = jbc0.f119549da;
        if (wib0.m206565i(this.f115695r)) {
            i = jbc0.f119767t4;
            this.f115680c.setTextColor(Color.parseColor("#ccE8CA8A"));
        }
        this.f115679b.setImageResource(i);
        this.f115702y = PayMethod.get("alipay");
        if (NullChecker.m82486a(this.f115703z)) {
            this.f115703z.call(PayMethod.get("alipay"));
        }
        if (CoreModule.m30933P().m143405a().mo34528jh()) {
            this.f115681d.setText(CoreModule.m30933P().m143405a().mo34305D6());
            bnl0.m105524M(this.f115681d, true);
        } else if (CoreModule.m30933P().m143405a().mo34372Mi()) {
            String strMo34325G8 = CoreModule.m30933P().m143405a().mo34325G8();
            boolean zIsEmpty = TextUtils.isEmpty(strMo34325G8);
            VText vText2 = this.f115681d;
            if (zIsEmpty) {
                bnl0.m105524M(vText2, false);
            } else {
                vText2.setText(strMo34325G8);
                bnl0.m105524M(this.f115681d, true);
            }
        }
        m140793r0();
    }

    @Override // p153l.i2m
    @CallSuper
    /* JADX INFO: renamed from: b */
    public void mo115926b(C8928d c8928d) {
        if (c8928d == null) {
            return;
        }
        mo115933g0(c8928d);
        if (wib0.m206561e(this.f115695r) || (wib0.m206559c(this.f115695r) && NullChecker.m82486a(c8928d.m54705d()))) {
            this.f115685h.setText(String.format("%s%s元获取", c8928d.m54705d().m54766h(), z7a.m218875r0(c8928d.m54705d().m54774l())));
        }
        if (this.f115701x != null && this.f115661A) {
            this.f115661A = false;
            if (TEnum.equals(this.f115702y, "wechat")) {
                this.f115703z.call(PayMethod.get("wechat"));
            } else if (TEnum.equals(this.f115702y, "alipay")) {
                this.f115703z.call(PayMethod.get("alipay"));
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m140780b0() {
        bnl0.m105524M(this.f115681d, false);
        this.f115680c.setText("京东支付");
        int i = jbc0.f119563ea;
        if (wib0.m206565i(this.f115695r)) {
            i = jbc0.f119795v4;
            this.f115680c.setTextColor(Color.parseColor("#ccE8CA8A"));
        }
        this.f115679b.setImageResource(i);
        this.f115702y = PayMethod.get(PayMethod.jingdong);
        if (NullChecker.m82486a(this.f115703z)) {
            this.f115703z.call(PayMethod.get(PayMethod.jingdong));
        }
        if (CoreModule.m30933P().m143405a().mo34528jh()) {
            bnl0.m105524M(this.f115681d, false);
            bnl0.m105524M(this.f115682e, false);
        } else {
            m140793r0();
        }
        m140760H(true);
    }

    @Override // p153l.i2m
    /* JADX INFO: renamed from: c */
    public void mo138227c(String str) {
        this.f115697t = str;
    }

    /* JADX INFO: renamed from: c0 */
    public void mo115928c0(View.OnClickListener onClickListener) {
        this.f115690m.setTextColor(wib0.m206565i(this.f115695r) ? Color.parseColor("#E8CA8A") : Color.parseColor("#d9d9d9"));
        this.f115690m.setText("不，谢谢");
        bnl0.m105524M(this.f115690m, true);
        bnl0.m105509E0(this.f115690m, onClickListener);
    }

    @Override // p153l.y3m
    /* JADX INFO: renamed from: d */
    public boolean mo37060d() {
        if (!NullChecker.m82486a(this.f115700w)) {
            return false;
        }
        this.f115700w.mo37058a(this.f115695r, this.f115694q, TextUtils.isEmpty(this.f115697t) ? null : this.f115697t);
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m140781d0(C8928d c8928d) {
        bnl0.m105524M(this.f115691n, true);
        this.f115691n.m54289c(tab0.m189811h().m189820k(c8928d.m54703b().m54784s()));
    }

    @Override // p153l.y3m
    /* JADX INFO: renamed from: e */
    public boolean mo37061e() {
        if (!NullChecker.m82486a(this.f115699v)) {
            return false;
        }
        this.f115699v.mo37058a(this.f115695r, this.f115694q, TextUtils.isEmpty(this.f115697t) ? null : this.f115697t);
        return true;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m140782e0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        bnl0.m105524M(this.f115686i, true);
        this.f115686i.setText(charSequence);
        this.f115686i.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // p153l.i2m
    /* JADX INFO: renamed from: f */
    public void mo138228f(C8928d c8928d) {
        if (c8928d == null) {
            return;
        }
        mq60 mq60VarM168789b = new oq60(new lq60(this.f115694q, this.f115697t, this.f115695r, c8928d, this.f115702y)).m168789b();
        this.f115685h.setText(mq60VarM168789b.m159466b());
        boolean z = false;
        bnl0.m105524M(this.f115686i, false);
        if (wib0.m206561e(this.f115695r) || (wib0.m206559c(this.f115695r) && NullChecker.m82486a(c8928d.m54705d()))) {
            this.f115685h.setText(String.format("%s%s元获取", c8928d.m54705d().m54766h(), z7a.m218875r0(c8928d.m54705d().m54774l())));
        }
        if (!this.f115667G && c8928d.m54714m() && wib0.m206579w(this.f115695r) && v5b0.m199799y(c8928d.m54703b().m54784s()) && c8928d.m54703b().m54784s().isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) {
            m140781d0(c8928d);
            m140782e0(mq60VarM168789b.m159467c());
        } else if (c8928d.m54714m() && wib0.m206573q(this.f115695r) && v5b0.m199797w(c8928d.m54703b().m54784s())) {
            if (pta.m173729v(c8928d.m54703b())) {
                this.f115691n.m54289c(pta.m173721n(c8928d.m54703b()));
                bnl0.m105524M(this.f115691n, true);
            } else {
                m140781d0(c8928d);
            }
            m140782e0(mq60VarM168789b.m159467c());
        } else if (c8928d.m54714m() && wib0.m206569m(this.f115695r) && v5b0.m199795u(c8928d.m54703b().m54784s())) {
            m140781d0(c8928d);
            m140782e0(mq60VarM168789b.m159467c());
        } else if (!this.f115667G && c8928d.m54714m() && wib0.m206579w(this.f115695r) && v5b0.m199790p(c8928d.m54703b().m54784s(), ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPrice3Month)) {
            m140781d0(c8928d);
            m140782e0(mq60VarM168789b.m159467c());
        } else if (!TextUtils.isEmpty(mq60VarM168789b.m159467c())) {
            boolean z2 = this.f115667G;
            PromotionPendantView promotionPendantView = this.f115691n;
            if (z2) {
                bnl0.m105524M(promotionPendantView, true);
                this.f115691n.m54289c(mq60VarM168789b.m159467c());
            } else {
                bnl0.m105524M(promotionPendantView, true);
                m140799w();
                this.f115691n.m54289c(mq60VarM168789b.m159467c());
            }
        } else if (wib0.m206565i(this.f115695r) && !C8929e.m54833x(this.f115697t)) {
            bnl0.m105524M(this.f115691n, true);
            if (!this.f115673M) {
                this.f115691n.m54289c("限时优惠");
            }
            z = true;
        } else if (!this.f115673M) {
            bnl0.m105524M(this.f115691n, false);
        }
        if (TEnum.equals(this.f115702y, "alipay")) {
            this.f115680c.setText(mq60VarM168789b.m159465a());
        } else if (TEnum.equals(this.f115702y, "wechat")) {
            this.f115680c.setText(mq60VarM168789b.m159468d());
        }
        this.f115674N = z;
    }

    /* JADX INFO: renamed from: f0 */
    public void m140783f0() {
        bnl0.m105524M(this.f115681d, false);
        this.f115680c.setText(R$string.f28201X9);
        int i = jbc0.f119577fa;
        if (wib0.m206565i(this.f115695r)) {
            i = jbc0.f119809w4;
            this.f115680c.setTextColor(Color.parseColor("#ccE8CA8A"));
        }
        this.f115679b.setImageResource(i);
        this.f115702y = PayMethod.get("wechat");
        if (NullChecker.m82486a(this.f115703z)) {
            this.f115703z.call(PayMethod.get("wechat"));
        }
        if (CoreModule.m30933P().m143405a().mo34528jh()) {
            bnl0.m105524M(this.f115681d, false);
        } else if (CoreModule.m30933P().m143405a().mo34372Mi()) {
            String strMo34629xb = CoreModule.m30933P().m143405a().mo34629xb();
            boolean zIsEmpty = TextUtils.isEmpty(strMo34629xb);
            VText vText = this.f115681d;
            if (zIsEmpty) {
                bnl0.m105524M(vText, false);
            } else {
                vText.setText(strMo34629xb);
                bnl0.m105524M(this.f115681d, true);
            }
        }
        m140760H((CoreModule.m30933P().m143405a().mo180463f() && wib0.m206565i(this.f115695r)) || (CoreModule.m30933P().m143405a().mo34532k() && wib0.m206569m(this.f115695r)) || wib0.m206571o(this.f115695r));
        m140793r0();
    }

    @Override // p153l.i2m
    /* JADX INFO: renamed from: g */
    public void mo138229g(boolean z) {
        this.f115696s = z;
    }

    /* JADX INFO: renamed from: g0 */
    public void mo115933g0(C8928d c8928d) {
        this.f115701x = c8928d;
    }

    @Override // p153l.i2m
    /* JADX INFO: renamed from: h */
    public void mo138230h() {
        if (NullChecker.m82486a(this.f115684g)) {
            this.f115684g.performClick();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void mo115935h0(Privilege privilege) {
        this.f115665E = privilege;
    }

    @Override // p153l.i2m
    /* JADX INFO: renamed from: i */
    public void mo115937i(final y20<Integer> y20Var) {
        this.f115685h.setText(z090.m218107b(this.f115695r));
        if (xl60.m211507l()) {
            m140779a0();
        } else {
            m140783f0();
        }
        bnl0.m105509E0(this.f115684g, new View.OnClickListener() { // from class: l.am60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72202a.m140774V(y20Var, view);
            }
        });
        bnl0.m105509E0(this.f115678a, new View.OnClickListener() { // from class: l.bm60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77271a.m140775W(view);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m140784i0(boolean z) {
        this.f115698u = z;
    }

    /* JADX INFO: renamed from: j0 */
    public void m140785j0(a30<PurchaseType, Act, String> a30Var) {
        this.f115700w = a30Var;
    }

    /* JADX INFO: renamed from: k0 */
    public void m140786k0(a30<PurchaseType, Act, String> a30Var) {
        this.f115699v = a30Var;
    }

    /* JADX INFO: renamed from: l0 */
    public void m140787l0(z3m z3mVar) {
        this.f115671K = z3mVar;
    }

    /* JADX INFO: renamed from: m0 */
    public void m140788m0(String str) {
        this.f115666F = str;
    }

    /* JADX INFO: renamed from: n0 */
    public void m140789n0(y20<PayMethod> y20Var) {
        this.f115703z = y20Var;
    }

    /* JADX INFO: renamed from: o0 */
    public void m140790o0(C8924b c8924b) {
        this.f115669I = c8924b;
    }

    /* JADX INFO: renamed from: p0 */
    public void m140791p0(PurchaseView purchaseView) {
        this.f115670J = purchaseView;
    }

    /* JADX INFO: renamed from: q0 */
    public void m140792q0(Object obj) {
        this.f115662B = obj;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m140793r0() {
        bnl0.m105524M(this.f115682e, false);
    }

    @Override // p153l.i2m
    public void release() {
        psd0.m173633z(this.f115668H);
    }

    /* JADX INFO: renamed from: s0 */
    public void m140794s0(double d) {
        this.f115664D = d;
        m140798v();
    }

    /* JADX INFO: renamed from: t */
    public final void m140795t(View view) {
        jm60.m146143a(this, view);
    }

    /* JADX INFO: renamed from: t0 */
    public void m140796t0(double d) {
        this.f115663C = d;
        m140799w();
    }

    /* JADX INFO: renamed from: u0 */
    public void m140797u0() {
        PurchaseType purchaseType = this.f115695r;
        if ((purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_O_DIAMOND) && C8929e.m54833x(this.f115697t)) {
            this.f115685h.setText(this.f115694q.string(R$string.f28513y8));
            this.f115680c.setTypeface(lyh0.m156283c(3), 1);
            bnl0.m105524M(this.f115691n, false);
            m140778Z();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m140798v() {
        if (CoreModule.m30933P().m143405a().mo34586s3() && this.f115664D > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && !joa.m146357G3() && wib0.m206565i(this.f115695r)) {
            bnl0.m105524M(this.f115691n, true);
            this.f115691n.m54289c(String.format("支付返￥%s", new DecimalFormat("#.#").format(this.f115664D)));
            this.f115673M = true;
            return;
        }
        this.f115673M = false;
        boolean z = this.f115674N;
        PromotionPendantView promotionPendantView = this.f115691n;
        if (z) {
            promotionPendantView.m54289c("限时优惠");
        } else {
            bnl0.m105524M(promotionPendantView, false);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m140799w() {
        if (this.f115663C <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || !wib0.m206573q(this.f115695r) || ((long) Math.floor(this.f115663C)) <= 0) {
            m140778Z();
            this.f115672L = "";
        } else {
            String string = this.f115694q.getString(R$string.f28451t1, String.valueOf((long) Math.floor(this.f115663C)));
            this.f115672L = string;
            this.f115686i.setText(string);
            bnl0.m105524M(this.f115686i, true);
        }
        m140797u0();
    }

    /* JADX INFO: renamed from: x */
    public C8928d.a m140800x() {
        if (!NullChecker.m82486a(this.f115701x)) {
            return null;
        }
        boolean zM54715n = this.f115701x.m54715n();
        C8928d c8928d = this.f115701x;
        return zM54715n ? c8928d.m54703b() : c8928d.m54705d();
    }

    /* JADX INFO: renamed from: y */
    public <T extends wn60> T m140801y(T t) {
        return (T) t.m207168s(this.f115701x).m207171v(this.f115665E).m207175z(this.f115666F).m207143B(this);
    }

    /* JADX INFO: renamed from: z */
    public double m140802z() {
        C8928d c8928d = this.f115701x;
        if (c8928d == null) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        boolean zM54715n = c8928d.m54715n();
        C8928d c8928d2 = this.f115701x;
        if (zM54715n) {
            Merchandise merchandiseM54784s = c8928d2.m54703b().m54784s();
            return (v5b0.m199788n(merchandiseM54784s) || this.f115701x.m54709h()) ? merchandiseM54784s.getFirstCouponPrice() : merchandiseM54784s.defaultStockKeepUnit.prices.price;
        }
        Merchandise merchandiseM54784s2 = c8928d2.m54705d().m54784s();
        return (v5b0.m199788n(merchandiseM54784s2) || this.f115701x.m54710i()) ? merchandiseM54784s2.getFirstCouponPrice() : merchandiseM54784s2.defaultStockKeepUnit.prices.price;
    }
}
