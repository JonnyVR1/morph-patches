package com.p051p1.mobile.putong.core.p058ui.active;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.active.VipActiveCard;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.hol0;
import p153l.pf7;
import p153l.qa00;
import p153l.uqb0;
import p153l.x0m;
import p153l.x20;
import p153l.xlj;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00102\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\"\u00109\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010*\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006P"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/active/VipActiveCard;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", "onFinishInflate", "()V", "Ll/x0m;", "frag", "Lcom/p1/mobile/putong/core/data/Active;", Active.TYPE, "Ll/x20;", "action", "e", "(Ll/x0m;Lcom/p1/mobile/putong/core/data/Active;Ll/x20;)V", "onDetachedFromWindow", "Landroid/view/View;", OMSTemplateModeType.view, Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_iv_cardpic", "()Lv/VDraweeView;", "set_iv_cardpic", "(Lv/VDraweeView;)V", "_iv_cardpic", "b", "get_iv_vip_logo", "set_iv_vip_logo", "_iv_vip_logo", "Lv/VText;", "c", "Lv/VText;", "get_tv_vip_title", "()Lv/VText;", "set_tv_vip_title", "(Lv/VText;)V", "_tv_vip_title", "get_tv_vip_subtitle", "set_tv_vip_subtitle", "_tv_vip_subtitle", "Lv/VButton;", "Lv/VButton;", "get_btn_bottom", "()Lv/VButton;", "set_btn_bottom", "(Lv/VButton;)V", "_btn_bottom", "Lv/VImage;", "f", "Lv/VImage;", "get_iv_close", "()Lv/VImage;", "set_iv_close", "(Lv/VImage;)V", "_iv_close", "g", "get_tv_price", "set_tv_price", "_tv_price", "h", "Ll/x0m;", "", RXScreenCaptureService.KEY_INDEX, "Z", "getOnSwipe", "()Z", "setOnSwipe", "(Z)V", "onSwipe", "card_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VipActiveCard extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _iv_cardpic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _iv_vip_logo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _tv_vip_title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _tv_vip_subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VButton _btn_bottom;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _iv_close;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _tv_price;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public x0m frag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean onSwipe;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VipActiveCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m45430a(VipActiveCard vipActiveCard, Active active) {
        uqb0.f180374G.m127115L0(vipActiveCard.get_iv_cardpic(), active.cardBackgroundUrl);
        uqb0.f180374G.m127115L0(vipActiveCard.get_iv_vip_logo(), active.cardLogo);
    }

    /* JADX INFO: renamed from: b */
    public static void m45431b(x20 x20Var, View view) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m45432c(x0m x0mVar, View view) {
        x0mVar.mo37749V(SwipeDirection.LEFT);
    }

    /* JADX INFO: renamed from: d */
    public final void m45433d(View view) {
        hol0.m136449a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m45434e(@NotNull final x0m frag, @NotNull final Active active, @NotNull final x20 action) {
        frag.getClass();
        active.getClass();
        action.getClass();
        this.frag = frag;
        get_iv_cardpic().post(new Runnable() { // from class: l.col0
            @Override // java.lang.Runnable
            public final void run() {
                VipActiveCard.m45430a(this.f82898a, active);
            }
        });
        get_tv_vip_title().setText(active.cardTitle);
        get_tv_vip_subtitle().setText(active.cardDesc);
        if (TextUtils.isEmpty(active.cardBtnSubTitle)) {
            bnl0.m105524M(get_tv_price(), false);
        } else {
            get_tv_price().setText(active.cardBtnSubTitle);
        }
        get_btn_bottom().setText(active.cardBtnTitle);
        get_btn_bottom().setOnClickListener(new View.OnClickListener() { // from class: l.dol0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VipActiveCard.m45431b(action, view);
            }
        });
        float fM175859d = qa00.m175859d(20.0f);
        if (!pf7.m172093h() && IntlCountryCodeController.m29125v()) {
            fM175859d = 0.0f;
        }
        RoundingParams roundingParamsM8303c = RoundingParams.m8303c(fM175859d);
        roundingParamsM8303c.getClass();
        get_iv_cardpic().setHierarchy(new xlj(getResources()).m211636K(roundingParamsM8303c).m211638a());
        bnl0.m105524M(get_iv_close(), IntlCountryCodeController.m29125v());
        bnl0.m105509E0(get_iv_close(), new View.OnClickListener() { // from class: l.eol0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VipActiveCard.m45432c(frag, view);
            }
        });
    }

    public final boolean getOnSwipe() {
        return this.onSwipe;
    }

    @NotNull
    public final VButton get_btn_bottom() {
        VButton vButton = this._btn_bottom;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_btn_bottom");
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

    @NotNull
    public final VDraweeView get_iv_vip_logo() {
        VDraweeView vDraweeView = this._iv_vip_logo;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_iv_vip_logo");
        return null;
    }

    @NotNull
    public final VText get_tv_price() {
        VText vText = this._tv_price;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_price");
        return null;
    }

    @NotNull
    public final VText get_tv_vip_subtitle() {
        VText vText = this._tv_vip_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_vip_subtitle");
        return null;
    }

    @NotNull
    public final VText get_tv_vip_title() {
        VText vText = this._tv_vip_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_vip_title");
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
        m45433d(this);
    }

    public final void setOnSwipe(boolean z) {
        this.onSwipe = z;
    }

    public final void set_btn_bottom(@NotNull VButton vButton) {
        vButton.getClass();
        this._btn_bottom = vButton;
    }

    public final void set_iv_cardpic(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._iv_cardpic = vDraweeView;
    }

    public final void set_iv_close(@NotNull VImage vImage) {
        vImage.getClass();
        this._iv_close = vImage;
    }

    public final void set_iv_vip_logo(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._iv_vip_logo = vDraweeView;
    }

    public final void set_tv_price(@NotNull VText vText) {
        vText.getClass();
        this._tv_price = vText;
    }

    public final void set_tv_vip_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._tv_vip_subtitle = vText;
    }

    public final void set_tv_vip_title(@NotNull VText vText) {
        vText.getClass();
        this._tv_vip_title = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipActiveCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VipActiveCard(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
