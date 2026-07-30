package com.p051p1.mobile.putong.core.p058ui.banner.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p153l.n3m;
import p153l.pc90;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\"\u0010/\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010\u0012\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00068"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ll/n3m;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "get_texture", "()Lv/VImage;", "set_texture", "(Lv/VImage;)V", "_texture", "e", "get_privilege_icon_simple", "set_privilege_icon_simple", "_privilege_icon_simple", "f", "get_privilege_icon", "set_privilege_icon", "_privilege_icon", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "get_desc", "()Landroid/widget/TextView;", "set_desc", "(Landroid/widget/TextView;)V", "_desc", "h", "get_time_desc", "set_time_desc", "_time_desc", RXScreenCaptureService.KEY_INDEX, "get_go", "set_go", "_go", "Lcom/tantan/library/svga/SVGAnimationView;", "j", "Lcom/tantan/library/svga/SVGAnimationView;", "get_light_svga", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_light_svga", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_light_svga", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PrivilegeEntranceSingleTextWithIconBgView extends ConstraintLayout implements n3m {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _texture;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _privilege_icon_simple;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _privilege_icon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _desc;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _time_desc;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VImage _go;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public SVGAnimationView _light_svga;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeEntranceSingleTextWithIconBgView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @NotNull
    public final TextView get_desc() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    public final VImage get_go() {
        VImage vImage = this._go;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_go");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_light_svga() {
        SVGAnimationView sVGAnimationView = this._light_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_light_svga");
        return null;
    }

    @NotNull
    public final VImage get_privilege_icon() {
        VImage vImage = this._privilege_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_privilege_icon");
        return null;
    }

    @NotNull
    public final VImage get_privilege_icon_simple() {
        VImage vImage = this._privilege_icon_simple;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_privilege_icon_simple");
        return null;
    }

    @NotNull
    public final VImage get_texture() {
        VImage vImage = this._texture;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_texture");
        return null;
    }

    @NotNull
    public final TextView get_time_desc() {
        TextView textView = this._time_desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_time_desc");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m45580h0(View view) {
        pc90.m171640a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45580h0(this);
    }

    public final void set_desc(@NotNull TextView textView) {
        textView.getClass();
        this._desc = textView;
    }

    public final void set_go(@NotNull VImage vImage) {
        vImage.getClass();
        this._go = vImage;
    }

    public final void set_light_svga(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._light_svga = sVGAnimationView;
    }

    public final void set_privilege_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._privilege_icon = vImage;
    }

    public final void set_privilege_icon_simple(@NotNull VImage vImage) {
        vImage.getClass();
        this._privilege_icon_simple = vImage;
    }

    public final void set_texture(@NotNull VImage vImage) {
        vImage.getClass();
        this._texture = vImage;
    }

    public final void set_time_desc(@NotNull TextView textView) {
        textView.getClass();
        this._time_desc = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegeEntranceSingleTextWithIconBgView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PrivilegeEntranceSingleTextWithIconBgView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
