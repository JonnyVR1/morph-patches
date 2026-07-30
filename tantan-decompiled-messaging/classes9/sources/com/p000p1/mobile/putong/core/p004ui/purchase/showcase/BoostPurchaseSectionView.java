package com.p000p1.mobile.putong.core.p004ui.purchase.showcase;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.purchase.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import l.b1c0;
import l.d3c0;
import l.eqh0;
import l.g93;
import l.gex;
import l.n6a;
import l.t100;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;
import v.VText_AutoFit;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\u001dJ)\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001eH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\"H\u0002¢\u0006\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010G\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010J\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR\"\u0010M\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010B\u001a\u0004\bK\u0010D\"\u0004\bL\u0010FR\u0016\u0010O\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010NR\u0016\u0010P\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010NR\u0016\u0010R\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010W\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010T¨\u0006X"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/showcase/BoostPurchaseSectionView;", "Lcom/p1/mobile/putong/core/ui/purchase/showcase/AnimBorderSectionView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "", "Landroid/view/View;", "getAnimBackgroundList", "()Ljava/util/List;", "", "select", "autoRenew", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "a", "(ZZLcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "view", "c", "(Landroid/view/View;)V", "j", "(Z)V", "h", "i", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;Z)V", "", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)Ljava/lang/String;", "g", "", "number", "unit", "Landroid/text/SpannableStringBuilder;", "e", "(ZILjava/lang/String;)Landroid/text/SpannableStringBuilder;", "quantity", "d", "(ZI)Landroid/text/SpannableStringBuilder;", "Landroid/widget/LinearLayout;", "b", "Landroid/widget/LinearLayout;", "get_border", "()Landroid/widget/LinearLayout;", "set_border", "(Landroid/widget/LinearLayout;)V", "_border", "Lv/VText;", "Lv/VText;", "get_quantity", "()Lv/VText;", "set_quantity", "(Lv/VText;)V", "_quantity", "Lv/VText_AutoFit;", "Lv/VText_AutoFit;", "get_describe", "()Lv/VText_AutoFit;", "set_describe", "(Lv/VText_AutoFit;)V", "_describe", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_discount_text", "()Landroid/widget/TextView;", "set_discount_text", "(Landroid/widget/TextView;)V", "_discount_text", "get_bottom_price", "set_bottom_price", "_bottom_price", "get_label", "set_label", "_label", "Z", "newCustomerPromotion", "newCustomerPromotionState", "I", "primaryColor", "k", "Landroid/text/SpannableStringBuilder;", "selectSpan", "l", "unselectSpan", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public BoostPurchaseSectionView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo7659a(boolean select, boolean autoRenew, @NotNull d.a detail) {
        detail.getClass();
        m7665g(detail, autoRenew);
        m7666h(select);
        m7667i(detail, select);
        m7668j(select);
    }

    /* JADX INFO: renamed from: c */
    public final void m7661c(View view) {
        g93.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m7662d(boolean select, int quantity) {
        int color = select ? getResources().getColor(b1c0.g) : getResources().getColor(b1c0.j);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s次", Arrays.copyOf(new Object[]{Integer.valueOf(quantity)}, 1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", select ? eqh0.c(3) : eqh0.c(2), color, t100.d(30.0f));
        CustomTypefaceSpan customTypefaceSpan2 = new CustomTypefaceSpan("sans-serif", eqh0.c(2), color, t100.d(13.0f));
        customTypefaceSpan.b(0);
        customTypefaceSpan2.b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, str.length() - 1, 33);
        spannableStringBuilder.setSpan(customTypefaceSpan2, str.length() - 1, str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e */
    public final SpannableStringBuilder m7663e(boolean select, int number, String unit) {
        int color = select ? this.primaryColor : getResources().getColor(b1c0.i);
        String strValueOf = String.valueOf(number);
        Typeface typefaceC = select ? eqh0.c(3) : eqh0.c(2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strValueOf + unit);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceC, color, select ? t100.t : t100.s);
        customTypefaceSpan.b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, strValueOf.length(), 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.c(2), color, t100.d(13.0f)), strValueOf.length(), strValueOf.length() + unit.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: f */
    public final String m7664f(d.a detail) {
        int iA = gex.a((1.0d - (detail.s().defaultStockKeepUnit.prices.unitPrice / detail.s().defaultStockKeepUnit.prices.originalUnitPrice)) * 100.0d);
        if (iA <= 1) {
            return "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("节省%s", Arrays.copyOf(new Object[]{Integer.valueOf(iA)}, 1)).concat("%");
    }

    /* JADX INFO: renamed from: g */
    public final void m7665g(d.a detail, boolean autoRenew) {
        this.newCustomerPromotionState = autoRenew && !TextUtils.isEmpty(detail.r()) && this.newCustomerPromotion;
        this.primaryColor = getResources().getColor(b1c0.D);
        int iW = detail.w();
        String strX = detail.x();
        strX.getClass();
        this.selectSpan = m7663e(true, iW, strX);
        int iW2 = detail.w();
        String strX2 = detail.x();
        strX2.getClass();
        this.unselectSpan = m7663e(false, iW2, strX2);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AnimBorderSectionView
    @NotNull
    public List<View> getAnimBackgroundList() {
        ArrayList arrayListF0 = vwb.f0(new View[]{get_border(), get_label()});
        arrayListF0.getClass();
        return arrayListF0;
    }

    @NotNull
    public final LinearLayout get_border() {
        LinearLayout linearLayout = this._border;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_border");
        return null;
    }

    @NotNull
    public final TextView get_bottom_price() {
        TextView textView = this._bottom_price;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_bottom_price");
        return null;
    }

    @NotNull
    public final VText_AutoFit get_describe() {
        VText_AutoFit vText_AutoFit = this._describe;
        if (vText_AutoFit != null) {
            return vText_AutoFit;
        }
        Intrinsics.r("_describe");
        return null;
    }

    @NotNull
    public final TextView get_discount_text() {
        TextView textView = this._discount_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_discount_text");
        return null;
    }

    @NotNull
    public final TextView get_label() {
        TextView textView = this._label;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_label");
        return null;
    }

    @NotNull
    public final VText get_quantity() {
        VText vText = this._quantity;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_quantity");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m7666h(boolean select) {
        get_label().setTextSize(12.0f);
        get_bottom_price().setTypeface(eqh0.c(2));
        get_bottom_price().setTextColor(Color.parseColor(select ? "#F27310" : "#65F27310"));
        xdl0.X(get_quantity(), t100.d(select ? 17 : 23));
        get_describe().setTextColor(select ? this.primaryColor : getResources().getColor(b1c0.i));
        xdl0.M(get_describe(), true);
        if (select) {
            get_label().setTypeface(eqh0.c(3), 1);
        } else {
            get_label().setTypeface(eqh0.c(2));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7667i(d.a detail, boolean select) {
        get_border().setBackgroundResource(select ? d3c0.T3 : d3c0.K3);
        xdl0.M(get_label(), !TextUtils.isEmpty(detail.r()) || (detail.H() && !TextUtils.isEmpty(detail.r())));
        get_label().setBackgroundResource(select ? d3c0.Y3 : d3c0.b4);
        get_label().setTextColor(select ? -1 : Color.parseColor("#66F27310"));
        get_label().setText(detail.r());
        xdl0.X(get_quantity(), t100.d(select ? 17 : 23));
        get_quantity().setText(m7662d(select, detail.s().quantity));
        get_describe().setText("加速配对");
        get_describe().setTypeface(eqh0.c(2));
        get_describe().setTextColor(select ? getResources().getColor(b1c0.g) : getResources().getColor(b1c0.j));
        String strM7664f = m7664f(detail);
        if (TextUtils.isEmpty(strM7664f)) {
            xdl0.X(get_quantity(), t100.d(select ? 23 : 29));
            xdl0.M(get_discount_text(), false);
        } else {
            get_discount_text().setText(strM7664f);
            get_discount_text().setTypeface(eqh0.c(2));
            xdl0.M(get_discount_text(), true);
        }
        TextView textView = get_bottom_price();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        textView.setText(String.format("%s%s/次", Arrays.copyOf(new Object[]{detail.h(), n6a.r0(detail.m())}, 2)));
        get_bottom_price().setTextColor(Color.parseColor(select ? "#F27310" : "#65F27310"));
        xdl0.M(get_bottom_price(), true);
    }

    /* JADX INFO: renamed from: j */
    public final void m7668j(boolean select) {
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
        m7661c(this);
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
