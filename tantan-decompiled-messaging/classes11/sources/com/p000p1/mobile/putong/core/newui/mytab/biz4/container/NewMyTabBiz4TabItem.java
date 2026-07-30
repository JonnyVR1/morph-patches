package com.p000p1.mobile.putong.core.newui.mytab.biz4.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.dk30;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.RedPointView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u000fJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!R\"\u0010(\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010<\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\"\u0010B\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010!¨\u0006C"}, d2 = {"Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/NewMyTabBiz4TabItem;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "icon", "setIcon", "(I)V", "num", "setBadge", "", "numStr", "setNum", "(Ljava/lang/String;)V", "name", "setName", "res", "setIndicatorRes", "", "selected", "setSelected", "(Z)V", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_icon", "()Landroid/widget/ImageView;", "set_icon", "(Landroid/widget/ImageView;)V", "_icon", "Lv/RedPointView;", "b", "Lv/RedPointView;", "get_badge", "()Lv/RedPointView;", "set_badge", "(Lv/RedPointView;)V", "_badge", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "get_num", "()Landroid/widget/TextView;", "set_num", "(Landroid/widget/TextView;)V", "_num", "d", "get_name", "set_name", "_name", "e", "Landroid/view/View;", "get_indicator", "()Landroid/view/View;", "set_indicator", "_indicator", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class NewMyTabBiz4TabItem extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ImageView _icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public RedPointView _badge;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TextView _num;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _indicator;

    public /* synthetic */ NewMyTabBiz4TabItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public final void m6850a(View view) {
        dk30.a(this, view);
    }

    @NotNull
    public final RedPointView get_badge() {
        RedPointView redPointView = this._badge;
        if (redPointView != null) {
            return redPointView;
        }
        Intrinsics.r("_badge");
        return null;
    }

    @NotNull
    public final ImageView get_icon() {
        ImageView imageView = this._icon;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_icon");
        return null;
    }

    @NotNull
    public final View get_indicator() {
        View view = this._indicator;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_indicator");
        return null;
    }

    @NotNull
    public final TextView get_name() {
        TextView textView = this._name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_name");
        return null;
    }

    @NotNull
    public final TextView get_num() {
        TextView textView = this._num;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_num");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6850a(this);
    }

    public final void setBadge(int num) {
        if (num < 0) {
            xdl0.M(get_badge(), false);
            return;
        }
        get_badge().setMinWidth(num == 0 ? t100.d(12.0f) : t100.d(20.0f));
        ViewGroup.LayoutParams layoutParams = get_badge().getLayoutParams();
        layoutParams.width = num == 0 ? t100.d(12.0f) : -2;
        layoutParams.height = num == 0 ? t100.d(12.0f) : t100.d(20.0f);
        get_badge().setLayoutParams(layoutParams);
        RedPointView redPointView = get_badge();
        Integer numValueOf = Integer.valueOf(num);
        int iIntValue = numValueOf.intValue();
        Object obj = numValueOf;
        if (iIntValue <= 0) {
            obj = null;
        }
        if (obj == null) {
            obj = "";
        }
        redPointView.setText(String.valueOf(obj));
        xdl0.M(get_badge(), true);
    }

    public final void setIcon(@DrawableRes int icon) {
        get_icon().setImageResource(icon);
    }

    public final void setIndicatorRes(@DrawableRes int res) {
        get_indicator().setBackgroundResource(res);
    }

    public final void setName(@NotNull String name) {
        name.getClass();
        get_name().setText(name);
    }

    public final void setNum(@NotNull String numStr) {
        numStr.getClass();
        get_num().setText(numStr);
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        xdl0.M(get_indicator(), selected);
    }

    public final void set_badge(@NotNull RedPointView redPointView) {
        redPointView.getClass();
        this._badge = redPointView;
    }

    public final void set_icon(@NotNull ImageView imageView) {
        imageView.getClass();
        this._icon = imageView;
    }

    public final void set_indicator(@NotNull View view) {
        view.getClass();
        this._indicator = view;
    }

    public final void set_name(@NotNull TextView textView) {
        textView.getClass();
        this._name = textView;
    }

    public final void set_num(@NotNull TextView textView) {
        textView.getClass();
        this._num = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewMyTabBiz4TabItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewMyTabBiz4TabItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewMyTabBiz4TabItem(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
