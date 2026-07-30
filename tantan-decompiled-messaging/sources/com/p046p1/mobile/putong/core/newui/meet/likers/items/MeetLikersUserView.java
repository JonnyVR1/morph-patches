package com.p046p1.mobile.putong.core.newui.meet.likers.items;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.newui.meet.likers.items.MeetLikersUserView;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersBigCardItemView;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.Region;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipExtensions;
import com.p046p1.mobile.putong.data.SwipeCardInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p149l.b3c0;
import p149l.e30;
import p149l.i0g0;
import p149l.mqi0;
import p149l.p4y;
import p149l.qib0;
import p149l.sb90;
import p149l.t100;
import p149l.tae0;
import p149l.v4y;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0014¢\u0006\u0004\b%\u0010\u001fJ\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J#\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020 ¢\u0006\u0004\b1\u00102R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010N\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010E\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR\"\u0010R\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010E\u001a\u0004\bP\u0010G\"\u0004\bQ\u0010IR\"\u0010U\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010E\u001a\u0004\bS\u0010G\"\u0004\bT\u0010IR\"\u0010Y\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010E\u001a\u0004\bW\u0010G\"\u0004\bX\u0010IR\"\u0010`\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010g\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010j\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010E\u001a\u0004\bh\u0010G\"\u0004\bi\u0010IR\"\u0010m\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010E\u001a\u0004\bk\u0010G\"\u0004\bl\u0010IR\"\u0010t\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010w\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010E\u001a\u0004\bu\u0010G\"\u0004\bv\u0010IR\"\u0010z\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010E\u001a\u0004\bx\u0010G\"\u0004\by\u0010IR\"\u0010}\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010E\u001a\u0004\b{\u0010G\"\u0004\b|\u0010IR$\u0010\u0081\u0001\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b~\u0010=\u001a\u0004\b\u007f\u0010?\"\u0005\b\u0080\u0001\u0010AR&\u0010\u0085\u0001\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010=\u001a\u0005\b\u0083\u0001\u0010?\"\u0005\b\u0084\u0001\u0010AR(\u0010\u008b\u0001\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0005\b\u008a\u0001\u0010\u0019R\u0018\u00100\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u008e\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/meet/likers/items/MeetLikersUserView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "f", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/data/User;", "user", "Ll/e30;", "actionCallback", "", "customTag", "n", "(Lcom/p1/mobile/putong/data/User;Ll/e30;Ljava/lang/String;)V", "me", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/data/User;)V", "o", "(Lcom/p1/mobile/putong/data/User;)V", "", "lastReadTime", "m", "(Lcom/p1/mobile/putong/data/User;JLjava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "()V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onFinishInflate", "Lcom/p1/mobile/android/app/Act;", "h", "()Lcom/p1/mobile/android/app/Act;", "Ll/p4y;", "meetLikersUserItemData", "k", "(Ll/p4y;Ll/e30;)V", "", "j", "()Z", "userPosition", "setUserPosition", "(I)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Lv/VImage;", "b", "Lv/VImage;", "get_verification_icon", "()Lv/VImage;", "set_verification_icon", "(Lv/VImage;)V", "_verification_icon", "Lv/VText;", "c", "Lv/VText;", "get_tv_newlikes_badges", "()Lv/VText;", "set_tv_newlikes_badges", "(Lv/VText;)V", "_tv_newlikes_badges", Constants.INAPP_DATA_TAG, "get_tv_superlike_badges", "set_tv_superlike_badges", "_tv_superlike_badges", "e", "get_tv_chat_immediately", "set_tv_chat_immediately", "_tv_chat_immediately", "get_tv_custom_tag", "set_tv_custom_tag", "_tv_custom_tag", "g", "get_tv_verification_tag", "set_tv_verification_tag", "_tv_verification_tag", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_personal_info", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_personal_info", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_personal_info", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_action_btn", "()Landroid/widget/ImageView;", "set_action_btn", "(Landroid/widget/ImageView;)V", "_action_btn", "get_active", "set_active", "_active", "get_distance", "set_distance", "_distance", "Lv/VLinear_FillerMeasure;", "Lv/VLinear_FillerMeasure;", "get_info", "()Lv/VLinear_FillerMeasure;", "set_info", "(Lv/VLinear_FillerMeasure;)V", "_info", "get_nickname", "set_nickname", "_nickname", "get_age", "set_age", "_age", "get_tv_zodiac", "set_tv_zodiac", "_tv_zodiac", "p", "get_dislike", "set_dislike", "_dislike", "q", "get_like", "set_like", "_like", "r", "Lcom/p1/mobile/putong/data/User;", "getMUser", "()Lcom/p1/mobile/putong/data/User;", "setMUser", "mUser", BLiveStormDanmakuGiftResourceType.f44446s, "I", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static void m40521b(MeetLikersUserView meetLikersUserView, User user, boolean z, View view) {
        zvf0.m220399u("e_meet_see_card", meetLikersUserView.m40525h().pageId(), vwb.m200311Y("other_user_id", user.f56011id));
        if (z) {
            CoreModule.m29935P().m94651a().mo33377Nn(meetLikersUserView.m40525h(), user.f56011id, meetLikersUserView, false);
        } else {
            meetLikersUserView.m40525h().startActivityWithCustomTransition(CoreModule.m29935P().m94651a().mo33551n8(meetLikersUserView.m40525h(), vwb.m200324f0(user.f56011id), CoreModule.m29935P().m94651a().mo33508h7(), null, "p_meet_see,card_button_pull"), CoreModule.m29935P().m94651a().mo33512hg(meetLikersUserView.m40525h()));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m40522e(e30 e30Var, User user, View view) {
        e30Var.call(user);
    }

    /* JADX INFO: renamed from: i */
    private final void m40523i() {
        xdl0.m208345M0(get_like(), false);
        xdl0.m208345M0(get_dislike(), false);
        xdl0.m208344M(get_verification_icon(), false);
    }

    /* JADX INFO: renamed from: f */
    public final void m40524f(View view) {
        v4y.m197072a(this, view);
    }

    @NotNull
    public final User getMUser() {
        User user = this.mUser;
        if (user != null) {
            return user;
        }
        Intrinsics.m87502r("mUser");
        return null;
    }

    @NotNull
    public final ImageView get_action_btn() {
        ImageView imageView = this._action_btn;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_action_btn");
        return null;
    }

    @NotNull
    public final VText get_active() {
        VText vText = this._active;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_active");
        return null;
    }

    @NotNull
    public final VText get_age() {
        VText vText = this._age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_age");
        return null;
    }

    @NotNull
    public final VImage get_dislike() {
        VImage vImage = this._dislike;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_dislike");
        return null;
    }

    @NotNull
    public final VText get_distance() {
        VText vText = this._distance;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_distance");
        return null;
    }

    @NotNull
    public final VDraweeView get_image() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_image");
        return null;
    }

    @NotNull
    public final VLinear_FillerMeasure get_info() {
        VLinear_FillerMeasure vLinear_FillerMeasure = this._info;
        if (vLinear_FillerMeasure != null) {
            return vLinear_FillerMeasure;
        }
        Intrinsics.m87502r("_info");
        return null;
    }

    @NotNull
    public final VImage get_like() {
        VImage vImage = this._like;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_like");
        return null;
    }

    @NotNull
    public final VText get_nickname() {
        VText vText = this._nickname;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_nickname");
        return null;
    }

    @NotNull
    public final ConstraintLayout get_personal_info() {
        ConstraintLayout constraintLayout = this._personal_info;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_personal_info");
        return null;
    }

    @NotNull
    public final VText get_tv_chat_immediately() {
        VText vText = this._tv_chat_immediately;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_chat_immediately");
        return null;
    }

    @NotNull
    public final VText get_tv_custom_tag() {
        VText vText = this._tv_custom_tag;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_custom_tag");
        return null;
    }

    @NotNull
    public final VText get_tv_newlikes_badges() {
        VText vText = this._tv_newlikes_badges;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_newlikes_badges");
        return null;
    }

    @NotNull
    public final VText get_tv_superlike_badges() {
        VText vText = this._tv_superlike_badges;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_superlike_badges");
        return null;
    }

    @NotNull
    public final VText get_tv_verification_tag() {
        VText vText = this._tv_verification_tag;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_verification_tag");
        return null;
    }

    @NotNull
    public final VText get_tv_zodiac() {
        VText vText = this._tv_zodiac;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_zodiac");
        return null;
    }

    @NotNull
    public final VImage get_verification_icon() {
        VImage vImage = this._verification_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_verification_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Act m40525h() {
        Activity activityM208326D = xdl0.m208326D(getContext());
        activityM208326D.getClass();
        return (Act) activityM208326D;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m40526j() {
        return this.userPosition % 2 == 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m40527k(@NotNull p4y meetLikersUserItemData, @NotNull e30<User> actionCallback) {
        meetLikersUserItemData.getClass();
        actionCallback.getClass();
        setMUser(meetLikersUserItemData.getUser());
        m40523i();
        m40530n(getMUser(), actionCallback, meetLikersUserItemData.getCustomTag());
    }

    /* JADX INFO: renamed from: l */
    public final void m40528l(User me2, User user) {
        boolean z = ((double) mqi0.m155944o()) - user.location.updatedTime > 1800000.0d;
        if (CoreModule.f17545c.f19561E0.m203772B3(user) || (user.location.distance > 5000 && !z)) {
            xdl0.m208344M(get_distance(), false);
            return;
        }
        xdl0.m208344M(get_distance(), true);
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
            get_distance().setText(i0g0.m133877q(location, true));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e0  */
    /* JADX INFO: renamed from: m */
    public final void m40529m(User user, long lastReadTime, String customTag) {
        String str;
        xdl0.m208344M(get_tv_superlike_badges(), false);
        xdl0.m208344M(get_tv_chat_immediately(), false);
        xdl0.m208344M(get_tv_newlikes_badges(), false);
        xdl0.m208344M(get_tv_custom_tag(), false);
        xdl0.m208344M(get_tv_verification_tag(), false);
        if (NullChecker.m81303a(user.localRelationship)) {
            Relationship relationship = user.localRelationship;
            relationship.getClass();
            if (NullChecker.m81303a(relationship.cardInfo)) {
                Relationship relationship2 = user.localRelationship;
                relationship2.getClass();
                SwipeCardInfo swipeCardInfo = relationship2.cardInfo;
                swipeCardInfo.getClass();
                if (!vwb.m200296J(swipeCardInfo.cardTypes)) {
                    Relationship relationship3 = user.localRelationship;
                    relationship3.getClass();
                    SwipeCardInfo swipeCardInfo2 = relationship3.cardInfo;
                    swipeCardInfo2.getClass();
                    if (swipeCardInfo2.cardTypes.contains("newLikeAfterVerification")) {
                        xdl0.m208344M(get_tv_verification_tag(), true);
                        return;
                    }
                }
            }
        }
        if (!user.superLikedMe()) {
            if (CoreModule.f17545c.f19687u0.m30492y5(user)) {
                xdl0.m208344M(get_tv_chat_immediately(), true);
                return;
            }
            if (lastReadTime > 0 && NullChecker.m81303a(user.localRelationship)) {
                double d = lastReadTime;
                Relationship relationship4 = user.localRelationship;
                relationship4.getClass();
                if (d < relationship4.updateTime) {
                    get_tv_newlikes_badges().setText("刚刚喜欢了我");
                    get_tv_newlikes_badges().setTypeface(Typeface.DEFAULT_BOLD);
                    xdl0.m208344M(get_tv_newlikes_badges(), true);
                    return;
                }
            }
            if (TextUtils.isEmpty(customTag)) {
                return;
            }
            get_tv_custom_tag().setText(customTag);
            xdl0.m208344M(get_tv_custom_tag(), true);
            return;
        }
        if (CoreModule.m29935P().m94651a().mo33587sf() && NullChecker.m81303a(user.localRelationship)) {
            Relationship relationship5 = user.localRelationship;
            relationship5.getClass();
            if (NullChecker.m81303a(relationship5.relationshipExtensions)) {
                CoreBusinessService coreBusinessServiceM94651a = CoreModule.m29935P().m94651a();
                Relationship relationship6 = user.localRelationship;
                relationship6.getClass();
                RelationshipExtensions relationshipExtensions = relationship6.relationshipExtensions;
                relationshipExtensions.getClass();
                if (coreBusinessServiceM94651a.mo33335Hl(relationshipExtensions.recvSuperLikedNum) > 1) {
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
        xdl0.m208344M(get_tv_superlike_badges(), true);
    }

    /* JADX INFO: renamed from: n */
    public final void m40530n(final User user, final e30<User> actionCallback, String customTag) {
        boolean zMo33489e2 = CoreModule.f17554l.m94651a().mo33489e2();
        final boolean z = !zMo33489e2;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (zMo33489e2 || sb90.INSTANCE.m183212c(user)) {
            qib0.f154691G.m102336O(get_image(), user.m60124fp().profile480().formatted(), 2, 30);
        } else {
            qib0.f154691G.m102335N0(get_image(), user.m60124fp().profile480().formatted(), false);
        }
        Long l2 = CoreModule.f17545c.f19687u0.f19254k0.get();
        l2.getClass();
        m40529m(user, l2.longValue(), customTag);
        if (zMo33489e2) {
            xdl0.m208344M(get_verification_icon(), false);
        } else {
            qib0.f154713b0.f139231b.showUserVerificationLogo(m40525h(), user, get_verification_icon());
        }
        if (zMo33489e2) {
            get_personal_info().setBackground(null);
            get_age().setText("");
            get_nickname().setText("");
            get_tv_zodiac().setTextSize(14.0f);
            get_tv_zodiac().setText(tae0.m187706i(user, getContext()));
            get_active().setText(m40525h().string(R$string.f20602N0));
            xdl0.m208345M0(get_active(), tae0.m187713q(user));
            xdl0.m208344M(get_info(), false);
        } else {
            xdl0.m208344M(get_info(), true);
            get_nickname().setText(user.name);
            if (LikersBigCardItemView.m56561s(userM169527p9, user)) {
                get_age().setText(String.valueOf(user.age.intValue()));
            } else {
                get_age().setText("");
            }
            get_tv_zodiac().setTextSize(12.0f);
            String strM133870k0 = i0g0.m133870k0(user.profile.zodiac, false);
            if (TextUtils.isEmpty(strM133870k0)) {
                get_tv_zodiac().setText("");
            } else {
                String strM56559n = LikersBigCardItemView.m56559n(userM169527p9, user);
                if (!TextUtils.isEmpty(strM56559n)) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    strM133870k0 = strM133870k0 + String.format(" · 喜欢%s", Arrays.copyOf(new Object[]{strM56559n}, 1));
                }
                get_tv_zodiac().setText(strM133870k0);
            }
            userM169527p9.getClass();
            m40528l(userM169527p9, user);
            m40531o(user);
        }
        xdl0.m208344M(get_action_btn(), true);
        get_action_btn().setImageResource(b3c0.f73100m1);
        xdl0.m208329E0(get_action_btn(), new View.OnClickListener() { // from class: l.t4y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeetLikersUserView.m40522e(actionCallback, user, view);
            }
        });
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.u4y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeetLikersUserView.m40521b(this.f174639a, user, z, view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m40531o(User user) {
        double dM155944o = mqi0.m155944o();
        Location location = user.location;
        boolean z = dM155944o - location.updatedTime <= 1800000.0d;
        boolean z2 = location.distance > 5000;
        if (CoreModule.f17545c.f19561E0.m203800w3(user) || !z2 || !z) {
            get_active().setVisibility(8);
            return;
        }
        get_active().setVisibility(0);
        String string = m40525h().getString(R$string.f20677q1);
        string.getClass();
        String strM155932G = mqi0.m155932G(user.location.updatedTime);
        if (TextUtils.equals(string, strM155932G)) {
            get_active().setText("在线");
            return;
        }
        VText vText = get_active();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        vText.setText(String.format("%s活跃", Arrays.copyOf(new Object[]{strM155932G}, 1)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40524f(this);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(widthMeasureSpec)) * 1.33d), View.MeasureSpec.getMode(heightMeasureSpec)));
        ViewGroup.LayoutParams layoutParams = get_personal_info().getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int iM208412y0 = (int) (((double) ((xdl0.m208412y0() / 2) - t100.f167261j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams2.height != iM208412y0) {
            layoutParams2.height = iM208412y0;
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
