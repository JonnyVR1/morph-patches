package com.p046p1.mobile.putong.core.p053ui.banner.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VIcon;
import p147v.VImage;
import p149l.f190;
import p149l.t0m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&¨\u00064"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ll/t0m;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_texture", "()Lv/VDraweeView;", "set_texture", "(Lv/VDraweeView;)V", "_texture", "Lv/VImage;", "e", "Lv/VImage;", "get_icon", "()Lv/VImage;", "set_icon", "(Lv/VImage;)V", "_icon", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VIcon;", "g", "Lv/VIcon;", "get_arrow_right", "()Lv/VIcon;", "set_arrow_right", "(Lv/VIcon;)V", "_arrow_right", "h", "get_unlock", "set_unlock", "_unlock", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PrivilegeEntranceODiamondSingleView extends ConstraintLayout implements t0m {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _texture;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VIcon _arrow_right;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _unlock;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeEntranceODiamondSingleView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @NotNull
    public final VIcon get_arrow_right() {
        VIcon vIcon = this._arrow_right;
        if (vIcon != null) {
            return vIcon;
        }
        Intrinsics.m87502r("_arrow_right");
        return null;
    }

    @NotNull
    public final VImage get_icon() {
        VImage vImage = this._icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_icon");
        return null;
    }

    @NotNull
    public final VDraweeView get_texture() {
        VDraweeView vDraweeView = this._texture;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_texture");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    @NotNull
    public final TextView get_unlock() {
        TextView textView = this._unlock;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_unlock");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m44392h0(View view) {
        f190.m119106a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44392h0(this);
    }

    public final void set_arrow_right(@NotNull VIcon vIcon) {
        vIcon.getClass();
        this._arrow_right = vIcon;
    }

    public final void set_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._icon = vImage;
    }

    public final void set_texture(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._texture = vDraweeView;
    }

    public final void set_title(@NotNull TextView textView) {
        textView.getClass();
        this._title = textView;
    }

    public final void set_unlock(@NotNull TextView textView) {
        textView.getClass();
        this._unlock = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegeEntranceODiamondSingleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PrivilegeEntranceODiamondSingleView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
