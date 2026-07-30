package com.p051p1.mobile.putong.core.p058ui.intloperation.regularsticker;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.IntlMarketSummaryData;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.iwc0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/regularsticker/RegularStickerHeaderItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;", "baseData", "i0", "(Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;)V", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/intloperation/regularsticker/RegularStickerHeaderItem;", "get_root_layout", "()Lcom/p1/mobile/putong/core/ui/intloperation/regularsticker/RegularStickerHeaderItem;", "set_root_layout", "(Lcom/p1/mobile/putong/core/ui/intloperation/regularsticker/RegularStickerHeaderItem;)V", "_root_layout", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VText;", "f", "Lv/VText;", "get_desc", "()Lv/VText;", "set_desc", "(Lv/VText;)V", "_desc", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class RegularStickerHeaderItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public RegularStickerHeaderItem _root_layout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _desc;

    public RegularStickerHeaderItem(@Nullable Context context) {
        super(context);
    }

    @NotNull
    public final VText get_desc() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    public final RegularStickerHeaderItem get_root_layout() {
        RegularStickerHeaderItem regularStickerHeaderItem = this._root_layout;
        if (regularStickerHeaderItem != null) {
            return regularStickerHeaderItem;
        }
        Intrinsics.m88391r("_root_layout");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m47528h0(View view) {
        iwc0.m142370a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m47529i0(@Nullable IntlMarketSummaryData baseData) {
        if (baseData != null) {
            try {
                get_title().setText(baseData.main_title);
                get_desc().setText(baseData.sub_title);
                if (!TextUtils.isEmpty(baseData.main_title_font_color)) {
                    get_title().setTextColor(Color.parseColor(baseData.main_title_font_color));
                }
                if (TextUtils.isEmpty(baseData.sub_title_font_color)) {
                    return;
                }
                get_desc().setTextColor(Color.parseColor(baseData.sub_title_font_color));
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47528h0(this);
    }

    public final void set_desc(@NotNull VText vText) {
        vText.getClass();
        this._desc = vText;
    }

    public final void set_root_layout(@NotNull RegularStickerHeaderItem regularStickerHeaderItem) {
        regularStickerHeaderItem.getClass();
        this._root_layout = regularStickerHeaderItem;
    }

    public final void set_title(@NotNull TextView textView) {
        textView.getClass();
        this._title = textView;
    }

    public RegularStickerHeaderItem(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RegularStickerHeaderItem(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
