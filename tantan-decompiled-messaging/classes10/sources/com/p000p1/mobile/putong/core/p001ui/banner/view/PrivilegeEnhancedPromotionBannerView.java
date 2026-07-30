package com.p000p1.mobile.putong.core.p001ui.banner.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.CoreStaticData;
import com.p000p1.mobile.putong.core.data.Coupon;
import com.p000p1.mobile.putong.core.data.Merchandise;
import com.p000p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p000p1.mobile.putong.core.data.PaymentPlatform;
import com.p000p1.mobile.putong.core.data.ProductCategory;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Objects;
import l.ax40;
import l.b1f;
import l.d30;
import l.d3c0;
import l.dsa;
import l.e30;
import l.e51;
import l.hab0;
import l.j760;
import l.kq2;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.qib0;
import l.rf60;
import l.sd60;
import l.t100;
import l.u76;
import l.vwb;
import l.w6h0;
import l.w9j;
import l.we60;
import l.wf60;
import l.ws80;
import l.xdl0;
import l.zc0;
import l.zvf0;
import p003l.t0m;
import p003l.vz80;
import rx.c;
import v.VCheckBox;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class PrivilegeEnhancedPromotionBannerView extends RelativeLayout implements t0m {

    /* JADX INFO: renamed from: A */
    public TextView f884A;

    /* JADX INFO: renamed from: B */
    public VText f885B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f886C;

    /* JADX INFO: renamed from: D */
    public VCheckBox f887D;

    /* JADX INFO: renamed from: E */
    public VText f888E;

    /* JADX INFO: renamed from: F */
    public zc0 f889F;

    /* JADX INFO: renamed from: G */
    public hab0 f890G;

    /* JADX INFO: renamed from: H */
    public DecimalFormat f891H;

    /* JADX INFO: renamed from: I */
    public NumberFormat f892I;

    /* JADX INFO: renamed from: J */
    public Merchandise f893J;

    /* JADX INFO: renamed from: K */
    public Coupon f894K;

    /* JADX INFO: renamed from: L */
    public MonetizationPromotionsId f895L;

    /* JADX INFO: renamed from: M */
    public kq2 f896M;

    /* JADX INFO: renamed from: N */
    public PayMethod f897N;

    /* JADX INFO: renamed from: O */
    public double f898O;

    /* JADX INFO: renamed from: P */
    public double f899P;

    /* JADX INFO: renamed from: Q */
    public double f900Q;

    /* JADX INFO: renamed from: R */
    public boolean f901R;

    /* JADX INFO: renamed from: S */
    public d30 f902S;

    /* JADX INFO: renamed from: T */
    public Runnable f903T;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f904a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f905b;

    /* JADX INFO: renamed from: c */
    public ImageView f906c;

    /* JADX INFO: renamed from: d */
    public ImageView f907d;

    /* JADX INFO: renamed from: e */
    public ImageView f908e;

    /* JADX INFO: renamed from: f */
    public ImageView f909f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f910g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f911h;

    /* JADX INFO: renamed from: i */
    public VText f912i;

    /* JADX INFO: renamed from: j */
    public VText f913j;

    /* JADX INFO: renamed from: k */
    public VText f914k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f915l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f916m;

    /* JADX INFO: renamed from: n */
    public VText f917n;

    /* JADX INFO: renamed from: o */
    public View f918o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f919p;

    /* JADX INFO: renamed from: q */
    public RelativeLayout f920q;

    /* JADX INFO: renamed from: r */
    public TextView f921r;

    /* JADX INFO: renamed from: s */
    public VText f922s;

    /* JADX INFO: renamed from: t */
    public VText f923t;

    /* JADX INFO: renamed from: u */
    public ImageView f924u;

    /* JADX INFO: renamed from: v */
    public VLinear f925v;

    /* JADX INFO: renamed from: w */
    public VCheckBox f926w;

    /* JADX INFO: renamed from: x */
    public VText f927x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f928y;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f929z;

    public PrivilegeEnhancedPromotionBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f891H = new DecimalFormat("#.#");
        this.f892I = new DecimalFormat("00");
        this.f897N = PayMethod.get(PaymentPlatform.alipay);
        this.f901R = false;
        this.f902S = null;
        this.f903T = new Runnable() { // from class: l.jz80
            @Override // java.lang.Runnable
            public final void run() {
                this.f5399a.m1671B();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m1648A(Boolean bool) {
        this.f887D.setChecked(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m1649C(Integer num) {
        this.f887D.setChecked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public void m1650G(PayMethod payMethod) {
        if (m1684r()) {
            return;
        }
        boolean z = false;
        xdl0.M(this.f885B, false);
        this.f897N = payMethod;
        if (TEnum.equals(payMethod, PaymentPlatform.alipay)) {
            if (CoreModule.P().a().U() && CoreModule.c.O0.n3()) {
                z = true;
            }
            this.f884A.setText(z ? R.string.h : R.string.C);
            this.f884A.setCompoundDrawablesWithIntrinsicBounds(CoreModule.b.getResources().getDrawable(d3c0.f3), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(this.f897N, PaymentPlatform.wechat)) {
            this.f884A.setText(R.string.H);
            this.f884A.setCompoundDrawablesWithIntrinsicBounds(CoreModule.b.getResources().getDrawable(d3c0.e3), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(this.f897N, "jingdong")) {
            this.f884A.setText("京东支付");
            this.f884A.setCompoundDrawablesWithIntrinsicBounds(CoreModule.b.getResources().getDrawable(d3c0.d3), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            this.f914k.setText("领取优惠");
        } else {
            VText vText = this.f914k;
            if (z) {
                vText.setText("确认协议免密付");
            } else {
                vText.setText("确认协议支付");
            }
        }
        m1652K();
    }

    /* JADX INFO: renamed from: H */
    private void m1651H() {
        Act act = getAct();
        if (act == null) {
            return;
        }
        String strN = NullChecker.a(this.f890G) ? this.f890G.n() : null;
        if (TEnum.equals(this.f897N, PaymentPlatform.wechat)) {
            if (!sd60.p()) {
                hab0.Companion.g(strN, this.f893J.defaultStockKeepUnit.f169id, "wx not install");
                return;
            }
        } else if (!CoreModule.P().a().j3() && !sd60.k()) {
            hab0.Companion.a(strN, this.f893J.defaultStockKeepUnit.f169id, "alipay not install");
            return;
        }
        rf60 rf60Var = new rf60(m1665p(this.f893J.category), act, "p_navigation,privilege_button", "");
        rf60Var.C(strN);
        rf60Var.r(this.f894K.couponID);
        if (this.f893J.autoRenewable()) {
            rf60Var.I(TEnum.equals(this.f897N, PaymentPlatform.wechat), this.f893J.defaultStockKeepUnit.f169id, new e30() { // from class: l.kz80
                public final void call(Object obj) {
                    this.f5727a.m1649C((Integer) obj);
                }
            });
        } else {
            rf60Var.o(this.f893J.defaultStockKeepUnit.f169id, TEnum.equals(this.f897N, PaymentPlatform.wechat), new e30() { // from class: l.lz80
                public final void call(Object obj) {
                    this.f6235a.m1672D((Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K */
    private void m1652K() {
        if (CoreModule.P().a().jh()) {
            if (TEnum.equals(this.f897N, PaymentPlatform.alipay)) {
                this.f885B.setText(CoreModule.P().a().D6());
                xdl0.M(this.f885B, true);
            } else {
                xdl0.M(this.f885B, false);
            }
        }
        xdl0.M(this.f923t, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void m1671B() {
        Act act = getAct();
        if (act == null) {
            return;
        }
        j760 j760VarC = b1f.c(this.f894K);
        this.f917n.setText(m1683q((String) j760VarC.b));
        e51.J(this.f903T);
        if (((Boolean) j760VarC.a).booleanValue()) {
            e51.H(act, this.f903T, 1000L);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1656c(Throwable th) {
    }

    private String getDiscountType() {
        return (TEnum.equals(this.f895L, MonetizationPromotionsId.lowPriceCallback3VIP) || TEnum.equals(this.f895L, MonetizationPromotionsId.lowPriceCallback3SVIP)) ? "low_price_recall" : "new_customer";
    }

    private CharSequence getPromotionInfo() {
        StringBuilder sb = new StringBuilder();
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            sb.append("现价");
            sb.append(this.f891H.format(this.f898O));
            sb.append("元，原价");
            sb.append(this.f891H.format(this.f899P));
            sb.append("元");
            return sb;
        }
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP)) {
            sb.append("现价");
            sb.append(this.f891H.format(this.f898O));
            sb.append("元，原价");
            sb.append(this.f891H.format(this.f899P));
            sb.append("元");
            return sb;
        }
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) {
            sb.append("原价");
            sb.append(this.f891H.format(this.f899P));
            sb.append("元");
            return sb;
        }
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP)) {
            sb.append("原价");
            sb.append(this.f891H.format(this.f899P));
            sb.append("元");
            return sb;
        }
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
            sb.append("原价");
            sb.append(this.f891H.format(this.f899P));
            sb.append("元");
            return sb;
        }
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPrice3Month)) {
            sb.append("原价");
            sb.append(this.f891H.format(this.f899P));
            sb.append("元");
            return sb;
        }
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP)) {
            sb.append("现价");
            sb.append((int) this.f898O);
            sb.append("元，原价");
            sb.append((int) this.f900Q);
            sb.append("元");
            return sb;
        }
        if (!this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            if (this.f894K.isBelongPromotion(MonetizationPromotionsId.giftDurationSVIP)) {
                sb.append("双十一特惠，一年仅此一次");
            }
            return sb;
        }
        sb.append("黑金年卡限时优惠价");
        sb.append((int) this.f898O);
        sb.append("元");
        return sb;
    }

    private CharSequence getPromotiontitle() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "卡立减");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f891H.format(this.f899P - this.f898O));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder.append((CharSequence) "元");
            return spannableStringBuilder;
        }
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP)) {
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "卡立减");
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f891H.format(this.f899P - this.f898O));
            spannableStringBuilder3.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder3.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
            spannableStringBuilder.append((CharSequence) "元");
            return spannableStringBuilder;
        }
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) {
            spannableStringBuilder.append((CharSequence) "VIP首");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "立省");
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(this.f892I.format(100.0d - ((this.f898O / this.f899P) * 100.0d)));
            spannableStringBuilder4.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder4.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder4);
            spannableStringBuilder.append((CharSequence) "%");
            return spannableStringBuilder;
        }
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP)) {
            spannableStringBuilder.append((CharSequence) "SVIP首");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "立省");
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(this.f892I.format(100.0d - ((this.f898O / this.f899P) * 100.0d)));
            spannableStringBuilder5.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder5.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder5);
            spannableStringBuilder.append((CharSequence) "%");
            return spannableStringBuilder;
        }
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
            spannableStringBuilder.append((CharSequence) "SVIP首");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "立省");
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(this.f892I.format(100.0d - ((this.f898O / this.f899P) * 100.0d)));
            spannableStringBuilder6.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder6.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder6);
            spannableStringBuilder.append((CharSequence) "%");
            return spannableStringBuilder;
        }
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPrice3Month)) {
            spannableStringBuilder.append((CharSequence) "前3个月每月");
            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(this.f891H.format(this.f898O));
            spannableStringBuilder7.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder7.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder7);
            spannableStringBuilder.append((CharSequence) "元");
            return spannableStringBuilder;
        }
        if (!this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP)) {
            if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
                spannableStringBuilder.append((CharSequence) "4折购买黑金会员");
                return spannableStringBuilder;
            }
            if (this.f894K.isBelongPromotion(MonetizationPromotionsId.giftDurationSVIP)) {
                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("半年卡立送3个月");
                spannableStringBuilder8.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 5, 6, 33);
                spannableStringBuilder.append((CharSequence) spannableStringBuilder8);
            }
            return spannableStringBuilder;
        }
        int i = w6h0.j().i(this.f893J, (Merchandise) null);
        SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder((i > 0 ? String.valueOf(i) : CoreStaticData.FriendPurposeDataType.HOUSE_RIEGION_NONE_STR) + "折");
        spannableStringBuilder9.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder9.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder9).append((CharSequence) "购买探探年卡");
        return spannableStringBuilder;
    }

    private PurchaseType getPurchaseType() {
        if (NullChecker.a(this.f893J)) {
            if (TEnum.equals(this.f893J.category, "svip")) {
                return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            }
            if (TEnum.equals(this.f893J.category, ProductCategory.tttVip)) {
                return PurchaseType.TYPE_GET_VIP;
            }
        }
        return PurchaseType.TYPE_GET_VIP;
    }

    private String getUnitIntervalValue() {
        Merchandise merchandise = this.f893J;
        return merchandise == null ? "月" : merchandise.quantityName();
    }

    /* JADX INFO: renamed from: p */
    public static PurchaseType m1665p(ProductCategory productCategory) {
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

    /* JADX INFO: renamed from: t */
    private void m1666t() {
        xdl0.E0(this.f914k, new View.OnClickListener() { // from class: l.nz80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6577a.m1669y(view);
            }
        });
        xdl0.E0(this.f929z, new View.OnClickListener() { // from class: l.oz80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6766a.m1670z(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    private void m1667u() {
        Act act = getAct();
        if (NullChecker.a(act) && NullChecker.a(dsa.o()) && NullChecker.a(dsa.o().get())) {
            act.duringCreated(((zc0) dsa.o().get()).a()).subscribe(mkd0.G(new e30() { // from class: l.pz80
                public final void call(Object obj) {
                    this.f6936a.m1648A((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v */
    private void m1668v() {
        this.f912i.getPaint().setFakeBoldText(true);
        this.f914k.getPaint().setFakeBoldText(true);
        qib0.G.L0(this.f905b, "https://auto.tancdn.com/v1/images/eyJpZCI6IjZZSllMU0lFRFAyS1pQUEJFQ1E1NTJRWFNKTEFENDE0IiwidyI6MTA1MywiaCI6MTMyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6OTQ4NjEzNTI1NzQ4NTg4NTcyOH0.png");
        qib0.G.L0(this.f911h, "https://auto.tancdn.com/v1/images/eyJpZCI6IkJRVUhUMkhEU1VIVDRMT0I0Q0JHMlJBUFFNMllTSDE0IiwidyI6MTA1MywiaCI6MjQ2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDcwMjExMTIzNDQ1ODE5ODMzNn0.png");
        qib0.G.L0(this.f916m, "https://auto.tancdn.com/v1/images/eyJpZCI6IkdJQ1lKSjJGUTVZTkdIVk9ZQVVTN1ZaN0FXNkEyRDE0IiwidyI6MTA1MywiaCI6MTIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTAwNTI3NTI5MjI4ODgwNzc2OTd9.png");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m1669y(View view) {
        Coupon coupon;
        if (NullChecker.a(this.f902S)) {
            this.f902S.call();
        }
        if (m1684r() || this.f893J == null || (coupon = this.f894K) == null) {
            return;
        }
        double dO = coupon.endTime - mqi0.o();
        Coupon coupon2 = this.f894K;
        if (dO <= 0.0d) {
            if (coupon2.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
                lsi0.y("优惠已失效");
            } else {
                lsi0.y("优惠券已到期");
            }
            String strN = NullChecker.a(this.f890G) ? this.f890G.n() : null;
            if (TextUtils.isEmpty(strN)) {
                return;
            }
            if (TEnum.equals(this.f897N, PaymentPlatform.wechat)) {
                hab0.Companion.g(strN, this.f893J.defaultStockKeepUnit.f169id, "coupon expired");
                return;
            } else {
                hab0.Companion.a(strN, this.f893J.defaultStockKeepUnit.f169id, "coupon expired");
                return;
            }
        }
        if (coupon2.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            final Act act = getAct();
            if (NullChecker.a(act)) {
                c cVarY5 = CoreModule.c.j0.y5(ProductCategory.get("oDiamond"));
                final ax40 ax40VarH = ax40.h();
                Objects.requireNonNull(ax40VarH);
                act.duringCreated(cVarY5.map(new w9j() { // from class: l.qz80
                    public final Object call(Object obj) {
                        return ax40VarH.j((List) obj);
                    }
                }).filter(new u76())).take(1).subscribe(mkd0.H(new e30() { // from class: l.rz80
                    public final void call(Object obj) {
                        ax40.h().n(act, (List) obj, "p_navigation_view,privileges_banner,click");
                    }
                }, new e30() { // from class: l.sz80
                    public final void call(Object obj) {
                        PrivilegeEnhancedPromotionBannerView.m1656c((Throwable) obj);
                    }
                }));
                return;
            }
            return;
        }
        Act act2 = getAct();
        if (m1686w() && this.f893J.autoRenewable() && !this.f887D.isChecked() && NullChecker.a(act2)) {
            dsa.B(act2, NullChecker.a(this.f890G) ? this.f890G.e() : null, new d30() { // from class: l.tz80
                public final void call() {
                    this.f7643a.m1687x();
                }
            });
        } else {
            zvf0.u("e_purchase_button", "p_navigation_view", new j760[]{vwb.Y("purchaseShowFrom", "p_navigation,privilege_button"), vwb.Y("promotion_type", this.f895L), vwb.Y("default_duration", String.format("%dm", Integer.valueOf(this.f893J.quantity))), vwb.Y("productType", this.f893J.category != ProductCategory.get("svip") ? "vip" : "svip"), vwb.Y("banner_style", "countdown")});
            m1651H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m1670z(View view) {
        Act act = getAct();
        if (act == null) {
            return;
        }
        if (TEnum.equals(this.f893J.category, "svip") && this.f893J.semiAnnual()) {
            osi0.g("仅支持支付宝购买");
        } else {
            new wf60(act, m1665p(this.f893J.category)).r(this.f897N).q(new e30() { // from class: l.uz80
                public final void call(Object obj) {
                    this.f7849a.m1650G((PayMethod) obj);
                }
            }).s();
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m1672D(Integer num) {
        this.f887D.setChecked(true);
    }

    /* JADX INFO: renamed from: E */
    public void m1673E() {
        this.f901R = true;
        e51.J(this.f903T);
    }

    /* JADX INFO: renamed from: F */
    public void m1674F() {
        if (NullChecker.a(this.f894K)) {
            m1671B();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m1675I() {
        if (w6h0.j().l(this.f894K) && TEnum.equals(this.f895L, MonetizationPromotionsId.lowPriceFirstTime12MSVIP)) {
            xdl0.M(this.f919p, true);
            xdl0.M(this.f928y, false);
            this.f929z = this.f920q;
            this.f884A = this.f921r;
            this.f885B = this.f922s;
            this.f888E = this.f927x;
            this.f887D = this.f926w;
            xdl0.X(this.f925v, t100.d(this.f893J.autoRenewable() ? 7.0f : 5.0f));
            xdl0.U(this.f925v, t100.d(this.f893J.autoRenewable() ? 9.0f : 10.0f));
        } else {
            xdl0.M(this.f919p, false);
            xdl0.M(this.f928y, true);
        }
        if (TEnum.equals(this.f893J.category, "svip")) {
            qib0.G.L0(this.f905b, "https://auto.tancdn.com/v1/images/eyJpZCI6IlI1RFJVR0RDTjY3UEZCNjRNNFpUV0lKNk1IQkdQSTE0IiwidyI6MTA1MywiaCI6MTMyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            qib0.G.L0(this.f911h, "https://auto.tancdn.com/v1/images/eyJpZCI6IjdEQk5GWkJPTjUyQTNEN0RRRk9LV0lEUjUzVFJCVzE0IiwidyI6MTA1MywiaCI6MjQ2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6OTQ4NjEzNDcwNzczMDA3MTg0MH0.png");
            qib0.G.L0(this.f916m, "https://auto.tancdn.com/v1/images/eyJpZCI6IktUNkdZRVNUU09EQkNTUUVWQ0VPNUxEWFNFTUEzUTE0IiwidyI6MTA1MywiaCI6MTIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTU3NjM4NzkxMjI0MzAyMzM0ODN9.png");
            this.f906c.setImageResource(d3c0.v8);
            this.f907d.setImageResource(d3c0.s8);
            this.f908e.setImageResource(d3c0.t8);
            this.f909f.setImageResource(d3c0.u8);
            this.f914k.setBackgroundResource(d3c0.r8);
            this.f914k.setTextColor(Color.parseColor("#98572F"));
            this.f913j.setTextColor(Color.parseColor("#999D5C36"));
            this.f912i.setTextColor(Color.parseColor("#9D5C36"));
            this.f918o.setBackgroundColor(Color.parseColor("#0DC37A4D"));
            this.f917n.setTextColor(Color.parseColor("#999D5C36"));
        } else if (TEnum.equals(this.f893J.category, "oDiamond")) {
            qib0.G.L0(this.f905b, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVKSFNBSlVUNjdRQ1ZGM0s0TEpSNFg0RTJaRzZSSDE0IiwidyI6MTA1MywiaCI6MTMyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            qib0.G.L0(this.f911h, "https://auto.tancdn.com/v1/images/eyJpZCI6IlJZRUhNR0o0TDVGQ05BNVpTQlRIUEhYSldKUUFDTzE0IiwidyI6MTA1MywiaCI6MjQ2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            qib0.G.L0(this.f916m, "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk0STZaNDY1UFU0VzdVSzVWUEVZNEQ0TUhITVpLRzE0IiwidyI6MTA1MywiaCI6MTIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            this.f906c.setImageResource(d3c0.o4);
            this.f907d.setImageResource(d3c0.e4);
            this.f908e.setImageResource(d3c0.U9);
            this.f909f.setImageResource(d3c0.n4);
            this.f914k.setBackgroundResource(d3c0.c5);
            this.f914k.setTextColor(Color.parseColor("#4B1A0A"));
            this.f913j.setTextColor(Color.parseColor("#99FFDEA2"));
            this.f912i.setTextColor(Color.parseColor("#FFDEA2"));
            this.f918o.setBackgroundColor(Color.parseColor("#1AFFDEA2"));
            this.f917n.setTextColor(Color.parseColor("#99FFDEA2"));
        } else {
            qib0.G.L0(this.f905b, "https://auto.tancdn.com/v1/images/eyJpZCI6IjZZSllMU0lFRFAyS1pQUEJFQ1E1NTJRWFNKTEFENDE0IiwidyI6MTA1MywiaCI6MTMyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6OTQ4NjEzNTI1NzQ4NTg4NTcyOH0.png");
            qib0.G.L0(this.f911h, "https://auto.tancdn.com/v1/images/eyJpZCI6IkJRVUhUMkhEU1VIVDRMT0I0Q0JHMlJBUFFNMllTSDE0IiwidyI6MTA1MywiaCI6MjQ2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDcwMjExMTIzNDQ1ODE5ODMzNn0.png");
            qib0.G.L0(this.f916m, "https://auto.tancdn.com/v1/images/eyJpZCI6IkdJQ1lKSjJGUTVZTkdIVk9ZQVVTN1ZaN0FXNkEyRDE0IiwidyI6MTA1MywiaCI6MTIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTAwNTI3NTI5MjI4ODgwNzc2OTd9.png");
            this.f906c.setImageResource(d3c0.Aa);
            this.f907d.setImageResource(d3c0.xa);
            this.f908e.setImageResource(d3c0.ya);
            this.f909f.setImageResource(d3c0.za);
            this.f914k.setBackgroundResource(d3c0.wa);
            this.f914k.setTextColor(Color.parseColor("#98572F"));
            this.f913j.setTextColor(Color.parseColor("#99C37A4D"));
            this.f912i.setTextColor(Color.parseColor("#C37A4D"));
            this.f918o.setBackgroundColor(Color.parseColor("#0DC37A4D"));
            this.f917n.setTextColor(Color.parseColor("#99C37A4D"));
        }
        if (TEnum.equals(this.f895L, MonetizationPromotionsId.giftDurationSVIP)) {
            xdl0.M(this.f919p, false);
            xdl0.M(this.f928y, false);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m1676J(j760<Merchandise, Coupon> j760Var, MonetizationPromotionsId monetizationPromotionsId) {
        Merchandise merchandise = this.f893J;
        Object obj = j760Var.a;
        if (merchandise == obj && this.f894K == j760Var.b) {
            PayMethod payMethod = this.f897N;
            if (payMethod == null) {
                payMethod = PayMethod.get(PaymentPlatform.alipay);
            }
            m1650G(payMethod);
            if (this.f901R) {
                m1681n();
                return;
            }
            return;
        }
        Merchandise merchandise2 = (Merchandise) obj;
        this.f893J = merchandise2;
        this.f894K = (Coupon) j760Var.b;
        this.f895L = monetizationPromotionsId;
        this.f896M = ws80.a(monetizationPromotionsId, merchandise2);
        if (w6h0.j().l(this.f894K)) {
            this.f900Q = ((Merchandise) vwb.r(CoreModule.c.j0.D5(ProductCategory.get("svip")), new w9j() { // from class: l.mz80
                public final Object call(Object obj2) {
                    Merchandise merchandise3 = (Merchandise) obj2;
                    return Boolean.valueOf(merchandise3.monthly() && !merchandise3.autoRenewable());
                }
            })).defaultStockKeepUnit.prices.price * 12.0d;
        }
        this.f899P = this.f893J.defaultStockKeepUnit.prices.price;
        this.f898O = this.f894K.getCouponPrice();
        m1681n();
        m1675I();
        m1666t();
        m1678M();
        m1671B();
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            xdl0.M(this.f919p, false);
            xdl0.M(this.f928y, false);
            return;
        }
        PayMethod payMethod2 = this.f897N;
        if (payMethod2 == null) {
            payMethod2 = PayMethod.get(PaymentPlatform.alipay);
        }
        m1650G(payMethod2);
        m1677L();
        m1685s();
    }

    /* JADX INFO: renamed from: L */
    public final void m1677L() {
        Act act;
        if (m1684r() || (act = getAct()) == null) {
            return;
        }
        xdl0.M(this.f887D, this.f893J.autoRenewable());
        this.f888E.setText(m1682o(act));
        this.f888E.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: M */
    public final void m1678M() {
        this.f912i.setText(getPromotiontitle());
        this.f913j.setText(getPromotionInfo());
    }

    @Nullable
    public Act getAct() {
        Act actE = xdl0.E(this);
        if (actE instanceof Act) {
            return actE;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m1679l(View view) {
        vz80.m10424a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public void m1680m(d30 d30Var) {
        this.f902S = d30Var;
    }

    /* JADX INFO: renamed from: n */
    public final void m1681n() {
        this.f901R = false;
        zvf0.A("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("duration", String.format("%dm", Integer.valueOf(this.f893J.quantity))), vwb.Y("discount_type", getDiscountType()), vwb.Y("promotion_type", this.f895L), vwb.Y("productType", this.f893J.category != ProductCategory.get("svip") ? "vip" : "svip"), vwb.Y("banner_style", "countdown")});
    }

    /* JADX INFO: renamed from: o */
    public final CharSequence m1682o(Act act) {
        if (!TEnum.equals(this.f895L, MonetizationPromotionsId.lowPriceCallback3VIP) && !TEnum.equals(this.f895L, MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            return NullChecker.a(this.f896M) ? this.f896M.a(act) : "";
        }
        Merchandise merchandise = this.f893J;
        return we60.w(act, merchandise, m1665p(merchandise.category), false, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e51.J(this.f903T);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1679l(this);
        m1668v();
    }

    /* JADX INFO: renamed from: q */
    public final CharSequence m1683q(String str) {
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            return TextUtils.equals("00:00:00", str) ? "优惠已结束" : String.format("优惠倒计时： %s后失效", str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("优惠");
        if (this.f894K.isBelongPromotion(MonetizationPromotionsId.giftDurationSVIP) && TextUtils.equals("00:00:00", str)) {
            sb.append("已结束");
            return sb;
        }
        sb.append(str);
        sb.append("后过期，马上购买，配对概率翻倍");
        return sb;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m1684r() {
        return TEnum.equals(this.f895L, MonetizationPromotionsId.giftDurationSVIP);
    }

    /* JADX INFO: renamed from: s */
    public final void m1685s() {
        if (!m1684r() && m1686w()) {
            if (this.f889F == null) {
                this.f889F = new zc0();
            }
            dsa.z(new WeakReference(this.f889F));
            boolean z = false;
            this.f887D.setChecked(false);
            VCheckBox vCheckBox = this.f887D;
            if (m1686w() && this.f893J.autoRenewable()) {
                z = true;
            }
            xdl0.M(vCheckBox, z);
            m1667u();
        }
    }

    public void setPurchaseTrack(@Nullable hab0 hab0Var) {
        this.f890G = hab0Var;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m1686w() {
        return dsa.s("MY_PRIVILEGE_ENHANCED");
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m1687x() {
        this.f887D.setChecked(true);
        this.f914k.performClick();
    }

    public PrivilegeEnhancedPromotionBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PrivilegeEnhancedPromotionBannerView(Context context) {
        this(context, null);
    }
}
