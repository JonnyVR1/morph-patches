package com.p046p1.mobile.putong.core.p053ui.purchase.showcase;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p147v.VText_AutoFit;
import p147v.text.CustomTypefaceSpan;
import p149l.b1c0;
import p149l.d3c0;
import p149l.eqh0;
import p149l.g93;
import p149l.gex;
import p149l.n6a;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\u001dJ)\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001eH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\"H\u0002¢\u0006\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010G\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010J\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR\"\u0010M\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010B\u001a\u0004\bK\u0010D\"\u0004\bL\u0010FR\u0016\u0010O\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010NR\u0016\u0010P\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010NR\u0016\u0010R\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010W\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010T¨\u0006X"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/showcase/BoostPurchaseSectionView;", "Lcom/p1/mobile/putong/core/ui/purchase/showcase/AnimBorderSectionView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "", "Landroid/view/View;", "getAnimBackgroundList", "()Ljava/util/List;", "", "select", "autoRenew", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "a", "(ZZLcom/p1/mobile/putong/core/ui/purchase/d$a;)V", OMSTemplateModeType.view, "c", "(Landroid/view/View;)V", "j", "(Z)V", "h", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;Z)V", "", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)Ljava/lang/String;", "g", "", "number", "unit", "Landroid/text/SpannableStringBuilder;", "e", "(ZILjava/lang/String;)Landroid/text/SpannableStringBuilder;", FirebaseAnalytics.Param.QUANTITY, Constants.INAPP_DATA_TAG, "(ZI)Landroid/text/SpannableStringBuilder;", "Landroid/widget/LinearLayout;", "b", "Landroid/widget/LinearLayout;", "get_border", "()Landroid/widget/LinearLayout;", "set_border", "(Landroid/widget/LinearLayout;)V", "_border", "Lv/VText;", "Lv/VText;", "get_quantity", "()Lv/VText;", "set_quantity", "(Lv/VText;)V", "_quantity", "Lv/VText_AutoFit;", "Lv/VText_AutoFit;", "get_describe", "()Lv/VText_AutoFit;", "set_describe", "(Lv/VText_AutoFit;)V", "_describe", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_discount_text", "()Landroid/widget/TextView;", "set_discount_text", "(Landroid/widget/TextView;)V", "_discount_text", "get_bottom_price", "set_bottom_price", "_bottom_price", "get_label", "set_label", "_label", "Z", "newCustomerPromotion", "newCustomerPromotionState", "I", "primaryColor", "k", "Landroid/text/SpannableStringBuilder;", "selectSpan", BLiveStormDanmakuGiftResourceType.f44444l, "unselectSpan", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class BoostPurchaseSectionView extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public LinearLayout _border;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _quantity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText_AutoFit _describe;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _discount_text;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _bottom_price;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _label;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean newCustomerPromotion;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean newCustomerPromotionState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int primaryColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public SpannableStringBuilder selectSpan;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public SpannableStringBuilder unselectSpan;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BoostPurchaseSectionView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo54324a(boolean select, boolean autoRenew, @NotNull C8765d.a detail) {
        detail.getClass();
        m54330g(detail, autoRenew);
        m54331h(select);
        m54332i(detail, select);
        m54333j(select);
    }

    /* JADX INFO: renamed from: c */
    public final void m54326c(View view) {
        g93.m124776a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m54327d(boolean select, int quantity) {
        int color = select ? getResources().getColor(b1c0.f72549g) : getResources().getColor(b1c0.f72555j);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s次", Arrays.copyOf(new Object[]{Integer.valueOf(quantity)}, 1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", select ? eqh0.m117752c(3) : eqh0.m117752c(2), color, t100.m186890d(30.0f));
        CustomTypefaceSpan customTypefaceSpan2 = new CustomTypefaceSpan("sans-serif", eqh0.m117752c(2), color, t100.m186890d(13.0f));
        customTypefaceSpan.m223785b(0);
        customTypefaceSpan2.m223785b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, str.length() - 1, 33);
        spannableStringBuilder.setSpan(customTypefaceSpan2, str.length() - 1, str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e */
    public final SpannableStringBuilder m54328e(boolean select, int number, String unit) {
        int color = select ? this.primaryColor : getResources().getColor(b1c0.f72553i);
        String strValueOf = String.valueOf(number);
        Typeface typefaceM117752c = select ? eqh0.m117752c(3) : eqh0.m117752c(2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strValueOf + unit);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceM117752c, color, select ? t100.f167271t : t100.f167270s);
        customTypefaceSpan.m223785b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, strValueOf.length(), 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.m117752c(2), color, t100.m186890d(13.0f)), strValueOf.length(), strValueOf.length() + unit.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: f */
    public final String m54329f(C8765d.a detail) {
        int iM125858a = gex.m125858a((1.0d - (detail.m53601s().defaultStockKeepUnit.prices.unitPrice / detail.m53601s().defaultStockKeepUnit.prices.originalUnitPrice)) * 100.0d);
        if (iM125858a <= 1) {
            return "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("节省%s", Arrays.copyOf(new Object[]{Integer.valueOf(iM125858a)}, 1)).concat("%");
    }

    /* JADX INFO: renamed from: g */
    public final void m54330g(C8765d.a detail, boolean autoRenew) {
        this.newCustomerPromotionState = autoRenew && !TextUtils.isEmpty(detail.m53600r()) && this.newCustomerPromotion;
        this.primaryColor = getResources().getColor(b1c0.f72514D);
        int iM53605w = detail.m53605w();
        String strM53606x = detail.m53606x();
        strM53606x.getClass();
        this.selectSpan = m54328e(true, iM53605w, strM53606x);
        int iM53605w2 = detail.m53605w();
        String strM53606x2 = detail.m53606x();
        strM53606x2.getClass();
        this.unselectSpan = m54328e(false, iM53605w2, strM53606x2);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AnimBorderSectionView
    @NotNull
    public List<View> getAnimBackgroundList() {
        ArrayList arrayListM200324f0 = vwb.m200324f0(get_border(), get_label());
        arrayListM200324f0.getClass();
        return arrayListM200324f0;
    }

    @NotNull
    public final LinearLayout get_border() {
        LinearLayout linearLayout = this._border;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_border");
        return null;
    }

    @NotNull
    public final TextView get_bottom_price() {
        TextView textView = this._bottom_price;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_bottom_price");
        return null;
    }

    @NotNull
    public final VText_AutoFit get_describe() {
        VText_AutoFit vText_AutoFit = this._describe;
        if (vText_AutoFit != null) {
            return vText_AutoFit;
        }
        Intrinsics.m87502r("_describe");
        return null;
    }

    @NotNull
    public final TextView get_discount_text() {
        TextView textView = this._discount_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_discount_text");
        return null;
    }

    @NotNull
    public final TextView get_label() {
        TextView textView = this._label;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_label");
        return null;
    }

    @NotNull
    public final VText get_quantity() {
        VText vText = this._quantity;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_quantity");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m54331h(boolean select) {
        get_label().setTextSize(12.0f);
        get_bottom_price().setTypeface(eqh0.m117752c(2));
        get_bottom_price().setTextColor(Color.parseColor(select ? "#F27310" : "#65F27310"));
        xdl0.m208360X(get_quantity(), t100.m186890d(select ? 17 : 23));
        get_describe().setTextColor(select ? this.primaryColor : getResources().getColor(b1c0.f72553i));
        xdl0.m208344M(get_describe(), true);
        if (select) {
            get_label().setTypeface(eqh0.m117752c(3), 1);
        } else {
            get_label().setTypeface(eqh0.m117752c(2));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m54332i(C8765d.a detail, boolean select) {
        get_border().setBackgroundResource(select ? d3c0.f83754T3 : d3c0.f83631K3);
        xdl0.m208344M(get_label(), !TextUtils.isEmpty(detail.m53600r()) || (detail.m53552H() && !TextUtils.isEmpty(detail.m53600r())));
        get_label().setBackgroundResource(select ? d3c0.f83819Y3 : d3c0.f83860b4);
        get_label().setTextColor(select ? -1 : Color.parseColor("#66F27310"));
        get_label().setText(detail.m53600r());
        xdl0.m208360X(get_quantity(), t100.m186890d(select ? 17 : 23));
        get_quantity().setText(m54327d(select, detail.m53601s().quantity));
        get_describe().setText("加速配对");
        get_describe().setTypeface(eqh0.m117752c(2));
        get_describe().setTextColor(select ? getResources().getColor(b1c0.f72549g) : getResources().getColor(b1c0.f72555j));
        String strM54329f = m54329f(detail);
        if (TextUtils.isEmpty(strM54329f)) {
            xdl0.m208360X(get_quantity(), t100.m186890d(select ? 23 : 29));
            xdl0.m208344M(get_discount_text(), false);
        } else {
            get_discount_text().setText(strM54329f);
            get_discount_text().setTypeface(eqh0.m117752c(2));
            xdl0.m208344M(get_discount_text(), true);
        }
        TextView textView = get_bottom_price();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        textView.setText(String.format("%s%s/次", Arrays.copyOf(new Object[]{detail.m53583h(), n6a.m158030r0(detail.m53593m())}, 2)));
        get_bottom_price().setTextColor(Color.parseColor(select ? "#F27310" : "#65F27310"));
        xdl0.m208344M(get_bottom_price(), true);
    }

    /* JADX INFO: renamed from: j */
    public final void m54333j(boolean select) {
        if (select) {
            get_quantity().setScaleX(1.067f);
            get_quantity().setScaleY(1.067f);
            get_describe().setScaleX(1.083f);
            get_describe().setScaleY(1.083f);
            return;
        }
        get_quantity().setScaleX(1.0f);
        get_quantity().setScaleY(1.0f);
        get_describe().setScaleX(1.0f);
        get_describe().setScaleY(1.0f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54326c(this);
    }

    public final void set_border(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._border = linearLayout;
    }

    public final void set_bottom_price(@NotNull TextView textView) {
        textView.getClass();
        this._bottom_price = textView;
    }

    public final void set_describe(@NotNull VText_AutoFit vText_AutoFit) {
        vText_AutoFit.getClass();
        this._describe = vText_AutoFit;
    }

    public final void set_discount_text(@NotNull TextView textView) {
        textView.getClass();
        this._discount_text = textView;
    }

    public final void set_label(@NotNull TextView textView) {
        textView.getClass();
        this._label = textView;
    }

    public final void set_quantity(@NotNull VText vText) {
        vText.getClass();
        this._quantity = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BoostPurchaseSectionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ BoostPurchaseSectionView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
