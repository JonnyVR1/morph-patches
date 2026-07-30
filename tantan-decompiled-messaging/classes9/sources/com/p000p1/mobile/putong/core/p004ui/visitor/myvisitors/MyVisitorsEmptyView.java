package com.p000p1.mobile.putong.core.p004ui.visitor.myvisitors;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.tenum.TEnum;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.s120;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsEmptyView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "b", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "Lv/VImage;", "Lv/VImage;", "get_image", "()Lv/VImage;", "set_image", "(Lv/VImage;)V", "_image", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_text", "()Landroid/widget/TextView;", "set_text", "(Landroid/widget/TextView;)V", "_text", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MyVisitorsEmptyView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VImage _image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _text;

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public MyVisitorsEmptyView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m11557a(View view) {
        s120.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m11558b() {
        if (TEnum.equals(CoreModule.f1534c.f3657n2.m22245F3(), "hidden")) {
            get_text().setText("没有对任何人隐藏足迹");
        } else {
            get_text().setText("你还没有访问过其他人");
        }
    }

    @NotNull
    public final VImage get_image() {
        VImage vImage = this._image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_image");
        return null;
    }

    @NotNull
    public final TextView get_text() {
        TextView textView = this._text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_text");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11557a(this);
        setOrientation(1);
    }

    public final void set_image(@NotNull VImage vImage) {
        vImage.getClass();
        this._image = vImage;
    }

    public final void set_text(@NotNull TextView textView) {
        textView.getClass();
        this._text = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MyVisitorsEmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ MyVisitorsEmptyView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
