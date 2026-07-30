package com.p000p1.mobile.putong.core.p001ui.purchase;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0186b;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p000p1.mobile.putong.core.p001ui.purchase.agreement.AgreementComponent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RefundDetail;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.alifree.AliFreeAutoView;
import com.p1.mobile.putong.core.ui.alifree.AliFreeUtils;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c3m;
import l.c4g0;
import l.cjy;
import l.cwf0;
import l.d30;
import l.d3c0;
import l.de60;
import l.e30;
import l.er2;
import l.fy80;
import l.g30;
import l.hmb;
import l.i0e;
import l.iab0;
import l.id40;
import l.igj;
import l.jo0;
import l.juk;
import l.lej;
import l.lsi0;
import l.m6c0;
import l.mkd0;
import l.mmd0;
import l.mp0;
import l.msl;
import l.n6a;
import l.oej;
import l.ozl;
import l.qib0;
import l.r0m;
import l.rc40;
import l.rxa0;
import l.s4e;
import l.sab0;
import l.t100;
import l.ura;
import l.vwb;
import l.w2b0;
import l.w9j;
import l.wx80;
import l.x9j;
import l.xdl0;
import l.y7c0;
import l.z2b0;
import org.json.JSONException;
import org.json.JSONObject;
import p002l.e1b0;
import p002l.g1m;
import p002l.j2b0;
import p002l.l2b0;
import p002l.p2b0;
import v.VImage;
import v.VScroll_Fill_BottomAligned;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0186b {

    /* JADX INFO: renamed from: X */
    public static final int f2259X = Color.parseColor("#FEFCF7");

    /* JADX INFO: renamed from: A */
    public c3m f2260A;

    /* JADX INFO: renamed from: B */
    public ozl f2261B;

    /* JADX INFO: renamed from: C */
    public List<wx80> f2262C;

    /* JADX INFO: renamed from: D */
    public Dialog f2263D;

    /* JADX INFO: renamed from: E */
    public d30 f2264E;

    /* JADX INFO: renamed from: F */
    public d30 f2265F;

    /* JADX INFO: renamed from: G */
    public d30 f2266G;

    /* JADX INFO: renamed from: H */
    public d30 f2267H;

    /* JADX INFO: renamed from: J */
    public c4g0 f2269J;

    /* JADX INFO: renamed from: K */
    public c4g0 f2270K;

    /* JADX INFO: renamed from: L */
    public c4g0 f2271L;

    /* JADX INFO: renamed from: M */
    public cwf0 f2272M;

    /* JADX INFO: renamed from: N */
    public boolean f2273N;

    /* JADX INFO: renamed from: O */
    public Picture.ImageUri f2274O;

    /* JADX INFO: renamed from: P */
    public String f2275P;

    /* JADX INFO: renamed from: Q */
    public Object f2276Q;

    /* JADX INFO: renamed from: S */
    public PayMethod f2278S;

    /* JADX INFO: renamed from: a */
    public FrameLayout f2283a;

    /* JADX INFO: renamed from: b */
    public AliFreeAutoView f2284b;

    /* JADX INFO: renamed from: c */
    public VScroll_Fill_BottomAligned f2285c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f2286d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f2287e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f2288f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f2289g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f2290h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f2291i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f2292j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f2293k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f2294l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f2295m;

    /* JADX INFO: renamed from: n */
    public TextView f2296n;

    /* JADX INFO: renamed from: o */
    public TextView f2297o;

    /* JADX INFO: renamed from: p */
    public VImage f2298p;

    /* JADX INFO: renamed from: q */
    public int f2299q;

    /* JADX INFO: renamed from: r */
    public final Act f2300r;

    /* JADX INFO: renamed from: s */
    public final PurchaseType f2301s;

    /* JADX INFO: renamed from: t */
    public Privilege f2302t;

    /* JADX INFO: renamed from: u */
    public boolean f2303u;

    /* JADX INFO: renamed from: v */
    public boolean f2304v;

    /* JADX INFO: renamed from: w */
    public String f2305w;

    /* JADX INFO: renamed from: x */
    public g30<PurchaseType, Act, String> f2306x;

    /* JADX INFO: renamed from: y */
    public g30<PurchaseType, Act, String> f2307y;

    /* JADX INFO: renamed from: z */
    public r0m f2308z;

    /* JADX INFO: renamed from: I */
    public boolean f2268I = true;

    /* JADX INFO: renamed from: R */
    public boolean f2277R = false;

    /* JADX INFO: renamed from: T */
    public e30<Integer> f2279T = new e30() { // from class: l.g1b0
        public final void call(Object obj) {
            this.f10720a.m3861g0((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: U */
    public e30<C0190d> f2280U = new e30() { // from class: l.r1b0
        public final void call(Object obj) {
            this.f18316a.m3862h0((C0190d) obj);
        }
    };

    /* JADX INFO: renamed from: V */
    public e30<C0190d> f2281V = new e30() { // from class: l.z1b0
        public final void call(Object obj) {
            this.f23178a.m3863i0((C0190d) obj);
        }
    };

    /* JADX INFO: renamed from: W */
    public e30<PayMethod> f2282W = new e30() { // from class: l.a2b0
        public final void call(Object obj) {
            this.f7351a.m3864j0((PayMethod) obj);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.b$a */
    public class a extends er2 {
        public a() {
        }

        public String pageId() {
            return (CoreModule.P().a().k() && sab0.n(C0186b.this.f2301s)) ? "p_coin_picks_purchase_popup" : "p_purchase_page";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.b$b */
    public class b implements g1m {
        public b() {
        }

        @Override // p002l.g1m
        /* JADX INFO: renamed from: a */
        public void mo3762a(int i) {
            if (C0186b.this.f2260A instanceof rc40) {
                C0186b.this.f2260A.Z(i, new d30() { // from class: l.h2b0
                    public final void call() {
                        this.f11851a.m3883g();
                    }
                });
            }
        }

        @Override // p002l.g1m
        /* JADX INFO: renamed from: b */
        public void mo3763b(int i) {
            if (C0186b.this.f2260A instanceof rc40) {
                C0186b.this.f2260A.a0(i, new d30() { // from class: l.i2b0
                    public final void call() {
                        this.f12405a.m3884h();
                    }
                });
            }
        }

        @Override // p002l.g1m
        /* JADX INFO: renamed from: c */
        public C0190d mo3764c(int i) {
            if (C0186b.this.f2260A instanceof rc40) {
                return C0186b.this.f2260A.B(i);
            }
            return null;
        }

        @Override // p002l.g1m
        /* JADX INFO: renamed from: d */
        public Merchandise mo3765d(int i) {
            if (C0186b.this.f2260A instanceof rc40) {
                return C0186b.this.f2260A.C(i);
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m3883g() {
            C0186b.this.f2261B.h();
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m3884h() {
            C0186b.this.f2261B.h();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.b$c */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2311a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f2311a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2311a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2311a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.b$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public Act f2312a;

        /* JADX INFO: renamed from: b */
        public PurchaseType f2313b;

        /* JADX INFO: renamed from: c */
        public Privilege f2314c;

        /* JADX INFO: renamed from: e */
        public List<wx80> f2316e;

        /* JADX INFO: renamed from: f */
        public d30 f2317f;

        /* JADX INFO: renamed from: g */
        public d30 f2318g;

        /* JADX INFO: renamed from: h */
        public String f2319h;

        /* JADX INFO: renamed from: j */
        public g30<PurchaseType, Act, String> f2321j;

        /* JADX INFO: renamed from: k */
        public g30<PurchaseType, Act, String> f2322k;

        /* JADX INFO: renamed from: l */
        public d30 f2323l;

        /* JADX INFO: renamed from: m */
        public d30 f2324m;

        /* JADX INFO: renamed from: n */
        public Picture.ImageUri f2325n;

        /* JADX INFO: renamed from: o */
        public String f2326o;

        /* JADX INFO: renamed from: p */
        public Object f2327p;

        /* JADX INFO: renamed from: d */
        public boolean f2315d = false;

        /* JADX INFO: renamed from: i */
        public int f2320i = 0;

        public d(Act act) {
            this.f2312a = act;
        }

        /* JADX INFO: renamed from: a */
        public C0186b m3885a() {
            C0186b c0186bM3886b = m3886b(this.f2312a, this.f2313b);
            c0186bM3886b.m3878x0(this.f2320i);
            if (vwb.J(this.f2316e)) {
                this.f2316e = fy80.n(this.f2313b, this.f2314c, this.f2315d);
            }
            c0186bM3886b.m3879y0(this.f2314c, this.f2315d);
            c0186bM3886b.m3831I0(this.f2316e);
            c0186bM3886b.m3824B0(this.f2317f);
            c0186bM3886b.m3823A0(this.f2318g);
            c0186bM3886b.m3827E0(this.f2321j);
            c0186bM3886b.m3826D0(this.f2322k);
            c0186bM3886b.m3880z0(this.f2319h);
            c0186bM3886b.m3825C0(this.f2324m);
            c0186bM3886b.m3828F0(this.f2323l);
            c0186bM3886b.m3829G0(this.f2325n);
            c0186bM3886b.m3830H0(this.f2326o);
            c0186bM3886b.m3833K0(this.f2327p);
            return c0186bM3886b;
        }

        /* JADX INFO: renamed from: b */
        public C0186b m3886b(Act act, PurchaseType purchaseType) {
            return new C0186b(act, purchaseType);
        }

        /* JADX INFO: renamed from: c */
        public d m3887c(int i) {
            this.f2320i = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public d m3888d(String str) {
            this.f2319h = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public d m3889e(d30 d30Var) {
            this.f2318g = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public d m3890f(d30 d30Var) {
            this.f2317f = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public d m3891g(d30 d30Var) {
            this.f2324m = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public d m3892h(g30<PurchaseType, Act, String> g30Var) {
            this.f2321j = g30Var;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public d m3893i(d30 d30Var) {
            this.f2323l = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public d m3894j(String str) {
            this.f2326o = str;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public d m3895k(List<wx80> list) {
            this.f2316e = list;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public d m3896l(PurchaseType purchaseType) {
            return m3897m(purchaseType, null);
        }

        /* JADX INFO: renamed from: m */
        public d m3897m(PurchaseType purchaseType, Privilege privilege) {
            return m3898n(purchaseType, privilege, false);
        }

        /* JADX INFO: renamed from: n */
        public d m3898n(PurchaseType purchaseType, Privilege privilege, boolean z) {
            this.f2313b = purchaseType;
            this.f2314c = privilege;
            this.f2315d = z;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public d m3899o(Object obj) {
            this.f2327p = obj;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C0186b m3900p() {
            C0186b c0186bM3885a = m3885a();
            c0186bM3885a.m3834L0();
            return c0186bM3885a;
        }
    }

    public C0186b(Act act, PurchaseType purchaseType) {
        this.f2300r = act;
        this.f2301s = purchaseType;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ List m3806j(List list, List list2) {
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Merchandise merchandise = (Merchandise) vwb.r(list2, new w9j() { // from class: l.v1b0
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(merchandise2 != null && merchandise2.quantity == 3);
            }
        });
        if (merchandise != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) != null && ((Merchandise) arrayList.get(i)).quantity == 3) {
                    arrayList.set(i, merchandise);
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m3823A0(d30 d30Var) {
        this.f2265F = d30Var;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m3824B0(d30 d30Var) {
        this.f2264E = d30Var;
    }

    /* JADX INFO: renamed from: C0 */
    public void m3825C0(d30 d30Var) {
        this.f2267H = d30Var;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m3826D0(g30<PurchaseType, Act, String> g30Var) {
        this.f2307y = g30Var;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m3827E0(g30<PurchaseType, Act, String> g30Var) {
        this.f2306x = g30Var;
    }

    /* JADX INFO: renamed from: F0 */
    public void m3828F0(d30 d30Var) {
        this.f2266G = d30Var;
    }

    /* JADX INFO: renamed from: G0 */
    public void m3829G0(Picture.ImageUri imageUri) {
        this.f2274O = imageUri;
    }

    /* JADX INFO: renamed from: H0 */
    public void m3830H0(String str) {
        this.f2275P = str;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m3831I0(List<wx80> list) {
        this.f2262C = list;
    }

    /* JADX INFO: renamed from: J0 */
    public void m3832J0(boolean z) {
        this.f2268I = z;
    }

    /* JADX INFO: renamed from: K0 */
    public void m3833K0(Object obj) {
        this.f2276Q = obj;
    }

    /* JADX INFO: renamed from: L0 */
    public void m3834L0() {
        Act act = this.f2300r;
        if (act == null || act.isFinishing()) {
            return;
        }
        this.f2272M = new cwf0(new a());
        this.f2304v = hmb.q1();
        m3836M0();
        if (CoreModule.P().a().jh() && NullChecker.a(this.f2263D.getWindow())) {
            int i = d3c0.I9;
            if (sab0.i(this.f2301s)) {
                i = d3c0.m4;
            }
            this.f2285c.setBackgroundResource(i);
            this.f2263D.getWindow().setBackgroundDrawableResource(d3c0.P9);
            m3843Q();
        }
        PurchaseType purchaseType = this.f2301s;
        if (purchaseType == PurchaseType.TYPE_GET_VIP) {
            qib0.e1("vip_purchase_shown", new Object[]{"showFrom", this.f2305w});
        } else if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            qib0.e1("see_purchase_shown", new Object[]{"showFrom", this.f2305w});
        } else if (purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE) {
            qib0.e1("superlike_purchase_shown", new Object[]{"showFrom", this.f2305w});
        } else if (purchaseType == PurchaseType.TYPE_GET_BOOST) {
            qib0.e1("boost_purchase_shown", new Object[]{"showFrom", this.f2305w});
        }
        m3873s0(true);
        e1b0.INSTANCE.m12105a(this.f2301s);
    }

    /* JADX INFO: renamed from: M */
    public final void m3835M(View view) {
        z2b0.a(this, view);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m3836M0() {
        m3845R();
        m3876v0();
        m3877w0();
        m3848T();
        m3847S();
        this.f2263D.show();
    }

    /* JADX INFO: renamed from: N */
    public void m3837N(Boolean bool) {
        rc40 rc40Var = this.f2260A;
        if (rc40Var instanceof rc40) {
            rc40Var.y(bool.booleanValue() ? AgreementComponent.AgreementState.checked : AgreementComponent.AgreementState.unchecked);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m3838N0() {
        if ((this.f2301s == PurchaseType.TYPE_GET_VIP && (CoreModule.c.j0.B4() || CoreModule.c.j0.y4())) || (this.f2301s == PurchaseType.TYPE_GET_LIKERS && CoreModule.c.j0.A4())) {
            Intent intentA2 = WebViewAct.a2(this.f2300r, CoreModule.c.j0.C4().titleText, CoreModule.c.j0.C4().promotionUrl, true);
            intentA2.putExtra("hideNavigationBar", true);
            this.f2300r.startActivity(intentA2);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m3839O() {
        if (m3851W()) {
            this.f2263D.dismiss();
        }
        ura.e().d().B8().put("");
    }

    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final void m3866l0(List<String> list) {
        this.f2284b.setTextList(list);
        this.f2284b.setTextStillTime(1500L);
        this.f2284b.setAnimTime(1000L);
        this.f2284b.f();
    }

    /* JADX INFO: renamed from: P */
    public void m3841P(boolean z) {
        if (!sab0.i(this.f2301s) || CoreModule.P().a().f()) {
            this.f2277R = z;
            msl mslVar = this.f2260A;
            if (mslVar instanceof msl) {
                mslVar.g(z);
                return;
            }
            return;
        }
        this.f2277R = true;
        msl mslVar2 = this.f2260A;
        if (mslVar2 instanceof msl) {
            mslVar2.g(true);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m3842P0(String str, List<C0190d> list) {
        String str2 = "svipPicksMembership";
        String str3 = "svip";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", w2b0.b(this.f2305w));
            if (sab0.w(this.f2301s)) {
                jSONObject.put("first_carousel_page", iab0.m(this.f2302t));
            }
            ProductCategory productCategory = this.f2301s.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", str);
            if (!TEnum.equals(p2b0.m19990h().m19996g("vip"), "svip")) {
                str3 = "vip";
            }
            if (productCategory == ProductCategory.get("oDiamond")) {
                str2 = "oDiamond";
            } else if (productCategory == ProductCategory.get("picksMembership")) {
                str2 = "picksMembership";
            } else if (productCategory != ProductCategory.get("svipPicksMembership")) {
                str2 = str3;
            }
            jSONObject.put("default_product", str2);
            jSONObject.put("default_duration", p2b0.m19990h().m20004p(productCategory));
            String str4 = "no";
            jSONObject.put("if_sale", this.f2273N ? "yes" : "no");
            jSONObject.put("if_discount", this.f2273N);
            boolean z = false;
            jSONObject.put("if_double_tab", false);
            jSONObject.put("function_type", iab0.f(this.f2302t, this.f2305w));
            jSONObject.put("tooltips_trigger_mode", "active");
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", "purchase");
            if (CoreModule.P().a().U() && CoreModule.c.O0.w3()) {
                str4 = "yes";
            }
            jSONObject.put("no_secret_payment", str4);
            jSONObject.put("user_secret_staus", str4);
            jSONObject.put("ttc_page_type", "popup");
            if (CoreModule.P().i().N()) {
                if (CoreModule.c.e0.Z7() && !CoreModule.c.e0.W7() && !CoreModule.c.e0.k8()) {
                    z = true;
                }
                jSONObject.put("is_fakeunreal", z);
            }
            CoreModule.P().a().U();
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        this.f2272M.o(jSONObject);
        i0e.f(this.f2272M);
    }

    /* JADX INFO: renamed from: Q */
    public final void m3843Q() {
        List<String> listD = AliFreeUtils.d(this.f2301s);
        m3866l0(listD);
        if (listD.size() == 1) {
            this.f2284b.postDelayed(new Runnable() { // from class: l.m1b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15202a.m3852X();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m3844Q0(List<C0190d> list) {
        m3842P0(vwb.U(iab0.j(list), ","), list);
        qib0.e1("purchase_page_shown", new Object[]{"platform", "android"});
    }

    /* JADX INFO: renamed from: R */
    public void m3845R() {
        com.p1.mobile.android.app.Dialog dialogZ = this.f2300r.dialog().M(m6c0.J2).L((sab0.w(this.f2301s) || sab0.s(this.f2301s) || PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.f2301s) ? y7c0.g : y7c0.h).v().A(new DialogInterface.OnCancelListener() { // from class: l.q1b0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f17756a.m3853Y(dialogInterface);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.s1b0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f18756a.m3854Z(dialogInterface);
            }
        }).i0(new DialogInterface.OnKeyListener() { // from class: l.t1b0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f19359a.m3855a0(dialogInterface, i, keyEvent);
            }
        }).K0(new com.p1.mobile.android.app.Dialog.i() { // from class: l.u1b0
            /* JADX INFO: renamed from: a */
            public final void m23257a(com.p1.mobile.android.app.Dialog dialog) {
                this.f20456a.m3856b0(dialog);
            }
        }).y0(s4e.a).z();
        this.f2263D = dialogZ;
        m3835M(dialogZ.P());
        this.f2287e = this.f2292j;
        this.f2288f = this.f2293k;
        this.f2289g = this.f2294l;
        this.f2286d = this.f2291i;
        if (sab0.q(this.f2301s)) {
            this.f2286d.setBackgroundColor(f2259X);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m3846R0() {
        if (NullChecker.a(this.f2308z)) {
            this.f2308z.release();
        }
        if (NullChecker.a(this.f2260A)) {
            this.f2260A.release();
        }
        if (NullChecker.a(this.f2261B)) {
            this.f2261B.release();
        }
        if (NullChecker.a(this.f2269J)) {
            this.f2269J.unsubscribe();
            this.f2269J = null;
        }
        if (NullChecker.a(this.f2270K)) {
            this.f2270K.unsubscribe();
            this.f2270K = null;
        }
        mkd0.z(this.f2271L);
    }

    /* JADX INFO: renamed from: S */
    public final void m3847S() {
        ProductCategory productCategory = this.f2301s.productCategory();
        if (CoreModule.P().a().s3() && TEnum.equals(productCategory, "oDiamond")) {
            CoreModule.c.j0.K5();
            this.f2271L = CoreModule.c.j0.K4().subscribe(mkd0.H(new e30() { // from class: l.k1b0
                public final void call(Object obj) {
                    this.f14167a.m3857c0((Optional) obj);
                }
            }, new e30() { // from class: l.l1b0
                public final void call(Object obj) {
                    this.f14645a.m3858d0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m3848T() {
        ProductCategory productCategory = this.f2301s.productCategory();
        if (CoreModule.P().a().h5() && TEnum.equals(productCategory, "svip")) {
            this.f2270K = rx.c.just(productCategory).flatMap(new w9j() { // from class: l.n1b0
                public final Object call(Object obj) {
                    return CoreModule.c.j0.K5();
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.o1b0
                public final void call(Object obj) {
                    this.f16332a.m3859e0((Optional) obj);
                }
            }, new e30() { // from class: l.p1b0
                public final void call(Object obj) {
                    this.f16955a.m3860f0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m3849U() {
        ((ViewGroup.MarginLayoutParams) this.f2294l.getLayoutParams()).bottomMargin = t100.d(20.0f);
        xdl0.X(this.f2293k, t100.d(6.0f));
    }

    /* JADX INFO: renamed from: V */
    public boolean m3850V() {
        rc40 rc40Var = this.f2260A;
        if (rc40Var instanceof rc40) {
            return rc40Var.F();
        }
        return true;
    }

    /* JADX INFO: renamed from: W */
    public boolean m3851W() {
        return NullChecker.a(this.f2263D) && this.f2263D.isShowing();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m3852X() {
        m3875u0(this.f2301s);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m3853Y(DialogInterface dialogInterface) {
        m3846R0();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m3854Z(DialogInterface dialogInterface) {
        CoreModule.P().a().E9();
        m3846R0();
        i0e.e(this.f2272M);
        if (NullChecker.a(this.f2264E) && this.f2268I) {
            this.f2264E.call();
        }
        m3873s0(false);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ boolean m3855a0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i == 4) {
            this.f2279T.call(0);
            m3838N0();
            if (NullChecker.a(this.f2267H)) {
                this.f2267H.call();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m3856b0(com.p1.mobile.android.app.Dialog dialog) {
        this.f2279T.call(0);
        m3838N0();
        if (NullChecker.a(this.f2266G)) {
            this.f2266G.call();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m3857c0(Optional optional) {
        if (optional.isPresent()) {
            RefundDetail refundDetail = (RefundDetail) optional.get();
            de60 de60Var = this.f2261B;
            if (de60Var instanceof de60) {
                de60Var.s0(refundDetail.totalRefundAmount);
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m3858d0(Throwable th) {
        de60 de60Var = this.f2261B;
        if (de60Var instanceof de60) {
            de60Var.s0(0.0d);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m3859e0(Optional optional) {
        if (optional.isPresent()) {
            double d2 = ((RefundDetail) optional.get()).totalRefundAmount;
            if (d2 > 0.0d) {
                de60 de60Var = this.f2261B;
                if (de60Var instanceof de60) {
                    de60Var.t0(d2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m3860f0(Throwable th) {
        de60 de60Var = this.f2261B;
        if (de60Var instanceof de60) {
            de60Var.t0(0.0d);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m3861g0(Integer num) {
        if (NullChecker.a(this.f2263D)) {
            if (num.intValue() == -1) {
                this.f2263D.hide();
                return;
            }
            if (num.intValue() == 0 || num.intValue() == 2) {
                if (num.intValue() == 2) {
                    m3832J0(false);
                }
                this.f2263D.dismiss();
            } else if (num.intValue() == 1) {
                this.f2263D.show();
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m3862h0(C0190d c0190d) {
        if (NullChecker.a(this.f2308z)) {
            this.f2308z.b(c0190d);
        }
        if (NullChecker.a(this.f2261B)) {
            this.f2261B.b(c0190d);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m3863i0(C0190d c0190d) {
        lej lejVar = this.f2261B;
        if (lejVar instanceof lej) {
            lejVar.C0();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m3864j0(PayMethod payMethod) {
        this.f2278S = payMethod;
        if (NullChecker.a(this.f2260A)) {
            this.f2260A.e(payMethod);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m3865k0(boolean z, boolean z2) {
        if (z2 || this.f2301s != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return;
        }
        lsi0.h(R.string.R3);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m3867m0(View view) {
        lej lejVar = this.f2261B;
        if ((lejVar instanceof lej) && !NullChecker.a(((de60) lejVar).x)) {
            igj.L().subscribe(mkd0.B());
        }
        this.f2263D.dismiss();
        m3838N0();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ rx.c m3868n0(List list) {
        return igj.M(this.f2300r, list);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ rx.c m3870p0(List list) {
        return igj.M(this.f2300r, list);
    }

    /* JADX INFO: renamed from: r0 */
    public void m3872r0() {
        rc40 rc40Var = this.f2260A;
        if (rc40Var instanceof rc40) {
            rc40Var.R();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m3873s0(boolean z) {
        if (z) {
            j2b0.m15568a().m15571d(this.f2263D);
        } else {
            j2b0.m15568a().m15570c(this.f2263D);
        }
    }

    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m3871q0(ProductCategory productCategory, List<Merchandise> list) {
        boolean zA = NullChecker.a(vwb.r(list, new w9j() { // from class: l.x1b0
            public final Object call(Object obj) {
                return Boolean.valueOf(rxa0.n((Merchandise) obj));
            }
        }));
        this.f2273N = zA;
        this.f2261B.g(zA);
        List<C0190d> listA = cjy.z(productCategory).a(this.f2300r, this.f2301s, productCategory, list);
        c3m c3mVarM16941c = l2b0.m16941c(this.f2300r, this.f2301s, this.f2305w, this.f2278S);
        this.f2260A = c3mVarM16941c;
        View viewA = c3mVarM16941c.a(this.f2288f, this.f2304v);
        if (NullChecker.a(this.f2283a)) {
            rc40 rc40Var = this.f2260A;
            if (rc40Var instanceof mp0) {
                ((mp0) rc40Var).d();
                throw null;
            }
            if (rc40Var instanceof rc40) {
                this.f2283a.addView(rc40Var.E(false));
            }
        }
        if (NullChecker.a(viewA)) {
            id40 id40Var = this.f2260A;
            if (id40Var instanceof id40) {
                int i = t100.i;
                id40Var.d0(i);
                this.f2260A.f0(i);
                this.f2260A.c0(0);
                this.f2260A.H(new mp0.a() { // from class: l.y1b0
                    /* JADX INFO: renamed from: a */
                    public final void m26301a(boolean z, boolean z2) {
                        this.f22605a.m3865k0(z, z2);
                    }
                });
            }
            de60 de60Var = this.f2261B;
            if (de60Var instanceof de60) {
                de60Var.l0(new b());
            }
            c3m c3mVar = this.f2260A;
            boolean z = c3mVar instanceof id40;
            e30<C0190d> e30Var = this.f2280U;
            if (z) {
                c3mVar.f(listA, e30Var, this.f2279T, this.f2281V);
            } else {
                c3mVar.h(listA, e30Var, this.f2279T);
            }
            this.f2288f.addView(viewA, new LinearLayout.LayoutParams(-1, -2));
        }
        msl mslVar = this.f2260A;
        if (mslVar instanceof msl) {
            mslVar.g(this.f2277R);
        }
        rc40 rc40Var2 = this.f2260A;
        if (rc40Var2 instanceof rc40) {
            rc40Var2.G(true);
        }
        m3844Q0(listA);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m3875u0(PurchaseType purchaseType) {
        final List listD = AliFreeUtils.d(purchaseType);
        this.f2284b.g();
        this.f2284b.post(new Runnable() { // from class: l.w1b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21411a.m3866l0(listD);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m3876v0() {
        Privilege privilege = this.f2302t;
        Privilege privilege2 = Privilege.intl_no_ad;
        Act act = this.f2300r;
        if (privilege == privilege2) {
            this.f2308z = new oej(act, this.f2301s, this.f2305w, true, privilege);
        } else {
            this.f2308z = l2b0.m16940b(act, this.f2301s, this.f2305w, this.f2303u, true);
        }
        View viewA = this.f2308z.a(this.f2287e, this.f2304v);
        if (NullChecker.a(viewA)) {
            this.f2308z.c(this.f2262C);
            this.f2287e.addView(viewA, new LinearLayout.LayoutParams(-1, -2));
            mmd0 mmd0Var = this.f2308z;
            if (mmd0Var instanceof mmd0) {
                mmd0Var.g();
            }
        }
        lej lejVarM16939a = l2b0.m16939a(this.f2300r, this.f2301s, this.f2305w);
        this.f2261B = lejVarM16939a;
        if (lejVarM16939a instanceof lej) {
            lejVarM16939a.h0(this.f2302t);
            this.f2261B.q0(this.f2276Q);
        } else if (lejVarM16939a instanceof de60) {
            ((de60) lejVarM16939a).h0(this.f2302t);
            this.f2261B.m0(this.f2275P);
            this.f2261B.q0(this.f2276Q);
            this.f2261B.o0(this);
        }
        View viewA2 = this.f2261B.a(this.f2289g, this.f2304v);
        if (NullChecker.a(viewA2)) {
            de60 de60Var = this.f2261B;
            if (de60Var instanceof de60) {
                de60Var.k0(this.f2306x);
                this.f2261B.j0(this.f2307y);
                this.f2261B.n0(this.f2282W);
            }
            this.f2261B.c(this.f2305w);
            this.f2261B.i(this.f2279T);
            this.f2289g.addView(viewA2, new LinearLayout.LayoutParams(-1, -2));
        }
        if (sab0.w(this.f2301s) || sab0.s(this.f2301s) || PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.f2301s) {
            m3849U();
            int i = c.f2311a[this.f2301s.ordinal()];
            if (i == 1) {
                this.f2291i.setBackgroundResource(d3c0.P0);
                this.f2298p.setImageResource(d3c0.U2);
            } else if (i != 2) {
                LinearLayout linearLayout = this.f2291i;
                if (i != 3) {
                    linearLayout.setBackgroundResource(d3c0.Fb);
                    this.f2298p.setImageResource(d3c0.U2);
                } else {
                    linearLayout.setBackgroundResource(d3c0.O0);
                    this.f2298p.setImageResource(d3c0.d1);
                }
            } else {
                this.f2291i.setBackgroundResource(d3c0.N0);
                this.f2298p.setImageResource(d3c0.U2);
            }
            xdl0.M(this.f2295m, true);
            TextView textView = this.f2297o;
            Act act2 = this.f2300r;
            textView.setText(n6a.q0(act2, act2.getString(IntlCountryCodeController.k() ? R.string.f2 : R.string.X1, this.f2300r.string(R.string.h2), this.f2300r.string(R.string.V6)), new String[]{this.f2300r.string(R.string.h2), juk.j(), this.f2300r.string(R.string.V6), juk.i()}));
            this.f2297o.setMovementMethod(LinkMovementMethod.getInstance());
            this.f2296n.setText(R.string.G8);
            this.f2297o.setLineSpacing(0.0f, 1.0f);
            xdl0.X(this.f2297o, 0);
            this.f2298p.setOnClickListener(new View.OnClickListener() { // from class: l.j1b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13525a.m3867m0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m3877w0() {
        final ProductCategory productCategory = this.f2301s.productCategory();
        if (cjy.G(productCategory.toString())) {
            this.f2269J = mkd0.r(CoreModule.c.j0.y5(productCategory), CoreModule.c.j0.y5(ProductCategory.get("tttSvipGoogleplayFreeTrial")), new x9j() { // from class: l.b2b0
                public final Object call(Object obj, Object obj2) {
                    return C0186b.m3806j((List) obj, (List) obj2);
                }
            }).filter(new w9j() { // from class: l.c2b0
                public final Object call(Object obj) {
                    List list = (List) obj;
                    return Boolean.valueOf((list == null || list.isEmpty()) ? false : true);
                }
            }).flatMap(new w9j() { // from class: l.d2b0
                public final Object call(Object obj) {
                    return this.f9046a.m3868n0((List) obj);
                }
            }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.e2b0
                public final void call(Object obj) {
                    this.f9553a.m3869o0(productCategory, (List) obj);
                }
            }));
        } else {
            this.f2269J = rx.c.just(productCategory).flatMap(new w9j() { // from class: l.f2b0
                public final Object call(Object obj) {
                    return CoreModule.c.j0.y5((ProductCategory) obj);
                }
            }).filter(new w9j() { // from class: l.g2b0
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).flatMap(new w9j() { // from class: l.h1b0
                public final Object call(Object obj) {
                    return this.f11714a.m3870p0((List) obj);
                }
            }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.i1b0
                public final void call(Object obj) {
                    this.f12394a.m3871q0(productCategory, (List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m3878x0(int i) {
        this.f2299q = i;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m3879y0(Privilege privilege, boolean z) {
        this.f2302t = privilege;
        this.f2303u = z;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m3880z0(String str) {
        this.f2305w = str;
    }
}
