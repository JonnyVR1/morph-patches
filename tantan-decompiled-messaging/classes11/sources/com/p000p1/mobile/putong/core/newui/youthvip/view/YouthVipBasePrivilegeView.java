package com.p000p1.mobile.putong.core.newui.youthvip.view;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.deq0;
import l.svq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u00108\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\"\u0010<\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010+\u001a\u0004\b:\u0010-\"\u0004\b;\u0010/¨\u0006="}, d2 = {"Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "mRadius", "b", "(Landroid/view/View;I)V", "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;", "get_root_view", "()Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;", "set_root_view", "(Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;)V", "_root_view", "Lv/VDraweeView;", "Lv/VDraweeView;", "get_texture", "()Lv/VDraweeView;", "set_texture", "(Lv/VDraweeView;)V", "_texture", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "get_icon", "()Landroid/widget/ImageView;", "set_icon", "(Landroid/widget/ImageView;)V", "_icon", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "e", "get_subtitle", "set_subtitle", "_subtitle", "f", "get_model_icon", "set_model_icon", "_model_icon", "g", "get_go_btn", "set_go_btn", "_go_btn", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class YouthVipBasePrivilegeView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public YouthVipBasePrivilegeView _root_view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _texture;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ImageView _icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _subtitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ImageView _model_icon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _go_btn;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.youthvip.view.YouthVipBasePrivilegeView$a */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0422a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5853a;

        public C0422a(int i) {
            this.f5853a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            view.getClass();
            outline.getClass();
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.f5853a);
        }
    }

    public /* synthetic */ YouthVipBasePrivilegeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public final void m8118a(View view) {
        deq0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m8119b(View view, int mRadius) {
        view.setOutlineProvider(new C0422a(mRadius));
        view.setClipToOutline(true);
    }

    @NotNull
    public final TextView get_go_btn() {
        TextView textView = this._go_btn;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_go_btn");
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
    public final ImageView get_model_icon() {
        ImageView imageView = this._model_icon;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_model_icon");
        return null;
    }

    @NotNull
    public final YouthVipBasePrivilegeView get_root_view() {
        YouthVipBasePrivilegeView youthVipBasePrivilegeView = this._root_view;
        if (youthVipBasePrivilegeView != null) {
            return youthVipBasePrivilegeView;
        }
        Intrinsics.r("_root_view");
        return null;
    }

    @NotNull
    public final TextView get_subtitle() {
        TextView textView = this._subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_subtitle");
        return null;
    }

    @NotNull
    public final VDraweeView get_texture() {
        VDraweeView vDraweeView = this._texture;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_texture");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8118a(this);
        m8119b(get_root_view(), svq.c(10));
    }

    public final void set_go_btn(@NotNull TextView textView) {
        textView.getClass();
        this._go_btn = textView;
    }

    public final void set_icon(@NotNull ImageView imageView) {
        imageView.getClass();
        this._icon = imageView;
    }

    public final void set_model_icon(@NotNull ImageView imageView) {
        imageView.getClass();
        this._model_icon = imageView;
    }

    public final void set_root_view(@NotNull YouthVipBasePrivilegeView youthVipBasePrivilegeView) {
        youthVipBasePrivilegeView.getClass();
        this._root_view = youthVipBasePrivilegeView;
    }

    public final void set_subtitle(@NotNull TextView textView) {
        textView.getClass();
        this._subtitle = textView;
    }

    public final void set_texture(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._texture = vDraweeView;
    }

    public final void set_title(@NotNull TextView textView) {
        textView.getClass();
        this._title = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public YouthVipBasePrivilegeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public YouthVipBasePrivilegeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public YouthVipBasePrivilegeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
