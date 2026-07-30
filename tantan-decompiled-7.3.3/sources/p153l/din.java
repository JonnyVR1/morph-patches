package p153l;

import android.animation.Animator;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4880a0;
import com.p051p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p051p1.mobile.putong.core.data.AffiliateProducts;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p051p1.mobile.putong.core.data.IntlWebPayPaymentData;
import com.p051p1.mobile.putong.core.data.IntlWebPayPaymentEnvelope;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.StockKeepUnit;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class din extends im60 {

    /* JADX INFO: renamed from: R */
    public VFrame f88667R;

    /* JADX INFO: renamed from: S */
    public SVGAnimationView f88668S;

    /* JADX INFO: renamed from: T */
    public VLinear f88669T;

    /* JADX INFO: renamed from: U */
    public VText f88670U;

    /* JADX INFO: renamed from: V */
    public VText f88671V;

    /* JADX INFO: renamed from: W */
    public VFrame f88672W;

    /* JADX INFO: renamed from: X */
    public VText f88673X;

    /* JADX INFO: renamed from: Y */
    public VFrame f88674Y;

    /* JADX INFO: renamed from: Z */
    public VText f88675Z;

    /* JADX INFO: renamed from: a0 */
    public VText f88676a0;

    /* JADX INFO: renamed from: b0 */
    public TextView f88677b0;

    /* JADX INFO: renamed from: c0 */
    public Privilege f88678c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f88679d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f88680e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f88681f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f88682g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f88683h0;

    /* JADX INFO: renamed from: i0 */
    public String f88684i0;

    /* JADX INFO: renamed from: j0 */
    public y20 f88685j0;

    /* JADX INFO: renamed from: k0 */
    public View.OnClickListener f88686k0;

    /* JADX INFO: renamed from: l0 */
    public View.OnClickListener f88687l0;

    /* JADX INFO: renamed from: m0 */
    public Interpolator f88688m0;

    /* JADX INFO: renamed from: n0 */
    public kcg0 f88689n0;

    /* JADX INFO: renamed from: l.din$a */
    public class RunnableC16536a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f88690a;

        public RunnableC16536a(View view) {
            this.f88690a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = this.f88690a;
            if (view != null) {
                kkl0.m150158g0(view);
            }
        }
    }

    /* JADX INFO: renamed from: l.din$b */
    public static class C16537b extends pow {

        /* JADX INFO: renamed from: e */
        public final C8928d.a f88692e;

        /* JADX INFO: renamed from: f */
        public final String f88693f;

        /* JADX INFO: renamed from: g */
        public final Merchandise f88694g;

        public C16537b(Act act, PurchaseType purchaseType, C8928d.a aVar, String str, y3m y3mVar) {
            super(act, purchaseType, y3mVar);
            this.f88692e = aVar;
            this.f88693f = str;
            this.f88694g = aVar.m54784s();
        }

        /* JADX INFO: renamed from: A */
        public final void m115947A() {
            if (this.f88694g == null || !CoreModule.m30933P().m143405a().mo34445Xi()) {
                return;
            }
            boolean zM189553i = t7a.m189553i();
            Merchandise merchandise = this.f88694g;
            if (zM189553i) {
                if (merchandise.monthly()) {
                    ijj.m140191c().f115232b.onNext(0);
                    return;
                } else if (this.f88694g.quarterly()) {
                    ijj.m140191c().f115232b.onNext(1);
                    return;
                } else {
                    if (this.f88694g.yearly()) {
                        ijj.m140191c().f115232b.onNext(2);
                        return;
                    }
                    return;
                }
            }
            if (merchandise.monthly()) {
                ijj.m140191c().f115232b.onNext(2);
            } else if (this.f88694g.quarterly()) {
                ijj.m140191c().f115232b.onNext(1);
            } else if (this.f88694g.yearly()) {
                ijj.m140191c().f115232b.onNext(0);
            }
        }

        @Override // p153l.pow, p153l.bn50
        /* JADX INFO: renamed from: a */
        public void mo31848a() {
            m115947A();
            super.mo31848a();
        }

        @Override // p153l.pow, p153l.bn50
        /* JADX INFO: renamed from: c */
        public void mo31849c() {
            m115947A();
            super.mo31849c();
        }

        @Override // p153l.pow
        /* JADX INFO: renamed from: x */
        public Object[] mo115948x() {
            try {
                if (NullChecker.m82486a(this.f88692e.m54784s())) {
                    Prices prices = this.f88692e.m54784s().defaultStockKeepUnit.prices;
                    return new Object[]{FirebaseAnalytics.Param.CURRENCY, prices.currencyCode, "value", Double.valueOf(prices.price), "skuID", this.f88693f, "platform", "android"};
                }
            } catch (Throwable th) {
                CrashHelper.m82479c(new IllegalStateException("Failed to generate payment params", th));
            }
            return pow.f153437d;
        }
    }

    public din(Act act, PurchaseType purchaseType) {
        super(act, purchaseType);
        this.f88679d0 = false;
        this.f88680e0 = false;
        this.f88681f0 = false;
        this.f88682g0 = false;
        this.f88683h0 = false;
        this.f88686k0 = new View.OnClickListener() { // from class: l.whn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189179a.m115918U0(view);
            }
        };
        this.f88687l0 = new View.OnClickListener() { // from class: l.xhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194388a.m115919V0(view);
            }
        };
        this.f88688m0 = new LinearInterpolator();
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ Boolean m115893A0(String str, String str2, Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        if (merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || (affiliateProducts = stockKeepUnit.affiliateProducts) == null) {
            return Boolean.FALSE;
        }
        String str3 = affiliateProducts.googleplay;
        if (str3 == null) {
            return Boolean.FALSE;
        }
        String strTrim = str3.trim();
        if (TextUtils.equals(strTrim, str)) {
            return Boolean.TRUE;
        }
        return !TextUtils.isEmpty(str2) ? Boolean.valueOf(TextUtils.equals(CoreIntlAffiliatePromotions.m31159l3(strTrim, str2), str)) : Boolean.valueOf(CoreIntlAffiliatePromotions.m31141Q3(str, strTrim));
    }

    /* JADX INFO: renamed from: L0 */
    public static Merchandise m115897L0(IapAffiliatePromotion iapAffiliatePromotion) {
        final String strTrim = iapAffiliatePromotion.iapId.trim();
        String str = iapAffiliatePromotion.offerId;
        final String strTrim2 = str != null ? str.trim() : "";
        List<Merchandise> listM222761e = CoreModule.f18264c.f20396j0.m31583E4().m222761e();
        if (jyb.m147479J(listM222761e)) {
            return null;
        }
        return (Merchandise) jyb.m147529r(listM222761e, new qcj() { // from class: l.vhn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return din.m115893A0(strTrim, strTrim2, (Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public static String m115898M0(Prices prices) {
        if (prices == null || prices.price <= 1.0E-6d) {
            return "";
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        String str = numberInstance.format(prices.price);
        if (TextUtils.isEmpty(prices.currencySymbol)) {
            return str;
        }
        return prices.currencySymbol + str;
    }

    /* JADX INFO: renamed from: T0 */
    public static boolean m115899T0(IapAffiliatePromotion iapAffiliatePromotion) {
        return CoreIntlAffiliatePromotions.m31144V3(iapAffiliatePromotion);
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m115902x0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ dgq0 m115903y0(int i, int i2, int i3, int i4, View view, dgq0 dgq0Var) {
        view.setPadding(i, i2, i3, i4 + dgq0Var.m115680f(dgq0.C16531l.m115735d()).f170860d);
        return dgq0Var;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m115905E0(View view) {
        ein.m120938a(this, view);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m115906F0() {
        IapAffiliatePromotion iapAffiliatePromotionM31169E3;
        IapAffiliatePromotion iapAffiliatePromotionM31219v3;
        if (!NullChecker.m82486a(this.f115701x)) {
            if (NullChecker.m82486a(this.f88685j0)) {
                cjj.m110204L().subscribe(psd0.m173591B());
                this.f88685j0.call(0);
                return;
            }
            return;
        }
        boolean zM54714m = this.f115701x.m54714m();
        C8928d c8928d = this.f115701x;
        C8928d.a aVarM54703b = zM54714m ? c8928d.m54703b() : c8928d.m54705d();
        if (NullChecker.m82486a(aVarM54703b) && NullChecker.m82486a(aVarM54703b.m54784s())) {
            Merchandise merchandiseM54784s = aVarM54703b.m54784s();
            String productId = merchandiseM54784s.defaultStockKeepUnit.affiliateProducts.getProductId();
            PurchaseType purchaseType = this.f115695r;
            PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            if (purchaseType == purchaseType2 && !IntlCountryCodeController.m29114k()) {
                String str = merchandiseM54784s.defaultStockKeepUnit.affiliateProducts.googleplay;
                IapAffiliatePromotion iapAffiliatePromotionM31169E4 = CoreModule.f18264c.f20438x0.m31169E3();
                if (iapAffiliatePromotionM31169E4 == null && this.f88681f0 && (iapAffiliatePromotionM31219v3 = CoreModule.f18264c.f20438x0.m31219v3(merchandiseM54784s)) != null && !CoreModule.f18264c.f20438x0.m31195f4(iapAffiliatePromotionM31219v3)) {
                    if (m140762J()) {
                        m6p.m157251k(this.f115694q, m6p.m157243c());
                    }
                    IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM31182L3 = CoreModule.f18264c.f20438x0.m31182L3(iapAffiliatePromotionM31219v3);
                    r1j0.m179420g((iapAffiliatePromotionDisplaySlotM31182L3 == null || TextUtils.isEmpty(iapAffiliatePromotionDisplaySlotM31182L3.interceptToast)) ? this.f115694q.getString(R$string.f28040J2) : iapAffiliatePromotionDisplaySlotM31182L3.interceptToast.trim());
                    return;
                }
                boolean z = this.f88681f0 || CoreModule.f18264c.f20438x0.m31186P3();
                if (iapAffiliatePromotionM31169E4 != null && z) {
                    String str2 = iapAffiliatePromotionM31169E4.iapId;
                    if (TextUtils.isEmpty(str2 == null ? "" : str2.trim())) {
                        if (m140762J()) {
                            m6p.m157251k(this.f115694q, m6p.m157244d());
                            return;
                        }
                        return;
                    }
                }
                if (iapAffiliatePromotionM31169E4 != null && z && CoreIntlAffiliatePromotions.m31141Q3(iapAffiliatePromotionM31169E4.iapId, str)) {
                    productId = CoreIntlAffiliatePromotions.m31160m3(str, iapAffiliatePromotionM31169E4.iapId, iapAffiliatePromotionM31169E4.offerId);
                }
            }
            if (m140762J() && this.f115695r == purchaseType2 && (iapAffiliatePromotionM31169E3 = CoreModule.f18264c.f20438x0.m31169E3()) != null) {
                m6p.m157252l(this.f115694q, aVarM54703b, iapAffiliatePromotionM31169E3);
            }
            String str3 = productId;
            m115927b1(merchandiseM54784s.autoRenewable(), str3, this.f88685j0, aVarM54703b, this.f115701x.f35377k);
            m115942m1(str3);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m115907G0(View view) {
        if (view == null) {
            return;
        }
        final int paddingLeft = view.getPaddingLeft();
        final int paddingTop = view.getPaddingTop();
        final int paddingRight = view.getPaddingRight();
        final int paddingBottom = view.getPaddingBottom();
        kkl0.m150194y0(view, new il50() { // from class: l.uhn
            @Override // p153l.il50
            public final dgq0 onApplyWindowInsets(View view2, dgq0 dgq0Var) {
                return din.m115903y0(paddingLeft, paddingTop, paddingRight, paddingBottom, view2, dgq0Var);
            }
        });
        if (view.isAttachedToWindow()) {
            kkl0.m150158g0(view);
        } else {
            view.post(new RunnableC16536a(view));
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m115908H0() {
        bnl0.m105509E0(this.f88672W, m115911K0() ? this.f88687l0 : this.f88686k0);
        bnl0.m105509E0(this.f88667R, this.f88686k0);
        bnl0.m105509E0(this.f88676a0, this.f88686k0);
    }

    /* JADX INFO: renamed from: I0 */
    public final CharSequence m115909I0(C8928d.a aVar) {
        String strM115912N0 = m115912N0();
        String string = this.f115694q.getString(R$string.f27963C2);
        if (TextUtils.isEmpty(strM115912N0)) {
            return string;
        }
        String string2 = this.f115694q.getString(R$string.f27974D2, strM115912N0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f115694q.color(h9c0.f108337G)), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append('\n');
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f115694q.color(h9c0.f108338H)), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(Math.max(1, Math.round(this.f115694q.getResources().getDisplayMetrics().scaledDensity * 15.0f)), false), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: J0 */
    public final CharSequence m115910J0() {
        String string;
        C8928d.a aVarM115932f1 = m115932f1();
        if (!NullChecker.m82486a(aVarM115932f1)) {
            return "";
        }
        IapAffiliatePromotion iapAffiliatePromotionM31169E3 = CoreModule.f18264c.f20438x0.m31169E3();
        if (m115899T0(iapAffiliatePromotionM31169E3) && CoreModule.f18264c.f20438x0.m31201l4(aVarM115932f1.m54784s())) {
            return m115909I0(aVarM115932f1);
        }
        String strM54764g = aVarM115932f1.m54764g();
        if (TextUtils.isEmpty(strM54764g)) {
            strM54764g = aVarM115932f1.m54774l();
        }
        if (TextUtils.isEmpty(strM54764g)) {
            strM54764g = aVarM115932f1.m54791z();
        }
        if (TextUtils.isEmpty(strM54764g)) {
            return "";
        }
        int iM54788w = aVarM115932f1.m54788w();
        String strM115931e1 = m115931e1(aVarM115932f1);
        Merchandise merchandiseM54784s = aVarM115932f1.m54784s();
        if (merchandiseM54784s == null || !merchandiseM54784s.weekly()) {
            Act act = this.f115694q;
            string = iM54788w == 1 ? act.getString(R$string.f28095O2, String.valueOf(iM54788w), strM54764g) : act.getString(R$string.f28106P2, String.valueOf(iM54788w), strM54764g);
        } else {
            string = this.f115694q.getString(iM54788w == 1 ? R$string.f28117Q2 : R$string.f28128R2, String.valueOf(iM54788w), strM54764g);
        }
        if ((iapAffiliatePromotionM31169E3 != null && !this.f88681f0) || TextUtils.isEmpty(strM115931e1) || TextUtils.equals(strM115931e1.trim(), strM54764g.trim())) {
            return string;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append(' ');
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) strM115931e1);
        spannableStringBuilder.setSpan(new StrikethroughSpan(), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m115911K0() {
        if (IntlCountryCodeController.m29123t() || this.f115695r == PurchaseType.TYPE_ULTRA_PREMIUM || this.f88683h0) {
            return false;
        }
        return this.f88679d0 || this.f88680e0;
    }

    /* JADX INFO: renamed from: N0 */
    public final String m115912N0() {
        IapAffiliatePromotion iapAffiliatePromotionM31169E3 = CoreModule.f18264c.f20438x0.m31169E3();
        if (iapAffiliatePromotionM31169E3 != null && !TextUtils.isEmpty(iapAffiliatePromotionM31169E3.iapId)) {
            String strM110201I = cjj.m110201I(iapAffiliatePromotionM31169E3.iapId, iapAffiliatePromotionM31169E3.offerId);
            if (!TextUtils.isEmpty(strM110201I)) {
                return strM110201I;
            }
            Merchandise merchandiseM115897L0 = m115897L0(iapAffiliatePromotionM31169E3);
            if (NullChecker.m82486a(merchandiseM115897L0) && NullChecker.m82486a(merchandiseM115897L0.defaultStockKeepUnit) && NullChecker.m82486a(merchandiseM115897L0.defaultStockKeepUnit.affiliateProducts)) {
                String str = merchandiseM115897L0.defaultStockKeepUnit.affiliateProducts.googleplay;
                if (!TextUtils.isEmpty(str)) {
                    String strM110200H = cjj.m110200H(str.trim());
                    if (!TextUtils.isEmpty(strM110200H)) {
                        return strM110200H;
                    }
                }
            }
            if (NullChecker.m82486a(merchandiseM115897L0) && NullChecker.m82486a(merchandiseM115897L0.defaultStockKeepUnit) && NullChecker.m82486a(merchandiseM115897L0.defaultStockKeepUnit.prices)) {
                return m115898M0(merchandiseM115897L0.defaultStockKeepUnit.prices);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: O0 */
    public final CharSequence m115913O0() {
        String strString;
        if ((this.f88681f0 || CoreModule.f18264c.f20438x0.m31186P3()) && this.f115695r == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && NullChecker.m82486a(this.f115701x)) {
            CharSequence charSequenceM115910J0 = m115910J0();
            if (!TextUtils.isEmpty(charSequenceM115910J0)) {
                return charSequenceM115910J0;
            }
        }
        String strString2 = this.f88684i0;
        if (!t7a.m189553i() || !NullChecker.m82486a(this.f115701x)) {
            return strString2;
        }
        boolean zM82486a = NullChecker.m82486a(this.f115701x.m54705d());
        C8928d c8928d = this.f115701x;
        C8928d.a aVarM54705d = zM82486a ? c8928d.m54705d() : c8928d.m54703b();
        if (wib0.m206579w(this.f115695r)) {
            strString2 = (CoreModule.f18264c.f20381e0.m116600p9().isVIP() || CoreModule.f18264c.f20381e0.m116600p9().isVIPExpired()) ? this.f115694q.string(R$string.f28453t3) : this.f115694q.string(R$string.f28442s3);
        } else {
            PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            PurchaseType purchaseType2 = this.f115695r;
            if (purchaseType == purchaseType2) {
                this.f88676a0.setTextColor(this.f115694q.color(h9c0.f108333C));
                boolean zM146388g4 = joa.m146388g4();
                Act act = this.f115694q;
                strString = zM146388g4 ? act.string(R$string.f28453t3) : act.string(R$string.f28442s3);
            } else if (wib0.m206578v(purchaseType2)) {
                this.f88676a0.setTextColor(this.f115694q.color(h9c0.f108333C));
                boolean zM146398l4 = joa.m146398l4();
                Act act2 = this.f115694q;
                strString = zM146398l4 ? act2.string(R$string.f28453t3) : act2.string(R$string.f28442s3);
            }
            strString2 = strString;
        }
        return aVarM54705d.m54764g() + strString2;
    }

    /* JADX INFO: renamed from: P0 */
    public final CharSequence m115914P0() {
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
        if (wib0.m206575s(purchaseType2)) {
            int i = R$string.f28223Z9;
            int i2 = R$string.f27948A9;
            if (CoreModule.m30933P().m143405a().mo180296B()) {
                i = R$string.f28486w3;
                i2 = R$string.f28475v3;
            }
            long jMo34296Bn = CoreModule.m30933P().m143405a().mo34296Bn();
            Act act = this.f115694q;
            return jMo34296Bn != 0 ? act.string(i) : act.string(i2);
        }
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        PurchaseType purchaseType4 = this.f115695r;
        if (purchaseType3 == purchaseType4) {
            this.f88676a0.setTextColor(this.f115694q.color(h9c0.f108333C));
            boolean zM146388g4 = joa.m146388g4();
            Act act2 = this.f115694q;
            return zM146388g4 ? act2.string(R$string.f28256c7) : act2.string(R$string.f28244b7);
        }
        if (!wib0.m206578v(purchaseType4)) {
            return null;
        }
        this.f88676a0.setTextColor(this.f115694q.color(h9c0.f108333C));
        boolean zM146398l4 = joa.m146398l4();
        Act act3 = this.f115694q;
        return zM146398l4 ? act3.string(R$string.f28152T4) : act3.string(R$string.f28141S4);
    }

    /* JADX INFO: renamed from: Q0 */
    public final String m115915Q0() {
        if (!t7a.m189553i() || !NullChecker.m82486a(this.f115701x)) {
            return "";
        }
        boolean zM82486a = NullChecker.m82486a(this.f115701x.m54705d());
        C8928d c8928d = this.f115701x;
        C8928d.a aVarM54705d = zM82486a ? c8928d.m54705d() : c8928d.m54703b();
        PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        PurchaseType purchaseType2 = this.f115695r;
        if (purchaseType == purchaseType2 || wib0.m206578v(purchaseType2)) {
            this.f88671V.setTextColor(Color.parseColor("#99232323"));
        }
        double d = (Double.parseDouble(aVarM54705d.m54772k()) * ((double) aVarM54705d.m54788w())) - aVarM54705d.m54785t();
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return "";
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        return String.format(this.f115694q.getString(R$string.f28291f6), aVarM54705d.m54766h() + numberInstance.format(d));
    }

    /* JADX INFO: renamed from: R0 */
    public final String m115916R0() {
        if (!t7a.m189553i() || !NullChecker.m82486a(this.f115701x)) {
            return "";
        }
        boolean zM82486a = NullChecker.m82486a(this.f115701x.m54705d());
        C8928d c8928d = this.f115701x;
        C8928d.a aVarM54705d = zM82486a ? c8928d.m54705d() : c8928d.m54703b();
        PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        PurchaseType purchaseType2 = this.f115695r;
        if (purchaseType == purchaseType2 || wib0.m206578v(purchaseType2)) {
            this.f88670U.setTextColor(Color.parseColor("#CC000000"));
        }
        return String.format(this.f115694q.getString(R$string.f28327i6), aVarM54705d.m54764g());
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m115917S0() {
        if (IntlCountryCodeController.m29123t() || this.f115695r == PurchaseType.TYPE_ULTRA_PREMIUM) {
            return false;
        }
        return this.f88679d0 || this.f88680e0;
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m115918U0(View view) {
        m115906F0();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m115919V0(View view) {
        String str;
        if (!this.f88680e0) {
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
        m115943n1(str2, str);
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m115921X0(Long l2) {
        SVGAnimationView sVGAnimationView = this.f88668S;
        if (sVGAnimationView != null) {
            sVGAnimationView.startAnimation();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m115922Y0(String str, IntlWebPayPaymentEnvelope intlWebPayPaymentEnvelope) {
        this.f115694q.progressDismiss();
        if (NullChecker.m82486a(intlWebPayPaymentEnvelope.data)) {
            Act act = this.f115694q;
            String str2 = "tantan://intlNativeRecharge?url=" + intlWebPayPaymentEnvelope.data.paymentRequest;
            String strM162662u3 = CoreModule.f18264c.f20362X1.m162662u3();
            IntlWebPayPaymentData intlWebPayPaymentData = intlWebPayPaymentEnvelope.data;
            otp0.m169161b(act, str2, str, strM162662u3, intlWebPayPaymentData.hideNavigationBar, intlWebPayPaymentData.hardwareAccelerated, intlWebPayPaymentData.isUseMkWebView);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m115923Z0(Throwable th) {
        this.f115694q.progressDismiss();
    }

    @Override // p153l.im60, p153l.i2m
    /* JADX INFO: renamed from: a */
    public View mo115924a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f115694q.inflater().inflate(rec0.f162500U2, viewGroup, false);
        m115905E0(viewInflate);
        m115907G0(viewInflate);
        if (!gta.m132210e().m132214d().mo34662B8().get().isEmpty()) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(gta.m132210e().m132214d().mo34662B8().get());
            if (userM116503Pa == null || userM116503Pa.isFemale()) {
                this.f88684i0 = this.f115694q.getString(R$string.f28416q);
            } else {
                this.f88684i0 = this.f115694q.getString(R$string.f28427r);
            }
        } else if (C4880a0.m32390j().f20268e.get().booleanValue()) {
            this.f88684i0 = this.f115694q.getString(R$string.f28323i2);
        } else {
            this.f88684i0 = m115914P0().toString();
        }
        m115945p1();
        bnl0.m105524M(this.f88676a0, false);
        this.f88673X.setText(this.f88684i0);
        m115946u();
        qnp0.m177261d1(this.f88668S, qa00.f156322i);
        this.f88668S.setAlpha(153);
        SVGALoader.with(this.f115694q).from("https://auto.tancdn.com/v1/raw/051048fc-7b33-41f3-a36c-1004f82d5167.pdf").autoPlay(false).repeatCount(1).into(this.f88668S);
        return viewInflate;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m115925a1(String str, double d, String str2, boolean z, String str3) {
        String str4 = z ? "duration_switch" : "buy_button";
        pf60 pf60VarM147494Y = jyb.m147494Y("platform", "googleplay");
        pf60 pf60VarM147494Y2 = jyb.m147494Y("productType", str3);
        pf60 pf60VarM147494Y3 = jyb.m147494Y("skuID", str);
        String str5 = this.f115697t;
        if (str5 == null) {
            str5 = "";
        }
        i4g0.m138523u("e_purchase_button", "p_purchase_page", pf60VarM147494Y, pf60VarM147494Y2, pf60VarM147494Y3, jyb.m147494Y("purchaseShowFrom", str5), jyb.m147494Y("first_carousel_page", mib0.m158484m(this.f88678c0)), jyb.m147494Y(FirebaseAnalytics.Param.PRICE, Double.valueOf(d)), jyb.m147494Y("click_area", str4), jyb.m147494Y("currency_code", str2), jyb.m147494Y("if_weekly_premium_boost_get", Integer.valueOf(this.f88682g0 ? 1 : 0)));
    }

    @Override // p153l.im60, p153l.i2m
    /* JADX INFO: renamed from: b */
    public void mo115926b(C8928d c8928d) {
        super.mo115926b(c8928d);
        boolean zM54714m = this.f115701x.m54714m();
        C8928d c8928d2 = this.f115701x;
        m115929c1(zM54714m ? c8928d2.m54703b() : c8928d2.m54705d());
    }

    /* JADX INFO: renamed from: b1 */
    public final void m115927b1(boolean z, String str, y20<Integer> y20Var, C8928d.a aVar, boolean z2) {
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
            m115925a1(str3, d, str2, z2, aVar.m54762f().toString());
            if (NullChecker.m82486a(str2)) {
                uqb0.m197269e1("purchase_button_click", FirebaseAnalytics.Param.CURRENCY, str2, "platform", "android");
            }
        } catch (Throwable th) {
            CrashHelper.m82479c(new IllegalStateException("Failed to generate payment params", th));
        }
        hso hsoVar = new hso(this.f115694q, this.f115695r);
        hsoVar.m137012u(this.f115662B);
        hsoVar.m137011t(new C16537b(this.f115694q, this.f115695r, aVar, str, this));
        hsoVar.m137010s(y20Var);
        hsoVar.m137009r(true);
        if (t7a.m189547c() || !CoreModule.m30933P().m143405a().mo34445Xi() || this.f115695r != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || ijj.m140191c().f115233c.get().isEmpty()) {
            Act act = this.f115694q;
            hsoVar.m137007p(aso.m99953h(act, act instanceof PutongAct ? ((PutongAct) act).iap().m103295i() : null), z, str);
        } else {
            Act act2 = this.f115694q;
            hsoVar.m137008q(aso.m99953h(act2, act2 instanceof PutongAct ? ((PutongAct) act2).iap().m103295i() : null), z, ijj.m140191c().f115234d.get(), ijj.m140191c().m140192a(this.f115695r));
        }
    }

    @Override // p153l.im60
    /* JADX INFO: renamed from: c0 */
    public void mo115928c0(View.OnClickListener onClickListener) {
        if (NullChecker.m82486a(this.f88677b0)) {
            this.f88677b0.setTextColor(k3d0.m148005a(wib0.m206573q(this.f115695r) ? h9c0.f108333C : h9c0.f108389q));
            bnl0.m105524M(this.f88677b0, true);
            bnl0.m105509E0(this.f88677b0, onClickListener);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m115929c1(C8928d.a aVar) {
        m115944o1();
        this.f88668S.stopAnimation(true);
        bnl0.m105524M(this.f88668S, false);
        if (TEnum.equals(aVar.m54762f(), ProductCategory.tttVipUpgradeToPremium) || TEnum.equals(aVar.m54762f(), ProductCategory.tttSeeUpgradeToPremium) || TEnum.equals(aVar.m54762f(), ProductCategory.tttPremiumUpgradeToUltra) || TEnum.equals(aVar.m54762f(), ProductCategory.Promo_premiumUpgradeToUltra)) {
            bnl0.m105524M(this.f88676a0, false);
            bnl0.m105524M(this.f88672W, false);
            bnl0.m105524M(this.f88667R, true);
            this.f88670U.setText(m115916R0());
            this.f88671V.setText(m115915Q0());
            bnl0.m105524M(this.f88668S, true);
            m115940k1();
        } else if (m115911K0()) {
            bnl0.m105524M(this.f88672W, true);
            bnl0.m105524M(this.f88676a0, true);
            bnl0.m105524M(this.f88667R, false);
            String str = String.format("%s %s", aVar.m54784s().defaultStockKeepUnit.prices.currencySymbol, a9g0.m96567b((aVar.m54784s().defaultStockKeepUnit.prices.price / ((double) aVar.m54788w())) * 0.8500000238418579d));
            if (IntlCountryCodeController.m29114k()) {
                this.f88676a0.setText(R$string.f28161U2);
            } else {
                boolean zM189553i = t7a.m189553i();
                VText vText = this.f88676a0;
                if (zM189553i) {
                    vText.setText(m115913O0());
                } else {
                    vText.setText(R$string.f28130R4);
                }
            }
            String strM162656o3 = CoreModule.f18264c.f20362X1.m162656o3();
            boolean zIsEmpty = TextUtils.isEmpty(strM162656o3);
            VText vText2 = this.f88673X;
            if (zIsEmpty) {
                boolean z = this.f88680e0;
                Act act = this.f115694q;
                vText2.setText(z ? act.getString(R$string.f27975D3) : act.getString(R$string.f27964C3, "15%", str));
            } else {
                vText2.setText(strM162656o3);
            }
            if (this.f88680e0) {
                i4g0.m138492A("e_purchase_button_web", "p_purchase_page", jyb.m147494Y("productType", this.f115695r.productCategory().toString()));
            } else {
                i4g0.m138526x("e_web_purchase", "p_purchase_page");
            }
        } else if (this.f88683h0 && m115917S0()) {
            bnl0.m105524M(this.f88672W, true);
            bnl0.m105524M(this.f88676a0, false);
            bnl0.m105524M(this.f88667R, false);
            m115936h1(m115930d1());
        } else {
            bnl0.m105524M(this.f88672W, true);
            bnl0.m105524M(this.f88676a0, false);
            bnl0.m105524M(this.f88667R, false);
            m115936h1(m115913O0());
        }
        m115908H0();
    }

    /* JADX INFO: renamed from: d1 */
    public final CharSequence m115930d1() {
        if (IntlCountryCodeController.m29114k()) {
            return this.f115694q.getString(R$string.f28161U2);
        }
        return t7a.m189553i() ? m115913O0() : this.f115694q.getString(R$string.f28130R4);
    }

    /* JADX INFO: renamed from: e1 */
    public final String m115931e1(C8928d.a aVar) {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        String strM54770j = aVar.m54770j();
        if (!TextUtils.isEmpty(strM54770j)) {
            return strM54770j;
        }
        Merchandise merchandiseM54784s = aVar.m54784s();
        if (merchandiseM54784s != null && (stockKeepUnit = merchandiseM54784s.defaultStockKeepUnit) != null && (prices = stockKeepUnit.prices) != null) {
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            String strM54766h = aVar.m54766h();
            if (TextUtils.isEmpty(strM54766h) && (strM54766h = prices.currencySymbol) == null) {
                strM54766h = "";
            }
            if (prices.originalPrice > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return strM54766h + numberInstance.format(prices.originalPrice);
            }
            int iM54788w = aVar.m54788w();
            if (prices.originalUnitPrice > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && iM54788w > 0) {
                return strM54766h + numberInstance.format(prices.originalUnitPrice * ((double) iM54788w));
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: f1 */
    public final C8928d.a m115932f1() {
        if (!NullChecker.m82486a(this.f115701x)) {
            return null;
        }
        boolean zM82486a = NullChecker.m82486a(this.f115701x.m54705d());
        C8928d c8928d = this.f115701x;
        return zM82486a ? c8928d.m54705d() : c8928d.m54703b();
    }

    @Override // p153l.im60
    /* JADX INFO: renamed from: g0 */
    public void mo115933g0(C8928d c8928d) {
        C8928d c8928d2;
        C8928d.a aVarM54703b = c8928d.m54714m() ? c8928d.m54703b() : c8928d.m54705d();
        boolean z = c8928d.f35377k && (c8928d2 = this.f115701x) != null && c8928d2 != c8928d && (TextUtils.equals(aVarM54703b.m54762f().toString(), ProductCategory.tttVip) || TextUtils.equals(aVarM54703b.m54762f().toString(), ProductCategory.tttSvipGoogleplay) || TextUtils.equals(aVarM54703b.m54762f().toString(), ProductCategory.tttSeeWhoLikedMe));
        super.mo115933g0(c8928d);
        if (z) {
            m115906F0();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m115934g1(boolean z) {
        this.f88681f0 = z;
    }

    @Override // p153l.im60
    /* JADX INFO: renamed from: h0 */
    public void mo115935h0(Privilege privilege) {
        this.f88678c0 = privilege;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m115936h1(CharSequence charSequence) {
        boolean z = charSequence instanceof Spanned;
        VText vText = this.f88673X;
        if (z) {
            vText.setText(charSequence, TextView.BufferType.SPANNABLE);
        } else {
            vText.setText(charSequence);
        }
    }

    @Override // p153l.im60, p153l.i2m
    /* JADX INFO: renamed from: i */
    public void mo115937i(y20<Integer> y20Var) {
        this.f88685j0 = y20Var;
        m115908H0();
    }

    /* JADX INFO: renamed from: i1 */
    public void m115938i1(boolean z) {
        this.f88682g0 = z;
    }

    /* JADX INFO: renamed from: j1 */
    public void m115939j1(boolean z) {
        this.f88683h0 = z;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m115940k1() {
        Animator animatorM132168n = gt0.m132168n(this.f88667R, gt0.f106354i, 1.0f, 1.0f);
        Animator animatorM132168n2 = gt0.m132168n(this.f88667R, gt0.f106354i, 1.0f, 0.96f);
        Animator animatorM132168n3 = gt0.m132168n(this.f88667R, gt0.f106354i, 0.96f, 1.03f);
        Animator animatorM132168n4 = gt0.m132168n(this.f88667R, gt0.f106354i, 1.03f, 1.0f);
        animatorM132168n.setDuration(500L);
        animatorM132168n2.setDuration(333L);
        animatorM132168n3.setDuration(333L);
        animatorM132168n4.setDuration(333L);
        animatorM132168n.setInterpolator(this.f88688m0);
        animatorM132168n2.setInterpolator(this.f88688m0);
        animatorM132168n3.setInterpolator(this.f88688m0);
        animatorM132168n4.setInterpolator(this.f88688m0);
        gt0.m132160f(gt0.m132175u(false, null, -1L, animatorM132168n, animatorM132168n2, animatorM132168n3, animatorM132168n4), new Runnable() { // from class: l.yhn
            @Override // java.lang.Runnable
            public final void run() {
                this.f199978a.m115920W0();
            }
        }).start();
    }

    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public final void m115920W0() {
        psd0.m173633z(this.f88689n0);
        this.f88689n0 = this.f115694q.duringCreated(C22421c.interval(0L, 2250L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.bin
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76899a.m115921X0((Long) obj);
            }
        }, new y20() { // from class: l.cin
            @Override // p153l.y20
            public final void call(Object obj) {
                din.m115902x0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public final void m115942m1(String str) {
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

    /* JADX INFO: renamed from: n1 */
    public final void m115943n1(String str, String str2) {
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
        act2.duringCreated(nd9Var.m162652k3(nd9Var.m162654m3(), str, str2)).subscribe(psd0.m173600K(new y20() { // from class: l.zhn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204436a.m115922Y0(strM163316f, (IntlWebPayPaymentEnvelope) obj);
            }
        }, new y20() { // from class: l.ain
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71548a.m115923Z0((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: o1 */
    public final void m115944o1() {
        psd0.m173633z(this.f88689n0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX INFO: renamed from: p1 */
    public final void m115945p1() {
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
        this.f88679d0 = z;
        this.f88680e0 = CoreModule.f18264c.f20362X1.m162657p3();
    }

    /* JADX INFO: renamed from: u */
    public final void m115946u() {
        int i = jbc0.f119764t1;
        int color = CoreModule.f18263b.getResources().getColor(h9c0.f108369g);
        if (wib0.m206575s(this.f115695r)) {
            i = jbc0.f119722q1;
            color = CoreModule.f18263b.getResources().getColor(h9c0.f108398u0);
        } else if (wib0.m206573q(this.f115695r)) {
            i = jbc0.f119736r1;
        } else if (wib0.m206578v(this.f115695r)) {
            i = jbc0.f119750s1;
            color = Color.parseColor("#CC000000");
        }
        this.f88673X.setTextColor(color);
        this.f88672W.setBackgroundDrawable(this.f115694q.drawable(i));
        this.f88667R.setBackgroundDrawable(this.f115694q.drawable(i));
    }

    @Override // p153l.im60, p153l.i2m
    public void release() {
    }
}
