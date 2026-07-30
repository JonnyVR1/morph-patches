package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4729a0;
import com.p046p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p046p1.mobile.putong.core.data.AffiliateProducts;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p046p1.mobile.putong.core.data.IntlWebPayPaymentData;
import com.p046p1.mobile.putong.core.data.IntlWebPayPaymentEnvelope;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dgn extends de60 {

    /* JADX INFO: renamed from: R */
    public VFrame f86118R;

    /* JADX INFO: renamed from: S */
    public SVGAnimationView f86119S;

    /* JADX INFO: renamed from: T */
    public VLinear f86120T;

    /* JADX INFO: renamed from: U */
    public VText f86121U;

    /* JADX INFO: renamed from: V */
    public VText f86122V;

    /* JADX INFO: renamed from: W */
    public VFrame f86123W;

    /* JADX INFO: renamed from: X */
    public VText f86124X;

    /* JADX INFO: renamed from: Y */
    public VFrame f86125Y;

    /* JADX INFO: renamed from: Z */
    public VText f86126Z;

    /* JADX INFO: renamed from: a0 */
    public VText f86127a0;

    /* JADX INFO: renamed from: b0 */
    public TextView f86128b0;

    /* JADX INFO: renamed from: c0 */
    public Privilege f86129c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f86130d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f86131e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f86132f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f86133g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f86134h0;

    /* JADX INFO: renamed from: i0 */
    public String f86135i0;

    /* JADX INFO: renamed from: j0 */
    public e30 f86136j0;

    /* JADX INFO: renamed from: k0 */
    public View.OnClickListener f86137k0;

    /* JADX INFO: renamed from: l0 */
    public View.OnClickListener f86138l0;

    /* JADX INFO: renamed from: m0 */
    public Interpolator f86139m0;

    /* JADX INFO: renamed from: n0 */
    public c4g0 f86140n0;

    /* JADX INFO: renamed from: l.dgn$a */
    public class RunnableC16364a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f86141a;

        public RunnableC16364a(View view) {
            this.f86141a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = this.f86141a;
            if (view != null) {
                gbl0.m125195g0(view);
            }
        }
    }

    /* JADX INFO: renamed from: l.dgn$b */
    public static class C16365b extends qlw {

        /* JADX INFO: renamed from: e */
        public final C8765d.a f86143e;

        /* JADX INFO: renamed from: f */
        public final String f86144f;

        /* JADX INFO: renamed from: g */
        public final Merchandise f86145g;

        public C16365b(Act act, PurchaseType purchaseType, C8765d.a aVar, String str, f1m f1mVar) {
            super(act, purchaseType, f1mVar);
            this.f86143e = aVar;
            this.f86144f = str;
            this.f86145g = aVar.m53601s();
        }

        /* JADX INFO: renamed from: A */
        public final void m111720A() {
            if (this.f86145g == null || !CoreModule.m29935P().m94651a().mo33442Xi()) {
                return;
            }
            boolean zM129476i = h6a.m129476i();
            Merchandise merchandise = this.f86145g;
            if (zM129476i) {
                if (merchandise.monthly()) {
                    ogj.m164200c().f143865b.onNext(0);
                    return;
                } else if (this.f86145g.quarterly()) {
                    ogj.m164200c().f143865b.onNext(1);
                    return;
                } else {
                    if (this.f86145g.yearly()) {
                        ogj.m164200c().f143865b.onNext(2);
                        return;
                    }
                    return;
                }
            }
            if (merchandise.monthly()) {
                ogj.m164200c().f143865b.onNext(2);
            } else if (this.f86145g.quarterly()) {
                ogj.m164200c().f143865b.onNext(1);
            } else if (this.f86145g.yearly()) {
                ogj.m164200c().f143865b.onNext(0);
            }
        }

        @Override // p149l.qlw, p149l.ue50
        /* JADX INFO: renamed from: a */
        public void mo30845a() {
            m111720A();
            super.mo30845a();
        }

        @Override // p149l.qlw, p149l.ue50
        /* JADX INFO: renamed from: c */
        public void mo30846c() {
            m111720A();
            super.mo30846c();
        }

        @Override // p149l.qlw
        /* JADX INFO: renamed from: x */
        public Object[] mo111721x() {
            try {
                if (NullChecker.m81303a(this.f86143e.m53601s())) {
                    Prices prices = this.f86143e.m53601s().defaultStockKeepUnit.prices;
                    return new Object[]{FirebaseAnalytics.Param.CURRENCY, prices.currencyCode, "value", Double.valueOf(prices.price), "skuID", this.f86144f, "platform", "android"};
                }
            } catch (Throwable th) {
                CrashHelper.m81296c(new IllegalStateException("Failed to generate payment params", th));
            }
            return qlw.f155260d;
        }
    }

    public dgn(Act act, PurchaseType purchaseType) {
        super(act, purchaseType);
        this.f86130d0 = false;
        this.f86131e0 = false;
        this.f86132f0 = false;
        this.f86133g0 = false;
        this.f86134h0 = false;
        this.f86137k0 = new View.OnClickListener() { // from class: l.wfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186094a.m111697U0(view);
            }
        };
        this.f86138l0 = new View.OnClickListener() { // from class: l.xfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192698a.m111698V0(view);
            }
        };
        this.f86139m0 = new LinearInterpolator();
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ Boolean m111672A0(String str, String str2, Merchandise merchandise) {
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
        return !TextUtils.isEmpty(str2) ? Boolean.valueOf(TextUtils.equals(CoreIntlAffiliatePromotions.m30161l3(strTrim, str2), str)) : Boolean.valueOf(CoreIntlAffiliatePromotions.m30143Q3(str, strTrim));
    }

    /* JADX INFO: renamed from: L0 */
    public static Merchandise m111676L0(IapAffiliatePromotion iapAffiliatePromotion) {
        final String strTrim = iapAffiliatePromotion.iapId.trim();
        String str = iapAffiliatePromotion.offerId;
        final String strTrim2 = str != null ? str.trim() : "";
        List<Merchandise> listM221515e = CoreModule.f17545c.f19654j0.m30580E4().m221515e();
        if (vwb.m200296J(listM221515e)) {
            return null;
        }
        return (Merchandise) vwb.m200346r(listM221515e, new w9j() { // from class: l.vfn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return dgn.m111672A0(strTrim, strTrim2, (Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public static String m111677M0(Prices prices) {
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
    public static boolean m111678T0(IapAffiliatePromotion iapAffiliatePromotion) {
        return CoreIntlAffiliatePromotions.m30146V3(iapAffiliatePromotion);
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m111681x0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ y6q0 m111682y0(int i, int i2, int i3, int i4, View view, y6q0 y6q0Var) {
        view.setPadding(i, i2, i3, i4 + y6q0Var.m213179f(y6q0.C21326l.m213234d()).f160975d);
        return y6q0Var;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m111684E0(View view) {
        egn.m116296a(this, view);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m111685F0() {
        IapAffiliatePromotion iapAffiliatePromotionM30171E3;
        IapAffiliatePromotion iapAffiliatePromotionM30221v3;
        if (!NullChecker.m81303a(this.f85759x)) {
            if (NullChecker.m81303a(this.f86136j0)) {
                igj.m136008L().subscribe(mkd0.m154950B());
                this.f86136j0.call(0);
                return;
            }
            return;
        }
        boolean zM53531m = this.f85759x.m53531m();
        C8765d c8765d = this.f85759x;
        C8765d.a aVarM53520b = zM53531m ? c8765d.m53520b() : c8765d.m53522d();
        if (NullChecker.m81303a(aVarM53520b) && NullChecker.m81303a(aVarM53520b.m53601s())) {
            Merchandise merchandiseM53601s = aVarM53520b.m53601s();
            String productId = merchandiseM53601s.defaultStockKeepUnit.affiliateProducts.getProductId();
            PurchaseType purchaseType = this.f85753r;
            PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            if (purchaseType == purchaseType2 && !IntlCountryCodeController.m28115k()) {
                String str = merchandiseM53601s.defaultStockKeepUnit.affiliateProducts.googleplay;
                IapAffiliatePromotion iapAffiliatePromotionM30171E4 = CoreModule.f17545c.f19696x0.m30171E3();
                if (iapAffiliatePromotionM30171E4 == null && this.f86132f0 && (iapAffiliatePromotionM30221v3 = CoreModule.f17545c.f19696x0.m30221v3(merchandiseM53601s)) != null && !CoreModule.f17545c.f19696x0.m30197f4(iapAffiliatePromotionM30221v3)) {
                    if (m111128J()) {
                        m4p.m153085k(this.f85752q, m4p.m153077c());
                    }
                    IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM30184L3 = CoreModule.f17545c.f19696x0.m30184L3(iapAffiliatePromotionM30221v3);
                    osi0.m165783g((iapAffiliatePromotionDisplaySlotM30184L3 == null || TextUtils.isEmpty(iapAffiliatePromotionDisplaySlotM30184L3.interceptToast)) ? this.f85752q.getString(R$string.f27192J2) : iapAffiliatePromotionDisplaySlotM30184L3.interceptToast.trim());
                    return;
                }
                boolean z = this.f86132f0 || CoreModule.f17545c.f19696x0.m30188P3();
                if (iapAffiliatePromotionM30171E4 != null && z) {
                    String str2 = iapAffiliatePromotionM30171E4.iapId;
                    if (TextUtils.isEmpty(str2 == null ? "" : str2.trim())) {
                        if (m111128J()) {
                            m4p.m153085k(this.f85752q, m4p.m153078d());
                            return;
                        }
                        return;
                    }
                }
                if (iapAffiliatePromotionM30171E4 != null && z && CoreIntlAffiliatePromotions.m30143Q3(iapAffiliatePromotionM30171E4.iapId, str)) {
                    productId = CoreIntlAffiliatePromotions.m30162m3(str, iapAffiliatePromotionM30171E4.iapId, iapAffiliatePromotionM30171E4.offerId);
                }
            }
            if (m111128J() && this.f85753r == purchaseType2 && (iapAffiliatePromotionM30171E3 = CoreModule.f17545c.f19696x0.m30171E3()) != null) {
                m4p.m153086l(this.f85752q, aVarM53520b, iapAffiliatePromotionM30171E3);
            }
            String str3 = productId;
            m111704b1(merchandiseM53601s.autoRenewable(), str3, this.f86136j0, aVarM53520b, this.f85759x.f34529k);
            m111715m1(str3);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m111686G0(View view) {
        if (view == null) {
            return;
        }
        final int paddingLeft = view.getPaddingLeft();
        final int paddingTop = view.getPaddingTop();
        final int paddingRight = view.getPaddingRight();
        final int paddingBottom = view.getPaddingBottom();
        gbl0.m125231y0(view, new bd50() { // from class: l.ufn
            @Override // p149l.bd50
            public final y6q0 onApplyWindowInsets(View view2, y6q0 y6q0Var) {
                return dgn.m111682y0(paddingLeft, paddingTop, paddingRight, paddingBottom, view2, y6q0Var);
            }
        });
        if (view.isAttachedToWindow()) {
            gbl0.m125195g0(view);
        } else {
            view.post(new RunnableC16364a(view));
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m111687H0() {
        xdl0.m208329E0(this.f86123W, m111690K0() ? this.f86138l0 : this.f86137k0);
        xdl0.m208329E0(this.f86118R, this.f86137k0);
        xdl0.m208329E0(this.f86127a0, this.f86137k0);
    }

    /* JADX INFO: renamed from: I0 */
    public final CharSequence m111688I0(C8765d.a aVar) {
        String strM111691N0 = m111691N0();
        String string = this.f85752q.getString(R$string.f27115C2);
        if (TextUtils.isEmpty(strM111691N0)) {
            return string;
        }
        String string2 = this.f85752q.getString(R$string.f27126D2, strM111691N0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f85752q.color(b1c0.f72517G)), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append('\n');
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f85752q.color(b1c0.f72518H)), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(Math.max(1, Math.round(this.f85752q.getResources().getDisplayMetrics().scaledDensity * 15.0f)), false), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: J0 */
    public final CharSequence m111689J0() {
        String string;
        C8765d.a aVarM111708f1 = m111708f1();
        if (!NullChecker.m81303a(aVarM111708f1)) {
            return "";
        }
        IapAffiliatePromotion iapAffiliatePromotionM30171E3 = CoreModule.f17545c.f19696x0.m30171E3();
        if (m111678T0(iapAffiliatePromotionM30171E3) && CoreModule.f17545c.f19696x0.m30203l4(aVarM111708f1.m53601s())) {
            return m111688I0(aVarM111708f1);
        }
        String strM53581g = aVarM111708f1.m53581g();
        if (TextUtils.isEmpty(strM53581g)) {
            strM53581g = aVarM111708f1.m53591l();
        }
        if (TextUtils.isEmpty(strM53581g)) {
            strM53581g = aVarM111708f1.m53608z();
        }
        if (TextUtils.isEmpty(strM53581g)) {
            return "";
        }
        int iM53605w = aVarM111708f1.m53605w();
        String strM111707e1 = m111707e1(aVarM111708f1);
        Merchandise merchandiseM53601s = aVarM111708f1.m53601s();
        if (merchandiseM53601s == null || !merchandiseM53601s.weekly()) {
            Act act = this.f85752q;
            string = iM53605w == 1 ? act.getString(R$string.f27247O2, String.valueOf(iM53605w), strM53581g) : act.getString(R$string.f27258P2, String.valueOf(iM53605w), strM53581g);
        } else {
            string = this.f85752q.getString(iM53605w == 1 ? R$string.f27269Q2 : R$string.f27280R2, String.valueOf(iM53605w), strM53581g);
        }
        if ((iapAffiliatePromotionM30171E3 != null && !this.f86132f0) || TextUtils.isEmpty(strM111707e1) || TextUtils.equals(strM111707e1.trim(), strM53581g.trim())) {
            return string;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append(' ');
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) strM111707e1);
        spannableStringBuilder.setSpan(new StrikethroughSpan(), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m111690K0() {
        if (IntlCountryCodeController.m28124t() || this.f85753r == PurchaseType.TYPE_ULTRA_PREMIUM || this.f86134h0) {
            return false;
        }
        return this.f86130d0 || this.f86131e0;
    }

    /* JADX INFO: renamed from: N0 */
    public final String m111691N0() {
        IapAffiliatePromotion iapAffiliatePromotionM30171E3 = CoreModule.f17545c.f19696x0.m30171E3();
        if (iapAffiliatePromotionM30171E3 != null && !TextUtils.isEmpty(iapAffiliatePromotionM30171E3.iapId)) {
            String strM136005I = igj.m136005I(iapAffiliatePromotionM30171E3.iapId, iapAffiliatePromotionM30171E3.offerId);
            if (!TextUtils.isEmpty(strM136005I)) {
                return strM136005I;
            }
            Merchandise merchandiseM111676L0 = m111676L0(iapAffiliatePromotionM30171E3);
            if (NullChecker.m81303a(merchandiseM111676L0) && NullChecker.m81303a(merchandiseM111676L0.defaultStockKeepUnit) && NullChecker.m81303a(merchandiseM111676L0.defaultStockKeepUnit.affiliateProducts)) {
                String str = merchandiseM111676L0.defaultStockKeepUnit.affiliateProducts.googleplay;
                if (!TextUtils.isEmpty(str)) {
                    String strM136004H = igj.m136004H(str.trim());
                    if (!TextUtils.isEmpty(strM136004H)) {
                        return strM136004H;
                    }
                }
            }
            if (NullChecker.m81303a(merchandiseM111676L0) && NullChecker.m81303a(merchandiseM111676L0.defaultStockKeepUnit) && NullChecker.m81303a(merchandiseM111676L0.defaultStockKeepUnit.prices)) {
                return m111677M0(merchandiseM111676L0.defaultStockKeepUnit.prices);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: O0 */
    public final CharSequence m111692O0() {
        String strString;
        if ((this.f86132f0 || CoreModule.f17545c.f19696x0.m30188P3()) && this.f85753r == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && NullChecker.m81303a(this.f85759x)) {
            CharSequence charSequenceM111689J0 = m111689J0();
            if (!TextUtils.isEmpty(charSequenceM111689J0)) {
                return charSequenceM111689J0;
            }
        }
        String strString2 = this.f86135i0;
        if (!h6a.m129476i() || !NullChecker.m81303a(this.f85759x)) {
            return strString2;
        }
        boolean zM81303a = NullChecker.m81303a(this.f85759x.m53522d());
        C8765d c8765d = this.f85759x;
        C8765d.a aVarM53522d = zM81303a ? c8765d.m53522d() : c8765d.m53520b();
        if (sab0.m182905w(this.f85753r)) {
            strString2 = (CoreModule.f17545c.f19639e0.m169527p9().isVIP() || CoreModule.f17545c.f19639e0.m169527p9().isVIPExpired()) ? this.f85752q.string(R$string.f27605t3) : this.f85752q.string(R$string.f27594s3);
        } else {
            PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            PurchaseType purchaseType2 = this.f85753r;
            if (purchaseType == purchaseType2) {
                this.f86127a0.setTextColor(this.f85752q.color(b1c0.f72513C));
                boolean zM210073f4 = xma.m210073f4();
                Act act = this.f85752q;
                strString = zM210073f4 ? act.string(R$string.f27605t3) : act.string(R$string.f27594s3);
            } else if (sab0.m182904v(purchaseType2)) {
                this.f86127a0.setTextColor(this.f85752q.color(b1c0.f72513C));
                boolean zM210083k4 = xma.m210083k4();
                Act act2 = this.f85752q;
                strString = zM210083k4 ? act2.string(R$string.f27605t3) : act2.string(R$string.f27594s3);
            }
            strString2 = strString;
        }
        return aVarM53522d.m53581g() + strString2;
    }

    /* JADX INFO: renamed from: P0 */
    public final CharSequence m111693P0() {
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
        if (sab0.m182901s(purchaseType2)) {
            int i = R$string.f27375Z9;
            int i2 = R$string.f27100A9;
            if (CoreModule.m29935P().m94651a().mo158204B()) {
                i = R$string.f27638w3;
                i2 = R$string.f27627v3;
            }
            long jMo33293Bn = CoreModule.m29935P().m94651a().mo33293Bn();
            Act act = this.f85752q;
            return jMo33293Bn != 0 ? act.string(i) : act.string(i2);
        }
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        PurchaseType purchaseType4 = this.f85753r;
        if (purchaseType3 == purchaseType4) {
            this.f86127a0.setTextColor(this.f85752q.color(b1c0.f72513C));
            boolean zM210073f4 = xma.m210073f4();
            Act act2 = this.f85752q;
            return zM210073f4 ? act2.string(R$string.f27408c7) : act2.string(R$string.f27396b7);
        }
        if (!sab0.m182904v(purchaseType4)) {
            return null;
        }
        this.f86127a0.setTextColor(this.f85752q.color(b1c0.f72513C));
        boolean zM210083k4 = xma.m210083k4();
        Act act3 = this.f85752q;
        return zM210083k4 ? act3.string(R$string.f27304T4) : act3.string(R$string.f27293S4);
    }

    /* JADX INFO: renamed from: Q0 */
    public final String m111694Q0() {
        if (!h6a.m129476i() || !NullChecker.m81303a(this.f85759x)) {
            return "";
        }
        boolean zM81303a = NullChecker.m81303a(this.f85759x.m53522d());
        C8765d c8765d = this.f85759x;
        C8765d.a aVarM53522d = zM81303a ? c8765d.m53522d() : c8765d.m53520b();
        PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        PurchaseType purchaseType2 = this.f85753r;
        if (purchaseType == purchaseType2 || sab0.m182904v(purchaseType2)) {
            this.f86122V.setTextColor(Color.parseColor("#99232323"));
        }
        double d = (Double.parseDouble(aVarM53522d.m53589k()) * ((double) aVarM53522d.m53605w())) - aVarM53522d.m53602t();
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return "";
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        return String.format(this.f85752q.getString(R$string.f27443f6), aVarM53522d.m53583h() + numberInstance.format(d));
    }

    /* JADX INFO: renamed from: R0 */
    public final String m111695R0() {
        if (!h6a.m129476i() || !NullChecker.m81303a(this.f85759x)) {
            return "";
        }
        boolean zM81303a = NullChecker.m81303a(this.f85759x.m53522d());
        C8765d c8765d = this.f85759x;
        C8765d.a aVarM53522d = zM81303a ? c8765d.m53522d() : c8765d.m53520b();
        PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        PurchaseType purchaseType2 = this.f85753r;
        if (purchaseType == purchaseType2 || sab0.m182904v(purchaseType2)) {
            this.f86121U.setTextColor(Color.parseColor("#CC000000"));
        }
        return String.format(this.f85752q.getString(R$string.f27479i6), aVarM53522d.m53581g());
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m111696S0() {
        if (IntlCountryCodeController.m28124t() || this.f85753r == PurchaseType.TYPE_ULTRA_PREMIUM) {
            return false;
        }
        return this.f86130d0 || this.f86131e0;
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m111697U0(View view) {
        m111685F0();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m111698V0(View view) {
        String str;
        if (!this.f86131e0) {
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
        m111716n1(str2, str);
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m111700X0(Long l2) {
        SVGAnimationView sVGAnimationView = this.f86119S;
        if (sVGAnimationView != null) {
            sVGAnimationView.startAnimation();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m111701Y0(String str, IntlWebPayPaymentEnvelope intlWebPayPaymentEnvelope) {
        this.f85752q.progressDismiss();
        if (NullChecker.m81303a(intlWebPayPaymentEnvelope.data)) {
            Act act = this.f85752q;
            String str2 = "tantan://intlNativeRecharge?url=" + intlWebPayPaymentEnvelope.data.paymentRequest;
            String strM115680u3 = CoreModule.f17545c.f19620X1.m115680u3();
            IntlWebPayPaymentData intlWebPayPaymentData = intlWebPayPaymentEnvelope.data;
            kkp0.m146349b(act, str2, str, strM115680u3, intlWebPayPaymentData.hideNavigationBar, intlWebPayPaymentData.hardwareAccelerated, intlWebPayPaymentData.isUseMkWebView);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m111702Z0(Throwable th) {
        this.f85752q.progressDismiss();
    }

    @Override // p149l.de60, p149l.ozl
    /* JADX INFO: renamed from: a */
    public View mo111145a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f85752q.inflater().inflate(m6c0.f131540U2, viewGroup, false);
        m111684E0(viewInflate);
        m111686G0(viewInflate);
        if (!ura.m195053e().m195057d().mo33659B8().get().isEmpty()) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(ura.m195053e().m195057d().mo33659B8().get());
            if (userM169430Pa == null || userM169430Pa.isFemale()) {
                this.f86135i0 = this.f85752q.getString(R$string.f27568q);
            } else {
                this.f86135i0 = this.f85752q.getString(R$string.f27579r);
            }
        } else if (C4729a0.m31387j().f19526e.get().booleanValue()) {
            this.f86135i0 = this.f85752q.getString(R$string.f27475i2);
        } else {
            this.f86135i0 = m111693P0().toString();
        }
        m111718p1();
        xdl0.m208344M(this.f86127a0, false);
        this.f86124X.setText(this.f86135i0);
        m111719u();
        mep0.m154302d1(this.f86119S, t100.f167260i);
        this.f86119S.setAlpha(153);
        SVGALoader.with(this.f85752q).from("https://auto.tancdn.com/v1/raw/051048fc-7b33-41f3-a36c-1004f82d5167.pdf").autoPlay(false).repeatCount(1).into(this.f86119S);
        return viewInflate;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m111703a1(String str, double d, String str2, boolean z, String str3) {
        String str4 = z ? "duration_switch" : "buy_button";
        j760 j760VarM200311Y = vwb.m200311Y("platform", "googleplay");
        j760 j760VarM200311Y2 = vwb.m200311Y("productType", str3);
        j760 j760VarM200311Y3 = vwb.m200311Y("skuID", str);
        String str5 = this.f85755t;
        if (str5 == null) {
            str5 = "";
        }
        zvf0.m220399u("e_purchase_button", "p_purchase_page", j760VarM200311Y, j760VarM200311Y2, j760VarM200311Y3, vwb.m200311Y("purchaseShowFrom", str5), vwb.m200311Y("first_carousel_page", iab0.m135152m(this.f86129c0)), vwb.m200311Y(FirebaseAnalytics.Param.PRICE, Double.valueOf(d)), vwb.m200311Y("click_area", str4), vwb.m200311Y("currency_code", str2), vwb.m200311Y("if_weekly_premium_boost_get", Integer.valueOf(this.f86133g0 ? 1 : 0)));
    }

    @Override // p149l.de60, p149l.ozl
    /* JADX INFO: renamed from: b */
    public void mo111147b(C8765d c8765d) {
        super.mo111147b(c8765d);
        boolean zM53531m = this.f85759x.m53531m();
        C8765d c8765d2 = this.f85759x;
        m111705c1(zM53531m ? c8765d2.m53520b() : c8765d2.m53522d());
    }

    /* JADX INFO: renamed from: b1 */
    public final void m111704b1(boolean z, String str, e30<Integer> e30Var, C8765d.a aVar, boolean z2) {
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
            m111703a1(str3, d, str2, z2, aVar.m53579f().toString());
            if (NullChecker.m81303a(str2)) {
                qib0.m174815e1("purchase_button_click", FirebaseAnalytics.Param.CURRENCY, str2, "platform", "android");
            }
        } catch (Throwable th) {
            CrashHelper.m81296c(new IllegalStateException("Failed to generate payment params", th));
        }
        hqo hqoVar = new hqo(this.f85752q, this.f85753r);
        hqoVar.m132480u(this.f85720B);
        hqoVar.m132479t(new C16365b(this.f85752q, this.f85753r, aVar, str, this));
        hqoVar.m132478s(e30Var);
        hqoVar.m132477r(true);
        if (h6a.m129470c() || !CoreModule.m29935P().m94651a().mo33442Xi() || this.f85753r != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || ogj.m164200c().f143866c.get().isEmpty()) {
            Act act = this.f85752q;
            hqoVar.m132475p(aqo.m98316h(act, act instanceof PutongAct ? ((PutongAct) act).iap().m148933i() : null), z, str);
        } else {
            Act act2 = this.f85752q;
            hqoVar.m132476q(aqo.m98316h(act2, act2 instanceof PutongAct ? ((PutongAct) act2).iap().m148933i() : null), z, ogj.m164200c().f143867d.get(), ogj.m164200c().m164201a(this.f85753r));
        }
    }

    @Override // p149l.de60
    /* JADX INFO: renamed from: c0 */
    public void mo111150c0(View.OnClickListener onClickListener) {
        if (NullChecker.m81303a(this.f86128b0)) {
            this.f86128b0.setTextColor(hvc0.m133154a(sab0.m182899q(this.f85753r) ? b1c0.f72513C : b1c0.f72569q));
            xdl0.m208344M(this.f86128b0, true);
            xdl0.m208329E0(this.f86128b0, onClickListener);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m111705c1(C8765d.a aVar) {
        m111717o1();
        this.f86119S.stopAnimation(true);
        xdl0.m208344M(this.f86119S, false);
        if (TEnum.equals(aVar.m53579f(), ProductCategory.tttVipUpgradeToPremium) || TEnum.equals(aVar.m53579f(), ProductCategory.tttSeeUpgradeToPremium) || TEnum.equals(aVar.m53579f(), ProductCategory.tttPremiumUpgradeToUltra) || TEnum.equals(aVar.m53579f(), ProductCategory.Promo_premiumUpgradeToUltra)) {
            xdl0.m208344M(this.f86127a0, false);
            xdl0.m208344M(this.f86123W, false);
            xdl0.m208344M(this.f86118R, true);
            this.f86121U.setText(m111695R0());
            this.f86122V.setText(m111694Q0());
            xdl0.m208344M(this.f86119S, true);
            m111713k1();
        } else if (m111690K0()) {
            xdl0.m208344M(this.f86123W, true);
            xdl0.m208344M(this.f86127a0, true);
            xdl0.m208344M(this.f86118R, false);
            String str = String.format("%s %s", aVar.m53601s().defaultStockKeepUnit.prices.currencySymbol, t0g0.m186861b((aVar.m53601s().defaultStockKeepUnit.prices.price / ((double) aVar.m53605w())) * 0.8500000238418579d));
            if (IntlCountryCodeController.m28115k()) {
                this.f86127a0.setText(R$string.f27313U2);
            } else {
                boolean zM129476i = h6a.m129476i();
                VText vText = this.f86127a0;
                if (zM129476i) {
                    vText.setText(m111692O0());
                } else {
                    vText.setText(R$string.f27282R4);
                }
            }
            String strM115674o3 = CoreModule.f17545c.f19620X1.m115674o3();
            boolean zIsEmpty = TextUtils.isEmpty(strM115674o3);
            VText vText2 = this.f86124X;
            if (zIsEmpty) {
                boolean z = this.f86131e0;
                Act act = this.f85752q;
                vText2.setText(z ? act.getString(R$string.f27127D3) : act.getString(R$string.f27116C3, "15%", str));
            } else {
                vText2.setText(strM115674o3);
            }
            if (this.f86131e0) {
                zvf0.m220368A("e_purchase_button_web", "p_purchase_page", vwb.m200311Y("productType", this.f85753r.productCategory().toString()));
            } else {
                zvf0.m220402x("e_web_purchase", "p_purchase_page");
            }
        } else if (this.f86134h0 && m111696S0()) {
            xdl0.m208344M(this.f86123W, true);
            xdl0.m208344M(this.f86127a0, false);
            xdl0.m208344M(this.f86118R, false);
            m111710h1(m111706d1());
        } else {
            xdl0.m208344M(this.f86123W, true);
            xdl0.m208344M(this.f86127a0, false);
            xdl0.m208344M(this.f86118R, false);
            m111710h1(m111692O0());
        }
        m111687H0();
    }

    /* JADX INFO: renamed from: d1 */
    public final CharSequence m111706d1() {
        if (IntlCountryCodeController.m28115k()) {
            return this.f85752q.getString(R$string.f27313U2);
        }
        return h6a.m129476i() ? m111692O0() : this.f85752q.getString(R$string.f27282R4);
    }

    /* JADX INFO: renamed from: e1 */
    public final String m111707e1(C8765d.a aVar) {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        String strM53587j = aVar.m53587j();
        if (!TextUtils.isEmpty(strM53587j)) {
            return strM53587j;
        }
        Merchandise merchandiseM53601s = aVar.m53601s();
        if (merchandiseM53601s != null && (stockKeepUnit = merchandiseM53601s.defaultStockKeepUnit) != null && (prices = stockKeepUnit.prices) != null) {
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            String strM53583h = aVar.m53583h();
            if (TextUtils.isEmpty(strM53583h) && (strM53583h = prices.currencySymbol) == null) {
                strM53583h = "";
            }
            if (prices.originalPrice > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return strM53583h + numberInstance.format(prices.originalPrice);
            }
            int iM53605w = aVar.m53605w();
            if (prices.originalUnitPrice > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && iM53605w > 0) {
                return strM53583h + numberInstance.format(prices.originalUnitPrice * ((double) iM53605w));
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: f1 */
    public final C8765d.a m111708f1() {
        if (!NullChecker.m81303a(this.f85759x)) {
            return null;
        }
        boolean zM81303a = NullChecker.m81303a(this.f85759x.m53522d());
        C8765d c8765d = this.f85759x;
        return zM81303a ? c8765d.m53522d() : c8765d.m53520b();
    }

    @Override // p149l.de60
    /* JADX INFO: renamed from: g0 */
    public void mo111156g0(C8765d c8765d) {
        C8765d c8765d2;
        C8765d.a aVarM53520b = c8765d.m53531m() ? c8765d.m53520b() : c8765d.m53522d();
        boolean z = c8765d.f34529k && (c8765d2 = this.f85759x) != null && c8765d2 != c8765d && (TextUtils.equals(aVarM53520b.m53579f().toString(), ProductCategory.tttVip) || TextUtils.equals(aVarM53520b.m53579f().toString(), ProductCategory.tttSvipGoogleplay) || TextUtils.equals(aVarM53520b.m53579f().toString(), ProductCategory.tttSeeWhoLikedMe));
        super.mo111156g0(c8765d);
        if (z) {
            m111685F0();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m111709g1(boolean z) {
        this.f86132f0 = z;
    }

    @Override // p149l.de60
    /* JADX INFO: renamed from: h0 */
    public void mo111158h0(Privilege privilege) {
        this.f86129c0 = privilege;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m111710h1(CharSequence charSequence) {
        boolean z = charSequence instanceof Spanned;
        VText vText = this.f86124X;
        if (z) {
            vText.setText(charSequence, TextView.BufferType.SPANNABLE);
        } else {
            vText.setText(charSequence);
        }
    }

    @Override // p149l.de60, p149l.ozl
    /* JADX INFO: renamed from: i */
    public void mo111159i(e30<Integer> e30Var) {
        this.f86136j0 = e30Var;
        m111687H0();
    }

    /* JADX INFO: renamed from: i1 */
    public void m111711i1(boolean z) {
        this.f86133g0 = z;
    }

    /* JADX INFO: renamed from: j1 */
    public void m111712j1(boolean z) {
        this.f86134h0 = z;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m111713k1() {
        Animator animatorM103741n = bt0.m103741n(this.f86118R, bt0.f77162i, 1.0f, 1.0f);
        Animator animatorM103741n2 = bt0.m103741n(this.f86118R, bt0.f77162i, 1.0f, 0.96f);
        Animator animatorM103741n3 = bt0.m103741n(this.f86118R, bt0.f77162i, 0.96f, 1.03f);
        Animator animatorM103741n4 = bt0.m103741n(this.f86118R, bt0.f77162i, 1.03f, 1.0f);
        animatorM103741n.setDuration(500L);
        animatorM103741n2.setDuration(333L);
        animatorM103741n3.setDuration(333L);
        animatorM103741n4.setDuration(333L);
        animatorM103741n.setInterpolator(this.f86139m0);
        animatorM103741n2.setInterpolator(this.f86139m0);
        animatorM103741n3.setInterpolator(this.f86139m0);
        animatorM103741n4.setInterpolator(this.f86139m0);
        bt0.m103733f(bt0.m103748u(false, null, -1L, animatorM103741n, animatorM103741n2, animatorM103741n3, animatorM103741n4), new Runnable() { // from class: l.yfn
            @Override // java.lang.Runnable
            public final void run() {
                this.f198078a.m111699W0();
            }
        }).start();
    }

    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public final void m111699W0() {
        mkd0.m154992z(this.f86140n0);
        this.f86140n0 = this.f85752q.duringCreated(C22306c.interval(0L, 2250L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.bgn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75471a.m111700X0((Long) obj);
            }
        }, new e30() { // from class: l.cgn
            @Override // p149l.e30
            public final void call(Object obj) {
                dgn.m111681x0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public final void m111715m1(String str) {
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

    /* JADX INFO: renamed from: n1 */
    public final void m111716n1(String str, String str2) {
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
        act2.duringCreated(ec9Var.m115670k3(ec9Var.m115672m3(), str, str2)).subscribe(mkd0.m154959K(new e30() { // from class: l.zfn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202968a.m111701Y0(strM164285f, (IntlWebPayPaymentEnvelope) obj);
            }
        }, new e30() { // from class: l.agn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69383a.m111702Z0((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: o1 */
    public final void m111717o1() {
        mkd0.m154992z(this.f86140n0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX INFO: renamed from: p1 */
    public final void m111718p1() {
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
        this.f86130d0 = z;
        this.f86131e0 = CoreModule.f17545c.f19620X1.m115675p3();
    }

    /* JADX INFO: renamed from: u */
    public final void m111719u() {
        int i = d3c0.f84109t1;
        int color = CoreModule.f17544b.getResources().getColor(b1c0.f72549g);
        if (sab0.m182901s(this.f85753r)) {
            i = d3c0.f84067q1;
            color = CoreModule.f17544b.getResources().getColor(b1c0.f72578u0);
        } else if (sab0.m182899q(this.f85753r)) {
            i = d3c0.f84081r1;
        } else if (sab0.m182904v(this.f85753r)) {
            i = d3c0.f84095s1;
            color = Color.parseColor("#CC000000");
        }
        this.f86124X.setTextColor(color);
        this.f86123W.setBackgroundDrawable(this.f85752q.drawable(i));
        this.f86118R.setBackgroundDrawable(this.f85752q.drawable(i));
    }

    @Override // p149l.de60, p149l.ozl
    public void release() {
    }
}
