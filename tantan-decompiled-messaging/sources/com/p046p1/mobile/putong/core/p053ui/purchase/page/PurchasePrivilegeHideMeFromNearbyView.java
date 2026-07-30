package com.p046p1.mobile.putong.core.p053ui.purchase.page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
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
import p149l.qib0;
import p149l.z7b0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u000fR\"\u0010'\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015¨\u0006("}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeHideMeFromNearbyView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "b", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Lv/VImage;", "Lv/VImage;", "get_model", "()Lv/VImage;", "set_model", "(Lv/VImage;)V", "_model", "Lv/AutoVDraweeView;", "Lv/AutoVDraweeView;", "get_avatar", "()Lv/AutoVDraweeView;", "set_avatar", "(Lv/AutoVDraweeView;)V", "_avatar", "c", "Landroid/view/View;", "get_mask", "()Landroid/view/View;", "set_mask", "_mask", Constants.INAPP_DATA_TAG, "get_hide_ic", "set_hide_ic", "_hide_ic", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PurchasePrivilegeHideMeFromNearbyView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VImage _model;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public AutoVDraweeView _avatar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public View _mask;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _hide_ic;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PurchasePrivilegeHideMeFromNearbyView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m54184a(View view) {
        z7b0.m217450a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m54185b() {
        get_model().setImageResource(d3c0.f83822Y6);
        qib0.f154691G.m102336O(get_avatar(), CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted(), 2, 8);
    }

    @NotNull
    public final AutoVDraweeView get_avatar() {
        AutoVDraweeView autoVDraweeView = this._avatar;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.m87502r("_avatar");
        return null;
    }

    @NotNull
    public final VImage get_hide_ic() {
        VImage vImage = this._hide_ic;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_hide_ic");
        return null;
    }

    @NotNull
    public final View get_mask() {
        View view = this._mask;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_mask");
        return null;
    }

    @NotNull
    public final VImage get_model() {
        VImage vImage = this._model;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_model");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54184a(this);
    }

    public final void set_avatar(@NotNull AutoVDraweeView autoVDraweeView) {
        autoVDraweeView.getClass();
        this._avatar = autoVDraweeView;
    }

    public final void set_hide_ic(@NotNull VImage vImage) {
        vImage.getClass();
        this._hide_ic = vImage;
    }

    public final void set_mask(@NotNull View view) {
        view.getClass();
        this._mask = view;
    }

    public final void set_model(@NotNull VImage vImage) {
        vImage.getClass();
        this._model = vImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchasePrivilegeHideMeFromNearbyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PurchasePrivilegeHideMeFromNearbyView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
