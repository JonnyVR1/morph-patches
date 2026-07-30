package com.p000p1.mobile.putong.core.p001ui.banner.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003l.f090;
import p003l.t0m;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\"\u0010&\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\"\u0010*\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010\u0011\u001a\u0004\b4\u0010\u0013\"\u0004\b5\u0010\u0015¨\u00067"}, d2 = {"Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "Landroid/widget/RelativeLayout;", "Ll/t0m;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "Lv/VImage;", "Lv/VImage;", "get_texture", "()Lv/VImage;", "set_texture", "(Lv/VImage;)V", "_texture", "Lcom/tantan/library/svga/SVGAnimationView;", "b", "Lcom/tantan/library/svga/SVGAnimationView;", "get_light_svga", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_light_svga", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_light_svga", "c", "get_border", "set_border", "_border", "d", "get_light_icon_svga", "set_light_icon_svga", "_light_icon_svga", "e", "get_iv_privilege_icon", "set_iv_privilege_icon", "_iv_privilege_icon", "Lv/VText;", "f", "Lv/VText;", "get_vip_desc", "()Lv/VText;", "set_vip_desc", "(Lv/VText;)V", "_vip_desc", "g", "get_vip_go", "set_vip_go", "_vip_go", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class PrivilegeEntranceHasPrivilegeView extends RelativeLayout implements t0m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VImage _texture;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public SVGAnimationView _light_svga;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VImage _border;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public SVGAnimationView _light_icon_svga;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _iv_privilege_icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _vip_desc;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _vip_go;

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public PrivilegeEntranceHasPrivilegeView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m1690a(View view) {
        f090.m6359a(this, view);
    }

    @NotNull
    public final VImage get_border() {
        VImage vImage = this._border;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_border");
        return null;
    }

    @NotNull
    public final VImage get_iv_privilege_icon() {
        VImage vImage = this._iv_privilege_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_iv_privilege_icon");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_light_icon_svga() {
        SVGAnimationView sVGAnimationView = this._light_icon_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_light_icon_svga");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_light_svga() {
        SVGAnimationView sVGAnimationView = this._light_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_light_svga");
        return null;
    }

    @NotNull
    public final VImage get_texture() {
        VImage vImage = this._texture;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_texture");
        return null;
    }

    @NotNull
    public final VText get_vip_desc() {
        VText vText = this._vip_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_vip_desc");
        return null;
    }

    @NotNull
    public final VImage get_vip_go() {
        VImage vImage = this._vip_go;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_vip_go");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1690a(this);
    }

    public final void set_border(@NotNull VImage vImage) {
        vImage.getClass();
        this._border = vImage;
    }

    public final void set_iv_privilege_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._iv_privilege_icon = vImage;
    }

    public final void set_light_icon_svga(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._light_icon_svga = sVGAnimationView;
    }

    public final void set_light_svga(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._light_svga = sVGAnimationView;
    }

    public final void set_texture(@NotNull VImage vImage) {
        vImage.getClass();
        this._texture = vImage;
    }

    public final void set_vip_desc(@NotNull VText vText) {
        vText.getClass();
        this._vip_desc = vText;
    }

    public final void set_vip_go(@NotNull VImage vImage) {
        vImage.getClass();
        this._vip_go = vImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegeEntranceHasPrivilegeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PrivilegeEntranceHasPrivilegeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
