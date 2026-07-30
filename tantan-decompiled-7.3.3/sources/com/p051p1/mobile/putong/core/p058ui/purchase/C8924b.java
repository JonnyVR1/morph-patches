package com.p051p1.mobile.putong.core.p058ui.purchase;

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
import com.p051p1.mobile.putong.core.p058ui.alifree.AliFreeAutoView;
import com.p051p1.mobile.putong.core.p058ui.alifree.AliFreeUtils;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8924b;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.agreement.AgreementComponent;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VScroll_Fill_BottomAligned;
import p153l.a30;
import p153l.a690;
import p153l.abb0;
import p153l.bnl0;
import p153l.cjj;
import p153l.dbb0;
import p153l.dgc0;
import p153l.fhj;
import p153l.fl40;
import p153l.fo0;
import p153l.g6e;
import p153l.gta;
import p153l.i2m;
import p153l.i9b0;
import p153l.ihj;
import p153l.im60;
import p153l.ip0;
import p153l.j690;
import p153l.jbc0;
import p153l.jyb;
import p153l.kcg0;
import p153l.l3m;
import p153l.l4g0;
import p153l.mib0;
import p153l.nab0;
import p153l.o1j0;
import p153l.oud0;
import p153l.pab0;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.rcj;
import p153l.rec0;
import p153l.t5m;
import p153l.tab0;
import p153l.uqb0;
import p153l.ur2;
import p153l.vnb;
import p153l.w1e;
import p153l.wib0;
import p153l.wl40;
import p153l.x20;
import p153l.y20;
import p153l.z3m;
import p153l.z7a;
import p153l.zry;
import p153l.zul;
import p153l.zwk;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.b */
/* JADX INFO: loaded from: classes4.dex */
public class C8924b {

    /* JADX INFO: renamed from: X */
    public static final int f35285X = Color.parseColor("#FEFCF7");

    /* JADX INFO: renamed from: A */
    public t5m f35286A;

    /* JADX INFO: renamed from: B */
    public i2m f35287B;

    /* JADX INFO: renamed from: C */
    public List<a690> f35288C;

    /* JADX INFO: renamed from: D */
    public Dialog f35289D;

    /* JADX INFO: renamed from: E */
    public x20 f35290E;

    /* JADX INFO: renamed from: F */
    public x20 f35291F;

    /* JADX INFO: renamed from: G */
    public x20 f35292G;

    /* JADX INFO: renamed from: H */
    public x20 f35293H;

    /* JADX INFO: renamed from: J */
    public kcg0 f35295J;

    /* JADX INFO: renamed from: K */
    public kcg0 f35296K;

    /* JADX INFO: renamed from: L */
    public kcg0 f35297L;

    /* JADX INFO: renamed from: M */
    public l4g0 f35298M;

    /* JADX INFO: renamed from: N */
    public boolean f35299N;

    /* JADX INFO: renamed from: O */
    public Picture.ImageUri f35300O;

    /* JADX INFO: renamed from: P */
    public String f35301P;

    /* JADX INFO: renamed from: Q */
    public Object f35302Q;

    /* JADX INFO: renamed from: S */
    public PayMethod f35304S;

    /* JADX INFO: renamed from: a */
    public FrameLayout f35309a;

    /* JADX INFO: renamed from: b */
    public AliFreeAutoView f35310b;

    /* JADX INFO: renamed from: c */
    public VScroll_Fill_BottomAligned f35311c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f35312d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f35313e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f35314f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f35315g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f35316h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f35317i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f35318j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f35319k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f35320l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f35321m;

    /* JADX INFO: renamed from: n */
    public TextView f35322n;

    /* JADX INFO: renamed from: o */
    public TextView f35323o;

    /* JADX INFO: renamed from: p */
    public VImage f35324p;

    /* JADX INFO: renamed from: q */
    public int f35325q;

    /* JADX INFO: renamed from: r */
    public final Act f35326r;

    /* JADX INFO: renamed from: s */
    public final PurchaseType f35327s;

    /* JADX INFO: renamed from: t */
    public Privilege f35328t;

    /* JADX INFO: renamed from: u */
    public boolean f35329u;

    /* JADX INFO: renamed from: v */
    public boolean f35330v;

    /* JADX INFO: renamed from: w */
    public String f35331w;

    /* JADX INFO: renamed from: x */
    public a30<PurchaseType, Act, String> f35332x;

    /* JADX INFO: renamed from: y */
    public a30<PurchaseType, Act, String> f35333y;

