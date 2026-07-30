package com.p000p1.mobile.putong.core.p004ui.purchase.showcase;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.a6e0;
import l.d3c0;
import l.eqh0;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.ura;
import v.VImage;
import v.VText;
import v.VText_AutoFit;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010 \u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00103\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00106\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\"\u0010=\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010?\u001a\u0004\bN\u0010A\"\u0004\bO\u0010CR\"\u0010T\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010A\"\u0004\bS\u0010CR\"\u0010Z\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010\rR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010f\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010?\u001a\u0004\bd\u0010A\"\u0004\be\u0010C¨\u0006g"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/showcase/ScrollerGPPurchaseSectionView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "", "c", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Z", "onFinishInflate", "()V", "visible", "", "priceStr", "e", "(ZLjava/lang/String;)V", "select", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "isHot", "showWeeklyBoostTip", "boostPriceStr", "d", "(ZLcom/p1/mobile/putong/core/ui/purchase/d$a;ZZLjava/lang/String;)V", "", "margin", "b", "(I)V", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "get_boost_tip_container", "()Landroid/widget/LinearLayout;", "set_boost_tip_container", "(Landroid/widget/LinearLayout;)V", "_boost_tip_container", "Lv/VText_NoTopPadding;", "Lv/VText_NoTopPadding;", "get_boost_tip_text", "()Lv/VText_NoTopPadding;", "set_boost_tip_text", "(Lv/VText_NoTopPadding;)V", "_boost_tip_text", "get_boost_tip_price", "set_boost_tip_price", "_boost_tip_price", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_border", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_border", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_border", "Lv/VText;", "Lv/VText;", "get_border_hot_tag", "()Lv/VText;", "set_border_hot_tag", "(Lv/VText;)V", "_border_hot_tag", "Lv/VImage;", "f", "Lv/VImage;", "get_border_select_img", "()Lv/VImage;", "set_border_select_img", "(Lv/VImage;)V", "_border_select_img", "g", "get_border_count", "set_border_count", "_border_count", "h", "get_border_unit", "set_border_unit", "_border_unit", "i", "Landroid/view/View;", "get_border_center_price_bg", "()Landroid/view/View;", "set_border_center_price_bg", "_border_center_price_bg", "Lv/VText_AutoFit;", "j", "Lv/VText_AutoFit;", "get_border_top_price", "()Lv/VText_AutoFit;", "set_border_top_price", "(Lv/VText_AutoFit;)V", "_border_top_price", "k", "get_border_label", "set_border_label", "_border_label", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScrollerGPPurchaseSectionView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public LinearLayout _boost_tip_container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText_NoTopPadding _boost_tip_text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText_NoTopPadding _boost_tip_price;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ConstraintLayout _border;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _border_hot_tag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _border_select_img;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _border_count;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _border_unit;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public View _border_center_price_bg;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText_AutoFit _border_top_price;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _border_label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollerGPPurchaseSectionView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m7722a(View view) {
        a6e0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m7723b(int margin) {
        ConstraintLayout.a layoutParams = get_border_count().getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.a aVar = layoutParams;
        aVar.u = margin;
        get_border_count().setLayoutParams(aVar);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7724c(Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        if (!CoreModule.f1534c.f3643j0.m2536T4() || !CoreModule.f1534c.f3685x0.m2116P3() || merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || stockKeepUnit.affiliateProducts == null || CoreModule.f1534c.f3643j0.m2504C4() == null) {
            return false;
        }
        String str = merchandise.defaultStockKeepUnit.affiliateProducts.googleplay;
        str.getClass();
        String str2 = CoreModule.f1534c.f3643j0.m2504C4().skuId;
        str2.getClass();
        return Intrinsics.d(str2, str);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0139  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:92:0x028b  */
    /* JADX INFO: renamed from: d */
    public final void m7725d(boolean select, @NotNull d.a detail, boolean isHot, boolean showWeeklyBoostTip, @NotNull String boostPriceStr) {
        int color;
        int color2;
        int color3;
        int color4;
        int color5;
        int i;
        int color6;
        int i2;
        int i3;
        d.a aVar;
        int color7;
        int color8;
        int color9;
        int i4;
        detail.getClass();
        boostPriceStr.getClass();
        Merchandise merchandiseS = detail.s();
        boolean z = merchandiseS != null && merchandiseS.weekly();
        boolean z2 = (isHot || z || !detail.D()) ? false : true;
        xdl0.M(get_border_hot_tag(), isHot || z2);
        xdl0.M(get_border_label(), (detail.w() == 1 && TextUtils.isEmpty(detail.r())) ? false : true);
        if (!TextUtils.isEmpty(detail.r()) && detail.w() == 1 && CoreModule.f1534c.f3643j0.m2532Q4()) {
            xdl0.M(get_border_label(), false);
        }
        get_border_count().setTypeface(eqh0.c(2), 1);
        get_border_unit().setTypeface(eqh0.c(2), 1);
        get_border_top_price().setTypeface(eqh0.c(2), 1);
        get_border_hot_tag().setTypeface(eqh0.c(2), 1);
        xdl0.M(get_border_select_img(), select);
        if (select) {
            xdl0.U(get_border_top_price(), 0);
            m7723b(t100.d(19.0f));
            int i5 = d3c0.W2;
            String string = detail.f().toString();
            int iHashCode = string.hashCode();
            if (iHashCode != -863315575) {
                if (iHashCode != -435036897) {
                    if (iHashCode == 219393643 && string.equals("tttSvipGoogleplay")) {
                        color = Color.parseColor("#000000");
                        color7 = Color.parseColor("#EDD7A3");
                        color8 = Color.parseColor("#EDD7A3");
                        color4 = Color.parseColor("#BE8B13");
                        color9 = Color.parseColor("#CC000000");
                        i4 = d3c0.v2;
                        i = d3c0.v;
                        int i6 = color7;
                        color3 = color8;
                        i5 = i4;
                        color5 = color9;
                        color2 = i6;
                    } else {
                        color = Color.parseColor("#edd7a3");
                        color2 = Color.parseColor("#edd7a3");
                        color3 = Color.parseColor("#69edd7a3");
                        color4 = Color.parseColor("#BE8B13");
                        color5 = Color.parseColor("#CC000000");
                        i = d3c0.z;
                    }
                } else if (string.equals("tttUltraPremium")) {
                    color = Color.parseColor("#000000");
                    color7 = Color.parseColor("#F9E7FF");
                    color8 = Color.parseColor("#F9E7FF");
                    color4 = Color.parseColor("#A972BC");
                    color9 = Color.parseColor("#CC000000");
                    i4 = d3c0.w2;
                    i = d3c0.x;
                    int i7 = color7;
                    color3 = color8;
                    i5 = i4;
                    color5 = color9;
                    color2 = i7;
                } else {
                    color = Color.parseColor("#edd7a3");
                    color2 = Color.parseColor("#edd7a3");
                    color3 = Color.parseColor("#69edd7a3");
                    color4 = Color.parseColor("#BE8B13");
                    color5 = Color.parseColor("#CC000000");
                    i = d3c0.z;
                }
            } else if (string.equals("tttVip")) {
                color = Color.parseColor("#000000");
                color7 = Color.parseColor("#000000");
                color8 = Color.parseColor("#000000");
                color4 = Color.parseColor("#D29F07");
                color9 = Color.parseColor("#CC000000");
                i4 = d3c0.W2;
                i = d3c0.z;
                int i8 = color7;
                color3 = color8;
                i5 = i4;
                color5 = color9;
                color2 = i8;
            } else {
                color = Color.parseColor("#edd7a3");
                color2 = Color.parseColor("#edd7a3");
                color3 = Color.parseColor("#69edd7a3");
                color4 = Color.parseColor("#BE8B13");
                color5 = Color.parseColor("#CC000000");
                i = d3c0.z;
            }
            VImage vImage = get_border_select_img();
            vImage.getClass();
            vImage.setImageResource(i5);
        } else {
            xdl0.U(get_border_top_price(), t100.c);
            m7723b(t100.d(25.0f));
            String string2 = detail.f().toString();
            int iHashCode2 = string2.hashCode();
            if (iHashCode2 != -863315575) {
                if (iHashCode2 != -435036897) {
                    if (iHashCode2 == 219393643 && string2.equals("tttSvipGoogleplay")) {
                        color6 = Color.parseColor("#CCEDD7A3");
                        color2 = Color.parseColor("#CCEDD7A3");
                        color3 = Color.parseColor("#CCEDD7A3");
                        color4 = Color.parseColor("#99EDD7A3");
                        color5 = Color.parseColor("#000000");
                        i = d3c0.w;
                        color = color6;
                    } else {
                        color = Color.parseColor("#edd7a3");
                        color2 = Color.parseColor("#edd7a3");
                        color3 = Color.parseColor("#69edd7a3");
                        color4 = Color.parseColor("#BE8B13");
                        color5 = Color.parseColor("#CC000000");
                        i = d3c0.A;
                    }
                } else if (string2.equals("tttUltraPremium")) {
                    color6 = Color.parseColor("#CCF9E7FF");
                    color2 = Color.parseColor("#CCF9E7FF");
                    color3 = Color.parseColor("#CCF9E7FF");
                    color4 = Color.parseColor("#99F9E7FF");
                    color5 = Color.parseColor("#CC000000");
                    i = d3c0.y;
                    color = color6;
                } else {
                    color = Color.parseColor("#edd7a3");
                    color2 = Color.parseColor("#edd7a3");
                    color3 = Color.parseColor("#69edd7a3");
                    color4 = Color.parseColor("#BE8B13");
                    color5 = Color.parseColor("#CC000000");
                    i = d3c0.A;
                }
            } else if (string2.equals("tttVip")) {
                color = Color.parseColor("#000000");
                color2 = Color.parseColor("#000000");
                color3 = Color.parseColor("#000000");
                color4 = Color.parseColor("#4d000000");
                color5 = Color.parseColor("#33000000");
                i = d3c0.A;
            } else {
                color = Color.parseColor("#edd7a3");
                color2 = Color.parseColor("#edd7a3");
                color3 = Color.parseColor("#69edd7a3");
                color4 = Color.parseColor("#BE8B13");
                color5 = Color.parseColor("#CC000000");
                i = d3c0.A;
            }
        }
        get_border_count().setTextColor(color2);
        get_border_unit().setTextColor(color3);
        get_border_top_price().setTextColor(color);
        get_border_label().setTextColor(color4);
        get_border_hot_tag().setBackgroundResource(i);
        get_border_hot_tag().setTextColor(color5);
        String string3 = detail.f().toString();
        int iHashCode3 = string3.hashCode();
        if (iHashCode3 != -863315575) {
            if (iHashCode3 != -435036897) {
                if (iHashCode3 != 219393643 || !string3.equals("tttSvipGoogleplay")) {
                    i2 = 0;
                    i3 = 0;
                } else if (select) {
                    i2 = d3c0.i2;
                    i3 = d3c0.P1;
                } else {
                    i2 = d3c0.j2;
                    i3 = d3c0.mc;
                }
            } else if (!string3.equals("tttUltraPremium")) {
                i2 = 0;
                i3 = 0;
            } else if (select) {
                i2 = d3c0.k2;
                i3 = d3c0.Y1;
            } else {
                i2 = d3c0.l2;
                i3 = d3c0.mc;
            }
        } else if (!string3.equals("tttVip")) {
            i2 = 0;
            i3 = 0;
        } else if (select) {
            i2 = d3c0.m2;
            i3 = d3c0.Z1;
        } else {
            i2 = d3c0.h2;
            i3 = d3c0.mc;
        }
        get_border().setBackgroundResource(i2);
        if (ura.m25555e().m25559d().m5681Qq() && TextUtils.equals(detail.r(), getContext().getString(R.string.P3))) {
            aVar = detail;
            aVar.e0("");
        } else {
            aVar = detail;
        }
        get_border_label().setText(aVar.r());
        get_border_count().setText(String.valueOf(aVar.w()));
        get_border_unit().setText(aVar.x());
        get_border_top_price().setText(aVar.z());
        get_border_center_price_bg().setBackgroundResource(i3);
        VText vText = get_border_hot_tag();
        String string4 = "HOT";
        if (!isHot && z2) {
            string4 = getContext().getString(R.string.K3);
            string4.getClass();
        }
        vText.setText(string4);
        if (m7724c(aVar.s())) {
            get_border_hot_tag().setText(App.e.getString(R.string.B3));
            get_border_label().setTextColor(Color.parseColor("#F15645"));
        }
        if (CoreModule.f1534c.f3685x0.m2132m4(aVar.s())) {
            get_border_hot_tag().setText(CoreModule.f1534c.f3685x0.m2123c4() ? getContext().getString(R.string.P3) : getContext().getString(R.string.A2));
            get_border_label().setTextColor(Color.parseColor("#F15645"));
        }
        m7726e(select && z && showWeeklyBoostTip, boostPriceStr);
    }

    /* JADX INFO: renamed from: e */
    public final void m7726e(boolean visible, @NotNull String priceStr) {
        priceStr.getClass();
        xdl0.M(get_boost_tip_container(), visible);
        if (visible) {
            get_boost_tip_text().setText(IntlCountryCodeController.m21v() ? R.string.C6 : R.string.B6);
            boolean z = priceStr.length() > 0;
            xdl0.M(get_boost_tip_price(), z);
            if (z) {
                get_boost_tip_price().setText(priceStr);
                get_boost_tip_price().setPaintFlags(get_boost_tip_price().getPaintFlags() | 16);
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = t100.d(visible ? 200.0f : 160.0f);
        setLayoutParams(layoutParams);
    }

    @NotNull
    public final LinearLayout get_boost_tip_container() {
        LinearLayout linearLayout = this._boost_tip_container;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_boost_tip_container");
        return null;
    }

    @NotNull
    public final VText_NoTopPadding get_boost_tip_price() {
        VText_NoTopPadding vText_NoTopPadding = this._boost_tip_price;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.r("_boost_tip_price");
        return null;
    }

    @NotNull
    public final VText_NoTopPadding get_boost_tip_text() {
        VText_NoTopPadding vText_NoTopPadding = this._boost_tip_text;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.r("_boost_tip_text");
        return null;
    }

    @NotNull
    public final ConstraintLayout get_border() {
        ConstraintLayout constraintLayout = this._border;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_border");
        return null;
    }

    @NotNull
    public final View get_border_center_price_bg() {
        View view = this._border_center_price_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_border_center_price_bg");
        return null;
    }

    @NotNull
    public final VText get_border_count() {
        VText vText = this._border_count;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_border_count");
        return null;
    }

    @NotNull
    public final VText get_border_hot_tag() {
        VText vText = this._border_hot_tag;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_border_hot_tag");
        return null;
    }

    @NotNull
    public final VText get_border_label() {
        VText vText = this._border_label;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_border_label");
        return null;
    }

    @NotNull
    public final VImage get_border_select_img() {
        VImage vImage = this._border_select_img;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_border_select_img");
        return null;
    }

    @NotNull
    public final VText_AutoFit get_border_top_price() {
        VText_AutoFit vText_AutoFit = this._border_top_price;
        if (vText_AutoFit != null) {
            return vText_AutoFit;
        }
        Intrinsics.r("_border_top_price");
        return null;
    }

    @NotNull
    public final VText get_border_unit() {
        VText vText = this._border_unit;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_border_unit");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7722a(this);
    }

    public final void set_boost_tip_container(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._boost_tip_container = linearLayout;
    }

    public final void set_boost_tip_price(@NotNull VText_NoTopPadding vText_NoTopPadding) {
        vText_NoTopPadding.getClass();
        this._boost_tip_price = vText_NoTopPadding;
    }

    public final void set_boost_tip_text(@NotNull VText_NoTopPadding vText_NoTopPadding) {
        vText_NoTopPadding.getClass();
        this._boost_tip_text = vText_NoTopPadding;
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

    public final void set_border_label(@NotNull VText vText) {
        vText.getClass();
        this._border_label = vText;
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
    public ScrollerGPPurchaseSectionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
