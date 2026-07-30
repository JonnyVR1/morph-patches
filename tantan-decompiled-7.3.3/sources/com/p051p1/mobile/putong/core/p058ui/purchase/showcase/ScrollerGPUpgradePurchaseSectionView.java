package com.p051p1.mobile.putong.core.p058ui.purchase.showcase;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.ScrollerGPUpgradePurchaseSectionView;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_AutoFit;
import p153l.a30;
import p153l.bmp;
import p153l.bnl0;
import p153l.fdc0;
import p153l.iee0;
import p153l.jbc0;
import p153l.jyb;
import p153l.lyh0;
import p153l.qa00;
import p153l.w20;
import p153l.z20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00107\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010>\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010A\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010+\u001a\u0004\b?\u0010-\"\u0004\b@\u0010/R\"\u0010D\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010+\u001a\u0004\bB\u0010-\"\u0004\bC\u0010/R\"\u0010J\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010\rR\"\u0010N\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u00109\u001a\u0004\bL\u0010;\"\u0004\bM\u0010=R\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010+\u001a\u0004\bX\u0010-\"\u0004\bY\u0010/R\"\u0010^\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u00102\u001a\u0004\b\\\u00104\"\u0004\b]\u00106R$\u0010e\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010m\u001a\u0004\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010p\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010\u001cR$\u0010z\u001a\u0004\u0018\u00010s8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0018\u0010\u0080\u0001\u001a\u00020{8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f¨\u0006\u0081\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/showcase/ScrollerGPUpgradePurchaseSectionView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "c", "(Landroid/view/View;)V", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "", "select", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Ll/a30;", "selectAction", "f", "(Lcom/p1/mobile/putong/core/data/PurchaseType;ZLjava/util/List;Ll/a30;)V", "e", "(Z)V", "", "margin", Constants.INAPP_DATA_TAG, "(I)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "a", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_border", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_border", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_border", "Lv/VText;", "b", "Lv/VText;", "get_border_hot_tag", "()Lv/VText;", "set_border_hot_tag", "(Lv/VText;)V", "_border_hot_tag", "Lv/VImage;", "Lv/VImage;", "get_border_select_img", "()Lv/VImage;", "set_border_select_img", "(Lv/VImage;)V", "_border_select_img", "Lv/VText_AutoFit;", "Lv/VText_AutoFit;", "get_border_origin_price", "()Lv/VText_AutoFit;", "set_border_origin_price", "(Lv/VText_AutoFit;)V", "_border_origin_price", "get_border_count", "set_border_count", "_border_count", "get_border_unit", "set_border_unit", "_border_unit", "g", "Landroid/view/View;", "get_border_center_price_bg", "()Landroid/view/View;", "set_border_center_price_bg", "_border_center_price_bg", "h", "get_border_top_price", "set_border_top_price", "_border_top_price", "Lv/VLinear;", RXScreenCaptureService.KEY_INDEX, "Lv/VLinear;", "get_border_ll_select", "()Lv/VLinear;", "set_border_ll_select", "(Lv/VLinear;)V", "_border_ll_select", "j", "get_border_ll_select_label", "set_border_ll_select_label", "_border_ll_select_label", "k", "get_border_ll_select_icon", "set_border_ll_select_icon", "_border_ll_select_icon", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/core/ui/purchase/d;", "getSection", "()Lcom/p1/mobile/putong/core/ui/purchase/d;", "setSection", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "section", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "m", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "getDetail", "()Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "setDetail", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "detail", "n", "Z", "isSelect", "()Z", "setSelect", "Ll/bmp;", "o", "Ll/bmp;", "getDialog", "()Ll/bmp;", "setDialog", "(Ll/bmp;)V", OMSTemplateType.dialog, "Ljava/text/NumberFormat;", "p", "Ljava/text/NumberFormat;", "getNumberFormat", "()Ljava/text/NumberFormat;", "numberFormat", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ScrollerGPUpgradePurchaseSectionView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ConstraintLayout _border;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _border_hot_tag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VImage _border_select_img;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText_AutoFit _border_origin_price;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _border_count;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _border_unit;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _border_center_price_bg;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText_AutoFit _border_top_price;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VLinear _border_ll_select;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _border_ll_select_label;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VImage _border_ll_select_icon;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public C8928d section;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public C8928d.a detail;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean isSelect;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public bmp dialog;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final NumberFormat numberFormat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollerGPUpgradePurchaseSectionView(@NotNull Context context) {
        super(context);
        context.getClass();
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.getClass();
        this.numberFormat = numberInstance;
    }

    /* JADX INFO: renamed from: b */
    public static void m55576b(final ScrollerGPUpgradePurchaseSectionView scrollerGPUpgradePurchaseSectionView, final a30 a30Var, PurchaseType purchaseType, List list, View view) {
        boolean z = scrollerGPUpgradePurchaseSectionView.isSelect;
        if (z) {
            scrollerGPUpgradePurchaseSectionView.dialog = new bmp.C16056f(w20.m204489d()).m105244c("p_knowmyself_purchase,e_knowmyself_test,click").m105247f(purchaseType).m105245d(false).m105246e(list).m105243b(new z20() { // from class: l.hee0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    ScrollerGPUpgradePurchaseSectionView.m55577g(this.f109145a, a30Var, (C8928d) obj, (Boolean) obj2);
                }
            }).m105248g();
        } else {
            a30Var.mo37058a(Boolean.valueOf(z), scrollerGPUpgradePurchaseSectionView.section, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m55577g(ScrollerGPUpgradePurchaseSectionView scrollerGPUpgradePurchaseSectionView, a30 a30Var, C8928d c8928d, Boolean bool) {
        bmp bmpVar = scrollerGPUpgradePurchaseSectionView.dialog;
        if (bmpVar != null) {
            bmpVar.m105225j();
        }
        scrollerGPUpgradePurchaseSectionView.section = c8928d;
        c8928d.getClass();
        if (c8928d.m54705d() != null) {
            scrollerGPUpgradePurchaseSectionView.detail = c8928d.m54705d();
        } else {
            scrollerGPUpgradePurchaseSectionView.detail = c8928d.m54703b();
        }
        scrollerGPUpgradePurchaseSectionView.m55580e(scrollerGPUpgradePurchaseSectionView.isSelect);
        a30Var.mo37058a(Boolean.valueOf(scrollerGPUpgradePurchaseSectionView.isSelect), c8928d, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: c */
    public final void m55578c(View view) {
        iee0.m139597a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m55579d(int margin) {
        ViewGroup.LayoutParams layoutParams = get_border_count().getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) layoutParams;
        c0221a.f1270u = margin;
        get_border_count().setLayoutParams(c0221a);
    }

    /* JADX INFO: renamed from: e */
    public final void m55580e(boolean select) {
        int i;
        int i2;
        int color;
        int color2;
        int color3;
        int color4;
        int color5;
        int color6;
        int i3;
        int i4;
        Double dValueOf;
        String strM54772k;
        int i5;
        if (this.detail == null) {
            return;
        }
        this.isSelect = select;
        bnl0.m105525M0(get_border_select_img(), select);
        if (select) {
            ViewGroup.LayoutParams layoutParams = get_border_top_price().getLayoutParams();
            layoutParams.getClass();
            ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) layoutParams;
            c0221a.f1251h = fdc0.f98436r;
            ((ViewGroup.MarginLayoutParams) c0221a).bottomMargin = 0;
            get_border_top_price().setLayoutParams(c0221a);
            ViewGroup.LayoutParams layoutParams2 = get_border_ll_select().getLayoutParams();
            layoutParams2.getClass();
            ConstraintLayout.C0221a c0221a2 = (ConstraintLayout.C0221a) layoutParams2;
            c0221a2.f1251h = fdc0.f98436r;
            ((ViewGroup.MarginLayoutParams) c0221a2).bottomMargin = 0;
            get_border_ll_select().setLayoutParams(c0221a2);
            m55579d(qa00.m175859d(19.0f));
            C8928d.a aVar = this.detail;
            String strValueOf = String.valueOf(aVar != null ? aVar.m54762f() : null);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode == -1301121252 ? !strValueOf.equals(ProductCategory.Promo_premiumUpgradeToUltra) : iHashCode == -435036897 ? !strValueOf.equals(ProductCategory.tttUltraPremium) : !(iHashCode == 1916885208 && strValueOf.equals(ProductCategory.tttPremiumUpgradeToUltra))) {
                int color7 = Color.parseColor(Constants.BLACK);
                color5 = Color.parseColor("#EDD7A3");
                int color8 = Color.parseColor("#EDD7A3");
                int color9 = Color.parseColor("#BE8B13");
                color6 = Color.parseColor("#CC000000");
                int color10 = Color.parseColor("#66FFE7AA");
                i5 = jbc0.f119793v2;
                i = jbc0.f119790v;
                i2 = jbc0.f119271J2;
                color = color10;
                color2 = color7;
                color3 = color9;
                color4 = color8;
            } else {
                color2 = Color.parseColor(Constants.BLACK);
                color5 = Color.parseColor("#F9E7FF");
                color4 = Color.parseColor("#F9E7FF");
                color3 = Color.parseColor("#B05BCE");
                color6 = Color.parseColor("#CC000000");
                color = Color.parseColor("#66F9E7FF");
                i5 = jbc0.f119807w2;
                i = jbc0.f119818x;
                i2 = jbc0.f119341O2;
            }
            VImage vImage = get_border_select_img();
            vImage.getClass();
            vImage.setImageResource(i5);
        } else {
            ViewGroup.LayoutParams layoutParams3 = get_border_top_price().getLayoutParams();
            layoutParams3.getClass();
            ConstraintLayout.C0221a c0221a3 = (ConstraintLayout.C0221a) layoutParams3;
            c0221a3.f1251h = -1;
            ((ViewGroup.MarginLayoutParams) c0221a3).bottomMargin = qa00.m175859d(19.0f);
            get_border_top_price().setLayoutParams(c0221a3);
            ViewGroup.LayoutParams layoutParams4 = get_border_ll_select().getLayoutParams();
            layoutParams4.getClass();
            ConstraintLayout.C0221a c0221a4 = (ConstraintLayout.C0221a) layoutParams4;
            c0221a4.f1251h = -1;
            ((ViewGroup.MarginLayoutParams) c0221a4).bottomMargin = qa00.m175859d(19.0f);
            get_border_ll_select().setLayoutParams(c0221a4);
            m55579d(qa00.m175859d(25.0f));
            C8928d.a aVar2 = this.detail;
            String strValueOf2 = String.valueOf(aVar2 != null ? aVar2.m54762f() : null);
            int iHashCode2 = strValueOf2.hashCode();
            if (iHashCode2 == -1301121252 ? !strValueOf2.equals(ProductCategory.Promo_premiumUpgradeToUltra) : iHashCode2 == -435036897 ? !strValueOf2.equals(ProductCategory.tttUltraPremium) : !(iHashCode2 == 1916885208 && strValueOf2.equals(ProductCategory.tttPremiumUpgradeToUltra))) {
                int color11 = Color.parseColor("#99EDD7A3");
                int color12 = Color.parseColor("#99EDD7A3");
                int color13 = Color.parseColor("#99EDD7A3");
                int color14 = Color.parseColor("#BE8B13");
                int color15 = Color.parseColor(Constants.BLACK);
                int color16 = Color.parseColor("#66FFE7AA");
                i = jbc0.f119804w;
                i2 = jbc0.f119395S2;
                color = color16;
                color2 = color11;
                color3 = color14;
                color4 = color13;
                color5 = color12;
                color6 = color15;
            } else {
                int color17 = Color.parseColor("#CCF9E7FF");
                color5 = Color.parseColor("#CCF9E7FF");
                int color18 = Color.parseColor("#CCF9E7FF");
                color3 = Color.parseColor("#B05BCE");
                color6 = Color.parseColor("#CC000000");
                color = Color.parseColor("#66F9E7FF");
                i = jbc0.f119832y;
                i2 = jbc0.f119382R2;
                color4 = color18;
                color2 = color17;
            }
        }
        get_border_count().setTextColor(color5);
        get_border_unit().setTextColor(color4);
        get_border_top_price().setTextColor(color2);
        get_border_hot_tag().setBackgroundResource(i);
        get_border_hot_tag().setTextColor(color6);
        get_border_origin_price().setTextColor(color);
        get_border_ll_select_label().setTextColor(color3);
        get_border_ll_select_icon().setImageResource(i2);
        C8928d.a aVar3 = this.detail;
        String strValueOf3 = String.valueOf(aVar3 != null ? aVar3.m54762f() : null);
        int iHashCode3 = strValueOf3.hashCode();
        if (iHashCode3 == -1301121252 ? !strValueOf3.equals(ProductCategory.Promo_premiumUpgradeToUltra) : iHashCode3 == -435036897 ? !strValueOf3.equals(ProductCategory.tttUltraPremium) : !(iHashCode3 == 1916885208 && strValueOf3.equals(ProductCategory.tttPremiumUpgradeToUltra))) {
            if (select) {
                i3 = jbc0.f119611i2;
                i4 = jbc0.f119354P1;
            } else {
                i3 = jbc0.f119625j2;
                i4 = jbc0.f119677mc;
            }
        } else if (select) {
            i3 = jbc0.f119639k2;
            i4 = jbc0.f119472Y1;
        } else {
            i3 = jbc0.f119653l2;
            i4 = jbc0.f119677mc;
        }
        get_border().setBackgroundResource(i3);
        VText vText = get_border_count();
        C8928d.a aVar4 = this.detail;
        vText.setText(String.valueOf(aVar4 != null ? Integer.valueOf(aVar4.m54788w()) : null));
        VText vText2 = get_border_unit();
        C8928d.a aVar5 = this.detail;
        vText2.setText(aVar5 != null ? aVar5.m54789x() : null);
        VText_AutoFit vText_AutoFit = get_border_top_price();
        C8928d.a aVar6 = this.detail;
        vText_AutoFit.setText(aVar6 != null ? aVar6.m54764g() : null);
        this.numberFormat.setMaximumFractionDigits(2);
        VText_AutoFit vText_AutoFit2 = get_border_origin_price();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        C8928d.a aVar7 = this.detail;
        String strM54766h = aVar7 != null ? aVar7.m54766h() : null;
        NumberFormat numberFormat = this.numberFormat;
        C8928d.a aVar8 = this.detail;
        if (aVar8 == null || (strM54772k = aVar8.m54772k()) == null) {
            dValueOf = null;
        } else {
            double d = Double.parseDouble(strM54772k);
            C8928d.a aVar9 = this.detail;
            Integer numValueOf = aVar9 != null ? Integer.valueOf(aVar9.m54788w()) : null;
            numValueOf.getClass();
            dValueOf = Double.valueOf(d * ((double) numValueOf.intValue()));
        }
        vText_AutoFit2.setText(String.format("%s %s", Arrays.copyOf(new Object[]{strM54766h, numberFormat.format(dValueOf)}, 2)));
        get_border_origin_price().setPaintFlags(get_border_origin_price().getPaintFlags() | 16);
        get_border_center_price_bg().setBackgroundResource(i4);
        C8928d.a aVar10 = this.detail;
        String strValueOf4 = String.valueOf(aVar10 != null ? aVar10.m54762f() : null);
        if ((Intrinsics.m88377d(ProductCategory.tttUltraPremium, strValueOf4) || Intrinsics.m88377d(ProductCategory.tttPremiumUpgradeToUltra, strValueOf4) || Intrinsics.m88377d(ProductCategory.Promo_premiumUpgradeToUltra, strValueOf4)) && CoreModule.f18264c.f20311G2.m153652j3()) {
            bnl0.m105515H0(get_border_hot_tag(), getContext().getString(R$string.f27953B3));
        } else {
            bnl0.m105515H0(get_border_hot_tag(), getContext().getString(R$string.f28339j6));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m55581f(@NotNull final PurchaseType type, boolean select, @Nullable final List<? extends C8928d> sections, @NotNull final a30<Boolean, C8928d, Boolean> selectAction) {
        type.getClass();
        selectAction.getClass();
        if (jyb.m147479J(sections)) {
            return;
        }
        bnl0.m105524M(get_border_hot_tag(), true);
        get_border_count().setTypeface(lyh0.m156283c(3), 1);
        get_border_unit().setTypeface(lyh0.m156283c(3), 1);
        get_border_hot_tag().setTypeface(lyh0.m156283c(3), 1);
        sections.getClass();
        for (C8928d c8928d : sections) {
            if (c8928d.m54713l()) {
                this.section = c8928d;
                C8928d.a aVarM54705d = c8928d.m54705d();
                if (aVarM54705d == null) {
                    aVarM54705d = c8928d.m54703b();
                }
                this.detail = aVarM54705d;
            }
        }
        if (this.detail == null) {
            return;
        }
        if (sections.size() == 1) {
            bnl0.m105524M(get_border_ll_select(), false);
        } else {
            bnl0.m105524M(get_border_ll_select(), true);
            bnl0.m105509E0(get_border_center_price_bg(), new View.OnClickListener() { // from class: l.gee0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ScrollerGPUpgradePurchaseSectionView.m55576b(this.f103817a, selectAction, type, sections, view);
                }
            });
        }
        m55580e(select);
    }

    @Nullable
    public final C8928d.a getDetail() {
        return this.detail;
    }

    @Nullable
    public final bmp getDialog() {
        return this.dialog;
    }

    @NotNull
    public final NumberFormat getNumberFormat() {
        return this.numberFormat;
    }

    @Nullable
    public final C8928d getSection() {
        return this.section;
    }

    @NotNull
    public final ConstraintLayout get_border() {
        ConstraintLayout constraintLayout = this._border;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_border");
        return null;
    }

    @NotNull
    public final View get_border_center_price_bg() {
        View view = this._border_center_price_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_border_center_price_bg");
        return null;
    }

    @NotNull
    public final VText get_border_count() {
        VText vText = this._border_count;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_border_count");
        return null;
    }

    @NotNull
    public final VText get_border_hot_tag() {
        VText vText = this._border_hot_tag;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_border_hot_tag");
        return null;
    }

    @NotNull
    public final VLinear get_border_ll_select() {
        VLinear vLinear = this._border_ll_select;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_border_ll_select");
        return null;
    }

    @NotNull
    public final VImage get_border_ll_select_icon() {
        VImage vImage = this._border_ll_select_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_border_ll_select_icon");
        return null;
    }

    @NotNull
    public final VText get_border_ll_select_label() {
        VText vText = this._border_ll_select_label;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_border_ll_select_label");
        return null;
    }

    @NotNull
    public final VText_AutoFit get_border_origin_price() {
        VText_AutoFit vText_AutoFit = this._border_origin_price;
        if (vText_AutoFit != null) {
            return vText_AutoFit;
        }
        Intrinsics.m88391r("_border_origin_price");
        return null;
    }

    @NotNull
    public final VImage get_border_select_img() {
        VImage vImage = this._border_select_img;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_border_select_img");
        return null;
    }

    @NotNull
    public final VText_AutoFit get_border_top_price() {
        VText_AutoFit vText_AutoFit = this._border_top_price;
        if (vText_AutoFit != null) {
            return vText_AutoFit;
        }
        Intrinsics.m88391r("_border_top_price");
        return null;
    }

    @NotNull
    public final VText get_border_unit() {
        VText vText = this._border_unit;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_border_unit");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55578c(this);
    }

    public final void setDetail(@Nullable C8928d.a aVar) {
        this.detail = aVar;
    }

    public final void setDialog(@Nullable bmp bmpVar) {
        this.dialog = bmpVar;
    }

    public final void setSection(@Nullable C8928d c8928d) {
        this.section = c8928d;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    public final void set_border(@NotNull ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this._border = constraintLayout;
    }

    public final void set_border_center_price_bg(@NotNull View view) {
        view.getClass();
        this._border_center_price_bg = view;
    }

    public final void set_border_count(@NotNull VText vText) {
        vText.getClass();
        this._border_count = vText;
    }

    public final void set_border_hot_tag(@NotNull VText vText) {
        vText.getClass();
        this._border_hot_tag = vText;
    }

    public final void set_border_ll_select(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._border_ll_select = vLinear;
    }

    public final void set_border_ll_select_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._border_ll_select_icon = vImage;
    }

    public final void set_border_ll_select_label(@NotNull VText vText) {
        vText.getClass();
        this._border_ll_select_label = vText;
    }

    public final void set_border_origin_price(@NotNull VText_AutoFit vText_AutoFit) {
        vText_AutoFit.getClass();
        this._border_origin_price = vText_AutoFit;
    }

    public final void set_border_select_img(@NotNull VImage vImage) {
        vImage.getClass();
        this._border_select_img = vImage;
    }

    public final void set_border_top_price(@NotNull VText_AutoFit vText_AutoFit) {
        vText_AutoFit.getClass();
        this._border_top_price = vText_AutoFit;
    }

    public final void set_border_unit(@NotNull VText vText) {
        vText.getClass();
        this._border_unit = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollerGPUpgradePurchaseSectionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.getClass();
        this.numberFormat = numberInstance;
    }
}
