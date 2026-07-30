package com.p000p1.mobile.putong.core.p004ui.active;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.core.p004ui.active.SpotlightActiveCard;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.Active;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.ejj;
import l.eyl;
import l.hqf0;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.qib0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\"\u00103\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010?\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\"\u0010C\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010&\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lcom/p1/mobile/putong/core/ui/active/SpotlightActiveCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", "onFinishInflate", "()V", "Ll/eyl;", "frag", "Lcom/p1/mobile/putong/core/data/Active;", "active", "Ll/d30;", "action", "k0", "(Ll/eyl;Lcom/p1/mobile/putong/core/data/Active;Ll/d30;)V", "onDetachedFromWindow", "Landroid/view/View;", "view", "j0", "(Landroid/view/View;)V", "Lv/VDraweeView;", "d", "Lv/VDraweeView;", "get_card_bg", "()Lv/VDraweeView;", "set_card_bg", "(Lv/VDraweeView;)V", "_card_bg", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "f", "get_desc_img", "set_desc_img", "_desc_img", "g", "get_desc_text", "set_desc_text", "_desc_text", "Lv/VImage;", "h", "Lv/VImage;", "get_btn_bottom", "()Lv/VImage;", "set_btn_bottom", "(Lv/VImage;)V", "_btn_bottom", "i", "get_iv_close", "set_iv_close", "_iv_close", "j", "get_btn_title", "set_btn_title", "_btn_title", "k", "Ll/eyl;", "", "l", "Z", "getOnSwipe", "()Z", "setOnSwipe", "(Z)V", "onSwipe", "card_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SpotlightActiveCard extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _card_bg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _desc_img;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _desc_text;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _btn_bottom;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VImage _iv_close;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public TextView _btn_title;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public eyl frag;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean onSwipe;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpotlightActiveCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m7191h0(eyl eylVar, View view) {
        eylVar.V(SwipeDirection.LEFT);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m7192i0(d30 d30Var, View view) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    public final boolean getOnSwipe() {
        return this.onSwipe;
    }

    @NotNull
    public final VImage get_btn_bottom() {
        VImage vImage = this._btn_bottom;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_btn_bottom");
        return null;
    }

    @NotNull
    public final TextView get_btn_title() {
        TextView textView = this._btn_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_btn_title");
        return null;
    }

    @NotNull
    public final VDraweeView get_card_bg() {
        VDraweeView vDraweeView = this._card_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_card_bg");
        return null;
    }

    @NotNull
    public final VDraweeView get_desc_img() {
        VDraweeView vDraweeView = this._desc_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_desc_img");
        return null;
    }

    @NotNull
    public final TextView get_desc_text() {
        TextView textView = this._desc_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_desc_text");
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
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m7193j0(View view) {
        hqf0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final void m7194k0(@NotNull final eyl frag, @NotNull Active active, @NotNull final d30 action) {
        frag.getClass();
        active.getClass();
        action.getClass();
        this.frag = frag;
        qib0.f19782G.m12744L0(get_card_bg(), active.cardBackgroundUrl);
        qib0.f19782G.m12744L0(get_desc_img(), active.cardLogo);
        get_title().setText(active.cardTitle);
        get_desc_text().setText(active.cardDesc);
        get_btn_title().setText(active.cardBtnTitle);
        xdl0.E0(get_btn_bottom(), new View.OnClickListener() { // from class: l.xpf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpotlightActiveCard.m7192i0(action, view);
            }
        });
        float fD = t100.d(20.0f);
        if (IntlCountryCodeController.m21v()) {
            fD = 0.0f;
        }
        RoundingParams roundingParamsC = RoundingParams.c(fD);
        roundingParamsC.getClass();
        get_card_bg().setHierarchy(new ejj(getResources()).K(roundingParamsC).a());
        xdl0.M(get_iv_close(), IntlCountryCodeController.m21v());
        xdl0.E0(get_iv_close(), new View.OnClickListener() { // from class: l.ypf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpotlightActiveCard.m7191h0(frag, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
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

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7193j0(this);
    }

    public final void setOnSwipe(boolean z) {
        this.onSwipe = z;
    }

    public final void set_btn_bottom(@NotNull VImage vImage) {
        vImage.getClass();
        this._btn_bottom = vImage;
    }

    public final void set_btn_title(@NotNull TextView textView) {
        textView.getClass();
        this._btn_title = textView;
    }

    public final void set_card_bg(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._card_bg = vDraweeView;
    }

    public final void set_desc_img(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._desc_img = vDraweeView;
    }

    public final void set_desc_text(@NotNull TextView textView) {
        textView.getClass();
        this._desc_text = textView;
    }

    public final void set_iv_close(@NotNull VImage vImage) {
        vImage.getClass();
        this._iv_close = vImage;
    }

    public final void set_title(@NotNull TextView textView) {
        textView.getClass();
        this._title = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotlightActiveCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpotlightActiveCard(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
