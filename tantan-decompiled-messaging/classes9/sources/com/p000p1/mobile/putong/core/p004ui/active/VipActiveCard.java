package com.p000p1.mobile.putong.core.p004ui.active;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.core.p004ui.active.VipActiveCard;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.Active;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.dfl0;
import l.ejj;
import l.eyl;
import l.le7;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.qib0;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00102\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\"\u00109\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010*\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lcom/p1/mobile/putong/core/ui/active/VipActiveCard;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", "onFinishInflate", "()V", "Ll/eyl;", "frag", "Lcom/p1/mobile/putong/core/data/Active;", "active", "Ll/d30;", "action", "e", "(Ll/eyl;Lcom/p1/mobile/putong/core/data/Active;Ll/d30;)V", "onDetachedFromWindow", "Landroid/view/View;", "view", "d", "(Landroid/view/View;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_iv_cardpic", "()Lv/VDraweeView;", "set_iv_cardpic", "(Lv/VDraweeView;)V", "_iv_cardpic", "b", "get_iv_vip_logo", "set_iv_vip_logo", "_iv_vip_logo", "Lv/VText;", "c", "Lv/VText;", "get_tv_vip_title", "()Lv/VText;", "set_tv_vip_title", "(Lv/VText;)V", "_tv_vip_title", "get_tv_vip_subtitle", "set_tv_vip_subtitle", "_tv_vip_subtitle", "Lv/VButton;", "Lv/VButton;", "get_btn_bottom", "()Lv/VButton;", "set_btn_bottom", "(Lv/VButton;)V", "_btn_bottom", "Lv/VImage;", "f", "Lv/VImage;", "get_iv_close", "()Lv/VImage;", "set_iv_close", "(Lv/VImage;)V", "_iv_close", "g", "get_tv_price", "set_tv_price", "_tv_price", "h", "Ll/eyl;", "", "i", "Z", "getOnSwipe", "()Z", "setOnSwipe", "(Z)V", "onSwipe", "card_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public eyl frag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean onSwipe;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VipActiveCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m7195a(VipActiveCard vipActiveCard, Active active) {
        qib0.f19782G.m12744L0(vipActiveCard.get_iv_cardpic(), active.cardBackgroundUrl);
        qib0.f19782G.m12744L0(vipActiveCard.get_iv_vip_logo(), active.cardLogo);
    }

    /* JADX INFO: renamed from: b */
    public static void m7196b(d30 d30Var, View view) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7197c(eyl eylVar, View view) {
        eylVar.V(SwipeDirection.LEFT);
    }

    /* JADX INFO: renamed from: d */
    public final void m7198d(View view) {
        dfl0.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m7199e(@NotNull final eyl frag, @NotNull final Active active, @NotNull final d30 action) {
        frag.getClass();
        active.getClass();
        action.getClass();
        this.frag = frag;
        get_iv_cardpic().post(new Runnable() { // from class: l.yel0
            @Override // java.lang.Runnable
            public final void run() {
                VipActiveCard.m7195a(this.f28184a, active);
            }
        });
        get_tv_vip_title().setText(active.cardTitle);
        get_tv_vip_subtitle().setText(active.cardDesc);
        if (TextUtils.isEmpty(active.cardBtnSubTitle)) {
            xdl0.M(get_tv_price(), false);
        } else {
            get_tv_price().setText(active.cardBtnSubTitle);
        }
        get_btn_bottom().setText(active.cardBtnTitle);
        get_btn_bottom().setOnClickListener(new View.OnClickListener() { // from class: l.zel0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VipActiveCard.m7196b(action, view);
            }
        });
        float fD = t100.d(20.0f);
        if (!le7.h() && IntlCountryCodeController.m21v()) {
            fD = 0.0f;
        }
        RoundingParams roundingParamsC = RoundingParams.c(fD);
        roundingParamsC.getClass();
        get_iv_cardpic().setHierarchy(new ejj(getResources()).K(roundingParamsC).a());
        xdl0.M(get_iv_close(), IntlCountryCodeController.m21v());
        xdl0.E0(get_iv_close(), new View.OnClickListener() { // from class: l.afl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VipActiveCard.m7197c(frag, view);
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
        Intrinsics.r("_btn_bottom");
        return null;
    }

    @NotNull
    public final VDraweeView get_iv_cardpic() {
        VDraweeView vDraweeView = this._iv_cardpic;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_iv_cardpic");
        return null;
    }

    @NotNull
    public final VImage get_iv_close() {
        VImage vImage = this._iv_close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_iv_close");
        return null;
    }

    @NotNull
    public final VDraweeView get_iv_vip_logo() {
        VDraweeView vDraweeView = this._iv_vip_logo;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_iv_vip_logo");
        return null;
    }

    @NotNull
    public final VText get_tv_price() {
        VText vText = this._tv_price;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_price");
        return null;
    }

    @NotNull
    public final VText get_tv_vip_subtitle() {
        VText vText = this._tv_vip_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_vip_subtitle");
        return null;
    }

    @NotNull
    public final VText get_tv_vip_title() {
        VText vText = this._tv_vip_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_vip_title");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        eyl eylVar = this.frag;
        if (eylVar == null || this.onSwipe) {
            return;
        }
        if (eylVar == null) {
            Intrinsics.r("frag");
            eylVar = null;
        }
        eylVar.r2();
        this.onSwipe = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7198d(this);
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
