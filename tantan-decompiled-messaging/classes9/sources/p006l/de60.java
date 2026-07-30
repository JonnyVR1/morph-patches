package p006l;

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
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.PromotionPendantView;
import com.p1.mobile.putong.core.ui.purchase.PurchaseView;
import com.p1.mobile.putong.core.ui.purchase.b;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.core.ui.purchase.e;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import l.b1c0;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.d3c0;
import l.e30;
import l.ee60;
import l.eqh0;
import l.f1m;
import l.g1m;
import l.g30;
import l.i0e;
import l.j760;
import l.lsi0;
import l.m6c0;
import l.m6h0;
import l.mkd0;
import l.n6a;
import l.p2b0;
import l.rf60;
import l.rxa0;
import l.sab0;
import l.sd60;
import l.t100;
import l.vwb;
import l.w2b0;
import l.we60;
import l.wf60;
import l.xdl0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class de60 implements ozl, f1m {

    /* JADX INFO: renamed from: B */
    public Object f10303B;

    /* JADX INFO: renamed from: C */
    public double f10304C;

    /* JADX INFO: renamed from: D */
    public double f10305D;

    /* JADX INFO: renamed from: E */
    public Privilege f10306E;

    /* JADX INFO: renamed from: F */
    public String f10307F;

    /* JADX INFO: renamed from: G */
    public boolean f10308G;

    /* JADX INFO: renamed from: H */
    public c4g0 f10309H;

    /* JADX INFO: renamed from: I */
    public b f10310I;

    /* JADX INFO: renamed from: J */
    public PurchaseView f10311J;

    /* JADX INFO: renamed from: K */
    public g1m f10312K;

    /* JADX INFO: renamed from: a */
    public LinearLayout f10319a;

    /* JADX INFO: renamed from: b */
    public VImage f10320b;

    /* JADX INFO: renamed from: c */
    public VText f10321c;

    /* JADX INFO: renamed from: d */
    public VText f10322d;

    /* JADX INFO: renamed from: e */
    public VText f10323e;

    /* JADX INFO: renamed from: f */
    public VImage f10324f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f10325g;

    /* JADX INFO: renamed from: h */
    public VText f10326h;

    /* JADX INFO: renamed from: i */
    public VText f10327i;

    /* JADX INFO: renamed from: j */
    public VFrame f10328j;

    /* JADX INFO: renamed from: k */
    public TextView f10329k;

    /* JADX INFO: renamed from: l */
    public VText f10330l;

    /* JADX INFO: renamed from: m */
    public TextView f10331m;

    /* JADX INFO: renamed from: n */
    public PromotionPendantView f10332n;

    /* JADX INFO: renamed from: o */
    public Space f10333o;

    /* JADX INFO: renamed from: p */
    public View f10334p;

    /* JADX INFO: renamed from: q */
    public Act f10335q;

    /* JADX INFO: renamed from: r */
    public PurchaseType f10336r;

    /* JADX INFO: renamed from: s */
    public boolean f10337s;

    /* JADX INFO: renamed from: t */
    public String f10338t;

    /* JADX INFO: renamed from: u */
    public boolean f10339u;

    /* JADX INFO: renamed from: v */
    public g30<PurchaseType, Act, String> f10340v;

    /* JADX INFO: renamed from: w */
    public g30<PurchaseType, Act, String> f10341w;

    /* JADX INFO: renamed from: x */
    public d f10342x;

    /* JADX INFO: renamed from: y */
    public PayMethod f10343y;

    /* JADX INFO: renamed from: z */
    public e30<PayMethod> f10344z;

    /* JADX INFO: renamed from: A */
    public boolean f10302A = true;

    /* JADX INFO: renamed from: L */
    public CharSequence f10313L = "";

    /* JADX INFO: renamed from: M */
    public boolean f10314M = false;

    /* JADX INFO: renamed from: N */
    public boolean f10315N = false;

    /* JADX INFO: renamed from: O */
    public String f10316O = "";

    /* JADX INFO: renamed from: P */
    public boolean f10317P = true;

    /* JADX INFO: renamed from: Q */
    public e30<PayMethod> f10318Q = new e30() { // from class: l.ud60
        public final void call(Object obj) {
            this.f23489a.m13929P((PayMethod) obj);
        }
    };

    public de60(Act act, PurchaseType purchaseType) {
        this.f10335q = null;
        this.f10336r = null;
        this.f10335q = act;
        this.f10336r = purchaseType;
    }

    /* JADX INFO: renamed from: u */
    private void m13913u() {
        if (sab0.i(this.f10336r)) {
            this.f10325g.setBackgroundDrawable(this.f10335q.getDrawable(d3c0.T4));
            this.f10326h.setTextColor(Color.parseColor("#cc000000"));
            this.f10326h.setTypeface(eqh0.c(3));
            this.f10324f.setImageResource(d3c0.u4);
            return;
        }
        if (sab0.g(this.f10336r)) {
            this.f10325g.setBackgroundDrawable(this.f10335q.drawable(d3c0.L));
            return;
        }
        if (sab0.x(this.f10336r)) {
            this.f10325g.setBackgroundDrawable(this.f10335q.drawable(d3c0.xb));
            return;
        }
        if (sab0.a(this.f10336r)) {
            this.f10325g.setBackgroundDrawable(this.f10335q.drawable(d3c0.M9));
            return;
        }
        if (sab0.o(this.f10336r)) {
            this.f10325g.setBackgroundDrawable(this.f10335q.drawable(d3c0.L9));
        } else if (sab0.e(this.f10336r) || sab0.c(this.f10336r)) {
            this.f10325g.setBackgroundDrawable(this.f10335q.drawable(d3c0.M9));
        } else {
            this.f10325g.setBackgroundDrawable(this.f10335q.drawable(d3c0.N9));
        }
    }

    /* JADX INFO: renamed from: A */
    public String m13914A() {
        return this.f10336r.productCategory().name();
    }

    /* JADX INFO: renamed from: B */
    public String m13915B() {
        if (!NullChecker.a(this.f10342x)) {
            return "";
        }
        d.a aVarM13973x = m13973x();
        return NullChecker.a(aVarM13973x) ? aVarM13973x.s().defaultStockKeepUnit.id : "";
    }

    /* JADX INFO: renamed from: C */
    public String m13916C(e30<Integer> e30Var) {
        rf60 rf60Var = new rf60(this.f10336r, this.f10335q, this.f10338t, this.f10303B);
        if (dsa.m14202j()) {
            rf60Var.D(false);
            dsa.m14216x(false);
        }
        return m13974y(rf60Var).g(e30Var);
    }

    /* JADX INFO: renamed from: D */
    public void m13917D() {
        final cwf0 cwf0VarC = i0e.c("p_purchase_intermediate_page", getClass().getName());
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "active"), vwb.Y("purchaseShowFrom", w2b0.b(this.f10338t)), vwb.Y("productType", this.f10336r.productCategory().name()), vwb.Y("skuID", m13915B() == null ? "" : m13915B())});
        new wf60(this.f10335q, this.f10336r).r(this.f10343y).l(this.f10317P).q(this.f10318Q).p(new DialogInterface.OnDismissListener() { // from class: l.ce60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).s();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: E */
    public String m13918E(e30<Integer> e30Var) {
        return m13974y(new rf60(this.f10336r, this.f10335q, this.f10338t, this.f10303B)).h(e30Var);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m13919F() {
        return m6h0.m(this.f10342x, this.f10336r, this.f10335q);
    }

    /* JADX INFO: renamed from: G */
    public String m13920G(e30<Integer> e30Var) {
        rf60 rf60VarM13974y = m13974y(new rf60(this.f10336r, this.f10335q, this.f10338t, this.f10303B));
        if (p2b0.h().z() && NullChecker.a(this.f10312K) && NullChecker.a(this.f10342x) && NullChecker.a(this.f10342x.b())) {
            rf60VarM13974y.y(this.f10312K.d(this.f10342x.b().w()));
        }
        return rf60VarM13974y.j(e30Var);
    }

    /* JADX INFO: renamed from: H */
    public void m13921H(boolean z) {
        b bVar = this.f10310I;
        if (bVar != null) {
            bVar.P(z);
            return;
        }
        PurchaseView purchaseView = this.f10311J;
        if (purchaseView != null) {
            purchaseView.E(z);
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m13922I() {
        return NullChecker.a(this.f10342x) && this.f10342x.m();
    }

    /* JADX INFO: renamed from: J */
    public boolean m13923J() {
        return this.f10339u;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m13924K() {
        if (m13927N()) {
            this.f10316O = "PURCHASE_DIALOG_TAB";
        } else if (m13926M()) {
            this.f10316O = "PURCHASE_DIALOG_SINGLE";
        }
        if (dsa.m14211s(this.f10316O) && sab0.d(this.f10336r)) {
            return m13927N() || m13926M();
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m13925L() {
        d dVar = this.f10342x;
        if (dVar == null) {
            return false;
        }
        boolean zM = dVar.m();
        d dVar2 = this.f10342x;
        if (zM) {
            return rxa0.n(dVar2.b().s()) || this.f10342x.h();
        }
        return rxa0.n(dVar2.d().s()) || this.f10342x.i();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m13926M() {
        return NullChecker.a(this.f10310I) && !this.f10310I.V() && m13922I();
    }

    /* JADX INFO: renamed from: N */
    public final boolean m13927N() {
        return NullChecker.a(this.f10311J) && !this.f10311J.G() && m13922I();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m13928O(View view) {
        if (NullChecker.a(this.f10310I)) {
            this.f10310I.O();
        }
        zvf0.r("e_purchase_boost_svip_guide", "p_purchase_page");
        c.x0(this.f10335q, sab0.c(this.f10336r) ? "p_accelerate_pop,svip_guide" : "p_purchase_page,e_purchase_boost_svip_guide,click", Privilege.see_who_likes_me);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m13929P(PayMethod payMethod) {
        if (TEnum.equals(payMethod, "alipay")) {
            m13941a0();
        } else if (TEnum.equals(payMethod, "wechat")) {
            m13951f0();
        } else if (TEnum.equals(payMethod, "jingdong")) {
            m13943b0();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m13930Q(e30 e30Var) {
        if (NullChecker.a(this.f10311J)) {
            this.f10311J.V();
        }
        if (NullChecker.a(this.f10310I)) {
            this.f10310I.r0();
        }
        m13938Y(this.f10343y, e30Var);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m13931R() {
        if (NullChecker.a(this.f10311J)) {
            this.f10311J.D(Boolean.FALSE);
        }
        if (NullChecker.a(this.f10310I)) {
            this.f10310I.N(Boolean.FALSE);
        }
        if (m13973x().s().monthType()) {
            dsa.m14208p();
            this.f10312K.b(m13973x().s().quantity);
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m13932S() {
        if (NullChecker.a(this.f10311J)) {
            this.f10311J.V();
        }
        if (NullChecker.a(this.f10310I)) {
            this.f10310I.r0();
        }
        this.f10325g.performClick();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m13933T(Merchandise merchandise) {
        this.f10312K.a(merchandise.quantity);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m13934U(e30 e30Var) {
        m13938Y(this.f10343y, e30Var);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m13935V(final e30 e30Var, View view) {
        boolean zM14203k = dsa.m14203k();
        if (m13924K()) {
            if ((t4b.m24455e(this.f10336r) || t4b.m24453c(this.f10336r)) && ((NullChecker.a(this.f10311J) || NullChecker.a(this.f10310I)) && NullChecker.a(m13973x()) && NullChecker.a(m13973x().s()))) {
                d dVarC = this.f10312K.c(m13973x().s().quantity);
                if (NullChecker.a(dVarC)) {
                    dsa.m14192D(this.f10335q, dsa.m14204l(dVarC.b().p(), this.f10336r), this.f10336r, null, new d30() { // from class: l.xd60
                        public final void call() {
                            this.f27455a.m13930Q(e30Var);
                        }
                    }, new d30() { // from class: l.yd60
                        public final void call() {
                            this.f28132a.m13931R();
                        }
                    });
                    return;
                }
            }
            dsa.m14190B(this.f10335q, null, new d30() { // from class: l.zd60
                public final void call() {
                    this.f28715a.m13932S();
                }
            });
            return;
        }
        if (NullChecker.a(this.f10342x) && CoreModule.m1854P().m11706a().m5444h5()) {
            boolean zM = this.f10342x.m();
            d dVar = this.f10342x;
            d.a aVarB = zM ? dVar.b() : dVar.d();
            Merchandise merchandiseS = aVarB.s();
            double d = merchandiseS.defaultStockKeepUnit.prices.price;
            if (!merchandiseS.yearly() && d <= this.f10304C && TEnum.equals(aVarB.f(), "svip")) {
                lsi0.w(R.string.v1);
                return;
            }
        }
        if (p2b0.h().z() && !t4b.m24455e(this.f10336r) && ((!t4b.m24453c(this.f10336r) || !zM14203k) && NullChecker.a(this.f10312K) && NullChecker.a(this.f10342x))) {
            final Merchandise merchandiseS2 = m13973x().s();
            if ((merchandiseS2.noneRenewable() && !merchandiseS2.yearly()) || (merchandiseS2.yearly() && merchandiseS2.noneRenewable() && TEnum.equals(this.f10343y, "alipay"))) {
                d dVarC2 = this.f10312K.c(merchandiseS2.quantity);
                if (NullChecker.a(dVarC2)) {
                    int iP = dVarC2.b().p();
                    Act act = this.f10335q;
                    we60.W(act, we60.P(act, iP, this.f10336r), (JSONObject) null, new d30() { // from class: l.ae60
                        public final void call() {
                            this.f8229a.m13933T(merchandiseS2);
                        }
                    }, new d30() { // from class: l.be60
                        public final void call() {
                            this.f8842a.m13934U(e30Var);
                        }
                    });
                    return;
                }
            }
        }
        m13938Y(this.f10343y, e30Var);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m13936W(View view) {
        m13917D();
    }

    /* JADX INFO: renamed from: X */
    public void m13937X(PayMethod payMethod) {
        double dM13975z = m13975z();
        String strM13915B = m13915B();
        JSONObject jSONObject = new JSONObject();
        String string = payMethod.toString();
        string.getClass();
        String str = "jingdong";
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
            jSONObject.put("skuID", strM13915B);
            jSONObject.put("purchaseShowFrom", w2b0.b(this.f10338t));
            jSONObject.put("productType", m13914A());
            jSONObject.put("price", dM13975z);
            jSONObject.put("if_discount", m13925L());
            if (NullChecker.a(this.f10342x)) {
                jSONObject.put("duration", m13973x().w() + "M");
            }
            boolean z2 = NullChecker.a(this.f10342x) && this.f10342x.n();
            boolean z3 = CoreModule.f1534c.f3580O0.m2016w3() && CoreModule.m1854P().m11706a().m5362U();
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
            CrashHelper.c(e);
        }
        zvf0.t("e_purchase_button", "p_purchase_page", jSONObject);
    }

    /* JADX INFO: renamed from: Y */
    public final void m13938Y(PayMethod payMethod, e30<Integer> e30Var) {
        if (m13919F()) {
            if (NullChecker.a(e30Var)) {
                e30Var.call(0);
            }
        } else if (TEnum.equals(payMethod, "alipay")) {
            m13916C(e30Var);
            m13937X(PayMethod.get("alipay"));
        } else if (TEnum.equals(payMethod, "wechat")) {
            m13920G(e30Var);
            m13937X(PayMethod.get("wechat"));
        } else if (TEnum.equals(payMethod, "jingdong")) {
            m13918E(e30Var);
            m13937X(PayMethod.get("jingdong"));
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m13939Z() {
        if (xdl0.O0(this.f10327i) && TextUtils.equals(this.f10327i.getText(), this.f10313L)) {
            xdl0.M(this.f10327i, false);
            this.f10313L = "";
        }
    }

    @Override // p006l.ozl
    /* JADX INFO: renamed from: a */
    public View mo13940a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f10335q.inflater().inflate(m6c0.S2, viewGroup, false);
        m13968t(viewInflate);
        this.f10326h.setTypeface(eqh0.c(3));
        m13913u();
        this.f10332n.setPurchaseType(this.f10336r);
        this.f10321c.setTypeface(eqh0.c(3));
        this.f10321c.setTextColor(this.f10335q.getResources().getColor(b1c0.a0));
        xdl0.D0(t100.d(3.0f), new View[]{this.f10333o});
        xdl0.U(this.f10332n, t100.d(43.0f));
        if (sab0.e(this.f10336r)) {
            xdl0.C0(this.f10332n, t100.d(30.0f));
            xdl0.U(this.f10332n, t100.d(36.0f));
            this.f10326h.setTypeface(eqh0.c(3), 1);
            this.f10332n.a.setTypeface(eqh0.c(3), 1);
        }
        if (sab0.c(this.f10336r)) {
            xdl0.M(this.f10329k, false);
            xdl0.C0(this.f10328j, t100.d(56.0f));
        } else {
            xdl0.C0(this.f10328j, t100.d(76.0f));
        }
        if (!sab0.e(this.f10336r) && (!sab0.c(this.f10336r) || CoreModule.f1543l.m11711g().m7015v9() || xma.m27355L3())) {
            xdl0.M(this.f10328j, false);
            return viewInflate;
        }
        xdl0.M(this.f10328j, true);
        this.f10330l.setTypeface(eqh0.c(3), 1);
        xdl0.E0(this.f10330l, new View.OnClickListener() { // from class: l.td60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22042a.m13928O(view);
            }
        });
        zvf0.x("e_purchase_boost_svip_guide", "p_purchase_page");
        return viewInflate;
    }

    /* JADX INFO: renamed from: a0 */
    public void m13941a0() {
        xdl0.M(this.f10322d, false);
        boolean zM5461j3 = CoreModule.m1854P().m11706a().m5461j3();
        VText vText = this.f10321c;
        if (zM5461j3) {
            vText.setText(R.string.h);
        } else {
            vText.setText(R.string.R9);
        }
        int i = d3c0.da;
        if (sab0.i(this.f10336r)) {
            i = d3c0.t4;
            this.f10321c.setTextColor(Color.parseColor("#ccE8CA8A"));
        }
        this.f10320b.setImageResource(i);
        this.f10343y = PayMethod.get("alipay");
        if (NullChecker.a(this.f10344z)) {
            this.f10344z.call(PayMethod.get("alipay"));
        }
        if (CoreModule.m1854P().m11706a().m5462jh()) {
            this.f10322d.setText(CoreModule.m1854P().m11706a().m5239D6());
            xdl0.M(this.f10322d, true);
        } else if (CoreModule.m1854P().m11706a().m5306Mi()) {
            String strM5259G8 = CoreModule.m1854P().m11706a().m5259G8();
            boolean zIsEmpty = TextUtils.isEmpty(strM5259G8);
            VText vText2 = this.f10322d;
            if (zIsEmpty) {
                xdl0.M(vText2, false);
            } else {
                vText2.setText(strM5259G8);
                xdl0.M(this.f10322d, true);
            }
        }
        m13966r0();
    }

    @Override // p006l.ozl
    @CallSuper
    /* JADX INFO: renamed from: b */
    public void mo13942b(d dVar) {
        if (dVar == null) {
            return;
        }
        mo13953g0(dVar);
        if (sab0.e(this.f10336r) || (sab0.c(this.f10336r) && NullChecker.a(dVar.d()))) {
            this.f10326h.setText(String.format("%s%s元获取", dVar.d().h(), n6a.r0(dVar.d().l())));
        }
        if (this.f10342x != null && this.f10302A) {
            this.f10302A = false;
            if (TEnum.equals(this.f10343y, "wechat")) {
                this.f10344z.call(PayMethod.get("wechat"));
            } else if (TEnum.equals(this.f10343y, "alipay")) {
                this.f10344z.call(PayMethod.get("alipay"));
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m13943b0() {
        xdl0.M(this.f10322d, false);
        this.f10321c.setText("京东支付");
        int i = d3c0.ea;
        if (sab0.i(this.f10336r)) {
            i = d3c0.v4;
            this.f10321c.setTextColor(Color.parseColor("#ccE8CA8A"));
        }
        this.f10320b.setImageResource(i);
        this.f10343y = PayMethod.get("jingdong");
        if (NullChecker.a(this.f10344z)) {
            this.f10344z.call(PayMethod.get("jingdong"));
        }
        if (CoreModule.m1854P().m11706a().m5462jh()) {
            xdl0.M(this.f10322d, false);
            xdl0.M(this.f10323e, false);
        } else {
            m13966r0();
        }
        m13921H(true);
    }

    @Override // p006l.ozl
    /* JADX INFO: renamed from: c */
    public void mo13944c(String str) {
        this.f10338t = str;
    }

    /* JADX INFO: renamed from: c0 */
    public void mo13945c0(View.OnClickListener onClickListener) {
        this.f10331m.setTextColor(sab0.i(this.f10336r) ? Color.parseColor("#E8CA8A") : Color.parseColor("#d9d9d9"));
        this.f10331m.setText("不，谢谢");
        xdl0.M(this.f10331m, true);
        xdl0.E0(this.f10331m, onClickListener);
    }

    /* JADX INFO: renamed from: d */
    public boolean m13946d() {
        if (!NullChecker.a(this.f10341w)) {
            return false;
        }
        this.f10341w.a(this.f10336r, this.f10335q, TextUtils.isEmpty(this.f10338t) ? null : this.f10338t);
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m13947d0(d dVar) {
        xdl0.M(this.f10332n, true);
        this.f10332n.c(p2b0.h().k(dVar.b().s()));
    }

    /* JADX INFO: renamed from: e */
    public boolean m13948e() {
        if (!NullChecker.a(this.f10340v)) {
            return false;
        }
        this.f10340v.a(this.f10336r, this.f10335q, TextUtils.isEmpty(this.f10338t) ? null : this.f10338t);
        return true;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m13949e0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        xdl0.M(this.f10327i, true);
        this.f10327i.setText(charSequence);
        this.f10327i.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // p006l.ozl
    /* JADX INFO: renamed from: f */
    public void mo13950f(d dVar) {
        if (dVar == null) {
            return;
        }
        hi60 hi60VarM17456b = new ji60(new gi60(this.f10335q, this.f10338t, this.f10336r, dVar, this.f10343y)).m17456b();
        this.f10326h.setText(hi60VarM17456b.m16220b());
        boolean z = false;
        xdl0.M(this.f10327i, false);
        if (sab0.e(this.f10336r) || (sab0.c(this.f10336r) && NullChecker.a(dVar.d()))) {
            this.f10326h.setText(String.format("%s%s元获取", dVar.d().h(), n6a.r0(dVar.d().l())));
        }
        if (!this.f10308G && dVar.m() && sab0.w(this.f10336r) && rxa0.y(dVar.b().s()) && dVar.b().s().isBelongPromotion("lowPriceCustomerVIP")) {
            m13947d0(dVar);
            m13949e0(hi60VarM17456b.m16221c());
        } else if (dVar.m() && sab0.q(this.f10336r) && rxa0.w(dVar.b().s())) {
            if (dsa.m14214v(dVar.b())) {
                this.f10332n.c(dsa.m14206n(dVar.b()));
                xdl0.M(this.f10332n, true);
            } else {
                m13947d0(dVar);
            }
            m13949e0(hi60VarM17456b.m16221c());
        } else if (dVar.m() && sab0.m(this.f10336r) && rxa0.u(dVar.b().s())) {
            m13947d0(dVar);
            m13949e0(hi60VarM17456b.m16221c());
        } else if (!this.f10308G && dVar.m() && sab0.w(this.f10336r) && rxa0.p(dVar.b().s(), ProductCategory.get("tttVip"), "lowPrice3Month")) {
            m13947d0(dVar);
            m13949e0(hi60VarM17456b.m16221c());
        } else if (!TextUtils.isEmpty(hi60VarM17456b.m16221c())) {
            boolean z2 = this.f10308G;
            PromotionPendantView promotionPendantView = this.f10332n;
            if (z2) {
                xdl0.M(promotionPendantView, true);
                this.f10332n.c(hi60VarM17456b.m16221c());
            } else {
                xdl0.M(promotionPendantView, true);
                m13972w();
                this.f10332n.c(hi60VarM17456b.m16221c());
            }
        } else if (sab0.i(this.f10336r) && !e.x(this.f10338t)) {
            xdl0.M(this.f10332n, true);
            if (!this.f10314M) {
                this.f10332n.c("限时优惠");
            }
            z = true;
        } else if (!this.f10314M) {
            xdl0.M(this.f10332n, false);
        }
        if (TEnum.equals(this.f10343y, "alipay")) {
            this.f10321c.setText(hi60VarM17456b.m16219a());
        } else if (TEnum.equals(this.f10343y, "wechat")) {
            this.f10321c.setText(hi60VarM17456b.m16222d());
        }
        this.f10315N = z;
    }

    /* JADX INFO: renamed from: f0 */
    public void m13951f0() {
        xdl0.M(this.f10322d, false);
        this.f10321c.setText(R.string.X9);
        int i = d3c0.fa;
        if (sab0.i(this.f10336r)) {
            i = d3c0.w4;
            this.f10321c.setTextColor(Color.parseColor("#ccE8CA8A"));
        }
        this.f10320b.setImageResource(i);
        this.f10343y = PayMethod.get("wechat");
        if (NullChecker.a(this.f10344z)) {
            this.f10344z.call(PayMethod.get("wechat"));
        }
        if (CoreModule.m1854P().m11706a().m5462jh()) {
            xdl0.M(this.f10322d, false);
        } else if (CoreModule.m1854P().m11706a().m5306Mi()) {
            String strM5563xb = CoreModule.m1854P().m11706a().m5563xb();
            boolean zIsEmpty = TextUtils.isEmpty(strM5563xb);
            VText vText = this.f10322d;
            if (zIsEmpty) {
                xdl0.M(vText, false);
            } else {
                vText.setText(strM5563xb);
                xdl0.M(this.f10322d, true);
            }
        }
        m13921H((CoreModule.m1854P().m11706a().m19879f() && sab0.i(this.f10336r)) || (CoreModule.m1854P().m11706a().m5466k() && sab0.m(this.f10336r)) || sab0.o(this.f10336r));
        m13966r0();
    }

    @Override // p006l.ozl
    /* JADX INFO: renamed from: g */
    public void mo13952g(boolean z) {
        this.f10337s = z;
    }

    /* JADX INFO: renamed from: g0 */
    public void mo13953g0(d dVar) {
        this.f10342x = dVar;
    }

    @Override // p006l.ozl
    /* JADX INFO: renamed from: h */
    public void mo13954h() {
        if (NullChecker.a(this.f10325g)) {
            this.f10325g.performClick();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void mo13955h0(Privilege privilege) {
        this.f10306E = privilege;
    }

    @Override // p006l.ozl
    /* JADX INFO: renamed from: i */
    public void mo13956i(final e30<Integer> e30Var) {
        this.f10326h.setText(vs80.m25865b(this.f10336r));
        if (sd60.l()) {
            m13941a0();
        } else {
            m13951f0();
        }
        xdl0.E0(this.f10325g, new View.OnClickListener() { // from class: l.vd60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24273a.m13935V(e30Var, view);
            }
        });
        xdl0.E0(this.f10319a, new View.OnClickListener() { // from class: l.wd60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25105a.m13936W(view);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m13957i0(boolean z) {
        this.f10339u = z;
    }

    /* JADX INFO: renamed from: j0 */
    public void m13958j0(g30<PurchaseType, Act, String> g30Var) {
        this.f10341w = g30Var;
    }

    /* JADX INFO: renamed from: k0 */
    public void m13959k0(g30<PurchaseType, Act, String> g30Var) {
        this.f10340v = g30Var;
    }

    /* JADX INFO: renamed from: l0 */
    public void m13960l0(g1m g1mVar) {
        this.f10312K = g1mVar;
    }

    /* JADX INFO: renamed from: m0 */
    public void m13961m0(String str) {
        this.f10307F = str;
    }

    /* JADX INFO: renamed from: n0 */
    public void m13962n0(e30<PayMethod> e30Var) {
        this.f10344z = e30Var;
    }

    /* JADX INFO: renamed from: o0 */
    public void m13963o0(b bVar) {
        this.f10310I = bVar;
    }

    /* JADX INFO: renamed from: p0 */
    public void m13964p0(PurchaseView purchaseView) {
        this.f10311J = purchaseView;
    }

    /* JADX INFO: renamed from: q0 */
    public void m13965q0(Object obj) {
        this.f10303B = obj;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m13966r0() {
        xdl0.M(this.f10323e, false);
    }

    @Override // p006l.ozl
    public void release() {
        mkd0.z(this.f10309H);
    }

    /* JADX INFO: renamed from: s0 */
    public void m13967s0(double d) {
        this.f10305D = d;
        m13971v();
    }

    /* JADX INFO: renamed from: t */
    public final void m13968t(View view) {
        ee60.a(this, view);
    }

    /* JADX INFO: renamed from: t0 */
    public void m13969t0(double d) {
        this.f10304C = d;
        m13972w();
    }

    /* JADX INFO: renamed from: u0 */
    public void m13970u0() {
        PurchaseType purchaseType = this.f10336r;
        if ((purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_O_DIAMOND) && e.x(this.f10338t)) {
            this.f10326h.setText(this.f10335q.string(R.string.y8));
            this.f10321c.setTypeface(eqh0.c(3), 1);
            xdl0.M(this.f10332n, false);
            m13939Z();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m13971v() {
        if (CoreModule.m1854P().m11706a().m5520s3() && this.f10305D > 0.0d && !xma.m27351F3() && sab0.i(this.f10336r)) {
            xdl0.M(this.f10332n, true);
            this.f10332n.c(String.format("支付返￥%s", new DecimalFormat("#.#").format(this.f10305D)));
            this.f10314M = true;
            return;
        }
        this.f10314M = false;
        boolean z = this.f10315N;
        PromotionPendantView promotionPendantView = this.f10332n;
        if (z) {
            promotionPendantView.c("限时优惠");
        } else {
            xdl0.M(promotionPendantView, false);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m13972w() {
        if (this.f10304C <= 0.0d || !sab0.q(this.f10336r) || ((long) Math.floor(this.f10304C)) <= 0) {
            m13939Z();
            this.f10313L = "";
        } else {
            String string = this.f10335q.getString(R.string.t1, String.valueOf((long) Math.floor(this.f10304C)));
            this.f10313L = string;
            this.f10327i.setText(string);
            xdl0.M(this.f10327i, true);
        }
        m13970u0();
    }

    /* JADX INFO: renamed from: x */
    public d.a m13973x() {
        if (!NullChecker.a(this.f10342x)) {
            return null;
        }
        boolean zN = this.f10342x.n();
        d dVar = this.f10342x;
        return zN ? dVar.b() : dVar.d();
    }

    /* JADX INFO: renamed from: y */
    public <T extends rf60> T m13974y(T t) {
        return (T) t.s(this.f10342x).v(this.f10306E).z(this.f10307F).B(this);
    }

    /* JADX INFO: renamed from: z */
    public double m13975z() {
        d dVar = this.f10342x;
        if (dVar == null) {
            return 0.0d;
        }
        boolean zN = dVar.n();
        d dVar2 = this.f10342x;
        if (zN) {
            Merchandise merchandiseS = dVar2.b().s();
            return (rxa0.n(merchandiseS) || this.f10342x.h()) ? merchandiseS.getFirstCouponPrice() : merchandiseS.defaultStockKeepUnit.prices.price;
        }
        Merchandise merchandiseS2 = dVar2.d().s();
        return (rxa0.n(merchandiseS2) || this.f10342x.i()) ? merchandiseS2.getFirstCouponPrice() : merchandiseS2.defaultStockKeepUnit.prices.price;
    }
}
