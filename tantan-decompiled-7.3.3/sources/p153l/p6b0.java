package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.common.base.Optional;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RefundDetail;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes4.dex */
public class p6b0 extends g1e {

    /* JADX INFO: renamed from: A */
    public VText f150770A;

    /* JADX INFO: renamed from: B */
    public VText f150771B;

    /* JADX INFO: renamed from: C */
    public VText f150772C;

    /* JADX INFO: renamed from: D */
    public View f150773D;

    /* JADX INFO: renamed from: E */
    public Act f150774E;

    /* JADX INFO: renamed from: F */
    @NonNull
    public x20 f150775F;

    /* JADX INFO: renamed from: G */
    public String f150776G;

    /* JADX INFO: renamed from: H */
    public l4g0 f150777H;

    /* JADX INFO: renamed from: I */
    public Merchandise f150778I;

    /* JADX INFO: renamed from: J */
    public Coupon f150779J;

    /* JADX INFO: renamed from: K */
    public PayMethod f150780K;

    /* JADX INFO: renamed from: L */
    public DecimalFormat f150781L;

    /* JADX INFO: renamed from: M */
    public DecimalFormat f150782M;

    /* JADX INFO: renamed from: N */
    public NumberFormat f150783N;

    /* JADX INFO: renamed from: O */
    public double f150784O;

    /* JADX INFO: renamed from: P */
    public double f150785P;

    /* JADX INFO: renamed from: Q */
    public lib0 f150786Q;

    /* JADX INFO: renamed from: R */
    public double f150787R;

    /* JADX INFO: renamed from: j */
    public VImage f150788j;

    /* JADX INFO: renamed from: k */
    public VImage f150789k;

    /* JADX INFO: renamed from: l */
    public VText f150790l;

    /* JADX INFO: renamed from: m */
    public VText f150791m;

    /* JADX INFO: renamed from: n */
    public VText f150792n;

    /* JADX INFO: renamed from: o */
    public VText f150793o;

    /* JADX INFO: renamed from: p */
    public VText f150794p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f150795q;

    /* JADX INFO: renamed from: r */
    public VCheckBox f150796r;

    /* JADX INFO: renamed from: s */
    public VText f150797s;

    /* JADX INFO: renamed from: t */
    public RelativeLayout f150798t;

    /* JADX INFO: renamed from: u */
    public TextView f150799u;

    /* JADX INFO: renamed from: v */
    public VText f150800v;

    /* JADX INFO: renamed from: w */
    public View f150801w;

    /* JADX INFO: renamed from: x */
    public VText f150802x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f150803y;

    /* JADX INFO: renamed from: z */
    public VText f150804z;

