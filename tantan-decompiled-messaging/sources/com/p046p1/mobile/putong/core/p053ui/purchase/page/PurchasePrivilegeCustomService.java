package com.p046p1.mobile.putong.core.p053ui.purchase.page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p149l.d3c0;
import p149l.xdl0;
import p149l.y7b0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeCustomService;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "b", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeCustomService;", "get_root", "()Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeCustomService;", "set_root", "(Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeCustomService;)V", "_root", "Lv/VImage;", "Lv/VImage;", "get_img_background", "()Lv/VImage;", "set_img_background", "(Lv/VImage;)V", "_img_background", "Lv/AutoVDraweeView;", "c", "Lv/AutoVDraweeView;", "get_img_avatar", "()Lv/AutoVDraweeView;", "set_img_avatar", "(Lv/AutoVDraweeView;)V", "_img_avatar", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PurchasePrivilegeCustomService extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public PurchasePrivilegeCustomService _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage _img_background;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public AutoVDraweeView _img_avatar;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PurchasePrivilegeCustomService(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m54182a(View view) {
        y7b0.m213310a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m54183b() {
        xdl0.m208321A0(getContext(), get_img_background(), d3c0.f83494A6);
        get_img_avatar().setImageUrl(CoreModule.m29935P().m94651a().mo33639zj(CoreModule.f17545c.f19639e0.m169527p9()));
    }

    @NotNull
    public final AutoVDraweeView get_img_avatar() {
        AutoVDraweeView autoVDraweeView = this._img_avatar;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.m87502r("_img_avatar");
        return null;
    }

    @NotNull
    public final VImage get_img_background() {
        VImage vImage = this._img_background;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_img_background");
        return null;
    }

    @NotNull
    public final PurchasePrivilegeCustomService get_root() {
        PurchasePrivilegeCustomService purchasePrivilegeCustomService = this._root;
        if (purchasePrivilegeCustomService != null) {
            return purchasePrivilegeCustomService;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54182a(this);
    }

    public final void set_img_avatar(@NotNull AutoVDraweeView autoVDraweeView) {
        autoVDraweeView.getClass();
        this._img_avatar = autoVDraweeView;
    }

    public final void set_img_background(@NotNull VImage vImage) {
        vImage.getClass();
        this._img_background = vImage;
    }

    public final void set_root(@NotNull PurchasePrivilegeCustomService purchasePrivilegeCustomService) {
        purchasePrivilegeCustomService.getClass();
        this._root = purchasePrivilegeCustomService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchasePrivilegeCustomService(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PurchasePrivilegeCustomService(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
