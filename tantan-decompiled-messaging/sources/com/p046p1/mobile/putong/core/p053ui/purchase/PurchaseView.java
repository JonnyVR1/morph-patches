package com.p046p1.mobile.putong.core.p053ui.purchase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RefundDetail;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseView;
import com.p046p1.mobile.putong.core.p053ui.purchase.agreement.AgreementComponent;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VScroll_Fill_BottomAligned;
import p149l.c3m;
import p149l.c4g0;
import p149l.cjy;
import p149l.cwf0;
import p149l.d30;
import p149l.de60;
import p149l.e30;
import p149l.e51;
import p149l.f30;
import p149l.g1m;
import p149l.g30;
import p149l.hmb;
import p149l.i0e;
import p149l.iab0;
import p149l.id40;
import p149l.igj;
import p149l.jo0;
import p149l.l2b0;
import p149l.lej;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mmd0;
import p149l.mp0;
import p149l.msl;
import p149l.oej;
import p149l.ozl;
import p149l.p2b0;
import p149l.pt80;
import p149l.r0m;
import p149l.rc40;
import p149l.sab0;
import p149l.t100;
import p149l.vwb;
import p149l.w2b0;
import p149l.w9j;
import p149l.wx80;
import p149l.x9j;
import p149l.xdl0;
import p149l.yae0;
import p149l.z4c0;

/* JADX INFO: loaded from: classes4.dex */
public class PurchaseView extends VScroll_Fill_BottomAligned {

    /* JADX INFO: renamed from: A */
    public e30<C8765d> f34398A;

    /* JADX INFO: renamed from: B */
    public e30<PayMethod> f34399B;

    /* JADX INFO: renamed from: C */
    public boolean f34400C;

    /* JADX INFO: renamed from: D */
    public f30<PurchaseType, View> f34401D;

    /* JADX INFO: renamed from: E */
    public boolean f34402E;

    /* JADX INFO: renamed from: f */
    public LinearLayout f34403f;

    /* JADX INFO: renamed from: g */
    public boolean f34404g;

    /* JADX INFO: renamed from: h */
    public Act f34405h;

    /* JADX INFO: renamed from: i */
    public PurchaseType f34406i;

    /* JADX INFO: renamed from: j */
    public String f34407j;

    /* JADX INFO: renamed from: k */
    public g30<PurchaseType, Act, String> f34408k;

    /* JADX INFO: renamed from: l */
    public e30<PurchaseType> f34409l;

    /* JADX INFO: renamed from: m */
    public r0m f34410m;

    /* JADX INFO: renamed from: n */
    public c3m f34411n;

    /* JADX INFO: renamed from: o */
    public ozl f34412o;

    /* JADX INFO: renamed from: p */
    public List<wx80> f34413p;

    /* JADX INFO: renamed from: q */
    public c4g0 f34414q;

    /* JADX INFO: renamed from: r */
    public c4g0 f34415r;

    /* JADX INFO: renamed from: s */
    public e30<Integer> f34416s;

    /* JADX INFO: renamed from: t */
    public PayMethod f34417t;

    /* JADX INFO: renamed from: u */
    public List<String> f34418u;

    /* JADX INFO: renamed from: v */
    public C22392a<List<C8765d>> f34419v;

    /* JADX INFO: renamed from: w */
    public Privilege f34420w;

    /* JADX INFO: renamed from: x */
    public cwf0 f34421x;

    /* JADX INFO: renamed from: y */
    public e30<Boolean> f34422y;

    /* JADX INFO: renamed from: z */
    public e30<C8765d> f34423z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.PurchaseView$a */
    public class C8757a implements g1m {
        public C8757a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public /* synthetic */ void m53194g() {
            PurchaseView.this.f34412o.mo111157h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public /* synthetic */ void m53195h() {
            PurchaseView.this.f34412o.mo111157h();
        }

        @Override // p149l.g1m
        /* JADX INFO: renamed from: a */
        public void mo53196a(int i) {
            if (PurchaseView.this.f34411n instanceof rc40) {
                ((rc40) PurchaseView.this.f34411n).m178778Z(i, new d30() { // from class: l.ocb0
                    @Override // p149l.d30
                    public final void call() {
                        this.f143030a.m53194g();
                    }
                });
            }
        }

        @Override // p149l.g1m
        /* JADX INFO: renamed from: b */
        public void mo53197b(int i) {
            if (PurchaseView.this.f34411n instanceof rc40) {
                ((rc40) PurchaseView.this.f34411n).m178779a0(i, new d30() { // from class: l.pcb0
                    @Override // p149l.d30
                    public final void call() {
                        this.f148165a.m53195h();
                    }
                });
            }
        }

        @Override // p149l.g1m
        /* JADX INFO: renamed from: c */
        public C8765d mo53198c(int i) {
            if (PurchaseView.this.f34411n instanceof rc40) {
                return ((rc40) PurchaseView.this.f34411n).m178756B(i);
            }
            return null;
        }

        @Override // p149l.g1m
        /* JADX INFO: renamed from: d */
        public Merchandise mo53199d(int i) {
            if (PurchaseView.this.f34411n instanceof rc40) {
                return ((rc40) PurchaseView.this.f34411n).m178757C(i);
            }
            return null;
        }
    }

