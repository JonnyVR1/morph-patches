package com.p051p1.mobile.putong.core.p058ui.purchase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RefundDetail;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseView;
import com.p051p1.mobile.putong.core.p058ui.purchase.agreement.AgreementComponent;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VScroll_Fill_BottomAligned;
import p153l.a30;
import p153l.a690;
import p153l.abb0;
import p153l.bnl0;
import p153l.cjj;
import p153l.dje0;
import p153l.fdc0;
import p153l.fhj;
import p153l.fl40;
import p153l.fo0;
import p153l.i2m;
import p153l.ihj;
import p153l.im60;
import p153l.ip0;
import p153l.jyb;
import p153l.kcg0;
import p153l.l3m;
import p153l.l4g0;
import p153l.l51;
import p153l.mib0;
import p153l.o1j0;
import p153l.oud0;
import p153l.pab0;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.rcj;
import p153l.t190;
import p153l.t5m;
import p153l.tab0;
import p153l.vnb;
import p153l.w1e;
import p153l.wib0;
import p153l.wl40;
import p153l.x20;
import p153l.y20;
import p153l.z20;
import p153l.z3m;
import p153l.zry;
import p153l.zul;

/* JADX INFO: loaded from: classes4.dex */
public class PurchaseView extends VScroll_Fill_BottomAligned {

    /* JADX INFO: renamed from: A */
    public y20<C8928d> f35246A;

    /* JADX INFO: renamed from: B */
    public y20<PayMethod> f35247B;

    /* JADX INFO: renamed from: C */
    public boolean f35248C;

    /* JADX INFO: renamed from: D */
    public z20<PurchaseType, View> f35249D;

    /* JADX INFO: renamed from: E */
    public boolean f35250E;

    /* JADX INFO: renamed from: f */
    public LinearLayout f35251f;

    /* JADX INFO: renamed from: g */
    public boolean f35252g;

    /* JADX INFO: renamed from: h */
    public Act f35253h;

    /* JADX INFO: renamed from: i */
    public PurchaseType f35254i;

    /* JADX INFO: renamed from: j */
    public String f35255j;

    /* JADX INFO: renamed from: k */
    public a30<PurchaseType, Act, String> f35256k;

    /* JADX INFO: renamed from: l */
    public y20<PurchaseType> f35257l;

    /* JADX INFO: renamed from: m */
    public l3m f35258m;

    /* JADX INFO: renamed from: n */
    public t5m f35259n;

    /* JADX INFO: renamed from: o */
    public i2m f35260o;

    /* JADX INFO: renamed from: p */
    public List<a690> f35261p;

    /* JADX INFO: renamed from: q */
    public kcg0 f35262q;

    /* JADX INFO: renamed from: r */
    public kcg0 f35263r;

    /* JADX INFO: renamed from: s */
    public y20<Integer> f35264s;

    /* JADX INFO: renamed from: t */
    public PayMethod f35265t;

    /* JADX INFO: renamed from: u */
    public List<String> f35266u;

    /* JADX INFO: renamed from: v */
    public C22507a<List<C8928d>> f35267v;

    /* JADX INFO: renamed from: w */
    public Privilege f35268w;

    /* JADX INFO: renamed from: x */
    public l4g0 f35269x;

    /* JADX INFO: renamed from: y */
    public y20<Boolean> f35270y;

    /* JADX INFO: renamed from: z */
    public y20<C8928d> f35271z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.PurchaseView$a */
    public class C8920a implements z3m {
        public C8920a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public /* synthetic */ void m54377g() {
            PurchaseView.this.f35260o.mo138230h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public /* synthetic */ void m54378h() {
            PurchaseView.this.f35260o.mo138230h();
        }

        @Override // p153l.z3m
        /* JADX INFO: renamed from: a */
        public void mo54379a(int i) {
            if (PurchaseView.this.f35259n instanceof fl40) {
                ((fl40) PurchaseView.this.f35259n).m126107Z(i, new x20() { // from class: l.skb0
                    @Override // p153l.x20
                    public final void call() {
                        this.f169244a.m54377g();
                    }
                });
            }
        }

        @Override // p153l.z3m
        /* JADX INFO: renamed from: b */
        public void mo54380b(int i) {
            if (PurchaseView.this.f35259n instanceof fl40) {
                ((fl40) PurchaseView.this.f35259n).m126109a0(i, new x20() { // from class: l.tkb0
                    @Override // p153l.x20
                    public final void call() {
                        this.f174701a.m54378h();
                    }
                });
            }
        }

        @Override // p153l.z3m
        /* JADX INFO: renamed from: c */
        public C8928d mo54381c(int i) {
            if (PurchaseView.this.f35259n instanceof fl40) {
                return ((fl40) PurchaseView.this.f35259n).m126085B(i);
            }
            return null;
        }

        @Override // p153l.z3m
        /* JADX INFO: renamed from: d */
        public Merchandise mo54382d(int i) {
            if (PurchaseView.this.f35259n instanceof fl40) {
                return ((fl40) PurchaseView.this.f35259n).m126086C(i);
            }
            return null;
        }
    }

