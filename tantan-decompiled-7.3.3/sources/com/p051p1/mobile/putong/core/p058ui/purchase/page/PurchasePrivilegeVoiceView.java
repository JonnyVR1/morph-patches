package com.p051p1.mobile.putong.core.p058ui.purchase.page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p153l.jbc0;
import p153l.mgb0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\u000eJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eR\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010)\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R\"\u0010>\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b<\u00103\"\u0004\b=\u00105R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010R\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010\u0015\u001a\u0004\bP\u0010\u0017\"\u0004\bQ\u0010\u0019¨\u0006S"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeVoiceView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "h0", "(Landroid/view/View;)V", "init", "()V", "i0", "j0", "onFinishInflate", "k0", "Lcom/tantan/library/svga/SVGAnimationView;", Constants.INAPP_DATA_TAG, "Lcom/tantan/library/svga/SVGAnimationView;", "get_voice_bg_anim", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_voice_bg_anim", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_voice_bg_anim", "Landroidx/constraintlayout/widget/Guideline;", "e", "Landroidx/constraintlayout/widget/Guideline;", "get_guideline_l", "()Landroidx/constraintlayout/widget/Guideline;", "set_guideline_l", "(Landroidx/constraintlayout/widget/Guideline;)V", "_guideline_l", "f", "get_guideline_r", "set_guideline_r", "_guideline_r", "Landroid/widget/FrameLayout;", "g", "Landroid/widget/FrameLayout;", "get_avatar_left_container", "()Landroid/widget/FrameLayout;", "set_avatar_left_container", "(Landroid/widget/FrameLayout;)V", "_avatar_left_container", "Lv/AutoVDraweeView;", "h", "Lv/AutoVDraweeView;", "get_avatar_left", "()Lv/AutoVDraweeView;", "set_avatar_left", "(Lv/AutoVDraweeView;)V", "_avatar_left", RXScreenCaptureService.KEY_INDEX, "get_avatar_right_container", "set_avatar_right_container", "_avatar_right_container", "j", "get_avatar_right", "set_avatar_right", "_avatar_right", "Lv/VLinear;", "k", "Lv/VLinear;", "get_voice_anim_container", "()Lv/VLinear;", "set_voice_anim_container", "(Lv/VLinear;)V", "_voice_anim_container", "Lv/VImage;", BLiveStormDanmakuGiftResourceType.f45292l, "Lv/VImage;", "get_voice_anim_ic", "()Lv/VImage;", "set_voice_anim_ic", "(Lv/VImage;)V", "_voice_anim_ic", "m", "get_voice_anim", "set_voice_anim", "_voice_anim", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PurchasePrivilegeVoiceView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public SVGAnimationView _voice_bg_anim;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Guideline _guideline_l;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Guideline _guideline_r;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public FrameLayout _avatar_left_container;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public AutoVDraweeView _avatar_left;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public FrameLayout _avatar_right_container;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public AutoVDraweeView _avatar_right;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VLinear _voice_anim_container;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VImage _voice_anim_ic;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public SVGAnimationView _voice_anim;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PurchasePrivilegeVoiceView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    private final void init() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            get_avatar_left().setImageUrl(userM116600p9.m61308fp().url);
            if (NullChecker.m82486a(userM116600p9.settings)) {
                Settings settings = userM116600p9.settings;
                settings.getClass();
                if (TEnum.equals(settings.getLookingFor(), "female")) {
                    m55391i0();
                    return;
                }
            }
            if (NullChecker.m82486a(userM116600p9.settings)) {
                Settings settings2 = userM116600p9.settings;
                settings2.getClass();
                if (TEnum.equals(settings2.getLookingFor(), "male")) {
                    m55392j0();
                    return;
                }
            }
            if (TEnum.equals(userM116600p9.gender, "female")) {
                m55392j0();
            } else {
                m55391i0();
            }
        }
    }

    @NotNull
    public final AutoVDraweeView get_avatar_left() {
        AutoVDraweeView autoVDraweeView = this._avatar_left;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.m88391r("_avatar_left");
        return null;
    }

    @NotNull
    public final FrameLayout get_avatar_left_container() {
        FrameLayout frameLayout = this._avatar_left_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_avatar_left_container");
        return null;
    }

    @NotNull
    public final AutoVDraweeView get_avatar_right() {
        AutoVDraweeView autoVDraweeView = this._avatar_right;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.m88391r("_avatar_right");
        return null;
    }

    @NotNull
    public final FrameLayout get_avatar_right_container() {
        FrameLayout frameLayout = this._avatar_right_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_avatar_right_container");
        return null;
    }

    @NotNull
    public final Guideline get_guideline_l() {
        Guideline guideline = this._guideline_l;
        if (guideline != null) {
            return guideline;
        }
        Intrinsics.m88391r("_guideline_l");
        return null;
    }

    @NotNull
    public final Guideline get_guideline_r() {
        Guideline guideline = this._guideline_r;
        if (guideline != null) {
            return guideline;
        }
        Intrinsics.m88391r("_guideline_r");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_voice_anim() {
        SVGAnimationView sVGAnimationView = this._voice_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_voice_anim");
        return null;
    }

    @NotNull
    public final VLinear get_voice_anim_container() {
        VLinear vLinear = this._voice_anim_container;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_voice_anim_container");
        return null;
    }

    @NotNull
    public final VImage get_voice_anim_ic() {
        VImage vImage = this._voice_anim_ic;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_voice_anim_ic");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_voice_bg_anim() {
        SVGAnimationView sVGAnimationView = this._voice_bg_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_voice_bg_anim");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m55390h0(View view) {
        mgb0.m158189a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m55391i0() {
        uqb0.f180374G.m127138Y0(get_avatar_right(), jbc0.f119363Pa);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m55392j0() {
        uqb0.f180374G.m127138Y0(get_avatar_right(), jbc0.f119377Qa);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m55393k0() {
        get_voice_bg_anim().startAnimation();
        get_voice_anim().startAnimation();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55390h0(this);
        init();
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/43a454d2-a42a-41e8-8f40-1dfbd4d0c89d12.pdf").autoPlay(false).into(get_voice_anim());
        Context context2 = getContext();
        context2.getClass();
        SVGALoader.with(context2).from("https://auto.tancdn.com/v1/raw/52af8cbe-8c18-488a-b453-3431b647b6dd12.pdf").autoPlay(false).into(get_voice_bg_anim());
    }

    public final void set_avatar_left(@NotNull AutoVDraweeView autoVDraweeView) {
        autoVDraweeView.getClass();
        this._avatar_left = autoVDraweeView;
    }

    public final void set_avatar_left_container(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._avatar_left_container = frameLayout;
    }

    public final void set_avatar_right(@NotNull AutoVDraweeView autoVDraweeView) {
        autoVDraweeView.getClass();
        this._avatar_right = autoVDraweeView;
    }

    public final void set_avatar_right_container(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._avatar_right_container = frameLayout;
    }

    public final void set_guideline_l(@NotNull Guideline guideline) {
        guideline.getClass();
        this._guideline_l = guideline;
    }

    public final void set_guideline_r(@NotNull Guideline guideline) {
        guideline.getClass();
        this._guideline_r = guideline;
    }

    public final void set_voice_anim(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._voice_anim = sVGAnimationView;
    }

    public final void set_voice_anim_container(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._voice_anim_container = vLinear;
    }

    public final void set_voice_anim_ic(@NotNull VImage vImage) {
        vImage.getClass();
        this._voice_anim_ic = vImage;
    }

    public final void set_voice_bg_anim(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._voice_bg_anim = sVGAnimationView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchasePrivilegeVoiceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PurchasePrivilegeVoiceView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
