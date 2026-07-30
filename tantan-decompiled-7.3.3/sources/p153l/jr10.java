package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00042\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\u0003J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0003J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)J%\u0010+\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\u0017J\u0015\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\r¢\u0006\u0004\b-\u0010\u0019J\r\u0010.\u001a\u00020\u0004¢\u0006\u0004\b.\u0010\u0003J\u0015\u0010/\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b/\u00100¨\u00061"}, m88121d2 = {"Ll/jr10;", "", "<init>", "()V", "", "h", "", "isFree", "isAnchor", "k", "(ZZ)V", "Ll/i6t;", "presenter", "", "button", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "otherRole", Constants.INAPP_DATA_TAG, "(Ll/i6t;Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "switchType", "switchClickType", "noRemindToday", "f", "(Ljava/lang/String;Ljava/lang/String;Z)V", "q", "(Ljava/lang/String;)V", "b", "(Z)V", "n", "noRemind", "e", "g", "a", "m", RXScreenCaptureService.KEY_INDEX, "", "choiceNum", "j", "(I)V", "popUpType", "o", "(Ljava/lang/String;Z)V", "microClickButton", "c", Reason.TYPE, "p", "r", BLiveStormDanmakuGiftResourceType.f45292l, "(Z)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class jr10 {

    @NotNull
    public static final jr10 INSTANCE = new jr10();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m146655a() {
        i4g0.m138523u("e_video_room_notice", "p_anchor_live_room", jyb.m147494Y("video_notice_type", "notice_cancel_confirm_button"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m146656b(boolean isFree) {
        i4g0.m138523u("e_video_room_join_chat", "p_user_live_room", jyb.m147494Y("micro_type", isFree ? "free" : "invitation"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m146657d(@NotNull i6t<?, ?> presenter, @NotNull String button, @NotNull BLiveMultiCall otherRole) {
        presenter.getClass();
        button.getClass();
        otherRole.getClass();
        BLiveMultiCall bLiveMultiCallM103796B = bf10.m103796B(presenter);
        String strM146669l = INSTANCE.m146669l(presenter.m213815L2());
        pf60 pf60VarM147494Y = jyb.m147494Y("micro_control_button", button);
        fn10 fn10Var = fn10.INSTANCE;
        i4g0.m138523u("e_micro_control", strM146669l, pf60VarM147494Y, jyb.m147494Y("video_actor_role", fn10Var.m126349a(bLiveMultiCallM103796B)), jyb.m147494Y("video_other_actor_role", fn10Var.m126349a(otherRole)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m146658e(boolean noRemind) {
        i4g0.m138523u("e_video_room_create_popup_confirm", "p_user_live_room", jyb.m147494Y("no_remind_today", Boolean.valueOf(noRemind)), jyb.m147494Y("create_reason", "no_satisfied"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m146659f(@NotNull String switchType, @NotNull String switchClickType, boolean noRemindToday) {
        switchType.getClass();
        switchClickType.getClass();
        i4g0.m138523u("e_video_room_switch_popup", "p_anchor_live_room", jyb.m147494Y("mic_switch_type", switchType), jyb.m147494Y("mic_switch_click_type", switchClickType), jyb.m147494Y("no_remind_today", Boolean.valueOf(noRemindToday)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m146660g() {
        i4g0.m138523u("e_video_room_notice", "p_anchor_live_room", jyb.m147494Y("video_notice_type", "notice_sent_button"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m146661h() {
        i4g0.m138520r("e_video_connection_button", "p_anchor_live_room");
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m146662k(boolean isFree, boolean isAnchor) {
        i4g0.m138523u("e_video_room_micro", INSTANCE.m146669l(isAnchor), jyb.m147494Y("micro_type", isFree ? "free" : "invitation"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m146663m() {
        i4g0.m138492A("e_video_room_notice", "p_anchor_live_room", jyb.m147494Y("video_notice_type", "notice_cancel_confirm_button"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m146664n(boolean isFree) {
        i4g0.m138492A("e_video_room_join_chat", "p_user_live_room", jyb.m147494Y("micro_type", isFree ? "free" : "invitation"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m146665q(@NotNull String switchType) {
        switchType.getClass();
        i4g0.m138492A("e_video_room_switch_popup", "p_anchor_live_room", jyb.m147494Y("mic_switch_type", switchType));
    }

    /* JADX INFO: renamed from: c */
    public final void m146666c(@NotNull String popUpType, @NotNull String microClickButton, boolean isAnchor) {
        popUpType.getClass();
        microClickButton.getClass();
        i4g0.m138523u("e_micro_confirm", m146669l(isAnchor), jyb.m147494Y("micro_pop_up_type", popUpType), jyb.m147494Y("micro_click_button", microClickButton));
    }

    /* JADX INFO: renamed from: i */
    public final void m146667i() {
        i4g0.m138520r("e_video_invitation_bar", "p_anchor_live_room");
    }

    /* JADX INFO: renamed from: j */
    public final void m146668j(int choiceNum) {
        i4g0.m138523u("e_video_invitation_bar_button", "p_anchor_live_room", jyb.m147494Y("choice_num", Integer.valueOf(choiceNum)));
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final String m146669l(boolean isAnchor) {
        return isAnchor ? "p_anchor_live_room" : "p_user_live_room";
    }

    /* JADX INFO: renamed from: o */
    public final void m146670o(@NotNull String popUpType, boolean isAnchor) {
        popUpType.getClass();
        i4g0.m138492A("e_micro_confirm", m146669l(isAnchor), jyb.m147494Y("micro_pop_up_type", popUpType), jyb.m147494Y("micro_click_button", ""));
    }

    /* JADX INFO: renamed from: p */
    public final void m146671p(@NotNull String reason) {
        reason.getClass();
        i4g0.m138492A("e_video_room_create_popup_confirm", "p_user_live_room", jyb.m147494Y("create_reason", reason));
    }

    /* JADX INFO: renamed from: r */
    public final void m146672r() {
        i4g0.m138492A("e_video_room_notice", "p_anchor_live_room", jyb.m147494Y("video_notice_type", "notice_sent_button"));
    }
}
