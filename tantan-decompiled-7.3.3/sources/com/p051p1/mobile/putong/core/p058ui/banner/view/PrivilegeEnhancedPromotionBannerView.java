package com.p051p1.mobile.putong.core.p058ui.banner.view;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.a190;
import p153l.bn60;
import p153l.bnl0;
import p153l.bo60;
import p153l.br2;
import p153l.efh0;
import p153l.g2f;
import p153l.i4g0;
import p153l.jbc0;
import p153l.jyb;
import p153l.l51;
import p153l.lib0;
import p153l.n3m;
import p153l.o1j0;
import p153l.p550;
import p153l.pf60;
import p153l.psd0;
import p153l.pta;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.r1j0;
import p153l.uqb0;
import p153l.vc0;
import p153l.wn60;
import p153l.x20;
import p153l.xl60;
import p153l.y20;
import p153l.z790;
import p153l.z86;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeEnhancedPromotionBannerView extends RelativeLayout implements n3m {

    /* JADX INFO: renamed from: A */
    public TextView f29338A;

    /* JADX INFO: renamed from: B */
    public VText f29339B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f29340C;

    /* JADX INFO: renamed from: D */
    public VCheckBox f29341D;

    /* JADX INFO: renamed from: E */
    public VText f29342E;

    /* JADX INFO: renamed from: F */
    public vc0 f29343F;

    /* JADX INFO: renamed from: G */
    public lib0 f29344G;

    /* JADX INFO: renamed from: H */
    public DecimalFormat f29345H;

    /* JADX INFO: renamed from: I */
    public NumberFormat f29346I;

    /* JADX INFO: renamed from: J */
    public Merchandise f29347J;

    /* JADX INFO: renamed from: K */
    public Coupon f29348K;

    /* JADX INFO: renamed from: L */
    public MonetizationPromotionsId f29349L;

    /* JADX INFO: renamed from: M */
    public br2 f29350M;

    /* JADX INFO: renamed from: N */
    public PayMethod f29351N;

    /* JADX INFO: renamed from: O */
    public double f29352O;

    /* JADX INFO: renamed from: P */
    public double f29353P;

    /* JADX INFO: renamed from: Q */
    public double f29354Q;

    /* JADX INFO: renamed from: R */
    public boolean f29355R;

    /* JADX INFO: renamed from: S */
    public x20 f29356S;

    /* JADX INFO: renamed from: T */
    public Runnable f29357T;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f29358a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f29359b;

    /* JADX INFO: renamed from: c */
    public ImageView f29360c;

    /* JADX INFO: renamed from: d */
    public ImageView f29361d;

    /* JADX INFO: renamed from: e */
    public ImageView f29362e;

    /* JADX INFO: renamed from: f */
    public ImageView f29363f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f29364g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f29365h;

    /* JADX INFO: renamed from: i */
    public VText f29366i;

    /* JADX INFO: renamed from: j */
    public VText f29367j;

    /* JADX INFO: renamed from: k */
    public VText f29368k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f29369l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f29370m;

    /* JADX INFO: renamed from: n */
    public VText f29371n;

    /* JADX INFO: renamed from: o */
    public View f29372o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f29373p;

    /* JADX INFO: renamed from: q */
    public RelativeLayout f29374q;

    /* JADX INFO: renamed from: r */
    public TextView f29375r;

    /* JADX INFO: renamed from: s */
    public VText f29376s;

    /* JADX INFO: renamed from: t */
    public VText f29377t;

    /* JADX INFO: renamed from: u */
    public ImageView f29378u;

    /* JADX INFO: renamed from: v */
    public VLinear f29379v;

    /* JADX INFO: renamed from: w */
    public VCheckBox f29380w;

    /* JADX INFO: renamed from: x */
    public VText f29381x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f29382y;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f29383z;

    public PrivilegeEnhancedPromotionBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29345H = new DecimalFormat("#.#");
        this.f29346I = new DecimalFormat("00");
        this.f29351N = PayMethod.get("alipay");
        this.f29355R = false;
        this.f29356S = null;
        this.f29357T = new Runnable() { // from class: l.n790
            @Override // java.lang.Runnable
            public final void run() {
                this.f140584a.m45555B();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m45532A(Boolean bool) {
        this.f29341D.setChecked(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m45533C(Integer num) {
        this.f29341D.setChecked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public void m45534G(PayMethod payMethod) {
        if (m45568r()) {
            return;
        }
        boolean z = false;
        bnl0.m105524M(this.f29339B, false);
        this.f29351N = payMethod;
        if (TEnum.equals(payMethod, "alipay")) {
            if (CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31077n3()) {
                z = true;
            }
            this.f29338A.setText(z ? R$string.f28308h : R$string.f27960C);
            this.f29338A.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f18263b.getResources().getDrawable(jbc0.f119570f3), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(this.f29351N, "wechat")) {
            this.f29338A.setText(R$string.f28015H);
            this.f29338A.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f18263b.getResources().getDrawable(jbc0.f119556e3), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(this.f29351N, PayMethod.jingdong)) {
            this.f29338A.setText("京东支付");
            this.f29338A.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f18263b.getResources().getDrawable(jbc0.f119542d3), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            this.f29368k.setText("领取优惠");
        } else {
            VText vText = this.f29368k;
            if (z) {
                vText.setText("确认协议免密付");
            } else {
                vText.setText("确认协议支付");
            }
        }
        m45536K();
    }

    /* JADX INFO: renamed from: H */
    private void m45535H() {
        Act act = getAct();
        if (act == null) {
            return;
        }
        String purchaseTrackId = NullChecker.m82486a(this.f29344G) ? this.f29344G.getPurchaseTrackId() : null;
        if (TEnum.equals(this.f29351N, "wechat")) {
            if (!xl60.m211511p()) {
                lib0.INSTANCE.m154355g(purchaseTrackId, this.f29347J.defaultStockKeepUnit.f21249id, "wx not install");
                return;
            }
        } else if (!CoreModule.m30933P().m143405a().mo34527j3() && !xl60.m211506k()) {
            lib0.INSTANCE.m154349a(purchaseTrackId, this.f29347J.defaultStockKeepUnit.f21249id, "alipay not install");
            return;
        }
        wn60 wn60Var = new wn60(m45549p(this.f29347J.category), act, "p_navigation,privilege_button", "");
        wn60Var.m207144C(purchaseTrackId);
        wn60Var.m207167r(this.f29348K.couponID);
        if (this.f29347J.autoRenewable()) {
            wn60Var.m207150I(TEnum.equals(this.f29351N, "wechat"), this.f29347J.defaultStockKeepUnit.f21249id, new y20() { // from class: l.o790
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f145246a.m45533C((Integer) obj);
                }
            });
        } else {
            wn60Var.m207164o(this.f29347J.defaultStockKeepUnit.f21249id, TEnum.equals(this.f29351N, "wechat"), new y20() { // from class: l.p790
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f150907a.m45556D((Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K */
    private void m45536K() {
        if (CoreModule.m30933P().m143405a().mo34528jh()) {
            if (TEnum.equals(this.f29351N, "alipay")) {
                this.f29339B.setText(CoreModule.m30933P().m143405a().mo34305D6());
                bnl0.m105524M(this.f29339B, true);
            } else {
                bnl0.m105524M(this.f29339B, false);
            }
        }
        bnl0.m105524M(this.f29377t, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void m45555B() {
        Act act = getAct();
        if (act == null) {
            return;
        }
        pf60<Boolean, String> pf60VarM128611c = g2f.m128611c(this.f29348K);
        this.f29371n.setText(m45567q(pf60VarM128611c.f152157b));
        l51.m152890J(this.f29357T);
        if (pf60VarM128611c.f152156a.booleanValue()) {
            l51.m152888H(act, this.f29357T, 1000L);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m45540c(Throwable th) {
    }

    private String getDiscountType() {
        return (TEnum.equals(this.f29349L, MonetizationPromotionsId.lowPriceCallback3VIP) || TEnum.equals(this.f29349L, MonetizationPromotionsId.lowPriceCallback3SVIP)) ? "low_price_recall" : "new_customer";
    }

    private CharSequence getPromotionInfo() {
        StringBuilder sb = new StringBuilder();
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            sb.append("现价");
            sb.append(this.f29345H.format(this.f29352O));
            sb.append("元，原价");
            sb.append(this.f29345H.format(this.f29353P));
            sb.append("元");
            return sb;
        }
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP)) {
            sb.append("现价");
            sb.append(this.f29345H.format(this.f29352O));
            sb.append("元，原价");
            sb.append(this.f29345H.format(this.f29353P));
            sb.append("元");
            return sb;
        }
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) {
            sb.append("原价");
            sb.append(this.f29345H.format(this.f29353P));
            sb.append("元");
            return sb;
        }
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP)) {
            sb.append("原价");
            sb.append(this.f29345H.format(this.f29353P));
            sb.append("元");
            return sb;
        }
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
            sb.append("原价");
            sb.append(this.f29345H.format(this.f29353P));
            sb.append("元");
            return sb;
        }
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPrice3Month)) {
            sb.append("原价");
            sb.append(this.f29345H.format(this.f29353P));
            sb.append("元");
            return sb;
        }
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP)) {
            sb.append("现价");
            sb.append((int) this.f29352O);
            sb.append("元，原价");
            sb.append((int) this.f29354Q);
            sb.append("元");
            return sb;
        }
        if (!this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.giftDurationSVIP)) {
                sb.append("双十一特惠，一年仅此一次");
            }
            return sb;
        }
        sb.append("黑金年卡限时优惠价");
        sb.append((int) this.f29352O);
        sb.append("元");
        return sb;
    }

    private CharSequence getPromotiontitle() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "卡立减");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f29345H.format(this.f29353P - this.f29352O));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder.append((CharSequence) "元");
            return spannableStringBuilder;
        }
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP)) {
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "卡立减");
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f29345H.format(this.f29353P - this.f29352O));
            spannableStringBuilder3.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder3.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
            spannableStringBuilder.append((CharSequence) "元");
            return spannableStringBuilder;
        }
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) {
            spannableStringBuilder.append((CharSequence) "VIP首");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "立省");
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(this.f29346I.format(100.0d - ((this.f29352O / this.f29353P) * 100.0d)));
            spannableStringBuilder4.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder4.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder4);
            spannableStringBuilder.append((CharSequence) "%");
            return spannableStringBuilder;
        }
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP)) {
            spannableStringBuilder.append((CharSequence) "SVIP首");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "立省");
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(this.f29346I.format(100.0d - ((this.f29352O / this.f29353P) * 100.0d)));
            spannableStringBuilder5.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder5.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder5);
            spannableStringBuilder.append((CharSequence) "%");
            return spannableStringBuilder;
        }
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
            spannableStringBuilder.append((CharSequence) "SVIP首");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "立省");
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(this.f29346I.format(100.0d - ((this.f29352O / this.f29353P) * 100.0d)));
            spannableStringBuilder6.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder6.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder6);
            spannableStringBuilder.append((CharSequence) "%");
            return spannableStringBuilder;
        }
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPrice3Month)) {
            spannableStringBuilder.append((CharSequence) "前3个月每月");
            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(this.f29345H.format(this.f29352O));
            spannableStringBuilder7.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder7.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder7);
            spannableStringBuilder.append((CharSequence) "元");
            return spannableStringBuilder;
        }
        if (!this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP)) {
            if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
                spannableStringBuilder.append((CharSequence) "4折购买黑金会员");
                return spannableStringBuilder;
            }
            if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.giftDurationSVIP)) {
                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("半年卡立送3个月");
                spannableStringBuilder8.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 5, 6, 33);
                spannableStringBuilder.append((CharSequence) spannableStringBuilder8);
            }
            return spannableStringBuilder;
        }
        int iM120696i = efh0.m120692j().m120696i(this.f29347J, null);
        SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder((iM120696i > 0 ? String.valueOf(iM120696i) : "-") + "折");
        spannableStringBuilder9.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder9.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder9).append((CharSequence) "购买探探年卡");
        return spannableStringBuilder;
    }

    private PurchaseType getPurchaseType() {
        if (NullChecker.m82486a(this.f29347J)) {
            if (TEnum.equals(this.f29347J.category, "svip")) {
                return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            }
            if (TEnum.equals(this.f29347J.category, ProductCategory.tttVip)) {
                return PurchaseType.TYPE_GET_VIP;
            }
        }
        return PurchaseType.TYPE_GET_VIP;
    }

    private String getUnitIntervalValue() {
        Merchandise merchandise = this.f29347J;
        return merchandise == null ? "月" : merchandise.quantityName();
    }

    /* JADX INFO: renamed from: p */
    public static PurchaseType m45549p(ProductCategory productCategory) {
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
    private void m45550t() {
        bnl0.m105509E0(this.f29368k, new View.OnClickListener() { // from class: l.r790
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161594a.m45553y(view);
            }
        });
        bnl0.m105509E0(this.f29383z, new View.OnClickListener() { // from class: l.s790
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166653a.m45554z(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    private void m45551u() {
        Act act = getAct();
        if (NullChecker.m82486a(act) && NullChecker.m82486a(pta.m173722o()) && NullChecker.m82486a(pta.m173722o().get())) {
            act.duringCreated(pta.m173722o().get().m200750a()).subscribe(psd0.m173596G(new y20() { // from class: l.t790
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172408a.m45532A((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v */
    private void m45552v() {
        this.f29366i.getPaint().setFakeBoldText(true);
        this.f29368k.getPaint().setFakeBoldText(true);
        uqb0.f180374G.m127115L0(this.f29359b, "https://auto.tancdn.com/v1/images/eyJpZCI6IjZZSllMU0lFRFAyS1pQUEJFQ1E1NTJRWFNKTEFENDE0IiwidyI6MTA1MywiaCI6MTMyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6OTQ4NjEzNTI1NzQ4NTg4NTcyOH0.png");
        uqb0.f180374G.m127115L0(this.f29365h, "https://auto.tancdn.com/v1/images/eyJpZCI6IkJRVUhUMkhEU1VIVDRMT0I0Q0JHMlJBUFFNMllTSDE0IiwidyI6MTA1MywiaCI6MjQ2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDcwMjExMTIzNDQ1ODE5ODMzNn0.png");
        uqb0.f180374G.m127115L0(this.f29370m, "https://auto.tancdn.com/v1/images/eyJpZCI6IkdJQ1lKSjJGUTVZTkdIVk9ZQVVTN1ZaN0FXNkEyRDE0IiwidyI6MTA1MywiaCI6MTIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTAwNTI3NTI5MjI4ODgwNzc2OTd9.png");
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
    public /* synthetic */ void m45553y(View view) {
        Coupon coupon;
        if (NullChecker.m82486a(this.f29356S)) {
            this.f29356S.call();
        }
        if (m45568r() || this.f29347J == null || (coupon = this.f29348K) == null) {
            return;
        }
        double dM174454o = coupon.endTime - pzi0.m174454o();
        Coupon coupon2 = this.f29348K;
        if (dM174454o <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (coupon2.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
                o1j0.m165651y("优惠已失效");
            } else {
                o1j0.m165651y("优惠券已到期");
            }
            String purchaseTrackId = NullChecker.m82486a(this.f29344G) ? this.f29344G.getPurchaseTrackId() : null;
            if (TextUtils.isEmpty(purchaseTrackId)) {
                return;
            }
            if (TEnum.equals(this.f29351N, "wechat")) {
                lib0.INSTANCE.m154355g(purchaseTrackId, this.f29347J.defaultStockKeepUnit.f21249id, "coupon expired");
                return;
            } else {
                lib0.INSTANCE.m154349a(purchaseTrackId, this.f29347J.defaultStockKeepUnit.f21249id, "coupon expired");
                return;
            }
        }
        if (coupon2.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            final Act act = getAct();
            if (NullChecker.m82486a(act)) {
                C22421c<List<Merchandise>> c22421cM31647y5 = CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get("oDiamond"));
                final p550 p550VarM170601h = p550.m170601h();
                Objects.requireNonNull(p550VarM170601h);
                act.duringCreated(c22421cM31647y5.map(new qcj() { // from class: l.u790
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return p550VarM170601h.m170604j((List) obj);
                    }
                }).filter(new z86())).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.v790
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        p550.m170601h().m170607n(act, (List) obj, "p_navigation_view,privileges_banner,click");
                    }
                }, new y20() { // from class: l.w790
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        PrivilegeEnhancedPromotionBannerView.m45540c((Throwable) obj);
                    }
                }));
                return;
            }
            return;
        }
        Act act2 = getAct();
        if (m45570w() && this.f29347J.autoRenewable() && !this.f29341D.isChecked() && NullChecker.m82486a(act2)) {
            pta.m173705B(act2, NullChecker.m82486a(this.f29344G) ? this.f29344G.mo103692e() : null, new x20() { // from class: l.x790
                @Override // p153l.x20
                public final void call() {
                    this.f192680a.m45571x();
                }
            });
        } else {
            i4g0.m138523u("e_purchase_button", OMSDialogPositon.p_navigation_view, jyb.m147494Y("purchaseShowFrom", "p_navigation,privilege_button"), jyb.m147494Y("promotion_type", this.f29349L), jyb.m147494Y("default_duration", String.format("%dm", Integer.valueOf(this.f29347J.quantity))), jyb.m147494Y("productType", this.f29347J.category != ProductCategory.get("svip") ? "vip" : "svip"), jyb.m147494Y("banner_style", "countdown"));
            m45535H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m45554z(View view) {
        Act act = getAct();
        if (act == null) {
            return;
        }
        if (TEnum.equals(this.f29347J.category, "svip") && this.f29347J.semiAnnual()) {
            r1j0.m179420g("仅支持支付宝购买");
        } else {
            new bo60(act, m45549p(this.f29347J.category)).m105668r(this.f29351N).m105667q(new y20() { // from class: l.y790
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197753a.m45534G((PayMethod) obj);
                }
            }).m105669s();
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m45556D(Integer num) {
        this.f29341D.setChecked(true);
    }

    /* JADX INFO: renamed from: E */
    public void m45557E() {
        this.f29355R = true;
        l51.m152890J(this.f29357T);
    }

    /* JADX INFO: renamed from: F */
    public void m45558F() {
        if (NullChecker.m82486a(this.f29348K)) {
            m45555B();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m45559I() {
        if (efh0.m120692j().m120698l(this.f29348K) && TEnum.equals(this.f29349L, MonetizationPromotionsId.lowPriceFirstTime12MSVIP)) {
            bnl0.m105524M(this.f29373p, true);
            bnl0.m105524M(this.f29382y, false);
            this.f29383z = this.f29374q;
            this.f29338A = this.f29375r;
            this.f29339B = this.f29376s;
            this.f29342E = this.f29381x;
            this.f29341D = this.f29380w;
            bnl0.m105540X(this.f29379v, qa00.m175859d(this.f29347J.autoRenewable() ? 7.0f : 5.0f));
            bnl0.m105537U(this.f29379v, qa00.m175859d(this.f29347J.autoRenewable() ? 9.0f : 10.0f));
        } else {
            bnl0.m105524M(this.f29373p, false);
            bnl0.m105524M(this.f29382y, true);
        }
        if (TEnum.equals(this.f29347J.category, "svip")) {
            uqb0.f180374G.m127115L0(this.f29359b, "https://auto.tancdn.com/v1/images/eyJpZCI6IlI1RFJVR0RDTjY3UEZCNjRNNFpUV0lKNk1IQkdQSTE0IiwidyI6MTA1MywiaCI6MTMyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            uqb0.f180374G.m127115L0(this.f29365h, "https://auto.tancdn.com/v1/images/eyJpZCI6IjdEQk5GWkJPTjUyQTNEN0RRRk9LV0lEUjUzVFJCVzE0IiwidyI6MTA1MywiaCI6MjQ2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6OTQ4NjEzNDcwNzczMDA3MTg0MH0.png");
            uqb0.f180374G.m127115L0(this.f29370m, "https://auto.tancdn.com/v1/images/eyJpZCI6IktUNkdZRVNUU09EQkNTUUVWQ0VPNUxEWFNFTUEzUTE0IiwidyI6MTA1MywiaCI6MTIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTU3NjM4NzkxMjI0MzAyMzM0ODN9.png");
            this.f29360c.setImageResource(jbc0.f119799v8);
            this.f29361d.setImageResource(jbc0.f119757s8);
            this.f29362e.setImageResource(jbc0.f119771t8);
            this.f29363f.setImageResource(jbc0.f119785u8);
            this.f29368k.setBackgroundResource(jbc0.f119743r8);
            this.f29368k.setTextColor(Color.parseColor("#98572F"));
            this.f29367j.setTextColor(Color.parseColor("#999D5C36"));
            this.f29366i.setTextColor(Color.parseColor("#9D5C36"));
            this.f29372o.setBackgroundColor(Color.parseColor("#0DC37A4D"));
            this.f29371n.setTextColor(Color.parseColor("#999D5C36"));
        } else if (TEnum.equals(this.f29347J.category, "oDiamond")) {
            uqb0.f180374G.m127115L0(this.f29359b, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVKSFNBSlVUNjdRQ1ZGM0s0TEpSNFg0RTJaRzZSSDE0IiwidyI6MTA1MywiaCI6MTMyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            uqb0.f180374G.m127115L0(this.f29365h, "https://auto.tancdn.com/v1/images/eyJpZCI6IlJZRUhNR0o0TDVGQ05BNVpTQlRIUEhYSldKUUFDTzE0IiwidyI6MTA1MywiaCI6MjQ2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            uqb0.f180374G.m127115L0(this.f29370m, "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk0STZaNDY1UFU0VzdVSzVWUEVZNEQ0TUhITVpLRzE0IiwidyI6MTA1MywiaCI6MTIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            this.f29360c.setImageResource(jbc0.f119697o4);
            this.f29361d.setImageResource(jbc0.f119557e4);
            this.f29362e.setImageResource(jbc0.f119428U9);
            this.f29363f.setImageResource(jbc0.f119683n4);
            this.f29368k.setBackgroundResource(jbc0.f119530c5);
            this.f29368k.setTextColor(Color.parseColor("#4B1A0A"));
            this.f29367j.setTextColor(Color.parseColor("#99FFDEA2"));
            this.f29366i.setTextColor(Color.parseColor("#FFDEA2"));
            this.f29372o.setBackgroundColor(Color.parseColor("#1AFFDEA2"));
            this.f29371n.setTextColor(Color.parseColor("#99FFDEA2"));
        } else {
            uqb0.f180374G.m127115L0(this.f29359b, "https://auto.tancdn.com/v1/images/eyJpZCI6IjZZSllMU0lFRFAyS1pQUEJFQ1E1NTJRWFNKTEFENDE0IiwidyI6MTA1MywiaCI6MTMyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6OTQ4NjEzNTI1NzQ4NTg4NTcyOH0.png");
            uqb0.f180374G.m127115L0(this.f29365h, "https://auto.tancdn.com/v1/images/eyJpZCI6IkJRVUhUMkhEU1VIVDRMT0I0Q0JHMlJBUFFNMllTSDE0IiwidyI6MTA1MywiaCI6MjQ2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDcwMjExMTIzNDQ1ODE5ODMzNn0.png");
            uqb0.f180374G.m127115L0(this.f29370m, "https://auto.tancdn.com/v1/images/eyJpZCI6IkdJQ1lKSjJGUTVZTkdIVk9ZQVVTN1ZaN0FXNkEyRDE0IiwidyI6MTA1MywiaCI6MTIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTAwNTI3NTI5MjI4ODgwNzc2OTd9.png");
            this.f29360c.setImageResource(jbc0.f119153Aa);
            this.f29361d.setImageResource(jbc0.f119829xa);
            this.f29362e.setImageResource(jbc0.f119843ya);
            this.f29363f.setImageResource(jbc0.f119857za);
            this.f29368k.setBackgroundResource(jbc0.f119815wa);
            this.f29368k.setTextColor(Color.parseColor("#98572F"));
            this.f29367j.setTextColor(Color.parseColor("#99C37A4D"));
            this.f29366i.setTextColor(Color.parseColor("#C37A4D"));
            this.f29372o.setBackgroundColor(Color.parseColor("#0DC37A4D"));
            this.f29371n.setTextColor(Color.parseColor("#99C37A4D"));
        }
        if (TEnum.equals(this.f29349L, MonetizationPromotionsId.giftDurationSVIP)) {
            bnl0.m105524M(this.f29373p, false);
            bnl0.m105524M(this.f29382y, false);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m45560J(pf60<Merchandise, Coupon> pf60Var, MonetizationPromotionsId monetizationPromotionsId) {
        Merchandise merchandise = this.f29347J;
        Merchandise merchandise2 = pf60Var.f152156a;
        if (merchandise == merchandise2 && this.f29348K == pf60Var.f152157b) {
            PayMethod payMethod = this.f29351N;
            if (payMethod == null) {
                payMethod = PayMethod.get("alipay");
            }
            m45534G(payMethod);
            if (this.f29355R) {
                m45565n();
                return;
            }
            return;
        }
        Merchandise merchandise3 = merchandise2;
        this.f29347J = merchandise3;
        this.f29348K = pf60Var.f152157b;
        this.f29349L = monetizationPromotionsId;
        this.f29350M = a190.m95467a(monetizationPromotionsId, merchandise3);
        if (efh0.m120692j().m120698l(this.f29348K)) {
            this.f29354Q = ((Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get("svip")), new qcj() { // from class: l.q790
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Merchandise merchandise4 = (Merchandise) obj;
                    return Boolean.valueOf(merchandise4.monthly() && !merchandise4.autoRenewable());
                }
            })).defaultStockKeepUnit.prices.price * 12.0d;
        }
        this.f29353P = this.f29347J.defaultStockKeepUnit.prices.price;
        this.f29352O = this.f29348K.getCouponPrice();
        m45565n();
        m45559I();
        m45550t();
        m45562M();
        m45555B();
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            bnl0.m105524M(this.f29373p, false);
            bnl0.m105524M(this.f29382y, false);
            return;
        }
        PayMethod payMethod2 = this.f29351N;
        if (payMethod2 == null) {
            payMethod2 = PayMethod.get("alipay");
        }
        m45534G(payMethod2);
        m45561L();
        m45569s();
    }

    /* JADX INFO: renamed from: L */
    public final void m45561L() {
        Act act;
        if (m45568r() || (act = getAct()) == null) {
            return;
        }
        bnl0.m105524M(this.f29341D, this.f29347J.autoRenewable());
        this.f29342E.setText(m45566o(act));
        this.f29342E.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: M */
    public final void m45562M() {
        this.f29366i.setText(getPromotiontitle());
        this.f29367j.setText(getPromotionInfo());
    }

    @Nullable
    public Act getAct() {
        Activity activityM105508E = bnl0.m105508E(this);
        if (activityM105508E instanceof Act) {
            return (Act) activityM105508E;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m45563l(View view) {
        z790.m218867a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public void m45564m(x20 x20Var) {
        this.f29356S = x20Var;
    }

    /* JADX INFO: renamed from: n */
    public final void m45565n() {
        this.f29355R = false;
        i4g0.m138492A("e_purchase_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y(BLiveOperationTitleShowType.duration, String.format("%dm", Integer.valueOf(this.f29347J.quantity))), jyb.m147494Y("discount_type", getDiscountType()), jyb.m147494Y("promotion_type", this.f29349L), jyb.m147494Y("productType", this.f29347J.category != ProductCategory.get("svip") ? "vip" : "svip"), jyb.m147494Y("banner_style", "countdown"));
    }

    /* JADX INFO: renamed from: o */
    public final CharSequence m45566o(Act act) {
        if (!TEnum.equals(this.f29349L, MonetizationPromotionsId.lowPriceCallback3VIP) && !TEnum.equals(this.f29349L, MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            return NullChecker.m82486a(this.f29350M) ? this.f29350M.mo106026a(act) : "";
        }
        Merchandise merchandise = this.f29347J;
        return bn60.m105364w(act, merchandise, m45549p(merchandise.category), false, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l51.m152890J(this.f29357T);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45563l(this);
        m45552v();
    }

    /* JADX INFO: renamed from: q */
    public final CharSequence m45567q(String str) {
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            return TextUtils.equals("00:00:00", str) ? "优惠已结束" : String.format("优惠倒计时： %s后失效", str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("优惠");
        if (this.f29348K.isBelongPromotion(MonetizationPromotionsId.giftDurationSVIP) && TextUtils.equals("00:00:00", str)) {
            sb.append("已结束");
            return sb;
        }
        sb.append(str);
        sb.append("后过期，马上购买，配对概率翻倍");
        return sb;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m45568r() {
        return TEnum.equals(this.f29349L, MonetizationPromotionsId.giftDurationSVIP);
    }

    /* JADX INFO: renamed from: s */
    public final void m45569s() {
        if (!m45568r() && m45570w()) {
            if (this.f29343F == null) {
                this.f29343F = new vc0();
            }
            pta.m173733z(new WeakReference(this.f29343F));
            boolean z = false;
            this.f29341D.setChecked(false);
            VCheckBox vCheckBox = this.f29341D;
            if (m45570w() && this.f29347J.autoRenewable()) {
                z = true;
            }
            bnl0.m105524M(vCheckBox, z);
            m45551u();
        }
    }

    public void setPurchaseTrack(@Nullable lib0 lib0Var) {
        this.f29344G = lib0Var;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m45570w() {
        return pta.m173726s("MY_PRIVILEGE_ENHANCED");
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m45571x() {
        this.f29341D.setChecked(true);
        this.f29368k.performClick();
    }

    public PrivilegeEnhancedPromotionBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PrivilegeEnhancedPromotionBannerView(Context context) {
        this(context, null);
    }
}
