package com.p000p1.mobile.putong.core.p004ui.purchase.page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.b8b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.AutoVDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeOdiamondSkinView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "b", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeOdiamondSkinView;", "get_root", "()Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeOdiamondSkinView;", "set_root", "(Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeOdiamondSkinView;)V", "_root", "Lv/AutoVDraweeView;", "Lv/AutoVDraweeView;", "get_avatar", "()Lv/AutoVDraweeView;", "set_avatar", "(Lv/AutoVDraweeView;)V", "_avatar", "Lv/VImage;", "c", "Lv/VImage;", "get_icon", "()Lv/VImage;", "set_icon", "(Lv/VImage;)V", "_icon", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PurchasePrivilegeOdiamondSkinView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public PurchasePrivilegeOdiamondSkinView _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public AutoVDraweeView _avatar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VImage _icon;

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public PurchasePrivilegeOdiamondSkinView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m7525a(View view) {
        b8b0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m7526b() {
        get_avatar().setImageUrl(CoreModule.m1854P().m11706a().m5576zj(CoreModule.f1534c.f3628e0.m21490p9()));
    }

    @NotNull
    public final AutoVDraweeView get_avatar() {
        AutoVDraweeView autoVDraweeView = this._avatar;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.r("_avatar");
        return null;
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
    public final PurchasePrivilegeOdiamondSkinView get_root() {
        PurchasePrivilegeOdiamondSkinView purchasePrivilegeOdiamondSkinView = this._root;
        if (purchasePrivilegeOdiamondSkinView != null) {
            return purchasePrivilegeOdiamondSkinView;
        }
        Intrinsics.r("_root");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7525a(this);
    }

    public final void set_avatar(@NotNull AutoVDraweeView autoVDraweeView) {
        autoVDraweeView.getClass();
        this._avatar = autoVDraweeView;
    }

    public final void set_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._icon = vImage;
    }

    public final void set_root(@NotNull PurchasePrivilegeOdiamondSkinView purchasePrivilegeOdiamondSkinView) {
        purchasePrivilegeOdiamondSkinView.getClass();
        this._root = purchasePrivilegeOdiamondSkinView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchasePrivilegeOdiamondSkinView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PurchasePrivilegeOdiamondSkinView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
