package com.p051p1.mobile.putong.core.newui.meet.likers.items;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.meet.likers.items.MeetLikersUserView;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersBigCardItemView;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipExtensions;
import com.p051p1.mobile.putong.data.SwipeCardInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p151v.VText;
import p153l.bnl0;
import p153l.gbc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.mdy;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.sdy;
import p153l.uqb0;
import p153l.wj90;
import p153l.y20;
import p153l.yie0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0014¢\u0006\u0004\b%\u0010\u001fJ\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J#\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020 ¢\u0006\u0004\b1\u00102R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010N\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010E\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR\"\u0010R\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010E\u001a\u0004\bP\u0010G\"\u0004\bQ\u0010IR\"\u0010U\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010E\u001a\u0004\bS\u0010G\"\u0004\bT\u0010IR\"\u0010Y\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010E\u001a\u0004\bW\u0010G\"\u0004\bX\u0010IR\"\u0010`\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010g\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010j\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010E\u001a\u0004\bh\u0010G\"\u0004\bi\u0010IR\"\u0010m\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010E\u001a\u0004\bk\u0010G\"\u0004\bl\u0010IR\"\u0010t\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010w\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010E\u001a\u0004\bu\u0010G\"\u0004\bv\u0010IR\"\u0010z\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010E\u001a\u0004\bx\u0010G\"\u0004\by\u0010IR\"\u0010}\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010E\u001a\u0004\b{\u0010G\"\u0004\b|\u0010IR$\u0010\u0081\u0001\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b~\u0010=\u001a\u0004\b\u007f\u0010?\"\u0005\b\u0080\u0001\u0010AR&\u0010\u0085\u0001\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010=\u001a\u0005\b\u0083\u0001\u0010?\"\u0005\b\u0084\u0001\u0010AR(\u0010\u008b\u0001\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0005\b\u008a\u0001\u0010\u0019R\u0018\u00100\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u008e\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/meet/likers/items/MeetLikersUserView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "f", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/data/User;", "user", "Ll/y20;", "actionCallback", "", "customTag", "n", "(Lcom/p1/mobile/putong/data/User;Ll/y20;Ljava/lang/String;)V", "me", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/data/User;)V", "o", "(Lcom/p1/mobile/putong/data/User;)V", "", "lastReadTime", "m", "(Lcom/p1/mobile/putong/data/User;JLjava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "()V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onFinishInflate", "Lcom/p1/mobile/android/app/Act;", "h", "()Lcom/p1/mobile/android/app/Act;", "Ll/mdy;", "meetLikersUserItemData", "k", "(Ll/mdy;Ll/y20;)V", "", "j", "()Z", "userPosition", "setUserPosition", "(I)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Lv/VImage;", "b", "Lv/VImage;", "get_verification_icon", "()Lv/VImage;", "set_verification_icon", "(Lv/VImage;)V", "_verification_icon", "Lv/VText;", "c", "Lv/VText;", "get_tv_newlikes_badges", "()Lv/VText;", "set_tv_newlikes_badges", "(Lv/VText;)V", "_tv_newlikes_badges", Constants.INAPP_DATA_TAG, "get_tv_superlike_badges", "set_tv_superlike_badges", "_tv_superlike_badges", "e", "get_tv_chat_immediately", "set_tv_chat_immediately", "_tv_chat_immediately", "get_tv_custom_tag", "set_tv_custom_tag", "_tv_custom_tag", "g", "get_tv_verification_tag", "set_tv_verification_tag", "_tv_verification_tag", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_personal_info", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_personal_info", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_personal_info", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_action_btn", "()Landroid/widget/ImageView;", "set_action_btn", "(Landroid/widget/ImageView;)V", "_action_btn", "get_active", "set_active", "_active", "get_distance", "set_distance", "_distance", "Lv/VLinear_FillerMeasure;", "Lv/VLinear_FillerMeasure;", "get_info", "()Lv/VLinear_FillerMeasure;", "set_info", "(Lv/VLinear_FillerMeasure;)V", "_info", "get_nickname", "set_nickname", "_nickname", "get_age", "set_age", "_age", "get_tv_zodiac", "set_tv_zodiac", "_tv_zodiac", "p", "get_dislike", "set_dislike", "_dislike", "q", "get_like", "set_like", "_like", "r", "Lcom/p1/mobile/putong/data/User;", "getMUser", "()Lcom/p1/mobile/putong/data/User;", "setMUser", "mUser", BLiveStormDanmakuGiftResourceType.f45294s, "I", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MeetLikersUserView extends CardView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage _verification_icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _tv_newlikes_badges;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _tv_superlike_badges;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _tv_chat_immediately;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _tv_custom_tag;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _tv_verification_tag;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public ConstraintLayout _personal_info;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public ImageView _action_btn;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _active;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _distance;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VLinear_FillerMeasure _info;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _nickname;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VText _age;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText _tv_zodiac;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VImage _dislike;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VImage _like;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public User mUser;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int userPosition;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public MeetLikersUserView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static void m41532b(MeetLikersUserView meetLikersUserView, User user, boolean z, View view) {
        i4g0.m138523u("e_meet_see_card", meetLikersUserView.m41536h().pageId(), jyb.m147494Y("other_user_id", user.f56859id));
        if (z) {
            CoreModule.m30933P().m143405a().mo34380Nn(meetLikersUserView.m41536h(), user.f56859id, meetLikersUserView, false);
        } else {
            meetLikersUserView.m41536h().startActivityWithCustomTransition(CoreModule.m30933P().m143405a().mo34554n8(meetLikersUserView.m41536h(), jyb.m147507f0(user.f56859id), CoreModule.m30933P().m143405a().mo34511h7(), null, "p_meet_see,card_button_pull"), CoreModule.m30933P().m143405a().mo34515hg(meetLikersUserView.m41536h()));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m41533e(y20 y20Var, User user, View view) {
        y20Var.call(user);
    }

    /* JADX INFO: renamed from: i */
    private final void m41534i() {
        bnl0.m105525M0(get_like(), false);
        bnl0.m105525M0(get_dislike(), false);
        bnl0.m105524M(get_verification_icon(), false);
    }

    /* JADX INFO: renamed from: f */
    public final void m41535f(View view) {
        sdy.m185510a(this, view);
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
    public final ImageView get_action_btn() {
        ImageView imageView = this._action_btn;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_action_btn");
        return null;
    }

    @NotNull
    public final VText get_active() {
        VText vText = this._active;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_active");
        return null;
    }

    @NotNull
    public final VText get_age() {
        VText vText = this._age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_age");
        return null;
    }

    @NotNull
    public final VImage get_dislike() {
        VImage vImage = this._dislike;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_dislike");
        return null;
    }

    @NotNull
    public final VText get_distance() {
        VText vText = this._distance;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_distance");
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
    public final VLinear_FillerMeasure get_info() {
        VLinear_FillerMeasure vLinear_FillerMeasure = this._info;
        if (vLinear_FillerMeasure != null) {
            return vLinear_FillerMeasure;
        }
        Intrinsics.m88391r("_info");
        return null;
    }

    @NotNull
    public final VImage get_like() {
        VImage vImage = this._like;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_like");
        return null;
    }

    @NotNull
    public final VText get_nickname() {
        VText vText = this._nickname;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_nickname");
        return null;
    }

    @NotNull
    public final ConstraintLayout get_personal_info() {
        ConstraintLayout constraintLayout = this._personal_info;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_personal_info");
        return null;
    }

    @NotNull
    public final VText get_tv_chat_immediately() {
        VText vText = this._tv_chat_immediately;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_chat_immediately");
        return null;
    }

    @NotNull
    public final VText get_tv_custom_tag() {
        VText vText = this._tv_custom_tag;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_custom_tag");
        return null;
    }

    @NotNull
    public final VText get_tv_newlikes_badges() {
        VText vText = this._tv_newlikes_badges;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_newlikes_badges");
        return null;
    }

    @NotNull
    public final VText get_tv_superlike_badges() {
        VText vText = this._tv_superlike_badges;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_superlike_badges");
        return null;
    }

    @NotNull
    public final VText get_tv_verification_tag() {
        VText vText = this._tv_verification_tag;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_verification_tag");
        return null;
    }

    @NotNull
    public final VText get_tv_zodiac() {
        VText vText = this._tv_zodiac;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_zodiac");
        return null;
    }

    @NotNull
    public final VImage get_verification_icon() {
        VImage vImage = this._verification_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_verification_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Act m41536h() {
        Activity activityM105506D = bnl0.m105506D(getContext());
        activityM105506D.getClass();
        return (Act) activityM105506D;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m41537j() {
        return this.userPosition % 2 == 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m41538k(@NotNull mdy meetLikersUserItemData, @NotNull y20<User> actionCallback) {
        meetLikersUserItemData.getClass();
        actionCallback.getClass();
        setMUser(meetLikersUserItemData.getUser());
        m41534i();
        m41541n(getMUser(), actionCallback, meetLikersUserItemData.getCustomTag());
    }

    /* JADX INFO: renamed from: l */
    public final void m41539l(User me2, User user) {
        boolean z = ((double) pzi0.m174454o()) - user.location.updatedTime > 1800000.0d;
        if (CoreModule.f18264c.f20303E0.m141060B3(user) || (user.location.distance > 5000 && !z)) {
            bnl0.m105524M(get_distance(), false);
            return;
        }
        bnl0.m105524M(get_distance(), true);
        Region region = user.location.region;
        region.getClass();
        if (user.location.distance >= 10000 && TextUtils.equals(region.city, me2.location.region.city) && !TextUtils.isEmpty(region.district)) {
            get_distance().setText(region.district);
            return;
        }
        if (user.location.distance >= 10000 && !TextUtils.isEmpty(region.city)) {
            get_distance().setText(region.city);
            return;
        }
        Location location = user.location;
        if (location.distance >= 10000) {
            get_distance().setText("10km+");
        } else {
            get_distance().setText(q8g0.m175812q(location, true));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e0  */
    /* JADX INFO: renamed from: m */
    public final void m41540m(User user, long lastReadTime, String customTag) {
        String str;
        bnl0.m105524M(get_tv_superlike_badges(), false);
        bnl0.m105524M(get_tv_chat_immediately(), false);
        bnl0.m105524M(get_tv_newlikes_badges(), false);
        bnl0.m105524M(get_tv_custom_tag(), false);
        bnl0.m105524M(get_tv_verification_tag(), false);
        if (NullChecker.m82486a(user.localRelationship)) {
            Relationship relationship = user.localRelationship;
            relationship.getClass();
            if (NullChecker.m82486a(relationship.cardInfo)) {
                Relationship relationship2 = user.localRelationship;
                relationship2.getClass();
                SwipeCardInfo swipeCardInfo = relationship2.cardInfo;
                swipeCardInfo.getClass();
                if (!jyb.m147479J(swipeCardInfo.cardTypes)) {
                    Relationship relationship3 = user.localRelationship;
                    relationship3.getClass();
                    SwipeCardInfo swipeCardInfo2 = relationship3.cardInfo;
                    swipeCardInfo2.getClass();
                    if (swipeCardInfo2.cardTypes.contains("newLikeAfterVerification")) {
                        bnl0.m105524M(get_tv_verification_tag(), true);
                        return;
                    }
                }
            }
        }
        if (!user.superLikedMe()) {
            if (CoreModule.f18264c.f20429u0.m31381C5(user)) {
                bnl0.m105524M(get_tv_chat_immediately(), true);
                return;
            }
            if (lastReadTime > 0 && NullChecker.m82486a(user.localRelationship)) {
                double d = lastReadTime;
                Relationship relationship4 = user.localRelationship;
                relationship4.getClass();
                if (d < relationship4.updateTime) {
                    get_tv_newlikes_badges().setText("刚刚喜欢了我");
                    get_tv_newlikes_badges().setTypeface(Typeface.DEFAULT_BOLD);
                    bnl0.m105524M(get_tv_newlikes_badges(), true);
                    return;
                }
            }
            if (TextUtils.isEmpty(customTag)) {
                return;
            }
            get_tv_custom_tag().setText(customTag);
            bnl0.m105524M(get_tv_custom_tag(), true);
            return;
        }
        if (CoreModule.m30933P().m143405a().mo34590sf() && NullChecker.m82486a(user.localRelationship)) {
            Relationship relationship5 = user.localRelationship;
            relationship5.getClass();
            if (NullChecker.m82486a(relationship5.relationshipExtensions)) {
                CoreBusinessService coreBusinessServiceM143405a = CoreModule.m30933P().m143405a();
                Relationship relationship6 = user.localRelationship;
                relationship6.getClass();
                RelationshipExtensions relationshipExtensions = relationship6.relationshipExtensions;
                relationshipExtensions.getClass();
                if (coreBusinessServiceM143405a.mo34338Hl(relationshipExtensions.recvSuperLikedNum) > 1) {
                    VText vText = get_tv_superlike_badges();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    Relationship relationship7 = user.localRelationship;
                    relationship7.getClass();
                    RelationshipExtensions relationshipExtensions2 = relationship7.relationshipExtensions;
                    relationshipExtensions2.getClass();
                    vText.setText(String.format("超级喜欢x%s", Arrays.copyOf(new Object[]{relationshipExtensions2.recvSuperLikedNum}, 1)));
                } else {
                    VText vText2 = get_tv_superlike_badges();
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    if (user.isFemale()) {
                        str = "她";
                    } else {
                        str = "他";
                    }
                    vText2.setText(String.format("%s超级喜欢你", Arrays.copyOf(new Object[]{str}, 1)));
                }
            } else {
                VText vText3 = get_tv_superlike_badges();
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                if (user.isFemale()) {
                    str = "她";
                } else {
                    str = "他";
                }
                vText3.setText(String.format("%s超级喜欢你", Arrays.copyOf(new Object[]{str}, 1)));
            }
        } else {
            VText vText4 = get_tv_superlike_badges();
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            if (user.isFemale()) {
                str = "她";
            } else {
                str = "他";
            }
            vText4.setText(String.format("%s超级喜欢你", Arrays.copyOf(new Object[]{str}, 1)));
        }
        get_tv_superlike_badges().setTypeface(Typeface.DEFAULT_BOLD);
        bnl0.m105524M(get_tv_superlike_badges(), true);
    }

    /* JADX INFO: renamed from: n */
    public final void m41541n(final User user, final y20<User> actionCallback, String customTag) {
        boolean zMo34492e2 = CoreModule.f18273l.m143405a().mo34492e2();
        final boolean z = !zMo34492e2;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (zMo34492e2 || wj90.INSTANCE.m206625c(user)) {
            uqb0.f180374G.m127120O(get_image(), user.m61308fp().profile480().formatted(), 2, 30);
        } else {
            uqb0.f180374G.m127119N0(get_image(), user.m61308fp().profile480().formatted(), false);
        }
        Long l2 = CoreModule.f18264c.f20429u0.f19996l0.get();
        l2.getClass();
        m41540m(user, l2.longValue(), customTag);
        if (zMo34492e2) {
            bnl0.m105524M(get_verification_icon(), false);
        } else {
            uqb0.f180396b0.f170325b.showUserVerificationLogo(m41536h(), user, get_verification_icon());
        }
        if (zMo34492e2) {
            get_personal_info().setBackground(null);
            get_age().setText("");
            get_nickname().setText("");
            get_tv_zodiac().setTextSize(14.0f);
            get_tv_zodiac().setText(yie0.m216077i(user, getContext()));
            get_active().setText(m41536h().string(R$string.f21344N0));
            bnl0.m105525M0(get_active(), yie0.m216084q(user));
            bnl0.m105524M(get_info(), false);
        } else {
            bnl0.m105524M(get_info(), true);
            get_nickname().setText(user.name);
            if (LikersBigCardItemView.m57744s(userM116600p9, user)) {
                get_age().setText(String.valueOf(user.age.intValue()));
            } else {
                get_age().setText("");
            }
            get_tv_zodiac().setTextSize(12.0f);
            String strM175805k0 = q8g0.m175805k0(user.profile.zodiac, false);
            if (TextUtils.isEmpty(strM175805k0)) {
                get_tv_zodiac().setText("");
            } else {
                String strM57742n = LikersBigCardItemView.m57742n(userM116600p9, user);
                if (!TextUtils.isEmpty(strM57742n)) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    strM175805k0 = strM175805k0 + String.format(" · 喜欢%s", Arrays.copyOf(new Object[]{strM57742n}, 1));
                }
                get_tv_zodiac().setText(strM175805k0);
            }
            userM116600p9.getClass();
            m41539l(userM116600p9, user);
            m41542o(user);
        }
        bnl0.m105524M(get_action_btn(), true);
        get_action_btn().setImageResource(gbc0.f103351m1);
        bnl0.m105509E0(get_action_btn(), new View.OnClickListener() { // from class: l.qdy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeetLikersUserView.m41533e(actionCallback, user, view);
            }
        });
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.rdy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeetLikersUserView.m41532b(this.f162364a, user, z, view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m41542o(User user) {
        double dM174454o = pzi0.m174454o();
        Location location = user.location;
        boolean z = dM174454o - location.updatedTime <= 1800000.0d;
        boolean z2 = location.distance > 5000;
        if (CoreModule.f18264c.f20303E0.m141088w3(user) || !z2 || !z) {
            get_active().setVisibility(8);
            return;
        }
        get_active().setVisibility(0);
        String string = m41536h().getString(R$string.f21419q1);
        string.getClass();
        String strM174442G = pzi0.m174442G(user.location.updatedTime);
        if (TextUtils.equals(string, strM174442G)) {
            get_active().setText("在线");
            return;
        }
        VText vText = get_active();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        vText.setText(String.format("%s活跃", Arrays.copyOf(new Object[]{strM174442G}, 1)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41535f(this);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(widthMeasureSpec)) * 1.33d), View.MeasureSpec.getMode(heightMeasureSpec)));
        ViewGroup.LayoutParams layoutParams = get_personal_info().getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int iM105592y0 = (int) (((double) ((bnl0.m105592y0() / 2) - qa00.f156323j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams2.height != iM105592y0) {
            layoutParams2.height = iM105592y0;
            get_personal_info().setLayoutParams(layoutParams2);
        }
    }

    public final void setMUser(@NotNull User user) {
        user.getClass();
        this.mUser = user;
    }

    public final void setUserPosition(int userPosition) {
        this.userPosition = userPosition;
    }

    public final void set_action_btn(@NotNull ImageView imageView) {
        imageView.getClass();
        this._action_btn = imageView;
    }

    public final void set_active(@NotNull VText vText) {
        vText.getClass();
        this._active = vText;
    }

    public final void set_age(@NotNull VText vText) {
        vText.getClass();
        this._age = vText;
    }

    public final void set_dislike(@NotNull VImage vImage) {
        vImage.getClass();
        this._dislike = vImage;
    }

    public final void set_distance(@NotNull VText vText) {
        vText.getClass();
        this._distance = vText;
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    public final void set_info(@NotNull VLinear_FillerMeasure vLinear_FillerMeasure) {
        vLinear_FillerMeasure.getClass();
        this._info = vLinear_FillerMeasure;
    }

    public final void set_like(@NotNull VImage vImage) {
        vImage.getClass();
        this._like = vImage;
    }

    public final void set_nickname(@NotNull VText vText) {
        vText.getClass();
        this._nickname = vText;
    }

    public final void set_personal_info(@NotNull ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this._personal_info = constraintLayout;
    }

    public final void set_tv_chat_immediately(@NotNull VText vText) {
        vText.getClass();
        this._tv_chat_immediately = vText;
    }

    public final void set_tv_custom_tag(@NotNull VText vText) {
        vText.getClass();
        this._tv_custom_tag = vText;
    }

    public final void set_tv_newlikes_badges(@NotNull VText vText) {
        vText.getClass();
        this._tv_newlikes_badges = vText;
    }

    public final void set_tv_superlike_badges(@NotNull VText vText) {
        vText.getClass();
        this._tv_superlike_badges = vText;
    }

    public final void set_tv_verification_tag(@NotNull VText vText) {
        vText.getClass();
        this._tv_verification_tag = vText;
    }

    public final void set_tv_zodiac(@NotNull VText vText) {
        vText.getClass();
        this._tv_zodiac = vText;
    }

    public final void set_verification_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._verification_icon = vImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MeetLikersUserView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ MeetLikersUserView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
