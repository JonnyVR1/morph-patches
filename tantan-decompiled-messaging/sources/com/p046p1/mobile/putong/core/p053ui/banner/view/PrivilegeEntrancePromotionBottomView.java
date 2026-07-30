package com.p046p1.mobile.putong.core.p053ui.banner.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p149l.f290;
import p149l.t0m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u000fR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00101\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\"\u00105\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010 \u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$R\"\u00109\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u0010 \u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006B"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ll/t0m;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "Landroid/view/View;", "get_divider", "()Landroid/view/View;", "set_divider", "_divider", "Lv/VLinear_FillerMeasure;", "e", "Lv/VLinear_FillerMeasure;", "get_promotion_desc_layout", "()Lv/VLinear_FillerMeasure;", "set_promotion_desc_layout", "(Lv/VLinear_FillerMeasure;)V", "_promotion_desc_layout", "Lv/VText;", "f", "Lv/VText;", "get_promotion_desc_left", "()Lv/VText;", "set_promotion_desc_left", "(Lv/VText;)V", "_promotion_desc_left", "Lv/VImage;", "g", "Lv/VImage;", "get_promotion_icon", "()Lv/VImage;", "set_promotion_icon", "(Lv/VImage;)V", "_promotion_icon", "h", "get_promotion_desc", "set_promotion_desc", "_promotion_desc", RXScreenCaptureService.KEY_INDEX, "get_promotion_tip", "set_promotion_tip", "_promotion_tip", "j", "get_goto_buy", "set_goto_buy", "_goto_buy", "Landroid/widget/TextView;", "k", "Landroid/widget/TextView;", "get_buy_tip", "()Landroid/widget/TextView;", "set_buy_tip", "(Landroid/widget/TextView;)V", "_buy_tip", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PrivilegeEntrancePromotionBottomView extends ConstraintLayout implements t0m {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View _divider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear_FillerMeasure _promotion_desc_layout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _promotion_desc_left;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _promotion_icon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _promotion_desc;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _promotion_tip;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _goto_buy;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public TextView _buy_tip;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeEntrancePromotionBottomView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @NotNull
    public final TextView get_buy_tip() {
        TextView textView = this._buy_tip;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_buy_tip");
        return null;
    }

    @NotNull
    public final View get_divider() {
        View view = this._divider;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_divider");
        return null;
    }

    @NotNull
    public final VText get_goto_buy() {
        VText vText = this._goto_buy;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_goto_buy");
        return null;
    }

    @NotNull
    public final VText get_promotion_desc() {
        VText vText = this._promotion_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_promotion_desc");
        return null;
    }

    @NotNull
    public final VLinear_FillerMeasure get_promotion_desc_layout() {
        VLinear_FillerMeasure vLinear_FillerMeasure = this._promotion_desc_layout;
        if (vLinear_FillerMeasure != null) {
            return vLinear_FillerMeasure;
        }
        Intrinsics.m87502r("_promotion_desc_layout");
        return null;
    }

    @NotNull
    public final VText get_promotion_desc_left() {
        VText vText = this._promotion_desc_left;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_promotion_desc_left");
        return null;
    }

    @NotNull
    public final VImage get_promotion_icon() {
        VImage vImage = this._promotion_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_promotion_icon");
        return null;
    }

    @NotNull
    public final VText get_promotion_tip() {
        VText vText = this._promotion_tip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_promotion_tip");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m44395h0(View view) {
        f290.m119163a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44395h0(this);
    }

    public final void set_buy_tip(@NotNull TextView textView) {
        textView.getClass();
        this._buy_tip = textView;
    }

    public final void set_divider(@NotNull View view) {
        view.getClass();
        this._divider = view;
    }

    public final void set_goto_buy(@NotNull VText vText) {
        vText.getClass();
        this._goto_buy = vText;
    }

    public final void set_promotion_desc(@NotNull VText vText) {
        vText.getClass();
        this._promotion_desc = vText;
    }

    public final void set_promotion_desc_layout(@NotNull VLinear_FillerMeasure vLinear_FillerMeasure) {
        vLinear_FillerMeasure.getClass();
        this._promotion_desc_layout = vLinear_FillerMeasure;
    }

    public final void set_promotion_desc_left(@NotNull VText vText) {
        vText.getClass();
        this._promotion_desc_left = vText;
    }

    public final void set_promotion_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._promotion_icon = vImage;
    }

    public final void set_promotion_tip(@NotNull VText vText) {
        vText.getClass();
        this._promotion_tip = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegeEntrancePromotionBottomView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PrivilegeEntrancePromotionBottomView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
