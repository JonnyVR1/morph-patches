package com.p046p1.mobile.putong.core.p053ui.intloperation.regularsticker;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.p046p1.mobile.putong.core.data.IntlMarketStickerData;
import com.p046p1.mobile.putong.core.data.IntlMarketStickerOptionsData;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p149l.goc0;
import p149l.qib0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/regularsticker/RegularStickerItemView;", "Lcom/google/android/material/card/MaterialCardView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;", "baseData", "Lcom/p1/mobile/putong/core/data/IntlMarketStickerOptionsData;", "similarInterestsItemStatusData", "e", "(Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;Lcom/p1/mobile/putong/core/data/IntlMarketStickerOptionsData;)V", "Landroid/view/View;", OMSTemplateModeType.view, "b", "(Landroid/view/View;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_setting_img", "()Lv/VDraweeView;", "set_setting_img", "(Lv/VDraweeView;)V", "_setting_img", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_setting_content_title", "()Landroid/widget/TextView;", "set_setting_content_title", "(Landroid/widget/TextView;)V", "_setting_content_title", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class RegularStickerItemView extends MaterialCardView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _setting_img;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _setting_content_title;

    public RegularStickerItemView(@Nullable Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m46347b(View view) {
        goc0.m127232a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m46348e(@Nullable IntlMarketStickerData baseData, @NotNull IntlMarketStickerOptionsData similarInterestsItemStatusData) {
        similarInterestsItemStatusData.getClass();
        if (baseData != null) {
            try {
                if (!TextUtils.isEmpty(baseData.bg_color)) {
                    setCardBackgroundColor(Color.parseColor(baseData.bg_color));
                }
                if (!TextUtils.isEmpty(baseData.font_color)) {
                    get_setting_content_title().setTextColor(Color.parseColor(baseData.font_color));
                }
                if (!TextUtils.isEmpty(baseData.bg_border_color)) {
                    setStrokeColor(Color.parseColor(baseData.bg_border_color));
                }
            } catch (Exception unused) {
            }
        }
        qib0.f154691G.m102337O0(get_setting_img(), similarInterestsItemStatusData.img_url, true, false, null, null);
        get_setting_content_title().setText(similarInterestsItemStatusData.desc);
    }

    @NotNull
    public final TextView get_setting_content_title() {
        TextView textView = this._setting_content_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_setting_content_title");
        return null;
    }

    @NotNull
    public final VDraweeView get_setting_img() {
        VDraweeView vDraweeView = this._setting_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_setting_img");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46347b(this);
    }

    public final void set_setting_content_title(@NotNull TextView textView) {
        textView.getClass();
        this._setting_content_title = textView;
    }

    public final void set_setting_img(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._setting_img = vDraweeView;
    }

    public RegularStickerItemView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RegularStickerItemView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
