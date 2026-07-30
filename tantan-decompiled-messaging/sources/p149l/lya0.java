package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RefundDetail;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
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
import p133rx.C22306c;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes4.dex */
public class lya0 extends szd {

    /* JADX INFO: renamed from: A */
    public VText f130518A;

    /* JADX INFO: renamed from: B */
    public VText f130519B;

    /* JADX INFO: renamed from: C */
    public VText f130520C;

    /* JADX INFO: renamed from: D */
    public View f130521D;

    /* JADX INFO: renamed from: E */
    public Act f130522E;

    /* JADX INFO: renamed from: F */
    @NonNull
    public d30 f130523F;

    /* JADX INFO: renamed from: G */
    public String f130524G;

    /* JADX INFO: renamed from: H */
    public cwf0 f130525H;

    /* JADX INFO: renamed from: I */
    public Merchandise f130526I;

    /* JADX INFO: renamed from: J */
    public Coupon f130527J;

    /* JADX INFO: renamed from: K */
    public PayMethod f130528K;

    /* JADX INFO: renamed from: L */
    public DecimalFormat f130529L;

    /* JADX INFO: renamed from: M */
    public DecimalFormat f130530M;

    /* JADX INFO: renamed from: N */
    public NumberFormat f130531N;

    /* JADX INFO: renamed from: O */
    public double f130532O;

    /* JADX INFO: renamed from: P */
    public double f130533P;

    /* JADX INFO: renamed from: Q */
    public hab0 f130534Q;

    /* JADX INFO: renamed from: R */
    public double f130535R;

    /* JADX INFO: renamed from: j */
    public VImage f130536j;

    /* JADX INFO: renamed from: k */
    public VImage f130537k;

    /* JADX INFO: renamed from: l */
    public VText f130538l;

    /* JADX INFO: renamed from: m */
    public VText f130539m;

    /* JADX INFO: renamed from: n */
    public VText f130540n;

    /* JADX INFO: renamed from: o */
    public VText f130541o;

    /* JADX INFO: renamed from: p */
    public VText f130542p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f130543q;

    /* JADX INFO: renamed from: r */
    public VCheckBox f130544r;

    /* JADX INFO: renamed from: s */
    public VText f130545s;

    /* JADX INFO: renamed from: t */
    public RelativeLayout f130546t;

    /* JADX INFO: renamed from: u */
    public TextView f130547u;

    /* JADX INFO: renamed from: v */
    public VText f130548v;

    /* JADX INFO: renamed from: w */
    public View f130549w;

    /* JADX INFO: renamed from: x */
    public VText f130550x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f130551y;

    /* JADX INFO: renamed from: z */
    public VText f130552z;

