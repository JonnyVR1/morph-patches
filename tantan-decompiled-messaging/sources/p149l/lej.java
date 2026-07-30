package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4729a0;
import com.p046p1.mobile.putong.core.data.IntlWebPayPaymentData;
import com.p046p1.mobile.putong.core.data.IntlWebPayPaymentEnvelope;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.NativeConfig;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class lej extends de60 {

    /* JADX INFO: renamed from: R */
    public VFrame f127688R;

    /* JADX INFO: renamed from: S */
    public VText f127689S;

    /* JADX INFO: renamed from: T */
    public VFrame f127690T;

    /* JADX INFO: renamed from: U */
    public VText f127691U;

    /* JADX INFO: renamed from: V */
    public VText f127692V;

    /* JADX INFO: renamed from: W */
    public TextView f127693W;

    /* JADX INFO: renamed from: X */
    public Privilege f127694X;

    /* JADX INFO: renamed from: Y */
    public boolean f127695Y;

    /* JADX INFO: renamed from: Z */
    public boolean f127696Z;

    /* JADX INFO: renamed from: a0 */
    public String f127697a0;

    /* JADX INFO: renamed from: b0 */
    public final String f127698b0;

    /* JADX INFO: renamed from: c0 */
    public e30 f127699c0;

    /* JADX INFO: renamed from: d0 */
    public View.OnClickListener f127700d0;

    /* JADX INFO: renamed from: e0 */
    public View.OnClickListener f127701e0;

    /* JADX INFO: renamed from: l.lej$a */
    public static class C18204a extends qlw {

        /* JADX INFO: renamed from: e */
        public final C8765d.a f127702e;

        /* JADX INFO: renamed from: f */
        public final String f127703f;

        /* JADX INFO: renamed from: g */
        public final Merchandise f127704g;

        public C18204a(Act act, PurchaseType purchaseType, C8765d.a aVar, String str) {
            super(act, purchaseType);
            this.f127702e = aVar;
            this.f127703f = str;
            this.f127704g = aVar.m53601s();
        }

        /* JADX INFO: renamed from: A */
        private void m149566A() {
            if (this.f127704g == null || !CoreModule.m29935P().m94651a().mo33442Xi()) {
                return;
            }
            boolean zM129476i = h6a.m129476i();
            Merchandise merchandise = this.f127704g;
            if (zM129476i) {
                if (merchandise.monthly()) {
                    ogj.m164200c().f143865b.onNext(0);
                    return;
                } else if (this.f127704g.quarterly()) {
                    ogj.m164200c().f143865b.onNext(1);
                    return;
                } else {
                    if (this.f127704g.yearly()) {
                        ogj.m164200c().f143865b.onNext(2);
                        return;
                    }
                    return;
                }
            }
            if (merchandise.monthly()) {
                ogj.m164200c().f143865b.onNext(2);
            } else if (this.f127704g.quarterly()) {
                ogj.m164200c().f143865b.onNext(1);
            } else if (this.f127704g.yearly()) {
                ogj.m164200c().f143865b.onNext(0);
            }
        }

        @Override // p149l.qlw, p149l.ue50
        /* JADX INFO: renamed from: a */
        public void mo30845a() {
            m149566A();
            super.mo30845a();
        }

        @Override // p149l.qlw, p149l.ue50
        /* JADX INFO: renamed from: c */
        public void mo30846c() {
            m149566A();
            super.mo30846c();
        }

        @Override // p149l.qlw
        /* JADX INFO: renamed from: x */
        public Object[] mo111721x() {
            try {
                if (NullChecker.m81303a(this.f127702e.m53601s())) {
                    Prices prices = this.f127702e.m53601s().defaultStockKeepUnit.prices;
                    return new Object[]{FirebaseAnalytics.Param.CURRENCY, prices.currencyCode, "value", Double.valueOf(prices.price), "skuID", this.f127703f, "platform", "android"};
                }
            } catch (Throwable th) {
                CrashHelper.m81296c(new IllegalStateException("Failed to generate payment params", th));
            }
            return qlw.f155260d;
        }
    }

    public lej(Act act, PurchaseType purchaseType) {
        super(act, purchaseType);
        this.f127695Y = false;
        this.f127696Z = false;
        this.f127698b0 = lej.class.getSimpleName();
        this.f127700d0 = new View.OnClickListener() { // from class: l.hej
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107373a.m149560D0(view);
            }
        };
        this.f127701e0 = new View.OnClickListener() { // from class: l.iej
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112807a.m149548E0(view);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX INFO: renamed from: B0 */
    private CharSequence m149547B0() {
        int i;
        int i2;
        if (sab0.m182905w(this.f85753r)) {
            return (CoreModule.f17545c.f19639e0.m169527p9().isVIP() || CoreModule.f17545c.f19639e0.m169527p9().isVIPExpired()) ? this.f85752q.string(R$string.f27600s9) : this.f85752q.string(R$string.f27578q9);
        }
        PurchaseType purchaseType = PurchaseType.TYPE_GET_BOOST;
        PurchaseType purchaseType2 = this.f85753r;
        if (purchaseType == purchaseType2) {
            return this.f85752q.string(R$string.f27144E9);
        }
        if (PurchaseType.TYPE_GET_VIP_SUPERLIKE == purchaseType2) {
            return this.f85752q.string(R$string.f27458g9);
        }
        if (!sab0.m182901s(purchaseType2)) {
            if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE != this.f85753r) {
                return null;
            }
            this.f127692V.setTextColor(this.f85752q.getResources().getColor(b1c0.f72513C));
            boolean zM210073f4 = xma.m210073f4();
            Act act = this.f85752q;
            return zM210073f4 ? act.string(R$string.f27408c7) : act.string(R$string.f27396b7);
        }
        int i3 = R$string.f27375Z9;
        if (this.f127694X != Privilege.intl_visitor) {
            if (CoreModule.f17545c.f19672p0.m173362j3()) {
                i2 = R$string.f27133D9;
            } else {
                i = i3;
                i2 = R$string.f27100A9;
            }
            if (CoreModule.m29935P().m94651a().mo158204B()) {
                i = R$string.f27638w3;
                i2 = R$string.f27627v3;
            }
            long jMo33293Bn = CoreModule.m29935P().m94651a().mo33293Bn();
            Act act2 = this.f85752q;
            return jMo33293Bn != 0 ? act2.string(i) : act2.string(i2);
        }
        i2 = R$string.f27148F2;
        i = i2;
        if (CoreModule.m29935P().m94651a().mo158204B()) {
            i = R$string.f27638w3;
            i2 = R$string.f27627v3;
        }
        long jMo33293Bn2 = CoreModule.m29935P().m94651a().mo33293Bn();
        Act act3 = this.f85752q;
        if (jMo33293Bn2 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m149548E0(View view) {
        String str;
        if (!this.f127696Z) {
            kkp0.m146350c(this.f85752q, "p_purchase_page");
            return;
        }
        String str2 = "";
        if (NullChecker.m81303a(this.f85759x)) {
            boolean zM53531m = this.f85759x.m53531m();
            C8765d c8765d = this.f85759x;
            Merchandise merchandiseM53601s = (zM53531m ? c8765d.m53520b() : c8765d.m53522d()).m53601s();
            if (NullChecker.m81303a(merchandiseM53601s)) {
                str = merchandiseM53601s.quantity + "";
            } else {
                str = "1";
            }
        } else {
            str = "1";
        }
        ProductCategory productCategory = this.f85753r.productCategory();
        if (TEnum.equals(productCategory, ProductCategory.tttSeeWhoLikedMe)) {
            str2 = "see";
        } else if (TEnum.equals(productCategory, ProductCategory.tttVip)) {
            str2 = "vip";
        } else if (TEnum.equals(productCategory, ProductCategory.tttSvipGoogleplay)) {
            str2 = "svip";
        }
        m149551L0(str2, str);
    }

    /* JADX INFO: renamed from: J0 */
    private void m149549J0(C8765d.a aVar) {
        boolean zM149558A0 = m149558A0();
        VText vText = this.f127692V;
        if (!zM149558A0) {
            xdl0.m208344M(vText, false);
            this.f127689S.setText(this.f127697a0);
            return;
        }
        xdl0.m208344M(vText, true);
        String str = String.format("%s %s", aVar.m53601s().defaultStockKeepUnit.prices.currencySymbol, t0g0.m186861b((aVar.m53601s().defaultStockKeepUnit.prices.price / ((double) aVar.m53605w())) * 0.8500000238418579d));
        boolean zM28115k = IntlCountryCodeController.m28115k();
        VText vText2 = this.f127692V;
        if (zM28115k) {
            vText2.setText(R$string.f27313U2);
        } else {
            vText2.setText("Google Pay");
        }
        String strM115674o3 = CoreModule.f17545c.f19620X1.m115674o3();
        boolean zIsEmpty = TextUtils.isEmpty(strM115674o3);
        VText vText3 = this.f127689S;
        if (zIsEmpty) {
            boolean z = this.f127696Z;
            Act act = this.f85752q;
            vText3.setText(z ? act.getString(R$string.f27127D3) : act.getString(R$string.f27116C3, "15%", str));
        } else {
            vText3.setText(strM115674o3);
        }
        if (this.f127696Z) {
            zvf0.m220368A("e_purchase_button_web", "p_purchase_page", vwb.m200311Y("productType", this.f85753r.productCategory().toString()));
        } else {
            zvf0.m220402x("e_web_purchase", "p_purchase_page");
        }
    }

    /* JADX INFO: renamed from: K0 */
    private void m149550K0(String str) {
        PurchaseType purchaseType = this.f85753r;
        if (purchaseType == PurchaseType.TYPE_GET_VIP) {
            qib0.m174815e1("vip_purchase_click", "showFrom", this.f85755t, "skuID", str);
            return;
        }
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            qib0.m174815e1("see_purchase_click", "showFrom", this.f85755t, "skuID", str);
        } else if (purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE) {
            qib0.m174815e1("superlike_purchase_click", "showFrom", this.f85755t, "skuID", str);
        } else if (purchaseType == PurchaseType.TYPE_GET_BOOST) {
            qib0.m174815e1("boost_purchase_click", "showFrom", this.f85755t, "skuID", str);
        }
    }

    /* JADX INFO: renamed from: L0 */
    private void m149551L0(String str, String str2) {
        final String strM164285f = ogw.m164285f(CoreModule.m29931H().userId() + mqi0.m155944o(), true);
        zvf0.m220399u("e_purchase_button_web", "p_purchase_page", vwb.m200311Y("productType", str), vwb.m200311Y("default_duration", str2 + "m"), vwb.m200311Y("tracker", strM164285f));
        boolean zM115676q3 = CoreModule.f17545c.f19620X1.m115676q3();
        Act act = this.f85752q;
        if (!zM115676q3) {
            kkp0.m146348a(act, CoreModule.f17545c.f19620X1.f90485V.thirdPartConfig.thirdPartLandPage, str, str2, strM164285f);
            return;
        }
        act.progress(R$string.f27301T1);
        Act act2 = this.f85752q;
        ec9 ec9Var = CoreModule.f17545c.f19620X1;
        act2.duringCreated(ec9Var.m115670k3(ec9Var.m115672m3(), str, str2)).subscribe(mkd0.m154959K(new e30() { // from class: l.jej
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117579a.m149561F0(strM164285f, (IntlWebPayPaymentEnvelope) obj);
            }
        }, new e30() { // from class: l.kej
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122717a.m149562G0((Throwable) obj);
            }
        }, false));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX INFO: renamed from: M0 */
    private void m149552M0() {
        boolean z;
        if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.f85753r || !CoreModule.f17545c.f19639e0.f149262S0.get().booleanValue()) {
            z = false;
        } else {
            ec9 ec9Var = CoreModule.f17545c.f19620X1;
            if (!ec9Var.f90481R || ec9Var.f90486W.contains(String.valueOf(qib0.f154717f0))) {
                z = false;
            } else {
                z = true;
            }
        }
        this.f127695Y = z;
        this.f127696Z = CoreModule.f17545c.f19620X1.m115675p3();
    }

    /* JADX INFO: renamed from: u */
    private void m149553u() {
        NativeConfig nativeConfigM115672m3 = CoreModule.f17545c.f19620X1.m115672m3();
        if (!this.f127696Z || !NullChecker.m81303a(nativeConfigM115672m3) || !NullChecker.m81303a(nativeConfigM115672m3.btnBgColor)) {
            int i = d3c0.f83871c1;
            if (sab0.m182883a(this.f85753r)) {
                i = sab0.m182901s(this.f85753r) ? d3c0.f83843a1 : d3c0.f83857b1;
            }
            this.f127688R.setBackgroundDrawable(this.f85752q.drawable(i));
            return;
        }
        try {
            this.f127688R.setBackground(fce.m120425b(Color.parseColor(nativeConfigM115672m3.btnBgColor), t100.f167260i));
            if (TextUtils.isEmpty(nativeConfigM115672m3.btnTextColor)) {
                return;
            }
            this.f127689S.setTextColor(Color.parseColor(nativeConfigM115672m3.btnTextColor));
        } catch (Exception e) {
            e.toString();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m149558A0() {
        if (IntlCountryCodeController.m28124t()) {
            return false;
        }
        return this.f127695Y || this.f127696Z;
    }

    /* JADX INFO: renamed from: C0 */
    public void m149559C0() {
        this.f127700d0.onClick(this.f127688R);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m149560D0(View view) {
        if (!NullChecker.m81303a(this.f85759x)) {
            if (NullChecker.m81303a(this.f127699c0)) {
                igj.m136008L().subscribe(mkd0.m154950B());
                this.f127699c0.call(0);
                return;
            }
            return;
        }
        boolean zM53531m = this.f85759x.m53531m();
        C8765d c8765d = this.f85759x;
        C8765d.a aVarM53520b = zM53531m ? c8765d.m53520b() : c8765d.m53522d();
        if (NullChecker.m81303a(aVarM53520b) && NullChecker.m81303a(aVarM53520b.m53601s())) {
            String productId = aVarM53520b.m53601s().defaultStockKeepUnit.affiliateProducts.getProductId();
            m149564I0(aVarM53520b.m53601s().autoRenewable(), productId, this.f127699c0, aVarM53520b);
            m149550K0(productId);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m149561F0(String str, IntlWebPayPaymentEnvelope intlWebPayPaymentEnvelope) {
        this.f85752q.progressDismiss();
        if (NullChecker.m81303a(intlWebPayPaymentEnvelope.data)) {
            Act act = this.f85752q;
            String str2 = "tantan://intlNativeRecharge?url=" + intlWebPayPaymentEnvelope.data.paymentRequest;
            String strM115680u3 = CoreModule.f17545c.f19620X1.m115680u3();
            IntlWebPayPaymentData intlWebPayPaymentData = intlWebPayPaymentEnvelope.data;
            kkp0.m146349b(act, str2, str, strM115680u3, intlWebPayPaymentData.hideNavigationBar, intlWebPayPaymentData.hardwareAccelerated, intlWebPayPaymentData.isUseMkWebView);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m149562G0(Throwable th) {
        this.f85752q.progressDismiss();
        th.getMessage();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m149563H0(String str, double d, String str2, String str3) {
        zvf0.m220399u("e_purchase_button", "p_purchase_page", vwb.m200311Y("platform", "googleplay"), vwb.m200311Y("productType", str3), vwb.m200311Y("skuID", str), vwb.m200311Y("purchaseShowFrom", w2b0.m201088b(this.f85755t)), vwb.m200311Y("first_carousel_page", iab0.m135152m(this.f127694X)), vwb.m200311Y(FirebaseAnalytics.Param.PRICE, Double.valueOf(d)), vwb.m200311Y("currency_code", str2));
    }

    /* JADX INFO: renamed from: I0 */
    public final void m149564I0(boolean z, String str, e30<Integer> e30Var, C8765d.a aVar) {
        lej lejVar;
        double d;
        String str2;
        try {
            String str3 = "";
            if (NullChecker.m81303a(aVar.m53601s())) {
                Prices prices = aVar.m53601s().defaultStockKeepUnit.prices;
                String str4 = prices.currencyCode;
                d = prices.price;
                str3 = aVar.m53601s().defaultStockKeepUnit.f20507id;
                str2 = str4;
            } else {
                d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                str2 = null;
            }
            lejVar = this;
            try {
                lejVar.m149563H0(str3, d, str2, aVar.m53579f().name());
                if (NullChecker.m81303a(str2)) {
                    qib0.m174815e1("purchase_button_click", FirebaseAnalytics.Param.CURRENCY, str2, "platform", "android");
                }
            } catch (Throwable th) {
                th = th;
                CrashHelper.m81296c(new IllegalStateException("Failed to generate payment params", th));
            }
        } catch (Throwable th2) {
            th = th2;
            lejVar = this;
        }
        hqo hqoVar = new hqo(lejVar.f85752q, lejVar.f85753r);
        hqoVar.m132480u(lejVar.f85720B);
        hqoVar.m132479t(new C18204a(lejVar.f85752q, lejVar.f85753r, aVar, str));
        boolean zM182901s = sab0.m182901s(lejVar.f85753r);
        if (zM182901s) {
            hqoVar.m132478s(e30Var);
            hqoVar.m132477r(true);
        }
        if (CoreModule.m29935P().m94651a().mo33442Xi() && lejVar.f85753r == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && !ogj.m164200c().f143866c.get().isEmpty()) {
            Act act = lejVar.f85752q;
            hqoVar.m132476q(aqo.m98316h(act, act instanceof PutongAct ? ((PutongAct) act).iap().m148933i() : null), z, ogj.m164200c().f143867d.get(), ogj.m164200c().m164201a(lejVar.f85753r));
        } else {
            Act act2 = lejVar.f85752q;
            hqoVar.m132475p(aqo.m98316h(act2, act2 instanceof PutongAct ? ((PutongAct) act2).iap().m148933i() : null), z, str);
        }
        if (zM182901s) {
            return;
        }
        e30Var.call(0);
    }

    @Override // p149l.de60, p149l.ozl
    /* JADX INFO: renamed from: a */
    public View mo111145a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f85752q.inflater().inflate(m6c0.f131536T2, viewGroup, false);
        m149565z0(viewInflate);
        if (!ura.m195053e().m195057d().mo33659B8().get().isEmpty()) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(ura.m195053e().m195057d().mo33659B8().get());
            if (userM169430Pa == null || userM169430Pa.isFemale()) {
                this.f127697a0 = this.f85752q.getString(R$string.f27568q);
            } else {
                this.f127697a0 = this.f85752q.getString(R$string.f27579r);
            }
        } else if (C4729a0.m31387j().f19526e.get().booleanValue()) {
            this.f127697a0 = this.f85752q.getString(R$string.f27475i2);
        } else {
            this.f127697a0 = m149547B0().toString();
        }
        m149552M0();
        xdl0.m208344M(this.f127692V, false);
        this.f127689S.setText(this.f127697a0);
        m149553u();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f127688R.getLayoutParams();
        layoutParams.bottomMargin = t100.m186890d(12.0f);
        this.f127688R.setLayoutParams(layoutParams);
        return viewInflate;
    }

    @Override // p149l.de60, p149l.ozl
    /* JADX INFO: renamed from: b */
    public void mo111147b(C8765d c8765d) {
        super.mo111147b(c8765d);
        boolean zM53531m = this.f85759x.m53531m();
        C8765d c8765d2 = this.f85759x;
        m149549J0(zM53531m ? c8765d2.m53520b() : c8765d2.m53522d());
    }

    @Override // p149l.de60
    /* JADX INFO: renamed from: c0 */
    public void mo111150c0(View.OnClickListener onClickListener) {
        if (NullChecker.m81303a(this.f127693W)) {
            this.f127693W.setTextColor(hvc0.m133154a(sab0.m182899q(this.f85753r) ? b1c0.f72513C : b1c0.f72569q));
            xdl0.m208344M(this.f127693W, true);
            xdl0.m208329E0(this.f127693W, onClickListener);
        }
    }

    @Override // p149l.de60
    /* JADX INFO: renamed from: g0 */
    public void mo111156g0(C8765d c8765d) {
        C8765d c8765d2;
        C8765d.a aVarM53520b = c8765d.m53531m() ? c8765d.m53520b() : c8765d.m53522d();
        boolean z = c8765d.f34529k && (c8765d2 = this.f85759x) != null && c8765d2 != c8765d && NullChecker.m81303a(aVarM53520b) && TextUtils.equals(aVarM53520b.m53579f().toString(), ProductCategory.tttSeeWhoLikedMe);
        super.mo111156g0(c8765d);
        if (z) {
            m149559C0();
        }
    }

    @Override // p149l.de60
    /* JADX INFO: renamed from: h0 */
    public void mo111158h0(Privilege privilege) {
        this.f127694X = privilege;
    }

    @Override // p149l.de60, p149l.ozl
    /* JADX INFO: renamed from: i */
    public void mo111159i(e30<Integer> e30Var) {
        this.f127699c0 = e30Var;
        xdl0.m208329E0(this.f127688R, m149558A0() ? this.f127701e0 : this.f127700d0);
        xdl0.m208329E0(this.f127692V, this.f127700d0);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m149565z0(View view) {
        mej.m154224a(this, view);
    }

    @Override // p149l.de60, p149l.ozl
    public void release() {
    }
}
