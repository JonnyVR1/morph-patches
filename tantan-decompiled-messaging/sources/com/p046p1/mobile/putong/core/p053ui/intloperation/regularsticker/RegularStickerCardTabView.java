package com.p046p1.mobile.putong.core.p053ui.intloperation.regularsticker;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.p046p1.mobile.putong.core.data.SamesCardData;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p149l.qib0;
import p149l.tnc0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/regularsticker/RegularStickerCardTabView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/SamesCardData;", "samesCardData", "b", "(Lcom/p1/mobile/putong/core/data/SamesCardData;)V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Lcom/google/android/material/card/MaterialCardView;", "Lcom/google/android/material/card/MaterialCardView;", "get_card", "()Lcom/google/android/material/card/MaterialCardView;", "set_card", "(Lcom/google/android/material/card/MaterialCardView;)V", "_card", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_card_title", "()Landroid/widget/TextView;", "set_card_title", "(Landroid/widget/TextView;)V", "_card_title", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class RegularStickerCardTabView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public MaterialCardView _card;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _card_title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularStickerCardTabView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m46343a(View view) {
        tnc0.m189772a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m46344b(@NotNull SamesCardData samesCardData) {
        samesCardData.getClass();
        try {
            if (!TextUtils.isEmpty(samesCardData.bg_border_color)) {
                get_card().setStrokeColor(Color.parseColor(samesCardData.bg_border_color));
            }
            if (!TextUtils.isEmpty(samesCardData.bg_color)) {
                get_card().setCardBackgroundColor(Color.parseColor(samesCardData.bg_color));
            }
            if (!TextUtils.isEmpty(samesCardData.font_color)) {
                get_card_title().setTextColor(Color.parseColor(samesCardData.font_color));
            }
            if (!TextUtils.isEmpty(samesCardData.icon_url)) {
                qib0.f154691G.m102337O0(get_image(), samesCardData.icon_url, true, false, null, null);
            }
            get_card_title().setText(samesCardData.desc);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    @NotNull
    public final MaterialCardView get_card() {
        MaterialCardView materialCardView = this._card;
        if (materialCardView != null) {
            return materialCardView;
        }
        Intrinsics.m87502r("_card");
        return null;
    }

    @NotNull
    public final TextView get_card_title() {
        TextView textView = this._card_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_card_title");
        return null;
    }

    @NotNull
    public final VDraweeView get_image() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_image");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46343a(this);
    }

    public final void set_card(@NotNull MaterialCardView materialCardView) {
        materialCardView.getClass();
        this._card = materialCardView;
    }

    public final void set_card_title(@NotNull TextView textView) {
        textView.getClass();
        this._card_title = textView;
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularStickerCardTabView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularStickerCardTabView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularStickerCardTabView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
    }
}
