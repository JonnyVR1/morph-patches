package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4880a0;
import com.p051p1.mobile.putong.core.data.IntlWebPayPaymentData;
import com.p051p1.mobile.putong.core.data.IntlWebPayPaymentEnvelope;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.NativeConfig;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class fhj extends im60 {

    /* JADX INFO: renamed from: R */
    public VFrame f99057R;

    /* JADX INFO: renamed from: S */
    public VText f99058S;

    /* JADX INFO: renamed from: T */
    public VFrame f99059T;

    /* JADX INFO: renamed from: U */
    public VText f99060U;

    /* JADX INFO: renamed from: V */
    public VText f99061V;

    /* JADX INFO: renamed from: W */
    public TextView f99062W;

    /* JADX INFO: renamed from: X */
    public Privilege f99063X;

    /* JADX INFO: renamed from: Y */
    public boolean f99064Y;

    /* JADX INFO: renamed from: Z */
    public boolean f99065Z;

    /* JADX INFO: renamed from: a0 */
    public String f99066a0;

    /* JADX INFO: renamed from: b0 */
    public final String f99067b0;

    /* JADX INFO: renamed from: c0 */
    public y20 f99068c0;

    /* JADX INFO: renamed from: d0 */
    public View.OnClickListener f99069d0;

    /* JADX INFO: renamed from: e0 */
    public View.OnClickListener f99070e0;

    /* JADX INFO: renamed from: l.fhj$a */
    public static class C16976a extends pow {

        /* JADX INFO: renamed from: e */
        public final C8928d.a f99071e;

        /* JADX INFO: renamed from: f */
        public final String f99072f;

        /* JADX INFO: renamed from: g */
        public final Merchandise f99073g;

        public C16976a(Act act, PurchaseType purchaseType, C8928d.a aVar, String str) {
            super(act, purchaseType);
            this.f99071e = aVar;
            this.f99072f = str;
            this.f99073g = aVar.m54784s();
        }

        /* JADX INFO: renamed from: A */
        private void m125580A() {
            if (this.f99073g == null || !CoreModule.m30933P().m143405a().mo34445Xi()) {
                return;
            }
            boolean zM189553i = t7a.m189553i();
            Merchandise merchandise = this.f99073g;
            if (zM189553i) {
                if (merchandise.monthly()) {
                    ijj.m140191c().f115232b.onNext(0);
                    return;
                } else if (this.f99073g.quarterly()) {
                    ijj.m140191c().f115232b.onNext(1);
                    return;
                } else {
                    if (this.f99073g.yearly()) {
                        ijj.m140191c().f115232b.onNext(2);
                        return;
                    }
                    return;
                }
            }
            if (merchandise.monthly()) {
                ijj.m140191c().f115232b.onNext(2);
            } else if (this.f99073g.quarterly()) {
                ijj.m140191c().f115232b.onNext(1);
            } else if (this.f99073g.yearly()) {
                ijj.m140191c().f115232b.onNext(0);
            }
        }

        @Override // p153l.pow, p153l.bn50
        /* JADX INFO: renamed from: a */
        public void mo31848a() {
            m125580A();
            super.mo31848a();
        }

        @Override // p153l.pow, p153l.bn50
        /* JADX INFO: renamed from: c */
        public void mo31849c() {
            m125580A();
            super.mo31849c();
        }

        @Override // p153l.pow
        /* JADX INFO: renamed from: x */
        public Object[] mo115948x() {
            try {
                if (NullChecker.m82486a(this.f99071e.m54784s())) {
                    Prices prices = this.f99071e.m54784s().defaultStockKeepUnit.prices;
                    return new Object[]{FirebaseAnalytics.Param.CURRENCY, prices.currencyCode, "value", Double.valueOf(prices.price), "skuID", this.f99072f, "platform", "android"};
                }
            } catch (Throwable th) {
                CrashHelper.m82479c(new IllegalStateException("Failed to generate payment params", th));
            }
            return pow.f153437d;
        }
    }

    public fhj(Act act, PurchaseType purchaseType) {
        super(act, purchaseType);
        this.f99064Y = false;
        this.f99065Z = false;
        this.f99067b0 = fhj.class.getSimpleName();
        this.f99069d0 = new View.OnClickListener() { // from class: l.bhj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76790a.m125574D0(view);
            }
        };
        this.f99070e0 = new View.OnClickListener() { // from class: l.chj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81841a.m125562E0(view);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX INFO: renamed from: B0 */
    private CharSequence m125561B0() {
        int i;
        int i2;
        if (wib0.m206579w(this.f115695r)) {
            return (CoreModule.f18264c.f20381e0.m116600p9().isVIP() || CoreModule.f18264c.f20381e0.m116600p9().isVIPExpired()) ? this.f115694q.string(R$string.f28448s9) : this.f115694q.string(R$string.f28426q9);
        }
        PurchaseType purchaseType = PurchaseType.TYPE_GET_BOOST;
        PurchaseType purchaseType2 = this.f115695r;
        if (purchaseType == purchaseType2) {
            return this.f115694q.string(R$string.f27992E9);
        }
        if (PurchaseType.TYPE_GET_VIP_SUPERLIKE == purchaseType2) {
            return this.f115694q.string(R$string.f28306g9);
        }
        if (!wib0.m206575s(purchaseType2)) {
            if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE != this.f115695r) {
                return null;
            }
            this.f99061V.setTextColor(this.f115694q.getResources().getColor(h9c0.f108333C));
            boolean zM146388g4 = joa.m146388g4();
            Act act = this.f115694q;
            return zM146388g4 ? act.string(R$string.f28256c7) : act.string(R$string.f28244b7);
        }
        int i3 = R$string.f28223Z9;
        if (this.f99063X != Privilege.intl_visitor) {
            if (CoreModule.f18264c.f20414p0.m219065j3()) {
                i2 = R$string.f27981D9;
            } else {
                i = i3;
                i2 = R$string.f27948A9;
            }
            if (CoreModule.m30933P().m143405a().mo180296B()) {
                i = R$string.f28486w3;
                i2 = R$string.f28475v3;
            }
            long jMo34296Bn = CoreModule.m30933P().m143405a().mo34296Bn();
            Act act2 = this.f115694q;
            return jMo34296Bn != 0 ? act2.string(i) : act2.string(i2);
        }
        i2 = R$string.f27996F2;
        i = i2;
        if (CoreModule.m30933P().m143405a().mo180296B()) {
            i = R$string.f28486w3;
            i2 = R$string.f28475v3;
        }
        long jMo34296Bn2 = CoreModule.m30933P().m143405a().mo34296Bn();
        Act act3 = this.f115694q;
        if (jMo34296Bn2 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m125562E0(View view) {
        String str;
        if (!this.f99065Z) {
            otp0.m169162c(this.f115694q, "p_purchase_page");
            return;
        }
        String str2 = "";
        if (NullChecker.m82486a(this.f115701x)) {
            boolean zM54714m = this.f115701x.m54714m();
            C8928d c8928d = this.f115701x;
            Merchandise merchandiseM54784s = (zM54714m ? c8928d.m54703b() : c8928d.m54705d()).m54784s();
            if (NullChecker.m82486a(merchandiseM54784s)) {
                str = merchandiseM54784s.quantity + "";
            } else {
                str = "1";
            }
        } else {
            str = "1";
        }
        ProductCategory productCategory = this.f115695r.productCategory();
        if (TEnum.equals(productCategory, ProductCategory.tttSeeWhoLikedMe)) {
            str2 = "see";
        } else if (TEnum.equals(productCategory, ProductCategory.tttVip)) {
            str2 = "vip";
        } else if (TEnum.equals(productCategory, ProductCategory.tttSvipGoogleplay)) {
            str2 = "svip";
        }
        m125565L0(str2, str);
    }

    /* JADX INFO: renamed from: J0 */
    private void m125563J0(C8928d.a aVar) {
        boolean zM125572A0 = m125572A0();
        VText vText = this.f99061V;
        if (!zM125572A0) {
            bnl0.m105524M(vText, false);
            this.f99058S.setText(this.f99066a0);
            return;
        }
        bnl0.m105524M(vText, true);
        String str = String.format("%s %s", aVar.m54784s().defaultStockKeepUnit.prices.currencySymbol, a9g0.m96567b((aVar.m54784s().defaultStockKeepUnit.prices.price / ((double) aVar.m54788w())) * 0.8500000238418579d));
        boolean zM29114k = IntlCountryCodeController.m29114k();
        VText vText2 = this.f99061V;
        if (zM29114k) {
            vText2.setText(R$string.f28161U2);
        } else {
            vText2.setText("Google Pay");
        }
        String strM162656o3 = CoreModule.f18264c.f20362X1.m162656o3();
        boolean zIsEmpty = TextUtils.isEmpty(strM162656o3);
        VText vText3 = this.f99058S;
        if (zIsEmpty) {
            boolean z = this.f99065Z;
            Act act = this.f115694q;
            vText3.setText(z ? act.getString(R$string.f27975D3) : act.getString(R$string.f27964C3, "15%", str));
        } else {
            vText3.setText(strM162656o3);
        }
        if (this.f99065Z) {
            i4g0.m138492A("e_purchase_button_web", "p_purchase_page", jyb.m147494Y("productType", this.f115695r.productCategory().toString()));
        } else {
            i4g0.m138526x("e_web_purchase", "p_purchase_page");
        }
    }

    /* JADX INFO: renamed from: K0 */
    private void m125564K0(String str) {
        PurchaseType purchaseType = this.f115695r;
        if (purchaseType == PurchaseType.TYPE_GET_VIP) {
            uqb0.m197269e1("vip_purchase_click", "showFrom", this.f115697t, "skuID", str);
            return;
        }
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            uqb0.m197269e1("see_purchase_click", "showFrom", this.f115697t, "skuID", str);
        } else if (purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE) {
            uqb0.m197269e1("superlike_purchase_click", "showFrom", this.f115697t, "skuID", str);
        } else if (purchaseType == PurchaseType.TYPE_GET_BOOST) {
            uqb0.m197269e1("boost_purchase_click", "showFrom", this.f115697t, "skuID", str);
        }
    }

    /* JADX INFO: renamed from: L0 */
    private void m125565L0(String str, String str2) {
        final String strM163316f = niw.m163316f(CoreModule.m30929H().userId() + pzi0.m174454o(), true);
        i4g0.m138523u("e_purchase_button_web", "p_purchase_page", jyb.m147494Y("productType", str), jyb.m147494Y("default_duration", str2 + "m"), jyb.m147494Y("tracker", strM163316f));
        boolean zM162658q3 = CoreModule.f18264c.f20362X1.m162658q3();
        Act act = this.f115694q;
        if (!zM162658q3) {
            otp0.m169160a(act, CoreModule.f18264c.f20362X1.f141465V.thirdPartConfig.thirdPartLandPage, str, str2, strM163316f);
            return;
        }
        act.progress(R$string.f28149T1);
        Act act2 = this.f115694q;
        nd9 nd9Var = CoreModule.f18264c.f20362X1;
        act2.duringCreated(nd9Var.m162652k3(nd9Var.m162654m3(), str, str2)).subscribe(psd0.m173600K(new y20() { // from class: l.dhj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88530a.m125575F0(strM163316f, (IntlWebPayPaymentEnvelope) obj);
            }
        }, new y20() { // from class: l.ehj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94046a.m125576G0((Throwable) obj);
            }
        }, false));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX INFO: renamed from: M0 */
    private void m125566M0() {
        boolean z;
        if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.f115695r || !CoreModule.f18264c.f20381e0.f89119S0.get().booleanValue()) {
            z = false;
        } else {
            nd9 nd9Var = CoreModule.f18264c.f20362X1;
            if (!nd9Var.f141461R || nd9Var.f141466W.contains(String.valueOf(uqb0.f180400f0))) {
                z = false;
            } else {
                z = true;
            }
        }
        this.f99064Y = z;
        this.f99065Z = CoreModule.f18264c.f20362X1.m162657p3();
    }

    /* JADX INFO: renamed from: u */
    private void m125567u() {
        NativeConfig nativeConfigM162654m3 = CoreModule.f18264c.f20362X1.m162654m3();
        if (!this.f99065Z || !NullChecker.m82486a(nativeConfigM162654m3) || !NullChecker.m82486a(nativeConfigM162654m3.btnBgColor)) {
            int i = jbc0.f119526c1;
            if (wib0.m206557a(this.f115695r)) {
                i = wib0.m206575s(this.f115695r) ? jbc0.f119498a1 : jbc0.f119512b1;
            }
            this.f99057R.setBackgroundDrawable(this.f115694q.drawable(i));
            return;
        }
        try {
            this.f99057R.setBackground(jde.m144406b(Color.parseColor(nativeConfigM162654m3.btnBgColor), qa00.f156322i));
            if (TextUtils.isEmpty(nativeConfigM162654m3.btnTextColor)) {
                return;
            }
            this.f99058S.setTextColor(Color.parseColor(nativeConfigM162654m3.btnTextColor));
        } catch (Exception e) {
            e.toString();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m125572A0() {
        if (IntlCountryCodeController.m29123t()) {
            return false;
        }
        return this.f99064Y || this.f99065Z;
    }

    /* JADX INFO: renamed from: C0 */
    public void m125573C0() {
        this.f99069d0.onClick(this.f99057R);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m125574D0(View view) {
        if (!NullChecker.m82486a(this.f115701x)) {
            if (NullChecker.m82486a(this.f99068c0)) {
                cjj.m110204L().subscribe(psd0.m173591B());
                this.f99068c0.call(0);
                return;
            }
            return;
        }
        boolean zM54714m = this.f115701x.m54714m();
        C8928d c8928d = this.f115701x;
        C8928d.a aVarM54703b = zM54714m ? c8928d.m54703b() : c8928d.m54705d();
        if (NullChecker.m82486a(aVarM54703b) && NullChecker.m82486a(aVarM54703b.m54784s())) {
            String productId = aVarM54703b.m54784s().defaultStockKeepUnit.affiliateProducts.getProductId();
            m125578I0(aVarM54703b.m54784s().autoRenewable(), productId, this.f99068c0, aVarM54703b);
            m125564K0(productId);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m125575F0(String str, IntlWebPayPaymentEnvelope intlWebPayPaymentEnvelope) {
        this.f115694q.progressDismiss();
        if (NullChecker.m82486a(intlWebPayPaymentEnvelope.data)) {
            Act act = this.f115694q;
            String str2 = "tantan://intlNativeRecharge?url=" + intlWebPayPaymentEnvelope.data.paymentRequest;
            String strM162662u3 = CoreModule.f18264c.f20362X1.m162662u3();
            IntlWebPayPaymentData intlWebPayPaymentData = intlWebPayPaymentEnvelope.data;
            otp0.m169161b(act, str2, str, strM162662u3, intlWebPayPaymentData.hideNavigationBar, intlWebPayPaymentData.hardwareAccelerated, intlWebPayPaymentData.isUseMkWebView);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m125576G0(Throwable th) {
        this.f115694q.progressDismiss();
        th.getMessage();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m125577H0(String str, double d, String str2, String str3) {
        i4g0.m138523u("e_purchase_button", "p_purchase_page", jyb.m147494Y("platform", "googleplay"), jyb.m147494Y("productType", str3), jyb.m147494Y("skuID", str), jyb.m147494Y("purchaseShowFrom", abb0.m96735b(this.f115697t)), jyb.m147494Y("first_carousel_page", mib0.m158484m(this.f99063X)), jyb.m147494Y(FirebaseAnalytics.Param.PRICE, Double.valueOf(d)), jyb.m147494Y("currency_code", str2));
    }

    /* JADX INFO: renamed from: I0 */
    public final void m125578I0(boolean z, String str, y20<Integer> y20Var, C8928d.a aVar) {
        fhj fhjVar;
        double d;
        String str2;
        try {
            String str3 = "";
            if (NullChecker.m82486a(aVar.m54784s())) {
                Prices prices = aVar.m54784s().defaultStockKeepUnit.prices;
                String str4 = prices.currencyCode;
                d = prices.price;
                str3 = aVar.m54784s().defaultStockKeepUnit.f21249id;
                str2 = str4;
            } else {
                d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                str2 = null;
            }
            fhjVar = this;
            try {
                fhjVar.m125577H0(str3, d, str2, aVar.m54762f().name());
                if (NullChecker.m82486a(str2)) {
                    uqb0.m197269e1("purchase_button_click", FirebaseAnalytics.Param.CURRENCY, str2, "platform", "android");
                }
            } catch (Throwable th) {
                th = th;
                CrashHelper.m82479c(new IllegalStateException("Failed to generate payment params", th));
            }
        } catch (Throwable th2) {
            th = th2;
            fhjVar = this;
        }
        hso hsoVar = new hso(fhjVar.f115694q, fhjVar.f115695r);
        hsoVar.m137012u(fhjVar.f115662B);
        hsoVar.m137011t(new C16976a(fhjVar.f115694q, fhjVar.f115695r, aVar, str));
        boolean zM206575s = wib0.m206575s(fhjVar.f115695r);
        if (zM206575s) {
            hsoVar.m137010s(y20Var);
            hsoVar.m137009r(true);
        }
        if (CoreModule.m30933P().m143405a().mo34445Xi() && fhjVar.f115695r == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && !ijj.m140191c().f115233c.get().isEmpty()) {
            Act act = fhjVar.f115694q;
            hsoVar.m137008q(aso.m99953h(act, act instanceof PutongAct ? ((PutongAct) act).iap().m103295i() : null), z, ijj.m140191c().f115234d.get(), ijj.m140191c().m140192a(fhjVar.f115695r));
        } else {
            Act act2 = fhjVar.f115694q;
            hsoVar.m137007p(aso.m99953h(act2, act2 instanceof PutongAct ? ((PutongAct) act2).iap().m103295i() : null), z, str);
        }
        if (zM206575s) {
            return;
        }
        y20Var.call(0);
    }

    @Override // p153l.im60, p153l.i2m
    /* JADX INFO: renamed from: a */
    public View mo115924a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f115694q.inflater().inflate(rec0.f162496T2, viewGroup, false);
        m125579z0(viewInflate);
        if (!gta.m132210e().m132214d().mo34662B8().get().isEmpty()) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(gta.m132210e().m132214d().mo34662B8().get());
            if (userM116503Pa == null || userM116503Pa.isFemale()) {
                this.f99066a0 = this.f115694q.getString(R$string.f28416q);
            } else {
                this.f99066a0 = this.f115694q.getString(R$string.f28427r);
            }
        } else if (C4880a0.m32390j().f20268e.get().booleanValue()) {
            this.f99066a0 = this.f115694q.getString(R$string.f28323i2);
        } else {
            this.f99066a0 = m125561B0().toString();
        }
        m125566M0();
        bnl0.m105524M(this.f99061V, false);
        this.f99058S.setText(this.f99066a0);
        m125567u();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f99057R.getLayoutParams();
        layoutParams.bottomMargin = qa00.m175859d(12.0f);
        this.f99057R.setLayoutParams(layoutParams);
        return viewInflate;
    }

    @Override // p153l.im60, p153l.i2m
    /* JADX INFO: renamed from: b */
    public void mo115926b(C8928d c8928d) {
        super.mo115926b(c8928d);
        boolean zM54714m = this.f115701x.m54714m();
        C8928d c8928d2 = this.f115701x;
        m125563J0(zM54714m ? c8928d2.m54703b() : c8928d2.m54705d());
    }

    @Override // p153l.im60
    /* JADX INFO: renamed from: c0 */
    public void mo115928c0(View.OnClickListener onClickListener) {
        if (NullChecker.m82486a(this.f99062W)) {
            this.f99062W.setTextColor(k3d0.m148005a(wib0.m206573q(this.f115695r) ? h9c0.f108333C : h9c0.f108389q));
            bnl0.m105524M(this.f99062W, true);
            bnl0.m105509E0(this.f99062W, onClickListener);
        }
    }

    @Override // p153l.im60
    /* JADX INFO: renamed from: g0 */
    public void mo115933g0(C8928d c8928d) {
        C8928d c8928d2;
        C8928d.a aVarM54703b = c8928d.m54714m() ? c8928d.m54703b() : c8928d.m54705d();
        boolean z = c8928d.f35377k && (c8928d2 = this.f115701x) != null && c8928d2 != c8928d && NullChecker.m82486a(aVarM54703b) && TextUtils.equals(aVarM54703b.m54762f().toString(), ProductCategory.tttSeeWhoLikedMe);
        super.mo115933g0(c8928d);
        if (z) {
            m125573C0();
        }
    }

    @Override // p153l.im60
    /* JADX INFO: renamed from: h0 */
    public void mo115935h0(Privilege privilege) {
        this.f99063X = privilege;
    }

    @Override // p153l.im60, p153l.i2m
    /* JADX INFO: renamed from: i */
    public void mo115937i(y20<Integer> y20Var) {
        this.f99068c0 = y20Var;
        bnl0.m105509E0(this.f99057R, m125572A0() ? this.f99070e0 : this.f99069d0);
        bnl0.m105509E0(this.f99061V, this.f99069d0);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m125579z0(View view) {
        ghj.m130252a(this, view);
    }

    @Override // p153l.im60, p153l.i2m
    public void release() {
    }
}