    public PurchaseView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35252g = vnb.m201957q1();
        this.f35267v = C22507a.m222758b();
        this.f35271z = new y20() { // from class: l.xjb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194546a.m54350J((C8928d) obj);
            }
        };
        this.f35246A = new y20() { // from class: l.ikb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115348a.m54351K((C8928d) obj);
            }
        };
        this.f35247B = new y20() { // from class: l.kkb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127180a.m54352L((PayMethod) obj);
            }
        };
        this.f35250E = false;
        this.f35253h = (Act) context;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ List m54342z(List list, List list2) {
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Merchandise merchandise = (Merchandise) jyb.m147529r(list2, new qcj() { // from class: l.fkb0
            @Override // p153l.qcj
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
    public final void m54343C() {
        l3m l3mVar = this.f35258m;
        if (l3mVar instanceof ihj) {
            ((ihj) l3mVar).m139999j();
        }
        t5m t5mVar = this.f35259n;
        if (t5mVar instanceof wl40) {
            bnl0.m105537U(((wl40) t5mVar).m141382q(), 0);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m54344D(Boolean bool) {
        t5m t5mVar = this.f35259n;
        if (t5mVar instanceof fl40) {
            ((fl40) t5mVar).m126095L(bool.booleanValue() ? AgreementComponent.AgreementState.checked : AgreementComponent.AgreementState.unchecked);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m54345E(boolean z) {
        if (!wib0.m206565i(this.f35254i) || CoreModule.m30933P().m143405a().mo180463f()) {
            this.f35250E = z;
            t5m t5mVar = this.f35259n;
            if (t5mVar instanceof zul) {
                ((zul) t5mVar).mo126116g(z);
                return;
            }
            return;
        }
        this.f35250E = true;
        t5m t5mVar2 = this.f35259n;
        if (t5mVar2 instanceof zul) {
            ((zul) t5mVar2).mo126116g(true);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m54346F() {
        ProductCategory productCategory = this.f35254i.productCategory();
        if (CoreModule.m30933P().m143405a().mo34510h5() && TEnum.equals(productCategory, "svip")) {
            this.f35263r = C22421c.just(productCategory).flatMap(new qcj() { // from class: l.bkb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20396j0.m31596K5();
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.ckb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f82274a.m54348H((Optional) obj);
                }
            }, new y20() { // from class: l.dkb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f89395a.m54349I((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public boolean m54347G() {
        if (!NullChecker.m82486a(this.f35259n)) {
            return false;
        }
        t5m t5mVar = this.f35259n;
        return (t5mVar instanceof fl40) && ((fl40) t5mVar).m126089F();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m54348H(Optional optional) {
        if (optional.isPresent()) {
            double d = ((RefundDetail) optional.get()).totalRefundAmount;
            if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                i2m i2mVar = this.f35260o;
                if (i2mVar instanceof im60) {
                    ((im60) i2mVar).m140796t0(d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m54349I(Throwable th) {
        i2m i2mVar = this.f35260o;
        if (i2mVar instanceof im60) {
            ((im60) i2mVar).m140796t0(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m54350J(C8928d c8928d) {
        if (NullChecker.m82486a(this.f35258m)) {
            this.f35258m.mo116074b(c8928d);
        }
        if (NullChecker.m82486a(this.f35260o)) {
            this.f35260o.mo115926b(c8928d);
            this.f35260o.mo138228f(c8928d);
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m54351K(C8928d c8928d) {
        i2m i2mVar = this.f35260o;
        if (i2mVar instanceof fhj) {
            ((fhj) i2mVar).m125573C0();
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m54352L(PayMethod payMethod) {
        this.f35265t = payMethod;
        if (NullChecker.m82486a(this.f35259n)) {
            this.f35259n.mo126115e(payMethod);
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m54353M(List list) {
        String str = "svipPicksMembership";
        String str2 = "svip";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", abb0.m96735b(this.f35255j));
            ProductCategory productCategory = this.f35254i.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", jyb.m147490U(this.f35266u, Constants.SEPARATOR_COMMA));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            if (!TEnum.equals(tab0.m189811h().m189817g("vip"), "svip")) {
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
            jSONObject.put("default_duration", tab0.m189811h().m189825p(productCategory));
            jSONObject.put("if_double_tab", true);
            jSONObject.put("if_discount", this.f35248C);
            jSONObject.put("function_type", mib0.m158477f(this.f35268w, this.f35255j));
            String str3 = (CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31086w3()) ? "yes" : "no";
            jSONObject.put("no_secret_payment", str3);
            jSONObject.put("user_secret_staus", str3);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.f35269x.m152780o(jSONObject);
        w1e.m204402f(this.f35269x);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m54354N() {
        m54368b0();
        m54369c0();
        m54346F();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ C22421c m54355O(List list) {
        return cjj.m110205M(this.f35253h, list);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ C22421c m54357Q(List list) {
        return cjj.m110205M(this.f35253h, list);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m54359S(View view) {
        if (NullChecker.m82486a(this.f35264s)) {
            if (NullChecker.m82486a(this.f35257l)) {
                this.f35257l.call(this.f35254i);
            }
            this.f35264s.call(4);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m54360T(boolean z, boolean z2) {
        if (z2 || this.f35254i != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return;
        }
        o1j0.m165634h(R$string.f28129R3);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m54361U(List list) {
        this.f35259n.mo126117h(list, this.f35271z, this.f35264s);
    }

    /* JADX INFO: renamed from: V */
    public void m54362V() {
        t5m t5mVar = this.f35259n;
        if (t5mVar instanceof fl40) {
            ((fl40) t5mVar).m126101R();
        }
    }

    /* JADX INFO: renamed from: W */
    public void m54363W() {
        if (this.f35269x == null) {
            this.f35269x = w1e.m204399c(m54364X(), C8930f.class.getName());
        }
        this.f35267v.take(1).subscribe(psd0.m173596G(new y20() { // from class: l.mkb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137274a.m54353M((List) obj);
            }
        }));
        l3m l3mVar = this.f35258m;
        if (l3mVar instanceof dje0) {
            ((dje0) l3mVar).m116078f();
        } else if (l3mVar instanceof t190) {
            ((t190) l3mVar).m188880k();
        } else if (l3mVar instanceof oud0) {
            ((oud0) l3mVar).m169291g();
        }
    }

    /* JADX INFO: renamed from: X */
    public String m54364X() {
        return "p_purchase_page";
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m54358R(ProductCategory productCategory, List<Merchandise> list) {
        List<C8928d> listMo147671a = zry.m221275z(productCategory).mo147671a(this.f35253h, this.f35254i, productCategory, list);
        this.f35248C = NullChecker.m82486a(jyb.m147529r(list, new qcj() { // from class: l.ekb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(v5b0.m199788n((Merchandise) obj));
            }
        }));
        m54371e0(listMo147671a);
    }

    /* JADX INFO: renamed from: Z */
    public final void m54366Z(List<C8928d> list) {
        if (this.f35266u == null) {
            this.f35266u = mib0.m158481j(list);
        }
        this.f35267v.onNext(list);
    }

    /* JADX INFO: renamed from: a0 */
    public void m54367a0(boolean z) {
        Runnable runnable = new Runnable() { // from class: l.lkb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f132457a.m54354N();
            }
        };
        if (z) {
            l51.m152888H(this.f35253h, runnable, 500L);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m54368b0() {
        l3m l3mVarM171416b = pab0.m171416b(this.f35253h, this.f35254i, this.f35255j, false, false);
        this.f35258m = l3mVarM171416b;
        View viewMo116073a = l3mVarM171416b.mo116073a(this.f35251f, this.f35252g);
        if (this.f35252g) {
            l3m l3mVar = this.f35258m;
            if (l3mVar instanceof t190) {
                ((t190) l3mVar).m188883n();
            }
        }
        l3m l3mVar2 = this.f35258m;
        if (l3mVar2 instanceof ihj) {
            ((ihj) l3mVar2).m139998i();
        }
        if (NullChecker.m82486a(viewMo116073a)) {
            this.f35251f.addView(viewMo116073a);
            this.f35258m.mo116075c(this.f35261p);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m54369c0() {
        final ProductCategory productCategory = this.f35254i.productCategory();
        if (zry.m221246G(productCategory.toString())) {
            this.f35262q = psd0.m173625r(CoreModule.f18264c.f20396j0.m31647y5(productCategory), CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial)), new rcj() { // from class: l.nkb0
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return PurchaseView.m54342z((List) obj, (List) obj2);
                }
            }).filter(new qcj() { // from class: l.okb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    List list = (List) obj;
                    return Boolean.valueOf((list == null || list.isEmpty()) ? false : true);
                }
            }).flatMap(new qcj() { // from class: l.pkb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f152822a.m54355O((List) obj);
                }
            }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.qkb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f158120a.m54356P(productCategory, (List) obj);
                }
            }));
        } else {
            this.f35262q = C22421c.just(productCategory).flatMap(new qcj() { // from class: l.rkb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20396j0.m31647y5((ProductCategory) obj);
                }
            }).filter(new qcj() { // from class: l.yjb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).flatMap(new qcj() { // from class: l.zjb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f204650a.m54357Q((List) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.akb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f71980a.m54358R(productCategory, (List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m54370d0(List<C8928d> list) {
        i2m i2mVarM171415a = pab0.m171415a(this.f35253h, this.f35254i, this.f35255j);
        this.f35260o = i2mVarM171415a;
        View viewMo115924a = i2mVarM171415a.mo115924a(this.f35251f, this.f35252g);
        if (NullChecker.m82486a(viewMo115924a)) {
            if (this.f35260o instanceof fhj) {
                t5m t5mVar = this.f35259n;
                if (t5mVar instanceof wl40) {
                    t5mVar.mo141377f(list, this.f35271z, this.f35264s, this.f35246A);
                }
                if (((fhj) this.f35260o).m125572A0()) {
                    m54343C();
                }
            }
            i2m i2mVar = this.f35260o;
            if (i2mVar instanceof im60) {
                ((im60) i2mVar).m140786k0(this.f35256k);
                ((im60) this.f35260o).m140789n0(this.f35247B);
                ((im60) this.f35260o).m140787l0(new C8920a());
            }
            ((im60) this.f35260o).m140791p0(this);
            this.f35260o.mo138227c(this.f35255j);
            this.f35260o.mo115937i(this.f35264s);
            ((im60) this.f35260o).mo115928c0(new View.OnClickListener() { // from class: l.jkb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f121396a.m54359S(view);
                }
            });
            this.f35251f.addView(viewMo115924a);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m54371e0(final List<C8928d> list) {
        t5m t5mVarM171417c = pab0.m171417c(this.f35253h, this.f35254i, this.f35255j, this.f35265t);
        this.f35259n = t5mVarM171417c;
        if (t5mVarM171417c instanceof wl40) {
            wl40 wl40Var = (wl40) t5mVarM171417c;
            int i = qa00.f156322i;
            wl40Var.m206929e0(i, 0, i, 0);
            wl40Var.m141372H(new ip0.InterfaceC17765a() { // from class: l.gkb0
                @Override // p153l.ip0.InterfaceC17765a
                /* JADX INFO: renamed from: a */
                public final void mo108479a(boolean z, boolean z2) {
                    this.f104721a.m54360T(z, z2);
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = qa00.f156330q;
            layoutParams.bottomMargin = qa00.f156321h;
            this.f35251f.addView(wl40Var.m141382q(), layoutParams);
            if (NullChecker.m82486a(this.f35249D)) {
                this.f35249D.call(this.f35254i, wl40Var.mo141381p());
            }
        } else if (t5mVarM171417c instanceof ip0) {
            ip0 ip0Var = (ip0) t5mVarM171417c;
            this.f35251f.setClipChildren(false);
            this.f35251f.setClipToPadding(false);
            this.f35251f.addView(ip0Var.m141382q());
            if (!ip0Var.m141390y()) {
                this.f35251f.addView(ip0Var.mo141381p());
            } else if (NullChecker.m82486a(this.f35249D)) {
                this.f35249D.call(this.f35254i, ip0Var.mo141381p());
            }
            l51.m152887G(new Runnable() { // from class: l.hkb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f110405a.m54361U(list);
                }
            });
        } else {
            View viewMo126108a = t5mVarM171417c.mo126108a(this.f35251f, this.f35252g);
            if (wib0.m206565i(this.f35254i) && tab0.m189811h().m189835z()) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                int i2 = qa00.f156314a;
                layoutParams2.leftMargin = i2;
                layoutParams2.rightMargin = i2;
                this.f35251f.addView(viewMo126108a, layoutParams2);
            } else {
                this.f35251f.addView(viewMo126108a);
            }
            t5m t5mVar = this.f35259n;
            if (t5mVar instanceof fl40) {
                fl40 fl40Var = (fl40) t5mVar;
                if (fl40Var.m126093J() && NullChecker.m82486a(this.f35249D)) {
                    this.f35249D.call(this.f35254i, fl40Var.m126088E(false));
                }
            }
            ((fl40) this.f35259n).m126111b0(this.f35270y);
            this.f35259n.mo126117h(list, this.f35271z, this.f35264s);
        }
        t5m t5mVar2 = this.f35259n;
        if (t5mVar2 instanceof zul) {
            ((zul) t5mVar2).mo126116g(this.f35250E);
        }
        m54370d0(list);
        m54366Z(list);
    }

    /* JADX INFO: renamed from: f0 */
    public void m54372f0() {
        l3m l3mVar = this.f35258m;
        if (l3mVar instanceof t190) {
            ((t190) l3mVar).m188889t();
        } else if (l3mVar instanceof oud0) {
            ((oud0) l3mVar).m169295l();
        }
        if (NullChecker.m82486a(this.f35269x)) {
            w1e.m204401e(this.f35269x);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m54373g0() {
        if (NullChecker.m82486a(this.f35258m)) {
            this.f35258m.release();
        }
        if (NullChecker.m82486a(this.f35259n)) {
            this.f35259n.release();
        }
        if (NullChecker.m82486a(this.f35260o)) {
            this.f35260o.release();
        }
        if (NullChecker.m82486a(this.f35262q)) {
            this.f35262q.unsubscribe();
            this.f35262q = null;
        }
        if (NullChecker.m82486a(this.f35263r)) {
            this.f35263r.unsubscribe();
            this.f35263r = null;
        }
    }

    public PurchaseType getPurchaseType() {
        return this.f35254i;
    }

    /* JADX INFO: renamed from: h0 */
    public void m54374h0(boolean z) {
        if (NullChecker.m82486a(this.f35259n)) {
            t5m t5mVar = this.f35259n;
            if (t5mVar instanceof fl40) {
                ((fl40) t5mVar).m126114d0(z);
            }
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m54373g0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f35251f = (LinearLayout) findViewById(fdc0.f98411i0);
    }

    public void setAgreementCheckedCallback(y20<Boolean> y20Var) {
        this.f35270y = y20Var;
    }

    public void setAgreementViewAction(z20<PurchaseType, View> z20Var) {
        this.f35249D = z20Var;
    }

    public void setDialogStateAction(y20<Integer> y20Var) {
        this.f35264s = y20Var;
    }

    public void setFirstPrivilege(Privilege privilege) {
        this.f35268w = privilege;
    }

    public void setFrom(String str) {
        this.f35255j = str;
        if (NullChecker.m82486a(this.f35260o)) {
            this.f35260o.mo138227c(str);
        }
    }

    public void setOnCloseClick(y20<PurchaseType> y20Var) {
        this.f35257l = y20Var;
    }

    public void setOnPaymentSuccess(a30<PurchaseType, Act, String> a30Var) {
        this.f35256k = a30Var;
    }

    public void setPrivilegeDescriptions(List<a690> list) {
        this.f35261p = list;
    }

    public void setPurchaseType(PurchaseType purchaseType) {
        this.f35254i = purchaseType;
    }

    public PurchaseView(Context context) {
        super(context);
        this.f35252g = vnb.m201957q1();
        this.f35267v = C22507a.m222758b();
        this.f35271z = new y20() { // from class: l.xjb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194546a.m54350J((C8928d) obj);
            }
        };
        this.f35246A = new y20() { // from class: l.ikb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115348a.m54351K((C8928d) obj);
            }
        };
        this.f35247B = new y20() { // from class: l.kkb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127180a.m54352L((PayMethod) obj);
            }
        };
        this.f35250E = false;
        this.f35253h = (Act) context;
    }

    public PurchaseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35252g = vnb.m201957q1();
        this.f35267v = C22507a.m222758b();
        this.f35271z = new y20() { // from class: l.xjb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194546a.m54350J((C8928d) obj);
            }
        };
        this.f35246A = new y20() { // from class: l.ikb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115348a.m54351K((C8928d) obj);
            }
        };
        this.f35247B = new y20() { // from class: l.kkb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127180a.m54352L((PayMethod) obj);
            }
        };
        this.f35250E = false;
        this.f35253h = (Act) context;
    }
}
