package com.p046p1.mobile.putong.core.p053ui.purchase.page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p149l.d3c0;
import p149l.w7b0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0018\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&¨\u0006,"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeBadgeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "b", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Landroid/widget/FrameLayout;", "get_avatar_area", "()Landroid/widget/FrameLayout;", "set_avatar_area", "(Landroid/widget/FrameLayout;)V", "_avatar_area", "Lv/AutoVDraweeView;", "Lv/AutoVDraweeView;", "get_avatar", "()Lv/AutoVDraweeView;", "set_avatar", "(Lv/AutoVDraweeView;)V", "_avatar", "Lv/VImage;", "c", "Lv/VImage;", "get_vip_icon", "()Lv/VImage;", "set_vip_icon", "(Lv/VImage;)V", "_vip_icon", Constants.INAPP_DATA_TAG, "get_vip_badge", "set_vip_badge", "_vip_badge", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PurchasePrivilegeBadgeView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public FrameLayout _avatar_area;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public AutoVDraweeView _avatar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VImage _vip_icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _vip_badge;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PurchasePrivilegeBadgeView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m54178a(View view) {
        w7b0.m202012a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m54179b(@NotNull Privilege privilege) {
        privilege.getClass();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (Privilege.svip_badge == privilege) {
            get_avatar().setImageUrl(userM169527p9.m60124fp().url);
            get_vip_icon().setImageResource(d3c0.f83798W8);
            get_avatar_area().setBackgroundResource(d3c0.f83785V8);
            get_vip_badge().setImageResource(d3c0.f83826Ya);
            return;
        }
        get_avatar().setImageUrl(userM169527p9.m60124fp().url);
        get_vip_icon().setImageResource(CoreModule.m29935P().m94654e().mo34988ul());
        get_avatar_area().setBackgroundResource(d3c0.f83811X8);
        get_vip_badge().setImageResource(d3c0.f83824Y8);
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
    public final FrameLayout get_avatar_area() {
        FrameLayout frameLayout = this._avatar_area;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_avatar_area");
        return null;
    }

    @NotNull
    public final VImage get_vip_badge() {
        VImage vImage = this._vip_badge;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_vip_badge");
        return null;
    }

    @NotNull
    public final VImage get_vip_icon() {
        VImage vImage = this._vip_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_vip_icon");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54178a(this);
    }

    public final void set_avatar(@NotNull AutoVDraweeView autoVDraweeView) {
        autoVDraweeView.getClass();
        this._avatar = autoVDraweeView;
    }

    public final void set_avatar_area(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._avatar_area = frameLayout;
    }

    public final void set_vip_badge(@NotNull VImage vImage) {
        vImage.getClass();
        this._vip_badge = vImage;
    }

    public final void set_vip_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._vip_icon = vImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchasePrivilegeBadgeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PurchasePrivilegeBadgeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
