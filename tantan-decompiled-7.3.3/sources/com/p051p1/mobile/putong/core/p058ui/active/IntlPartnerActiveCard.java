package com.p051p1.mobile.putong.core.p058ui.active;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.FloatsCardData;
import com.p051p1.mobile.putong.core.data.IntlInsertCardData;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.active.IntlPartnerActiveCard;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundLinearLayout;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundRelativeLayout;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.qa00;
import p153l.sfj0;
import p153l.uqb0;
import p153l.x0m;
import p153l.xro;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u0016R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\"\u0010-\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010!\u001a\u0004\b+\u0010#\"\u0004\b,\u0010%R\"\u00104\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010>\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u00106\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010R\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010A\u001a\u0004\bP\u0010C\"\u0004\bQ\u0010ER\"\u0010V\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010/\u001a\u0004\bT\u00101\"\u0004\bU\u00103R\"\u0010\\\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\u0010R\"\u0010`\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010X\u001a\u0004\b^\u0010Z\"\u0004\b_\u0010\u0010R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\ba\u0010bR\"\u0010h\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010\u0014¨\u0006i"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/active/IntlPartnerActiveCard;", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "", "isUs", "e", "(Z)V", "f", "()V", "onFinishInflate", "Ll/x0m;", "frag", "Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", Active.TYPE, "g", "(Ll/x0m;Lcom/p1/mobile/putong/core/data/IntlInsertCardData;)V", "onDetachedFromWindow", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "get_card_bg", "()Lv/VDraweeView;", "set_card_bg", "(Lv/VDraweeView;)V", "_card_bg", "c", "get_us_card_bg", "set_us_card_bg", "_us_card_bg", "get_card_bottom_bg", "set_card_bottom_bg", "_card_bottom_bg", "Lv/VLinear;", "Lv/VLinear;", "get_user_info", "()Lv/VLinear;", "set_user_info", "(Lv/VLinear;)V", "_user_info", "Lv/VText;", "Lv/VText;", "get_user_info_title", "()Lv/VText;", "set_user_info_title", "(Lv/VText;)V", "_user_info_title", "get_user_info_age", "set_user_info_age", "_user_info_age", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "get_desc_text", "()Landroid/widget/TextView;", "set_desc_text", "(Landroid/widget/TextView;)V", "_desc_text", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundLinearLayout;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundLinearLayout;", "get_btn_bottom", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundLinearLayout;", "set_btn_bottom", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundLinearLayout;)V", "_btn_bottom", "j", "get_btn_bottom_btn_bottom_text", "set_btn_bottom_btn_bottom_text", "_btn_bottom_btn_bottom_text", "k", "get_buttons_us", "set_buttons_us", "_buttons_us", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/view/View;", "get_buttons_us_like_us", "()Landroid/view/View;", "set_buttons_us_like_us", "_buttons_us_like_us", "m", "get_buttons_us_dislike_us", "set_buttons_us_dislike_us", "_buttons_us_dislike_us", "n", "Ll/x0m;", "o", "Z", "getOnSwipe", "()Z", "setOnSwipe", "onSwipe", "card_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlPartnerActiveCard extends RoundRelativeLayout {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _card_bg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VDraweeView _us_card_bg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _card_bottom_bg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _user_info;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _user_info_title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _user_info_age;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _desc_text;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public RoundLinearLayout _btn_bottom;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public TextView _btn_bottom_btn_bottom_text;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VLinear _buttons_us;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _buttons_us_like_us;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public View _buttons_us_dislike_us;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public x0m frag;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean onSwipe;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlPartnerActiveCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m45401a(IntlPartnerActiveCard intlPartnerActiveCard, View view) {
        intlPartnerActiveCard.m45406f();
    }

    /* JADX INFO: renamed from: b */
    public static void m45402b(IntlPartnerActiveCard intlPartnerActiveCard, View view) {
        x0m x0mVar = intlPartnerActiveCard.frag;
        if (x0mVar == null) {
            Intrinsics.m88391r("frag");
            x0mVar = null;
        }
        x0mVar.mo37749V(SwipeDirection.LEFT);
    }

    /* JADX INFO: renamed from: c */
    public static void m45403c(IntlPartnerActiveCard intlPartnerActiveCard, View view) {
        intlPartnerActiveCard.m45406f();
    }

    /* JADX INFO: renamed from: d */
    public final void m45404d(View view) {
        xro.m212845a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m45405e(boolean isUs) {
        setRadius(isUs ? 0.0f : 23.0f);
        bnl0.m105524M(get_us_card_bg(), isUs);
        bnl0.m105524M(get_buttons_us(), isUs);
        bnl0.m105524M(get_card_bg(), !isUs);
        bnl0.m105539W(get_user_info(), isUs ? qa00.f156302O : 0);
        bnl0.m105539W(get_desc_text(), isUs ? qa00.f156302O : 0);
        if (isUs) {
            bnl0.m105509E0(get_buttons_us_like_us(), new View.OnClickListener() { // from class: l.rro
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlPartnerActiveCard.m45401a(this.f164590a, view);
                }
            });
            bnl0.m105509E0(get_buttons_us_dislike_us(), new View.OnClickListener() { // from class: l.sro
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlPartnerActiveCard.m45402b(this.f170361a, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m45406f() {
        x0m x0mVar = this.frag;
        x0m x0mVar2 = null;
        if (x0mVar == null) {
            Intrinsics.m88391r("frag");
            x0mVar = null;
        }
        x0mVar.mo37755b3(SwipeDirection.RIGHT, true);
        x0m x0mVar3 = this.frag;
        if (x0mVar3 == null) {
            Intrinsics.m88391r("frag");
        } else {
            x0mVar2 = x0mVar3;
        }
        sfj0.m185596c("e_intl_iqiyi_activities_card_button", x0mVar2.mo37764u0(), new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: g */
    public final void m45407g(@NotNull x0m frag, @NotNull IntlInsertCardData active) {
        frag.getClass();
        active.getClass();
        this.frag = frag;
        User user = active.floatUserCardData.user;
        if (user != null) {
            List<Media> list = user.pictures;
            if (list != null && list.size() > 0) {
                if (IntlCountryCodeController.m29125v()) {
                    uqb0.f180374G.m127115L0(get_us_card_bg(), user.m61308fp().url);
                } else {
                    uqb0.f180374G.m127115L0(get_card_bg(), user.m61308fp().url);
                }
            }
            get_user_info_title().setText(user.name);
            get_user_info_age().setText(String.valueOf(user.age.intValue()));
        }
        FloatsCardData floatsCardData = active.floatUserCardData.floatCardData;
        if (floatsCardData != null) {
            get_desc_text().setText(floatsCardData.title);
            get_btn_bottom_btn_bottom_text().setText(floatsCardData.buttonTitle);
            try {
                get_btn_bottom_btn_bottom_text().setTextColor(Color.parseColor(floatsCardData.buttonTitleColor));
                get_btn_bottom().setBackgroundColor(Color.parseColor(floatsCardData.buttonColor));
                setBackgroundColor(Color.parseColor(floatsCardData.borderColor));
                get_card_bottom_bg().getLayoutParams().height = bnl0.m105587w(floatsCardData.gradualHeight);
                uqb0.f180374G.m127115L0(get_card_bottom_bg(), floatsCardData.gradualImg);
            } catch (Exception unused) {
            }
        }
        bnl0.m105509E0(get_btn_bottom(), new View.OnClickListener() { // from class: l.tro
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPartnerActiveCard.m45403c(this.f175894a, view);
            }
        });
    }

    public final boolean getOnSwipe() {
        return this.onSwipe;
    }

    @NotNull
    public final RoundLinearLayout get_btn_bottom() {
        RoundLinearLayout roundLinearLayout = this._btn_bottom;
        if (roundLinearLayout != null) {
            return roundLinearLayout;
        }
        Intrinsics.m88391r("_btn_bottom");
        return null;
    }

    @NotNull
    public final TextView get_btn_bottom_btn_bottom_text() {
        TextView textView = this._btn_bottom_btn_bottom_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_btn_bottom_btn_bottom_text");
        return null;
    }

    @NotNull
    public final VLinear get_buttons_us() {
        VLinear vLinear = this._buttons_us;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_buttons_us");
        return null;
    }

    @NotNull
    public final View get_buttons_us_dislike_us() {
        View view = this._buttons_us_dislike_us;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_buttons_us_dislike_us");
        return null;
    }

    @NotNull
    public final View get_buttons_us_like_us() {
        View view = this._buttons_us_like_us;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_buttons_us_like_us");
        return null;
    }

    @NotNull
    public final VDraweeView get_card_bg() {
        VDraweeView vDraweeView = this._card_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_card_bg");
        return null;
    }

    @NotNull
    public final VDraweeView get_card_bottom_bg() {
        VDraweeView vDraweeView = this._card_bottom_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_card_bottom_bg");
        return null;
    }

    @NotNull
    public final TextView get_desc_text() {
        TextView textView = this._desc_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_desc_text");
        return null;
    }

    @NotNull
    public final VDraweeView get_us_card_bg() {
        VDraweeView vDraweeView = this._us_card_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_us_card_bg");
        return null;
    }

    @NotNull
    public final VLinear get_user_info() {
        VLinear vLinear = this._user_info;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_user_info");
        return null;
    }

    @NotNull
    public final VText get_user_info_age() {
        VText vText = this._user_info_age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_user_info_age");
        return null;
    }

    @NotNull
    public final VText get_user_info_title() {
        VText vText = this._user_info_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_user_info_title");
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
        m45404d(this);
        m45405e(IntlCountryCodeController.m29125v());
    }

    public final void setOnSwipe(boolean z) {
        this.onSwipe = z;
    }

    public final void set_btn_bottom(@NotNull RoundLinearLayout roundLinearLayout) {
        roundLinearLayout.getClass();
        this._btn_bottom = roundLinearLayout;
    }

    public final void set_btn_bottom_btn_bottom_text(@NotNull TextView textView) {
        textView.getClass();
        this._btn_bottom_btn_bottom_text = textView;
    }

    public final void set_buttons_us(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._buttons_us = vLinear;
    }

    public final void set_buttons_us_dislike_us(@NotNull View view) {
        view.getClass();
        this._buttons_us_dislike_us = view;
    }

    public final void set_buttons_us_like_us(@NotNull View view) {
        view.getClass();
        this._buttons_us_like_us = view;
    }

    public final void set_card_bg(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._card_bg = vDraweeView;
    }

    public final void set_card_bottom_bg(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._card_bottom_bg = vDraweeView;
    }

    public final void set_desc_text(@NotNull TextView textView) {
        textView.getClass();
        this._desc_text = textView;
    }

    public final void set_us_card_bg(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._us_card_bg = vDraweeView;
    }

    public final void set_user_info(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._user_info = vLinear;
    }

    public final void set_user_info_age(@NotNull VText vText) {
        vText.getClass();
        this._user_info_age = vText;
    }

    public final void set_user_info_title(@NotNull VText vText) {
        vText.getClass();
        this._user_info_title = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlPartnerActiveCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlPartnerActiveCard(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
