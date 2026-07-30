package p002l;

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
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeData;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RefundDetail;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l.b1c0;
import l.b1f;
import l.c95;
import l.cwf0;
import l.d30;
import l.d3c0;
import l.dsa;
import l.e30;
import l.eqh0;
import l.g6a;
import l.hab0;
import l.hmb;
import l.i0e;
import l.i0g0;
import l.j760;
import l.kqi0;
import l.l9b;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.mya0;
import l.n6a;
import l.osi0;
import l.rf60;
import l.rxa0;
import l.sd60;
import l.szd;
import l.t100;
import l.vwb;
import l.w2b0;
import l.w6h0;
import l.w9j;
import l.we60;
import l.x5b0;
import l.xdl0;
import l.y7c0;
import l.zvf0;
import rx.c;
import v.VCheckBox;
import v.VImage;
import v.VText;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lya0 extends szd {

    /* JADX INFO: renamed from: A */
    public VText f15137A;

    /* JADX INFO: renamed from: B */
    public VText f15138B;

    /* JADX INFO: renamed from: C */
    public VText f15139C;

    /* JADX INFO: renamed from: D */
    public View f15140D;

    /* JADX INFO: renamed from: E */
    public Act f15141E;

    /* JADX INFO: renamed from: F */
    @NonNull
    public d30 f15142F;

    /* JADX INFO: renamed from: G */
    public String f15143G;

    /* JADX INFO: renamed from: H */
    public cwf0 f15144H;

    /* JADX INFO: renamed from: I */
    public Merchandise f15145I;

    /* JADX INFO: renamed from: J */
    public Coupon f15146J;

    /* JADX INFO: renamed from: K */
    public PayMethod f15147K;

    /* JADX INFO: renamed from: L */
    public DecimalFormat f15148L;

    /* JADX INFO: renamed from: M */
    public DecimalFormat f15149M;

    /* JADX INFO: renamed from: N */
    public NumberFormat f15150N;

    /* JADX INFO: renamed from: O */
    public double f15151O;

    /* JADX INFO: renamed from: P */
    public double f15152P;

    /* JADX INFO: renamed from: Q */
    public hab0 f15153Q;

    /* JADX INFO: renamed from: R */
    public double f15154R;

    /* JADX INFO: renamed from: j */
    public VImage f15155j;

    /* JADX INFO: renamed from: k */
    public VImage f15156k;

    /* JADX INFO: renamed from: l */
    public VText f15157l;

    /* JADX INFO: renamed from: m */
    public VText f15158m;

    /* JADX INFO: renamed from: n */
    public VText f15159n;

    /* JADX INFO: renamed from: o */
    public VText f15160o;

    /* JADX INFO: renamed from: p */
    public VText f15161p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f15162q;

    /* JADX INFO: renamed from: r */
    public VCheckBox f15163r;

    /* JADX INFO: renamed from: s */
    public VText f15164s;

    /* JADX INFO: renamed from: t */
    public RelativeLayout f15165t;

    /* JADX INFO: renamed from: u */
    public TextView f15166u;

    /* JADX INFO: renamed from: v */
    public VText f15167v;

    /* JADX INFO: renamed from: w */
    public View f15168w;

    /* JADX INFO: renamed from: x */
    public VText f15169x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f15170y;

    /* JADX INFO: renamed from: z */
    public VText f15171z;

    /* JADX INFO: renamed from: l.lya0$a */
    public static /* synthetic */ class C0672a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15172a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f15172a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15172a[PurchaseType.TYPE_GET_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public lya0(Act act, final e30<Boolean> e30Var, Merchandise merchandise, Coupon coupon, String str) {
        super(act, false, y7c0.b);
        this.f15148L = new DecimalFormat("#.#");
        this.f15149M = new DecimalFormat("#.#");
        this.f15150N = new DecimalFormat("00");
        this.f15141E = act;
        this.f15142F = new d30() { // from class: l.fya0
            public final void call() {
                this.f10684a.m17552D0(e30Var);
            }
        };
        this.f15145I = merchandise;
        this.f15146J = coupon;
        this.f15152P = merchandise.defaultStockKeepUnit.prices.price;
        this.f15151O = ((double) coupon.benefit.localBenefit.discountBenefit.value) / 100.0d;
        this.f15143G = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m17549A0(View view) {
        if (TEnum.equals(this.f15145I.category, "svip") && this.f15145I.semiAnnual()) {
            osi0.g("仅支持支付宝购买");
        } else if (m17592L0()) {
            osi0.g("仅支持支付宝购买");
        } else {
            new wf60(this.f15141E, m17601a0(this.f15145I.category)).m24556r(this.f15147K).m24555q(new e30() { // from class: l.zxa0
                public final void call(Object obj) {
                    this.f23661a.m17560K0((PayMethod) obj);
                }
            }).m24557s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m17550B0(View view) {
        this.f15142F.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m17551C0(View view) {
        m17596W0();
        m17606f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m17552D0(e30 e30Var) {
        dismiss();
        if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public void m17560K0(PayMethod payMethod) {
        this.f15147K = payMethod;
        boolean z = false;
        if (TEnum.equals(payMethod, "alipay")) {
            if (CoreModule.P().a().U() && CoreModule.c.O0.n3()) {
                z = true;
            }
            this.f15166u.setText(z ? R.string.h : R.string.C);
            this.f15166u.setCompoundDrawablesWithIntrinsicBounds(CoreModule.b.getResources().getDrawable(d3c0.f3), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(this.f15147K, "wechat")) {
            this.f15166u.setText(R.string.H);
            this.f15166u.setCompoundDrawablesWithIntrinsicBounds(CoreModule.b.getResources().getDrawable(d3c0.e3), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        VText vText = this.f15171z;
        if (z) {
            vText.setText(String.format("确认协议免密付¥%s", this.f15149M.format(this.f15151O)));
        } else {
            vText.setText(String.format("确认协议并支付¥%s", this.f15149M.format(this.f15151O)));
        }
        m17568P0();
    }

    /* JADX INFO: renamed from: M0 */
    private void m17563M0() {
        if (TEnum.equals(this.f15147K, "wechat")) {
            if (!sd60.p()) {
                hab0.Companion.g(this.f15153Q.n(), this.f15145I.defaultStockKeepUnit.id, "wx not install");
                return;
            }
        } else if (!CoreModule.P().a().j3() && !sd60.k()) {
            hab0.Companion.a(this.f15153Q.n(), this.f15145I.defaultStockKeepUnit.id, "alipay not install");
            return;
        }
        if (xdl0.O0(this.f15163r) && dsa.u() && !this.f15163r.isChecked()) {
            dsa.C(this.f15141E, this.f15153Q.e(), new d30() { // from class: l.vxa0
                public final void call() {
                    this.f21372a.m17588G0();
                }
            }, new d30() { // from class: l.wxa0
                public final void call() {
                    this.f22031a.m17589H0();
                }
            });
            return;
        }
        rf60 rf60Var = new rf60(m17601a0(this.f15145I.category), this.f15141E, "", "");
        if (NullChecker.a(this.f15153Q)) {
            rf60Var.C(this.f15153Q.n());
        }
        rf60Var.r(this.f15146J.couponID);
        if (this.f15145I.autoRenewable()) {
            rf60Var.I(TEnum.equals(this.f15147K, "wechat"), this.f15145I.defaultStockKeepUnit.id, new e30() { // from class: l.xxa0
                public final void call(Object obj) {
                    this.f22498a.m17590I0((Integer) obj);
                }
            });
        } else {
            rf60Var.o(this.f15145I.defaultStockKeepUnit.id, TEnum.equals(this.f15147K, "wechat"), new e30() { // from class: l.yxa0
                public final void call(Object obj) {
                    this.f23139a.m17591J0((Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N0 */
    private void m17565N0() {
        long jO = (long) (this.f15146J.endTime - mqi0.o());
        if (jO <= 0) {
            this.f15139C.setText(m17580Y("优惠即将结束 %s", "00:00:00"));
        } else if (jO > 86400000) {
            this.f15139C.setText(m17580Y("优惠 %s 后到期", String.format(Locale.ENGLISH, "%d天", Integer.valueOf((int) (jO / 86400000)))));
        } else {
            this.f15139C.setText(m17580Y("优惠即将结束 %s", String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf((int) (jO / 3600000)), Integer.valueOf((int) ((jO % 3600000) / 60000)), Integer.valueOf(((int) (jO % 60000)) / 1000))));
        }
    }

    /* JADX INFO: renamed from: P0 */
    private void m17568P0() {
        if (CoreModule.P().a().jh()) {
            if (!TEnum.equals(this.f15147K, "alipay")) {
                xdl0.M(this.f15167v, false);
                return;
            }
            this.f15167v.setText(CoreModule.P().a().D6());
            xdl0.M(this.f15167v, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    private void m17571R0() {
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
    }

    /* JADX INFO: renamed from: S0 */
    public static void m17573S0(Act act, String str, Merchandise merchandise, e30<Boolean> e30Var, String str2) {
        m17575T0(act, e30Var, merchandise, merchandise.getCouponForPromotion(str), str2, null, null);
    }

    /* JADX INFO: renamed from: T0 */
    public static void m17575T0(Act act, e30<Boolean> e30Var, Merchandise merchandise, Coupon coupon, String str, PayMethod payMethod, Object obj) {
        if (!NullChecker.a(merchandise)) {
            lsi0.C(R.string.P1);
            return;
        }
        if (merchandise.yearly() && TEnum.equals(payMethod, "wechat")) {
            payMethod = PayMethod.get("alipay");
        }
        lya0 lya0Var = new lya0(act, e30Var, merchandise, coupon, str);
        lya0Var.show();
        lya0Var.m17594Q0(payMethod);
    }

    /* JADX INFO: renamed from: U0 */
    public static void m17577U0(Act act, e30<Boolean> e30Var, Merchandise merchandise, String str) {
        m17575T0(act, e30Var, merchandise, merchandise.getCouponForPromotion("lowPriceFirstTime12MSVIP"), str, null, null);
    }

    /* JADX INFO: renamed from: Y */
    private CharSequence m17580Y(String str, String str2) {
        String str3 = String.format(str, str2);
        int iIndexOf = str3.indexOf(str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD, this.f15141E.color(b1c0.l), t100.f(18)), iIndexOf, str2.length() + iIndexOf, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g0 */
    private void m17581g0() {
        PurchaseType purchaseType;
        if (this.f15145I.autoRenewable()) {
            String str = String.format(CoreModule.b.getString(R.string.G0), "会员及自动续费协议", "", new DecimalFormat("#.##").format(this.f15152P), this.f15145I.quantityName());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            int iIndexOf = str.indexOf("会员及自动续费协议");
            int i = iIndexOf + 9;
            spannableStringBuilder.setSpan(new c95(we60.b).b(Color.parseColor("#33000000")).c(CoreModule.b.getString(R.string.D6)).d(true), iIndexOf, i, 18);
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, i, 18);
            this.f15164s.setOnTouchListener(new sd0(spannableStringBuilder));
            this.f15164s.setText(spannableStringBuilder);
            return;
        }
        PurchaseType purchaseType2 = PurchaseType.TYPE_NONE;
        if (TEnum.equals(this.f15145I.category, ProductCategory.get("svip"))) {
            purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        } else {
            purchaseType = TEnum.equals(this.f15145I.category, ProductCategory.get("tttVip")) ? PurchaseType.TYPE_GET_VIP : purchaseType2;
        }
        if (purchaseType != purchaseType2) {
            StringBuilder sb = new StringBuilder("开通前阅读");
            sb.append("《会员服务协议》");
            SpannableStringBuilder spannableStringBuilderB0 = i0g0.b0(sb.toString(), vwb.f0(new String[]{"会员服务协议"}), Color.parseColor("#33000000"), eqh0.c(3));
            int iIndexOf2 = sb.indexOf("会员服务协议");
            spannableStringBuilderB0.setSpan(new c95(we60.c).b(Color.parseColor("#33000000")).c(CoreModule.b.getString(R.string.D6)).d(true), iIndexOf2, iIndexOf2 + 6, 18);
            this.f15164s.setOnTouchListener(new sd0(spannableStringBuilderB0));
            this.f15164s.setText(spannableStringBuilderB0);
        }
    }

    /* JADX INFO: renamed from: n0 */
    private void m17582n0() {
        if (w6h0.j().l(this.f15146J)) {
            duringCreated(CoreModule.c.j0.y5(ProductCategory.get("svip"))).filter(new w9j() { // from class: l.sxa0
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).take(1).subscribe(mkd0.G(new e30() { // from class: l.cya0
                public final void call(Object obj) {
                    this.f8984a.m17621x0((List) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    private void m17583r0() {
        if (dsa.u() && this.f15145I.autoRenewable()) {
            xdl0.M(this.f15163r, true);
            this.f15163r.setChecked(false);
        } else {
            xdl0.M(this.f15163r, false);
        }
        if (hmb.s1()) {
            this.f15155j.setImageResource(m17605e0());
            xdl0.X(this.f15157l, t100.d(260.0f));
        } else {
            xdl0.X(this.f15157l, t100.d(210.0f));
            this.f15155j.setImageResource(m17600Z());
        }
        ((ViewGroup.MarginLayoutParams) this.f15156k.getLayoutParams()).topMargin = xdl0.F0() + t100.g;
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.iya0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f13479a.m17584y0(dialogInterface, i, keyEvent);
            }
        });
        x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jya0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f14134a.m17585z0(dialogInterface);
            }
        });
        this.f15148L.setRoundingMode(RoundingMode.HALF_UP);
        xdl0.E0(this.f15165t, new View.OnClickListener() { // from class: l.kya0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14582a.m17549A0(view);
            }
        });
        xdl0.E0(this.f15156k, new View.OnClickListener() { // from class: l.txa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20418a.m17550B0(view);
            }
        });
        xdl0.E0(this.f15170y, new View.OnClickListener() { // from class: l.uxa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20868a.m17551C0(view);
            }
        });
        xdl0.M(this.f15158m, false);
        m17607h0();
        m17565N0();
        m17581g0();
        m17614p0();
        if (w6h0.j().l(this.f15146J)) {
            m17613o0();
        } else {
            m17598X0(Collections.singletonList(this.f15145I), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ boolean m17584y0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return true;
        }
        this.f15142F.call();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m17585z0(DialogInterface dialogInterface) {
        i0e.e(this.f15144H);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ Boolean m17586E0(Long l2) {
        return Boolean.valueOf(this.f15146J.endTime - ((double) mqi0.o()) <= 0.0d);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m17587F0(Long l2) {
        m17565N0();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m17588G0() {
        this.f15163r.setChecked(true);
        m17595V0(true);
        m17606f0();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m17589H0() {
        m17595V0(false);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m17590I0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m17591J0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m17592L0() {
        return this.f15146J.isBelongPromotion("lowPriceCallback3SVIP") || this.f15146J.isBelongPromotion("lowPriceCustomerSVIP") || this.f15146J.isBelongPromotion("lowPriceCallback3VIP") || this.f15146J.isBelongPromotion("lowPriceCustomerVIP") || this.f15146J.isBelongPromotion("lowPriceCustomerUpliftSVIP");
    }

    /* JADX INFO: renamed from: O0 */
    public final void m17593O0() {
        String str;
        if (w6h0.j().l(this.f15146J)) {
            double d = this.f15154R;
            str = String.format("原价¥%s元", d > 0.0d ? this.f15148L.format(d) : ExpProfileLoopWheelTypeData.NONE_STR);
        } else {
            str = String.format("原价¥%s元", this.f15148L.format(this.f15152P));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, str.length(), 33);
        this.f15169x.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m17594Q0(PayMethod payMethod) {
        this.f15147K = payMethod;
        if (payMethod == null) {
            this.f15147K = PayMethod.get("alipay");
        }
        if (TEnum.equals(this.f15145I.category, "svip") && this.f15145I.semiAnnual()) {
            this.f15147K = PayMethod.get("alipay");
        }
        m17560K0(this.f15147K);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m17595V0(boolean z) {
        if (NullChecker.a(this.f15153Q) && NullChecker.a(m17601a0(this.f15145I.category))) {
            this.f15153Q.r(this.f15145I, this.f15147K, true, CoreModule.P().a().U() && CoreModule.c.O0.n3() && TEnum.equals(this.f15147K, "alipay"), this.f15153Q.e(), m17601a0(this.f15145I.category), z);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m17596W0() {
        this.f15153Q.w(this.f15145I, this.f15147K, true, CoreModule.P().a().U() && CoreModule.c.O0.n3() && TEnum.equals(this.f15147K, "alipay"));
        zvf0.u("e_purchase_button", "p_purchase_page", new j760[]{vwb.Y("purchaseShowFrom", w2b0.b(this.f15143G)), vwb.Y("productType", this.f15145I.category.toString()), vwb.Y("default_duration", this.f15145I.quantity + "m"), vwb.Y("promotion_type", b1f.d(this.f15146J)), vwb.Y("page_style", "promotion")});
    }

    /* JADX INFO: renamed from: X */
    public View m17597X(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mya0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m17598X0(List<Merchandise> list, int i) {
        this.f15153Q.D(list, i);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m17599Y0(double d) {
        if (d <= 0.0d) {
            xdl0.M(this.f15137A, false);
            return;
        }
        this.f15137A.setText(this.f15141E.getString(R.string.t1, String.valueOf((long) Math.floor(d))));
        xdl0.M(this.f15137A, true);
    }

    /* JADX INFO: renamed from: Z */
    public final int m17600Z() {
        if (this.f15146J.isBelongPromotion("lowPriceCallback3SVIP") || this.f15146J.isBelongPromotion("lowPriceCustomerSVIP") || this.f15146J.isBelongPromotion("lowPriceCustomerUpliftSVIP")) {
            return d3c0.M8;
        }
        return (this.f15146J.isBelongPromotion("lowPriceCallback3VIP") || this.f15146J.isBelongPromotion("lowPriceCustomerVIP")) ? d3c0.Sa : d3c0.Z8;
    }

    /* JADX INFO: renamed from: a0 */
    public PurchaseType m17601a0(ProductCategory productCategory) {
        String string = productCategory.toString();
        string.getClass();
        if (string.equals("tttVip")) {
            return PurchaseType.TYPE_GET_VIP;
        }
        if (string.equals("svip")) {
            return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        }
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public String m17602b0() {
        double d = this.f15152P;
        if (d <= 0.0d) {
            return ExpProfileLoopWheelTypeData.NONE_STR;
        }
        double d2 = this.f15151O;
        if (d2 < 0.0d || d2 > d) {
            return ExpProfileLoopWheelTypeData.NONE_STR;
        }
        double d3 = (d2 / d) * 10.0d;
        int i = (int) d3;
        return d3 == ((double) i) ? String.valueOf(i) : new DecimalFormat("#.#").format(d3);
    }

    /* JADX INFO: renamed from: c0 */
    public final PurchaseTrackPageType m17603c0() {
        return (this.f15146J.isBelongPromotion("lowPriceCallback3SVIP") || this.f15146J.isBelongPromotion("lowPriceCallback3VIP")) ? PurchaseTrackPageType.page_discount_callback : PurchaseTrackPageType.page_discount_custom;
    }

    /* JADX INFO: renamed from: d0 */
    public final String m17604d0() {
        Merchandise merchandise = this.f15145I;
        return merchandise == null ? "月" : merchandise.quantityName();
    }

    public void dismiss() {
        super.dismiss();
        rxa0.z(false);
    }

    /* JADX INFO: renamed from: e0 */
    public final int m17605e0() {
        if (this.f15146J.isBelongPromotion("lowPriceCallback3SVIP") || this.f15146J.isBelongPromotion("lowPriceCustomerSVIP") || this.f15146J.isBelongPromotion("lowPriceCustomerUpliftSVIP")) {
            return d3c0.N8;
        }
        return (this.f15146J.isBelongPromotion("lowPriceCallback3VIP") || this.f15146J.isBelongPromotion("lowPriceCustomerVIP")) ? d3c0.Ta : d3c0.y8;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m17606f0() {
        if (this.f15146J.endTime - mqi0.o() > 0.0d) {
            m17563M0();
            return;
        }
        osi0.g("优惠券已到期");
        if (TEnum.equals(this.f15147K, "wechat")) {
            hab0.Companion.g(this.f15153Q.n(), this.f15145I.defaultStockKeepUnit.id, "coupon expired");
        } else {
            hab0.Companion.a(this.f15153Q.n(), this.f15145I.defaultStockKeepUnit.id, "coupon expired");
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m17607h0() {
        m17593O0();
        this.f15138B.setText(CoreModule.b.getString(R.string.w0, new DecimalFormat("0.0").format(new BigDecimal(this.f15151O / ((double) n6a.t0(this.f15145I))).setScale(1, 0).doubleValue())));
        if (this.f15145I.yearly()) {
            m17560K0(PayMethod.get("alipay"));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m17608i0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "SVIP");
        spannableStringBuilder.append((CharSequence) m17604d0());
        spannableStringBuilder.append((CharSequence) "卡");
        spannableStringBuilder.append((CharSequence) m17602b0());
        spannableStringBuilder.append((CharSequence) "折特惠");
        this.f15157l.setText(spannableStringBuilder);
        this.f15158m.setText(String.format("SVIP已失效%s天，立刻恢复", kqi0.b(CoreModule.c.C0.w4(SummarizedPrivilegesId.get("svip")))));
        xdl0.M(this.f15158m, true);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m17609j0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "老用户SVIP首");
        spannableStringBuilder.append((CharSequence) m17604d0());
        spannableStringBuilder.append((CharSequence) m17602b0());
        spannableStringBuilder.append((CharSequence) "折特惠");
        this.f15157l.setText(spannableStringBuilder);
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            this.f15158m.setText(String.format("感谢你已陪伴探探%d天", Integer.valueOf(l9b.S((long) userP9.createdTime, mqi0.o()))));
            xdl0.M(this.f15158m, true);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m17610k0() {
        this.f15159n.setText("查看谁喜欢了我");
        this.f15160o.setText("每天3次闪聊机会");
        int size = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData((Gender) null).size();
        this.f15161p.setText(i0g0.f0(String.format("每月3次优先推荐等总计%s项特权", Integer.valueOf(size)), vwb.f0(new String[]{String.valueOf(size)}), Color.parseColor("#ff7118"), Typeface.DEFAULT));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m17611l0() {
        if (CoreModule.P().a().h5() && TEnum.equals(this.f15145I.category, "svip")) {
            duringCreated(CoreModule.c.j0.K5()).subscribe(mkd0.H(new e30() { // from class: l.gya0
                public final void call(Object obj) {
                    this.f11681a.m17619v0((Optional) obj);
                }
            }, new e30() { // from class: l.hya0
                public final void call(Object obj) {
                    this.f12361a.m17620w0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m17612m0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "SVIP首");
        spannableStringBuilder.append((CharSequence) m17604d0());
        spannableStringBuilder.append((CharSequence) "限时立省");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f15150N.format(100.0d - ((this.f15151O / this.f15152P) * 100.0d)));
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#ff7118")), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        spannableStringBuilder.append((CharSequence) "%");
        spannableStringBuilder.append((CharSequence) "，配对概率翻倍");
        this.f15157l.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m17613o0() {
        User userP9 = CoreModule.c.e0.p9();
        if (userP9 == null) {
            xdl0.M(this.f15158m, false);
            return;
        }
        this.f15158m.setText(String.format("感谢你已陪伴探探%d天", Integer.valueOf(l9b.S((long) userP9.createdTime, mqi0.o()))));
        boolean zU = g6a.u();
        VText vText = this.f15158m;
        if (zU) {
            xdl0.M0(vText, false);
        } else {
            xdl0.M(vText, true);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        duringCreated(c.interval(1L, TimeUnit.SECONDS).onBackpressureDrop().compose(mkd0.y())).takeUntil(new w9j() { // from class: l.dya0
            public final Object call(Object obj) {
                return this.f9480a.m17586E0((Long) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.eya0
            public final void call(Object obj) {
                this.f10048a.m17587F0((Long) obj);
            }
        }));
    }

    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        View viewM17597X = m17597X(this.f15141E.getLayoutInflater(), null);
        this.f15140D = viewM17597X;
        setContentView(viewM17597X);
        m17571R0();
        if (w6h0.j().l(this.f15146J)) {
            this.f15153Q = new x5b0(this.f15145I.category, PurchaseTrackPageType.page_discount_12m, this.f15143G);
        } else {
            this.f15153Q = new x5b0(this.f15145I.category, m17603c0(), this.f15143G);
        }
        this.f15153Q.v(this.f15145I.category);
        m17583r0();
        m17582n0();
        m17611l0();
        m17594Q0(PayMethod.get("alipay"));
        CoreModule.c.O0.C3();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m17614p0() {
        int i = C0672a.f15172a[m17601a0(this.f15145I.category).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (g6a.x() && (this.f15146J.isBelongPromotion("lowPriceCallback3VIP") || this.f15146J.isBelongPromotion("lowPriceCustomerVIP"))) {
                m17617t0();
                m17616s0();
                return;
            } else {
                m17618u0();
                m17616s0();
                return;
            }
        }
        if (g6a.x()) {
            if (this.f15146J.isBelongPromotion("lowPriceCallback3SVIP")) {
                m17608i0();
                m17610k0();
                return;
            } else if (this.f15146J.isBelongPromotion("lowPriceCustomerSVIP")) {
                m17609j0();
                m17610k0();
                return;
            }
        } else if (g6a.v() && this.f15146J.isBelongPromotion("lowPriceCustomerUpliftSVIP")) {
            m17615q0();
            m17610k0();
            return;
        }
        m17612m0();
        m17610k0();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m17615q0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) String.format("SVIP%s卡首", this.f15145I.quantityName()));
        spannableStringBuilder.append((CharSequence) m17604d0());
        spannableStringBuilder.append((CharSequence) "立减");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(String.valueOf((int) (this.f15152P - this.f15151O)));
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#ff7118")), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        spannableStringBuilder.append((CharSequence) "元");
        this.f15157l.setText(spannableStringBuilder);
        VText vText = this.f15158m;
        Coupon coupon = this.f15146J;
        vText.setText(String.format("仅限%s天，过期恢复原价", Integer.valueOf((int) ((coupon.endTime - coupon.beginTime) / 8.64E7d))));
        xdl0.M(this.f15158m, true);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m17616s0() {
        this.f15159n.setText("无限次右滑");
        this.f15160o.setText("每天5个超级喜欢");
        String strValueOf = String.valueOf(PurchaseType.TYPE_GET_VIP.getPrivilegeData((Gender) null).size());
        this.f15161p.setText(i0g0.f0(String.format("滑错随时反悔等总计%s项特权", strValueOf), vwb.f0(new String[]{strValueOf}), Color.parseColor("#ff7118"), Typeface.DEFAULT));
    }

    public void show() {
        super.show();
        cwf0 cwf0VarC = i0e.c("p_purchase_page", getClass().getName());
        this.f15144H = cwf0VarC;
        cwf0VarC.p(new j760[]{vwb.Y("purchaseShowFrom", w2b0.b(this.f15143G)), vwb.Y("productType", this.f15145I.category.toString()), vwb.Y("default_duration", this.f15145I.quantity + "m"), vwb.Y("promotion_type", b1f.d(this.f15146J)), vwb.Y("page_style", "promotion")});
        i0e.f(this.f15144H);
        rxa0.z(true);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m17617t0() {
        this.f15157l.setText(String.format("VIP惊喜%s折限时秒杀", m17602b0()));
        this.f15158m.setText("老用户专享福利");
        xdl0.M(this.f15158m, true);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m17618u0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "VIP首");
        spannableStringBuilder.append((CharSequence) m17604d0());
        spannableStringBuilder.append((CharSequence) "限时立省");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f15150N.format(100.0d - ((this.f15151O / this.f15152P) * 100.0d)));
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#ff7118")), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        spannableStringBuilder.append((CharSequence) "%");
        spannableStringBuilder.append((CharSequence) "，配对概率翻倍");
        this.f15157l.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m17619v0(Optional optional) {
        if (optional.isPresent()) {
            double d = ((RefundDetail) optional.get()).totalRefundAmount;
            if (d > 0.0d) {
                m17599Y0(d);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m17620w0(Throwable th) {
        m17599Y0(0.0d);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m17621x0(List list) {
        final Merchandise merchandise = (Merchandise) vwb.r(list, new w9j() { // from class: l.aya0
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(merchandise2.monthly() && !merchandise2.autoRenewable());
            }
        });
        m17598X0(list, vwb.G(list, new w9j() { // from class: l.bya0
            public final Object call(Object obj) {
                return Boolean.valueOf(((Merchandise) obj) == merchandise);
            }
        }));
        if (NullChecker.a(merchandise)) {
            this.f15154R = merchandise.defaultStockKeepUnit.prices.price * 12.0d;
            m17593O0();
            int i = w6h0.j().i(this.f15145I, merchandise);
            String strValueOf = i > 0 ? String.valueOf(i) : ExpProfileLoopWheelTypeData.NONE_STR;
            if (!g6a.u()) {
                this.f15157l.setText(String.format("SVIP年卡老用户%s折特惠", strValueOf));
                return;
            }
            this.f15156k.setImageResource(d3c0.c9);
            boolean zS1 = hmb.s1();
            VImage vImage = this.f15155j;
            if (zS1) {
                vImage.setImageDrawable(CoreModule.b.getResources().getDrawable(d3c0.b9));
            } else {
                vImage.setImageDrawable(CoreModule.b.getResources().getDrawable(d3c0.a9));
            }
            this.f15157l.setText(String.format("618大促，SVIP年卡%s折特惠", strValueOf));
        }
    }
}
