package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00042\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\u0003J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0003J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)J%\u0010+\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\u0017J\u0015\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\r¢\u0006\u0004\b-\u0010\u0019J\r\u0010.\u001a\u00020\u0004¢\u0006\u0004\b.\u0010\u0003J\u0015\u0010/\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b/\u00100¨\u00061"}, m87232d2 = {"Ll/zi10;", "", "<init>", "()V", "", "h", "", "isFree", "isAnchor", "k", "(ZZ)V", "Ll/h4t;", "presenter", "", "button", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "otherRole", Constants.INAPP_DATA_TAG, "(Ll/h4t;Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "switchType", "switchClickType", "noRemindToday", "f", "(Ljava/lang/String;Ljava/lang/String;Z)V", "q", "(Ljava/lang/String;)V", "b", "(Z)V", "n", "noRemind", "e", "g", "a", "m", RXScreenCaptureService.KEY_INDEX, "", "choiceNum", "j", "(I)V", "popUpType", "o", "(Ljava/lang/String;Z)V", "microClickButton", "c", Reason.TYPE, "p", "r", BLiveStormDanmakuGiftResourceType.f44444l, "(Z)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class zi10 {

    @NotNull
    public static final zi10 INSTANCE = new zi10();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m218891a() {
        zvf0.m220399u("e_video_room_notice", "p_anchor_live_room", vwb.m200311Y("video_notice_type", "notice_cancel_confirm_button"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m218892b(boolean isFree) {
        zvf0.m220399u("e_video_room_join_chat", "p_user_live_room", vwb.m200311Y("micro_type", isFree ? "free" : "invitation"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m218893d(@NotNull h4t<?, ?> presenter, @NotNull String button, @NotNull BLiveMultiCall otherRole) {
        presenter.getClass();
        button.getClass();
        otherRole.getClass();
        BLiveMultiCall bLiveMultiCallM177967B = r610.m177967B(presenter);
        String strM218905l = INSTANCE.m218905l(presenter.m206032L2());
        j760 j760VarM200311Y = vwb.m200311Y("micro_control_button", button);
        ve10 ve10Var = ve10.INSTANCE;
        zvf0.m220399u("e_micro_control", strM218905l, j760VarM200311Y, vwb.m200311Y("video_actor_role", ve10Var.m198143a(bLiveMultiCallM177967B)), vwb.m200311Y("video_other_actor_role", ve10Var.m198143a(otherRole)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m218894e(boolean noRemind) {
        zvf0.m220399u("e_video_room_create_popup_confirm", "p_user_live_room", vwb.m200311Y("no_remind_today", Boolean.valueOf(noRemind)), vwb.m200311Y("create_reason", "no_satisfied"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m218895f(@NotNull String switchType, @NotNull String switchClickType, boolean noRemindToday) {
        switchType.getClass();
        switchClickType.getClass();
        zvf0.m220399u("e_video_room_switch_popup", "p_anchor_live_room", vwb.m200311Y("mic_switch_type", switchType), vwb.m200311Y("mic_switch_click_type", switchClickType), vwb.m200311Y("no_remind_today", Boolean.valueOf(noRemindToday)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m218896g() {
        zvf0.m220399u("e_video_room_notice", "p_anchor_live_room", vwb.m200311Y("video_notice_type", "notice_sent_button"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m218897h() {
        zvf0.m220396r("e_video_connection_button", "p_anchor_live_room");
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m218898k(boolean isFree, boolean isAnchor) {
        zvf0.m220399u("e_video_room_micro", INSTANCE.m218905l(isAnchor), vwb.m200311Y("micro_type", isFree ? "free" : "invitation"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m218899m() {
        zvf0.m220368A("e_video_room_notice", "p_anchor_live_room", vwb.m200311Y("video_notice_type", "notice_cancel_confirm_button"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m218900n(boolean isFree) {
        zvf0.m220368A("e_video_room_join_chat", "p_user_live_room", vwb.m200311Y("micro_type", isFree ? "free" : "invitation"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m218901q(@NotNull String switchType) {
        switchType.getClass();
        zvf0.m220368A("e_video_room_switch_popup", "p_anchor_live_room", vwb.m200311Y("mic_switch_type", switchType));
    }

    /* JADX INFO: renamed from: c */
    public final void m218902c(@NotNull String popUpType, @NotNull String microClickButton, boolean isAnchor) {
        popUpType.getClass();
        microClickButton.getClass();
        zvf0.m220399u("e_micro_confirm", m218905l(isAnchor), vwb.m200311Y("micro_pop_up_type", popUpType), vwb.m200311Y("micro_click_button", microClickButton));
    }

    /* JADX INFO: renamed from: i */
    public final void m218903i() {
        zvf0.m220396r("e_video_invitation_bar", "p_anchor_live_room");
    }

    /* JADX INFO: renamed from: j */
    public final void m218904j(int choiceNum) {
        zvf0.m220399u("e_video_invitation_bar_button", "p_anchor_live_room", vwb.m200311Y("choice_num", Integer.valueOf(choiceNum)));
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final String m218905l(boolean isAnchor) {
        return isAnchor ? "p_anchor_live_room" : "p_user_live_room";
    }

    /* JADX INFO: renamed from: o */
    public final void m218906o(@NotNull String popUpType, boolean isAnchor) {
        popUpType.getClass();
        zvf0.m220368A("e_micro_confirm", m218905l(isAnchor), vwb.m200311Y("micro_pop_up_type", popUpType), vwb.m200311Y("micro_click_button", ""));
    }

    /* JADX INFO: renamed from: p */
    public final void m218907p(@NotNull String reason) {
        reason.getClass();
        zvf0.m220368A("e_video_room_create_popup_confirm", "p_user_live_room", vwb.m200311Y("create_reason", reason));
    }

    /* JADX INFO: renamed from: r */
    public final void m218908r() {
        zvf0.m220368A("e_video_room_notice", "p_anchor_live_room", vwb.m200311Y("video_notice_type", "notice_sent_button"));
    }
}
