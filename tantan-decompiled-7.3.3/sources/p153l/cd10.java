package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;

/* JADX INFO: loaded from: classes5.dex */
public class cd10 {

    /* JADX INFO: renamed from: a */
    public static String f81073a = "multiCall";

    /* JADX INFO: renamed from: b */
    public static final int f81074b = qa00.m175859d(180.0f);

    /* JADX INFO: renamed from: c */
    public static String f81075c = BLiveActivity.TYPE_MULTI_CALL;

    /* JADX INFO: renamed from: d */
    public static String f81076d = Owner.TYPE;

    /* JADX INFO: renamed from: e */
    public static String f81077e = "anchor";

    /* JADX INFO: renamed from: f */
    public static String f81078f = "audience";

    /* JADX INFO: renamed from: g */
    public static String f81079g = "not_caller_in_owner_room";

    /* JADX INFO: renamed from: h */
    public static String f81080h = "not_caller_out_owner_room";

    /* JADX INFO: renamed from: i */
    public static String f81081i = "video";

    /* JADX INFO: renamed from: j */
    public static String f81082j = "voice";

    /* JADX INFO: renamed from: k */
    public static String f81083k = "invite";

    /* JADX INFO: renamed from: l */
    public static String f81084l = "apply";

    /* JADX INFO: renamed from: m */
    public static String f81085m = "created";

    /* JADX INFO: renamed from: n */
    public static String f81086n = "connecting";

    /* JADX INFO: renamed from: o */
    public static String f81087o = "on-going";

    /* JADX INFO: renamed from: p */
    public static String f81088p = "hang-up";

    /* JADX INFO: renamed from: q */
    public static String f81089q = "not-invited";

    /* JADX INFO: renamed from: r */
    public static String f81090r = "invited";

    /* JADX INFO: renamed from: s */
    public static String f81091s = "accepted";

    /* JADX INFO: renamed from: t */
    public static String f81092t = "ended";

    /* JADX INFO: renamed from: u */
    public static String f81093u = "profile";

    /* JADX INFO: renamed from: v */
    public static String f81094v = "invitePanel";

    /* JADX INFO: renamed from: w */
    public static String f81095w = "message";

    /* JADX INFO: renamed from: x */
    public static String f81096x = "applyPanel";

    /* JADX INFO: renamed from: y */
    public static String f81097y = "reject";

    /* JADX INFO: renamed from: z */
    public static String f81098z = "invite";

    /* JADX INFO: renamed from: A */
    public static String f81049A = "accept";

    /* JADX INFO: renamed from: B */
    public static String f81050B = "timeout";

    /* JADX INFO: renamed from: C */
    public static String f81051C = "anchor";

    /* JADX INFO: renamed from: D */
    public static String f81052D = "audience";

    /* JADX INFO: renamed from: E */
    public static String f81053E = "friend";

    /* JADX INFO: renamed from: F */
    public static String f81054F = LongLinkMultiCallMessage.MultiCallMessage.Type.apply.name();

    /* JADX INFO: renamed from: G */
    public static String f81055G = LongLinkMultiCallMessage.MultiCallMessage.Type.cancel.name();

    /* JADX INFO: renamed from: H */
    public static String f81056H = LongLinkMultiCallMessage.MultiCallMessage.Type.approve.name();

    /* JADX INFO: renamed from: I */
    public static String f81057I = LongLinkMultiCallMessage.MultiCallMessage.Type.success.name();

    /* JADX INFO: renamed from: J */
    public static String f81058J = LongLinkMultiCallMessage.MultiCallMessage.Type.hangUp.name();

    /* JADX INFO: renamed from: K */
    public static String f81059K = LongLinkMultiCallMessage.MultiCallMessage.Type.goAway.name();

    /* JADX INFO: renamed from: L */
    public static String f81060L = LongLinkMultiCallMessage.MultiCallMessage.Type.comeBack.name();

    /* JADX INFO: renamed from: M */
    public static String f81061M = LongLinkMultiCallMessage.MultiCallMessage.Type.switchToVideo.name();

    /* JADX INFO: renamed from: N */
    public static String f81062N = LongLinkMultiCallMessage.MultiCallMessage.Type.mute.name();

    /* JADX INFO: renamed from: O */
    public static String f81063O = LongLinkMultiCallMessage.MultiCallMessage.Type.unMute.name();

    /* JADX INFO: renamed from: P */
    public static String f81064P = LongLinkMultiCallMessage.MultiCallMessage.Type.inviteSwitchToVideo.name();

    /* JADX INFO: renamed from: Q */
    public static String f81065Q = LongLinkMultiCallMessage.MultiCallMessage.Type.rejectSwitchToVideo.name();

    /* JADX INFO: renamed from: R */
    public static String f81066R = LongLinkMultiCallMessage.MultiCallMessage.Type.pushSuccess.name();

    /* JADX INFO: renamed from: S */
    public static String f81067S = LongLinkMultiCallMessage.MultiCallMessage.Type.switchToLeadRole.name();

    /* JADX INFO: renamed from: T */
    public static String f81068T = LongLinkMultiCallMessage.MultiCallMessage.Type.cancelLeadRole.name();

    /* JADX INFO: renamed from: U */
    public static String f81069U = LongLinkMultiCallMessage.MultiCallMessage.Type.updatePosition.name();

    /* JADX INFO: renamed from: V */
    public static String f81070V = LongLinkMultiCallMessage.MultiCallMessage.Type.cdnFail.name();

    /* JADX INFO: renamed from: W */
    public static String f81071W = "multi-call-start-refresh-stream-address";

    /* JADX INFO: renamed from: X */
    public static String f81072X = "multi-call-stop-refresh-stream-address";

    /* JADX INFO: renamed from: a */
    public static int m109086a(boolean z) {
        return z ? f81074b : qa00.m175859d(152.0f) + bnl0.m105511F0();
    }
}