    /* JADX INFO: renamed from: l.lya0$a */
    public static /* synthetic */ class C18352a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f130553a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f130553a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f130553a[PurchaseType.TYPE_GET_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public lya0(Act act, final e30<Boolean> e30Var, Merchandise merchandise, Coupon coupon, String str) {
        super(act, false, y7c0.f196692b);
        this.f130529L = new DecimalFormat("#.#");
        this.f130530M = new DecimalFormat("#.#");
        this.f130531N = new DecimalFormat("00");
        this.f130522E = act;
        this.f130523F = new d30() { // from class: l.fya0
            @Override // p149l.d30
            public final void call() {
                this.f99847a.m152160D0(e30Var);
            }
        };
        this.f130526I = merchandise;
        this.f130527J = coupon;
        this.f130533P = merchandise.defaultStockKeepUnit.prices.price;
        this.f130532O = ((double) coupon.benefit.localBenefit.discountBenefit.value) / 100.0d;
        this.f130524G = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m152157A0(View view) {
        if (TEnum.equals(this.f130526I.category, "svip") && this.f130526I.semiAnnual()) {
            osi0.m165783g("仅支持支付宝购买");
        } else if (m152200L0()) {
            osi0.m165783g("仅支持支付宝购买");
        } else {
            new wf60(this.f130522E, m152209a0(this.f130526I.category)).m202975r(this.f130528K).m202974q(new e30() { // from class: l.zxa0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f205394a.m152168K0((PayMethod) obj);
                }
            }).m202976s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m152158B0(View view) {
        this.f130523F.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m152159C0(View view) {
        m152204W0();
        m152214f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m152160D0(e30 e30Var) {
        dismiss();
        if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public void m152168K0(PayMethod payMethod) {
        this.f130528K = payMethod;
        boolean z = false;
        if (TEnum.equals(payMethod, "alipay")) {
            if (CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30079n3()) {
                z = true;
            }
            this.f130547u.setText(z ? R$string.f27460h : R$string.f27112C);
            this.f130547u.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f17544b.getResources().getDrawable(d3c0.f83915f3), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(this.f130528K, "wechat")) {
            this.f130547u.setText(R$string.f27167H);
            this.f130547u.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f17544b.getResources().getDrawable(d3c0.f83901e3), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        VText vText = this.f130552z;
        if (z) {
            vText.setText(String.format("确认协议免密付¥%s", this.f130530M.format(this.f130532O)));
        } else {
            vText.setText(String.format("确认协议并支付¥%s", this.f130530M.format(this.f130532O)));
        }
        m152176P0();
    }

    /* JADX INFO: renamed from: M0 */
    private void m152171M0() {
        if (TEnum.equals(this.f130528K, "wechat")) {
            if (!sd60.m183465p()) {
                hab0.INSTANCE.m130133g(this.f130534Q.getPurchaseTrackId(), this.f130526I.defaultStockKeepUnit.f20507id, "wx not install");
                return;
            }
        } else if (!CoreModule.m29935P().m94651a().mo33524j3() && !sd60.m183460k()) {
            hab0.INSTANCE.m130127a(this.f130534Q.getPurchaseTrackId(), this.f130526I.defaultStockKeepUnit.f20507id, "alipay not install");
            return;
        }
        if (xdl0.m208349O0(this.f130544r) && dsa.m113448u() && !this.f130544r.isChecked()) {
            dsa.m113426C(this.f130522E, this.f130534Q.mo130106e(), new d30() { // from class: l.vxa0
                @Override // p149l.d30
                public final void call() {
                    this.f183437a.m152196G0();
                }
            }, new d30() { // from class: l.wxa0
                @Override // p149l.d30
                public final void call() {
                    this.f188465a.m152197H0();
                }
            });
            return;
        }
        rf60 rf60Var = new rf60(m152209a0(this.f130526I.category), this.f130522E, "", "");
        if (NullChecker.m81303a(this.f130534Q)) {
            rf60Var.m179078C(this.f130534Q.getPurchaseTrackId());
        }
        rf60Var.m179101r(this.f130527J.couponID);
        if (this.f130526I.autoRenewable()) {
            rf60Var.m179084I(TEnum.equals(this.f130528K, "wechat"), this.f130526I.defaultStockKeepUnit.f20507id, new e30() { // from class: l.xxa0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f194848a.m152198I0((Integer) obj);
                }
            });
        } else {
            rf60Var.m179098o(this.f130526I.defaultStockKeepUnit.f20507id, TEnum.equals(this.f130528K, "wechat"), new e30() { // from class: l.yxa0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f200587a.m152199J0((Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N0 */
    private void m152173N0() {
        long jM155944o = (long) (this.f130527J.endTime - mqi0.m155944o());
        if (jM155944o <= 0) {
            this.f130520C.setText(m152188Y("优惠即将结束 %s", "00:00:00"));
        } else {
            if (jM155944o > 86400000) {
                this.f130520C.setText(m152188Y("优惠 %s 后到期", String.format(Locale.ENGLISH, "%d天", Integer.valueOf((int) (jM155944o / 86400000)))));
                return;
            }
            this.f130520C.setText(m152188Y("优惠即将结束 %s", String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf((int) (jM155944o / 3600000)), Integer.valueOf((int) ((jM155944o % 3600000) / Constants.ONE_MIN_IN_MILLIS)), Integer.valueOf(((int) (jM155944o % Constants.ONE_MIN_IN_MILLIS)) / 1000))));
        }
    }

    /* JADX INFO: renamed from: P0 */
    private void m152176P0() {
        if (CoreModule.m29935P().m94651a().mo33525jh()) {
            if (!TEnum.equals(this.f130528K, "alipay")) {
                xdl0.m208344M(this.f130548v, false);
                return;
            }
            this.f130548v.setText(CoreModule.m29935P().m94651a().mo33302D6());
            xdl0.m208344M(this.f130548v, true);
        }
    }

    /* JADX INFO: renamed from: R0 */
    private void m152179R0() {
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    /* JADX INFO: renamed from: S0 */
    public static void m152181S0(Act act, String str, Merchandise merchandise, e30<Boolean> e30Var, String str2) {
        m152183T0(act, e30Var, merchandise, merchandise.getCouponForPromotion(str), str2, null, null);
    }

    /* JADX INFO: renamed from: T0 */
    public static void m152183T0(Act act, e30<Boolean> e30Var, Merchandise merchandise, Coupon coupon, String str, PayMethod payMethod, Object obj) {
        if (!NullChecker.m81303a(merchandise)) {
            lsi0.m151565C(R$string.f27257P1);
            return;
        }
        if (merchandise.yearly() && TEnum.equals(payMethod, "wechat")) {
            payMethod = PayMethod.get("alipay");
        }
        lya0 lya0Var = new lya0(act, e30Var, merchandise, coupon, str);
        lya0Var.show();
        lya0Var.m152202Q0(payMethod);
    }

    /* JADX INFO: renamed from: U0 */
    public static void m152185U0(Act act, e30<Boolean> e30Var, Merchandise merchandise, String str) {
        m152183T0(act, e30Var, merchandise, merchandise.getCouponForPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP), str, null, null);
    }

    /* JADX INFO: renamed from: Y */
    private CharSequence m152188Y(String str, String str2) {
        String str3 = String.format(str, str2);
        int iIndexOf = str3.indexOf(str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD, this.f130522E.color(b1c0.f72559l), t100.m186892f(18)), iIndexOf, str2.length() + iIndexOf, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g0 */
    private void m152189g0() {
        PurchaseType purchaseType;
        if (this.f130526I.autoRenewable()) {
            String str = String.format(CoreModule.f17544b.getString(R$string.f27157G0), "会员及自动续费协议", "", new DecimalFormat("#.##").format(this.f130533P), this.f130526I.quantityName());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            int iIndexOf = str.indexOf("会员及自动续费协议");
            int i = iIndexOf + 9;
            spannableStringBuilder.setSpan(new c95(we60.f185908b).m105841b(Color.parseColor("#33000000")).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, i, 18);
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, i, 18);
            this.f130545s.setOnTouchListener(new sd0(spannableStringBuilder));
            this.f130545s.setText(spannableStringBuilder);
            return;
        }
        PurchaseType purchaseType2 = PurchaseType.TYPE_NONE;
        if (TEnum.equals(this.f130526I.category, ProductCategory.get("svip"))) {
            purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        } else {
            purchaseType = TEnum.equals(this.f130526I.category, ProductCategory.get(ProductCategory.tttVip)) ? PurchaseType.TYPE_GET_VIP : purchaseType2;
        }
        if (purchaseType != purchaseType2) {
            StringBuilder sb = new StringBuilder("开通前阅读");
            sb.append("《会员服务协议》");
            SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(sb.toString(), vwb.m200324f0("会员服务协议"), Color.parseColor("#33000000"), eqh0.m117752c(3));
            int iIndexOf2 = sb.indexOf("会员服务协议");
            spannableStringBuilderM133861b0.setSpan(new c95(we60.f185909c).m105841b(Color.parseColor("#33000000")).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf2, iIndexOf2 + 6, 18);
            this.f130545s.setOnTouchListener(new sd0(spannableStringBuilderM133861b0));
            this.f130545s.setText(spannableStringBuilderM133861b0);
        }
    }

    /* JADX INFO: renamed from: n0 */
    private void m152190n0() {
        if (w6h0.m201818j().m201824l(this.f130527J)) {
            duringCreated(CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get("svip"))).filter(new w9j() { // from class: l.sxa0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.cya0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f82945a.m152229x0((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r0 */
    private void m152191r0() {
        if (dsa.m113448u() && this.f130526I.autoRenewable()) {
            xdl0.m208344M(this.f130544r, true);
            this.f130544r.setChecked(false);
        } else {
            xdl0.m208344M(this.f130544r, false);
        }
        if (hmb.m131714s1()) {
            this.f130536j.setImageResource(m152213e0());
            xdl0.m208360X(this.f130538l, t100.m186890d(260.0f));
        } else {
            xdl0.m208360X(this.f130538l, t100.m186890d(210.0f));
            this.f130536j.setImageResource(m152208Z());
        }
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C0220a) this.f130537k.getLayoutParams())).topMargin = xdl0.m208331F0() + t100.f167258g;
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.iya0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f115439a.m152192y0(dialogInterface, i, keyEvent);
            }
        });
        m186758x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jya0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f120293a.m152193z0(dialogInterface);
            }
        });
        this.f130529L.setRoundingMode(RoundingMode.HALF_UP);
        xdl0.m208329E0(this.f130546t, new View.OnClickListener() { // from class: l.kya0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125262a.m152157A0(view);
            }
        });
        xdl0.m208329E0(this.f130537k, new View.OnClickListener() { // from class: l.txa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172499a.m152158B0(view);
            }
        });
        xdl0.m208329E0(this.f130551y, new View.OnClickListener() { // from class: l.uxa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178719a.m152159C0(view);
            }
        });
        xdl0.m208344M(this.f130539m, false);
        m152215h0();
        m152173N0();
        m152189g0();
        m152222p0();
        if (w6h0.m201818j().m201824l(this.f130527J)) {
            m152221o0();
        } else {
            m152206X0(Collections.singletonList(this.f130526I), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ boolean m152192y0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return true;
        }
        this.f130523F.call();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m152193z0(DialogInterface dialogInterface) {
        i0e.m133796e(this.f130525H);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ Boolean m152194E0(Long l2) {
        return Boolean.valueOf(this.f130527J.endTime - ((double) mqi0.m155944o()) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m152195F0(Long l2) {
        m152173N0();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m152196G0() {
        this.f130544r.setChecked(true);
        m152203V0(true);
        m152214f0();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m152197H0() {
        m152203V0(false);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m152198I0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m152199J0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m152200L0() {
        return this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP) || this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP) || this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP) || this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP) || this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m152201O0() {
        String str;
        if (w6h0.m201818j().m201824l(this.f130527J)) {
            double d = this.f130535R;
            str = String.format("原价¥%s元", d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? this.f130529L.format(d) : "-");
        } else {
            str = String.format("原价¥%s元", this.f130529L.format(this.f130533P));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, str.length(), 33);
        this.f130550x.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m152202Q0(PayMethod payMethod) {
        this.f130528K = payMethod;
        if (payMethod == null) {
            this.f130528K = PayMethod.get("alipay");
        }
        if (TEnum.equals(this.f130526I.category, "svip") && this.f130526I.semiAnnual()) {
            this.f130528K = PayMethod.get("alipay");
        }
        m152168K0(this.f130528K);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m152203V0(boolean z) {
        if (NullChecker.m81303a(this.f130534Q) && NullChecker.m81303a(m152209a0(this.f130526I.category))) {
            this.f130534Q.m130119r(this.f130526I, this.f130528K, true, CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30079n3() && TEnum.equals(this.f130528K, "alipay"), this.f130534Q.mo130106e(), m152209a0(this.f130526I.category), z);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m152204W0() {
        this.f130534Q.m130123w(this.f130526I, this.f130528K, true, CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30079n3() && TEnum.equals(this.f130528K, "alipay"));
        zvf0.m220399u("e_purchase_button", "p_purchase_page", vwb.m200311Y("purchaseShowFrom", w2b0.m201088b(this.f130524G)), vwb.m200311Y("productType", this.f130526I.category.toString()), vwb.m200311Y("default_duration", this.f130526I.quantity + "m"), vwb.m200311Y("promotion_type", b1f.m99831d(this.f130527J)), vwb.m200311Y("page_style", SchemeKey.promotion));
    }

    /* JADX INFO: renamed from: X */
    public View m152205X(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mya0.m157000b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m152206X0(List<Merchandise> list, int i) {
        this.f130534Q.m130101D(list, i);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m152207Y0(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            xdl0.m208344M(this.f130518A, false);
            return;
        }
        this.f130518A.setText(this.f130522E.getString(R$string.f27603t1, String.valueOf((long) Math.floor(d))));
        xdl0.m208344M(this.f130518A, true);
    }

    /* JADX INFO: renamed from: Z */
    public final int m152208Z() {
        if (this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP) || this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP) || this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
            return d3c0.f83664M8;
        }
        return (this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP) || this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) ? d3c0.f83748Sa : d3c0.f83837Z8;
    }

    /* JADX INFO: renamed from: a0 */
    public PurchaseType m152209a0(ProductCategory productCategory) {
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
    public String m152210b0() {
        double d = this.f130533P;
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return "-";
        }
        double d2 = this.f130532O;
        if (d2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d2 > d) {
            return "-";
        }
        double d3 = (d2 / d) * 10.0d;
        int i = (int) d3;
        return d3 == ((double) i) ? String.valueOf(i) : new DecimalFormat("#.#").format(d3);
    }

    /* JADX INFO: renamed from: c0 */
    public final PurchaseTrackPageType m152211c0() {
        return (this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP) || this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP)) ? PurchaseTrackPageType.page_discount_callback : PurchaseTrackPageType.page_discount_custom;
    }

    /* JADX INFO: renamed from: d0 */
    public final String m152212d0() {
        Merchandise merchandise = this.f130526I;
        return merchandise == null ? "月" : merchandise.quantityName();
    }

    @Override // p149l.szd, android.app.Dialog, android.content.DialogInterface, p149l.vzd.InterfaceC20772b
    public void dismiss() {
        super.dismiss();
        rxa0.m181505z(false);
    }

    /* JADX INFO: renamed from: e0 */
    public final int m152213e0() {
        if (this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP) || this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP) || this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
            return d3c0.f83678N8;
        }
        return (this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP) || this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) ? d3c0.f83761Ta : d3c0.f84186y8;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m152214f0() {
        if (this.f130527J.endTime - mqi0.m155944o() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            m152171M0();
            return;
        }
        osi0.m165783g("优惠券已到期");
        if (TEnum.equals(this.f130528K, "wechat")) {
            hab0.INSTANCE.m130133g(this.f130534Q.getPurchaseTrackId(), this.f130526I.defaultStockKeepUnit.f20507id, "coupon expired");
        } else {
            hab0.INSTANCE.m130127a(this.f130534Q.getPurchaseTrackId(), this.f130526I.defaultStockKeepUnit.f20507id, "coupon expired");
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m152215h0() {
        m152201O0();
        this.f130519B.setText(CoreModule.f17544b.getString(R$string.f27635w0, new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(new BigDecimal(this.f130532O / ((double) n6a.m158032t0(this.f130526I))).setScale(1, 0).doubleValue())));
        if (this.f130526I.yearly()) {
            m152168K0(PayMethod.get("alipay"));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m152216i0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "SVIP");
        spannableStringBuilder.append((CharSequence) m152212d0());
        spannableStringBuilder.append((CharSequence) "卡");
        spannableStringBuilder.append((CharSequence) m152210b0());
        spannableStringBuilder.append((CharSequence) "折特惠");
        this.f130538l.setText(spannableStringBuilder);
        this.f130539m.setText(String.format("SVIP已失效%s天，立刻恢复", kqi0.m146948b(CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("svip")))));
        xdl0.m208344M(this.f130539m, true);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m152217j0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "老用户SVIP首");
        spannableStringBuilder.append((CharSequence) m152212d0());
        spannableStringBuilder.append((CharSequence) m152210b0());
        spannableStringBuilder.append((CharSequence) "折特惠");
        this.f130538l.setText(spannableStringBuilder);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            this.f130539m.setText(String.format("感谢你已陪伴探探%d天", Integer.valueOf(l9b.m149010S((long) userM169527p9.createdTime, mqi0.m155944o()))));
            xdl0.m208344M(this.f130539m, true);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m152218k0() {
        this.f130540n.setText("查看谁喜欢了我");
        this.f130541o.setText("每天3次闪聊机会");
        int size = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData(null).size();
        this.f130542p.setText(i0g0.m133865f0(String.format("每月3次优先推荐等总计%s项特权", Integer.valueOf(size)), vwb.m200324f0(String.valueOf(size)), Color.parseColor("#ff7118"), Typeface.DEFAULT));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m152219l0() {
        if (CoreModule.m29935P().m94651a().mo33507h5() && TEnum.equals(this.f130526I.category, "svip")) {
            duringCreated(CoreModule.f17545c.f19654j0.m30593K5()).subscribe(mkd0.m154956H(new e30() { // from class: l.gya0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104980a.m152227v0((Optional) obj);
                }
            }, new e30() { // from class: l.hya0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f110042a.m152228w0((Throwable) obj);
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
    public final void m152220m0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "SVIP首");
        spannableStringBuilder.append((CharSequence) m152212d0());
        spannableStringBuilder.append((CharSequence) "限时立省");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f130531N.format(100.0d - ((this.f130532O / this.f130533P) * 100.0d)));
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#ff7118")), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        spannableStringBuilder.append((CharSequence) "%");
        spannableStringBuilder.append((CharSequence) "，配对概率翻倍");
        this.f130538l.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m152221o0() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 == null) {
            xdl0.m208344M(this.f130539m, false);
            return;
        }
        this.f130539m.setText(String.format("感谢你已陪伴探探%d天", Integer.valueOf(l9b.m149010S((long) userM169527p9.createdTime, mqi0.m155944o()))));
        boolean zM124572u = g6a.m124572u();
        VText vText = this.f130539m;
        if (zM124572u) {
            xdl0.m208345M0(vText, false);
        } else {
            xdl0.m208344M(vText, true);
        }
    }

    @Override // p149l.szd, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        duringCreated(C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureDrop().compose(mkd0.m154991y())).takeUntil(new w9j() { // from class: l.dya0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88360a.m152194E0((Long) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.eya0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93734a.m152195F0((Long) obj);
            }
        }));
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM152205X = m152205X(this.f130522E.getLayoutInflater(), null);
        this.f130521D = viewM152205X;
        setContentView(viewM152205X);
        m152179R0();
        if (w6h0.m201818j().m201824l(this.f130527J)) {
            this.f130534Q = new x5b0(this.f130526I.category, PurchaseTrackPageType.page_discount_12m, this.f130524G);
        } else {
            this.f130534Q = new x5b0(this.f130526I.category, m152211c0(), this.f130524G);
        }
        this.f130534Q.m130122v(this.f130526I.category);
        m152191r0();
        m152190n0();
        m152219l0();
        m152202Q0(PayMethod.get("alipay"));
        CoreModule.f17545c.f19591O0.m30075C3();
    }

