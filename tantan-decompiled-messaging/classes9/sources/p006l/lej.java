package p006l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0155a0;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.IntlWebPayPaymentData;
import com.p1.mobile.putong.core.data.IntlWebPayPaymentEnvelope;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.NativeConfig;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.aqo;
import l.b1c0;
import l.d3c0;
import l.e30;
import l.fce;
import l.hqo;
import l.hvc0;
import l.igj;
import l.j760;
import l.m6c0;
import l.mej;
import l.mkd0;
import l.mqi0;
import l.ogj;
import l.ogw;
import l.qlw;
import l.sab0;
import l.t0g0;
import l.t100;
import l.vwb;
import l.w2b0;
import l.xdl0;
import l.zvf0;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class lej extends de60 {

    /* JADX INFO: renamed from: R */
    public VFrame f16358R;

    /* JADX INFO: renamed from: S */
    public VText f16359S;

    /* JADX INFO: renamed from: T */
    public VFrame f16360T;

    /* JADX INFO: renamed from: U */
    public VText f16361U;

    /* JADX INFO: renamed from: V */
    public VText f16362V;

    /* JADX INFO: renamed from: W */
    public TextView f16363W;

    /* JADX INFO: renamed from: X */
    public Privilege f16364X;

    /* JADX INFO: renamed from: Y */
    public boolean f16365Y;

    /* JADX INFO: renamed from: Z */
    public boolean f16366Z;

    /* JADX INFO: renamed from: a0 */
    public String f16367a0;

    /* JADX INFO: renamed from: b0 */
    public final String f16368b0;

    /* JADX INFO: renamed from: c0 */
    public e30 f16369c0;

    /* JADX INFO: renamed from: d0 */
    public View.OnClickListener f16370d0;

    /* JADX INFO: renamed from: e0 */
    public View.OnClickListener f16371e0;

    /* JADX INFO: renamed from: l.lej$a */
    public static class C0973a extends qlw {

        /* JADX INFO: renamed from: e */
        public final d.a f16372e;

        /* JADX INFO: renamed from: f */
        public final String f16373f;

        /* JADX INFO: renamed from: g */
        public final Merchandise f16374g;

        public C0973a(Act act, PurchaseType purchaseType, d.a aVar, String str) {
            super(act, purchaseType);
            this.f16372e = aVar;
            this.f16373f = str;
            this.f16374g = aVar.s();
        }

        /* JADX INFO: renamed from: A */
        private void m18749A() {
            if (this.f16374g == null || !CoreModule.m1854P().m11706a().m5379Xi()) {
                return;
            }
            boolean zM16055i = h6a.m16055i();
            Merchandise merchandise = this.f16374g;
            if (zM16055i) {
                if (merchandise.monthly()) {
                    ogj.c().b.onNext(0);
                    return;
                } else if (this.f16374g.quarterly()) {
                    ogj.c().b.onNext(1);
                    return;
                } else {
                    if (this.f16374g.yearly()) {
                        ogj.c().b.onNext(2);
                        return;
                    }
                    return;
                }
            }
            if (merchandise.monthly()) {
                ogj.c().b.onNext(2);
            } else if (this.f16374g.quarterly()) {
                ogj.c().b.onNext(1);
            } else if (this.f16374g.yearly()) {
                ogj.c().b.onNext(0);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m18750a() {
            m18749A();
            super.a();
        }

        /* JADX INFO: renamed from: c */
        public void m18751c() {
            m18749A();
            super.c();
        }

        /* JADX INFO: renamed from: x */
        public Object[] m18752x() {
            try {
                if (NullChecker.a(this.f16372e.s())) {
                    Prices prices = this.f16372e.s().defaultStockKeepUnit.prices;
                    return new Object[]{"currency", prices.currencyCode, "value", Double.valueOf(prices.price), "skuID", this.f16373f, "platform", "android"};
                }
            } catch (Throwable th) {
                CrashHelper.c(new IllegalStateException("Failed to generate payment params", th));
            }
            return qlw.d;
        }
    }

    public lej(Act act, PurchaseType purchaseType) {
        super(act, purchaseType);
        this.f16365Y = false;
        this.f16366Z = false;
        this.f16368b0 = lej.class.getSimpleName();
        this.f16370d0 = new View.OnClickListener() { // from class: l.hej
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13854a.m18743D0(view);
            }
        };
        this.f16371e0 = new View.OnClickListener() { // from class: l.iej
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14413a.m18731E0(view);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX INFO: renamed from: B0 */
    private CharSequence m18730B0() {
        int i;
        int i2;
        if (sab0.w(this.f10336r)) {
            return (CoreModule.f1534c.f3628e0.m21490p9().isVIP() || CoreModule.f1534c.f3628e0.m21490p9().isVIPExpired()) ? this.f10335q.string(R.string.s9) : this.f10335q.string(R.string.q9);
        }
        PurchaseType purchaseType = PurchaseType.TYPE_GET_BOOST;
        PurchaseType purchaseType2 = this.f10336r;
        if (purchaseType == purchaseType2) {
            return this.f10335q.string(R.string.E9);
        }
        if (PurchaseType.TYPE_GET_VIP_SUPERLIKE == purchaseType2) {
            return this.f10335q.string(R.string.g9);
        }
        if (!sab0.s(purchaseType2)) {
            if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE != this.f10336r) {
                return null;
            }
            this.f16362V.setTextColor(this.f10335q.getResources().getColor(b1c0.C));
            boolean zM27381f4 = xma.m27381f4();
            Act act = this.f10335q;
            return zM27381f4 ? act.string(R.string.c7) : act.string(R.string.b7);
        }
        int i3 = R.string.Z9;
        if (this.f16364X != Privilege.intl_visitor) {
            if (CoreModule.f1534c.f3661p0.m21966j3()) {
                i2 = R.string.D9;
            } else {
                i = i3;
                i2 = R.string.A9;
            }
            if (CoreModule.m1854P().m11706a().m19710B()) {
                i = R.string.w3;
                i2 = R.string.v3;
            }
            long jM5230Bn = CoreModule.m1854P().m11706a().m5230Bn();
            Act act2 = this.f10335q;
            return jM5230Bn != 0 ? act2.string(i) : act2.string(i2);
        }
        i2 = R.string.F2;
        i = i2;
        if (CoreModule.m1854P().m11706a().m19710B()) {
            i = R.string.w3;
            i2 = R.string.v3;
        }
        long jM5230Bn2 = CoreModule.m1854P().m11706a().m5230Bn();
        Act act3 = this.f10335q;
        if (jM5230Bn2 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m18731E0(View view) {
        String str;
        if (!this.f16366Z) {
            kkp0.m18162c(this.f10335q, "p_purchase_page");
            return;
        }
        String str2 = "";
        if (NullChecker.a(this.f10342x)) {
            boolean zM = this.f10342x.m();
            d dVar = this.f10342x;
            Merchandise merchandiseS = (zM ? dVar.b() : dVar.d()).s();
            if (NullChecker.a(merchandiseS)) {
                str = merchandiseS.quantity + "";
            } else {
                str = "1";
            }
        } else {
            str = "1";
        }
        ProductCategory productCategory = this.f10336r.productCategory();
        if (TEnum.equals(productCategory, "tttSeeWhoLikedMe")) {
            str2 = "see";
        } else if (TEnum.equals(productCategory, "tttVip")) {
            str2 = "vip";
        } else if (TEnum.equals(productCategory, "tttSvipGoogleplay")) {
            str2 = "svip";
        }
        m18734L0(str2, str);
    }

    /* JADX INFO: renamed from: J0 */
    private void m18732J0(d.a aVar) {
        boolean zM18741A0 = m18741A0();
        VText vText = this.f16362V;
        if (!zM18741A0) {
            xdl0.M(vText, false);
            this.f16359S.setText(this.f16367a0);
            return;
        }
        xdl0.M(vText, true);
        String str = String.format("%s %s", aVar.s().defaultStockKeepUnit.prices.currencySymbol, t0g0.b((aVar.s().defaultStockKeepUnit.prices.price / ((double) aVar.w())) * 0.8500000238418579d));
        boolean zM10k = IntlCountryCodeController.m10k();
        VText vText2 = this.f16362V;
        if (zM10k) {
            vText2.setText(R.string.U2);
        } else {
            vText2.setText("Google Pay");
        }
        String strM14466o3 = CoreModule.f1534c.f3609X1.m14466o3();
        boolean zIsEmpty = TextUtils.isEmpty(strM14466o3);
        VText vText3 = this.f16359S;
        if (zIsEmpty) {
            boolean z = this.f16366Z;
            Act act = this.f10335q;
            vText3.setText(z ? act.getString(R.string.D3) : act.getString(R.string.C3, "15%", str));
        } else {
            vText3.setText(strM14466o3);
        }
        if (this.f16366Z) {
            zvf0.A("e_purchase_button_web", "p_purchase_page", new j760[]{vwb.Y("productType", this.f10336r.productCategory().toString())});
        } else {
            zvf0.x("e_web_purchase", "p_purchase_page");
        }
    }

    /* JADX INFO: renamed from: K0 */
    private void m18733K0(String str) {
        PurchaseType purchaseType = this.f10336r;
        if (purchaseType == PurchaseType.TYPE_GET_VIP) {
            qib0.m22159e1("vip_purchase_click", "showFrom", this.f10338t, "skuID", str);
            return;
        }
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            qib0.m22159e1("see_purchase_click", "showFrom", this.f10338t, "skuID", str);
        } else if (purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE) {
            qib0.m22159e1("superlike_purchase_click", "showFrom", this.f10338t, "skuID", str);
        } else if (purchaseType == PurchaseType.TYPE_GET_BOOST) {
            qib0.m22159e1("boost_purchase_click", "showFrom", this.f10338t, "skuID", str);
        }
    }

    /* JADX INFO: renamed from: L0 */
    private void m18734L0(String str, String str2) {
        final String strF = ogw.f(CoreModule.m1850H().userId() + mqi0.o(), true);
        zvf0.u("e_purchase_button_web", "p_purchase_page", new j760[]{vwb.Y("productType", str), vwb.Y("default_duration", str2 + "m"), vwb.Y("tracker", strF)});
        boolean zM14468q3 = CoreModule.f1534c.f3609X1.m14468q3();
        Act act = this.f10335q;
        if (!zM14468q3) {
            kkp0.m18160a(act, CoreModule.f1534c.f3609X1.f11073V.thirdPartConfig.thirdPartLandPage, str, str2, strF);
            return;
        }
        act.progress(R.string.T1);
        Act act2 = this.f10335q;
        ec9 ec9Var = CoreModule.f1534c.f3609X1;
        act2.duringCreated(ec9Var.m14462k3(ec9Var.m14464m3(), str, str2)).subscribe(mkd0.K(new e30() { // from class: l.jej
            public final void call(Object obj) {
                this.f15127a.m18744F0(strF, (IntlWebPayPaymentEnvelope) obj);
            }
        }, new e30() { // from class: l.kej
            public final void call(Object obj) {
                this.f15791a.m18745G0((Throwable) obj);
            }
        }, false));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX INFO: renamed from: M0 */
    private void m18735M0() {
        boolean z;
        if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.f10336r || !((Boolean) CoreModule.f1534c.f3628e0.f18874S0.get()).booleanValue()) {
            z = false;
        } else {
            ec9 ec9Var = CoreModule.f1534c.f3609X1;
            if (!ec9Var.f11069R || ec9Var.f11074W.contains(String.valueOf(qib0.f19808f0))) {
                z = false;
            } else {
                z = true;
            }
        }
        this.f16365Y = z;
        this.f16366Z = CoreModule.f1534c.f3609X1.m14467p3();
    }

    /* JADX INFO: renamed from: u */
    private void m18736u() {
        NativeConfig nativeConfigM14464m3 = CoreModule.f1534c.f3609X1.m14464m3();
        if (!this.f16366Z || !NullChecker.a(nativeConfigM14464m3) || !NullChecker.a(nativeConfigM14464m3.btnBgColor)) {
            int i = d3c0.c1;
            if (sab0.a(this.f10336r)) {
                i = sab0.s(this.f10336r) ? d3c0.a1 : d3c0.b1;
            }
            this.f16358R.setBackgroundDrawable(this.f10335q.drawable(i));
            return;
        }
        try {
            this.f16358R.setBackground(fce.b(Color.parseColor(nativeConfigM14464m3.btnBgColor), t100.i));
            if (TextUtils.isEmpty(nativeConfigM14464m3.btnTextColor)) {
                return;
            }
            this.f16359S.setTextColor(Color.parseColor(nativeConfigM14464m3.btnTextColor));
        } catch (Exception e) {
            e.toString();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m18741A0() {
        if (IntlCountryCodeController.m19t()) {
            return false;
        }
        return this.f16365Y || this.f16366Z;
    }

    /* JADX INFO: renamed from: C0 */
    public void m18742C0() {
        this.f16370d0.onClick(this.f16358R);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m18743D0(View view) {
        if (!NullChecker.a(this.f10342x)) {
            if (NullChecker.a(this.f16369c0)) {
                igj.L().subscribe(mkd0.B());
                this.f16369c0.call(0);
                return;
            }
            return;
        }
        boolean zM = this.f10342x.m();
        d dVar = this.f10342x;
        d.a aVarB = zM ? dVar.b() : dVar.d();
        if (NullChecker.a(aVarB) && NullChecker.a(aVarB.s())) {
            String productId = aVarB.s().defaultStockKeepUnit.affiliateProducts.getProductId();
            m18747I0(aVarB.s().autoRenewable(), productId, this.f16369c0, aVarB);
            m18733K0(productId);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m18744F0(String str, IntlWebPayPaymentEnvelope intlWebPayPaymentEnvelope) {
        this.f10335q.progressDismiss();
        if (NullChecker.a(intlWebPayPaymentEnvelope.data)) {
            Act act = this.f10335q;
            String str2 = "tantan://intlNativeRecharge?url=" + intlWebPayPaymentEnvelope.data.paymentRequest;
            String strM14472u3 = CoreModule.f1534c.f3609X1.m14472u3();
            IntlWebPayPaymentData intlWebPayPaymentData = intlWebPayPaymentEnvelope.data;
            kkp0.m18161b(act, str2, str, strM14472u3, intlWebPayPaymentData.hideNavigationBar, intlWebPayPaymentData.hardwareAccelerated, intlWebPayPaymentData.isUseMkWebView);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m18745G0(Throwable th) {
        this.f10335q.progressDismiss();
        th.getMessage();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m18746H0(String str, double d, String str2, String str3) {
        zvf0.u("e_purchase_button", "p_purchase_page", new j760[]{vwb.Y("platform", "googleplay"), vwb.Y("productType", str3), vwb.Y("skuID", str), vwb.Y("purchaseShowFrom", w2b0.b(this.f10338t)), vwb.Y("first_carousel_page", iab0.m16586m(this.f16364X)), vwb.Y("price", Double.valueOf(d)), vwb.Y("currency_code", str2)});
    }

    /* JADX INFO: renamed from: I0 */
    public final void m18747I0(boolean z, String str, e30<Integer> e30Var, d.a aVar) {
        lej lejVar;
        double d;
        String str2;
        try {
            String str3 = "";
            if (NullChecker.a(aVar.s())) {
                Prices prices = aVar.s().defaultStockKeepUnit.prices;
                String str4 = prices.currencyCode;
                d = prices.price;
                str3 = aVar.s().defaultStockKeepUnit.id;
                str2 = str4;
            } else {
                d = 0.0d;
                str2 = null;
            }
            lejVar = this;
            try {
                lejVar.m18746H0(str3, d, str2, aVar.f().name());
                if (NullChecker.a(str2)) {
                    qib0.m22159e1("purchase_button_click", "currency", str2, "platform", "android");
                }
            } catch (Throwable th) {
                th = th;
                CrashHelper.c(new IllegalStateException("Failed to generate payment params", th));
            }
        } catch (Throwable th2) {
            th = th2;
            lejVar = this;
        }
        hqo hqoVar = new hqo(lejVar.f10335q, lejVar.f10336r);
        hqoVar.u(lejVar.f10303B);
        hqoVar.t(new C0973a(lejVar.f10335q, lejVar.f10336r, aVar, str));
        boolean zS = sab0.s(lejVar.f10336r);
        if (zS) {
            hqoVar.s(e30Var);
            hqoVar.r(true);
        }
        if (CoreModule.m1854P().m11706a().m5379Xi() && lejVar.f10336r == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && !((String) ogj.c().c.get()).isEmpty()) {
            Act act = lejVar.f10335q;
            hqoVar.q(aqo.h(act, act instanceof PutongAct ? ((PutongAct) act).iap().i() : null), z, (String) ogj.c().d.get(), ogj.c().a(lejVar.f10336r));
        } else {
            Act act2 = lejVar.f10335q;
            hqoVar.p(aqo.h(act2, act2 instanceof PutongAct ? ((PutongAct) act2).iap().i() : null), z, str);
        }
        if (zS) {
            return;
        }
        e30Var.call(0);
    }

    @Override // p006l.de60, p006l.ozl
    /* JADX INFO: renamed from: a */
    public View mo13940a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f10335q.inflater().inflate(m6c0.T2, viewGroup, false);
        m18748z0(viewInflate);
        if (!((String) ura.m25555e().m25559d().m5596B8().get()).isEmpty()) {
            User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa((String) ura.m25555e().m25559d().m5596B8().get());
            if (userM21393Pa == null || userM21393Pa.isFemale()) {
                this.f16367a0 = this.f10335q.getString(R.string.q);
            } else {
                this.f16367a0 = this.f10335q.getString(R.string.r);
            }
        } else if (((Boolean) C0155a0.m3317j().f3515e.get()).booleanValue()) {
            this.f16367a0 = this.f10335q.getString(R.string.i2);
        } else {
            this.f16367a0 = m18730B0().toString();
        }
        m18735M0();
        xdl0.M(this.f16362V, false);
        this.f16359S.setText(this.f16367a0);
        m18736u();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f16358R.getLayoutParams();
        layoutParams.bottomMargin = t100.d(12.0f);
        this.f16358R.setLayoutParams(layoutParams);
        return viewInflate;
    }

    @Override // p006l.de60, p006l.ozl
    /* JADX INFO: renamed from: b */
    public void mo13942b(d dVar) {
        super.mo13942b(dVar);
        boolean zM = this.f10342x.m();
        d dVar2 = this.f10342x;
        m18732J0(zM ? dVar2.b() : dVar2.d());
    }

    @Override // p006l.de60
    /* JADX INFO: renamed from: c0 */
    public void mo13945c0(View.OnClickListener onClickListener) {
        if (NullChecker.a(this.f16363W)) {
            this.f16363W.setTextColor(hvc0.a(sab0.q(this.f10336r) ? b1c0.C : b1c0.q));
            xdl0.M(this.f16363W, true);
            xdl0.E0(this.f16363W, onClickListener);
        }
    }

    @Override // p006l.de60
    /* JADX INFO: renamed from: g0 */
    public void mo13953g0(d dVar) {
        d dVar2;
        d.a aVarB = dVar.m() ? dVar.b() : dVar.d();
        boolean z = dVar.k && (dVar2 = this.f10342x) != null && dVar2 != dVar && NullChecker.a(aVarB) && TextUtils.equals(aVarB.f().toString(), "tttSeeWhoLikedMe");
        super.mo13953g0(dVar);
        if (z) {
            m18742C0();
        }
    }

    @Override // p006l.de60
    /* JADX INFO: renamed from: h0 */
    public void mo13955h0(Privilege privilege) {
        this.f16364X = privilege;
    }

    @Override // p006l.de60, p006l.ozl
    /* JADX INFO: renamed from: i */
    public void mo13956i(e30<Integer> e30Var) {
        this.f16369c0 = e30Var;
        xdl0.E0(this.f16358R, m18741A0() ? this.f16371e0 : this.f16370d0);
        xdl0.E0(this.f16362V, this.f16370d0);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m18748z0(View view) {
        mej.a(this, view);
    }

    @Override // p006l.de60, p006l.ozl
    public void release() {
    }
}
