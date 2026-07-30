package com.p000p1.mobile.putong.core.newui.supreme;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.data.IdealTypes;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.ozg0;
import l.qib0;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\n\u0010\u0019\u001a\u00020\u0017\"\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/SupremeCustomModelItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/data/IdealTypes;", "supremeCustomModel", "", "i0", "(Lcom/p1/mobile/putong/core/data/IdealTypes;)V", "onFinishInflate", "()V", "l0", "j0", "Landroid/view/View;", "view", "h0", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "textView", "", "", "numbers", "k0", "(Landroid/widget/TextView;[I)V", "Lv/VDraweeView;", "d", "Lv/VDraweeView;", "get_header_pic", "()Lv/VDraweeView;", "set_header_pic", "(Lv/VDraweeView;)V", "_header_pic", "e", "get_mask", "set_mask", "_mask", "Lv/VImage;", "f", "Lv/VImage;", "get_selectborder", "()Lv/VImage;", "set_selectborder", "(Lv/VImage;)V", "_selectborder", "Lv/VText;", "g", "Lv/VText;", "get_label", "()Lv/VText;", "set_label", "(Lv/VText;)V", "_label", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SupremeCustomModelItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _header_pic;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _mask;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _selectborder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _label;

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public SupremeCustomModelItem(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    @NotNull
    public final VDraweeView get_header_pic() {
        VDraweeView vDraweeView = this._header_pic;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_header_pic");
        return null;
    }

    @NotNull
    public final VText get_label() {
        VText vText = this._label;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_label");
        return null;
    }

    @NotNull
    public final VDraweeView get_mask() {
        VDraweeView vDraweeView = this._mask;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_mask");
        return null;
    }

    @NotNull
    public final VImage get_selectborder() {
        VImage vImage = this._selectborder;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_selectborder");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m7853h0(View view) {
        ozg0.a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m7854i0(@NotNull IdealTypes supremeCustomModel) {
        supremeCustomModel.getClass();
        qib0.G.L0(get_header_pic(), supremeCustomModel.img);
        get_label().setText(supremeCustomModel.value);
        if (supremeCustomModel.selected) {
            m7855j0();
        } else {
            m7857l0();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m7855j0() {
        get_label().setAlpha(1.0f);
        xdl0.M0(get_selectborder(), true);
        get_label().setTextColor(Color.parseColor("#FFFFFF"));
        m7856k0(get_label(), Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761"));
        ViewGroup.LayoutParams layoutParams = get_header_pic().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i = t100.e;
            marginLayoutParams.topMargin = i;
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i;
            get_header_pic().setLayoutParams(marginLayoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = get_mask().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            int i2 = t100.e;
            marginLayoutParams2.topMargin = i2;
            marginLayoutParams2.bottomMargin = i2;
            marginLayoutParams2.leftMargin = i2;
            marginLayoutParams2.rightMargin = i2;
            get_mask().setLayoutParams(marginLayoutParams2);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m7856k0(TextView textView, int... numbers) {
        textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, textView.getPaint().getTextSize() * textView.getText().length(), 0.0f, CollectionsKt.toIntArray(ArraysKt.asList(numbers)), (float[]) null, Shader.TileMode.CLAMP));
        textView.invalidate();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m7857l0() {
        xdl0.M0(get_selectborder(), false);
        get_label().getPaint().setShader(null);
        get_label().setTextColor(Color.parseColor("#FFFFFF"));
        get_label().setAlpha(0.8f);
        get_label().invalidate();
        ViewGroup.LayoutParams layoutParams = get_header_pic().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i = t100.c;
            marginLayoutParams.topMargin = i;
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i;
            get_header_pic().setLayoutParams(marginLayoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = get_mask().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            int i2 = t100.c;
            marginLayoutParams2.topMargin = i2;
            marginLayoutParams2.bottomMargin = i2;
            marginLayoutParams2.leftMargin = i2;
            marginLayoutParams2.rightMargin = i2;
            get_mask().setLayoutParams(marginLayoutParams2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7853h0(this);
    }

    public final void set_header_pic(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._header_pic = vDraweeView;
    }

    public final void set_label(@NotNull VText vText) {
        vText.getClass();
        this._label = vText;
    }

    public final void set_mask(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._mask = vDraweeView;
    }

    public final void set_selectborder(@NotNull VImage vImage) {
        vImage.getClass();
        this._selectborder = vImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SupremeCustomModelItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ SupremeCustomModelItem(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
