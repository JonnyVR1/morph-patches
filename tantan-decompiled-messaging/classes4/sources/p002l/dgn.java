package p002l;

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
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p1.mobile.putong.core.api.a0;
import com.p1.mobile.putong.core.data.AffiliateProducts;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p1.mobile.putong.core.data.IntlWebPayPaymentData;
import com.p1.mobile.putong.core.data.IntlWebPayPaymentEnvelope;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.aqo;
import l.b1c0;
import l.bd50;
import l.bt0;
import l.c4g0;
import l.d3c0;
import l.de60;
import l.e30;
import l.ec9;
import l.egn;
import l.gbl0;
import l.h6a;
import l.hvc0;
import l.iab0;
import l.igj;
import l.j760;
import l.jo0;
import l.kkp0;
import l.m6c0;
import l.mep0;
import l.mkd0;
import l.mqi0;
import l.ogj;
import l.ogw;
import l.osi0;
import l.qib0;
import l.qlw;
import l.sab0;
import l.t0g0;
import l.t100;
import l.ura;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xma;
import l.y6q0;
import l.zvf0;
import rx.c;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dgn extends de60 {

    /* JADX INFO: renamed from: R */
    public VFrame f9222R;

    /* JADX INFO: renamed from: S */
    public SVGAnimationView f9223S;

    /* JADX INFO: renamed from: T */
    public VLinear f9224T;

    /* JADX INFO: renamed from: U */
    public VText f9225U;

    /* JADX INFO: renamed from: V */
    public VText f9226V;

    /* JADX INFO: renamed from: W */
    public VFrame f9227W;

    /* JADX INFO: renamed from: X */
    public VText f9228X;

    /* JADX INFO: renamed from: Y */
    public VFrame f9229Y;

    /* JADX INFO: renamed from: Z */
    public VText f9230Z;

    /* JADX INFO: renamed from: a0 */
    public VText f9231a0;

    /* JADX INFO: renamed from: b0 */
    public TextView f9232b0;

    /* JADX INFO: renamed from: c0 */
    public Privilege f9233c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f9234d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f9235e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f9236f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f9237g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f9238h0;

    /* JADX INFO: renamed from: i0 */
    public String f9239i0;

    /* JADX INFO: renamed from: j0 */
    public e30 f9240j0;

    /* JADX INFO: renamed from: k0 */
    public View.OnClickListener f9241k0;

    /* JADX INFO: renamed from: l0 */
    public View.OnClickListener f9242l0;

    /* JADX INFO: renamed from: m0 */
    public Interpolator f9243m0;

    /* JADX INFO: renamed from: n0 */
    public c4g0 f9244n0;

    /* JADX INFO: renamed from: l.dgn$a */
    public class RunnableC0528a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f9245a;

        public RunnableC0528a(View view) {
            this.f9245a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = this.f9245a;
            if (view != null) {
                gbl0.g0(view);
            }
        }
    }

    /* JADX INFO: renamed from: l.dgn$b */
    public static class C0529b extends qlw {

        /* JADX INFO: renamed from: e */
        public final C0190d.a f9247e;

        /* JADX INFO: renamed from: f */
        public final String f9248f;

        /* JADX INFO: renamed from: g */
        public final Merchandise f9249g;

        public C0529b(Act act, PurchaseType purchaseType, C0190d.a aVar, String str, f1m f1mVar) {
            super(act, purchaseType, f1mVar);
            this.f9247e = aVar;
            this.f9248f = str;
            this.f9249g = aVar.m4167s();
        }

        /* JADX INFO: renamed from: A */
        public final void m11873A() {
            if (this.f9249g == null || !CoreModule.P().a().Xi()) {
                return;
            }
            boolean zI = h6a.i();
            Merchandise merchandise = this.f9249g;
            if (zI) {
                if (merchandise.monthly()) {
                    ogj.c().b.onNext(0);
                    return;
                } else if (this.f9249g.quarterly()) {
                    ogj.c().b.onNext(1);
                    return;
                } else {
                    if (this.f9249g.yearly()) {
                        ogj.c().b.onNext(2);
                        return;
                    }
                    return;
                }
            }
            if (merchandise.monthly()) {
                ogj.c().b.onNext(2);
            } else if (this.f9249g.quarterly()) {
                ogj.c().b.onNext(1);
            } else if (this.f9249g.yearly()) {
                ogj.c().b.onNext(0);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m11874a() {
            m11873A();
            super.a();
        }

        /* JADX INFO: renamed from: c */
        public void m11875c() {
            m11873A();
            super.c();
        }

        /* JADX INFO: renamed from: x */
        public Object[] m11876x() {
            try {
                if (NullChecker.a(this.f9247e.m4167s())) {
                    Prices prices = this.f9247e.m4167s().defaultStockKeepUnit.prices;
                    return new Object[]{"currency", prices.currencyCode, "value", Double.valueOf(prices.price), "skuID", this.f9248f, "platform", "android"};
                }
            } catch (Throwable th) {
                CrashHelper.c(new IllegalStateException("Failed to generate payment params", th));
            }
            return qlw.d;
        }
    }

    public dgn(Act act, PurchaseType purchaseType) {
        super(act, purchaseType);
        this.f9234d0 = false;
        this.f9235e0 = false;
        this.f9236f0 = false;
        this.f9237g0 = false;
        this.f9238h0 = false;
        this.f9241k0 = new View.OnClickListener() { // from class: l.wfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21721a.m11844U0(view);
            }
        };
        this.f9242l0 = new View.OnClickListener() { // from class: l.xfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22260a.m11845V0(view);
            }
        };
        this.f9243m0 = new LinearInterpolator();
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ Boolean m11819A0(String str, String str2, Merchandise merchandise) {
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
        return !TextUtils.isEmpty(str2) ? Boolean.valueOf(TextUtils.equals(CoreIntlAffiliatePromotions.l3(strTrim, str2), str)) : Boolean.valueOf(CoreIntlAffiliatePromotions.Q3(str, strTrim));
    }

    /* JADX INFO: renamed from: L0 */
    public static Merchandise m11823L0(IapAffiliatePromotion iapAffiliatePromotion) {
        final String strTrim = iapAffiliatePromotion.iapId.trim();
        String str = iapAffiliatePromotion.offerId;
        final String strTrim2 = str != null ? str.trim() : "";
        List list = (List) CoreModule.c.j0.E4().e();
        if (vwb.J(list)) {
            return null;
        }
        return (Merchandise) vwb.r(list, new w9j() { // from class: l.vfn
            public final Object call(Object obj) {
                return dgn.m11819A0(strTrim, strTrim2, (Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public static String m11824M0(Prices prices) {
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
    public static boolean m11825T0(IapAffiliatePromotion iapAffiliatePromotion) {
        return CoreIntlAffiliatePromotions.V3(iapAffiliatePromotion);
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m11828x0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ y6q0 m11829y0(int i, int i2, int i3, int i4, View view, y6q0 y6q0Var) {
        view.setPadding(i, i2, i3, i4 + y6q0Var.f(y6q0.l.d()).d);
        return y6q0Var;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m11831E0(View view) {
        egn.a(this, view);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m11832F0() {
        IapAffiliatePromotion iapAffiliatePromotionE3;
        IapAffiliatePromotion iapAffiliatePromotionV3;
        if (!NullChecker.a(((de60) this).x)) {
            if (NullChecker.a(this.f9240j0)) {
                igj.L().subscribe(mkd0.B());
                this.f9240j0.call(0);
                return;
            }
            return;
        }
        boolean zM4097m = ((de60) this).x.m4097m();
        C0190d c0190d = ((de60) this).x;
        C0190d.a aVarM4086b = zM4097m ? c0190d.m4086b() : c0190d.m4088d();
        if (NullChecker.a(aVarM4086b) && NullChecker.a(aVarM4086b.m4167s())) {
            Merchandise merchandiseM4167s = aVarM4086b.m4167s();
            String productId = merchandiseM4167s.defaultStockKeepUnit.affiliateProducts.getProductId();
            PurchaseType purchaseType = ((de60) this).r;
            PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            if (purchaseType == purchaseType2 && !IntlCountryCodeController.k()) {
                String str = merchandiseM4167s.defaultStockKeepUnit.affiliateProducts.googleplay;
                IapAffiliatePromotion iapAffiliatePromotionE4 = CoreModule.c.x0.E3();
                if (iapAffiliatePromotionE4 == null && this.f9236f0 && (iapAffiliatePromotionV3 = CoreModule.c.x0.v3(merchandiseM4167s)) != null && !CoreModule.c.x0.f4(iapAffiliatePromotionV3)) {
                    if (J()) {
                        m4p.m17713k(((de60) this).q, m4p.m17705c());
                    }
                    IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotL3 = CoreModule.c.x0.L3(iapAffiliatePromotionV3);
                    osi0.g((iapAffiliatePromotionDisplaySlotL3 == null || TextUtils.isEmpty(iapAffiliatePromotionDisplaySlotL3.interceptToast)) ? ((de60) this).q.getString(R.string.J2) : iapAffiliatePromotionDisplaySlotL3.interceptToast.trim());
                    return;
                }
                boolean z = this.f9236f0 || CoreModule.c.x0.P3();
                if (iapAffiliatePromotionE4 != null && z) {
                    String str2 = iapAffiliatePromotionE4.iapId;
                    if (TextUtils.isEmpty(str2 == null ? "" : str2.trim())) {
                        if (J()) {
                            m4p.m17713k(((de60) this).q, m4p.m17706d());
                            return;
                        }
                        return;
                    }
                }
                if (iapAffiliatePromotionE4 != null && z && CoreIntlAffiliatePromotions.Q3(iapAffiliatePromotionE4.iapId, str)) {
                    productId = CoreIntlAffiliatePromotions.m3(str, iapAffiliatePromotionE4.iapId, iapAffiliatePromotionE4.offerId);
                }
            }
            if (J() && ((de60) this).r == purchaseType2 && (iapAffiliatePromotionE3 = CoreModule.c.x0.E3()) != null) {
                m4p.m17714l(((de60) this).q, aVarM4086b, iapAffiliatePromotionE3);
            }
            String str3 = productId;
            m11853b1(merchandiseM4167s.autoRenewable(), str3, this.f9240j0, aVarM4086b, ((de60) this).x.f2351k);
            m11868m1(str3);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m11833G0(View view) {
        if (view == null) {
            return;
        }
        final int paddingLeft = view.getPaddingLeft();
        final int paddingTop = view.getPaddingTop();
        final int paddingRight = view.getPaddingRight();
        final int paddingBottom = view.getPaddingBottom();
        gbl0.y0(view, new bd50() { // from class: l.ufn
            public final y6q0 onApplyWindowInsets(View view2, y6q0 y6q0Var) {
                return dgn.m11829y0(paddingLeft, paddingTop, paddingRight, paddingBottom, view2, y6q0Var);
            }
        });
        if (view.isAttachedToWindow()) {
            gbl0.g0(view);
        } else {
            view.post(new RunnableC0528a(view));
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m11834H0() {
        xdl0.E0(this.f9227W, m11837K0() ? this.f9242l0 : this.f9241k0);
        xdl0.E0(this.f9222R, this.f9241k0);
        xdl0.E0(this.f9231a0, this.f9241k0);
    }

    /* JADX INFO: renamed from: I0 */
    public final CharSequence m11835I0(C0190d.a aVar) {
        String strM11838N0 = m11838N0();
        String string = ((de60) this).q.getString(R.string.C2);
        if (TextUtils.isEmpty(strM11838N0)) {
            return string;
        }
        String string2 = ((de60) this).q.getString(R.string.D2, strM11838N0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(((de60) this).q.color(b1c0.G)), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append('\n');
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(((de60) this).q.color(b1c0.H)), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(Math.max(1, Math.round(((de60) this).q.getResources().getDisplayMetrics().scaledDensity * 15.0f)), false), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: J0 */
    public final CharSequence m11836J0() {
        String string;
        C0190d.a aVarM11858f1 = m11858f1();
        if (!NullChecker.a(aVarM11858f1)) {
            return "";
        }
        IapAffiliatePromotion iapAffiliatePromotionE3 = CoreModule.c.x0.E3();
        if (m11825T0(iapAffiliatePromotionE3) && CoreModule.c.x0.l4(aVarM11858f1.m4167s())) {
            return m11835I0(aVarM11858f1);
        }
        String strM4147g = aVarM11858f1.m4147g();
        if (TextUtils.isEmpty(strM4147g)) {
            strM4147g = aVarM11858f1.m4157l();
        }
        if (TextUtils.isEmpty(strM4147g)) {
            strM4147g = aVarM11858f1.m4174z();
        }
        if (TextUtils.isEmpty(strM4147g)) {
            return "";
        }
        int iM4171w = aVarM11858f1.m4171w();
        String strM11857e1 = m11857e1(aVarM11858f1);
        Merchandise merchandiseM4167s = aVarM11858f1.m4167s();
        if (merchandiseM4167s == null || !merchandiseM4167s.weekly()) {
            Act act = ((de60) this).q;
            string = iM4171w == 1 ? act.getString(R.string.O2, String.valueOf(iM4171w), strM4147g) : act.getString(R.string.P2, String.valueOf(iM4171w), strM4147g);
        } else {
            string = ((de60) this).q.getString(iM4171w == 1 ? R.string.Q2 : R.string.R2, String.valueOf(iM4171w), strM4147g);
        }
        if ((iapAffiliatePromotionE3 != null && !this.f9236f0) || TextUtils.isEmpty(strM11857e1) || TextUtils.equals(strM11857e1.trim(), strM4147g.trim())) {
            return string;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append(' ');
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) strM11857e1);
        spannableStringBuilder.setSpan(new StrikethroughSpan(), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m11837K0() {
        if (IntlCountryCodeController.t() || ((de60) this).r == PurchaseType.TYPE_ULTRA_PREMIUM || this.f9238h0) {
            return false;
        }
        return this.f9234d0 || this.f9235e0;
    }

    /* JADX INFO: renamed from: N0 */
    public final String m11838N0() {
        IapAffiliatePromotion iapAffiliatePromotionE3 = CoreModule.c.x0.E3();
        if (iapAffiliatePromotionE3 != null && !TextUtils.isEmpty(iapAffiliatePromotionE3.iapId)) {
            String strI = igj.I(iapAffiliatePromotionE3.iapId, iapAffiliatePromotionE3.offerId);
            if (!TextUtils.isEmpty(strI)) {
                return strI;
            }
            Merchandise merchandiseM11823L0 = m11823L0(iapAffiliatePromotionE3);
            if (NullChecker.a(merchandiseM11823L0) && NullChecker.a(merchandiseM11823L0.defaultStockKeepUnit) && NullChecker.a(merchandiseM11823L0.defaultStockKeepUnit.affiliateProducts)) {
                String str = merchandiseM11823L0.defaultStockKeepUnit.affiliateProducts.googleplay;
                if (!TextUtils.isEmpty(str)) {
                    String strH = igj.H(str.trim());
                    if (!TextUtils.isEmpty(strH)) {
                        return strH;
                    }
                }
            }
            if (NullChecker.a(merchandiseM11823L0) && NullChecker.a(merchandiseM11823L0.defaultStockKeepUnit) && NullChecker.a(merchandiseM11823L0.defaultStockKeepUnit.prices)) {
                return m11824M0(merchandiseM11823L0.defaultStockKeepUnit.prices);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: O0 */
    public final CharSequence m11839O0() {
        String strString;
        if ((this.f9236f0 || CoreModule.c.x0.P3()) && ((de60) this).r == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && NullChecker.a(((de60) this).x)) {
            CharSequence charSequenceM11836J0 = m11836J0();
            if (!TextUtils.isEmpty(charSequenceM11836J0)) {
                return charSequenceM11836J0;
            }
        }
        String strString2 = this.f9239i0;
        if (!h6a.i() || !NullChecker.a(((de60) this).x)) {
            return strString2;
        }
        boolean zA = NullChecker.a(((de60) this).x.m4088d());
        C0190d c0190d = ((de60) this).x;
        C0190d.a aVarM4088d = zA ? c0190d.m4088d() : c0190d.m4086b();
        if (sab0.w(((de60) this).r)) {
            strString2 = (CoreModule.c.e0.p9().isVIP() || CoreModule.c.e0.p9().isVIPExpired()) ? ((de60) this).q.string(R.string.t3) : ((de60) this).q.string(R.string.s3);
        } else {
            PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            PurchaseType purchaseType2 = ((de60) this).r;
            if (purchaseType == purchaseType2) {
                this.f9231a0.setTextColor(((de60) this).q.color(b1c0.C));
                boolean zF4 = xma.f4();
                Act act = ((de60) this).q;
                strString = zF4 ? act.string(R.string.t3) : act.string(R.string.s3);
            } else if (sab0.v(purchaseType2)) {
                this.f9231a0.setTextColor(((de60) this).q.color(b1c0.C));
                boolean zK4 = xma.k4();
                Act act2 = ((de60) this).q;
                strString = zK4 ? act2.string(R.string.t3) : act2.string(R.string.s3);
            }
            strString2 = strString;
        }
        return aVarM4088d.m4147g() + strString2;
    }

    /* JADX INFO: renamed from: P0 */
    public final CharSequence m11840P0() {
        if (sab0.w(((de60) this).r)) {
            return (CoreModule.c.e0.p9().isVIP() || CoreModule.c.e0.p9().isVIPExpired()) ? ((de60) this).q.string(R.string.s9) : ((de60) this).q.string(R.string.q9);
        }
        PurchaseType purchaseType = PurchaseType.TYPE_GET_BOOST;
        PurchaseType purchaseType2 = ((de60) this).r;
        if (purchaseType == purchaseType2) {
            return ((de60) this).q.string(R.string.E9);
        }
        if (PurchaseType.TYPE_GET_VIP_SUPERLIKE == purchaseType2) {
            return ((de60) this).q.string(R.string.g9);
        }
        if (sab0.s(purchaseType2)) {
            int i = R.string.Z9;
            int i2 = R.string.A9;
            if (CoreModule.P().a().B()) {
                i = R.string.w3;
                i2 = R.string.v3;
            }
            long jBn = CoreModule.P().a().Bn();
            Act act = ((de60) this).q;
            return jBn != 0 ? act.string(i) : act.string(i2);
        }
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        PurchaseType purchaseType4 = ((de60) this).r;
        if (purchaseType3 == purchaseType4) {
            this.f9231a0.setTextColor(((de60) this).q.color(b1c0.C));
            boolean zF4 = xma.f4();
            Act act2 = ((de60) this).q;
            return zF4 ? act2.string(R.string.c7) : act2.string(R.string.b7);
        }
        if (!sab0.v(purchaseType4)) {
            return null;
        }
        this.f9231a0.setTextColor(((de60) this).q.color(b1c0.C));
        boolean zK4 = xma.k4();
        Act act3 = ((de60) this).q;
        return zK4 ? act3.string(R.string.T4) : act3.string(R.string.S4);
    }

    /* JADX INFO: renamed from: Q0 */
    public final String m11841Q0() {
        if (!h6a.i() || !NullChecker.a(((de60) this).x)) {
            return "";
        }
        boolean zA = NullChecker.a(((de60) this).x.m4088d());
        C0190d c0190d = ((de60) this).x;
        C0190d.a aVarM4088d = zA ? c0190d.m4088d() : c0190d.m4086b();
        PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        PurchaseType purchaseType2 = ((de60) this).r;
        if (purchaseType == purchaseType2 || sab0.v(purchaseType2)) {
            this.f9226V.setTextColor(Color.parseColor("#99232323"));
        }
        double d = (Double.parseDouble(aVarM4088d.m4155k()) * ((double) aVarM4088d.m4171w())) - aVarM4088d.m4168t();
        if (d <= 0.0d) {
            return "";
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        return String.format(((de60) this).q.getString(R.string.f6), aVarM4088d.m4149h() + numberInstance.format(d));
    }

    /* JADX INFO: renamed from: R0 */
    public final String m11842R0() {
        if (!h6a.i() || !NullChecker.a(((de60) this).x)) {
            return "";
        }
        boolean zA = NullChecker.a(((de60) this).x.m4088d());
        C0190d c0190d = ((de60) this).x;
        C0190d.a aVarM4088d = zA ? c0190d.m4088d() : c0190d.m4086b();
        PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        PurchaseType purchaseType2 = ((de60) this).r;
        if (purchaseType == purchaseType2 || sab0.v(purchaseType2)) {
            this.f9225U.setTextColor(Color.parseColor("#CC000000"));
        }
        return String.format(((de60) this).q.getString(R.string.i6), aVarM4088d.m4147g());
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m11843S0() {
        if (IntlCountryCodeController.t() || ((de60) this).r == PurchaseType.TYPE_ULTRA_PREMIUM) {
            return false;
        }
        return this.f9234d0 || this.f9235e0;
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m11844U0(View view) {
        m11832F0();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m11845V0(View view) {
        String str;
        if (!this.f9235e0) {
            kkp0.c(((de60) this).q, "p_purchase_page");
            return;
        }
        String str2 = "";
        if (NullChecker.a(((de60) this).x)) {
            boolean zM4097m = ((de60) this).x.m4097m();
            C0190d c0190d = ((de60) this).x;
            Merchandise merchandiseM4167s = (zM4097m ? c0190d.m4086b() : c0190d.m4088d()).m4167s();
            if (NullChecker.a(merchandiseM4167s)) {
                str = merchandiseM4167s.quantity + "";
            } else {
                str = "1";
            }
        } else {
            str = "1";
        }
        ProductCategory productCategory = ((de60) this).r.productCategory();
        if (TEnum.equals(productCategory, "tttSeeWhoLikedMe")) {
            str2 = "see";
        } else if (TEnum.equals(productCategory, "tttVip")) {
            str2 = "vip";
        } else if (TEnum.equals(productCategory, "tttSvipGoogleplay")) {
            str2 = "svip";
        }
        m11869n1(str2, str);
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m11847X0(Long l2) {
        SVGAnimationView sVGAnimationView = this.f9223S;
        if (sVGAnimationView != null) {
            sVGAnimationView.startAnimation();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m11848Y0(String str, IntlWebPayPaymentEnvelope intlWebPayPaymentEnvelope) {
        ((de60) this).q.progressDismiss();
        if (NullChecker.a(intlWebPayPaymentEnvelope.data)) {
            Act act = ((de60) this).q;
            String str2 = "tantan://intlNativeRecharge?url=" + intlWebPayPaymentEnvelope.data.paymentRequest;
            String strU3 = CoreModule.c.X1.u3();
            IntlWebPayPaymentData intlWebPayPaymentData = intlWebPayPaymentEnvelope.data;
            kkp0.b(act, str2, str, strU3, intlWebPayPaymentData.hideNavigationBar, intlWebPayPaymentData.hardwareAccelerated, intlWebPayPaymentData.isUseMkWebView);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m11849Z0(Throwable th) {
        ((de60) this).q.progressDismiss();
    }

    /* JADX INFO: renamed from: a */
    public View m11850a(ViewGroup viewGroup, boolean z) {
        View viewInflate = ((de60) this).q.inflater().inflate(m6c0.U2, viewGroup, false);
        m11831E0(viewInflate);
        m11833G0(viewInflate);
        if (!((String) ura.e().d().B8().get()).isEmpty()) {
            User userPa = CoreModule.c.e0.Pa((String) ura.e().d().B8().get());
            if (userPa == null || userPa.isFemale()) {
                this.f9239i0 = ((de60) this).q.getString(R.string.q);
            } else {
                this.f9239i0 = ((de60) this).q.getString(R.string.r);
            }
        } else if (((Boolean) a0.j().e.get()).booleanValue()) {
            this.f9239i0 = ((de60) this).q.getString(R.string.i2);
        } else {
            this.f9239i0 = m11840P0().toString();
        }
        m11871p1();
        xdl0.M(this.f9231a0, false);
        this.f9228X.setText(this.f9239i0);
        m11872u();
        mep0.d1(this.f9223S, t100.i);
        this.f9223S.setAlpha(153);
        SVGALoader.with(((de60) this).q).from("https://auto.tancdn.com/v1/raw/051048fc-7b33-41f3-a36c-1004f82d5167.pdf").autoPlay(false).repeatCount(1).into(this.f9223S);
        return viewInflate;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m11851a1(String str, double d, String str2, boolean z, String str3) {
        String str4 = z ? "duration_switch" : "buy_button";
        j760 j760VarY = vwb.Y("platform", "googleplay");
        j760 j760VarY2 = vwb.Y("productType", str3);
        j760 j760VarY3 = vwb.Y("skuID", str);
        String str5 = ((de60) this).t;
        if (str5 == null) {
            str5 = "";
        }
        zvf0.u("e_purchase_button", "p_purchase_page", new j760[]{j760VarY, j760VarY2, j760VarY3, vwb.Y("purchaseShowFrom", str5), vwb.Y("first_carousel_page", iab0.m(this.f9233c0)), vwb.Y("price", Double.valueOf(d)), vwb.Y("click_area", str4), vwb.Y("currency_code", str2), vwb.Y("if_weekly_premium_boost_get", Integer.valueOf(this.f9237g0 ? 1 : 0))});
    }

    /* JADX INFO: renamed from: b */
    public void m11852b(C0190d c0190d) {
        super.b(c0190d);
        boolean zM4097m = ((de60) this).x.m4097m();
        C0190d c0190d2 = ((de60) this).x;
        m11855c1(zM4097m ? c0190d2.m4086b() : c0190d2.m4088d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b1 */
    public final void m11853b1(boolean z, String str, e30<Integer> e30Var, C0190d.a aVar, boolean z2) {
        double d;
        String str2;
        try {
            String str3 = "";
            if (NullChecker.a(aVar.m4167s())) {
                Prices prices = aVar.m4167s().defaultStockKeepUnit.prices;
                String str4 = prices.currencyCode;
                d = prices.price;
                str3 = aVar.m4167s().defaultStockKeepUnit.id;
                str2 = str4;
            } else {
                d = 0.0d;
                str2 = null;
            }
            m11851a1(str3, d, str2, z2, aVar.m4145f().toString());
            if (NullChecker.a(str2)) {
                qib0.e1("purchase_button_click", new Object[]{"currency", str2, "platform", "android"});
            }
        } catch (Throwable th) {
            CrashHelper.c(new IllegalStateException("Failed to generate payment params", th));
        }
        hqo hqoVar = new hqo(((de60) this).q, ((de60) this).r);
        hqoVar.m14698u(((de60) this).B);
        hqoVar.m14697t(new C0529b(((de60) this).q, ((de60) this).r, aVar, str, this));
        hqoVar.m14696s(e30Var);
        hqoVar.m14695r(true);
        if (h6a.c() || !CoreModule.P().a().Xi() || ((de60) this).r != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || ((String) ogj.c().c.get()).isEmpty()) {
            PutongAct putongAct = ((de60) this).q;
            hqoVar.m14693p(aqo.h(putongAct, putongAct instanceof PutongAct ? putongAct.iap().i() : null), z, str);
        } else {
            PutongAct putongAct2 = ((de60) this).q;
            hqoVar.m14694q(aqo.h(putongAct2, putongAct2 instanceof PutongAct ? putongAct2.iap().i() : null), z, (String) ogj.c().d.get(), ogj.c().a(((de60) this).r));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m11854c0(View.OnClickListener onClickListener) {
        if (NullChecker.a(this.f9232b0)) {
            this.f9232b0.setTextColor(hvc0.a(sab0.q(((de60) this).r) ? b1c0.C : b1c0.q));
            xdl0.M(this.f9232b0, true);
            xdl0.E0(this.f9232b0, onClickListener);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m11855c1(C0190d.a aVar) {
        m11870o1();
        this.f9223S.stopAnimation(true);
        xdl0.M(this.f9223S, false);
        if (TEnum.equals(aVar.m4145f(), "tttVipUpgradeToPremium") || TEnum.equals(aVar.m4145f(), "tttSeeUpgradeToPremium") || TEnum.equals(aVar.m4145f(), "tttPremiumUpgradeToUltra") || TEnum.equals(aVar.m4145f(), "Promo_premiumUpgradeToUltra")) {
            xdl0.M(this.f9231a0, false);
            xdl0.M(this.f9227W, false);
            xdl0.M(this.f9222R, true);
            this.f9225U.setText(m11842R0());
            this.f9226V.setText(m11841Q0());
            xdl0.M(this.f9223S, true);
            m11866k1();
        } else if (m11837K0()) {
            xdl0.M(this.f9227W, true);
            xdl0.M(this.f9231a0, true);
            xdl0.M(this.f9222R, false);
            String str = String.format("%s %s", aVar.m4167s().defaultStockKeepUnit.prices.currencySymbol, t0g0.b((aVar.m4167s().defaultStockKeepUnit.prices.price / ((double) aVar.m4171w())) * 0.8500000238418579d));
            if (IntlCountryCodeController.k()) {
                this.f9231a0.setText(R.string.U2);
            } else {
                boolean zI = h6a.i();
                VText vText = this.f9231a0;
                if (zI) {
                    vText.setText(m11839O0());
                } else {
                    vText.setText(R.string.R4);
                }
            }
            String strO3 = CoreModule.c.X1.o3();
            boolean zIsEmpty = TextUtils.isEmpty(strO3);
            VText vText2 = this.f9228X;
            if (zIsEmpty) {
                boolean z = this.f9235e0;
                Act act = ((de60) this).q;
                vText2.setText(z ? act.getString(R.string.D3) : act.getString(R.string.C3, "15%", str));
            } else {
                vText2.setText(strO3);
            }
            if (this.f9235e0) {
                zvf0.A("e_purchase_button_web", "p_purchase_page", new j760[]{vwb.Y("productType", ((de60) this).r.productCategory().toString())});
            } else {
                zvf0.x("e_web_purchase", "p_purchase_page");
            }
        } else if (this.f9238h0 && m11843S0()) {
            xdl0.M(this.f9227W, true);
            xdl0.M(this.f9231a0, false);
            xdl0.M(this.f9222R, false);
            m11862h1(m11856d1());
        } else {
            xdl0.M(this.f9227W, true);
            xdl0.M(this.f9231a0, false);
            xdl0.M(this.f9222R, false);
            m11862h1(m11839O0());
        }
        m11834H0();
    }

    /* JADX INFO: renamed from: d1 */
    public final CharSequence m11856d1() {
        if (IntlCountryCodeController.k()) {
            return ((de60) this).q.getString(R.string.U2);
        }
        return h6a.i() ? m11839O0() : ((de60) this).q.getString(R.string.R4);
    }

    /* JADX INFO: renamed from: e1 */
    public final String m11857e1(C0190d.a aVar) {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        String strM4153j = aVar.m4153j();
        if (!TextUtils.isEmpty(strM4153j)) {
            return strM4153j;
        }
        Merchandise merchandiseM4167s = aVar.m4167s();
        if (merchandiseM4167s != null && (stockKeepUnit = merchandiseM4167s.defaultStockKeepUnit) != null && (prices = stockKeepUnit.prices) != null) {
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            String strM4149h = aVar.m4149h();
            if (TextUtils.isEmpty(strM4149h) && (strM4149h = prices.currencySymbol) == null) {
                strM4149h = "";
            }
            if (prices.originalPrice > 0.0d) {
                return strM4149h + numberInstance.format(prices.originalPrice);
            }
            int iM4171w = aVar.m4171w();
            if (prices.originalUnitPrice > 0.0d && iM4171w > 0) {
                return strM4149h + numberInstance.format(prices.originalUnitPrice * ((double) iM4171w));
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: f1 */
    public final C0190d.a m11858f1() {
        if (!NullChecker.a(((de60) this).x)) {
            return null;
        }
        boolean zA = NullChecker.a(((de60) this).x.m4088d());
        C0190d c0190d = ((de60) this).x;
        return zA ? c0190d.m4088d() : c0190d.m4086b();
    }

    /* JADX INFO: renamed from: g0 */
    public void m11859g0(C0190d c0190d) {
        C0190d c0190d2;
        C0190d.a aVarM4086b = c0190d.m4097m() ? c0190d.m4086b() : c0190d.m4088d();
        boolean z = c0190d.f2351k && (c0190d2 = ((de60) this).x) != null && c0190d2 != c0190d && (TextUtils.equals(aVarM4086b.m4145f().toString(), "tttVip") || TextUtils.equals(aVarM4086b.m4145f().toString(), "tttSvipGoogleplay") || TextUtils.equals(aVarM4086b.m4145f().toString(), "tttSeeWhoLikedMe"));
        super.g0(c0190d);
        if (z) {
            m11832F0();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m11860g1(boolean z) {
        this.f9236f0 = z;
    }

    /* JADX INFO: renamed from: h0 */
    public void m11861h0(Privilege privilege) {
        this.f9233c0 = privilege;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m11862h1(CharSequence charSequence) {
        boolean z = charSequence instanceof Spanned;
        VText vText = this.f9228X;
        if (z) {
            vText.setText(charSequence, TextView.BufferType.SPANNABLE);
        } else {
            vText.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m11863i(e30<Integer> e30Var) {
        this.f9240j0 = e30Var;
        m11834H0();
    }

    /* JADX INFO: renamed from: i1 */
    public void m11864i1(boolean z) {
        this.f9237g0 = z;
    }

    /* JADX INFO: renamed from: j1 */
    public void m11865j1(boolean z) {
        this.f9238h0 = z;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m11866k1() {
        Animator animatorN = bt0.n(this.f9222R, bt0.i, new float[]{1.0f, 1.0f});
        Animator animatorN2 = bt0.n(this.f9222R, bt0.i, new float[]{1.0f, 0.96f});
        Animator animatorN3 = bt0.n(this.f9222R, bt0.i, new float[]{0.96f, 1.03f});
        Animator animatorN4 = bt0.n(this.f9222R, bt0.i, new float[]{1.03f, 1.0f});
        animatorN.setDuration(500L);
        animatorN2.setDuration(333L);
        animatorN3.setDuration(333L);
        animatorN4.setDuration(333L);
        animatorN.setInterpolator(this.f9243m0);
        animatorN2.setInterpolator(this.f9243m0);
        animatorN3.setInterpolator(this.f9243m0);
        animatorN4.setInterpolator(this.f9243m0);
        bt0.f(bt0.u(false, (Interpolator) null, -1L, new Animator[]{animatorN, animatorN2, animatorN3, animatorN4}), new Runnable() { // from class: l.yfn
            @Override // java.lang.Runnable
            public final void run() {
                this.f22848a.m11846W0();
            }
        }).start();
    }

    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public final void m11846W0() {
        mkd0.z(this.f9244n0);
        this.f9244n0 = ((de60) this).q.duringCreated(c.interval(0L, 2250L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.bgn
            public final void call(Object obj) {
                this.f8121a.m11847X0((Long) obj);
            }
        }, new e30() { // from class: l.cgn
            public final void call(Object obj) {
                dgn.m11828x0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public final void m11868m1(String str) {
        PurchaseType purchaseType = ((de60) this).r;
        if (purchaseType == PurchaseType.TYPE_GET_VIP) {
            qib0.e1("vip_purchase_click", new Object[]{"showFrom", ((de60) this).t, "skuID", str});
            return;
        }
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            qib0.e1("see_purchase_click", new Object[]{"showFrom", ((de60) this).t, "skuID", str});
        } else if (purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE) {
            qib0.e1("superlike_purchase_click", new Object[]{"showFrom", ((de60) this).t, "skuID", str});
        } else if (purchaseType == PurchaseType.TYPE_GET_BOOST) {
            qib0.e1("boost_purchase_click", new Object[]{"showFrom", ((de60) this).t, "skuID", str});
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m11869n1(String str, String str2) {
        final String strF = ogw.f(CoreModule.H().userId() + mqi0.o(), true);
        zvf0.u("e_purchase_button_web", "p_purchase_page", new j760[]{vwb.Y("productType", str), vwb.Y("default_duration", str2 + "m"), vwb.Y("tracker", strF)});
        boolean zQ3 = CoreModule.c.X1.q3();
        Act act = ((de60) this).q;
        if (!zQ3) {
            kkp0.a(act, CoreModule.c.X1.V.thirdPartConfig.thirdPartLandPage, str, str2, strF);
            return;
        }
        act.progress(R.string.T1);
        Act act2 = ((de60) this).q;
        ec9 ec9Var = CoreModule.c.X1;
        act2.duringCreated(ec9Var.k3(ec9Var.m3(), str, str2)).subscribe(mkd0.K(new e30() { // from class: l.zfn
            public final void call(Object obj) {
                this.f23381a.m11848Y0(strF, (IntlWebPayPaymentEnvelope) obj);
            }
        }, new e30() { // from class: l.agn
            public final void call(Object obj) {
                this.f7602a.m11849Z0((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: o1 */
    public final void m11870o1() {
        mkd0.z(this.f9244n0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX INFO: renamed from: p1 */
    public final void m11871p1() {
        boolean z;
        if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == ((de60) this).r || !((Boolean) CoreModule.c.e0.S0.get()).booleanValue()) {
            z = false;
        } else {
            ec9 ec9Var = CoreModule.c.X1;
            if (!ec9Var.R || ec9Var.W.contains(String.valueOf(qib0.f0))) {
                z = false;
            } else {
                z = true;
            }
        }
        this.f9234d0 = z;
        this.f9235e0 = CoreModule.c.X1.p3();
    }

    /* JADX INFO: renamed from: u */
    public final void m11872u() {
        int i = d3c0.t1;
        int color = CoreModule.b.getResources().getColor(b1c0.g);
        if (sab0.s(((de60) this).r)) {
            i = d3c0.q1;
            color = CoreModule.b.getResources().getColor(b1c0.u0);
        } else if (sab0.q(((de60) this).r)) {
            i = d3c0.r1;
        } else if (sab0.v(((de60) this).r)) {
            i = d3c0.s1;
            color = Color.parseColor("#CC000000");
        }
        this.f9228X.setTextColor(color);
        this.f9227W.setBackgroundDrawable(((de60) this).q.drawable(i));
        this.f9222R.setBackgroundDrawable(((de60) this).q.drawable(i));
    }

    public void release() {
    }
}
