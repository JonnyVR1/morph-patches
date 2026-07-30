package com.p046p1.mobile.putong.core.p053ui.banner.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VText;
import p149l.e290;
import p149l.t0m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\"\u00107\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.¨\u00068"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePrivilegeTopView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ll/t0m;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "get_texture", "()Lv/VImage;", "set_texture", "(Lv/VImage;)V", "_texture", "e", "get_border", "set_border", "_border", "Lcom/tantan/library/svga/SVGAnimationView;", "f", "Lcom/tantan/library/svga/SVGAnimationView;", "get_icon_svga", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_icon_svga", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_icon_svga", "g", "get_privilege_icon", "set_privilege_icon", "_privilege_icon", "Lv/VText;", "h", "Lv/VText;", "get_privilege_text", "()Lv/VText;", "set_privilege_text", "(Lv/VText;)V", "_privilege_text", RXScreenCaptureService.KEY_INDEX, "get_desc", "set_desc", "_desc", "j", "get_action", "set_action", "_action", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PrivilegeEntrancePrivilegeTopView extends ConstraintLayout implements t0m {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _texture;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _border;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public SVGAnimationView _icon_svga;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _privilege_icon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _privilege_text;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _desc;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _action;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeEntrancePrivilegeTopView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @NotNull
    public final VText get_action() {
        VText vText = this._action;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_action");
        return null;
    }

    @NotNull
    public final VImage get_border() {
        VImage vImage = this._border;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_border");
        return null;
    }

    @NotNull
    public final VText get_desc() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_desc");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_icon_svga() {
        SVGAnimationView sVGAnimationView = this._icon_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_icon_svga");
        return null;
    }

    @NotNull
    public final VImage get_privilege_icon() {
        VImage vImage = this._privilege_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_privilege_icon");
        return null;
    }

    @NotNull
    public final VText get_privilege_text() {
        VText vText = this._privilege_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_privilege_text");
        return null;
    }

    @NotNull
    public final VImage get_texture() {
        VImage vImage = this._texture;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_texture");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m44394h0(View view) {
        e290.m114497a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44394h0(this);
    }

    public final void set_action(@NotNull VText vText) {
        vText.getClass();
        this._action = vText;
    }

    public final void set_border(@NotNull VImage vImage) {
        vImage.getClass();
        this._border = vImage;
    }

    public final void set_desc(@NotNull VText vText) {
        vText.getClass();
        this._desc = vText;
    }

    public final void set_icon_svga(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._icon_svga = sVGAnimationView;
    }

    public final void set_privilege_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._privilege_icon = vImage;
    }

    public final void set_privilege_text(@NotNull VText vText) {
        vText.getClass();
        this._privilege_text = vText;
    }

    public final void set_texture(@NotNull VImage vImage) {
        vImage.getClass();
        this._texture = vImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegeEntrancePrivilegeTopView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PrivilegeEntrancePrivilegeTopView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
