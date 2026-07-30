package com.p051p1.mobile.putong.core.p058ui.toppicks;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundFrameLayout;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundTextView;
import com.p051p1.mobile.putong.core.p058ui.toppicks.TopPicksItemView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.qa00;
import p153l.r5j0;
import p153l.uqb0;
import p153l.v5j0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010.\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u000eR\"\u00105\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010<\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010C\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR\"\u0010K\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010>\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010BR\"\u0010O\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u00100\u001a\u0004\bM\u00102\"\u0004\bN\u00104R\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010>\u001a\u0004\bY\u0010@\"\u0004\bZ\u0010BR\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010g\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u00100\u001a\u0004\be\u00102\"\u0004\bf\u00104R\"\u0010n\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010m¨\u0006o"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksItemView;", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "onFinishInflate", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lcom/p1/mobile/android/app/Act;", "e", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/data/User;", "picksUser", "Ll/y20;", "onClick", "", "onSuperLikeSend", "onInstantMatchSend", "f", "(Lcom/p1/mobile/putong/data/User;Ll/y20;Ll/y20;Ll/y20;)V", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "c", "Landroid/view/View;", "get_bg", "()Landroid/view/View;", "set_bg", "_bg", "Lv/VImage;", "Lv/VImage;", "get_instant_match_btn", "()Lv/VImage;", "set_instant_match_btn", "(Lv/VImage;)V", "_instant_match_btn", "Lv/VLinear;", "Lv/VLinear;", "get_personal_info", "()Lv/VLinear;", "set_personal_info", "(Lv/VLinear;)V", "_personal_info", "Lv/VText;", "Lv/VText;", "get_personal_info_info_first_line", "()Lv/VText;", "set_personal_info_info_first_line", "(Lv/VText;)V", "_personal_info_info_first_line", "g", "get_personal_info_info_second_line", "set_personal_info_info_second_line", "_personal_info_info_second_line", "h", "get_personal_info_info_second_line_age", "set_personal_info_info_second_line_age", "_personal_info_info_second_line_age", RXScreenCaptureService.KEY_INDEX, "get_personal_info_action_btn", "set_personal_info_action_btn", "_personal_info_action_btn", "Lv/VRelative;", "j", "Lv/VRelative;", "get_top_container", "()Lv/VRelative;", "set_top_container", "(Lv/VRelative;)V", "_top_container", "k", "get_top_container_active_time", "set_top_container_active_time", "_top_container_active_time", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "get_top_container_chat_master", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "set_top_container_chat_master", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;)V", "_top_container_chat_master", "m", "get_top_container_verification_icon", "set_top_container_verification_icon", "_top_container_verification_icon", "n", "Lcom/p1/mobile/putong/data/User;", "getMUser", "()Lcom/p1/mobile/putong/data/User;", "setMUser", "(Lcom/p1/mobile/putong/data/User;)V", "mUser", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class TopPicksItemView extends RoundFrameLayout {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _instant_match_btn;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _personal_info;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _personal_info_info_first_line;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _personal_info_info_second_line;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _personal_info_info_second_line_age;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VImage _personal_info_action_btn;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VRelative _top_container;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _top_container_active_time;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public RoundTextView _top_container_chat_master;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VImage _top_container_verification_icon;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public User mUser;

    public /* synthetic */ TopPicksItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static void m57113a(TopPicksItemView topPicksItemView, y20 y20Var, View view) {
        if (topPicksItemView.m57117e().lifecycle_() != C4470c.f16267i) {
            return;
        }
        y20Var.call(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: b */
    public static void m57114b(TopPicksItemView topPicksItemView, y20 y20Var, View view) {
        if (topPicksItemView.m57117e().lifecycle_() != C4470c.f16267i) {
            return;
        }
        y20Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: c */
    public static void m57115c(TopPicksItemView topPicksItemView, y20 y20Var, User user, View view) {
        r5j0.INSTANCE.m179866c();
        if (topPicksItemView.m57117e().lifecycle_() == C4470c.f16267i && NullChecker.m82486a(y20Var)) {
            y20Var.call(user);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m57116d(View view) {
        v5j0.m199888a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Act m57117e() {
        Activity activityM105506D = bnl0.m105506D(getContext());
        activityM105506D.getClass();
        return (Act) activityM105506D;
    }

    /* JADX INFO: renamed from: f */
    public final void m57118f(@NotNull final User picksUser, @NotNull final y20<User> onClick, @NotNull final y20<Boolean> onSuperLikeSend, @NotNull final y20<Boolean> onInstantMatchSend) {
        picksUser.getClass();
        onClick.getClass();
        onSuperLikeSend.getClass();
        onInstantMatchSend.getClass();
        setMUser(picksUser);
        bnl0.m105522L(this, new View.OnClickListener() { // from class: l.s5j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopPicksItemView.m57115c(this.f166373a, onClick, picksUser, view);
            }
        });
        bnl0.m105522L(get_personal_info_action_btn(), new View.OnClickListener() { // from class: l.t5j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopPicksItemView.m57113a(this.f172212a, onSuperLikeSend, view);
            }
        });
        bnl0.m105522L(get_instant_match_btn(), new View.OnClickListener() { // from class: l.u5j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopPicksItemView.m57114b(this.f177655a, onInstantMatchSend, view);
            }
        });
        uqb0.f180374G.m127119N0(get_image(), picksUser.m61308fp().profile480().formatted(), false);
        bnl0.m105524M(get_personal_info(), true);
        bnl0.m105524M(get_personal_info_action_btn(), true);
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m57117e(), picksUser, get_top_container_verification_icon());
        get_personal_info_action_btn().setImageResource(IntlCountryCodeController.m29125v() ? dbc0.f86086Dd : dbc0.f86054Cd);
        get_personal_info_info_second_line().setText(picksUser.name);
        get_personal_info_info_first_line().setText(String.valueOf(picksUser.age.intValue()));
        if (CoreModule.f18276o.m132214d().mo34769Vd()) {
            bnl0.m105524M(get_instant_match_btn(), true);
        }
    }

    @NotNull
    public final User getMUser() {
        User user = this.mUser;
        if (user != null) {
            return user;
        }
        Intrinsics.m88391r("mUser");
        return null;
    }

    @NotNull
    public final View get_bg() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bg");
        return null;
    }

    @NotNull
    public final VDraweeView get_image() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_image");
        return null;
    }

    @NotNull
    public final VImage get_instant_match_btn() {
        VImage vImage = this._instant_match_btn;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_instant_match_btn");
        return null;
    }

    @NotNull
    public final VLinear get_personal_info() {
        VLinear vLinear = this._personal_info;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_personal_info");
        return null;
    }

    @NotNull
    public final VImage get_personal_info_action_btn() {
        VImage vImage = this._personal_info_action_btn;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_personal_info_action_btn");
        return null;
    }

    @NotNull
    public final VText get_personal_info_info_first_line() {
        VText vText = this._personal_info_info_first_line;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_personal_info_info_first_line");
        return null;
    }

    @NotNull
    public final VText get_personal_info_info_second_line() {
        VText vText = this._personal_info_info_second_line;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_personal_info_info_second_line");
        return null;
    }

    @NotNull
    public final VText get_personal_info_info_second_line_age() {
        VText vText = this._personal_info_info_second_line_age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_personal_info_info_second_line_age");
        return null;
    }

    @NotNull
    public final VRelative get_top_container() {
        VRelative vRelative = this._top_container;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m88391r("_top_container");
        return null;
    }

    @NotNull
    public final VText get_top_container_active_time() {
        VText vText = this._top_container_active_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_top_container_active_time");
        return null;
    }

    @NotNull
    public final RoundTextView get_top_container_chat_master() {
        RoundTextView roundTextView = this._top_container_chat_master;
        if (roundTextView != null) {
            return roundTextView;
        }
        Intrinsics.m88391r("_top_container_chat_master");
        return null;
    }

    @NotNull
    public final VImage get_top_container_verification_icon() {
        VImage vImage = this._top_container_verification_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_top_container_verification_icon");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57116d(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(widthMeasureSpec)) * 1.33d), View.MeasureSpec.getMode(heightMeasureSpec)));
        ViewGroup.LayoutParams layoutParams = get_bg().getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int iM105592y0 = (int) (((double) ((bnl0.m105592y0() / 2) - qa00.f156323j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams2.height != iM105592y0) {
            layoutParams2.height = iM105592y0;
            get_bg().setLayoutParams(layoutParams2);
        }
    }

    public final void setMUser(@NotNull User user) {
        user.getClass();
        this.mUser = user;
    }

    public final void set_bg(@NotNull View view) {
        view.getClass();
        this._bg = view;
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    public final void set_instant_match_btn(@NotNull VImage vImage) {
        vImage.getClass();
        this._instant_match_btn = vImage;
    }

    public final void set_personal_info(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._personal_info = vLinear;
    }

    public final void set_personal_info_action_btn(@NotNull VImage vImage) {
        vImage.getClass();
        this._personal_info_action_btn = vImage;
    }

    public final void set_personal_info_info_first_line(@NotNull VText vText) {
        vText.getClass();
        this._personal_info_info_first_line = vText;
    }

    public final void set_personal_info_info_second_line(@NotNull VText vText) {
        vText.getClass();
        this._personal_info_info_second_line = vText;
    }

    public final void set_personal_info_info_second_line_age(@NotNull VText vText) {
        vText.getClass();
        this._personal_info_info_second_line_age = vText;
    }

    public final void set_top_container(@NotNull VRelative vRelative) {
        vRelative.getClass();
        this._top_container = vRelative;
    }

    public final void set_top_container_active_time(@NotNull VText vText) {
        vText.getClass();
        this._top_container_active_time = vText;
    }

    public final void set_top_container_chat_master(@NotNull RoundTextView roundTextView) {
        roundTextView.getClass();
        this._top_container_chat_master = roundTextView;
    }

    public final void set_top_container_verification_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._top_container_verification_icon = vImage;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopPicksItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopPicksItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopPicksItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
