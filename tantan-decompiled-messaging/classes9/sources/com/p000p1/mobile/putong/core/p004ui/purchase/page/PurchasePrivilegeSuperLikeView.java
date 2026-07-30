package com.p000p1.mobile.putong.core.p004ui.purchase.page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.biq;
import l.d3c0;
import l.e8b0;
import l.n3b0;
import l.sb90;
import l.zz6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.qib0;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0019\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeSuperLikeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "b", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "Lv/AutoVDraweeView;", "Lv/AutoVDraweeView;", "get_avatar_left", "()Lv/AutoVDraweeView;", "set_avatar_left", "(Lv/AutoVDraweeView;)V", "_avatar_left", "get_avatar_right", "set_avatar_right", "_avatar_right", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "get_icon", "()Landroid/widget/ImageView;", "set_icon", "(Landroid/widget/ImageView;)V", "_icon", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PurchasePrivilegeSuperLikeView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public AutoVDraweeView _avatar_left;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public AutoVDraweeView _avatar_right;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ImageView _icon;

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public PurchasePrivilegeSuperLikeView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m7532a(View view) {
        e8b0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m7533b() {
        Picture pictureFp;
        Picture pictureFp2;
        get_avatar_left().setImageUrl(((Media) CoreModule.f1534c.f3628e0.m21490p9().fp()).url);
        if (!NullChecker.a(n3b0.j())) {
            qib0.f19782G.m12767Y0(get_avatar_right(), zz6.u0() ? d3c0.xc : d3c0.wc);
            return;
        }
        String str = null;
        if (sb90.Companion.c(n3b0.j())) {
            AutoVDraweeView autoVDraweeView = get_avatar_right();
            User userJ = n3b0.j();
            if (userJ != null && (pictureFp2 = userJ.fp()) != null) {
                str = ((Media) pictureFp2).url;
            }
            autoVDraweeView.y(str, new biq(4, 15));
            return;
        }
        AutoVDraweeView autoVDraweeView2 = get_avatar_right();
        User userJ2 = n3b0.j();
        if (userJ2 != null && (pictureFp = userJ2.fp()) != null) {
            str = ((Media) pictureFp).url;
        }
        autoVDraweeView2.setImageUrl(str);
    }

    @NotNull
    public final AutoVDraweeView get_avatar_left() {
        AutoVDraweeView autoVDraweeView = this._avatar_left;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.r("_avatar_left");
        return null;
    }

    @NotNull
    public final AutoVDraweeView get_avatar_right() {
        AutoVDraweeView autoVDraweeView = this._avatar_right;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.r("_avatar_right");
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

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7532a(this);
    }

    public final void set_avatar_left(@NotNull AutoVDraweeView autoVDraweeView) {
        autoVDraweeView.getClass();
        this._avatar_left = autoVDraweeView;
    }

    public final void set_avatar_right(@NotNull AutoVDraweeView autoVDraweeView) {
        autoVDraweeView.getClass();
        this._avatar_right = autoVDraweeView;
    }

    public final void set_icon(@NotNull ImageView imageView) {
        imageView.getClass();
        this._icon = imageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchasePrivilegeSuperLikeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PurchasePrivilegeSuperLikeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
