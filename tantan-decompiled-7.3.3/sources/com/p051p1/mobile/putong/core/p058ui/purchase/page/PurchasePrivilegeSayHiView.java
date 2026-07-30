package com.p051p1.mobile.putong.core.p058ui.purchase.page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p153l.c17;
import p153l.hgb0;
import p153l.jbc0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeSayHiView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "b", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeSayHiView;", "get_root", "()Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeSayHiView;", "set_root", "(Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeSayHiView;)V", "_root", "Lv/VImage;", "Lv/VImage;", "get_bg", "()Lv/VImage;", "set_bg", "(Lv/VImage;)V", "_bg", "Lv/AutoVDraweeView;", "c", "Lv/AutoVDraweeView;", "get_avatar", "()Lv/AutoVDraweeView;", "set_avatar", "(Lv/AutoVDraweeView;)V", "_avatar", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PurchasePrivilegeSayHiView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public PurchasePrivilegeSayHiView _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage _bg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public AutoVDraweeView _avatar;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PurchasePrivilegeSayHiView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m55378a(View view) {
        hgb0.m134918a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m55379b() {
        if (c17.m107528u0()) {
            get_bg().setImageResource(jbc0.f119699o6);
        } else {
            get_bg().setImageResource(jbc0.f119685n6);
        }
        get_avatar().setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url);
    }

    @NotNull
    public final AutoVDraweeView get_avatar() {
        AutoVDraweeView autoVDraweeView = this._avatar;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.m88391r("_avatar");
        return null;
    }

    @NotNull
    public final VImage get_bg() {
        VImage vImage = this._bg;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_bg");
        return null;
    }

    @NotNull
    public final PurchasePrivilegeSayHiView get_root() {
        PurchasePrivilegeSayHiView purchasePrivilegeSayHiView = this._root;
        if (purchasePrivilegeSayHiView != null) {
            return purchasePrivilegeSayHiView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55378a(this);
    }

    public final void set_avatar(@NotNull AutoVDraweeView autoVDraweeView) {
        autoVDraweeView.getClass();
        this._avatar = autoVDraweeView;
    }

    public final void set_bg(@NotNull VImage vImage) {
        vImage.getClass();
        this._bg = vImage;
    }

    public final void set_root(@NotNull PurchasePrivilegeSayHiView purchasePrivilegeSayHiView) {
        purchasePrivilegeSayHiView.getClass();
        this._root = purchasePrivilegeSayHiView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchasePrivilegeSayHiView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PurchasePrivilegeSayHiView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