    @Override // p149l.szd, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m152222p0() {
        int i = C18352a.f130553a[m152209a0(this.f130526I.category).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (g6a.m124575x() && (this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP) || this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP))) {
                m152225t0();
                m152224s0();
                return;
            } else {
                m152226u0();
                m152224s0();
                return;
            }
        }
        if (g6a.m124575x()) {
            if (this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP)) {
                m152216i0();
                m152218k0();
                return;
            } else if (this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP)) {
                m152217j0();
                m152218k0();
                return;
            }
        } else if (g6a.m124573v() && this.f130527J.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
            m152223q0();
            m152218k0();
            return;
        }
        m152220m0();
        m152218k0();
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
    public final void m152223q0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) String.format("SVIP%s卡首", this.f130526I.quantityName()));
        spannableStringBuilder.append((CharSequence) m152212d0());
        spannableStringBuilder.append((CharSequence) "立减");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(String.valueOf((int) (this.f130533P - this.f130532O)));
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#ff7118")), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        spannableStringBuilder.append((CharSequence) "元");
        this.f130538l.setText(spannableStringBuilder);
        VText vText = this.f130539m;
        Coupon coupon = this.f130527J;
        vText.setText(String.format("仅限%s天，过期恢复原价", Integer.valueOf((int) ((coupon.endTime - coupon.beginTime) / 8.64E7d))));
        xdl0.m208344M(this.f130539m, true);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m152224s0() {
        this.f130540n.setText("无限次右滑");
        this.f130541o.setText("每天5个超级喜欢");
        String strValueOf = String.valueOf(PurchaseType.TYPE_GET_VIP.getPrivilegeData(null).size());
        this.f130542p.setText(i0g0.m133865f0(String.format("滑错随时反悔等总计%s项特权", strValueOf), vwb.m200324f0(strValueOf), Color.parseColor("#ff7118"), Typeface.DEFAULT));
    }

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        super.show();
        cwf0 cwf0VarM133794c = i0e.m133794c("p_purchase_page", getClass().getName());
        this.f130525H = cwf0VarM133794c;
        cwf0VarM133794c.m109040p(vwb.m200311Y("purchaseShowFrom", w2b0.m201088b(this.f130524G)), vwb.m200311Y("productType", this.f130526I.category.toString()), vwb.m200311Y("default_duration", this.f130526I.quantity + "m"), vwb.m200311Y("promotion_type", b1f.m99831d(this.f130527J)), vwb.m200311Y("page_style", SchemeKey.promotion));
        i0e.m133797f(this.f130525H);
        rxa0.m181505z(true);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m152225t0() {
        this.f130538l.setText(String.format("VIP惊喜%s折限时秒杀", m152210b0()));
        this.f130539m.setText("老用户专享福利");
        xdl0.m208344M(this.f130539m, true);
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
    public final void m152226u0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "VIP首");
        spannableStringBuilder.append((CharSequence) m152212d0());
        spannableStringBuilder.append((CharSequence) "限时立省");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f130531N.format(100.0d - ((this.f130532O / this.f130533P) * 100.0d)));
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#ff7118")), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        spannableStringBuilder.append((CharSequence) "%");
        spannableStringBuilder.append((CharSequence) "，配对概率翻倍");
        this.f130538l.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m152227v0(Optional optional) {
        if (optional.isPresent()) {
            double d = ((RefundDetail) optional.get()).totalRefundAmount;
            if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                m152207Y0(d);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m152228w0(Throwable th) {
        m152207Y0(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m152229x0(List list) {
        final Merchandise merchandise = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.aya0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(merchandise2.monthly() && !merchandise2.autoRenewable());
            }
        });
        m152206X0(list, vwb.m200293G(list, new w9j() { // from class: l.bya0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Merchandise) obj) == merchandise);
            }
        }));
        if (NullChecker.m81303a(merchandise)) {
            this.f130535R = merchandise.defaultStockKeepUnit.prices.price * 12.0d;
            m152201O0();
            int iM201822i = w6h0.m201818j().m201822i(this.f130526I, merchandise);
            String strValueOf = iM201822i > 0 ? String.valueOf(iM201822i) : "-";
            if (!g6a.m124572u()) {
                this.f130538l.setText(String.format("SVIP年卡老用户%s折特惠", strValueOf));
                return;
            }
            this.f130537k.setImageResource(d3c0.f83879c9);
            boolean zM131714s1 = hmb.m131714s1();
            VImage vImage = this.f130536j;
            if (zM131714s1) {
                vImage.setImageDrawable(CoreModule.f17544b.getResources().getDrawable(d3c0.f83865b9));
            } else {
                vImage.setImageDrawable(CoreModule.f17544b.getResources().getDrawable(d3c0.f83851a9));
            }
            this.f130538l.setText(String.format("618大促，SVIP年卡%s折特惠", strValueOf));
        }
    }
}
