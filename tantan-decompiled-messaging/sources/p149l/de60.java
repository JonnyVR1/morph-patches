package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8761b;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.core.p053ui.purchase.PromotionPendantView;
import com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseView;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class de60 implements ozl, f1m {

    /* JADX INFO: renamed from: B */
    public Object f85720B;

    /* JADX INFO: renamed from: C */
    public double f85721C;

    /* JADX INFO: renamed from: D */
    public double f85722D;

    /* JADX INFO: renamed from: E */
    public Privilege f85723E;

    /* JADX INFO: renamed from: F */
    public String f85724F;

    /* JADX INFO: renamed from: G */
    public boolean f85725G;

    /* JADX INFO: renamed from: H */
    public c4g0 f85726H;

    /* JADX INFO: renamed from: I */
    public C8761b f85727I;

    /* JADX INFO: renamed from: J */
    public PurchaseView f85728J;

    /* JADX INFO: renamed from: K */
    public g1m f85729K;

    /* JADX INFO: renamed from: a */
    public LinearLayout f85736a;

    /* JADX INFO: renamed from: b */
    public VImage f85737b;

    /* JADX INFO: renamed from: c */
    public VText f85738c;

    /* JADX INFO: renamed from: d */
    public VText f85739d;

    /* JADX INFO: renamed from: e */
    public VText f85740e;

    /* JADX INFO: renamed from: f */
    public VImage f85741f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f85742g;

    /* JADX INFO: renamed from: h */
    public VText f85743h;

    /* JADX INFO: renamed from: i */
    public VText f85744i;

    /* JADX INFO: renamed from: j */
    public VFrame f85745j;

    /* JADX INFO: renamed from: k */
    public TextView f85746k;

    /* JADX INFO: renamed from: l */
    public VText f85747l;

    /* JADX INFO: renamed from: m */
    public TextView f85748m;

    /* JADX INFO: renamed from: n */
    public PromotionPendantView f85749n;

    /* JADX INFO: renamed from: o */
    public Space f85750o;

    /* JADX INFO: renamed from: p */
    public View f85751p;

    /* JADX INFO: renamed from: q */
    public Act f85752q;

    /* JADX INFO: renamed from: r */
    public PurchaseType f85753r;

    /* JADX INFO: renamed from: s */
    public boolean f85754s;

    /* JADX INFO: renamed from: t */
    public String f85755t;

    /* JADX INFO: renamed from: u */
    public boolean f85756u;

    /* JADX INFO: renamed from: v */
    public g30<PurchaseType, Act, String> f85757v;

    /* JADX INFO: renamed from: w */
    public g30<PurchaseType, Act, String> f85758w;

    /* JADX INFO: renamed from: x */
    public C8765d f85759x;

    /* JADX INFO: renamed from: y */
    public PayMethod f85760y;

    /* JADX INFO: renamed from: z */
    public e30<PayMethod> f85761z;

    /* JADX INFO: renamed from: A */
    public boolean f85719A = true;

    /* JADX INFO: renamed from: L */
    public CharSequence f85730L = "";

    /* JADX INFO: renamed from: M */
    public boolean f85731M = false;

    /* JADX INFO: renamed from: N */
    public boolean f85732N = false;

    /* JADX INFO: renamed from: O */
    public String f85733O = "";

    /* JADX INFO: renamed from: P */
    public boolean f85734P = true;

    /* JADX INFO: renamed from: Q */
    public e30<PayMethod> f85735Q = new e30() { // from class: l.ud60
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f175900a.m111134P((PayMethod) obj);
        }
    };

    public de60(Act act, PurchaseType purchaseType) {
        this.f85752q = null;
        this.f85753r = null;
        this.f85752q = act;
        this.f85753r = purchaseType;
    }

    /* JADX INFO: renamed from: u */
    private void m111118u() {
        if (sab0.m182891i(this.f85753r)) {
            this.f85742g.setBackgroundDrawable(this.f85752q.getDrawable(d3c0.f83755T4));
            this.f85743h.setTextColor(Color.parseColor("#cc000000"));
            this.f85743h.setTypeface(eqh0.m117752c(3));
            this.f85741f.setImageResource(d3c0.f84126u4);
            return;
        }
        if (sab0.m182889g(this.f85753r)) {
            this.f85742g.setBackgroundDrawable(this.f85752q.drawable(d3c0.f83641L));
            return;
        }
        if (sab0.m182906x(this.f85753r)) {
            this.f85742g.setBackgroundDrawable(this.f85752q.drawable(d3c0.f84175xb));
            return;
        }
        if (sab0.m182883a(this.f85753r)) {
            this.f85742g.setBackgroundDrawable(this.f85752q.drawable(d3c0.f83665M9));
            return;
        }
        if (sab0.m182897o(this.f85753r)) {
            this.f85742g.setBackgroundDrawable(this.f85752q.drawable(d3c0.f83651L9));
        } else if (sab0.m182887e(this.f85753r) || sab0.m182885c(this.f85753r)) {
            this.f85742g.setBackgroundDrawable(this.f85752q.drawable(d3c0.f83665M9));
        } else {
            this.f85742g.setBackgroundDrawable(this.f85752q.drawable(d3c0.f83679N9));
        }
    }

    /* JADX INFO: renamed from: A */
    public String m111119A() {
        return this.f85753r.productCategory().name();
    }

    /* JADX INFO: renamed from: B */
    public String m111120B() {
        if (!NullChecker.m81303a(this.f85759x)) {
            return "";
        }
        C8765d.a aVarM111176x = m111176x();
        return NullChecker.m81303a(aVarM111176x) ? aVarM111176x.m53601s().defaultStockKeepUnit.f20507id : "";
    }

    /* JADX INFO: renamed from: C */
    public String m111121C(e30<Integer> e30Var) {
        rf60 rf60Var = new rf60(this.f85753r, this.f85752q, this.f85755t, this.f85720B);
        if (dsa.m113437j()) {
            rf60Var.m179079D(false);
            dsa.m113451x(false);
        }
        return m111177y(rf60Var).m179090g(e30Var);
    }

    /* JADX INFO: renamed from: D */
    public void m111122D() {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_purchase_intermediate_page", getClass().getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", Active.TYPE), vwb.m200311Y("purchaseShowFrom", w2b0.m201088b(this.f85755t)), vwb.m200311Y("productType", this.f85753r.productCategory().name()), vwb.m200311Y("skuID", m111120B() == null ? "" : m111120B()));
        new wf60(this.f85752q, this.f85753r).m202975r(this.f85760y).m202969l(this.f85734P).m202974q(this.f85735Q).m202973p(new DialogInterface.OnDismissListener() { // from class: l.ce60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m202976s();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: E */
    public String m111123E(e30<Integer> e30Var) {
        return m111177y(new rf60(this.f85753r, this.f85752q, this.f85755t, this.f85720B)).m179091h(e30Var);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m111124F() {
        return m6h0.m153227m(this.f85759x, this.f85753r, this.f85752q);
    }

    /* JADX INFO: renamed from: G */
    public String m111125G(e30<Integer> e30Var) {
        rf60 rf60VarM111177y = m111177y(new rf60(this.f85753r, this.f85752q, this.f85755t, this.f85720B));
        if (p2b0.m167133h().m167157z() && NullChecker.m81303a(this.f85729K) && NullChecker.m81303a(this.f85759x) && NullChecker.m81303a(this.f85759x.m53520b())) {
            rf60VarM111177y.m179108y(this.f85729K.mo53199d(this.f85759x.m53520b().m53605w()));
        }
        return rf60VarM111177y.m179093j(e30Var);
    }

    /* JADX INFO: renamed from: H */
    public void m111126H(boolean z) {
        C8761b c8761b = this.f85727I;
        if (c8761b != null) {
            c8761b.m53275P(z);
            return;
        }
        PurchaseView purchaseView = this.f85728J;
        if (purchaseView != null) {
            purchaseView.m53162E(z);
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m111127I() {
        return NullChecker.m81303a(this.f85759x) && this.f85759x.m53531m();
    }

    /* JADX INFO: renamed from: J */
    public boolean m111128J() {
        return this.f85756u;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m111129K() {
        if (m111132N()) {
            this.f85733O = "PURCHASE_DIALOG_TAB";
        } else if (m111131M()) {
            this.f85733O = "PURCHASE_DIALOG_SINGLE";
        }
        if (dsa.m113446s(this.f85733O) && sab0.m182886d(this.f85753r)) {
            return m111132N() || m111131M();
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m111130L() {
        C8765d c8765d = this.f85759x;
        if (c8765d == null) {
            return false;
        }
        boolean zM53531m = c8765d.m53531m();
        C8765d c8765d2 = this.f85759x;
        if (zM53531m) {
            return rxa0.m181493n(c8765d2.m53520b().m53601s()) || this.f85759x.m53526h();
        }
        return rxa0.m181493n(c8765d2.m53522d().m53601s()) || this.f85759x.m53527i();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m111131M() {
        return NullChecker.m81303a(this.f85727I) && !this.f85727I.m53284V() && m111127I();
    }

    /* JADX INFO: renamed from: N */
    public final boolean m111132N() {
        return NullChecker.m81303a(this.f85728J) && !this.f85728J.m53164G() && m111127I();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m111133O(View view) {
        if (NullChecker.m81303a(this.f85727I)) {
            this.f85727I.m53273O();
        }
        zvf0.m220396r("e_purchase_boost_svip_guide", "p_purchase_page");
        C8764c.m53504x0(this.f85752q, sab0.m182885c(this.f85753r) ? "p_accelerate_pop,svip_guide" : "p_purchase_page,e_purchase_boost_svip_guide,click", Privilege.see_who_likes_me);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m111134P(PayMethod payMethod) {
        if (TEnum.equals(payMethod, "alipay")) {
            m111146a0();
        } else if (TEnum.equals(payMethod, "wechat")) {
            m111154f0();
        } else if (TEnum.equals(payMethod, PayMethod.jingdong)) {
            m111148b0();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m111135Q(e30 e30Var) {
        if (NullChecker.m81303a(this.f85728J)) {
            this.f85728J.m53179V();
        }
        if (NullChecker.m81303a(this.f85727I)) {
            this.f85727I.m53306r0();
        }
        m111143Y(this.f85760y, e30Var);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m111136R() {
        if (NullChecker.m81303a(this.f85728J)) {
            this.f85728J.m53161D(Boolean.FALSE);
        }
        if (NullChecker.m81303a(this.f85727I)) {
            this.f85727I.m53271N(Boolean.FALSE);
        }
        if (m111176x().m53601s().monthType()) {
            dsa.m113443p();
            this.f85729K.mo53197b(m111176x().m53601s().quantity);
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m111137S() {
        if (NullChecker.m81303a(this.f85728J)) {
            this.f85728J.m53179V();
        }
        if (NullChecker.m81303a(this.f85727I)) {
            this.f85727I.m53306r0();
        }
        this.f85742g.performClick();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m111138T(Merchandise merchandise) {
        this.f85729K.mo53196a(merchandise.quantity);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m111139U(e30 e30Var) {
        m111143Y(this.f85760y, e30Var);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m111140V(final e30 e30Var, View view) {
        boolean zM113438k = dsa.m113438k();
        if (m111129K()) {
            if ((t4b.m187164e(this.f85753r) || t4b.m187162c(this.f85753r)) && ((NullChecker.m81303a(this.f85728J) || NullChecker.m81303a(this.f85727I)) && NullChecker.m81303a(m111176x()) && NullChecker.m81303a(m111176x().m53601s()))) {
                C8765d c8765dMo53198c = this.f85729K.mo53198c(m111176x().m53601s().quantity);
                if (NullChecker.m81303a(c8765dMo53198c)) {
                    dsa.m113427D(this.f85752q, dsa.m113439l(c8765dMo53198c.m53520b().m53598p(), this.f85753r), this.f85753r, null, new d30() { // from class: l.xd60
                        @Override // p149l.d30
                        public final void call() {
                            this.f192362a.m111135Q(e30Var);
                        }
                    }, new d30() { // from class: l.yd60
                        @Override // p149l.d30
                        public final void call() {
                            this.f197520a.m111136R();
                        }
                    });
                    return;
                }
            }
            dsa.m113425B(this.f85752q, null, new d30() { // from class: l.zd60
                @Override // p149l.d30
                public final void call() {
                    this.f202628a.m111137S();
                }
            });
            return;
        }
        if (NullChecker.m81303a(this.f85759x) && CoreModule.m29935P().m94651a().mo33507h5()) {
            boolean zM53531m = this.f85759x.m53531m();
            C8765d c8765d = this.f85759x;
            C8765d.a aVarM53520b = zM53531m ? c8765d.m53520b() : c8765d.m53522d();
            Merchandise merchandiseM53601s = aVarM53520b.m53601s();
            double d = merchandiseM53601s.defaultStockKeepUnit.prices.price;
            if (!merchandiseM53601s.yearly() && d <= this.f85721C && TEnum.equals(aVarM53520b.m53579f(), "svip")) {
                lsi0.m151593w(R$string.f27625v1);
                return;
            }
        }
        if (p2b0.m167133h().m167157z() && !t4b.m187164e(this.f85753r) && ((!t4b.m187162c(this.f85753r) || !zM113438k) && NullChecker.m81303a(this.f85729K) && NullChecker.m81303a(this.f85759x))) {
            final Merchandise merchandiseM53601s2 = m111176x().m53601s();
            if ((merchandiseM53601s2.noneRenewable() && !merchandiseM53601s2.yearly()) || (merchandiseM53601s2.yearly() && merchandiseM53601s2.noneRenewable() && TEnum.equals(this.f85760y, "alipay"))) {
                C8765d c8765dMo53198c2 = this.f85729K.mo53198c(merchandiseM53601s2.quantity);
                if (NullChecker.m81303a(c8765dMo53198c2)) {
                    int iM53598p = c8765dMo53198c2.m53520b().m53598p();
                    Act act = this.f85752q;
                    we60.m202858W(act, we60.m202851P(act, iM53598p, this.f85753r), null, new d30() { // from class: l.ae60
                        @Override // p149l.d30
                        public final void call() {
                            this.f69010a.m111138T(merchandiseM53601s2);
                        }
                    }, new d30() { // from class: l.be60
                        @Override // p149l.d30
                        public final void call() {
                            this.f75118a.m111139U(e30Var);
                        }
                    });
                    return;
                }
            }
        }
        m111143Y(this.f85760y, e30Var);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m111141W(View view) {
        m111122D();
    }

    /* JADX INFO: renamed from: X */
    public void m111142X(PayMethod payMethod) {
        double dM111178z = m111178z();
        String strM111120B = m111120B();
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
            jSONObject.put("skuID", strM111120B);
            jSONObject.put("purchaseShowFrom", w2b0.m201088b(this.f85755t));
            jSONObject.put("productType", m111119A());
            jSONObject.put(FirebaseAnalytics.Param.PRICE, dM111178z);
            jSONObject.put("if_discount", m111130L());
            if (NullChecker.m81303a(this.f85759x)) {
                jSONObject.put(BLiveOperationTitleShowType.duration, m111176x().m53605w() + "M");
            }
            boolean z2 = NullChecker.m81303a(this.f85759x) && this.f85759x.m53532n();
            boolean z3 = CoreModule.f17545c.f19591O0.m30088w3() && CoreModule.m29935P().m94651a().mo33425U();
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
            CrashHelper.m81296c(e);
        }
        zvf0.m220398t("e_purchase_button", "p_purchase_page", jSONObject);
    }

    /* JADX INFO: renamed from: Y */
    public final void m111143Y(PayMethod payMethod, e30<Integer> e30Var) {
        if (m111124F()) {
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call(0);
            }
        } else if (TEnum.equals(payMethod, "alipay")) {
            m111121C(e30Var);
            m111142X(PayMethod.get("alipay"));
        } else if (TEnum.equals(payMethod, "wechat")) {
            m111125G(e30Var);
            m111142X(PayMethod.get("wechat"));
        } else if (TEnum.equals(payMethod, PayMethod.jingdong)) {
            m111123E(e30Var);
            m111142X(PayMethod.get(PayMethod.jingdong));
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m111144Z() {
        if (xdl0.m208349O0(this.f85744i) && TextUtils.equals(this.f85744i.getText(), this.f85730L)) {
            xdl0.m208344M(this.f85744i, false);
            this.f85730L = "";
        }
    }

    @Override // p149l.ozl
    /* JADX INFO: renamed from: a */
    public View mo111145a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f85752q.inflater().inflate(m6c0.f131532S2, viewGroup, false);
        m111171t(viewInflate);
        this.f85743h.setTypeface(eqh0.m117752c(3));
        m111118u();
        this.f85749n.setPurchaseType(this.f85753r);
        this.f85738c.setTypeface(eqh0.m117752c(3));
        this.f85738c.setTextColor(this.f85752q.getResources().getColor(b1c0.f72538a0));
        xdl0.m208327D0(t100.m186890d(3.0f), this.f85750o);
        xdl0.m208357U(this.f85749n, t100.m186890d(43.0f));
        if (sab0.m182887e(this.f85753r)) {
            xdl0.m208325C0(this.f85749n, t100.m186890d(30.0f));
            xdl0.m208357U(this.f85749n, t100.m186890d(36.0f));
            this.f85743h.setTypeface(eqh0.m117752c(3), 1);
            this.f85749n.f34358a.setTypeface(eqh0.m117752c(3), 1);
        }
        if (sab0.m182885c(this.f85753r)) {
            xdl0.m208344M(this.f85746k, false);
            xdl0.m208325C0(this.f85745j, t100.m186890d(56.0f));
        } else {
            xdl0.m208325C0(this.f85745j, t100.m186890d(76.0f));
        }
        if (!sab0.m182887e(this.f85753r) && (!sab0.m182885c(this.f85753r) || CoreModule.f17554l.m94656g().mo35078v9() || xma.m210047L3())) {
            xdl0.m208344M(this.f85745j, false);
            return viewInflate;
        }
        xdl0.m208344M(this.f85745j, true);
        this.f85747l.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208329E0(this.f85747l, new View.OnClickListener() { // from class: l.td60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169501a.m111133O(view);
            }
        });
        zvf0.m220402x("e_purchase_boost_svip_guide", "p_purchase_page");
        return viewInflate;
    }

    /* JADX INFO: renamed from: a0 */
    public void m111146a0() {
        xdl0.m208344M(this.f85739d, false);
        boolean zMo33524j3 = CoreModule.m29935P().m94651a().mo33524j3();
        VText vText = this.f85738c;
        if (zMo33524j3) {
            vText.setText(R$string.f27460h);
        } else {
            vText.setText(R$string.f27287R9);
        }
        int i = d3c0.f83894da;
        if (sab0.m182891i(this.f85753r)) {
            i = d3c0.f84112t4;
            this.f85738c.setTextColor(Color.parseColor("#ccE8CA8A"));
        }
        this.f85737b.setImageResource(i);
        this.f85760y = PayMethod.get("alipay");
        if (NullChecker.m81303a(this.f85761z)) {
            this.f85761z.call(PayMethod.get("alipay"));
        }
        if (CoreModule.m29935P().m94651a().mo33525jh()) {
            this.f85739d.setText(CoreModule.m29935P().m94651a().mo33302D6());
            xdl0.m208344M(this.f85739d, true);
        } else if (CoreModule.m29935P().m94651a().mo33369Mi()) {
            String strMo33322G8 = CoreModule.m29935P().m94651a().mo33322G8();
            boolean zIsEmpty = TextUtils.isEmpty(strMo33322G8);
            VText vText2 = this.f85739d;
            if (zIsEmpty) {
                xdl0.m208344M(vText2, false);
            } else {
                vText2.setText(strMo33322G8);
                xdl0.m208344M(this.f85739d, true);
            }
        }
        m111169r0();
    }

    @Override // p149l.ozl
    @CallSuper
    /* JADX INFO: renamed from: b */
    public void mo111147b(C8765d c8765d) {
        if (c8765d == null) {
            return;
        }
        mo111156g0(c8765d);
        if (sab0.m182887e(this.f85753r) || (sab0.m182885c(this.f85753r) && NullChecker.m81303a(c8765d.m53522d()))) {
            this.f85743h.setText(String.format("%s%s元获取", c8765d.m53522d().m53583h(), n6a.m158030r0(c8765d.m53522d().m53591l())));
        }
        if (this.f85759x != null && this.f85719A) {
            this.f85719A = false;
            if (TEnum.equals(this.f85760y, "wechat")) {
                this.f85761z.call(PayMethod.get("wechat"));
            } else if (TEnum.equals(this.f85760y, "alipay")) {
                this.f85761z.call(PayMethod.get("alipay"));
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m111148b0() {
        xdl0.m208344M(this.f85739d, false);
        this.f85738c.setText("京东支付");
        int i = d3c0.f83908ea;
        if (sab0.m182891i(this.f85753r)) {
            i = d3c0.f84140v4;
            this.f85738c.setTextColor(Color.parseColor("#ccE8CA8A"));
        }
        this.f85737b.setImageResource(i);
        this.f85760y = PayMethod.get(PayMethod.jingdong);
        if (NullChecker.m81303a(this.f85761z)) {
            this.f85761z.call(PayMethod.get(PayMethod.jingdong));
        }
        if (CoreModule.m29935P().m94651a().mo33525jh()) {
            xdl0.m208344M(this.f85739d, false);
            xdl0.m208344M(this.f85740e, false);
        } else {
            m111169r0();
        }
        m111126H(true);
    }

    @Override // p149l.ozl
    /* JADX INFO: renamed from: c */
    public void mo111149c(String str) {
        this.f85755t = str;
    }

    /* JADX INFO: renamed from: c0 */
    public void mo111150c0(View.OnClickListener onClickListener) {
        this.f85748m.setTextColor(sab0.m182891i(this.f85753r) ? Color.parseColor("#E8CA8A") : Color.parseColor("#d9d9d9"));
        this.f85748m.setText("不，谢谢");
        xdl0.m208344M(this.f85748m, true);
        xdl0.m208329E0(this.f85748m, onClickListener);
    }

    @Override // p149l.f1m
    /* JADX INFO: renamed from: d */
    public boolean mo36057d() {
        if (!NullChecker.m81303a(this.f85758w)) {
            return false;
        }
        this.f85758w.mo36055a(this.f85753r, this.f85752q, TextUtils.isEmpty(this.f85755t) ? null : this.f85755t);
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m111151d0(C8765d c8765d) {
        xdl0.m208344M(this.f85749n, true);
        this.f85749n.m53106c(p2b0.m167133h().m167142k(c8765d.m53520b().m53601s()));
    }

    @Override // p149l.f1m
    /* JADX INFO: renamed from: e */
    public boolean mo36058e() {
        if (!NullChecker.m81303a(this.f85757v)) {
            return false;
        }
        this.f85757v.mo36055a(this.f85753r, this.f85752q, TextUtils.isEmpty(this.f85755t) ? null : this.f85755t);
        return true;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m111152e0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        xdl0.m208344M(this.f85744i, true);
        this.f85744i.setText(charSequence);
        this.f85744i.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // p149l.ozl
    /* JADX INFO: renamed from: f */
    public void mo111153f(C8765d c8765d) {
        if (c8765d == null) {
            return;
        }
        hi60 hi60VarM141631b = new ji60(new gi60(this.f85752q, this.f85755t, this.f85753r, c8765d, this.f85760y)).m141631b();
        this.f85743h.setText(hi60VarM141631b.m131214b());
        boolean z = false;
        xdl0.m208344M(this.f85744i, false);
        if (sab0.m182887e(this.f85753r) || (sab0.m182885c(this.f85753r) && NullChecker.m81303a(c8765d.m53522d()))) {
            this.f85743h.setText(String.format("%s%s元获取", c8765d.m53522d().m53583h(), n6a.m158030r0(c8765d.m53522d().m53591l())));
        }
        if (!this.f85725G && c8765d.m53531m() && sab0.m182905w(this.f85753r) && rxa0.m181504y(c8765d.m53520b().m53601s()) && c8765d.m53520b().m53601s().isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) {
            m111151d0(c8765d);
            m111152e0(hi60VarM141631b.m131215c());
        } else if (c8765d.m53531m() && sab0.m182899q(this.f85753r) && rxa0.m181502w(c8765d.m53520b().m53601s())) {
            if (dsa.m113449v(c8765d.m53520b())) {
                this.f85749n.m53106c(dsa.m113441n(c8765d.m53520b()));
                xdl0.m208344M(this.f85749n, true);
            } else {
                m111151d0(c8765d);
            }
            m111152e0(hi60VarM141631b.m131215c());
        } else if (c8765d.m53531m() && sab0.m182895m(this.f85753r) && rxa0.m181500u(c8765d.m53520b().m53601s())) {
            m111151d0(c8765d);
            m111152e0(hi60VarM141631b.m131215c());
        } else if (!this.f85725G && c8765d.m53531m() && sab0.m182905w(this.f85753r) && rxa0.m181495p(c8765d.m53520b().m53601s(), ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPrice3Month)) {
            m111151d0(c8765d);
            m111152e0(hi60VarM141631b.m131215c());
        } else if (!TextUtils.isEmpty(hi60VarM141631b.m131215c())) {
            boolean z2 = this.f85725G;
            PromotionPendantView promotionPendantView = this.f85749n;
            if (z2) {
                xdl0.m208344M(promotionPendantView, true);
                this.f85749n.m53106c(hi60VarM141631b.m131215c());
            } else {
                xdl0.m208344M(promotionPendantView, true);
                m111175w();
                this.f85749n.m53106c(hi60VarM141631b.m131215c());
            }
        } else if (sab0.m182891i(this.f85753r) && !C8766e.m53650x(this.f85755t)) {
            xdl0.m208344M(this.f85749n, true);
            if (!this.f85731M) {
                this.f85749n.m53106c("限时优惠");
            }
            z = true;
        } else if (!this.f85731M) {
            xdl0.m208344M(this.f85749n, false);
        }
        if (TEnum.equals(this.f85760y, "alipay")) {
            this.f85738c.setText(hi60VarM141631b.m131213a());
        } else if (TEnum.equals(this.f85760y, "wechat")) {
            this.f85738c.setText(hi60VarM141631b.m131216d());
        }
        this.f85732N = z;
    }

    /* JADX INFO: renamed from: f0 */
    public void m111154f0() {
        xdl0.m208344M(this.f85739d, false);
        this.f85738c.setText(R$string.f27353X9);
        int i = d3c0.f83922fa;
        if (sab0.m182891i(this.f85753r)) {
            i = d3c0.f84154w4;
            this.f85738c.setTextColor(Color.parseColor("#ccE8CA8A"));
        }
        this.f85737b.setImageResource(i);
        this.f85760y = PayMethod.get("wechat");
        if (NullChecker.m81303a(this.f85761z)) {
            this.f85761z.call(PayMethod.get("wechat"));
        }
        if (CoreModule.m29935P().m94651a().mo33525jh()) {
            xdl0.m208344M(this.f85739d, false);
        } else if (CoreModule.m29935P().m94651a().mo33369Mi()) {
            String strMo33626xb = CoreModule.m29935P().m94651a().mo33626xb();
            boolean zIsEmpty = TextUtils.isEmpty(strMo33626xb);
            VText vText = this.f85739d;
            if (zIsEmpty) {
                xdl0.m208344M(vText, false);
            } else {
                vText.setText(strMo33626xb);
                xdl0.m208344M(this.f85739d, true);
            }
        }
        m111126H((CoreModule.m29935P().m94651a().mo158371f() && sab0.m182891i(this.f85753r)) || (CoreModule.m29935P().m94651a().mo33529k() && sab0.m182895m(this.f85753r)) || sab0.m182897o(this.f85753r));
        m111169r0();
    }

    @Override // p149l.ozl
    /* JADX INFO: renamed from: g */
    public void mo111155g(boolean z) {
        this.f85754s = z;
    }

    /* JADX INFO: renamed from: g0 */
    public void mo111156g0(C8765d c8765d) {
        this.f85759x = c8765d;
    }

    @Override // p149l.ozl
    /* JADX INFO: renamed from: h */
    public void mo111157h() {
        if (NullChecker.m81303a(this.f85742g)) {
            this.f85742g.performClick();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void mo111158h0(Privilege privilege) {
        this.f85723E = privilege;
    }

    @Override // p149l.ozl
    /* JADX INFO: renamed from: i */
    public void mo111159i(final e30<Integer> e30Var) {
        this.f85743h.setText(vs80.m199853b(this.f85753r));
        if (sd60.m183461l()) {
            m111146a0();
        } else {
            m111154f0();
        }
        xdl0.m208329E0(this.f85742g, new View.OnClickListener() { // from class: l.vd60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181027a.m111140V(e30Var, view);
            }
        });
        xdl0.m208329E0(this.f85736a, new View.OnClickListener() { // from class: l.wd60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185771a.m111141W(view);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m111160i0(boolean z) {
        this.f85756u = z;
    }

    /* JADX INFO: renamed from: j0 */
    public void m111161j0(g30<PurchaseType, Act, String> g30Var) {
        this.f85758w = g30Var;
    }

    /* JADX INFO: renamed from: k0 */
    public void m111162k0(g30<PurchaseType, Act, String> g30Var) {
        this.f85757v = g30Var;
    }

    /* JADX INFO: renamed from: l0 */
    public void m111163l0(g1m g1mVar) {
        this.f85729K = g1mVar;
    }

    /* JADX INFO: renamed from: m0 */
    public void m111164m0(String str) {
        this.f85724F = str;
    }

    /* JADX INFO: renamed from: n0 */
    public void m111165n0(e30<PayMethod> e30Var) {
        this.f85761z = e30Var;
    }

    /* JADX INFO: renamed from: o0 */
    public void m111166o0(C8761b c8761b) {
        this.f85727I = c8761b;
    }

    /* JADX INFO: renamed from: p0 */
    public void m111167p0(PurchaseView purchaseView) {
        this.f85728J = purchaseView;
    }

    /* JADX INFO: renamed from: q0 */
    public void m111168q0(Object obj) {
        this.f85720B = obj;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m111169r0() {
        xdl0.m208344M(this.f85740e, false);
    }

    @Override // p149l.ozl
    public void release() {
        mkd0.m154992z(this.f85726H);
    }

    /* JADX INFO: renamed from: s0 */
    public void m111170s0(double d) {
        this.f85722D = d;
        m111174v();
    }

    /* JADX INFO: renamed from: t */
    public final void m111171t(View view) {
        ee60.m115849a(this, view);
    }

    /* JADX INFO: renamed from: t0 */
    public void m111172t0(double d) {
        this.f85721C = d;
        m111175w();
    }

    /* JADX INFO: renamed from: u0 */
    public void m111173u0() {
        PurchaseType purchaseType = this.f85753r;
        if ((purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_O_DIAMOND) && C8766e.m53650x(this.f85755t)) {
            this.f85743h.setText(this.f85752q.string(R$string.f27665y8));
            this.f85738c.setTypeface(eqh0.m117752c(3), 1);
            xdl0.m208344M(this.f85749n, false);
            m111144Z();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m111174v() {
        if (CoreModule.m29935P().m94651a().mo33583s3() && this.f85722D > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && !xma.m210043F3() && sab0.m182891i(this.f85753r)) {
            xdl0.m208344M(this.f85749n, true);
            this.f85749n.m53106c(String.format("支付返￥%s", new DecimalFormat("#.#").format(this.f85722D)));
            this.f85731M = true;
            return;
        }
        this.f85731M = false;
        boolean z = this.f85732N;
        PromotionPendantView promotionPendantView = this.f85749n;
        if (z) {
            promotionPendantView.m53106c("限时优惠");
        } else {
            xdl0.m208344M(promotionPendantView, false);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m111175w() {
        if (this.f85721C <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || !sab0.m182899q(this.f85753r) || ((long) Math.floor(this.f85721C)) <= 0) {
            m111144Z();
            this.f85730L = "";
        } else {
            String string = this.f85752q.getString(R$string.f27603t1, String.valueOf((long) Math.floor(this.f85721C)));
            this.f85730L = string;
            this.f85744i.setText(string);
            xdl0.m208344M(this.f85744i, true);
        }
        m111173u0();
    }

    /* JADX INFO: renamed from: x */
    public C8765d.a m111176x() {
        if (!NullChecker.m81303a(this.f85759x)) {
            return null;
        }
        boolean zM53532n = this.f85759x.m53532n();
        C8765d c8765d = this.f85759x;
        return zM53532n ? c8765d.m53520b() : c8765d.m53522d();
    }

    /* JADX INFO: renamed from: y */
    public <T extends rf60> T m111177y(T t) {
        return (T) t.m179102s(this.f85759x).m179105v(this.f85723E).m179109z(this.f85724F).m179077B(this);
    }

    /* JADX INFO: renamed from: z */
    public double m111178z() {
        C8765d c8765d = this.f85759x;
        if (c8765d == null) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        boolean zM53532n = c8765d.m53532n();
        C8765d c8765d2 = this.f85759x;
        if (zM53532n) {
            Merchandise merchandiseM53601s = c8765d2.m53520b().m53601s();
            return (rxa0.m181493n(merchandiseM53601s) || this.f85759x.m53526h()) ? merchandiseM53601s.getFirstCouponPrice() : merchandiseM53601s.defaultStockKeepUnit.prices.price;
        }
        Merchandise merchandiseM53601s2 = c8765d2.m53522d().m53601s();
        return (rxa0.m181493n(merchandiseM53601s2) || this.f85759x.m53527i()) ? merchandiseM53601s2.getFirstCouponPrice() : merchandiseM53601s2.defaultStockKeepUnit.prices.price;
    }
}