    /* JADX INFO: renamed from: l.p6b0$a */
    public static /* synthetic */ class C19305a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f150805a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f150805a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f150805a[PurchaseType.TYPE_GET_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public p6b0(Act act, final y20<Boolean> y20Var, Merchandise merchandise, Coupon coupon, String str) {
        super(act, false, dgc0.f88277b);
        this.f150781L = new DecimalFormat("#.#");
        this.f150782M = new DecimalFormat("#.#");
        this.f150783N = new DecimalFormat("00");
        this.f150774E = act;
        this.f150775F = new x20() { // from class: l.j6b0
            @Override // p153l.x20
            public final void call() {
                this.f118538a.m170776D0(y20Var);
            }
        };
        this.f150778I = merchandise;
        this.f150779J = coupon;
        this.f150785P = merchandise.defaultStockKeepUnit.prices.price;
        this.f150784O = ((double) coupon.benefit.localBenefit.discountBenefit.value) / 100.0d;
        this.f150776G = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m170773A0(View view) {
        if (TEnum.equals(this.f150778I.category, "svip") && this.f150778I.semiAnnual()) {
            r1j0.m179420g("仅支持支付宝购买");
        } else if (m170816L0()) {
            r1j0.m179420g("仅支持支付宝购买");
        } else {
            new bo60(this.f150774E, m170825a0(this.f150778I.category)).m105668r(this.f150780K).m105667q(new y20() { // from class: l.d6b0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f85313a.m170784K0((PayMethod) obj);
                }
            }).m105669s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m170774B0(View view) {
        this.f150775F.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m170775C0(View view) {
        m170820W0();
        m170830f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m170776D0(y20 y20Var) {
        dismiss();
        if (y20Var != null) {
            y20Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public void m170784K0(PayMethod payMethod) {
        this.f150780K = payMethod;
        boolean z = false;
        if (TEnum.equals(payMethod, "alipay")) {
            if (CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31077n3()) {
                z = true;
            }
            this.f150799u.setText(z ? R$string.f28308h : R$string.f27960C);
            this.f150799u.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f18263b.getResources().getDrawable(jbc0.f119570f3), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(this.f150780K, "wechat")) {
            this.f150799u.setText(R$string.f28015H);
            this.f150799u.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f18263b.getResources().getDrawable(jbc0.f119556e3), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        VText vText = this.f150804z;
        if (z) {
            vText.setText(String.format("确认协议免密付¥%s", this.f150782M.format(this.f150784O)));
        } else {
            vText.setText(String.format("确认协议并支付¥%s", this.f150782M.format(this.f150784O)));
        }
        m170792P0();
    }

    /* JADX INFO: renamed from: M0 */
    private void m170787M0() {
        if (TEnum.equals(this.f150780K, "wechat")) {
            if (!xl60.m211511p()) {
                lib0.INSTANCE.m154355g(this.f150786Q.getPurchaseTrackId(), this.f150778I.defaultStockKeepUnit.f21249id, "wx not install");
                return;
            }
        } else if (!CoreModule.m30933P().m143405a().mo34527j3() && !xl60.m211506k()) {
            lib0.INSTANCE.m154349a(this.f150786Q.getPurchaseTrackId(), this.f150778I.defaultStockKeepUnit.f21249id, "alipay not install");
            return;
        }
        if (bnl0.m105529O0(this.f150796r) && pta.m173728u() && !this.f150796r.isChecked()) {
            pta.m173706C(this.f150774E, this.f150786Q.mo103692e(), new x20() { // from class: l.z5b0
                @Override // p153l.x20
                public final void call() {
                    this.f203021a.m170812G0();
                }
            }, new x20() { // from class: l.a6b0
                @Override // p153l.x20
                public final void call() {
                    this.f68716a.m170813H0();
                }
            });
            return;
        }
        wn60 wn60Var = new wn60(m170825a0(this.f150778I.category), this.f150774E, "", "");
        if (NullChecker.m82486a(this.f150786Q)) {
            wn60Var.m207144C(this.f150786Q.getPurchaseTrackId());
        }
        wn60Var.m207167r(this.f150779J.couponID);
        if (this.f150778I.autoRenewable()) {
            wn60Var.m207150I(TEnum.equals(this.f150780K, "wechat"), this.f150778I.defaultStockKeepUnit.f21249id, new y20() { // from class: l.b6b0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f75171a.m170814I0((Integer) obj);
                }
            });
        } else {
            wn60Var.m207164o(this.f150778I.defaultStockKeepUnit.f21249id, TEnum.equals(this.f150780K, "wechat"), new y20() { // from class: l.c6b0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f79950a.m170815J0((Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N0 */
    private void m170789N0() {
        long jM174454o = (long) (this.f150779J.endTime - pzi0.m174454o());
        if (jM174454o <= 0) {
            this.f150772C.setText(m170804Y("优惠即将结束 %s", "00:00:00"));
        } else {
            if (jM174454o > 86400000) {
                this.f150772C.setText(m170804Y("优惠 %s 后到期", String.format(Locale.ENGLISH, "%d天", Integer.valueOf((int) (jM174454o / 86400000)))));
                return;
            }
            this.f150772C.setText(m170804Y("优惠即将结束 %s", String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf((int) (jM174454o / 3600000)), Integer.valueOf((int) ((jM174454o % 3600000) / Constants.ONE_MIN_IN_MILLIS)), Integer.valueOf(((int) (jM174454o % Constants.ONE_MIN_IN_MILLIS)) / 1000))));
        }
    }

    /* JADX INFO: renamed from: P0 */
    private void m170792P0() {
        if (CoreModule.m30933P().m143405a().mo34528jh()) {
            if (!TEnum.equals(this.f150780K, "alipay")) {
                bnl0.m105524M(this.f150800v, false);
                return;
            }
            this.f150800v.setText(CoreModule.m30933P().m143405a().mo34305D6());
            bnl0.m105524M(this.f150800v, true);
        }
    }

    /* JADX INFO: renamed from: R0 */
    private void m170795R0() {
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    /* JADX INFO: renamed from: S0 */
    public static void m170797S0(Act act, String str, Merchandise merchandise, y20<Boolean> y20Var, String str2) {
        m170799T0(act, y20Var, merchandise, merchandise.getCouponForPromotion(str), str2, null, null);
    }

    /* JADX INFO: renamed from: T0 */
    public static void m170799T0(Act act, y20<Boolean> y20Var, Merchandise merchandise, Coupon coupon, String str, PayMethod payMethod, Object obj) {
        if (!NullChecker.m82486a(merchandise)) {
            o1j0.m165621C(R$string.f28105P1);
            return;
        }
        if (merchandise.yearly() && TEnum.equals(payMethod, "wechat")) {
            payMethod = PayMethod.get("alipay");
        }
        p6b0 p6b0Var = new p6b0(act, y20Var, merchandise, coupon, str);
        p6b0Var.show();
        p6b0Var.m170818Q0(payMethod);
    }

    /* JADX INFO: renamed from: U0 */
    public static void m170801U0(Act act, y20<Boolean> y20Var, Merchandise merchandise, String str) {
        m170799T0(act, y20Var, merchandise, merchandise.getCouponForPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP), str, null, null);
    }

    /* JADX INFO: renamed from: Y */
    private CharSequence m170804Y(String str, String str2) {
        String str3 = String.format(str, str2);
        int iIndexOf = str3.indexOf(str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD, this.f150774E.color(h9c0.f108379l), qa00.m175861f(18)), iIndexOf, str2.length() + iIndexOf, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g0 */
    private void m170805g0() {
        PurchaseType purchaseType;
        if (this.f150778I.autoRenewable()) {
            String str = String.format(CoreModule.f18263b.getString(R$string.f28005G0), "会员及自动续费协议", "", new DecimalFormat("#.##").format(this.f150785P), this.f150778I.quantityName());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            int iIndexOf = str.indexOf("会员及自动续费协议");
            int i = iIndexOf + 9;
            spannableStringBuilder.setSpan(new da5(bn60.f77437b).m115113b(Color.parseColor("#33000000")).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, i, 18);
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, i, 18);
            this.f150797s.setOnTouchListener(new od0(spannableStringBuilder));
            this.f150797s.setText(spannableStringBuilder);
            return;
        }
        PurchaseType purchaseType2 = PurchaseType.TYPE_NONE;
        if (TEnum.equals(this.f150778I.category, ProductCategory.get("svip"))) {
            purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        } else {
            purchaseType = TEnum.equals(this.f150778I.category, ProductCategory.get(ProductCategory.tttVip)) ? PurchaseType.TYPE_GET_VIP : purchaseType2;
        }
        if (purchaseType != purchaseType2) {
            StringBuilder sb = new StringBuilder("开通前阅读");
            sb.append("《会员服务协议》");
            SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(sb.toString(), jyb.m147507f0("会员服务协议"), Color.parseColor("#33000000"), lyh0.m156283c(3));
            int iIndexOf2 = sb.indexOf("会员服务协议");
            spannableStringBuilderM175796b0.setSpan(new da5(bn60.f77438c).m115113b(Color.parseColor("#33000000")).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf2, iIndexOf2 + 6, 18);
            this.f150797s.setOnTouchListener(new od0(spannableStringBuilderM175796b0));
            this.f150797s.setText(spannableStringBuilderM175796b0);
        }
    }

    /* JADX INFO: renamed from: n0 */
    private void m170806n0() {
        if (efh0.m120692j().m120698l(this.f150779J)) {
            duringCreated(CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get("svip"))).filter(new qcj() { // from class: l.w5b0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.g6b0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f102414a.m170845x0((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r0 */
    private void m170807r0() {
        if (pta.m173728u() && this.f150778I.autoRenewable()) {
            bnl0.m105524M(this.f150796r, true);
            this.f150796r.setChecked(false);
        } else {
            bnl0.m105524M(this.f150796r, false);
        }
        if (vnb.m201959s1()) {
            this.f150788j.setImageResource(m170829e0());
            bnl0.m105540X(this.f150790l, qa00.m175859d(260.0f));
        } else {
            bnl0.m105540X(this.f150790l, qa00.m175859d(210.0f));
            this.f150788j.setImageResource(m170824Z());
        }
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C0221a) this.f150789k.getLayoutParams())).topMargin = bnl0.m105511F0() + qa00.f156320g;
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.m6b0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f134985a.m170808y0(dialogInterface, i, keyEvent);
            }
        });
        m128500x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.n6b0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f140440a.m170809z0(dialogInterface);
            }
        });
        this.f150781L.setRoundingMode(RoundingMode.HALF_UP);
        bnl0.m105509E0(this.f150798t, new View.OnClickListener() { // from class: l.o6b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145154a.m170773A0(view);
            }
        });
        bnl0.m105509E0(this.f150789k, new View.OnClickListener() { // from class: l.x5b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192470a.m170774B0(view);
            }
        });
        bnl0.m105509E0(this.f150803y, new View.OnClickListener() { // from class: l.y5b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197551a.m170775C0(view);
            }
        });
        bnl0.m105524M(this.f150791m, false);
        m170831h0();
        m170789N0();
        m170805g0();
        m170838p0();
        if (efh0.m120692j().m120698l(this.f150779J)) {
            m170837o0();
        } else {
            m170822X0(Collections.singletonList(this.f150778I), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ boolean m170808y0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return true;
        }
        this.f150775F.call();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m170809z0(DialogInterface dialogInterface) {
        w1e.m204401e(this.f150777H);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ Boolean m170810E0(Long l2) {
        return Boolean.valueOf(this.f150779J.endTime - ((double) pzi0.m174454o()) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m170811F0(Long l2) {
        m170789N0();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m170812G0() {
        this.f150796r.setChecked(true);
        m170819V0(true);
        m170830f0();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m170813H0() {
        m170819V0(false);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m170814I0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m170815J0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m170816L0() {
        return this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP) || this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP) || this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP) || this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP) || this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m170817O0() {
        String str;
        if (efh0.m120692j().m120698l(this.f150779J)) {
            double d = this.f150787R;
            str = String.format("原价¥%s元", d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? this.f150781L.format(d) : "-");
        } else {
            str = String.format("原价¥%s元", this.f150781L.format(this.f150785P));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, str.length(), 33);
        this.f150802x.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m170818Q0(PayMethod payMethod) {
        this.f150780K = payMethod;
        if (payMethod == null) {
            this.f150780K = PayMethod.get("alipay");
        }
        if (TEnum.equals(this.f150778I.category, "svip") && this.f150778I.semiAnnual()) {
            this.f150780K = PayMethod.get("alipay");
        }
        m170784K0(this.f150780K);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m170819V0(boolean z) {
        if (NullChecker.m82486a(this.f150786Q) && NullChecker.m82486a(m170825a0(this.f150778I.category))) {
            this.f150786Q.m154341r(this.f150778I, this.f150780K, true, CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31077n3() && TEnum.equals(this.f150780K, "alipay"), this.f150786Q.mo103692e(), m170825a0(this.f150778I.category), z);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m170820W0() {
        this.f150786Q.m154345w(this.f150778I, this.f150780K, true, CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31077n3() && TEnum.equals(this.f150780K, "alipay"));
        i4g0.m138523u("e_purchase_button", "p_purchase_page", jyb.m147494Y("purchaseShowFrom", abb0.m96735b(this.f150776G)), jyb.m147494Y("productType", this.f150778I.category.toString()), jyb.m147494Y("default_duration", this.f150778I.quantity + "m"), jyb.m147494Y("promotion_type", g2f.m128612d(this.f150779J)), jyb.m147494Y("page_style", SchemeKey.promotion));
    }

    /* JADX INFO: renamed from: X */
    public View m170821X(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q6b0.m175546b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m170822X0(List<Merchandise> list, int i) {
        this.f150786Q.m154335D(list, i);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m170823Y0(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            bnl0.m105524M(this.f150770A, false);
            return;
        }
        this.f150770A.setText(this.f150774E.getString(R$string.f28451t1, String.valueOf((long) Math.floor(d))));
        bnl0.m105524M(this.f150770A, true);
    }

    /* JADX INFO: renamed from: Z */
    public final int m170824Z() {
        if (this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP) || this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP) || this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
            return jbc0.f119319M8;
        }
        return (this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP) || this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) ? jbc0.f119403Sa : jbc0.f119492Z8;
    }

    /* JADX INFO: renamed from: a0 */
    public PurchaseType m170825a0(ProductCategory productCategory) {
        String string = productCategory.toString();
        string.getClass();
        if (string.equals(ProductCategory.tttVip)) {
            return PurchaseType.TYPE_GET_VIP;
        }
        if (string.equals("svip")) {
            return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        }
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public String m170826b0() {
        double d = this.f150785P;
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return "-";
        }
        double d2 = this.f150784O;
        if (d2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d2 > d) {
            return "-";
        }
        double d3 = (d2 / d) * 10.0d;
        int i = (int) d3;
        return d3 == ((double) i) ? String.valueOf(i) : new DecimalFormat("#.#").format(d3);
    }

    /* JADX INFO: renamed from: c0 */
    public final PurchaseTrackPageType m170827c0() {
        return (this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP) || this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP)) ? PurchaseTrackPageType.page_discount_callback : PurchaseTrackPageType.page_discount_custom;
    }

    /* JADX INFO: renamed from: d0 */
    public final String m170828d0() {
        Merchandise merchandise = this.f150778I;
        return merchandise == null ? "月" : merchandise.quantityName();
    }

    @Override // p153l.g1e, android.app.Dialog, android.content.DialogInterface, p153l.j1e.InterfaceC17849b
    public void dismiss() {
        super.dismiss();
        v5b0.m199800z(false);
    }

    /* JADX INFO: renamed from: e0 */
    public final int m170829e0() {
        if (this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP) || this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP) || this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
            return jbc0.f119333N8;
        }
        return (this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP) || this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) ? jbc0.f119416Ta : jbc0.f119841y8;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m170830f0() {
        if (this.f150779J.endTime - pzi0.m174454o() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            m170787M0();
            return;
        }
        r1j0.m179420g("优惠券已到期");
        if (TEnum.equals(this.f150780K, "wechat")) {
            lib0.INSTANCE.m154355g(this.f150786Q.getPurchaseTrackId(), this.f150778I.defaultStockKeepUnit.f21249id, "coupon expired");
        } else {
            lib0.INSTANCE.m154349a(this.f150786Q.getPurchaseTrackId(), this.f150778I.defaultStockKeepUnit.f21249id, "coupon expired");
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m170831h0() {
        m170817O0();
        this.f150771B.setText(CoreModule.f18263b.getString(R$string.f28483w0, new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(new BigDecimal(this.f150784O / ((double) z7a.m218877t0(this.f150778I))).setScale(1, 0).doubleValue())));
        if (this.f150778I.yearly()) {
            m170784K0(PayMethod.get("alipay"));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m170832i0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "SVIP");
        spannableStringBuilder.append((CharSequence) m170828d0());
        spannableStringBuilder.append((CharSequence) "卡");
        spannableStringBuilder.append((CharSequence) m170826b0());
        spannableStringBuilder.append((CharSequence) "折特惠");
        this.f150790l.setText(spannableStringBuilder);
        this.f150791m.setText(String.format("SVIP已失效%s天，立刻恢复", nzi0.m165373b(CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("svip")))));
        bnl0.m105524M(this.f150791m, true);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m170833j0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "老用户SVIP首");
        spannableStringBuilder.append((CharSequence) m170828d0());
        spannableStringBuilder.append((CharSequence) m170826b0());
        spannableStringBuilder.append((CharSequence) "折特惠");
        this.f150790l.setText(spannableStringBuilder);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            this.f150791m.setText(String.format("感谢你已陪伴探探%d天", Integer.valueOf(yab.m214862S((long) userM116600p9.createdTime, pzi0.m174454o()))));
            bnl0.m105524M(this.f150791m, true);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m170834k0() {
        this.f150792n.setText("查看谁喜欢了我");
        this.f150793o.setText("每天3次闪聊机会");
        int size = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData(null).size();
        this.f150794p.setText(q8g0.m175800f0(String.format("每月3次优先推荐等总计%s项特权", Integer.valueOf(size)), jyb.m147507f0(String.valueOf(size)), Color.parseColor("#ff7118"), Typeface.DEFAULT));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m170835l0() {
        if (CoreModule.m30933P().m143405a().mo34510h5() && TEnum.equals(this.f150778I.category, "svip")) {
            duringCreated(CoreModule.f18264c.f20396j0.m31596K5()).subscribe(psd0.m173597H(new y20() { // from class: l.k6b0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f124168a.m170843v0((Optional) obj);
                }
            }, new y20() { // from class: l.l6b0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f130244a.m170844w0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m0 */
    public final void m170836m0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "SVIP首");
        spannableStringBuilder.append((CharSequence) m170828d0());
        spannableStringBuilder.append((CharSequence) "限时立省");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f150783N.format(100.0d - ((this.f150784O / this.f150785P) * 100.0d)));
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#ff7118")), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        spannableStringBuilder.append((CharSequence) "%");
        spannableStringBuilder.append((CharSequence) "，配对概率翻倍");
        this.f150790l.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m170837o0() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null) {
            bnl0.m105524M(this.f150791m, false);
            return;
        }
        this.f150791m.setText(String.format("感谢你已陪伴探探%d天", Integer.valueOf(yab.m214862S((long) userM116600p9.createdTime, pzi0.m174454o()))));
        boolean zM184992u = s7a.m184992u();
        VText vText = this.f150791m;
        if (zM184992u) {
            bnl0.m105525M0(vText, false);
        } else {
            bnl0.m105524M(vText, true);
        }
    }

    @Override // p153l.g1e, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        duringCreated(C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureDrop().compose(psd0.m173632y())).takeUntil(new qcj() { // from class: l.h6b0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f108021a.m170810E0((Long) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.i6b0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113155a.m170811F0((Long) obj);
            }
        }));
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM170821X = m170821X(this.f150774E.getLayoutInflater(), null);
        this.f150773D = viewM170821X;
        setContentView(viewM170821X);
        m170795R0();
        if (efh0.m120692j().m120698l(this.f150779J)) {
            this.f150786Q = new beb0(this.f150778I.category, PurchaseTrackPageType.page_discount_12m, this.f150776G);
        } else {
            this.f150786Q = new beb0(this.f150778I.category, m170827c0(), this.f150776G);
        }
        this.f150786Q.m154344v(this.f150778I.category);
        m170807r0();
        m170806n0();
        m170835l0();
        m170818Q0(PayMethod.get("alipay"));
        CoreModule.f18264c.f20333O0.m31073C3();
    }

    @Override // p153l.g1e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m170838p0() {
        int i = C19305a.f150805a[m170825a0(this.f150778I.category).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (s7a.m184995x() && (this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP) || this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP))) {
                m170841t0();
                m170840s0();
                return;
            } else {
                m170842u0();
                m170840s0();
                return;
            }
        }
        if (s7a.m184995x()) {
            if (this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP)) {
                m170832i0();
                m170834k0();
                return;
            } else if (this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP)) {
                m170833j0();
                m170834k0();
                return;
            }
        } else if (s7a.m184993v() && this.f150779J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
            m170839q0();
            m170834k0();
            return;
        }
        m170836m0();
        m170834k0();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: q0 */
    public final void m170839q0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) String.format("SVIP%s卡首", this.f150778I.quantityName()));
        spannableStringBuilder.append((CharSequence) m170828d0());
        spannableStringBuilder.append((CharSequence) "立减");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(String.valueOf((int) (this.f150785P - this.f150784O)));
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#ff7118")), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        spannableStringBuilder.append((CharSequence) "元");
        this.f150790l.setText(spannableStringBuilder);
        VText vText = this.f150791m;
        Coupon coupon = this.f150779J;
        vText.setText(String.format("仅限%s天，过期恢复原价", Integer.valueOf((int) ((coupon.endTime - coupon.beginTime) / 8.64E7d))));
        bnl0.m105524M(this.f150791m, true);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m170840s0() {
        this.f150792n.setText("无限次右滑");
        this.f150793o.setText("每天5个超级喜欢");
        String strValueOf = String.valueOf(PurchaseType.TYPE_GET_VIP.getPrivilegeData(null).size());
        this.f150794p.setText(q8g0.m175800f0(String.format("滑错随时反悔等总计%s项特权", strValueOf), jyb.m147507f0(strValueOf), Color.parseColor("#ff7118"), Typeface.DEFAULT));
    }

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        super.show();
        l4g0 l4g0VarM204399c = w1e.m204399c("p_purchase_page", getClass().getName());
        this.f150777H = l4g0VarM204399c;
        l4g0VarM204399c.m152781p(jyb.m147494Y("purchaseShowFrom", abb0.m96735b(this.f150776G)), jyb.m147494Y("productType", this.f150778I.category.toString()), jyb.m147494Y("default_duration", this.f150778I.quantity + "m"), jyb.m147494Y("promotion_type", g2f.m128612d(this.f150779J)), jyb.m147494Y("page_style", SchemeKey.promotion));
        w1e.m204402f(this.f150777H);
        v5b0.m199800z(true);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m170841t0() {
        this.f150790l.setText(String.format("VIP惊喜%s折限时秒杀", m170826b0()));
        this.f150791m.setText("老用户专享福利");
        bnl0.m105524M(this.f150791m, true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: u0 */
    public final void m170842u0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "VIP首");
        spannableStringBuilder.append((CharSequence) m170828d0());
        spannableStringBuilder.append((CharSequence) "限时立省");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f150783N.format(100.0d - ((this.f150784O / this.f150785P) * 100.0d)));
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#ff7118")), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        spannableStringBuilder.append((CharSequence) "%");
        spannableStringBuilder.append((CharSequence) "，配对概率翻倍");
        this.f150790l.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m170843v0(Optional optional) {
        if (optional.isPresent()) {
            double d = ((RefundDetail) optional.get()).totalRefundAmount;
            if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                m170823Y0(d);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m170844w0(Throwable th) {
        m170823Y0(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m170845x0(List list) {
        final Merchandise merchandise = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.e6b0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(merchandise2.monthly() && !merchandise2.autoRenewable());
            }
        });
        m170822X0(list, jyb.m147476G(list, new qcj() { // from class: l.f6b0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Merchandise) obj) == merchandise);
            }
        }));
        if (NullChecker.m82486a(merchandise)) {
            this.f150787R = merchandise.defaultStockKeepUnit.prices.price * 12.0d;
            m170817O0();
            int iM120696i = efh0.m120692j().m120696i(this.f150778I, merchandise);
            String strValueOf = iM120696i > 0 ? String.valueOf(iM120696i) : "-";
            if (!s7a.m184992u()) {
                this.f150790l.setText(String.format("SVIP年卡老用户%s折特惠", strValueOf));
                return;
            }
            this.f150789k.setImageResource(jbc0.f119534c9);
            boolean zM201959s1 = vnb.m201959s1();
            VImage vImage = this.f150788j;
            if (zM201959s1) {
                vImage.setImageDrawable(CoreModule.f18263b.getResources().getDrawable(jbc0.f119520b9));
            } else {
                vImage.setImageDrawable(CoreModule.f18263b.getResources().getDrawable(jbc0.f119506a9));
            }
            this.f150790l.setText(String.format("618大促，SVIP年卡%s折特惠", strValueOf));
        }
    }
}
