package com.p046p1.mobile.putong.core.p053ui.banner.view;

import android.app.Activity;
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
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.ax40;
import p149l.b1f;
import p149l.d30;
import p149l.d3c0;
import p149l.dsa;
import p149l.e30;
import p149l.e51;
import p149l.hab0;
import p149l.j760;
import p149l.kq2;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.osi0;
import p149l.qib0;
import p149l.rf60;
import p149l.sd60;
import p149l.t0m;
import p149l.t100;
import p149l.u76;
import p149l.vwb;
import p149l.vz80;
import p149l.w6h0;
import p149l.w9j;
import p149l.we60;
import p149l.wf60;
import p149l.ws80;
import p149l.xdl0;
import p149l.zc0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class PrivilegeEnhancedPromotionBannerView extends RelativeLayout implements t0m {

    /* JADX INFO: renamed from: A */
    public TextView f28490A;

    /* JADX INFO: renamed from: B */
    public VText f28491B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f28492C;

    /* JADX INFO: renamed from: D */
    public VCheckBox f28493D;

    /* JADX INFO: renamed from: E */
    public VText f28494E;

    /* JADX INFO: renamed from: F */
    public zc0 f28495F;

    /* JADX INFO: renamed from: G */
    public hab0 f28496G;

    /* JADX INFO: renamed from: H */
    public DecimalFormat f28497H;

    /* JADX INFO: renamed from: I */
    public NumberFormat f28498I;

    /* JADX INFO: renamed from: J */
    public Merchandise f28499J;

    /* JADX INFO: renamed from: K */
    public Coupon f28500K;

    /* JADX INFO: renamed from: L */
    public MonetizationPromotionsId f28501L;

    /* JADX INFO: renamed from: M */
    public kq2 f28502M;

    /* JADX INFO: renamed from: N */
    public PayMethod f28503N;

    /* JADX INFO: renamed from: O */
    public double f28504O;

    /* JADX INFO: renamed from: P */
    public double f28505P;

    /* JADX INFO: renamed from: Q */
    public double f28506Q;

    /* JADX INFO: renamed from: R */
    public boolean f28507R;

    /* JADX INFO: renamed from: S */
    public d30 f28508S;

    /* JADX INFO: renamed from: T */
    public Runnable f28509T;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f28510a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f28511b;

    /* JADX INFO: renamed from: c */
    public ImageView f28512c;

    /* JADX INFO: renamed from: d */
    public ImageView f28513d;

    /* JADX INFO: renamed from: e */
    public ImageView f28514e;

    /* JADX INFO: renamed from: f */
    public ImageView f28515f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f28516g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f28517h;

    /* JADX INFO: renamed from: i */
    public VText f28518i;

    /* JADX INFO: renamed from: j */
    public VText f28519j;

    /* JADX INFO: renamed from: k */
    public VText f28520k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f28521l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f28522m;

    /* JADX INFO: renamed from: n */
    public VText f28523n;

    /* JADX INFO: renamed from: o */
    public View f28524o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f28525p;

    /* JADX INFO: renamed from: q */
    public RelativeLayout f28526q;

    /* JADX INFO: renamed from: r */
    public TextView f28527r;

    /* JADX INFO: renamed from: s */
    public VText f28528s;

    /* JADX INFO: renamed from: t */
    public VText f28529t;

    /* JADX INFO: renamed from: u */
    public ImageView f28530u;

    /* JADX INFO: renamed from: v */
    public VLinear f28531v;

    /* JADX INFO: renamed from: w */
    public VCheckBox f28532w;

    /* JADX INFO: renamed from: x */
    public VText f28533x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f28534y;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f28535z;

    public PrivilegeEnhancedPromotionBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28497H = new DecimalFormat("#.#");
        this.f28498I = new DecimalFormat("00");
        this.f28503N = PayMethod.get("alipay");
        this.f28507R = false;
        this.f28508S = null;
        this.f28509T = new Runnable() { // from class: l.jz80
            @Override // java.lang.Runnable
            public final void run() {
                this.f120360a.m44372B();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m44349A(Boolean bool) {
        this.f28493D.setChecked(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m44350C(Integer num) {
        this.f28493D.setChecked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public void m44351G(PayMethod payMethod) {
        if (m44385r()) {
            return;
        }
        boolean z = false;
        xdl0.m208344M(this.f28491B, false);
        this.f28503N = payMethod;
        if (TEnum.equals(payMethod, "alipay")) {
            if (CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30079n3()) {
                z = true;
            }
            this.f28490A.setText(z ? R$string.f27460h : R$string.f27112C);
            this.f28490A.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f17544b.getResources().getDrawable(d3c0.f83915f3), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(this.f28503N, "wechat")) {
            this.f28490A.setText(R$string.f27167H);
            this.f28490A.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f17544b.getResources().getDrawable(d3c0.f83901e3), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(this.f28503N, PayMethod.jingdong)) {
            this.f28490A.setText("京东支付");
            this.f28490A.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f17544b.getResources().getDrawable(d3c0.f83887d3), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            this.f28520k.setText("领取优惠");
        } else {
            VText vText = this.f28520k;
            if (z) {
                vText.setText("确认协议免密付");
            } else {
                vText.setText("确认协议支付");
            }
        }
        m44353K();
    }

    /* JADX INFO: renamed from: H */
    private void m44352H() {
        Act act = getAct();
        if (act == null) {
            return;
        }
        String purchaseTrackId = NullChecker.m81303a(this.f28496G) ? this.f28496G.getPurchaseTrackId() : null;
        if (TEnum.equals(this.f28503N, "wechat")) {
            if (!sd60.m183465p()) {
                hab0.INSTANCE.m130133g(purchaseTrackId, this.f28499J.defaultStockKeepUnit.f20507id, "wx not install");
                return;
            }
        } else if (!CoreModule.m29935P().m94651a().mo33524j3() && !sd60.m183460k()) {
            hab0.INSTANCE.m130127a(purchaseTrackId, this.f28499J.defaultStockKeepUnit.f20507id, "alipay not install");
            return;
        }
        rf60 rf60Var = new rf60(m44366p(this.f28499J.category), act, "p_navigation,privilege_button", "");
        rf60Var.m179078C(purchaseTrackId);
        rf60Var.m179101r(this.f28500K.couponID);
        if (this.f28499J.autoRenewable()) {
            rf60Var.m179084I(TEnum.equals(this.f28503N, "wechat"), this.f28499J.defaultStockKeepUnit.f20507id, new e30() { // from class: l.kz80
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f125362a.m44350C((Integer) obj);
                }
            });
        } else {
            rf60Var.m179098o(this.f28499J.defaultStockKeepUnit.f20507id, TEnum.equals(this.f28503N, "wechat"), new e30() { // from class: l.lz80
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f130641a.m44373D((Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K */
    private void m44353K() {
        if (CoreModule.m29935P().m94651a().mo33525jh()) {
            if (TEnum.equals(this.f28503N, "alipay")) {
                this.f28491B.setText(CoreModule.m29935P().m94651a().mo33302D6());
                xdl0.m208344M(this.f28491B, true);
            } else {
                xdl0.m208344M(this.f28491B, false);
            }
        }
        xdl0.m208344M(this.f28529t, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void m44372B() {
        Act act = getAct();
        if (act == null) {
            return;
        }
        j760<Boolean, String> j760VarM99830c = b1f.m99830c(this.f28500K);
        this.f28523n.setText(m44384q(j760VarM99830c.f116565b));
        e51.m114745J(this.f28509T);
        if (j760VarM99830c.f116564a.booleanValue()) {
            e51.m114743H(act, this.f28509T, 1000L);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m44357c(Throwable th) {
    }

    private String getDiscountType() {
        return (TEnum.equals(this.f28501L, MonetizationPromotionsId.lowPriceCallback3VIP) || TEnum.equals(this.f28501L, MonetizationPromotionsId.lowPriceCallback3SVIP)) ? "low_price_recall" : "new_customer";
    }

    private CharSequence getPromotionInfo() {
        StringBuilder sb = new StringBuilder();
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            sb.append("现价");
            sb.append(this.f28497H.format(this.f28504O));
            sb.append("元，原价");
            sb.append(this.f28497H.format(this.f28505P));
            sb.append("元");
            return sb;
        }
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP)) {
            sb.append("现价");
            sb.append(this.f28497H.format(this.f28504O));
            sb.append("元，原价");
            sb.append(this.f28497H.format(this.f28505P));
            sb.append("元");
            return sb;
        }
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) {
            sb.append("原价");
            sb.append(this.f28497H.format(this.f28505P));
            sb.append("元");
            return sb;
        }
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP)) {
            sb.append("原价");
            sb.append(this.f28497H.format(this.f28505P));
            sb.append("元");
            return sb;
        }
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
            sb.append("原价");
            sb.append(this.f28497H.format(this.f28505P));
            sb.append("元");
            return sb;
        }
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPrice3Month)) {
            sb.append("原价");
            sb.append(this.f28497H.format(this.f28505P));
            sb.append("元");
            return sb;
        }
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP)) {
            sb.append("现价");
            sb.append((int) this.f28504O);
            sb.append("元，原价");
            sb.append((int) this.f28506Q);
            sb.append("元");
            return sb;
        }
        if (!this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.giftDurationSVIP)) {
                sb.append("双十一特惠，一年仅此一次");
            }
            return sb;
        }
        sb.append("黑金年卡限时优惠价");
        sb.append((int) this.f28504O);
        sb.append("元");
        return sb;
    }

    private CharSequence getPromotiontitle() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "卡立减");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f28497H.format(this.f28505P - this.f28504O));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder.append((CharSequence) "元");
            return spannableStringBuilder;
        }
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP)) {
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "卡立减");
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f28497H.format(this.f28505P - this.f28504O));
            spannableStringBuilder3.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder3.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
            spannableStringBuilder.append((CharSequence) "元");
            return spannableStringBuilder;
        }
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) {
            spannableStringBuilder.append((CharSequence) "VIP首");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "立省");
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(this.f28498I.format(100.0d - ((this.f28504O / this.f28505P) * 100.0d)));
            spannableStringBuilder4.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder4.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder4);
            spannableStringBuilder.append((CharSequence) "%");
            return spannableStringBuilder;
        }
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP)) {
            spannableStringBuilder.append((CharSequence) "SVIP首");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "立省");
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(this.f28498I.format(100.0d - ((this.f28504O / this.f28505P) * 100.0d)));
            spannableStringBuilder5.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder5.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder5);
            spannableStringBuilder.append((CharSequence) "%");
            return spannableStringBuilder;
        }
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
            spannableStringBuilder.append((CharSequence) "SVIP首");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "立省");
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(this.f28498I.format(100.0d - ((this.f28504O / this.f28505P) * 100.0d)));
            spannableStringBuilder6.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder6.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder6);
            spannableStringBuilder.append((CharSequence) "%");
            return spannableStringBuilder;
        }
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPrice3Month)) {
            spannableStringBuilder.append((CharSequence) "前3个月每月");
            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(this.f28497H.format(this.f28504O));
            spannableStringBuilder7.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder7.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder7);
            spannableStringBuilder.append((CharSequence) "元");
            return spannableStringBuilder;
        }
        if (!this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP)) {
            if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
                spannableStringBuilder.append((CharSequence) "4折购买黑金会员");
                return spannableStringBuilder;
            }
            if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.giftDurationSVIP)) {
                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("半年卡立送3个月");
                spannableStringBuilder8.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 5, 6, 33);
                spannableStringBuilder.append((CharSequence) spannableStringBuilder8);
            }
            return spannableStringBuilder;
        }
        int iM201822i = w6h0.m201818j().m201822i(this.f28499J, null);
        SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder((iM201822i > 0 ? String.valueOf(iM201822i) : "-") + "折");
        spannableStringBuilder9.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder9.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder9).append((CharSequence) "购买探探年卡");
        return spannableStringBuilder;
    }

    private PurchaseType getPurchaseType() {
        if (NullChecker.m81303a(this.f28499J)) {
            if (TEnum.equals(this.f28499J.category, "svip")) {
                return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            }
            if (TEnum.equals(this.f28499J.category, ProductCategory.tttVip)) {
                return PurchaseType.TYPE_GET_VIP;
            }
        }
        return PurchaseType.TYPE_GET_VIP;
    }

    private String getUnitIntervalValue() {
        Merchandise merchandise = this.f28499J;
        return merchandise == null ? "月" : merchandise.quantityName();
    }

    /* JADX INFO: renamed from: p */
    public static PurchaseType m44366p(ProductCategory productCategory) {
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
    private void m44367t() {
        xdl0.m208329E0(this.f28520k, new View.OnClickListener() { // from class: l.nz80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141195a.m44370y(view);
            }
        });
        xdl0.m208329E0(this.f28535z, new View.OnClickListener() { // from class: l.oz80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146387a.m44371z(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    private void m44368u() {
        Act act = getAct();
        if (NullChecker.m81303a(act) && NullChecker.m81303a(dsa.m113442o()) && NullChecker.m81303a(dsa.m113442o().get())) {
            act.duringCreated(dsa.m113442o().get().m218007a()).subscribe(mkd0.m154955G(new e30() { // from class: l.pz80
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f151925a.m44349A((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v */
    private void m44369v() {
        this.f28518i.getPaint().setFakeBoldText(true);
        this.f28520k.getPaint().setFakeBoldText(true);
        qib0.f154691G.m102331L0(this.f28511b, "https://auto.tancdn.com/v1/images/eyJpZCI6IjZZSllMU0lFRFAyS1pQUEJFQ1E1NTJRWFNKTEFENDE0IiwidyI6MTA1MywiaCI6MTMyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6OTQ4NjEzNTI1NzQ4NTg4NTcyOH0.png");
        qib0.f154691G.m102331L0(this.f28517h, "https://auto.tancdn.com/v1/images/eyJpZCI6IkJRVUhUMkhEU1VIVDRMT0I0Q0JHMlJBUFFNMllTSDE0IiwidyI6MTA1MywiaCI6MjQ2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDcwMjExMTIzNDQ1ODE5ODMzNn0.png");
        qib0.f154691G.m102331L0(this.f28522m, "https://auto.tancdn.com/v1/images/eyJpZCI6IkdJQ1lKSjJGUTVZTkdIVk9ZQVVTN1ZaN0FXNkEyRDE0IiwidyI6MTA1MywiaCI6MTIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTAwNTI3NTI5MjI4ODgwNzc2OTd9.png");
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m44370y(View view) {
        Coupon coupon;
        if (NullChecker.m81303a(this.f28508S)) {
            this.f28508S.call();
        }
        if (m44385r() || this.f28499J == null || (coupon = this.f28500K) == null) {
            return;
        }
        double dM155944o = coupon.endTime - mqi0.m155944o();
        Coupon coupon2 = this.f28500K;
        if (dM155944o <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (coupon2.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
                lsi0.m151595y("优惠已失效");
            } else {
                lsi0.m151595y("优惠券已到期");
            }
            String purchaseTrackId = NullChecker.m81303a(this.f28496G) ? this.f28496G.getPurchaseTrackId() : null;
            if (TextUtils.isEmpty(purchaseTrackId)) {
                return;
            }
            if (TEnum.equals(this.f28503N, "wechat")) {
                hab0.INSTANCE.m130133g(purchaseTrackId, this.f28499J.defaultStockKeepUnit.f20507id, "coupon expired");
                return;
            } else {
                hab0.INSTANCE.m130127a(purchaseTrackId, this.f28499J.defaultStockKeepUnit.f20507id, "coupon expired");
                return;
            }
        }
        if (coupon2.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            final Act act = getAct();
            if (NullChecker.m81303a(act)) {
                C22306c<List<Merchandise>> c22306cM30644y5 = CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get("oDiamond"));
                final ax40 ax40VarM99370h = ax40.m99370h();
                Objects.requireNonNull(ax40VarM99370h);
                act.duringCreated(c22306cM30644y5.map(new w9j() { // from class: l.qz80
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ax40VarM99370h.m99373j((List) obj);
                    }
                }).filter(new u76())).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.rz80
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ax40.m99370h().m99376n(act, (List) obj, "p_navigation_view,privileges_banner,click");
                    }
                }, new e30() { // from class: l.sz80
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        PrivilegeEnhancedPromotionBannerView.m44357c((Throwable) obj);
                    }
                }));
                return;
            }
            return;
        }
        Act act2 = getAct();
        if (m44387w() && this.f28499J.autoRenewable() && !this.f28493D.isChecked() && NullChecker.m81303a(act2)) {
            dsa.m113425B(act2, NullChecker.m81303a(this.f28496G) ? this.f28496G.mo130106e() : null, new d30() { // from class: l.tz80
                @Override // p149l.d30
                public final void call() {
                    this.f172694a.m44388x();
                }
            });
        } else {
            zvf0.m220399u("e_purchase_button", OMSDialogPositon.p_navigation_view, vwb.m200311Y("purchaseShowFrom", "p_navigation,privilege_button"), vwb.m200311Y("promotion_type", this.f28501L), vwb.m200311Y("default_duration", String.format("%dm", Integer.valueOf(this.f28499J.quantity))), vwb.m200311Y("productType", this.f28499J.category != ProductCategory.get("svip") ? "vip" : "svip"), vwb.m200311Y("banner_style", "countdown"));
            m44352H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m44371z(View view) {
        Act act = getAct();
        if (act == null) {
            return;
        }
        if (TEnum.equals(this.f28499J.category, "svip") && this.f28499J.semiAnnual()) {
            osi0.m165783g("仅支持支付宝购买");
        } else {
            new wf60(act, m44366p(this.f28499J.category)).m202975r(this.f28503N).m202974q(new e30() { // from class: l.uz80
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178967a.m44351G((PayMethod) obj);
                }
            }).m202976s();
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m44373D(Integer num) {
        this.f28493D.setChecked(true);
    }

    /* JADX INFO: renamed from: E */
    public void m44374E() {
        this.f28507R = true;
        e51.m114745J(this.f28509T);
    }

    /* JADX INFO: renamed from: F */
    public void m44375F() {
        if (NullChecker.m81303a(this.f28500K)) {
            m44372B();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m44376I() {
        if (w6h0.m201818j().m201824l(this.f28500K) && TEnum.equals(this.f28501L, MonetizationPromotionsId.lowPriceFirstTime12MSVIP)) {
            xdl0.m208344M(this.f28525p, true);
            xdl0.m208344M(this.f28534y, false);
            this.f28535z = this.f28526q;
            this.f28490A = this.f28527r;
            this.f28491B = this.f28528s;
            this.f28494E = this.f28533x;
            this.f28493D = this.f28532w;
            xdl0.m208360X(this.f28531v, t100.m186890d(this.f28499J.autoRenewable() ? 7.0f : 5.0f));
            xdl0.m208357U(this.f28531v, t100.m186890d(this.f28499J.autoRenewable() ? 9.0f : 10.0f));
        } else {
            xdl0.m208344M(this.f28525p, false);
            xdl0.m208344M(this.f28534y, true);
        }
        if (TEnum.equals(this.f28499J.category, "svip")) {
            qib0.f154691G.m102331L0(this.f28511b, "https://auto.tancdn.com/v1/images/eyJpZCI6IlI1RFJVR0RDTjY3UEZCNjRNNFpUV0lKNk1IQkdQSTE0IiwidyI6MTA1MywiaCI6MTMyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            qib0.f154691G.m102331L0(this.f28517h, "https://auto.tancdn.com/v1/images/eyJpZCI6IjdEQk5GWkJPTjUyQTNEN0RRRk9LV0lEUjUzVFJCVzE0IiwidyI6MTA1MywiaCI6MjQ2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6OTQ4NjEzNDcwNzczMDA3MTg0MH0.png");
            qib0.f154691G.m102331L0(this.f28522m, "https://auto.tancdn.com/v1/images/eyJpZCI6IktUNkdZRVNUU09EQkNTUUVWQ0VPNUxEWFNFTUEzUTE0IiwidyI6MTA1MywiaCI6MTIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTU3NjM4NzkxMjI0MzAyMzM0ODN9.png");
            this.f28512c.setImageResource(d3c0.f84144v8);
            this.f28513d.setImageResource(d3c0.f84102s8);
            this.f28514e.setImageResource(d3c0.f84116t8);
            this.f28515f.setImageResource(d3c0.f84130u8);
            this.f28520k.setBackgroundResource(d3c0.f84088r8);
            this.f28520k.setTextColor(Color.parseColor("#98572F"));
            this.f28519j.setTextColor(Color.parseColor("#999D5C36"));
            this.f28518i.setTextColor(Color.parseColor("#9D5C36"));
            this.f28524o.setBackgroundColor(Color.parseColor("#0DC37A4D"));
            this.f28523n.setTextColor(Color.parseColor("#999D5C36"));
        } else if (TEnum.equals(this.f28499J.category, "oDiamond")) {
            qib0.f154691G.m102331L0(this.f28511b, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVKSFNBSlVUNjdRQ1ZGM0s0TEpSNFg0RTJaRzZSSDE0IiwidyI6MTA1MywiaCI6MTMyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            qib0.f154691G.m102331L0(this.f28517h, "https://auto.tancdn.com/v1/images/eyJpZCI6IlJZRUhNR0o0TDVGQ05BNVpTQlRIUEhYSldKUUFDTzE0IiwidyI6MTA1MywiaCI6MjQ2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            qib0.f154691G.m102331L0(this.f28522m, "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk0STZaNDY1UFU0VzdVSzVWUEVZNEQ0TUhITVpLRzE0IiwidyI6MTA1MywiaCI6MTIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            this.f28512c.setImageResource(d3c0.f84042o4);
            this.f28513d.setImageResource(d3c0.f83902e4);
            this.f28514e.setImageResource(d3c0.f83773U9);
            this.f28515f.setImageResource(d3c0.f84028n4);
            this.f28520k.setBackgroundResource(d3c0.f83875c5);
            this.f28520k.setTextColor(Color.parseColor("#4B1A0A"));
            this.f28519j.setTextColor(Color.parseColor("#99FFDEA2"));
            this.f28518i.setTextColor(Color.parseColor("#FFDEA2"));
            this.f28524o.setBackgroundColor(Color.parseColor("#1AFFDEA2"));
            this.f28523n.setTextColor(Color.parseColor("#99FFDEA2"));
        } else {
            qib0.f154691G.m102331L0(this.f28511b, "https://auto.tancdn.com/v1/images/eyJpZCI6IjZZSllMU0lFRFAyS1pQUEJFQ1E1NTJRWFNKTEFENDE0IiwidyI6MTA1MywiaCI6MTMyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6OTQ4NjEzNTI1NzQ4NTg4NTcyOH0.png");
            qib0.f154691G.m102331L0(this.f28517h, "https://auto.tancdn.com/v1/images/eyJpZCI6IkJRVUhUMkhEU1VIVDRMT0I0Q0JHMlJBUFFNMllTSDE0IiwidyI6MTA1MywiaCI6MjQ2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDcwMjExMTIzNDQ1ODE5ODMzNn0.png");
            qib0.f154691G.m102331L0(this.f28522m, "https://auto.tancdn.com/v1/images/eyJpZCI6IkdJQ1lKSjJGUTVZTkdIVk9ZQVVTN1ZaN0FXNkEyRDE0IiwidyI6MTA1MywiaCI6MTIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTAwNTI3NTI5MjI4ODgwNzc2OTd9.png");
            this.f28512c.setImageResource(d3c0.f83498Aa);
            this.f28513d.setImageResource(d3c0.f84174xa);
            this.f28514e.setImageResource(d3c0.f84188ya);
            this.f28515f.setImageResource(d3c0.f84202za);
            this.f28520k.setBackgroundResource(d3c0.f84160wa);
            this.f28520k.setTextColor(Color.parseColor("#98572F"));
            this.f28519j.setTextColor(Color.parseColor("#99C37A4D"));
            this.f28518i.setTextColor(Color.parseColor("#C37A4D"));
            this.f28524o.setBackgroundColor(Color.parseColor("#0DC37A4D"));
            this.f28523n.setTextColor(Color.parseColor("#99C37A4D"));
        }
        if (TEnum.equals(this.f28501L, MonetizationPromotionsId.giftDurationSVIP)) {
            xdl0.m208344M(this.f28525p, false);
            xdl0.m208344M(this.f28534y, false);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m44377J(j760<Merchandise, Coupon> j760Var, MonetizationPromotionsId monetizationPromotionsId) {
        Merchandise merchandise = this.f28499J;
        Merchandise merchandise2 = j760Var.f116564a;
        if (merchandise == merchandise2 && this.f28500K == j760Var.f116565b) {
            PayMethod payMethod = this.f28503N;
            if (payMethod == null) {
                payMethod = PayMethod.get("alipay");
            }
            m44351G(payMethod);
            if (this.f28507R) {
                m44382n();
                return;
            }
            return;
        }
        Merchandise merchandise3 = merchandise2;
        this.f28499J = merchandise3;
        this.f28500K = j760Var.f116565b;
        this.f28501L = monetizationPromotionsId;
        this.f28502M = ws80.m205472a(monetizationPromotionsId, merchandise3);
        if (w6h0.m201818j().m201824l(this.f28500K)) {
            this.f28506Q = ((Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get("svip")), new w9j() { // from class: l.mz80
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Merchandise merchandise4 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise4.monthly() && !merchandise4.autoRenewable());
                }
            })).defaultStockKeepUnit.prices.price * 12.0d;
        }
        this.f28505P = this.f28499J.defaultStockKeepUnit.prices.price;
        this.f28504O = this.f28500K.getCouponPrice();
        m44382n();
        m44376I();
        m44367t();
        m44379M();
        m44372B();
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            xdl0.m208344M(this.f28525p, false);
            xdl0.m208344M(this.f28534y, false);
            return;
        }
        PayMethod payMethod2 = this.f28503N;
        if (payMethod2 == null) {
            payMethod2 = PayMethod.get("alipay");
        }
        m44351G(payMethod2);
        m44378L();
        m44386s();
    }

    /* JADX INFO: renamed from: L */
    public final void m44378L() {
        Act act;
        if (m44385r() || (act = getAct()) == null) {
            return;
        }
        xdl0.m208344M(this.f28493D, this.f28499J.autoRenewable());
        this.f28494E.setText(m44383o(act));
        this.f28494E.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: M */
    public final void m44379M() {
        this.f28518i.setText(getPromotiontitle());
        this.f28519j.setText(getPromotionInfo());
    }

    @Nullable
    public Act getAct() {
        Activity activityM208328E = xdl0.m208328E(this);
        if (activityM208328E instanceof Act) {
            return (Act) activityM208328E;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m44380l(View view) {
        vz80.m200734a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public void m44381m(d30 d30Var) {
        this.f28508S = d30Var;
    }

    /* JADX INFO: renamed from: n */
    public final void m44382n() {
        this.f28507R = false;
        zvf0.m220368A("e_purchase_banner", OMSDialogPositon.p_navigation_view, vwb.m200311Y(BLiveOperationTitleShowType.duration, String.format("%dm", Integer.valueOf(this.f28499J.quantity))), vwb.m200311Y("discount_type", getDiscountType()), vwb.m200311Y("promotion_type", this.f28501L), vwb.m200311Y("productType", this.f28499J.category != ProductCategory.get("svip") ? "vip" : "svip"), vwb.m200311Y("banner_style", "countdown"));
    }

    /* JADX INFO: renamed from: o */
    public final CharSequence m44383o(Act act) {
        if (!TEnum.equals(this.f28501L, MonetizationPromotionsId.lowPriceCallback3VIP) && !TEnum.equals(this.f28501L, MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            return NullChecker.m81303a(this.f28502M) ? this.f28502M.mo107604a(act) : "";
        }
        Merchandise merchandise = this.f28499J;
        return we60.m202882w(act, merchandise, m44366p(merchandise.category), false, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e51.m114745J(this.f28509T);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44380l(this);
        m44369v();
    }

    /* JADX INFO: renamed from: q */
    public final CharSequence m44384q(String str) {
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            return TextUtils.equals("00:00:00", str) ? "优惠已结束" : String.format("优惠倒计时： %s后失效", str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("优惠");
        if (this.f28500K.isBelongPromotion(MonetizationPromotionsId.giftDurationSVIP) && TextUtils.equals("00:00:00", str)) {
            sb.append("已结束");
            return sb;
        }
        sb.append(str);
        sb.append("后过期，马上购买，配对概率翻倍");
        return sb;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m44385r() {
        return TEnum.equals(this.f28501L, MonetizationPromotionsId.giftDurationSVIP);
    }

    /* JADX INFO: renamed from: s */
    public final void m44386s() {
        if (!m44385r() && m44387w()) {
            if (this.f28495F == null) {
                this.f28495F = new zc0();
            }
            dsa.m113453z(new WeakReference(this.f28495F));
            boolean z = false;
            this.f28493D.setChecked(false);
            VCheckBox vCheckBox = this.f28493D;
            if (m44387w() && this.f28499J.autoRenewable()) {
                z = true;
            }
            xdl0.m208344M(vCheckBox, z);
            m44368u();
        }
    }

    public void setPurchaseTrack(@Nullable hab0 hab0Var) {
        this.f28496G = hab0Var;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m44387w() {
        return dsa.m113446s("MY_PRIVILEGE_ENHANCED");
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m44388x() {
        this.f28493D.setChecked(true);
        this.f28520k.performClick();
    }

    public PrivilegeEnhancedPromotionBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PrivilegeEnhancedPromotionBannerView(Context context) {
        this(context, null);
    }
}
