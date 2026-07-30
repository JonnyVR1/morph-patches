package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\n2\u000e\u0010\u001b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\n2\u000e\u0010\u001b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001aH\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\n2\u000e\u0010\u001b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001aH\u0007¢\u0006\u0004\b\u001f\u0010\u001dJ\u001f\u0010 \u001a\u00020\n2\u000e\u0010\u001b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001aH\u0007¢\u0006\u0004\b \u0010\u001dJ\u001f\u0010!\u001a\u00020\n2\u000e\u0010\u001b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001aH\u0007¢\u0006\u0004\b!\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00062\u000e\u0010\u001b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001aH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0016H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010\u0015J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0006H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0006H\u0007¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\nH\u0007¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\nH\u0007¢\u0006\u0004\b-\u0010\u0003J\u0017\u0010.\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0006H\u0007¢\u0006\u0004\b.\u0010*J\u0017\u0010/\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0006H\u0007¢\u0006\u0004\b/\u0010*J?\u00105\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u0006H\u0007¢\u0006\u0004\b5\u00106J/\u0010;\u001a\u00020\n2\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001072\u0006\u0010:\u001a\u0002092\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b;\u0010<J'\u0010=\u001a\u00020\n2\u000e\u0010\u001b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001a2\u0006\u0010\u0018\u001a\u00020\u0006H\u0007¢\u0006\u0004\b=\u0010>¨\u0006?"}, m87232d2 = {"Ll/fbp0;", "", "<init>", "()V", "Ll/fcm0;", "data", "", "buttonType", "", FirebaseAnalytics.Param.INDEX, "", Constants.KEY_T, "(Ll/fcm0;Ljava/lang/String;I)V", "Ll/nnn0;", "u", "(Ll/nnn0;Ljava/lang/String;I)V", "shareType", "scene", "r", "(Ll/nnn0;Ljava/lang/String;Ljava/lang/String;)V", "q", "(Ll/nnn0;Ljava/lang/String;)V", "", "isShowFriends", BLiveStormDanmakuGiftResourceType.f44446s, "(Ll/nnn0;Z)V", "Ll/h4t;", "presenter", "m", "(Ll/h4t;)V", "n", BLiveStormDanmakuGiftResourceType.f44444l, "o", "p", "g", "(Ll/h4t;)Ljava/lang/String;", "isAnchor", "f", "(Z)Ljava/lang/String;", "c", "userId", "a", "(Ljava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "k", "e", "b", "j", "anchorId", "liveId", "event_type", "isManager", "template", Constants.INAPP_DATA_TAG, "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "Ll/pat;", "module", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;", "bLiveBottomButton", ResourceDirection.f38808v, "(Ll/pat;Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;I)V", "h", "(Ll/h4t;Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class fbp0 {

    @NotNull
    public static final fbp0 INSTANCE = new fbp0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m120385a(@NotNull String userId) {
        userId.getClass();
        zvf0.m220399u("e_audio_accompany_list_button", "p_audio_profile", j760.m140076a("sight", alk0.m97310i(userId) ? "me" : LiveRegionTag.others), j760.m140076a("other_user_id", userId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m120386b(@NotNull String userId) {
        userId.getClass();
        zvf0.m220399u("e_audio_giftwall_button", "p_audio_profile", j760.m140076a("sight", alk0.m97310i(userId) ? "me" : LiveRegionTag.others), j760.m140076a("other_user_id", userId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m120387c(@NotNull nnn0 data, @NotNull String scene) {
        data.getClass();
        scene.getClass();
        if (Intrinsics.m87488d("inviteSettle", scene)) {
            zvf0.m220399u("e_audio_invite_friends_settle", m120390f(data.mo97490p()), j760.m140076a("roomId", data.m149818o()), j760.m140076a("anchorId", data.m132140j0()), j760.m140076a("share_type", "friends"));
        } else {
            zvf0.m220396r("e_audio_share_menu_friends_list", m120390f(data.mo97490p()));
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m120388d(boolean isAnchor, @NotNull String anchorId, @NotNull String liveId, @NotNull String event_type, boolean isManager, @NotNull String template) {
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
        zvf0.m220399u("e_audio_guide_oncall_button", m120390f(isAnchor), j760.m140076a("anchorId", anchorId), j760.m140076a("event_type", event_type), j760.m140076a("liveId", liveId), j760.m140076a("user_type", str), j760.m140076a("voice_template", Intrinsics.m87488d(template, VirtualVoiceMotionType.ktv) ? "karaoke_room" : "normal_room"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m120389e() {
        zvf0.m220396r("e_audio_sweep_cp_button", "p_audio_profile");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m120390f(boolean isAnchor) {
        return isAnchor ? "p_anchor_audio_room" : "p_user_audio_room";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m120391g(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        String strM199309D0 = ypv.f199493a.m199309D0();
        if (e0o0.m114321g(presenter)) {
            return "anchor";
        }
        if (e0o0.m114322h(presenter)) {
            return "manager";
        }
        strM199309D0.getClass();
        return ((Boolean) presenter.m129297F3(new qul0(strM199309D0))).booleanValue() ? "member" : "passerby";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m120392h(@NotNull h4t<?, ?> presenter, @NotNull String s) {
        presenter.getClass();
        s.getClass();
        zvf0.m220399u("e_audio_shortcut_msg", m120390f(presenter.m206027E2().mo97490p()), vwb.m200311Y("message_content", s), vwb.m200311Y("user_type", e0o0.m114325l(presenter)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m120393i(@NotNull String userId) {
        userId.getClass();
        zvf0.m220368A("e_audio_accompany_list_button", "p_audio_profile", j760.m140076a("sight", alk0.m97310i(userId) ? "me" : LiveRegionTag.others), j760.m140076a("other_user_id", userId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m120394j(@NotNull String userId) {
        userId.getClass();
        zvf0.m220368A("e_audio_giftwall_button", "p_audio_profile", j760.m140076a("sight", alk0.m97310i(userId) ? "me" : LiveRegionTag.others), j760.m140076a("other_user_id", userId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m120395k() {
        zvf0.m220402x("e_audio_sweep_cp_button", "p_audio_profile");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m120396l(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        zvf0.m220399u("e_audio_room_pop_confirm_button", m120390f(M206027E2.mo97490p()), vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("user_type", m120391g(presenter)), vwb.m200311Y("confirm_type", "cancel_settled_room"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m120397m(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        zvf0.m220399u("e_audio_exit_button", m120390f(M206027E2.mo97490p()), vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("user_type", m120391g(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m120398n(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        zvf0.m220399u("e_audio_room_pop_confirm_button", m120390f(M206027E2.mo97490p()), vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("user_type", m120391g(presenter)), vwb.m200311Y("confirm_type", "exit_room"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final void m120399o(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        zvf0.m220399u("e_audio_room_pop_confirm_button", m120390f(M206027E2.mo97490p()), vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("user_type", m120391g(presenter)), vwb.m200311Y("confirm_type", "release_settled_room"));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final void m120400p(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        zvf0.m220399u("e_audio_notify_fans", "p_anchor_audio_room", vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y("anchorId", M206027E2.m132140j0()));
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m120401q(@NotNull nnn0 data, @NotNull String shareType) {
        String str;
        String str2;
        data.getClass();
        shareType.getClass();
        User userM132146l0 = data.m132146l0();
        if (userM132146l0 != null) {
            str = userM132146l0.f56011id;
            str.getClass();
        } else {
            str = "";
        }
        if (data.mo97490p()) {
            str2 = "anchor";
        } else {
            BLiveVoiceCall bLiveVoiceCallM102063l = data.m160249P2().m102063l(ypv.f199493a.m199309D0());
            str2 = (bLiveVoiceCallM102063l == null || !alk0.m97309h(bLiveVoiceCallM102063l)) ? "audience" : "audience_voicechat";
        }
        BLiveVoice bLiveVoiceMo149813j = data.mo149813j();
        zvf0.m220399u("e_audio_share_menu", m120390f(data.mo97490p()), vwb.m200311Y("liveId", data.m149814k()), vwb.m200311Y("anchorId", str), vwb.m200311Y("share_type", shareType), vwb.m200311Y("user_type", str2), vwb.m200311Y("voice_template", Intrinsics.m87488d(VirtualVoiceMotionType.ktv, bLiveVoiceMo149813j != null ? bLiveVoiceMo149813j.template : null) ? "karaoke_room" : "normal_room"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final void m120402r(@NotNull nnn0 data, @NotNull String shareType, @NotNull String scene) {
        data.getClass();
        shareType.getClass();
        scene.getClass();
        if (Intrinsics.m87488d("inviteSettle", scene)) {
            zvf0.m220399u("e_audio_invite_friends_settle", m120390f(data.mo97490p()), vwb.m200311Y("roomId", data.m149818o()), vwb.m200311Y("anchorId", data.m132140j0()), vwb.m200311Y("share_type", shareType));
        } else {
            m120401q(data, shareType);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final void m120403s(@NotNull nnn0 data, boolean isShowFriends) {
        String str;
        data.getClass();
        User userM132146l0 = data.m132146l0();
        if (userM132146l0 != null) {
            str = userM132146l0.f56011id;
            str.getClass();
        } else {
            str = "";
        }
        zvf0.m220368A("e_audio_share_menu", m120390f(data.mo97490p()), vwb.m200311Y("liveId", data.m149814k()), vwb.m200311Y("anchorId", str), vwb.m200311Y("is_show_friends", Boolean.valueOf(isShowFriends)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: t */
    public static final void m120404t(@NotNull fcm0 data, @NotNull String buttonType, int index) {
        String str;
        data.getClass();
        buttonType.getClass();
        User userM132146l0 = data.m132146l0();
        if (userM132146l0 != null) {
            str = userM132146l0.f56011id;
            str.getClass();
        } else {
            str = "";
        }
        zvf0.m220399u("e_audio_top_menu", "p_anchor_audio_room", vwb.m200311Y("liveId", data.m149814k()), vwb.m200311Y("anchorId", str), vwb.m200311Y("button_type", buttonType), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index + 1)), vwb.m200311Y("user_type", "anchor"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: u */
    public static final void m120405u(@NotNull nnn0 data, @NotNull String buttonType, int index) {
        String str;
        data.getClass();
        buttonType.getClass();
        User userM132146l0 = data.m132146l0();
        if (userM132146l0 != null) {
            str = userM132146l0.f56011id;
            str.getClass();
        } else {
            str = "";
        }
        BLiveVoiceCall bLiveVoiceCallM102063l = data.m160249P2().m102063l(ypv.f199493a.m199309D0());
        String str2 = "audience";
        if (bLiveVoiceCallM102063l != null && alk0.m97309h(bLiveVoiceCallM102063l)) {
            str2 = "audience_voicechat";
        }
        zvf0.m220399u("e_audio_top_menu", "p_user_audio_room", vwb.m200311Y("liveId", data.m149814k()), vwb.m200311Y("anchorId", str), vwb.m200311Y("button_type", buttonType), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index + 1)), vwb.m200311Y("user_type", str2));
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final void m120406v(@Nullable pat<nnn0> module, @NotNull BLiveBottomButton bLiveBottomButton, int index) {
        bLiveBottomButton.getClass();
        if ((module != null ? module.m206027E2() : null) == null) {
            return;
        }
        zvf0.m220399u("e_audio_bottom_menu", m120390f(module.m206032L2()), vwb.m200311Y("button_id", Integer.valueOf(bLiveBottomButton.f44339id)), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index)), vwb.m200311Y("user_type", m120391g(module)), vwb.m200311Y("live_id", module.m206027E2().m149814k()), vwb.m200311Y("anchor_id", module.m206027E2().m132140j0()));
    }
}
