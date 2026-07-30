package com.p046p1.mobile.putong.core.p053ui.active;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.RecallMembershipData;
import com.p046p1.mobile.putong.core.p053ui.active.IntlRecallMembershipCard;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VText;
import p149l.d30;
import p149l.eyl;
import p149l.hvc0;
import p149l.o8p;
import p149l.qib0;
import p149l.xdl0;
import p149l.y0c0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0015¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\"\u00107\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010\u001e\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R\"\u0010;\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010\u001e\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R\"\u0010?\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010*\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006J"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/active/IntlRecallMembershipCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", "onFinishInflate", "()V", "Ll/eyl;", "frag", "Lcom/p1/mobile/putong/core/data/RecallMembershipData;", Active.TYPE, "Ll/d30;", "action", "j0", "(Ll/eyl;Lcom/p1/mobile/putong/core/data/RecallMembershipData;Ll/d30;)V", "onDetachedFromWindow", "Landroid/view/View;", OMSTemplateModeType.view, "i0", "(Landroid/view/View;)V", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_card_bg", "()Lv/VDraweeView;", "set_card_bg", "(Lv/VDraweeView;)V", "_card_bg", "e", "get_card_icon", "set_card_icon", "_card_icon", "Lv/VText;", "f", "Lv/VText;", "get_card_title", "()Lv/VText;", "set_card_title", "(Lv/VText;)V", "_card_title", "g", "get_card_subtitle", "set_card_subtitle", "_card_subtitle", "h", "get_card_big_icon", "set_card_big_icon", "_card_big_icon", RXScreenCaptureService.KEY_INDEX, "get_card_btn_bg", "set_card_btn_bg", "_card_btn_bg", "j", "get_card_btn", "set_card_btn", "_card_btn", "k", "Ll/eyl;", "", BLiveStormDanmakuGiftResourceType.f44444l, "Z", "getOnSwipe", "()Z", "setOnSwipe", "(Z)V", "onSwipe", "card_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlRecallMembershipCard extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _card_bg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _card_icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _card_title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _card_subtitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VDraweeView _card_big_icon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VDraweeView _card_btn_bg;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _card_btn;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public eyl frag;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean onSwipe;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlRecallMembershipCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m44225h0(d30 d30Var, View view) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    public final boolean getOnSwipe() {
        return this.onSwipe;
    }

    @NotNull
    public final VDraweeView get_card_bg() {
        VDraweeView vDraweeView = this._card_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_card_bg");
        return null;
    }

    @NotNull
    public final VDraweeView get_card_big_icon() {
        VDraweeView vDraweeView = this._card_big_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_card_big_icon");
        return null;
    }

    @NotNull
    public final VText get_card_btn() {
        VText vText = this._card_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_card_btn");
        return null;
    }

    @NotNull
    public final VDraweeView get_card_btn_bg() {
        VDraweeView vDraweeView = this._card_btn_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_card_btn_bg");
        return null;
    }

    @NotNull
    public final VDraweeView get_card_icon() {
        VDraweeView vDraweeView = this._card_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_card_icon");
        return null;
    }

    @NotNull
    public final VText get_card_subtitle() {
        VText vText = this._card_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_card_subtitle");
        return null;
    }

    @NotNull
    public final VText get_card_title() {
        VText vText = this._card_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_card_title");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m44226i0(View view) {
        o8p.m163189a(this, view);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00a1  */
    /* JADX INFO: renamed from: j0 */
    public final void m44227j0(@NotNull eyl frag, @NotNull RecallMembershipData active, @NotNull final d30 action) {
        frag.getClass();
        active.getClass();
        action.getClass();
        this.frag = frag;
        if (IntlCountryCodeController.m28126v()) {
            get_card_bg().getHierarchy().m112053H(RoundingParams.m8249c(0.0f));
        }
        String str = active.membershipType;
        int iHashCode = str.hashCode();
        if (iHashCode != 113747) {
            if (iHashCode == 3542730 && str.equals("svip")) {
                qib0.f154691G.m102331L0(get_card_bg(), "https://auto.tancdn.com/v1/raw/5bd1c29a-ae6a-4531-9992-7a3964e5507212.webp");
                qib0.f154691G.m102331L0(get_card_icon(), "https://auto.tancdn.com/v1/raw/30df5377-5c27-4fb2-83c9-ad0fe237944212.webp");
                qib0.f154691G.m102331L0(get_card_big_icon(), "https://auto.tancdn.com/v1/raw/fd0f953c-edca-4a0b-bf82-f9a139118fa112.webp");
                qib0.f154691G.m102331L0(get_card_big_icon(), "https://auto.tancdn.com/v1/raw/fd0f953c-edca-4a0b-bf82-f9a139118fa112.webp");
                qib0.f154691G.m102331L0(get_card_btn_bg(), "https://auto.tancdn.com/v1/raw/5e2b41f2-01dd-488e-be41-4a74a16b09a013.webp");
                get_card_title().setTextColor(hvc0.m133154a(y0c0.f195293e));
                get_card_subtitle().setTextColor(hvc0.m133154a(y0c0.f195291c));
                get_card_btn().setTextColor(hvc0.m133154a(y0c0.f195290b));
            } else {
                qib0.f154691G.m102331L0(get_card_bg(), "https://auto.tancdn.com/v1/raw/eaaa3c66-2ed1-4d57-8428-7c760dd5203d13.webp");
                qib0.f154691G.m102331L0(get_card_icon(), "https://auto.tancdn.com/v1/raw/d32d8f32-0656-48b2-a3cd-afb6e355349813.webp");
                qib0.f154691G.m102331L0(get_card_big_icon(), "https://auto.tancdn.com/v1/raw/5a9c8073-5bc0-41bd-b204-69fe78d835fc12.webp");
                qib0.f154691G.m102331L0(get_card_btn_bg(), "https://auto.tancdn.com/v1/raw/cf6fb8cb-7e97-45cf-9d97-4def35aafa3813.webp");
            }
        } else if (str.equals("see")) {
            qib0.f154691G.m102331L0(get_card_bg(), "https://auto.tancdn.com/v1/raw/55aabeb3-551f-4e97-9271-f7ceb631fe0412.webp");
            qib0.f154691G.m102331L0(get_card_icon(), "https://auto.tancdn.com/v1/raw/2120bc9a-4422-4799-956d-16a5ab1e627413.webp");
            qib0.f154691G.m102331L0(get_card_big_icon(), "https://auto.tancdn.com/v1/raw/a3bba8ff-55b3-4a2f-8e85-112e5d4f08e413.webp");
            qib0.f154691G.m102331L0(get_card_btn_bg(), "https://auto.tancdn.com/v1/raw/4933c41c-80e4-4a30-8eaa-e74f389f238012.webp");
        } else {
            qib0.f154691G.m102331L0(get_card_bg(), "https://auto.tancdn.com/v1/raw/eaaa3c66-2ed1-4d57-8428-7c760dd5203d13.webp");
            qib0.f154691G.m102331L0(get_card_icon(), "https://auto.tancdn.com/v1/raw/d32d8f32-0656-48b2-a3cd-afb6e355349813.webp");
            qib0.f154691G.m102331L0(get_card_big_icon(), "https://auto.tancdn.com/v1/raw/5a9c8073-5bc0-41bd-b204-69fe78d835fc12.webp");
            qib0.f154691G.m102331L0(get_card_btn_bg(), "https://auto.tancdn.com/v1/raw/cf6fb8cb-7e97-45cf-9d97-4def35aafa3813.webp");
        }
        get_card_title().setText(active.cardTitle);
        get_card_subtitle().setText(active.cardDesc);
        get_card_btn().setText(active.cardBtnTitle);
        xdl0.m208329E0(get_card_btn(), new View.OnClickListener() { // from class: l.n8p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlRecallMembershipCard.m44225h0(action, view);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        eyl eylVar = this.frag;
        if (eylVar == null || this.onSwipe) {
            return;
        }
        if (eylVar == null) {
            Intrinsics.m87502r("frag");
            eylVar = null;
        }
        eylVar.mo36759r2();
        this.onSwipe = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44226i0(this);
    }

    public final void setOnSwipe(boolean z) {
        this.onSwipe = z;
    }

    public final void set_card_bg(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._card_bg = vDraweeView;
    }

    public final void set_card_big_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._card_big_icon = vDraweeView;
    }

    public final void set_card_btn(@NotNull VText vText) {
        vText.getClass();
        this._card_btn = vText;
    }

    public final void set_card_btn_bg(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._card_btn_bg = vDraweeView;
    }

    public final void set_card_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._card_icon = vDraweeView;
    }

    public final void set_card_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._card_subtitle = vText;
    }

    public final void set_card_title(@NotNull VText vText) {
        vText.getClass();
        this._card_title = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlRecallMembershipCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlRecallMembershipCard(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
