package com.p046p1.mobile.putong.core.p053ui.purchase;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RefundDetail;
import com.p046p1.mobile.putong.core.p053ui.alifree.AliFreeAutoView;
import com.p046p1.mobile.putong.core.p053ui.alifree.AliFreeUtils;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8761b;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.agreement.AgreementComponent;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VScroll_Fill_BottomAligned;
import p149l.c3m;
import p149l.c4g0;
import p149l.cjy;
import p149l.cwf0;
import p149l.d30;
import p149l.d3c0;
import p149l.de60;
import p149l.e1b0;
import p149l.e30;
import p149l.er2;
import p149l.fy80;
import p149l.g1m;
import p149l.g30;
import p149l.hmb;
import p149l.i0e;
import p149l.iab0;
import p149l.id40;
import p149l.igj;
import p149l.j2b0;
import p149l.jo0;
import p149l.juk;
import p149l.l2b0;
import p149l.lej;
import p149l.lsi0;
import p149l.m6c0;
import p149l.mkd0;
import p149l.mmd0;
import p149l.mp0;
import p149l.msl;
import p149l.n6a;
import p149l.oej;
import p149l.ozl;
import p149l.p2b0;
import p149l.qib0;
import p149l.r0m;
import p149l.rc40;
import p149l.s4e;
import p149l.sab0;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.w2b0;
import p149l.w9j;
import p149l.wx80;
import p149l.x9j;
import p149l.xdl0;
import p149l.y7c0;
import p149l.z2b0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.b */
/* JADX INFO: loaded from: classes4.dex */
public class C8761b {

    /* JADX INFO: renamed from: X */
    public static final int f34437X = Color.parseColor("#FEFCF7");

    /* JADX INFO: renamed from: A */
    public c3m f34438A;

    /* JADX INFO: renamed from: B */
    public ozl f34439B;

    /* JADX INFO: renamed from: C */
    public List<wx80> f34440C;

    /* JADX INFO: renamed from: D */
    public Dialog f34441D;

    /* JADX INFO: renamed from: E */
    public d30 f34442E;

    /* JADX INFO: renamed from: F */
    public d30 f34443F;

    /* JADX INFO: renamed from: G */
    public d30 f34444G;

    /* JADX INFO: renamed from: H */
    public d30 f34445H;

    /* JADX INFO: renamed from: J */
    public c4g0 f34447J;

    /* JADX INFO: renamed from: K */
    public c4g0 f34448K;

    /* JADX INFO: renamed from: L */
    public c4g0 f34449L;

    /* JADX INFO: renamed from: M */
    public cwf0 f34450M;

    /* JADX INFO: renamed from: N */
    public boolean f34451N;

    /* JADX INFO: renamed from: O */
    public Picture.ImageUri f34452O;

    /* JADX INFO: renamed from: P */
    public String f34453P;

    /* JADX INFO: renamed from: Q */
    public Object f34454Q;

    /* JADX INFO: renamed from: S */
    public PayMethod f34456S;

    /* JADX INFO: renamed from: a */
    public FrameLayout f34461a;

    /* JADX INFO: renamed from: b */
    public AliFreeAutoView f34462b;

    /* JADX INFO: renamed from: c */
    public VScroll_Fill_BottomAligned f34463c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f34464d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f34465e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f34466f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f34467g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f34468h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f34469i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f34470j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f34471k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f34472l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f34473m;

    /* JADX INFO: renamed from: n */
    public TextView f34474n;

    /* JADX INFO: renamed from: o */
    public TextView f34475o;

    /* JADX INFO: renamed from: p */
    public VImage f34476p;

    /* JADX INFO: renamed from: q */
    public int f34477q;

    /* JADX INFO: renamed from: r */
    public final Act f34478r;

    /* JADX INFO: renamed from: s */
    public final PurchaseType f34479s;

    /* JADX INFO: renamed from: t */
    public Privilege f34480t;

    /* JADX INFO: renamed from: u */
    public boolean f34481u;

    /* JADX INFO: renamed from: v */
    public boolean f34482v;

    /* JADX INFO: renamed from: w */
    public String f34483w;

    /* JADX INFO: renamed from: x */
    public g30<PurchaseType, Act, String> f34484x;

    /* JADX INFO: renamed from: y */
    public g30<PurchaseType, Act, String> f34485y;

    /* JADX INFO: renamed from: z */
    public r0m f34486z;

