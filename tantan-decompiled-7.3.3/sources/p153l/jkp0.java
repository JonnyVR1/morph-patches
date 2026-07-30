package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\n2\u000e\u0010\u001b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\n2\u000e\u0010\u001b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001aH\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\n2\u000e\u0010\u001b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001aH\u0007¢\u0006\u0004\b\u001f\u0010\u001dJ\u001f\u0010 \u001a\u00020\n2\u000e\u0010\u001b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001aH\u0007¢\u0006\u0004\b \u0010\u001dJ\u001f\u0010!\u001a\u00020\n2\u000e\u0010\u001b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001aH\u0007¢\u0006\u0004\b!\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00062\u000e\u0010\u001b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001aH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0016H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010\u0015J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0006H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0006H\u0007¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\nH\u0007¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\nH\u0007¢\u0006\u0004\b-\u0010\u0003J\u0017\u0010.\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0006H\u0007¢\u0006\u0004\b.\u0010*J\u0017\u0010/\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0006H\u0007¢\u0006\u0004\b/\u0010*J?\u00105\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u0006H\u0007¢\u0006\u0004\b5\u00106J/\u0010;\u001a\u00020\n2\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001072\u0006\u0010:\u001a\u0002092\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b;\u0010<J'\u0010=\u001a\u00020\n2\u000e\u0010\u001b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001a2\u0006\u0010\u0018\u001a\u00020\u0006H\u0007¢\u0006\u0004\b=\u0010>¨\u0006?"}, m88121d2 = {"Ll/jkp0;", "", "<init>", "()V", "Ll/jlm0;", "data", "", "buttonType", "", FirebaseAnalytics.Param.INDEX, "", Constants.KEY_T, "(Ll/jlm0;Ljava/lang/String;I)V", "Ll/rwn0;", "u", "(Ll/rwn0;Ljava/lang/String;I)V", "shareType", "scene", "r", "(Ll/rwn0;Ljava/lang/String;Ljava/lang/String;)V", "q", "(Ll/rwn0;Ljava/lang/String;)V", "", "isShowFriends", BLiveStormDanmakuGiftResourceType.f45294s, "(Ll/rwn0;Z)V", "Ll/i6t;", "presenter", "m", "(Ll/i6t;)V", "n", BLiveStormDanmakuGiftResourceType.f45292l, "o", "p", "g", "(Ll/i6t;)Ljava/lang/String;", "isAnchor", "f", "(Z)Ljava/lang/String;", "c", "userId", "a", "(Ljava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "k", "e", "b", "j", "anchorId", "liveId", "event_type", "isManager", "template", Constants.INAPP_DATA_TAG, "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "Ll/qct;", "module", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;", "bLiveBottomButton", ResourceDirection.f39656v, "(Ll/qct;Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;I)V", "h", "(Ll/i6t;Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class jkp0 {

    @NotNull
    public static final jkp0 INSTANCE = new jkp0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m145870a(@NotNull String userId) {
        userId.getClass();
        i4g0.m138523u("e_audio_accompany_list_button", "p_audio_profile", pf60.m172085a("sight", guk0.m132330i(userId) ? "me" : LiveRegionTag.others), pf60.m172085a("other_user_id", userId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m145871b(@NotNull String userId) {
        userId.getClass();
        i4g0.m138523u("e_audio_giftwall_button", "p_audio_profile", pf60.m172085a("sight", guk0.m132330i(userId) ? "me" : LiveRegionTag.others), pf60.m172085a("other_user_id", userId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m145872c(@NotNull rwn0 data, @NotNull String scene) {
        data.getClass();
        scene.getClass();
        if (Intrinsics.m88377d("inviteSettle", scene)) {
            i4g0.m138523u("e_audio_invite_friends_settle", m145875f(data.mo118373p()), pf60.m172085a("roomId", data.m202194o()), pf60.m172085a("anchorId", data.m168526j0()), pf60.m172085a("share_type", "friends"));
        } else {
            i4g0.m138520r("e_audio_share_menu_friends_list", m145875f(data.mo118373p()));
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m145873d(boolean isAnchor, @NotNull String anchorId, @NotNull String liveId, @NotNull String event_type, boolean isManager, @NotNull String template) {
        String str;
        anchorId.getClass();
        liveId.getClass();
        event_type.getClass();
        template.getClass();
        if (isAnchor) {
            str = "anchor";
        } else {
            str = isManager ? "manager" : "audience";
        }
        i4g0.m138523u("e_audio_guide_oncall_button", m145875f(isAnchor), pf60.m172085a("anchorId", anchorId), pf60.m172085a("event_type", event_type), pf60.m172085a("liveId", liveId), pf60.m172085a("user_type", str), pf60.m172085a("voice_template", Intrinsics.m88377d(template, VirtualVoiceMotionType.ktv) ? "karaoke_room" : "normal_room"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m145874e() {
        i4g0.m138520r("e_audio_sweep_cp_button", "p_audio_profile");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m145875f(boolean isAnchor) {
        return isAnchor ? "p_anchor_audio_room" : "p_user_audio_room";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m145876g(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        String strM207631D0 = zrv.f205799a.m207631D0();
        if (i9o0.m139136g(presenter)) {
            return "anchor";
        }
        if (i9o0.m139137h(presenter)) {
            return "manager";
        }
        strM207631D0.getClass();
        return ((Boolean) presenter.m138856F3(new u3m0(strM207631D0))).booleanValue() ? "member" : "passerby";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m145877h(@NotNull i6t<?, ?> presenter, @NotNull String s) {
        presenter.getClass();
        s.getClass();
        i4g0.m138523u("e_audio_shortcut_msg", m145875f(presenter.m213810E2().mo118373p()), jyb.m147494Y("message_content", s), jyb.m147494Y("user_type", i9o0.m139140l(presenter)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m145878i(@NotNull String userId) {
        userId.getClass();
        i4g0.m138492A("e_audio_accompany_list_button", "p_audio_profile", pf60.m172085a("sight", guk0.m132330i(userId) ? "me" : LiveRegionTag.others), pf60.m172085a("other_user_id", userId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m145879j(@NotNull String userId) {
        userId.getClass();
        i4g0.m138492A("e_audio_giftwall_button", "p_audio_profile", pf60.m172085a("sight", guk0.m132330i(userId) ? "me" : LiveRegionTag.others), pf60.m172085a("other_user_id", userId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m145880k() {
        i4g0.m138526x("e_audio_sweep_cp_button", "p_audio_profile");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m145881l(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        i4g0.m138523u("e_audio_room_pop_confirm_button", m145875f(M213810E2.mo118373p()), jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("user_type", m145876g(presenter)), jyb.m147494Y("confirm_type", "cancel_settled_room"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m145882m(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        i4g0.m138523u("e_audio_exit_button", m145875f(M213810E2.mo118373p()), jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("user_type", m145876g(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m145883n(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        i4g0.m138523u("e_audio_room_pop_confirm_button", m145875f(M213810E2.mo118373p()), jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("user_type", m145876g(presenter)), jyb.m147494Y("confirm_type", "exit_room"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final void m145884o(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        i4g0.m138523u("e_audio_room_pop_confirm_button", m145875f(M213810E2.mo118373p()), jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("user_type", m145876g(presenter)), jyb.m147494Y("confirm_type", "release_settled_room"));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final void m145885p(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        i4g0.m138523u("e_audio_notify_fans", "p_anchor_audio_room", jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y("anchorId", M213810E2.m168526j0()));
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m145886q(@NotNull rwn0 data, @NotNull String shareType) {
        String str;
        String str2;
        data.getClass();
        shareType.getClass();
        User userM168532l0 = data.m168532l0();
        if (userM168532l0 != null) {
            str = userM168532l0.f56859id;
            str.getClass();
        } else {
            str = "";
        }
        if (data.mo118373p()) {
            str2 = "anchor";
        } else {
            BLiveVoiceCall bLiveVoiceCallM136873l = data.m183411P2().m136873l(zrv.f205799a.m207631D0());
            str2 = (bLiveVoiceCallM136873l == null || !guk0.m132329h(bLiveVoiceCallM136873l)) ? "audience" : "audience_voicechat";
        }
        BLiveVoice bLiveVoiceMo183435j = data.mo183435j();
        i4g0.m138523u("e_audio_share_menu", m145875f(data.mo118373p()), jyb.m147494Y("liveId", data.m202191k()), jyb.m147494Y("anchorId", str), jyb.m147494Y("share_type", shareType), jyb.m147494Y("user_type", str2), jyb.m147494Y("voice_template", Intrinsics.m88377d(VirtualVoiceMotionType.ktv, bLiveVoiceMo183435j != null ? bLiveVoiceMo183435j.template : null) ? "karaoke_room" : "normal_room"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final void m145887r(@NotNull rwn0 data, @NotNull String shareType, @NotNull String scene) {
        data.getClass();
        shareType.getClass();
        scene.getClass();
        if (Intrinsics.m88377d("inviteSettle", scene)) {
            i4g0.m138523u("e_audio_invite_friends_settle", m145875f(data.mo118373p()), jyb.m147494Y("roomId", data.m202194o()), jyb.m147494Y("anchorId", data.m168526j0()), jyb.m147494Y("share_type", shareType));
        } else {
            m145886q(data, shareType);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final void m145888s(@NotNull rwn0 data, boolean isShowFriends) {
        String str;
        data.getClass();
        User userM168532l0 = data.m168532l0();
        if (userM168532l0 != null) {
            str = userM168532l0.f56859id;
            str.getClass();
        } else {
            str = "";
        }
        i4g0.m138492A("e_audio_share_menu", m145875f(data.mo118373p()), jyb.m147494Y("liveId", data.m202191k()), jyb.m147494Y("anchorId", str), jyb.m147494Y("is_show_friends", Boolean.valueOf(isShowFriends)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: t */
    public static final void m145889t(@NotNull jlm0 data, @NotNull String buttonType, int index) {
        String str;
        data.getClass();
        buttonType.getClass();
        User userM168532l0 = data.m168532l0();
        if (userM168532l0 != null) {
            str = userM168532l0.f56859id;
            str.getClass();
        } else {
            str = "";
        }
        i4g0.m138523u("e_audio_top_menu", "p_anchor_audio_room", jyb.m147494Y("liveId", data.m202191k()), jyb.m147494Y("anchorId", str), jyb.m147494Y("button_type", buttonType), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index + 1)), jyb.m147494Y("user_type", "anchor"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: u */
    public static final void m145890u(@NotNull rwn0 data, @NotNull String buttonType, int index) {
        String str;
        data.getClass();
        buttonType.getClass();
        User userM168532l0 = data.m168532l0();
        if (userM168532l0 != null) {
            str = userM168532l0.f56859id;
            str.getClass();
        } else {
            str = "";
        }
        BLiveVoiceCall bLiveVoiceCallM136873l = data.m183411P2().m136873l(zrv.f205799a.m207631D0());
        String str2 = "audience";
        if (bLiveVoiceCallM136873l != null && guk0.m132329h(bLiveVoiceCallM136873l)) {
            str2 = "audience_voicechat";
        }
        i4g0.m138523u("e_audio_top_menu", "p_user_audio_room", jyb.m147494Y("liveId", data.m202191k()), jyb.m147494Y("anchorId", str), jyb.m147494Y("button_type", buttonType), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index + 1)), jyb.m147494Y("user_type", str2));
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final void m145891v(@Nullable qct<rwn0> module, @NotNull BLiveBottomButton bLiveBottomButton, int index) {
        bLiveBottomButton.getClass();
        if ((module != null ? module.m213810E2() : null) == null) {
            return;
        }
        i4g0.m138523u("e_audio_bottom_menu", m145875f(module.m213815L2()), jyb.m147494Y("button_id", Integer.valueOf(bLiveBottomButton.f45187id)), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index)), jyb.m147494Y("user_type", m145876g(module)), jyb.m147494Y("live_id", module.m213810E2().m202191k()), jyb.m147494Y("anchor_id", module.m213810E2().m168526j0()));
    }
}
