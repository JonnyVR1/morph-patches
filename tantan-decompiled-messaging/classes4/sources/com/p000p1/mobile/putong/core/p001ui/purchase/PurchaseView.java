package com.p000p1.mobile.putong.core.p001ui.purchase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p000p1.mobile.putong.core.p001ui.purchase.PurchaseView;
import com.p000p1.mobile.putong.core.p001ui.purchase.agreement.AgreementComponent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RefundDetail;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c3m;
import l.c4g0;
import l.cjy;
import l.cwf0;
import l.d30;
import l.de60;
import l.e30;
import l.e51;
import l.f30;
import l.g30;
import l.hmb;
import l.i0e;
import l.iab0;
import l.id40;
import l.igj;
import l.jo0;
import l.lej;
import l.lsi0;
import l.mkd0;
import l.mmd0;
import l.mp0;
import l.msl;
import l.oej;
import l.ozl;
import l.pt80;
import l.r0m;
import l.rc40;
import l.rxa0;
import l.sab0;
import l.t100;
import l.vwb;
import l.w2b0;
import l.w9j;
import l.wx80;
import l.x9j;
import l.xdl0;
import l.yae0;
import l.z4c0;
import org.json.JSONException;
import org.json.JSONObject;
import p002l.g1m;
import p002l.l2b0;
import p002l.p2b0;
import rx.c;
import rx.subjects.a;
import v.VScroll_Fill_BottomAligned;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PurchaseView extends VScroll_Fill_BottomAligned {

    /* JADX INFO: renamed from: A */
    public e30<C0190d> f2220A;

    /* JADX INFO: renamed from: B */
    public e30<PayMethod> f2221B;

    /* JADX INFO: renamed from: C */
    public boolean f2222C;

    /* JADX INFO: renamed from: D */
    public f30<PurchaseType, View> f2223D;

    /* JADX INFO: renamed from: E */
    public boolean f2224E;

    /* JADX INFO: renamed from: f */
    public LinearLayout f2225f;

    /* JADX INFO: renamed from: g */
    public boolean f2226g;

    /* JADX INFO: renamed from: h */
    public Act f2227h;

    /* JADX INFO: renamed from: i */
    public PurchaseType f2228i;

    /* JADX INFO: renamed from: j */
    public String f2229j;

    /* JADX INFO: renamed from: k */
    public g30<PurchaseType, Act, String> f2230k;

    /* JADX INFO: renamed from: l */
    public e30<PurchaseType> f2231l;

    /* JADX INFO: renamed from: m */
    public r0m f2232m;

    /* JADX INFO: renamed from: n */
    public c3m f2233n;

    /* JADX INFO: renamed from: o */
    public ozl f2234o;

    /* JADX INFO: renamed from: p */
    public List<wx80> f2235p;

    /* JADX INFO: renamed from: q */
    public c4g0 f2236q;

    /* JADX INFO: renamed from: r */
    public c4g0 f2237r;

    /* JADX INFO: renamed from: s */
    public e30<Integer> f2238s;

    /* JADX INFO: renamed from: t */
    public PayMethod f2239t;

    /* JADX INFO: renamed from: u */
    public List<String> f2240u;

    /* JADX INFO: renamed from: v */
    public a<List<C0190d>> f2241v;

    /* JADX INFO: renamed from: w */
    public Privilege f2242w;

    /* JADX INFO: renamed from: x */
    public cwf0 f2243x;

    /* JADX INFO: renamed from: y */
    public e30<Boolean> f2244y;

    /* JADX INFO: renamed from: z */
    public e30<C0190d> f2245z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.PurchaseView$a */
    public class C0182a implements g1m {
        public C0182a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public /* synthetic */ void m3760g() {
            PurchaseView.this.f2234o.h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public /* synthetic */ void m3761h() {
            PurchaseView.this.f2234o.h();
        }

        @Override // p002l.g1m
        /* JADX INFO: renamed from: a */
        public void mo3762a(int i) {
            if (PurchaseView.this.f2233n instanceof rc40) {
                PurchaseView.this.f2233n.Z(i, new d30() { // from class: l.ocb0
                    public final void call() {
                        this.f16523a.m3760g();
                    }
                });
            }
        }

        @Override // p002l.g1m
        /* JADX INFO: renamed from: b */
        public void mo3763b(int i) {
            if (PurchaseView.this.f2233n instanceof rc40) {
                PurchaseView.this.f2233n.a0(i, new d30() { // from class: l.pcb0
                    public final void call() {
                        this.f17195a.m3761h();
                    }
                });
            }
        }

        @Override // p002l.g1m
        /* JADX INFO: renamed from: c */
        public C0190d mo3764c(int i) {
            if (PurchaseView.this.f2233n instanceof rc40) {
                return PurchaseView.this.f2233n.B(i);
            }
            return null;
        }

        @Override // p002l.g1m
        /* JADX INFO: renamed from: d */
        public Merchandise mo3765d(int i) {
            if (PurchaseView.this.f2233n instanceof rc40) {
                return PurchaseView.this.f2233n.C(i);
            }
            return null;
        }
    }

    public PurchaseView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2226g = hmb.q1();
        this.f2241v = a.b();
        this.f2245z = new e30() { // from class: l.tbb0
            public final void call(Object obj) {
                this.f20164a.m3733J((C0190d) obj);
            }
        };
        this.f2220A = new e30() { // from class: l.ecb0
            public final void call(Object obj) {
                this.f9665a.m3734K((C0190d) obj);
            }
        };
        this.f2221B = new e30() { // from class: l.gcb0
            public final void call(Object obj) {
                this.f11359a.m3735L((PayMethod) obj);
            }
        };
        this.f2224E = false;
        this.f2227h = (Act) context;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ List m3725z(List list, List list2) {
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Merchandise merchandise = (Merchandise) vwb.r(list2, new w9j() { // from class: l.bcb0
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

    /* JADX INFO: renamed from: C */
    public final void m3726C() {
        oej oejVar = this.f2232m;
        if (oejVar instanceof oej) {
            oejVar.j();
        }
        id40 id40Var = this.f2233n;
        if (id40Var instanceof id40) {
            xdl0.U(id40Var.q(), 0);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m3727D(Boolean bool) {
        rc40 rc40Var = this.f2233n;
        if (rc40Var instanceof rc40) {
            rc40Var.y(bool.booleanValue() ? AgreementComponent.AgreementState.checked : AgreementComponent.AgreementState.unchecked);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m3728E(boolean z) {
        if (!sab0.i(this.f2228i) || CoreModule.P().a().f()) {
            this.f2224E = z;
            msl mslVar = this.f2233n;
            if (mslVar instanceof msl) {
                mslVar.g(z);
                return;
            }
            return;
        }
        this.f2224E = true;
        msl mslVar2 = this.f2233n;
        if (mslVar2 instanceof msl) {
            mslVar2.g(true);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m3729F() {
        ProductCategory productCategory = this.f2228i.productCategory();
        if (CoreModule.P().a().h5() && TEnum.equals(productCategory, "svip")) {
            this.f2237r = c.just(productCategory).flatMap(new w9j() { // from class: l.xbb0
                public final Object call(Object obj) {
                    return CoreModule.c.j0.K5();
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.ybb0
                public final void call(Object obj) {
                    this.f22784a.m3731H((Optional) obj);
                }
            }, new e30() { // from class: l.zbb0
                public final void call(Object obj) {
                    this.f23327a.m3732I((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public boolean m3730G() {
        if (!NullChecker.a(this.f2233n)) {
            return false;
        }
        rc40 rc40Var = this.f2233n;
        return (rc40Var instanceof rc40) && rc40Var.F();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m3731H(Optional optional) {
        if (optional.isPresent()) {
            double d = ((RefundDetail) optional.get()).totalRefundAmount;
            if (d > 0.0d) {
                de60 de60Var = this.f2234o;
                if (de60Var instanceof de60) {
                    de60Var.t0(d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m3732I(Throwable th) {
        de60 de60Var = this.f2234o;
        if (de60Var instanceof de60) {
            de60Var.t0(0.0d);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m3733J(C0190d c0190d) {
        if (NullChecker.a(this.f2232m)) {
            this.f2232m.b(c0190d);
        }
        if (NullChecker.a(this.f2234o)) {
            this.f2234o.b(c0190d);
            this.f2234o.f(c0190d);
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m3734K(C0190d c0190d) {
        lej lejVar = this.f2234o;
        if (lejVar instanceof lej) {
            lejVar.C0();
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m3735L(PayMethod payMethod) {
        this.f2239t = payMethod;
        if (NullChecker.a(this.f2233n)) {
            this.f2233n.e(payMethod);
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m3736M(List list) {
        String str = "svipPicksMembership";
        String str2 = "svip";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", w2b0.b(this.f2229j));
            ProductCategory productCategory = this.f2228i.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", vwb.U(this.f2240u, ","));
            jSONObject.put("tooltips_trigger_mode", "active");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_trigger_reason", "purchase");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            if (!TEnum.equals(p2b0.m19990h().m19996g("vip"), "svip")) {
                str2 = "vip";
            }
            if (productCategory == ProductCategory.get("oDiamond")) {
                str = "oDiamond";
            } else if (productCategory == ProductCategory.get("picksMembership")) {
                str = "picksMembership";
            } else if (productCategory != ProductCategory.get("svipPicksMembership")) {
                str = str2;
            }
            jSONObject.put("default_product", str);
            jSONObject.put("default_duration", p2b0.m19990h().m20004p(productCategory));
            jSONObject.put("if_double_tab", true);
            jSONObject.put("if_discount", this.f2222C);
            jSONObject.put("function_type", iab0.f(this.f2242w, this.f2229j));
            String str3 = (CoreModule.P().a().U() && CoreModule.c.O0.w3()) ? "yes" : "no";
            jSONObject.put("no_secret_payment", str3);
            jSONObject.put("user_secret_staus", str3);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        this.f2243x.o(jSONObject);
        i0e.f(this.f2243x);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m3737N() {
        m3751b0();
        m3752c0();
        m3729F();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ c m3738O(List list) {
        return igj.M(this.f2227h, list);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ c m3740Q(List list) {
        return igj.M(this.f2227h, list);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m3742S(View view) {
        if (NullChecker.a(this.f2238s)) {
            if (NullChecker.a(this.f2231l)) {
                this.f2231l.call(this.f2228i);
            }
            this.f2238s.call(4);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m3743T(boolean z, boolean z2) {
        if (z2 || this.f2228i != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return;
        }
        lsi0.h(R.string.R3);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m3744U(List list) {
        this.f2233n.h(list, this.f2245z, this.f2238s);
    }

    /* JADX INFO: renamed from: V */
    public void m3745V() {
        rc40 rc40Var = this.f2233n;
        if (rc40Var instanceof rc40) {
            rc40Var.R();
        }
    }

    /* JADX INFO: renamed from: W */
    public void m3746W() {
        if (this.f2243x == null) {
            this.f2243x = i0e.c(m3747X(), C0192f.class.getName());
        }
        this.f2241v.take(1).subscribe(mkd0.G(new e30() { // from class: l.icb0
            public final void call(Object obj) {
                this.f13142a.m3736M((List) obj);
            }
        }));
        yae0 yae0Var = this.f2232m;
        if (yae0Var instanceof yae0) {
            yae0Var.f();
        } else if (yae0Var instanceof pt80) {
            ((pt80) yae0Var).k();
        } else if (yae0Var instanceof mmd0) {
            ((mmd0) yae0Var).g();
        }
    }

    /* JADX INFO: renamed from: X */
    public String m3747X() {
        return "p_purchase_page";
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m3741R(ProductCategory productCategory, List<Merchandise> list) {
        List<C0190d> listA = cjy.z(productCategory).a(this.f2227h, this.f2228i, productCategory, list);
        this.f2222C = NullChecker.a(vwb.r(list, new w9j() { // from class: l.acb0
            public final Object call(Object obj) {
                return Boolean.valueOf(rxa0.n((Merchandise) obj));
            }
        }));
        m3754e0(listA);
    }

    /* JADX INFO: renamed from: Z */
    public final void m3749Z(List<C0190d> list) {
        if (this.f2240u == null) {
            this.f2240u = iab0.j(list);
        }
        this.f2241v.onNext(list);
    }

    /* JADX INFO: renamed from: a0 */
    public void m3750a0(boolean z) {
        Runnable runnable = new Runnable() { // from class: l.hcb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11969a.m3737N();
            }
        };
        if (z) {
            e51.H(this.f2227h, runnable, 500L);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m3751b0() {
        r0m r0mVarM16940b = l2b0.m16940b(this.f2227h, this.f2228i, this.f2229j, false, false);
        this.f2232m = r0mVarM16940b;
        View viewA = r0mVarM16940b.a(this.f2225f, this.f2226g);
        if (this.f2226g) {
            pt80 pt80Var = this.f2232m;
            if (pt80Var instanceof pt80) {
                pt80Var.n();
            }
        }
        oej oejVar = this.f2232m;
        if (oejVar instanceof oej) {
            oejVar.i();
        }
        if (NullChecker.a(viewA)) {
            this.f2225f.addView(viewA);
            this.f2232m.c(this.f2235p);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m3752c0() {
        final ProductCategory productCategory = this.f2228i.productCategory();
        if (cjy.G(productCategory.toString())) {
            this.f2236q = mkd0.r(CoreModule.c.j0.y5(productCategory), CoreModule.c.j0.y5(ProductCategory.get("tttSvipGoogleplayFreeTrial")), new x9j() { // from class: l.jcb0
                public final Object call(Object obj, Object obj2) {
                    return PurchaseView.m3725z((List) obj, (List) obj2);
                }
            }).filter(new w9j() { // from class: l.kcb0
                public final Object call(Object obj) {
                    List list = (List) obj;
                    return Boolean.valueOf((list == null || list.isEmpty()) ? false : true);
                }
            }).flatMap(new w9j() { // from class: l.lcb0
                public final Object call(Object obj) {
                    return this.f14763a.m3738O((List) obj);
                }
            }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.mcb0
                public final void call(Object obj) {
                    this.f15327a.m3739P(productCategory, (List) obj);
                }
            }));
        } else {
            this.f2236q = c.just(productCategory).flatMap(new w9j() { // from class: l.ncb0
                public final Object call(Object obj) {
                    return CoreModule.c.j0.y5((ProductCategory) obj);
                }
            }).filter(new w9j() { // from class: l.ubb0
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).flatMap(new w9j() { // from class: l.vbb0
                public final Object call(Object obj) {
                    return this.f21057a.m3740Q((List) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.wbb0
                public final void call(Object obj) {
                    this.f21602a.m3741R(productCategory, (List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m3753d0(List<C0190d> list) {
        ozl ozlVarM16939a = l2b0.m16939a(this.f2227h, this.f2228i, this.f2229j);
        this.f2234o = ozlVarM16939a;
        View viewA = ozlVarM16939a.a(this.f2225f, this.f2226g);
        if (NullChecker.a(viewA)) {
            if (this.f2234o instanceof lej) {
                c3m c3mVar = this.f2233n;
                if (c3mVar instanceof id40) {
                    c3mVar.f(list, this.f2245z, this.f2238s, this.f2220A);
                }
                if (this.f2234o.A0()) {
                    m3726C();
                }
            }
            de60 de60Var = this.f2234o;
            if (de60Var instanceof de60) {
                de60Var.k0(this.f2230k);
                this.f2234o.n0(this.f2221B);
                this.f2234o.l0(new C0182a());
            }
            this.f2234o.p0(this);
            this.f2234o.c(this.f2229j);
            this.f2234o.i(this.f2238s);
            this.f2234o.c0(new View.OnClickListener() { // from class: l.fcb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10229a.m3742S(view);
                }
            });
            this.f2225f.addView(viewA);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m3754e0(final List<C0190d> list) {
        id40 id40VarM16941c = l2b0.m16941c(this.f2227h, this.f2228i, this.f2229j, this.f2239t);
        this.f2233n = id40VarM16941c;
        if (id40VarM16941c instanceof id40) {
            id40 id40Var = id40VarM16941c;
            int i = t100.i;
            id40Var.e0(i, 0, i, 0);
            id40Var.H(new mp0.a() { // from class: l.ccb0
                /* JADX INFO: renamed from: a */
                public final void m10931a(boolean z, boolean z2) {
                    this.f8589a.m3743T(z, z2);
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = t100.q;
            layoutParams.bottomMargin = t100.h;
            this.f2225f.addView(id40Var.q(), layoutParams);
            if (NullChecker.a(this.f2223D)) {
                this.f2223D.call(this.f2228i, id40Var.p());
            }
        } else if (id40VarM16941c instanceof mp0) {
            mp0 mp0Var = (mp0) id40VarM16941c;
            this.f2225f.setClipChildren(false);
            this.f2225f.setClipToPadding(false);
            this.f2225f.addView(mp0Var.q());
            if (!mp0Var.y()) {
                this.f2225f.addView(mp0Var.p());
            } else if (NullChecker.a(this.f2223D)) {
                this.f2223D.call(this.f2228i, mp0Var.p());
            }
            e51.G(new Runnable() { // from class: l.dcb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9162a.m3744U(list);
                }
            });
        } else {
            View viewA = id40VarM16941c.a(this.f2225f, this.f2226g);
            if (sab0.i(this.f2228i) && p2b0.m19990h().m20014z()) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                int i2 = t100.a;
                layoutParams2.leftMargin = i2;
                layoutParams2.rightMargin = i2;
                this.f2225f.addView(viewA, layoutParams2);
            } else {
                this.f2225f.addView(viewA);
            }
            rc40 rc40Var = this.f2233n;
            if (rc40Var instanceof rc40) {
                rc40 rc40Var2 = rc40Var;
                if (rc40Var2.J() && NullChecker.a(this.f2223D)) {
                    this.f2223D.call(this.f2228i, rc40Var2.E(false));
                }
            }
            this.f2233n.b0(this.f2244y);
            this.f2233n.h(list, this.f2245z, this.f2238s);
        }
        msl mslVar = this.f2233n;
        if (mslVar instanceof msl) {
            mslVar.g(this.f2224E);
        }
        m3753d0(list);
        m3749Z(list);
    }

    /* JADX INFO: renamed from: f0 */
    public void m3755f0() {
        pt80 pt80Var = this.f2232m;
        if (pt80Var instanceof pt80) {
            pt80Var.t();
        } else if (pt80Var instanceof mmd0) {
            ((mmd0) pt80Var).l();
        }
        if (NullChecker.a(this.f2243x)) {
            i0e.e(this.f2243x);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m3756g0() {
        if (NullChecker.a(this.f2232m)) {
            this.f2232m.release();
        }
        if (NullChecker.a(this.f2233n)) {
            this.f2233n.release();
        }
        if (NullChecker.a(this.f2234o)) {
            this.f2234o.release();
        }
        if (NullChecker.a(this.f2236q)) {
            this.f2236q.unsubscribe();
            this.f2236q = null;
        }
        if (NullChecker.a(this.f2237r)) {
            this.f2237r.unsubscribe();
            this.f2237r = null;
        }
    }

    public PurchaseType getPurchaseType() {
        return this.f2228i;
    }

    /* JADX INFO: renamed from: h0 */
    public void m3757h0(boolean z) {
        if (NullChecker.a(this.f2233n)) {
            rc40 rc40Var = this.f2233n;
            if (rc40Var instanceof rc40) {
                rc40Var.d0(z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        m3756g0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f2225f = (LinearLayout) findViewById(z4c0.i0);
    }

    public void setAgreementCheckedCallback(e30<Boolean> e30Var) {
        this.f2244y = e30Var;
    }

    public void setAgreementViewAction(f30<PurchaseType, View> f30Var) {
        this.f2223D = f30Var;
    }

    public void setDialogStateAction(e30<Integer> e30Var) {
        this.f2238s = e30Var;
    }

    public void setFirstPrivilege(Privilege privilege) {
        this.f2242w = privilege;
    }

    public void setFrom(String str) {
        this.f2229j = str;
        if (NullChecker.a(this.f2234o)) {
            this.f2234o.c(str);
        }
    }

    public void setOnCloseClick(e30<PurchaseType> e30Var) {
        this.f2231l = e30Var;
    }

    public void setOnPaymentSuccess(g30<PurchaseType, Act, String> g30Var) {
        this.f2230k = g30Var;
    }

    public void setPrivilegeDescriptions(List<wx80> list) {
        this.f2235p = list;
    }

    public void setPurchaseType(PurchaseType purchaseType) {
        this.f2228i = purchaseType;
    }

    public PurchaseView(Context context) {
        super(context);
        this.f2226g = hmb.q1();
        this.f2241v = a.b();
        this.f2245z = new e30() { // from class: l.tbb0
            public final void call(Object obj) {
                this.f20164a.m3733J((C0190d) obj);
            }
        };
        this.f2220A = new e30() { // from class: l.ecb0
            public final void call(Object obj) {
                this.f9665a.m3734K((C0190d) obj);
            }
        };
        this.f2221B = new e30() { // from class: l.gcb0
            public final void call(Object obj) {
                this.f11359a.m3735L((PayMethod) obj);
            }
        };
        this.f2224E = false;
        this.f2227h = (Act) context;
    }

    public PurchaseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2226g = hmb.q1();
        this.f2241v = a.b();
        this.f2245z = new e30() { // from class: l.tbb0
            public final void call(Object obj) {
                this.f20164a.m3733J((C0190d) obj);
            }
        };
        this.f2220A = new e30() { // from class: l.ecb0
            public final void call(Object obj) {
                this.f9665a.m3734K((C0190d) obj);
            }
        };
        this.f2221B = new e30() { // from class: l.gcb0
            public final void call(Object obj) {
                this.f11359a.m3735L((PayMethod) obj);
            }
        };
        this.f2224E = false;
        this.f2227h = (Act) context;
    }
}