    /* JADX INFO: renamed from: I */
    public boolean f34446I = true;

    /* JADX INFO: renamed from: R */
    public boolean f34455R = false;

    /* JADX INFO: renamed from: T */
    public e30<Integer> f34457T = new e30() { // from class: l.g1b0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f100134a.m53295g0((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: U */
    public e30<C8765d> f34458U = new e30() { // from class: l.r1b0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f157259a.m53296h0((C8765d) obj);
        }
    };

    /* JADX INFO: renamed from: V */
    public e30<C8765d> f34459V = new e30() { // from class: l.z1b0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f201062a.m53297i0((C8765d) obj);
        }
    };

    /* JADX INFO: renamed from: W */
    public e30<PayMethod> f34460W = new e30() { // from class: l.a2b0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f67246a.m53298j0((PayMethod) obj);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.b$a */
    public class a extends er2 {
        public a() {
        }

        @Override // p149l.n3m
        public String pageId() {
            return (CoreModule.m29935P().m94651a().mo33529k() && sab0.m182896n(C8761b.this.f34479s)) ? "p_coin_picks_purchase_popup" : "p_purchase_page";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.b$b */
    public class b implements g1m {
        public b() {
        }

        @Override // p149l.g1m
        /* JADX INFO: renamed from: a */
        public void mo53196a(int i) {
            if (C8761b.this.f34438A instanceof rc40) {
                ((rc40) C8761b.this.f34438A).m178778Z(i, new d30() { // from class: l.h2b0
                    @Override // p149l.d30
                    public final void call() {
                        this.f105511a.m53317g();
                    }
                });
            }
        }

        @Override // p149l.g1m
        /* JADX INFO: renamed from: b */
        public void mo53197b(int i) {
            if (C8761b.this.f34438A instanceof rc40) {
                ((rc40) C8761b.this.f34438A).m178779a0(i, new d30() { // from class: l.i2b0
                    @Override // p149l.d30
                    public final void call() {
                        this.f110545a.m53318h();
                    }
                });
            }
        }

        @Override // p149l.g1m
        /* JADX INFO: renamed from: c */
        public C8765d mo53198c(int i) {
            if (C8761b.this.f34438A instanceof rc40) {
                return ((rc40) C8761b.this.f34438A).m178756B(i);
            }
            return null;
        }

        @Override // p149l.g1m
        /* JADX INFO: renamed from: d */
        public Merchandise mo53199d(int i) {
            if (C8761b.this.f34438A instanceof rc40) {
                return ((rc40) C8761b.this.f34438A).m178757C(i);
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m53317g() {
            C8761b.this.f34439B.mo111157h();
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m53318h() {
            C8761b.this.f34439B.mo111157h();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.b$c */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34489a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f34489a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34489a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34489a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.b$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public Act f34490a;

        /* JADX INFO: renamed from: b */
        public PurchaseType f34491b;

        /* JADX INFO: renamed from: c */
        public Privilege f34492c;

        /* JADX INFO: renamed from: e */
        public List<wx80> f34494e;

        /* JADX INFO: renamed from: f */
        public d30 f34495f;

        /* JADX INFO: renamed from: g */
        public d30 f34496g;

        /* JADX INFO: renamed from: h */
        public String f34497h;

        /* JADX INFO: renamed from: j */
        public g30<PurchaseType, Act, String> f34499j;

        /* JADX INFO: renamed from: k */
        public g30<PurchaseType, Act, String> f34500k;

        /* JADX INFO: renamed from: l */
        public d30 f34501l;

        /* JADX INFO: renamed from: m */
        public d30 f34502m;

        /* JADX INFO: renamed from: n */
        public Picture.ImageUri f34503n;

        /* JADX INFO: renamed from: o */
        public String f34504o;

        /* JADX INFO: renamed from: p */
        public Object f34505p;

        /* JADX INFO: renamed from: d */
        public boolean f34493d = false;

        /* JADX INFO: renamed from: i */
        public int f34498i = 0;

        public d(Act act) {
            this.f34490a = act;
        }

        /* JADX INFO: renamed from: a */
        public C8761b m53319a() {
            C8761b c8761bM53320b = m53320b(this.f34490a, this.f34491b);
            c8761bM53320b.m53312x0(this.f34498i);
            if (vwb.m200296J(this.f34494e)) {
                this.f34494e = fy80.m123718n(this.f34491b, this.f34492c, this.f34493d);
            }
            c8761bM53320b.m53313y0(this.f34492c, this.f34493d);
            c8761bM53320b.m53265I0(this.f34494e);
            c8761bM53320b.m53258B0(this.f34495f);
            c8761bM53320b.m53257A0(this.f34496g);
            c8761bM53320b.m53261E0(this.f34499j);
            c8761bM53320b.m53260D0(this.f34500k);
            c8761bM53320b.m53314z0(this.f34497h);
            c8761bM53320b.m53259C0(this.f34502m);
            c8761bM53320b.m53262F0(this.f34501l);
            c8761bM53320b.m53263G0(this.f34503n);
            c8761bM53320b.m53264H0(this.f34504o);
            c8761bM53320b.m53267K0(this.f34505p);
            return c8761bM53320b;
        }

        /* JADX INFO: renamed from: b */
        public C8761b m53320b(Act act, PurchaseType purchaseType) {
            return new C8761b(act, purchaseType);
        }

        /* JADX INFO: renamed from: c */
        public d m53321c(int i) {
            this.f34498i = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public d m53322d(String str) {
            this.f34497h = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public d m53323e(d30 d30Var) {
            this.f34496g = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public d m53324f(d30 d30Var) {
            this.f34495f = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public d m53325g(d30 d30Var) {
            this.f34502m = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public d m53326h(g30<PurchaseType, Act, String> g30Var) {
            this.f34499j = g30Var;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public d m53327i(d30 d30Var) {
            this.f34501l = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public d m53328j(String str) {
            this.f34504o = str;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public d m53329k(List<wx80> list) {
            this.f34494e = list;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public d m53330l(PurchaseType purchaseType) {
            return m53331m(purchaseType, null);
        }

        /* JADX INFO: renamed from: m */
        public d m53331m(PurchaseType purchaseType, Privilege privilege) {
            return m53332n(purchaseType, privilege, false);
        }

        /* JADX INFO: renamed from: n */
        public d m53332n(PurchaseType purchaseType, Privilege privilege, boolean z) {
            this.f34491b = purchaseType;
            this.f34492c = privilege;
            this.f34493d = z;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public d m53333o(Object obj) {
            this.f34505p = obj;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C8761b m53334p() {
            C8761b c8761bM53319a = m53319a();
            c8761bM53319a.m53268L0();
            return c8761bM53319a;
        }
    }

    public C8761b(Act act, PurchaseType purchaseType) {
        this.f34478r = act;
        this.f34479s = purchaseType;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ List m53240j(List list, List list2) {
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Merchandise merchandise = (Merchandise) vwb.m200346r(list2, new w9j() { // from class: l.v1b0
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

    /* JADX INFO: renamed from: A0 */
    public final void m53257A0(d30 d30Var) {
        this.f34443F = d30Var;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m53258B0(d30 d30Var) {
        this.f34442E = d30Var;
    }

    /* JADX INFO: renamed from: C0 */
    public void m53259C0(d30 d30Var) {
        this.f34445H = d30Var;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m53260D0(g30<PurchaseType, Act, String> g30Var) {
        this.f34485y = g30Var;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m53261E0(g30<PurchaseType, Act, String> g30Var) {
        this.f34484x = g30Var;
    }

    /* JADX INFO: renamed from: F0 */
    public void m53262F0(d30 d30Var) {
        this.f34444G = d30Var;
    }

    /* JADX INFO: renamed from: G0 */
    public void m53263G0(Picture.ImageUri imageUri) {
        this.f34452O = imageUri;
    }

    /* JADX INFO: renamed from: H0 */
    public void m53264H0(String str) {
        this.f34453P = str;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m53265I0(List<wx80> list) {
        this.f34440C = list;
    }

    /* JADX INFO: renamed from: J0 */
    public void m53266J0(boolean z) {
        this.f34446I = z;
    }

    /* JADX INFO: renamed from: K0 */
    public void m53267K0(Object obj) {
        this.f34454Q = obj;
    }

    /* JADX INFO: renamed from: L0 */
    public void m53268L0() {
        Act act = this.f34478r;
        if (act == null || act.isFinishing()) {
            return;
        }
        this.f34450M = new cwf0(new a());
        this.f34482v = hmb.m131712q1();
        m53270M0();
        if (CoreModule.m29935P().m94651a().mo33525jh() && NullChecker.m81303a(this.f34441D.getWindow())) {
            int i = d3c0.f83609I9;
            if (sab0.m182891i(this.f34479s)) {
                i = d3c0.f84014m4;
            }
            this.f34463c.setBackgroundResource(i);
            this.f34441D.getWindow().setBackgroundDrawableResource(d3c0.f83707P9);
            m53277Q();
        }
        PurchaseType purchaseType = this.f34479s;
        if (purchaseType == PurchaseType.TYPE_GET_VIP) {
            qib0.m174815e1("vip_purchase_shown", "showFrom", this.f34483w);
        } else if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            qib0.m174815e1("see_purchase_shown", "showFrom", this.f34483w);
        } else if (purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE) {
            qib0.m174815e1("superlike_purchase_shown", "showFrom", this.f34483w);
        } else if (purchaseType == PurchaseType.TYPE_GET_BOOST) {
            qib0.m174815e1("boost_purchase_shown", "showFrom", this.f34483w);
        }
        m53307s0(true);
        e1b0.INSTANCE.m114403a(this.f34479s);
    }

    /* JADX INFO: renamed from: M */
    public final void m53269M(View view) {
        z2b0.m216878a(this, view);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m53270M0() {
        m53279R();
        m53310v0();
        m53311w0();
        m53282T();
        m53281S();
        this.f34441D.show();
    }

    /* JADX INFO: renamed from: N */
    public void m53271N(Boolean bool) {
        c3m c3mVar = this.f34438A;
        if (c3mVar instanceof rc40) {
            ((rc40) c3mVar).m178766L(bool.booleanValue() ? AgreementComponent.AgreementState.checked : AgreementComponent.AgreementState.unchecked);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m53272N0() {
        if ((this.f34479s == PurchaseType.TYPE_GET_VIP && (CoreModule.f17545c.f19654j0.m30574B4() || CoreModule.f17545c.f19654j0.m30643y4())) || (this.f34479s == PurchaseType.TYPE_GET_LIKERS && CoreModule.f17545c.f19654j0.m30572A4())) {
            Intent intentM80165a2 = WebViewAct.m80165a2(this.f34478r, CoreModule.f17545c.f19654j0.m30576C4().titleText, CoreModule.f17545c.f19654j0.m30576C4().promotionUrl, true);
            intentM80165a2.putExtra("hideNavigationBar", true);
            this.f34478r.startActivity(intentM80165a2);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m53273O() {
        if (m53285W()) {
            this.f34441D.dismiss();
        }
        ura.m195053e().m195057d().mo33659B8().put("");
    }

    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final void m53300l0(List<String> list) {
        this.f34462b.setTextList(list);
        this.f34462b.setTextStillTime(1500L);
        this.f34462b.setAnimTime(1000L);
        this.f34462b.m44313f();
    }

    /* JADX INFO: renamed from: P */
    public void m53275P(boolean z) {
        if (!sab0.m182891i(this.f34479s) || CoreModule.m29935P().m94651a().mo158371f()) {
            this.f34455R = z;
            c3m c3mVar = this.f34438A;
            if (c3mVar instanceof msl) {
                ((msl) c3mVar).mo156151g(z);
                return;
            }
            return;
        }
        this.f34455R = true;
        c3m c3mVar2 = this.f34438A;
        if (c3mVar2 instanceof msl) {
            ((msl) c3mVar2).mo156151g(true);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m53276P0(String str, List<C8765d> list) {
        String str2 = "svipPicksMembership";
        String str3 = "svip";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", w2b0.m201088b(this.f34483w));
            if (sab0.m182905w(this.f34479s)) {
                jSONObject.put("first_carousel_page", iab0.m135152m(this.f34480t));
            }
            ProductCategory productCategory = this.f34479s.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", str);
            if (!TEnum.equals(p2b0.m167133h().m167139g("vip"), "svip")) {
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
            jSONObject.put("default_duration", p2b0.m167133h().m167147p(productCategory));
            String str4 = "no";
            jSONObject.put("if_sale", this.f34451N ? "yes" : "no");
            jSONObject.put("if_discount", this.f34451N);
            boolean z = false;
            jSONObject.put("if_double_tab", false);
            jSONObject.put("function_type", iab0.m135145f(this.f34480t, this.f34483w));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            if (CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30088w3()) {
                str4 = "yes";
            }
            jSONObject.put("no_secret_payment", str4);
            jSONObject.put("user_secret_staus", str4);
            jSONObject.put("ttc_page_type", BannerLoc.popup);
            if (CoreModule.m29935P().m94658i().mo158272N()) {
                if (CoreModule.f17545c.f19639e0.m169464Z7() && !CoreModule.f17545c.f19639e0.m169452W7() && !CoreModule.f17545c.f19639e0.m169506k8()) {
                    z = true;
                }
                jSONObject.put("is_fakeunreal", z);
            }
            CoreModule.m29935P().m94651a().mo33425U();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        this.f34450M.m109039o(jSONObject);
        i0e.m133797f(this.f34450M);
    }

    /* JADX INFO: renamed from: Q */
    public final void m53277Q() {
        List<String> listM44318d = AliFreeUtils.m44318d(this.f34479s);
        m53300l0(listM44318d);
        if (listM44318d.size() == 1) {
            this.f34462b.postDelayed(new Runnable() { // from class: l.m1b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f130821a.m53286X();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m53278Q0(List<C8765d> list) {
        m53276P0(vwb.m200307U(iab0.m135149j(list), Constants.SEPARATOR_COMMA), list);
        qib0.m174815e1("purchase_page_shown", "platform", "android");
    }

    /* JADX INFO: renamed from: R */
    public void m53279R() {
        com.p046p1.mobile.android.app.Dialog dialogM20567z = this.f34478r.dialog().m20517M(m6c0.f131496J2).m20516L((sab0.m182905w(this.f34479s) || sab0.m182901s(this.f34479s) || PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.f34479s) ? y7c0.f196697g : y7c0.f196698h).m20559v().m20494A(new DialogInterface.OnCancelListener() { // from class: l.q1b0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f152121a.m53287Y(dialogInterface);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.s1b0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f161873a.m53288Z(dialogInterface);
            }
        }).m20539i0(new DialogInterface.OnKeyListener() { // from class: l.t1b0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f167303a.m53289a0(dialogInterface, i, keyEvent);
            }
        }).m20515K0(new com.p046p1.mobile.android.app.Dialog.InterfaceC4313i() { // from class: l.u1b0
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4313i
            /* JADX INFO: renamed from: a */
            public final void mo20570a(com.p046p1.mobile.android.app.Dialog dialog) {
                this.f172985a.m53290b0(dialog);
            }
        }).m20566y0(s4e.f162375a).m20567z();
        this.f34441D = dialogM20567z;
        m53269M(dialogM20567z.m20458P());
        this.f34465e = this.f34470j;
        this.f34466f = this.f34471k;
        this.f34467g = this.f34472l;
        this.f34464d = this.f34469i;
        if (sab0.m182899q(this.f34479s)) {
            this.f34464d.setBackgroundColor(f34437X);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m53280R0() {
        if (NullChecker.m81303a(this.f34486z)) {
            this.f34486z.release();
        }
        if (NullChecker.m81303a(this.f34438A)) {
            this.f34438A.release();
        }
        if (NullChecker.m81303a(this.f34439B)) {
            this.f34439B.release();
        }
        if (NullChecker.m81303a(this.f34447J)) {
            this.f34447J.unsubscribe();
            this.f34447J = null;
        }
        if (NullChecker.m81303a(this.f34448K)) {
            this.f34448K.unsubscribe();
            this.f34448K = null;
        }
        mkd0.m154992z(this.f34449L);
    }

    /* JADX INFO: renamed from: S */
    public final void m53281S() {
        ProductCategory productCategory = this.f34479s.productCategory();
        if (CoreModule.m29935P().m94651a().mo33583s3() && TEnum.equals(productCategory, "oDiamond")) {
            CoreModule.f17545c.f19654j0.m30593K5();
            this.f34449L = CoreModule.f17545c.f19654j0.m30592K4().subscribe(mkd0.m154956H(new e30() { // from class: l.k1b0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f120557a.m53291c0((Optional) obj);
                }
            }, new e30() { // from class: l.l1b0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f125629a.m53292d0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m53282T() {
        ProductCategory productCategory = this.f34479s.productCategory();
        if (CoreModule.m29935P().m94651a().mo33507h5() && TEnum.equals(productCategory, "svip")) {
            this.f34448K = C22306c.just(productCategory).flatMap(new w9j() { // from class: l.n1b0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19654j0.m30593K5();
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.o1b0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f141420a.m53293e0((Optional) obj);
                }
            }, new e30() { // from class: l.p1b0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f146665a.m53294f0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m53283U() {
        ((ViewGroup.MarginLayoutParams) this.f34472l.getLayoutParams()).bottomMargin = t100.m186890d(20.0f);
        xdl0.m208360X(this.f34471k, t100.m186890d(6.0f));
    }

    /* JADX INFO: renamed from: V */
    public boolean m53284V() {
        c3m c3mVar = this.f34438A;
        if (c3mVar instanceof rc40) {
            return ((rc40) c3mVar).m178760F();
        }
        return true;
    }

    /* JADX INFO: renamed from: W */
    public boolean m53285W() {
        return NullChecker.m81303a(this.f34441D) && this.f34441D.isShowing();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m53286X() {
        m53309u0(this.f34479s);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m53287Y(DialogInterface dialogInterface) {
        m53280R0();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m53288Z(DialogInterface dialogInterface) {
        CoreModule.m29935P().m94651a().mo33308E9();
        m53280R0();
        i0e.m133796e(this.f34450M);
        if (NullChecker.m81303a(this.f34442E) && this.f34446I) {
            this.f34442E.call();
        }
        m53307s0(false);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ boolean m53289a0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i == 4) {
            this.f34457T.call(0);
            m53272N0();
            if (NullChecker.m81303a(this.f34445H)) {
                this.f34445H.call();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m53290b0(com.p046p1.mobile.android.app.Dialog dialog) {
        this.f34457T.call(0);
        m53272N0();
        if (NullChecker.m81303a(this.f34444G)) {
            this.f34444G.call();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m53291c0(Optional optional) {
        if (optional.isPresent()) {
            RefundDetail refundDetail = (RefundDetail) optional.get();
            ozl ozlVar = this.f34439B;
            if (ozlVar instanceof de60) {
                ((de60) ozlVar).m111170s0(refundDetail.totalRefundAmount);
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m53292d0(Throwable th) {
        ozl ozlVar = this.f34439B;
        if (ozlVar instanceof de60) {
            ((de60) ozlVar).m111170s0(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m53293e0(Optional optional) {
        if (optional.isPresent()) {
            double d2 = ((RefundDetail) optional.get()).totalRefundAmount;
            if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                ozl ozlVar = this.f34439B;
                if (ozlVar instanceof de60) {
                    ((de60) ozlVar).m111172t0(d2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m53294f0(Throwable th) {
        ozl ozlVar = this.f34439B;
        if (ozlVar instanceof de60) {
            ((de60) ozlVar).m111172t0(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m53295g0(Integer num) {
        if (NullChecker.m81303a(this.f34441D)) {
            if (num.intValue() == -1) {
                this.f34441D.hide();
                return;
            }
            if (num.intValue() == 0 || num.intValue() == 2) {
                if (num.intValue() == 2) {
                    m53266J0(false);
                }
                this.f34441D.dismiss();
            } else if (num.intValue() == 1) {
                this.f34441D.show();
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m53296h0(C8765d c8765d) {
        if (NullChecker.m81303a(this.f34486z)) {
            this.f34486z.mo155368b(c8765d);
        }
        if (NullChecker.m81303a(this.f34439B)) {
            this.f34439B.mo111147b(c8765d);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m53297i0(C8765d c8765d) {
        ozl ozlVar = this.f34439B;
        if (ozlVar instanceof lej) {
            ((lej) ozlVar).m149559C0();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m53298j0(PayMethod payMethod) {
        this.f34456S = payMethod;
        if (NullChecker.m81303a(this.f34438A)) {
            this.f34438A.mo105095e(payMethod);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m53299k0(boolean z, boolean z2) {
        if (z2 || this.f34479s != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return;
        }
        lsi0.m151578h(R$string.f27281R3);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m53301m0(View view) {
        ozl ozlVar = this.f34439B;
        if ((ozlVar instanceof lej) && !NullChecker.m81303a(((lej) ozlVar).f85759x)) {
            igj.m136008L().subscribe(mkd0.m154950B());
        }
        this.f34441D.dismiss();
        m53272N0();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ C22306c m53302n0(List list) {
        return igj.m136009M(this.f34478r, list);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C22306c m53304p0(List list) {
        return igj.m136009M(this.f34478r, list);
    }

    /* JADX INFO: renamed from: r0 */
    public void m53306r0() {
        c3m c3mVar = this.f34438A;
        if (c3mVar instanceof rc40) {
            ((rc40) c3mVar).m178772R();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m53307s0(boolean z) {
        if (z) {
            j2b0.m139417a().m139420d(this.f34441D);
        } else {
            j2b0.m139417a().m139419c(this.f34441D);
        }
    }

    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m53305q0(ProductCategory productCategory, List<Merchandise> list) {
        boolean zM81303a = NullChecker.m81303a(vwb.m200346r(list, new w9j() { // from class: l.x1b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(rxa0.m181493n((Merchandise) obj));
            }
        }));
        this.f34451N = zM81303a;
        this.f34439B.mo111155g(zM81303a);
        List<C8765d> listMo107333a = cjy.m107330z(productCategory).mo107333a(this.f34478r, this.f34479s, productCategory, list);
        c3m c3mVarM148278c = l2b0.m148278c(this.f34478r, this.f34479s, this.f34483w, this.f34456S);
        this.f34438A = c3mVarM148278c;
        View viewMo105092a = c3mVarM148278c.mo105092a(this.f34466f, this.f34482v);
        if (NullChecker.m81303a(this.f34461a)) {
            c3m c3mVar = this.f34438A;
            if (c3mVar instanceof mp0) {
                ((mp0) c3mVar).mo135413d();
                throw null;
            }
            if (c3mVar instanceof rc40) {
                this.f34461a.addView(((rc40) c3mVar).m178759E(false));
            }
        }
        if (NullChecker.m81303a(viewMo105092a)) {
            c3m c3mVar2 = this.f34438A;
            if (c3mVar2 instanceof id40) {
                int i = t100.f167260i;
                ((id40) c3mVar2).m135414d0(i);
                ((id40) this.f34438A).m135416f0(i);
                ((id40) this.f34438A).m135412c0(0);
                ((id40) this.f34438A).m155738H(new mp0.InterfaceC18522a() { // from class: l.y1b0
                    @Override // p149l.mp0.InterfaceC18522a
                    /* JADX INFO: renamed from: a */
                    public final void mo106044a(boolean z, boolean z2) {
                        this.f195399a.m53299k0(z, z2);
                    }
                });
            }
            ozl ozlVar = this.f34439B;
            if (ozlVar instanceof de60) {
                ((de60) ozlVar).m111163l0(new b());
            }
            c3m c3mVar3 = this.f34438A;
            boolean z = c3mVar3 instanceof id40;
            e30<C8765d> e30Var = this.f34458U;
            if (z) {
                c3mVar3.mo105096f(listMo107333a, e30Var, this.f34457T, this.f34459V);
            } else {
                c3mVar3.mo105097h(listMo107333a, e30Var, this.f34457T);
            }
            this.f34466f.addView(viewMo105092a, new LinearLayout.LayoutParams(-1, -2));
        }
        c3m c3mVar4 = this.f34438A;
        if (c3mVar4 instanceof msl) {
            ((msl) c3mVar4).mo156151g(this.f34455R);
        }
        c3m c3mVar5 = this.f34438A;
        if (c3mVar5 instanceof rc40) {
            ((rc40) c3mVar5).m178761G(true);
        }
        m53278Q0(listMo107333a);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m53309u0(PurchaseType purchaseType) {
        final List<String> listM44318d = AliFreeUtils.m44318d(purchaseType);
        this.f34462b.m44314g();
        this.f34462b.post(new Runnable() { // from class: l.w1b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f183986a.m53300l0(listM44318d);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m53310v0() {
        Privilege privilege = this.f34480t;
        Privilege privilege2 = Privilege.intl_no_ad;
        Act act = this.f34478r;
        if (privilege == privilege2) {
            this.f34486z = new oej(act, this.f34479s, this.f34483w, true, privilege);
        } else {
            this.f34486z = l2b0.m148277b(act, this.f34479s, this.f34483w, this.f34481u, true);
        }
        View viewMo155367a = this.f34486z.mo155367a(this.f34465e, this.f34482v);
        if (NullChecker.m81303a(viewMo155367a)) {
            this.f34486z.mo155369c(this.f34440C);
            this.f34465e.addView(viewMo155367a, new LinearLayout.LayoutParams(-1, -2));
            r0m r0mVar = this.f34486z;
            if (r0mVar instanceof mmd0) {
                ((mmd0) r0mVar).m155371g();
            }
        }
        ozl ozlVarM148276a = l2b0.m148276a(this.f34478r, this.f34479s, this.f34483w);
        this.f34439B = ozlVarM148276a;
        if (ozlVarM148276a instanceof lej) {
            ((lej) ozlVarM148276a).mo111158h0(this.f34480t);
            ((lej) this.f34439B).m111168q0(this.f34454Q);
        } else if (ozlVarM148276a instanceof de60) {
            ((de60) ozlVarM148276a).mo111158h0(this.f34480t);
            ((de60) this.f34439B).m111164m0(this.f34453P);
            ((de60) this.f34439B).m111168q0(this.f34454Q);
            ((de60) this.f34439B).m111166o0(this);
        }
        View viewMo111145a = this.f34439B.mo111145a(this.f34467g, this.f34482v);
        if (NullChecker.m81303a(viewMo111145a)) {
            ozl ozlVar = this.f34439B;
            if (ozlVar instanceof de60) {
                ((de60) ozlVar).m111162k0(this.f34484x);
                ((de60) this.f34439B).m111161j0(this.f34485y);
                ((de60) this.f34439B).m111165n0(this.f34460W);
            }
            this.f34439B.mo111149c(this.f34483w);
            this.f34439B.mo111159i(this.f34457T);
            this.f34467g.addView(viewMo111145a, new LinearLayout.LayoutParams(-1, -2));
        }
        if (sab0.m182905w(this.f34479s) || sab0.m182901s(this.f34479s) || PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.f34479s) {
            m53283U();
            int i = c.f34489a[this.f34479s.ordinal()];
            if (i == 1) {
                this.f34469i.setBackgroundResource(d3c0.f83698P0);
                this.f34476p.setImageResource(d3c0.f83766U2);
            } else if (i != 2) {
                LinearLayout linearLayout = this.f34469i;
                if (i != 3) {
                    linearLayout.setBackgroundResource(d3c0.f83569Fb);
                    this.f34476p.setImageResource(d3c0.f83766U2);
                } else {
                    linearLayout.setBackgroundResource(d3c0.f83684O0);
                    this.f34476p.setImageResource(d3c0.f83885d1);
                }
            } else {
                this.f34469i.setBackgroundResource(d3c0.f83670N0);
                this.f34476p.setImageResource(d3c0.f83766U2);
            }
            xdl0.m208344M(this.f34473m, true);
            TextView textView = this.f34475o;
            Act act2 = this.f34478r;
            textView.setText(n6a.m158029q0(act2, act2.getString(IntlCountryCodeController.m28115k() ? R$string.f27439f2 : R$string.f27345X1, this.f34478r.string(R$string.f27463h2), this.f34478r.string(R$string.f27328V6)), this.f34478r.string(R$string.f27463h2), juk.m143328j(), this.f34478r.string(R$string.f27328V6), juk.m143327i()));
            this.f34475o.setMovementMethod(LinkMovementMethod.getInstance());
            this.f34474n.setText(R$string.f27165G8);
            this.f34475o.setLineSpacing(0.0f, 1.0f);
            xdl0.m208360X(this.f34475o, 0);
            this.f34476p.setOnClickListener(new View.OnClickListener() { // from class: l.j1b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f115780a.m53301m0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m53311w0() {
        final ProductCategory productCategory = this.f34479s.productCategory();
        if (cjy.m107301G(productCategory.toString())) {
            this.f34447J = mkd0.m154984r(CoreModule.f17545c.f19654j0.m30644y5(productCategory), CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial)), new x9j() { // from class: l.b2b0
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return C8761b.m53240j((List) obj, (List) obj2);
                }
            }).filter(new w9j() { // from class: l.c2b0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    List list = (List) obj;
                    return Boolean.valueOf((list == null || list.isEmpty()) ? false : true);
                }
            }).flatMap(new w9j() { // from class: l.d2b0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f83344a.m53302n0((List) obj);
                }
            }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.e2b0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f88909a.m53303o0(productCategory, (List) obj);
                }
            }));
        } else {
            this.f34447J = C22306c.just(productCategory).flatMap(new w9j() { // from class: l.f2b0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19654j0.m30644y5((ProductCategory) obj);
                }
            }).filter(new w9j() { // from class: l.g2b0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).flatMap(new w9j() { // from class: l.h1b0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f105294a.m53304p0((List) obj);
                }
            }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.i1b0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f110436a.m53305q0(productCategory, (List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m53312x0(int i) {
        this.f34477q = i;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m53313y0(Privilege privilege, boolean z) {
        this.f34480t = privilege;
        this.f34481u = z;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m53314z0(String str) {
        this.f34483w = str;
    }
}