    /* JADX INFO: renamed from: z */
    public l3m f35334z;

    /* JADX INFO: renamed from: I */
    public boolean f35294I = true;

    /* JADX INFO: renamed from: R */
    public boolean f35303R = false;

    /* JADX INFO: renamed from: T */
    public y20<Integer> f35305T = new y20() { // from class: l.k9b0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f124468a.m54478g0((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: U */
    public y20<C8928d> f35306U = new y20() { // from class: l.v9b0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f182984a.m54479h0((C8928d) obj);
        }
    };

    /* JADX INFO: renamed from: V */
    public y20<C8928d> f35307V = new y20() { // from class: l.dab0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f85863a.m54480i0((C8928d) obj);
        }
    };

    /* JADX INFO: renamed from: W */
    public y20<PayMethod> f35308W = new y20() { // from class: l.eab0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f92752a.m54481j0((PayMethod) obj);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.b$a */
    public class a extends ur2 {
        public a() {
        }

        @Override // p153l.e6m
        public String pageId() {
            return (CoreModule.m30933P().m143405a().mo34532k() && wib0.m206570n(C8924b.this.f35327s)) ? "p_coin_picks_purchase_popup" : "p_purchase_page";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.b$b */
    public class b implements z3m {
        public b() {
        }

        @Override // p153l.z3m
        /* JADX INFO: renamed from: a */
        public void mo54379a(int i) {
            if (C8924b.this.f35286A instanceof fl40) {
                ((fl40) C8924b.this.f35286A).m126107Z(i, new x20() { // from class: l.lab0
                    @Override // p153l.x20
                    public final void call() {
                        this.f130680a.m54500g();
                    }
                });
            }
        }

        @Override // p153l.z3m
        /* JADX INFO: renamed from: b */
        public void mo54380b(int i) {
            if (C8924b.this.f35286A instanceof fl40) {
                ((fl40) C8924b.this.f35286A).m126109a0(i, new x20() { // from class: l.mab0
                    @Override // p153l.x20
                    public final void call() {
                        this.f135499a.m54501h();
                    }
                });
            }
        }

        @Override // p153l.z3m
        /* JADX INFO: renamed from: c */
        public C8928d mo54381c(int i) {
            if (C8924b.this.f35286A instanceof fl40) {
                return ((fl40) C8924b.this.f35286A).m126085B(i);
            }
            return null;
        }

        @Override // p153l.z3m
        /* JADX INFO: renamed from: d */
        public Merchandise mo54382d(int i) {
            if (C8924b.this.f35286A instanceof fl40) {
                return ((fl40) C8924b.this.f35286A).m126086C(i);
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m54500g() {
            C8924b.this.f35287B.mo138230h();
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m54501h() {
            C8924b.this.f35287B.mo138230h();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.b$c */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35337a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f35337a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35337a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35337a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.b$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public Act f35338a;

        /* JADX INFO: renamed from: b */
        public PurchaseType f35339b;

        /* JADX INFO: renamed from: c */
        public Privilege f35340c;

        /* JADX INFO: renamed from: e */
        public List<a690> f35342e;

        /* JADX INFO: renamed from: f */
        public x20 f35343f;

        /* JADX INFO: renamed from: g */
        public x20 f35344g;

        /* JADX INFO: renamed from: h */
        public String f35345h;

        /* JADX INFO: renamed from: j */
        public a30<PurchaseType, Act, String> f35347j;

        /* JADX INFO: renamed from: k */
        public a30<PurchaseType, Act, String> f35348k;

        /* JADX INFO: renamed from: l */
        public x20 f35349l;

        /* JADX INFO: renamed from: m */
        public x20 f35350m;

        /* JADX INFO: renamed from: n */
        public Picture.ImageUri f35351n;

        /* JADX INFO: renamed from: o */
        public String f35352o;

        /* JADX INFO: renamed from: p */
        public Object f35353p;

        /* JADX INFO: renamed from: d */
        public boolean f35341d = false;

        /* JADX INFO: renamed from: i */
        public int f35346i = 0;

        public d(Act act) {
            this.f35338a = act;
        }

        /* JADX INFO: renamed from: a */
        public C8924b m54502a() {
            C8924b c8924bM54503b = m54503b(this.f35338a, this.f35339b);
            c8924bM54503b.m54495x0(this.f35346i);
            if (jyb.m147479J(this.f35342e)) {
                this.f35342e = j690.m143622n(this.f35339b, this.f35340c, this.f35341d);
            }
            c8924bM54503b.m54496y0(this.f35340c, this.f35341d);
            c8924bM54503b.m54448I0(this.f35342e);
            c8924bM54503b.m54441B0(this.f35343f);
            c8924bM54503b.m54440A0(this.f35344g);
            c8924bM54503b.m54444E0(this.f35347j);
            c8924bM54503b.m54443D0(this.f35348k);
            c8924bM54503b.m54497z0(this.f35345h);
            c8924bM54503b.m54442C0(this.f35350m);
            c8924bM54503b.m54445F0(this.f35349l);
            c8924bM54503b.m54446G0(this.f35351n);
            c8924bM54503b.m54447H0(this.f35352o);
            c8924bM54503b.m54450K0(this.f35353p);
            return c8924bM54503b;
        }

        /* JADX INFO: renamed from: b */
        public C8924b m54503b(Act act, PurchaseType purchaseType) {
            return new C8924b(act, purchaseType);
        }

        /* JADX INFO: renamed from: c */
        public d m54504c(int i) {
            this.f35346i = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public d m54505d(String str) {
            this.f35345h = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public d m54506e(x20 x20Var) {
            this.f35344g = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public d m54507f(x20 x20Var) {
            this.f35343f = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public d m54508g(x20 x20Var) {
            this.f35350m = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public d m54509h(a30<PurchaseType, Act, String> a30Var) {
            this.f35347j = a30Var;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public d m54510i(x20 x20Var) {
            this.f35349l = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public d m54511j(String str) {
            this.f35352o = str;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public d m54512k(List<a690> list) {
            this.f35342e = list;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public d m54513l(PurchaseType purchaseType) {
            return m54514m(purchaseType, null);
        }

        /* JADX INFO: renamed from: m */
        public d m54514m(PurchaseType purchaseType, Privilege privilege) {
            return m54515n(purchaseType, privilege, false);
        }

        /* JADX INFO: renamed from: n */
        public d m54515n(PurchaseType purchaseType, Privilege privilege, boolean z) {
            this.f35339b = purchaseType;
            this.f35340c = privilege;
            this.f35341d = z;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public d m54516o(Object obj) {
            this.f35353p = obj;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C8924b m54517p() {
            C8924b c8924bM54502a = m54502a();
            c8924bM54502a.m54451L0();
            return c8924bM54502a;
        }
    }

    public C8924b(Act act, PurchaseType purchaseType) {
        this.f35326r = act;
        this.f35327s = purchaseType;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ List m54423j(List list, List list2) {
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Merchandise merchandise = (Merchandise) jyb.m147529r(list2, new qcj() { // from class: l.z9b0
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

    /* JADX INFO: renamed from: A0 */
    public final void m54440A0(x20 x20Var) {
        this.f35291F = x20Var;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m54441B0(x20 x20Var) {
        this.f35290E = x20Var;
    }

    /* JADX INFO: renamed from: C0 */
    public void m54442C0(x20 x20Var) {
        this.f35293H = x20Var;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m54443D0(a30<PurchaseType, Act, String> a30Var) {
        this.f35333y = a30Var;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m54444E0(a30<PurchaseType, Act, String> a30Var) {
        this.f35332x = a30Var;
    }

    /* JADX INFO: renamed from: F0 */
    public void m54445F0(x20 x20Var) {
        this.f35292G = x20Var;
    }

    /* JADX INFO: renamed from: G0 */
    public void m54446G0(Picture.ImageUri imageUri) {
        this.f35300O = imageUri;
    }

    /* JADX INFO: renamed from: H0 */
    public void m54447H0(String str) {
        this.f35301P = str;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m54448I0(List<a690> list) {
        this.f35288C = list;
    }

    /* JADX INFO: renamed from: J0 */
    public void m54449J0(boolean z) {
        this.f35294I = z;
    }

    /* JADX INFO: renamed from: K0 */
    public void m54450K0(Object obj) {
        this.f35302Q = obj;
    }

    /* JADX INFO: renamed from: L0 */
    public void m54451L0() {
        Act act = this.f35326r;
        if (act == null || act.isFinishing()) {
            return;
        }
        this.f35298M = new l4g0(new a());
        this.f35330v = vnb.m201957q1();
        m54453M0();
        if (CoreModule.m30933P().m143405a().mo34528jh() && NullChecker.m82486a(this.f35289D.getWindow())) {
            int i = jbc0.f119264I9;
            if (wib0.m206565i(this.f35327s)) {
                i = jbc0.f119669m4;
            }
            this.f35311c.setBackgroundResource(i);
            this.f35289D.getWindow().setBackgroundDrawableResource(jbc0.f119362P9);
            m54460Q();
        }
        PurchaseType purchaseType = this.f35327s;
        if (purchaseType == PurchaseType.TYPE_GET_VIP) {
            uqb0.m197269e1("vip_purchase_shown", "showFrom", this.f35331w);
        } else if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            uqb0.m197269e1("see_purchase_shown", "showFrom", this.f35331w);
        } else if (purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE) {
            uqb0.m197269e1("superlike_purchase_shown", "showFrom", this.f35331w);
        } else if (purchaseType == PurchaseType.TYPE_GET_BOOST) {
            uqb0.m197269e1("boost_purchase_shown", "showFrom", this.f35331w);
        }
        m54490s0(true);
        i9b0.INSTANCE.m139092a(this.f35327s);
    }

    /* JADX INFO: renamed from: M */
    public final void m54452M(View view) {
        dbb0.m115159a(this, view);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m54453M0() {
        m54462R();
        m54493v0();
        m54494w0();
        m54465T();
        m54464S();
        this.f35289D.show();
    }

    /* JADX INFO: renamed from: N */
    public void m54454N(Boolean bool) {
        t5m t5mVar = this.f35286A;
        if (t5mVar instanceof fl40) {
            ((fl40) t5mVar).m126095L(bool.booleanValue() ? AgreementComponent.AgreementState.checked : AgreementComponent.AgreementState.unchecked);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m54455N0() {
        if ((this.f35327s == PurchaseType.TYPE_GET_VIP && (CoreModule.f18264c.f20396j0.m31577B4() || CoreModule.f18264c.f20396j0.m31646y4())) || (this.f35327s == PurchaseType.TYPE_GET_LIKERS && CoreModule.f18264c.f20396j0.m31575A4())) {
            Intent intentM81348b2 = WebViewAct.m81348b2(this.f35326r, CoreModule.f18264c.f20396j0.m31579C4().titleText, CoreModule.f18264c.f20396j0.m31579C4().promotionUrl, true);
            intentM81348b2.putExtra("hideNavigationBar", true);
            this.f35326r.startActivity(intentM81348b2);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m54456O() {
        if (m54468W()) {
            this.f35289D.dismiss();
        }
        gta.m132210e().m132214d().mo34662B8().put("");
    }

    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final void m54483l0(List<String> list) {
        this.f35310b.setTextList(list);
        this.f35310b.setTextStillTime(1500L);
        this.f35310b.setAnimTime(1000L);
        this.f35310b.m45496f();
    }

    /* JADX INFO: renamed from: P */
    public void m54458P(boolean z) {
        if (!wib0.m206565i(this.f35327s) || CoreModule.m30933P().m143405a().mo180463f()) {
            this.f35303R = z;
            t5m t5mVar = this.f35286A;
            if (t5mVar instanceof zul) {
                ((zul) t5mVar).mo126116g(z);
                return;
            }
            return;
        }
        this.f35303R = true;
        t5m t5mVar2 = this.f35286A;
        if (t5mVar2 instanceof zul) {
            ((zul) t5mVar2).mo126116g(true);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m54459P0(String str, List<C8928d> list) {
        String str2 = "svipPicksMembership";
        String str3 = "svip";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", abb0.m96735b(this.f35331w));
            if (wib0.m206579w(this.f35327s)) {
                jSONObject.put("first_carousel_page", mib0.m158484m(this.f35328t));
            }
            ProductCategory productCategory = this.f35327s.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", str);
            if (!TEnum.equals(tab0.m189811h().m189817g("vip"), "svip")) {
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
            jSONObject.put("default_duration", tab0.m189811h().m189825p(productCategory));
            String str4 = "no";
            jSONObject.put("if_sale", this.f35299N ? "yes" : "no");
            jSONObject.put("if_discount", this.f35299N);
            boolean z = false;
            jSONObject.put("if_double_tab", false);
            jSONObject.put("function_type", mib0.m158477f(this.f35328t, this.f35331w));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            if (CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31086w3()) {
                str4 = "yes";
            }
            jSONObject.put("no_secret_payment", str4);
            jSONObject.put("user_secret_staus", str4);
            jSONObject.put("ttc_page_type", BannerLoc.popup);
            if (CoreModule.m30933P().m143412i().mo180364N()) {
                if (CoreModule.f18264c.f20381e0.m116537Z7() && !CoreModule.f18264c.f20381e0.m116525W7() && !CoreModule.f18264c.f20381e0.m116579k8()) {
                    z = true;
                }
                jSONObject.put("is_fakeunreal", z);
            }
            CoreModule.m30933P().m143405a().mo34428U();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.f35298M.m152780o(jSONObject);
        w1e.m204402f(this.f35298M);
    }

    /* JADX INFO: renamed from: Q */
    public final void m54460Q() {
        List<String> listM45501d = AliFreeUtils.m45501d(this.f35327s);
        m54483l0(listM45501d);
        if (listM45501d.size() == 1) {
            this.f35310b.postDelayed(new Runnable() { // from class: l.q9b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f156215a.m54469X();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m54461Q0(List<C8928d> list) {
        m54459P0(jyb.m147490U(mib0.m158481j(list), Constants.SEPARATOR_COMMA), list);
        uqb0.m197269e1("purchase_page_shown", "platform", "android");
    }

    /* JADX INFO: renamed from: R */
    public void m54462R() {
        com.p051p1.mobile.android.app.Dialog dialogM21566z = this.f35326r.dialog().m21516M(rec0.f162456J2).m21515L((wib0.m206579w(this.f35327s) || wib0.m206575s(this.f35327s) || PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.f35327s) ? dgc0.f88283h : dgc0.f88284i).m21558v().m21493A(new DialogInterface.OnCancelListener() { // from class: l.u9b0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f178109a.m54470Y(dialogInterface);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.w9b0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f187992a.m54471Z(dialogInterface);
            }
        }).m21538i0(new DialogInterface.OnKeyListener() { // from class: l.x9b0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f192927a.m54472a0(dialogInterface, i, keyEvent);
            }
        }).m21514K0(new com.p051p1.mobile.android.app.Dialog.InterfaceC4464i() { // from class: l.y9b0
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4464i
            /* JADX INFO: renamed from: a */
            public final void mo21569a(com.p051p1.mobile.android.app.Dialog dialog) {
                this.f198074a.m54473b0(dialog);
            }
        }).m21565y0(g6e.f102427a).m21566z();
        this.f35289D = dialogM21566z;
        m54452M(dialogM21566z.m21457P());
        this.f35313e = this.f35318j;
        this.f35314f = this.f35319k;
        this.f35315g = this.f35320l;
        this.f35312d = this.f35317i;
        if (wib0.m206573q(this.f35327s)) {
            this.f35312d.setBackgroundColor(f35285X);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m54463R0() {
        if (NullChecker.m82486a(this.f35334z)) {
            this.f35334z.release();
        }
        if (NullChecker.m82486a(this.f35286A)) {
            this.f35286A.release();
        }
        if (NullChecker.m82486a(this.f35287B)) {
            this.f35287B.release();
        }
        if (NullChecker.m82486a(this.f35295J)) {
            this.f35295J.unsubscribe();
            this.f35295J = null;
        }
        if (NullChecker.m82486a(this.f35296K)) {
            this.f35296K.unsubscribe();
            this.f35296K = null;
        }
        psd0.m173633z(this.f35297L);
    }

    /* JADX INFO: renamed from: S */
    public final void m54464S() {
        ProductCategory productCategory = this.f35327s.productCategory();
        if (CoreModule.m30933P().m143405a().mo34586s3() && TEnum.equals(productCategory, "oDiamond")) {
            CoreModule.f18264c.f20396j0.m31596K5();
            this.f35297L = CoreModule.f18264c.f20396j0.m31595K4().subscribe(psd0.m173597H(new y20() { // from class: l.o9b0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f145520a.m54474c0((Optional) obj);
                }
            }, new y20() { // from class: l.p9b0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151129a.m54475d0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m54465T() {
        ProductCategory productCategory = this.f35327s.productCategory();
        if (CoreModule.m30933P().m143405a().mo34510h5() && TEnum.equals(productCategory, "svip")) {
            this.f35296K = C22421c.just(productCategory).flatMap(new qcj() { // from class: l.r9b0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20396j0.m31596K5();
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.s9b0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f166923a.m54476e0((Optional) obj);
                }
            }, new y20() { // from class: l.t9b0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172624a.m54477f0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m54466U() {
        ((ViewGroup.MarginLayoutParams) this.f35320l.getLayoutParams()).bottomMargin = qa00.m175859d(20.0f);
        bnl0.m105540X(this.f35319k, qa00.m175859d(6.0f));
    }

    /* JADX INFO: renamed from: V */
    public boolean m54467V() {
        t5m t5mVar = this.f35286A;
        if (t5mVar instanceof fl40) {
            return ((fl40) t5mVar).m126089F();
        }
        return true;
    }

    /* JADX INFO: renamed from: W */
    public boolean m54468W() {
        return NullChecker.m82486a(this.f35289D) && this.f35289D.isShowing();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m54469X() {
        m54492u0(this.f35327s);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m54470Y(DialogInterface dialogInterface) {
        m54463R0();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m54471Z(DialogInterface dialogInterface) {
        CoreModule.m30933P().m143405a().mo34311E9();
        m54463R0();
        w1e.m204401e(this.f35298M);
        if (NullChecker.m82486a(this.f35290E) && this.f35294I) {
            this.f35290E.call();
        }
        m54490s0(false);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ boolean m54472a0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i == 4) {
            this.f35305T.call(0);
            m54455N0();
            if (NullChecker.m82486a(this.f35293H)) {
                this.f35293H.call();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m54473b0(com.p051p1.mobile.android.app.Dialog dialog) {
        this.f35305T.call(0);
        m54455N0();
        if (NullChecker.m82486a(this.f35292G)) {
            this.f35292G.call();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m54474c0(Optional optional) {
        if (optional.isPresent()) {
            RefundDetail refundDetail = (RefundDetail) optional.get();
            i2m i2mVar = this.f35287B;
            if (i2mVar instanceof im60) {
                ((im60) i2mVar).m140794s0(refundDetail.totalRefundAmount);
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m54475d0(Throwable th) {
        i2m i2mVar = this.f35287B;
        if (i2mVar instanceof im60) {
            ((im60) i2mVar).m140794s0(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m54476e0(Optional optional) {
        if (optional.isPresent()) {
            double d2 = ((RefundDetail) optional.get()).totalRefundAmount;
            if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                i2m i2mVar = this.f35287B;
                if (i2mVar instanceof im60) {
                    ((im60) i2mVar).m140796t0(d2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m54477f0(Throwable th) {
        i2m i2mVar = this.f35287B;
        if (i2mVar instanceof im60) {
            ((im60) i2mVar).m140796t0(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m54478g0(Integer num) {
        if (NullChecker.m82486a(this.f35289D)) {
            if (num.intValue() == -1) {
                this.f35289D.hide();
                return;
            }
            if (num.intValue() == 0 || num.intValue() == 2) {
                if (num.intValue() == 2) {
                    m54449J0(false);
                }
                this.f35289D.dismiss();
            } else if (num.intValue() == 1) {
                this.f35289D.show();
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m54479h0(C8928d c8928d) {
        if (NullChecker.m82486a(this.f35334z)) {
            this.f35334z.mo116074b(c8928d);
        }
        if (NullChecker.m82486a(this.f35287B)) {
            this.f35287B.mo115926b(c8928d);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m54480i0(C8928d c8928d) {
        i2m i2mVar = this.f35287B;
        if (i2mVar instanceof fhj) {
            ((fhj) i2mVar).m125573C0();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m54481j0(PayMethod payMethod) {
        this.f35304S = payMethod;
        if (NullChecker.m82486a(this.f35286A)) {
            this.f35286A.mo126115e(payMethod);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m54482k0(boolean z, boolean z2) {
        if (z2 || this.f35327s != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return;
        }
        o1j0.m165634h(R$string.f28129R3);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m54484m0(View view) {
        i2m i2mVar = this.f35287B;
        if ((i2mVar instanceof fhj) && !NullChecker.m82486a(((fhj) i2mVar).f115701x)) {
            cjj.m110204L().subscribe(psd0.m173591B());
        }
        this.f35289D.dismiss();
        m54455N0();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ C22421c m54485n0(List list) {
        return cjj.m110205M(this.f35326r, list);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C22421c m54487p0(List list) {
        return cjj.m110205M(this.f35326r, list);
    }

    /* JADX INFO: renamed from: r0 */
    public void m54489r0() {
        t5m t5mVar = this.f35286A;
        if (t5mVar instanceof fl40) {
            ((fl40) t5mVar).m126101R();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m54490s0(boolean z) {
        if (z) {
            nab0.m162061a().m162064d(this.f35289D);
        } else {
            nab0.m162061a().m162063c(this.f35289D);
        }
    }

    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m54488q0(ProductCategory productCategory, List<Merchandise> list) {
        boolean zM82486a = NullChecker.m82486a(jyb.m147529r(list, new qcj() { // from class: l.bab0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(v5b0.m199788n((Merchandise) obj));
            }
        }));
        this.f35299N = zM82486a;
        this.f35287B.mo138229g(zM82486a);
        List<C8928d> listMo147671a = zry.m221275z(productCategory).mo147671a(this.f35326r, this.f35327s, productCategory, list);
        t5m t5mVarM171417c = pab0.m171417c(this.f35326r, this.f35327s, this.f35331w, this.f35304S);
        this.f35286A = t5mVarM171417c;
        View viewMo126108a = t5mVarM171417c.mo126108a(this.f35314f, this.f35330v);
        if (NullChecker.m82486a(this.f35309a)) {
            t5m t5mVar = this.f35286A;
            if (t5mVar instanceof ip0) {
                ((ip0) t5mVar).mo111896d();
                throw null;
            }
            if (t5mVar instanceof fl40) {
                this.f35309a.addView(((fl40) t5mVar).m126088E(false));
            }
        }
        if (NullChecker.m82486a(viewMo126108a)) {
            t5m t5mVar2 = this.f35286A;
            if (t5mVar2 instanceof wl40) {
                int i = qa00.f156322i;
                ((wl40) t5mVar2).m206928d0(i);
                ((wl40) this.f35286A).m206930f0(i);
                ((wl40) this.f35286A).m206927c0(0);
                ((wl40) this.f35286A).m141372H(new ip0.InterfaceC17765a() { // from class: l.cab0
                    @Override // p153l.ip0.InterfaceC17765a
                    /* JADX INFO: renamed from: a */
                    public final void mo108479a(boolean z, boolean z2) {
                        this.f80569a.m54482k0(z, z2);
                    }
                });
            }
            i2m i2mVar = this.f35287B;
            if (i2mVar instanceof im60) {
                ((im60) i2mVar).m140787l0(new b());
            }
            t5m t5mVar3 = this.f35286A;
            boolean z = t5mVar3 instanceof wl40;
            y20<C8928d> y20Var = this.f35306U;
            if (z) {
                t5mVar3.mo141377f(listMo147671a, y20Var, this.f35305T, this.f35307V);
            } else {
                t5mVar3.mo126117h(listMo147671a, y20Var, this.f35305T);
            }
            this.f35314f.addView(viewMo126108a, new LinearLayout.LayoutParams(-1, -2));
        }
        t5m t5mVar4 = this.f35286A;
        if (t5mVar4 instanceof zul) {
            ((zul) t5mVar4).mo126116g(this.f35303R);
        }
        t5m t5mVar5 = this.f35286A;
        if (t5mVar5 instanceof fl40) {
            ((fl40) t5mVar5).m126090G(true);
        }
        m54461Q0(listMo147671a);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m54492u0(PurchaseType purchaseType) {
        final List<String> listM45501d = AliFreeUtils.m45501d(purchaseType);
        this.f35310b.m45497g();
        this.f35310b.post(new Runnable() { // from class: l.aab0
            @Override // java.lang.Runnable
            public final void run() {
                this.f69116a.m54483l0(listM45501d);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m54493v0() {
        Privilege privilege = this.f35328t;
        Privilege privilege2 = Privilege.intl_no_ad;
        Act act = this.f35326r;
        if (privilege == privilege2) {
            this.f35334z = new ihj(act, this.f35327s, this.f35331w, true, privilege);
        } else {
            this.f35334z = pab0.m171416b(act, this.f35327s, this.f35331w, this.f35329u, true);
        }
        View viewMo116073a = this.f35334z.mo116073a(this.f35313e, this.f35330v);
        if (NullChecker.m82486a(viewMo116073a)) {
            this.f35334z.mo116075c(this.f35288C);
            this.f35313e.addView(viewMo116073a, new LinearLayout.LayoutParams(-1, -2));
            l3m l3mVar = this.f35334z;
            if (l3mVar instanceof oud0) {
                ((oud0) l3mVar).m169291g();
            }
        }
        i2m i2mVarM171415a = pab0.m171415a(this.f35326r, this.f35327s, this.f35331w);
        this.f35287B = i2mVarM171415a;
        if (i2mVarM171415a instanceof fhj) {
            ((fhj) i2mVarM171415a).mo115935h0(this.f35328t);
            ((fhj) this.f35287B).m140792q0(this.f35302Q);
        } else if (i2mVarM171415a instanceof im60) {
            ((im60) i2mVarM171415a).mo115935h0(this.f35328t);
            ((im60) this.f35287B).m140788m0(this.f35301P);
            ((im60) this.f35287B).m140792q0(this.f35302Q);
            ((im60) this.f35287B).m140790o0(this);
        }
        View viewMo115924a = this.f35287B.mo115924a(this.f35315g, this.f35330v);
        if (NullChecker.m82486a(viewMo115924a)) {
            i2m i2mVar = this.f35287B;
            if (i2mVar instanceof im60) {
                ((im60) i2mVar).m140786k0(this.f35332x);
                ((im60) this.f35287B).m140785j0(this.f35333y);
                ((im60) this.f35287B).m140789n0(this.f35308W);
            }
            this.f35287B.mo138227c(this.f35331w);
            this.f35287B.mo115937i(this.f35305T);
            this.f35315g.addView(viewMo115924a, new LinearLayout.LayoutParams(-1, -2));
        }
        if (wib0.m206579w(this.f35327s) || wib0.m206575s(this.f35327s) || PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.f35327s) {
            m54466U();
            int i = c.f35337a[this.f35327s.ordinal()];
            if (i == 1) {
                this.f35317i.setBackgroundResource(jbc0.f119353P0);
                this.f35324p.setImageResource(jbc0.f119421U2);
            } else if (i != 2) {
                LinearLayout linearLayout = this.f35317i;
                if (i != 3) {
                    linearLayout.setBackgroundResource(jbc0.f119224Fb);
                    this.f35324p.setImageResource(jbc0.f119421U2);
                } else {
                    linearLayout.setBackgroundResource(jbc0.f119339O0);
                    this.f35324p.setImageResource(jbc0.f119540d1);
                }
            } else {
                this.f35317i.setBackgroundResource(jbc0.f119325N0);
                this.f35324p.setImageResource(jbc0.f119421U2);
            }
            bnl0.m105524M(this.f35321m, true);
            TextView textView = this.f35323o;
            Act act2 = this.f35326r;
            textView.setText(z7a.m218874q0(act2, act2.getString(IntlCountryCodeController.m29114k() ? R$string.f28287f2 : R$string.f28193X1, this.f35326r.string(R$string.f28311h2), this.f35326r.string(R$string.f28176V6)), this.f35326r.string(R$string.f28311h2), zwk.m221910j(), this.f35326r.string(R$string.f28176V6), zwk.m221909i()));
            this.f35323o.setMovementMethod(LinkMovementMethod.getInstance());
            this.f35322n.setText(R$string.f28013G8);
            this.f35323o.setLineSpacing(0.0f, 1.0f);
            bnl0.m105540X(this.f35323o, 0);
            this.f35324p.setOnClickListener(new View.OnClickListener() { // from class: l.n9b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140756a.m54484m0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m54494w0() {
        final ProductCategory productCategory = this.f35327s.productCategory();
        if (zry.m221246G(productCategory.toString())) {
            this.f35295J = psd0.m173625r(CoreModule.f18264c.f20396j0.m31647y5(productCategory), CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial)), new rcj() { // from class: l.fab0
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return C8924b.m54423j((List) obj, (List) obj2);
                }
            }).filter(new qcj() { // from class: l.gab0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    List list = (List) obj;
                    return Boolean.valueOf((list == null || list.isEmpty()) ? false : true);
                }
            }).flatMap(new qcj() { // from class: l.hab0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f108486a.m54485n0((List) obj);
                }
            }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.iab0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f113575a.m54486o0(productCategory, (List) obj);
                }
            }));
        } else {
            this.f35295J = C22421c.just(productCategory).flatMap(new qcj() { // from class: l.jab0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20396j0.m31647y5((ProductCategory) obj);
                }
            }).filter(new qcj() { // from class: l.kab0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).flatMap(new qcj() { // from class: l.l9b0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f130582a.m54487p0((List) obj);
                }
            }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.m9b0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f135365a.m54488q0(productCategory, (List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m54495x0(int i) {
        this.f35325q = i;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m54496y0(Privilege privilege, boolean z) {
        this.f35328t = privilege;
        this.f35329u = z;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m54497z0(String str) {
        this.f35331w = str;
    }
}
