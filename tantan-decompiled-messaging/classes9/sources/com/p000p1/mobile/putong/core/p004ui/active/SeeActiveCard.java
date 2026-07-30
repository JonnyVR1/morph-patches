package com.p000p1.mobile.putong.core.p004ui.active;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.core.p004ui.active.SeeActiveCard;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.Active;
import com.p1.mobile.putong.core.data.SwipeDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import l.c7e0;
import l.d30;
import l.ejj;
import l.eyl;
import l.o7r;
import l.t100;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.i6c0;
import p006l.qib0;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0014¢\u0006\u0004\b \u0010\u0012R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010>\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u00106\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\"\u0010E\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u00106\u001a\u0004\bO\u00108\"\u0004\bP\u0010:R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010g\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010^\u001a\u0004\be\u0010`\"\u0004\bf\u0010bR\"\u0010k\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010^\u001a\u0004\bi\u0010`\"\u0004\bj\u0010bR\"\u0010o\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010^\u001a\u0004\bm\u0010`\"\u0004\bn\u0010b¨\u0006p"}, d2 = {"Lcom/p1/mobile/putong/core/ui/active/SeeActiveCard;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "", "d", "(Landroid/view/View;)V", "onFinishInflate", "()V", "Ll/eyl;", "frag", "Lcom/p1/mobile/putong/core/data/Active;", "active", "Ll/d30;", "action", "f", "(Ll/eyl;Lcom/p1/mobile/putong/core/data/Active;Ll/d30;)V", "", "", "avatarUrls", "e", "(Ljava/util/List;)V", "onDetachedFromWindow", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_iv_cardpic", "()Lv/VDraweeView;", "set_iv_cardpic", "(Lv/VDraweeView;)V", "_iv_cardpic", "b", "get_iv_see_logo", "set_iv_see_logo", "_iv_see_logo", "Lv/VLinear;", "c", "Lv/VLinear;", "get_vl_head_layout", "()Lv/VLinear;", "set_vl_head_layout", "(Lv/VLinear;)V", "_vl_head_layout", "Lv/VText;", "Lv/VText;", "get_tv_see_title", "()Lv/VText;", "set_tv_see_title", "(Lv/VText;)V", "_tv_see_title", "get_tv_see_subtitle", "set_tv_see_subtitle", "_tv_see_subtitle", "Lv/VButton;", "Lv/VButton;", "get_btn_bottom", "()Lv/VButton;", "set_btn_bottom", "(Lv/VButton;)V", "_btn_bottom", "Lv/VImage;", "g", "Lv/VImage;", "get_iv_close", "()Lv/VImage;", "set_iv_close", "(Lv/VImage;)V", "_iv_close", "h", "get_tv_price", "set_tv_price", "_tv_price", "i", "Ll/eyl;", "", "j", "Z", "getOnSwipe", "()Z", "setOnSwipe", "(Z)V", "onSwipe", "Lcom/p1/mobile/putong/core/ui/active/SeeActiveHeadItem;", "k", "Lcom/p1/mobile/putong/core/ui/active/SeeActiveHeadItem;", "getVl_head_layout_item_one", "()Lcom/p1/mobile/putong/core/ui/active/SeeActiveHeadItem;", "setVl_head_layout_item_one", "(Lcom/p1/mobile/putong/core/ui/active/SeeActiveHeadItem;)V", "vl_head_layout_item_one", "l", "getVl_head_layout_item_two", "setVl_head_layout_item_two", "vl_head_layout_item_two", "m", "getVl_head_layout_item_three", "setVl_head_layout_item_three", "vl_head_layout_item_three", "n", "getVl_head_layout_item_four", "setVl_head_layout_item_four", "vl_head_layout_item_four", "card_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SeeActiveCard extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _iv_cardpic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _iv_see_logo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VLinear _vl_head_layout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _tv_see_title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _tv_see_subtitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VButton _btn_bottom;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _iv_close;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _tv_price;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public eyl frag;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean onSwipe;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public SeeActiveHeadItem vl_head_layout_item_one;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public SeeActiveHeadItem vl_head_layout_item_two;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public SeeActiveHeadItem vl_head_layout_item_three;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public SeeActiveHeadItem vl_head_layout_item_four;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeeActiveCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m7183a(SeeActiveCard seeActiveCard, d30 d30Var, View view) {
        if (xdl0.O0(seeActiveCard.get_vl_head_layout())) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7184b(eyl eylVar, View view) {
        eylVar.V(SwipeDirection.LEFT);
    }

    /* JADX INFO: renamed from: c */
    public static void m7185c(d30 d30Var, View view) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: d */
    public final void m7186d(View view) {
        c7e0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final void m7187e(@NotNull List<String> avatarUrls) {
        avatarUrls.getClass();
        if (vwb.J(avatarUrls)) {
            xdl0.M0(get_vl_head_layout(), false);
            return;
        }
        int iE = a.e(avatarUrls.size(), get_vl_head_layout().getChildCount());
        xdl0.M0(get_vl_head_layout(), true);
        int i = 0;
        while (i < iE) {
            View viewA = ViewGroupKt.a(get_vl_head_layout(), i);
            if (viewA instanceof SeeActiveHeadItem) {
                xdl0.M(viewA, true);
                ((SeeActiveHeadItem) viewA).m7190s(avatarUrls.get(i), i == 3);
            }
            i++;
        }
        if (iE < get_vl_head_layout().getChildCount()) {
            int childCount = get_vl_head_layout().getChildCount();
            while (iE < childCount) {
                xdl0.M(ViewGroupKt.a(get_vl_head_layout(), iE), false);
                iE++;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7188f(@NotNull final eyl frag, @NotNull Active active, @NotNull final d30 action) {
        frag.getClass();
        active.getClass();
        action.getClass();
        this.frag = frag;
        qib0.f19782G.m12744L0(get_iv_see_logo(), active.cardLogo);
        qib0.f19782G.m12744L0(get_iv_cardpic(), active.cardBackgroundUrl);
        xdl0.H0(get_tv_see_title(), active.cardTitle);
        xdl0.H0(get_tv_see_subtitle(), active.cardDesc);
        if (TextUtils.isEmpty(active.cardBtnSubTitle)) {
            xdl0.M(get_tv_price(), false);
        } else {
            get_tv_price().setText(active.cardBtnSubTitle);
        }
        get_btn_bottom().setText(active.cardBtnTitle);
        get_btn_bottom().setOnClickListener(new View.OnClickListener() { // from class: l.x6e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SeeActiveCard.m7185c(action, view);
            }
        });
        get_vl_head_layout().setOnClickListener(new View.OnClickListener() { // from class: l.y6e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SeeActiveCard.m7183a(this.f28059a, action, view);
            }
        });
        float fD = t100.d(20.0f);
        if (IntlCountryCodeController.m21v()) {
            fD = 0.0f;
        }
        RoundingParams roundingParamsC = RoundingParams.c(fD);
        roundingParamsC.getClass();
        get_iv_cardpic().setHierarchy(new ejj(getResources()).K(roundingParamsC).a());
        xdl0.M(get_iv_close(), IntlCountryCodeController.m21v());
        xdl0.E0(get_iv_close(), new View.OnClickListener() { // from class: l.z6e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SeeActiveCard.m7184b(frag, view);
            }
        });
    }

    public final boolean getOnSwipe() {
        return this.onSwipe;
    }

    @NotNull
    public final SeeActiveHeadItem getVl_head_layout_item_four() {
        SeeActiveHeadItem seeActiveHeadItem = this.vl_head_layout_item_four;
        if (seeActiveHeadItem != null) {
            return seeActiveHeadItem;
        }
        Intrinsics.r("vl_head_layout_item_four");
        return null;
    }

    @NotNull
    public final SeeActiveHeadItem getVl_head_layout_item_one() {
        SeeActiveHeadItem seeActiveHeadItem = this.vl_head_layout_item_one;
        if (seeActiveHeadItem != null) {
            return seeActiveHeadItem;
        }
        Intrinsics.r("vl_head_layout_item_one");
        return null;
    }

    @NotNull
    public final SeeActiveHeadItem getVl_head_layout_item_three() {
        SeeActiveHeadItem seeActiveHeadItem = this.vl_head_layout_item_three;
        if (seeActiveHeadItem != null) {
            return seeActiveHeadItem;
        }
        Intrinsics.r("vl_head_layout_item_three");
        return null;
    }

    @NotNull
    public final SeeActiveHeadItem getVl_head_layout_item_two() {
        SeeActiveHeadItem seeActiveHeadItem = this.vl_head_layout_item_two;
        if (seeActiveHeadItem != null) {
            return seeActiveHeadItem;
        }
        Intrinsics.r("vl_head_layout_item_two");
        return null;
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
    public final VDraweeView get_iv_see_logo() {
        VDraweeView vDraweeView = this._iv_see_logo;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_iv_see_logo");
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
    public final VText get_tv_see_subtitle() {
        VText vText = this._tv_see_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_see_subtitle");
        return null;
    }

    @NotNull
    public final VText get_tv_see_title() {
        VText vText = this._tv_see_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_see_title");
        return null;
    }

    @NotNull
    public final VLinear get_vl_head_layout() {
        VLinear vLinear = this._vl_head_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_vl_head_layout");
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
        m7186d(this);
        Object objInflate = o7r.a(getContext()).inflate(i6c0.f14253n, (ViewGroup) this, false);
        objInflate.getClass();
        setVl_head_layout_item_one((SeeActiveHeadItem) objInflate);
        Object objInflate2 = o7r.a(getContext()).inflate(i6c0.f14253n, (ViewGroup) this, false);
        objInflate2.getClass();
        setVl_head_layout_item_two((SeeActiveHeadItem) objInflate2);
        getVl_head_layout_item_two().getLayoutParams();
        Object objInflate3 = o7r.a(getContext()).inflate(i6c0.f14253n, (ViewGroup) this, false);
        objInflate3.getClass();
        setVl_head_layout_item_three((SeeActiveHeadItem) objInflate3);
        Object objInflate4 = o7r.a(getContext()).inflate(i6c0.f14253n, (ViewGroup) this, false);
        objInflate4.getClass();
        setVl_head_layout_item_four((SeeActiveHeadItem) objInflate4);
        List listListOf = CollectionsKt.listOf(new SeeActiveHeadItem[]{getVl_head_layout_item_one(), getVl_head_layout_item_two(), getVl_head_layout_item_three(), getVl_head_layout_item_four()});
        int size = listListOf.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                xdl0.V((View) listListOf.get(i), t100.d(-12.0f));
            }
            xdl0.M((View) listListOf.get(i), false);
            get_vl_head_layout().addView((View) listListOf.get(i));
        }
    }

    public final void setOnSwipe(boolean z) {
        this.onSwipe = z;
    }

    public final void setVl_head_layout_item_four(@NotNull SeeActiveHeadItem seeActiveHeadItem) {
        seeActiveHeadItem.getClass();
        this.vl_head_layout_item_four = seeActiveHeadItem;
    }

    public final void setVl_head_layout_item_one(@NotNull SeeActiveHeadItem seeActiveHeadItem) {
        seeActiveHeadItem.getClass();
        this.vl_head_layout_item_one = seeActiveHeadItem;
    }

    public final void setVl_head_layout_item_three(@NotNull SeeActiveHeadItem seeActiveHeadItem) {
        seeActiveHeadItem.getClass();
        this.vl_head_layout_item_three = seeActiveHeadItem;
    }

    public final void setVl_head_layout_item_two(@NotNull SeeActiveHeadItem seeActiveHeadItem) {
        seeActiveHeadItem.getClass();
        this.vl_head_layout_item_two = seeActiveHeadItem;
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

    public final void set_iv_see_logo(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._iv_see_logo = vDraweeView;
    }

    public final void set_tv_price(@NotNull VText vText) {
        vText.getClass();
        this._tv_price = vText;
    }

    public final void set_tv_see_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._tv_see_subtitle = vText;
    }

    public final void set_tv_see_title(@NotNull VText vText) {
        vText.getClass();
        this._tv_see_title = vText;
    }

    public final void set_vl_head_layout(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._vl_head_layout = vLinear;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeeActiveCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeeActiveCard(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