    public PurchaseView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34404g = hmb.m131712q1();
        this.f34419v = C22392a.m221512b();
        this.f34423z = new e30() { // from class: l.tbb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169246a.m53167J((C8765d) obj);
            }
        };
        this.f34398A = new e30() { // from class: l.ecb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90490a.m53168K((C8765d) obj);
            }
        };
        this.f34399B = new e30() { // from class: l.gcb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102001a.m53169L((PayMethod) obj);
            }
        };
        this.f34402E = false;
        this.f34405h = (Act) context;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ List m53159z(List list, List list2) {
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Merchandise merchandise = (Merchandise) vwb.m200346r(list2, new w9j() { // from class: l.bcb0
            @Override // p149l.w9j
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
    public final void m53160C() {
        r0m r0mVar = this.f34410m;
        if (r0mVar instanceof oej) {
            ((oej) r0mVar).m163963j();
        }
        c3m c3mVar = this.f34411n;
        if (c3mVar instanceof id40) {
            xdl0.m208357U(((id40) c3mVar).m155745q(), 0);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m53161D(Boolean bool) {
        c3m c3mVar = this.f34411n;
        if (c3mVar instanceof rc40) {
            ((rc40) c3mVar).m178766L(bool.booleanValue() ? AgreementComponent.AgreementState.checked : AgreementComponent.AgreementState.unchecked);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m53162E(boolean z) {
        if (!sab0.m182891i(this.f34406i) || CoreModule.m29935P().m94651a().mo158371f()) {
            this.f34402E = z;
            c3m c3mVar = this.f34411n;
            if (c3mVar instanceof msl) {
                ((msl) c3mVar).mo156151g(z);
                return;
            }
            return;
        }
        this.f34402E = true;
        c3m c3mVar2 = this.f34411n;
        if (c3mVar2 instanceof msl) {
            ((msl) c3mVar2).mo156151g(true);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m53163F() {
        ProductCategory productCategory = this.f34406i.productCategory();
        if (CoreModule.m29935P().m94651a().mo33507h5() && TEnum.equals(productCategory, "svip")) {
            this.f34415r = C22306c.just(productCategory).flatMap(new w9j() { // from class: l.xbb0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19654j0.m30593K5();
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.ybb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f197321a.m53165H((Optional) obj);
                }
            }, new e30() { // from class: l.zbb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f202433a.m53166I((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public boolean m53164G() {
        if (!NullChecker.m81303a(this.f34411n)) {
            return false;
        }
        c3m c3mVar = this.f34411n;
        return (c3mVar instanceof rc40) && ((rc40) c3mVar).m178760F();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m53165H(Optional optional) {
        if (optional.isPresent()) {
            double d = ((RefundDetail) optional.get()).totalRefundAmount;
            if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                ozl ozlVar = this.f34412o;
                if (ozlVar instanceof de60) {
                    ((de60) ozlVar).m111172t0(d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m53166I(Throwable th) {
        ozl ozlVar = this.f34412o;
        if (ozlVar instanceof de60) {
            ((de60) ozlVar).m111172t0(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m53167J(C8765d c8765d) {
        if (NullChecker.m81303a(this.f34410m)) {
            this.f34410m.mo155368b(c8765d);
        }
        if (NullChecker.m81303a(this.f34412o)) {
            this.f34412o.mo111147b(c8765d);
            this.f34412o.mo111153f(c8765d);
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m53168K(C8765d c8765d) {
        ozl ozlVar = this.f34412o;
        if (ozlVar instanceof lej) {
            ((lej) ozlVar).m149559C0();
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m53169L(PayMethod payMethod) {
        this.f34417t = payMethod;
        if (NullChecker.m81303a(this.f34411n)) {
            this.f34411n.mo105095e(payMethod);
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m53170M(List list) {
        String str = "svipPicksMembership";
        String str2 = "svip";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", w2b0.m201088b(this.f34407j));
            ProductCategory productCategory = this.f34406i.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", vwb.m200307U(this.f34418u, Constants.SEPARATOR_COMMA));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            if (!TEnum.equals(p2b0.m167133h().m167139g("vip"), "svip")) {
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
            jSONObject.put("default_duration", p2b0.m167133h().m167147p(productCategory));
            jSONObject.put("if_double_tab", true);
            jSONObject.put("if_discount", this.f34400C);
            jSONObject.put("function_type", iab0.m135145f(this.f34420w, this.f34407j));
            String str3 = (CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30088w3()) ? "yes" : "no";
            jSONObject.put("no_secret_payment", str3);
            jSONObject.put("user_secret_staus", str3);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        this.f34421x.m109039o(jSONObject);
        i0e.m133797f(this.f34421x);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m53171N() {
        m53185b0();
        m53186c0();
        m53163F();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ C22306c m53172O(List list) {
        return igj.m136009M(this.f34405h, list);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ C22306c m53174Q(List list) {
        return igj.m136009M(this.f34405h, list);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m53176S(View view) {
        if (NullChecker.m81303a(this.f34416s)) {
            if (NullChecker.m81303a(this.f34409l)) {
                this.f34409l.call(this.f34406i);
            }
            this.f34416s.call(4);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m53177T(boolean z, boolean z2) {
        if (z2 || this.f34406i != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return;
        }
        lsi0.m151578h(R$string.f27281R3);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m53178U(List list) {
        this.f34411n.mo105097h(list, this.f34423z, this.f34416s);
    }

    /* JADX INFO: renamed from: V */
    public void m53179V() {
        c3m c3mVar = this.f34411n;
        if (c3mVar instanceof rc40) {
            ((rc40) c3mVar).m178772R();
        }
    }

    /* JADX INFO: renamed from: W */
    public void m53180W() {
        if (this.f34421x == null) {
            this.f34421x = i0e.m133794c(m53181X(), C8767f.class.getName());
        }
        this.f34419v.take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.icb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112448a.m53170M((List) obj);
            }
        }));
        r0m r0mVar = this.f34410m;
        if (r0mVar instanceof yae0) {
            ((yae0) r0mVar).m213833f();
        } else if (r0mVar instanceof pt80) {
            ((pt80) r0mVar).m171289k();
        } else if (r0mVar instanceof mmd0) {
            ((mmd0) r0mVar).m155371g();
        }
    }

    /* JADX INFO: renamed from: X */
    public String m53181X() {
        return "p_purchase_page";
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m53175R(ProductCategory productCategory, List<Merchandise> list) {
        List<C8765d> listMo107333a = cjy.m107330z(productCategory).mo107333a(this.f34405h, this.f34406i, productCategory, list);
        this.f34400C = NullChecker.m81303a(vwb.m200346r(list, new w9j() { // from class: l.acb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(rxa0.m181493n((Merchandise) obj));
            }
        }));
        m53188e0(listMo107333a);
    }

    /* JADX INFO: renamed from: Z */
    public final void m53183Z(List<C8765d> list) {
        if (this.f34418u == null) {
            this.f34418u = iab0.m135149j(list);
        }
        this.f34419v.onNext(list);
    }

    /* JADX INFO: renamed from: a0 */
    public void m53184a0(boolean z) {
        Runnable runnable = new Runnable() { // from class: l.hcb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f107037a.m53171N();
            }
        };
        if (z) {
            e51.m114743H(this.f34405h, runnable, 500L);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m53185b0() {
        r0m r0mVarM148277b = l2b0.m148277b(this.f34405h, this.f34406i, this.f34407j, false, false);
        this.f34410m = r0mVarM148277b;
        View viewMo155367a = r0mVarM148277b.mo155367a(this.f34403f, this.f34404g);
        if (this.f34404g) {
            r0m r0mVar = this.f34410m;
            if (r0mVar instanceof pt80) {
                ((pt80) r0mVar).m171292n();
            }
        }
        r0m r0mVar2 = this.f34410m;
        if (r0mVar2 instanceof oej) {
            ((oej) r0mVar2).m163962i();
        }
        if (NullChecker.m81303a(viewMo155367a)) {
            this.f34403f.addView(viewMo155367a);
            this.f34410m.mo155369c(this.f34413p);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m53186c0() {
        final ProductCategory productCategory = this.f34406i.productCategory();
        if (cjy.m107301G(productCategory.toString())) {
            this.f34414q = mkd0.m154984r(CoreModule.f17545c.f19654j0.m30644y5(productCategory), CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial)), new x9j() { // from class: l.jcb0
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return PurchaseView.m53159z((List) obj, (List) obj2);
                }
            }).filter(new w9j() { // from class: l.kcb0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    List list = (List) obj;
                    return Boolean.valueOf((list == null || list.isEmpty()) ? false : true);
                }
            }).flatMap(new w9j() { // from class: l.lcb0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f127394a.m53172O((List) obj);
                }
            }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.mcb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f133092a.m53173P(productCategory, (List) obj);
                }
            }));
        } else {
            this.f34414q = C22306c.just(productCategory).flatMap(new w9j() { // from class: l.ncb0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19654j0.m30644y5((ProductCategory) obj);
                }
            }).filter(new w9j() { // from class: l.ubb0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).flatMap(new w9j() { // from class: l.vbb0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f180834a.m53174Q((List) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.wbb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f185567a.m53175R(productCategory, (List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m53187d0(List<C8765d> list) {
        ozl ozlVarM148276a = l2b0.m148276a(this.f34405h, this.f34406i, this.f34407j);
        this.f34412o = ozlVarM148276a;
        View viewMo111145a = ozlVarM148276a.mo111145a(this.f34403f, this.f34404g);
        if (NullChecker.m81303a(viewMo111145a)) {
            if (this.f34412o instanceof lej) {
                c3m c3mVar = this.f34411n;
                if (c3mVar instanceof id40) {
                    c3mVar.mo105096f(list, this.f34423z, this.f34416s, this.f34398A);
                }
                if (((lej) this.f34412o).m149558A0()) {
                    m53160C();
                }
            }
            ozl ozlVar = this.f34412o;
            if (ozlVar instanceof de60) {
                ((de60) ozlVar).m111162k0(this.f34408k);
                ((de60) this.f34412o).m111165n0(this.f34399B);
                ((de60) this.f34412o).m111163l0(new C8757a());
            }
            ((de60) this.f34412o).m111167p0(this);
            this.f34412o.mo111149c(this.f34407j);
            this.f34412o.mo111159i(this.f34416s);
            ((de60) this.f34412o).mo111150c0(new View.OnClickListener() { // from class: l.fcb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f96786a.m53176S(view);
                }
            });
            this.f34403f.addView(viewMo111145a);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m53188e0(final List<C8765d> list) {
        c3m c3mVarM148278c = l2b0.m148278c(this.f34405h, this.f34406i, this.f34407j, this.f34417t);
        this.f34411n = c3mVarM148278c;
        if (c3mVarM148278c instanceof id40) {
            id40 id40Var = (id40) c3mVarM148278c;
            int i = t100.f167260i;
            id40Var.m135415e0(i, 0, i, 0);
            id40Var.m155738H(new mp0.InterfaceC18522a() { // from class: l.ccb0
                @Override // p149l.mp0.InterfaceC18522a
                /* JADX INFO: renamed from: a */
                public final void mo106044a(boolean z, boolean z2) {
                    this.f80225a.m53177T(z, z2);
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = t100.f167268q;
            layoutParams.bottomMargin = t100.f167259h;
            this.f34403f.addView(id40Var.m155745q(), layoutParams);
            if (NullChecker.m81303a(this.f34401D)) {
                this.f34401D.call(this.f34406i, id40Var.mo135419p());
            }
        } else if (c3mVarM148278c instanceof mp0) {
            mp0 mp0Var = (mp0) c3mVarM148278c;
            this.f34403f.setClipChildren(false);
            this.f34403f.setClipToPadding(false);
            this.f34403f.addView(mp0Var.m155745q());
            if (!mp0Var.m155748y()) {
                this.f34403f.addView(mp0Var.mo135419p());
            } else if (NullChecker.m81303a(this.f34401D)) {
                this.f34401D.call(this.f34406i, mp0Var.mo135419p());
            }
            e51.m114742G(new Runnable() { // from class: l.dcb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f85393a.m53178U(list);
                }
            });
        } else {
            View viewMo105092a = c3mVarM148278c.mo105092a(this.f34403f, this.f34404g);
            if (sab0.m182891i(this.f34406i) && p2b0.m167133h().m167157z()) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                int i2 = t100.f167252a;
                layoutParams2.leftMargin = i2;
                layoutParams2.rightMargin = i2;
                this.f34403f.addView(viewMo105092a, layoutParams2);
            } else {
                this.f34403f.addView(viewMo105092a);
            }
            c3m c3mVar = this.f34411n;
            if (c3mVar instanceof rc40) {
                rc40 rc40Var = (rc40) c3mVar;
                if (rc40Var.m178764J() && NullChecker.m81303a(this.f34401D)) {
                    this.f34401D.call(this.f34406i, rc40Var.m178759E(false));
                }
            }
            ((rc40) this.f34411n).m178780b0(this.f34422y);
            this.f34411n.mo105097h(list, this.f34423z, this.f34416s);
        }
        c3m c3mVar2 = this.f34411n;
        if (c3mVar2 instanceof msl) {
            ((msl) c3mVar2).mo156151g(this.f34402E);
        }
        m53187d0(list);
        m53183Z(list);
    }

    /* JADX INFO: renamed from: f0 */
    public void m53189f0() {
        r0m r0mVar = this.f34410m;
        if (r0mVar instanceof pt80) {
            ((pt80) r0mVar).m171298t();
        } else if (r0mVar instanceof mmd0) {
            ((mmd0) r0mVar).m155375l();
        }
        if (NullChecker.m81303a(this.f34421x)) {
            i0e.m133796e(this.f34421x);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m53190g0() {
        if (NullChecker.m81303a(this.f34410m)) {
            this.f34410m.release();
        }
        if (NullChecker.m81303a(this.f34411n)) {
            this.f34411n.release();
        }
        if (NullChecker.m81303a(this.f34412o)) {
            this.f34412o.release();
        }
        if (NullChecker.m81303a(this.f34414q)) {
            this.f34414q.unsubscribe();
            this.f34414q = null;
        }
        if (NullChecker.m81303a(this.f34415r)) {
            this.f34415r.unsubscribe();
            this.f34415r = null;
        }
    }

    public PurchaseType getPurchaseType() {
        return this.f34406i;
    }

    /* JADX INFO: renamed from: h0 */
    public void m53191h0(boolean z) {
        if (NullChecker.m81303a(this.f34411n)) {
            c3m c3mVar = this.f34411n;
            if (c3mVar instanceof rc40) {
                ((rc40) c3mVar).m178782d0(z);
            }
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m53190g0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f34403f = (LinearLayout) findViewById(z4c0.f201535i0);
    }

    public void setAgreementCheckedCallback(e30<Boolean> e30Var) {
        this.f34422y = e30Var;
    }

    public void setAgreementViewAction(f30<PurchaseType, View> f30Var) {
        this.f34401D = f30Var;
    }

    public void setDialogStateAction(e30<Integer> e30Var) {
        this.f34416s = e30Var;
    }

    public void setFirstPrivilege(Privilege privilege) {
        this.f34420w = privilege;
    }

    public void setFrom(String str) {
        this.f34407j = str;
        if (NullChecker.m81303a(this.f34412o)) {
            this.f34412o.mo111149c(str);
        }
    }

    public void setOnCloseClick(e30<PurchaseType> e30Var) {
        this.f34409l = e30Var;
    }

    public void setOnPaymentSuccess(g30<PurchaseType, Act, String> g30Var) {
        this.f34408k = g30Var;
    }

    public void setPrivilegeDescriptions(List<wx80> list) {
        this.f34413p = list;
    }

    public void setPurchaseType(PurchaseType purchaseType) {
        this.f34406i = purchaseType;
    }

    public PurchaseView(Context context) {
        super(context);
        this.f34404g = hmb.m131712q1();
        this.f34419v = C22392a.m221512b();
        this.f34423z = new e30() { // from class: l.tbb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169246a.m53167J((C8765d) obj);
            }
        };
        this.f34398A = new e30() { // from class: l.ecb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90490a.m53168K((C8765d) obj);
            }
        };
        this.f34399B = new e30() { // from class: l.gcb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102001a.m53169L((PayMethod) obj);
            }
        };
        this.f34402E = false;
        this.f34405h = (Act) context;
    }

    public PurchaseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34404g = hmb.m131712q1();
        this.f34419v = C22392a.m221512b();
        this.f34423z = new e30() { // from class: l.tbb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169246a.m53167J((C8765d) obj);
            }
        };
        this.f34398A = new e30() { // from class: l.ecb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90490a.m53168K((C8765d) obj);
            }
        };
        this.f34399B = new e30() { // from class: l.gcb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102001a.m53169L((PayMethod) obj);
            }
        };
        this.f34402E = false;
        this.f34405h = (Act) context;
    }
}
