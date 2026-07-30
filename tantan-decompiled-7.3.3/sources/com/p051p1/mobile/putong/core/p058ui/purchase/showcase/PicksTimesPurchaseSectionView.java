package com.p051p1.mobile.putong.core.p058ui.purchase.showcase;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p151v.VText_AutoFit;
import p153l.gta;
import p153l.jbc0;
import p153l.jyb;
import p153l.ro70;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010A\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u00100\u001a\u0004\b?\u00102\"\u0004\b@\u00104¨\u0006B"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/showcase/PicksTimesPurchaseSectionView;", "Lcom/p1/mobile/putong/core/ui/purchase/showcase/AnimBorderSectionView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "", "select", "autoRenew", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "a", "(ZZLcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "", "Landroid/view/View;", "getAnimBackgroundList", "()Ljava/util/List;", OMSTemplateModeType.view, "c", "(Landroid/view/View;)V", "Landroid/widget/LinearLayout;", "b", "Landroid/widget/LinearLayout;", "get_border", "()Landroid/widget/LinearLayout;", "set_border", "(Landroid/widget/LinearLayout;)V", "_border", "Lv/VText;", "Lv/VText;", "get_count", "()Lv/VText;", "set_count", "(Lv/VText;)V", "_count", Constants.INAPP_DATA_TAG, "get_info", "set_info", "_info", "Lv/VText_AutoFit;", "e", "Lv/VText_AutoFit;", "get_top_price", "()Lv/VText_AutoFit;", "set_top_price", "(Lv/VText_AutoFit;)V", "_top_price", "Landroid/widget/FrameLayout;", "f", "Landroid/widget/FrameLayout;", "get_bottom_bg", "()Landroid/widget/FrameLayout;", "set_bottom_bg", "(Landroid/widget/FrameLayout;)V", "_bottom_bg", "g", "get_bottom_price", "set_bottom_price", "_bottom_price", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PicksTimesPurchaseSectionView extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public LinearLayout _border;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _count;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _info;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText_AutoFit _top_price;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public FrameLayout _bottom_bg;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText_AutoFit _bottom_price;

    public /* synthetic */ PicksTimesPurchaseSectionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo55507a(boolean select, boolean autoRenew, @Nullable C8928d.a detail) {
        get_count().setText(String.valueOf(detail != null ? Integer.valueOf(detail.m54788w()) : null));
        get_top_price().setText(detail != null ? detail.m54791z() : null);
        get_bottom_price().setText(detail != null ? detail.m54760e() : null);
        if (select) {
            get_border().setBackgroundResource(jbc0.f119330N5);
            get_count().setTextColor(Color.parseColor("#252525"));
            get_top_price().setTextColor(Color.parseColor("#F27310"));
            get_info().setTextColor(Color.parseColor("#252525"));
            get_bottom_price().setTextColor(Color.parseColor("#ffffff"));
            get_bottom_bg().setBackgroundResource(jbc0.f119344O5);
        } else {
            get_border().setBackgroundResource(jbc0.f119370Q3);
            get_count().setTextColor(Color.parseColor("#80000000"));
            get_info().setTextColor(Color.parseColor("#80000000"));
            get_top_price().setTextColor(Color.parseColor("#80F27310"));
            get_bottom_price().setTextColor(Color.parseColor("#80F27310"));
            get_bottom_bg().setBackgroundResource(0);
        }
        if (gta.m132210e().m132214d().mo34719Lc()) {
            get_info().setText("精选");
        } else {
            get_info().setText("心动");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m55569c(View view) {
        ro70.m182360a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AnimBorderSectionView
    @NotNull
    public List<View> getAnimBackgroundList() {
        ArrayList arrayListM147507f0 = jyb.m147507f0(get_border(), get_bottom_bg());
        arrayListM147507f0.getClass();
        return arrayListM147507f0;
    }

    @NotNull
    public final LinearLayout get_border() {
        LinearLayout linearLayout = this._border;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_border");
        return null;
    }

    @NotNull
    public final FrameLayout get_bottom_bg() {
        FrameLayout frameLayout = this._bottom_bg;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_bottom_bg");
        return null;
    }

    @NotNull
    public final VText_AutoFit get_bottom_price() {
        VText_AutoFit vText_AutoFit = this._bottom_price;
        if (vText_AutoFit != null) {
            return vText_AutoFit;
        }
        Intrinsics.m88391r("_bottom_price");
        return null;
    }

    @NotNull
    public final VText get_count() {
        VText vText = this._count;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_count");
        return null;
    }

    @NotNull
    public final VText get_info() {
        VText vText = this._info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_info");
        return null;
    }

    @NotNull
    public final VText_AutoFit get_top_price() {
        VText_AutoFit vText_AutoFit = this._top_price;
        if (vText_AutoFit != null) {
            return vText_AutoFit;
        }
        Intrinsics.m88391r("_top_price");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55569c(this);
    }

    public final void set_border(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._border = linearLayout;
    }

    public final void set_bottom_bg(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._bottom_bg = frameLayout;
    }

    public final void set_bottom_price(@NotNull VText_AutoFit vText_AutoFit) {
        vText_AutoFit.getClass();
        this._bottom_price = vText_AutoFit;
    }

    public final void set_count(@NotNull VText vText) {
        vText.getClass();
        this._count = vText;
    }

    public final void set_info(@NotNull VText vText) {
        vText.getClass();
        this._info = vText;
    }

    public final void set_top_price(@NotNull VText_AutoFit vText_AutoFit) {
        vText_AutoFit.getClass();
        this._top_price = vText_AutoFit;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksTimesPurchaseSectionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksTimesPurchaseSectionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksTimesPurchaseSectionView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
