package com.p051p1.mobile.putong.core.p058ui.active;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.active.MinBoostActiveCard;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.pb00;
import p153l.qa00;
import p153l.uqb0;
import p153l.x0m;
import p153l.x20;
import p153l.xlj;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u0012R\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00102\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00105\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\"\u00109\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u0010\u001e\u001a\u0004\b7\u0010 \"\u0004\b8\u0010\"R\"\u0010=\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010&\u001a\u0004\b;\u0010(\"\u0004\b<\u0010*R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010I\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010@\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR\"\u0010M\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010&\u001a\u0004\bK\u0010(\"\u0004\bL\u0010*R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V¨\u0006X"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/active/MinBoostActiveCard;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "c", "(Landroid/view/View;)V", "onFinishInflate", "()V", "Ll/x0m;", "frag", "Lcom/p1/mobile/putong/core/data/Active;", Active.TYPE, "Ll/x20;", "action", Constants.INAPP_DATA_TAG, "(Ll/x0m;Lcom/p1/mobile/putong/core/data/Active;Ll/x20;)V", "onDetachedFromWindow", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_iv_cardpic", "()Lv/VDraweeView;", "set_iv_cardpic", "(Lv/VDraweeView;)V", "_iv_cardpic", "Lv/VText;", "b", "Lv/VText;", "get_boost_title", "()Lv/VText;", "set_boost_title", "(Lv/VText;)V", "_boost_title", "Landroidx/constraintlayout/widget/Guideline;", "Landroidx/constraintlayout/widget/Guideline;", "get_guideline1", "()Landroidx/constraintlayout/widget/Guideline;", "set_guideline1", "(Landroidx/constraintlayout/widget/Guideline;)V", "_guideline1", "get_guideline2", "set_guideline2", "_guideline2", "e", "get_boost_logo", "set_boost_logo", "_boost_logo", "f", "get_boost_subtitle", "set_boost_subtitle", "_boost_subtitle", "Lv/VImage;", "g", "Lv/VImage;", "get_btn_bottom", "()Lv/VImage;", "set_btn_bottom", "(Lv/VImage;)V", "_btn_bottom", "h", "get_iv_close", "set_iv_close", "_iv_close", RXScreenCaptureService.KEY_INDEX, "get_btn_title", "set_btn_title", "_btn_title", "j", "Ll/x0m;", "", "k", "Z", "getOnSwipe", "()Z", "setOnSwipe", "(Z)V", "onSwipe", "card_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MinBoostActiveCard extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _iv_cardpic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _boost_title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public Guideline _guideline1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public Guideline _guideline2;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _boost_logo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _boost_subtitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _btn_bottom;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _iv_close;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _btn_title;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public x0m frag;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean onSwipe;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MinBoostActiveCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m45414a(x0m x0mVar, View view) {
        x0mVar.mo37749V(SwipeDirection.LEFT);
    }

    /* JADX INFO: renamed from: b */
    public static void m45415b(x20 x20Var, View view) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m45416c(View view) {
        pb00.m171471a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m45417d(@NotNull final x0m frag, @NotNull Active active, @NotNull final x20 action) {
        frag.getClass();
        active.getClass();
        action.getClass();
        this.frag = frag;
        uqb0.f180374G.m127115L0(get_iv_cardpic(), active.cardBackgroundUrl);
        uqb0.f180374G.m127115L0(get_boost_logo(), active.cardLogo);
        get_boost_title().setText(active.cardTitle);
        get_boost_subtitle().setText(active.cardDesc);
        get_btn_title().setText(active.cardBtnTitle);
        get_btn_bottom().setOnClickListener(new View.OnClickListener() { // from class: l.lb00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MinBoostActiveCard.m45415b(action, view);
            }
        });
        float fM175859d = qa00.m175859d(20.0f);
        if (IntlCountryCodeController.m29125v()) {
            fM175859d = 0.0f;
        }
        RoundingParams roundingParamsM8303c = RoundingParams.m8303c(fM175859d);
        roundingParamsM8303c.getClass();
        get_iv_cardpic().setHierarchy(new xlj(getResources()).m211636K(roundingParamsM8303c).m211638a());
        bnl0.m105524M(get_iv_close(), IntlCountryCodeController.m29125v());
        bnl0.m105509E0(get_iv_close(), new View.OnClickListener() { // from class: l.mb00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MinBoostActiveCard.m45414a(frag, view);
            }
        });
    }

    public final boolean getOnSwipe() {
        return this.onSwipe;
    }

    @NotNull
    public final VDraweeView get_boost_logo() {
        VDraweeView vDraweeView = this._boost_logo;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_boost_logo");
        return null;
    }

    @NotNull
    public final VText get_boost_subtitle() {
        VText vText = this._boost_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_boost_subtitle");
        return null;
    }

    @NotNull
    public final VText get_boost_title() {
        VText vText = this._boost_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_boost_title");
        return null;
    }

    @NotNull
    public final VImage get_btn_bottom() {
        VImage vImage = this._btn_bottom;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_btn_bottom");
        return null;
    }

    @NotNull
    public final VText get_btn_title() {
        VText vText = this._btn_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_btn_title");
        return null;
    }

    @NotNull
    public final Guideline get_guideline1() {
        Guideline guideline = this._guideline1;
        if (guideline != null) {
            return guideline;
        }
        Intrinsics.m88391r("_guideline1");
        return null;
    }

    @NotNull
    public final Guideline get_guideline2() {
        Guideline guideline = this._guideline2;
        if (guideline != null) {
            return guideline;
        }
        Intrinsics.m88391r("_guideline2");
        return null;
    }

    @NotNull
    public final VDraweeView get_iv_cardpic() {
        VDraweeView vDraweeView = this._iv_cardpic;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_iv_cardpic");
        return null;
    }

    @NotNull
    public final VImage get_iv_close() {
        VImage vImage = this._iv_close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_iv_close");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x0m x0mVar = this.frag;
        if (x0mVar == null || this.onSwipe) {
            return;
        }
        if (x0mVar == null) {
            Intrinsics.m88391r("frag");
            x0mVar = null;
        }
        x0mVar.mo37762r2();
        this.onSwipe = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45416c(this);
    }

    public final void setOnSwipe(boolean z) {
        this.onSwipe = z;
    }

    public final void set_boost_logo(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._boost_logo = vDraweeView;
    }

    public final void set_boost_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._boost_subtitle = vText;
    }

    public final void set_boost_title(@NotNull VText vText) {
        vText.getClass();
        this._boost_title = vText;
    }

    public final void set_btn_bottom(@NotNull VImage vImage) {
        vImage.getClass();
        this._btn_bottom = vImage;
    }

    public final void set_btn_title(@NotNull VText vText) {
        vText.getClass();
        this._btn_title = vText;
    }

    public final void set_guideline1(@NotNull Guideline guideline) {
        guideline.getClass();
        this._guideline1 = guideline;
    }

    public final void set_guideline2(@NotNull Guideline guideline) {
        guideline.getClass();
        this._guideline2 = guideline;
    }

    public final void set_iv_cardpic(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._iv_cardpic = vDraweeView;
    }

    public final void set_iv_close(@NotNull VImage vImage) {
        vImage.getClass();
        this._iv_close = vImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinBoostActiveCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MinBoostActiveCard(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
