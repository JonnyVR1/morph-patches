package com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.lp3;
import l.o7r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.seamless.xhtml.XHTMLElement;
import p028v.VImage;
import p028v.VLinear;
import p028v.VSwitchButton;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzSwitchItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "h0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "onCheckedChangeListener", "", "setOnCheckedChangeListener", "(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V", "Lv/VImage;", "d", "Lv/VImage;", "get_icon", "()Lv/VImage;", "set_icon", "(Lv/VImage;)V", "_icon", "Lv/VLinear;", "e", "Lv/VLinear;", "get_right_info", "()Lv/VLinear;", "set_right_info", "(Lv/VLinear;)V", "_right_info", "Lv/VText;", "f", "Lv/VText;", "get_right_info_title", "()Lv/VText;", "set_right_info_title", "(Lv/VText;)V", "_right_info_title", "g", "get_right_info_desc", "set_right_info_desc", "_right_info_desc", "Lv/VSwitchButton;", XHTMLElement.XPATH_PREFIX, "Lv/VSwitchButton;", "get_toggle", "()Lv/VSwitchButton;", "set_toggle", "(Lv/VSwitchButton;)V", "_toggle", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BuzzSwitchItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _right_info;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _right_info_title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _right_info_desc;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VSwitchButton _toggle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BuzzSwitchItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterA = o7r.a(getContext());
        layoutInflaterA.getClass();
        m216h0(layoutInflaterA, this);
    }

    @NotNull
    public final VImage get_icon() {
        VImage vImage = this._icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_icon");
        return null;
    }

    @NotNull
    public final VLinear get_right_info() {
        VLinear vLinear = this._right_info;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_right_info");
        return null;
    }

    @NotNull
    public final VText get_right_info_desc() {
        VText vText = this._right_info_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_right_info_desc");
        return null;
    }

    @NotNull
    public final VText get_right_info_title() {
        VText vText = this._right_info_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_right_info_title");
        return null;
    }

    @NotNull
    public final VSwitchButton get_toggle() {
        VSwitchButton vSwitchButton = this._toggle;
        if (vSwitchButton != null) {
            return vSwitchButton;
        }
        Intrinsics.r("_toggle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final View m216h0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = lp3.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    public final void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener != null) {
            get_toggle().setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }

    public final void set_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._icon = vImage;
    }

    public final void set_right_info(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._right_info = vLinear;
    }

    public final void set_right_info_desc(@NotNull VText vText) {
        vText.getClass();
        this._right_info_desc = vText;
    }

    public final void set_right_info_title(@NotNull VText vText) {
        vText.getClass();
        this._right_info_title = vText;
    }

    public final void set_toggle(@NotNull VSwitchButton vSwitchButton) {
        vSwitchButton.getClass();
        this._toggle = vSwitchButton;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzSwitchItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzSwitchItemView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
