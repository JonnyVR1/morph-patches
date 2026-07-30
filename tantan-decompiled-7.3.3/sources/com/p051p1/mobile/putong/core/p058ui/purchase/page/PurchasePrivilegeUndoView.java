package com.p051p1.mobile.putong.core.p058ui.purchase.page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.c17;
import p153l.jbc0;
import p153l.jgb0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'¨\u0006-"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeUndoView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "b", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Landroid/widget/FrameLayout;", "get_certain", "()Landroid/widget/FrameLayout;", "set_certain", "(Landroid/widget/FrameLayout;)V", "_certain", "Lv/VDraweeView;", "Lv/VDraweeView;", "get_avatar_right", "()Lv/VDraweeView;", "set_avatar_right", "(Lv/VDraweeView;)V", "_avatar_right", "c", "get_avatar_left", "set_avatar_left", "_avatar_left", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "get_icon", "()Lv/VImage;", "set_icon", "(Lv/VImage;)V", "_icon", "e", "get_uncertain", "set_uncertain", "_uncertain", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PurchasePrivilegeUndoView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public FrameLayout _certain;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _avatar_right;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VDraweeView _avatar_left;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _uncertain;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PurchasePrivilegeUndoView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m55382a(View view) {
        jgb0.m144771a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m55383b() {
        get_icon().setImageResource(jbc0.f119800v9);
        bnl0.m105524M(get_certain(), false);
        bnl0.m105524M(get_uncertain(), true);
        bnl0.m105540X(get_uncertain(), qa00.f156322i);
        get_uncertain().setImageResource(c17.m107528u0() ? jbc0.f119183Cc : jbc0.f119155Ac);
    }

    @NotNull
    public final VDraweeView get_avatar_left() {
        VDraweeView vDraweeView = this._avatar_left;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_avatar_left");
        return null;
    }

    @NotNull
    public final VDraweeView get_avatar_right() {
        VDraweeView vDraweeView = this._avatar_right;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_avatar_right");
        return null;
    }

    @NotNull
    public final FrameLayout get_certain() {
        FrameLayout frameLayout = this._certain;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_certain");
        return null;
    }

    @NotNull
    public final VImage get_icon() {
        VImage vImage = this._icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_icon");
        return null;
    }

    @NotNull
    public final VImage get_uncertain() {
        VImage vImage = this._uncertain;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_uncertain");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55382a(this);
    }

    public final void set_avatar_left(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._avatar_left = vDraweeView;
    }

    public final void set_avatar_right(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._avatar_right = vDraweeView;
    }

    public final void set_certain(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._certain = frameLayout;
    }

    public final void set_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._icon = vImage;
    }

    public final void set_uncertain(@NotNull VImage vImage) {
        vImage.getClass();
        this._uncertain = vImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchasePrivilegeUndoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PurchasePrivilegeUndoView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
