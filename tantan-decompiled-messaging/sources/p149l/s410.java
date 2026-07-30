package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;

/* JADX INFO: loaded from: classes5.dex */
public class s410 {

    /* JADX INFO: renamed from: a */
    public static String f162235a = "multiCall";

    /* JADX INFO: renamed from: b */
    public static final int f162236b = t100.m186890d(180.0f);

    /* JADX INFO: renamed from: c */
    public static String f162237c = BLiveActivity.TYPE_MULTI_CALL;

    /* JADX INFO: renamed from: d */
    public static String f162238d = Owner.TYPE;

    /* JADX INFO: renamed from: e */
    public static String f162239e = "anchor";

    /* JADX INFO: renamed from: f */
    public static String f162240f = "audience";

    /* JADX INFO: renamed from: g */
    public static String f162241g = "not_caller_in_owner_room";

    /* JADX INFO: renamed from: h */
    public static String f162242h = "not_caller_out_owner_room";

    /* JADX INFO: renamed from: i */
    public static String f162243i = "video";

    /* JADX INFO: renamed from: j */
    public static String f162244j = "voice";

    /* JADX INFO: renamed from: k */
    public static String f162245k = "invite";

    /* JADX INFO: renamed from: l */
    public static String f162246l = "apply";

    /* JADX INFO: renamed from: m */
    public static String f162247m = "created";

    /* JADX INFO: renamed from: n */
    public static String f162248n = "connecting";

    /* JADX INFO: renamed from: o */
    public static String f162249o = "on-going";

    /* JADX INFO: renamed from: p */
    public static String f162250p = "hang-up";

    /* JADX INFO: renamed from: q */
    public static String f162251q = "not-invited";

    /* JADX INFO: renamed from: r */
    public static String f162252r = "invited";

    /* JADX INFO: renamed from: s */
    public static String f162253s = "accepted";

    /* JADX INFO: renamed from: t */
    public static String f162254t = "ended";

    /* JADX INFO: renamed from: u */
    public static String f162255u = "profile";

    /* JADX INFO: renamed from: v */
    public static String f162256v = "invitePanel";

    /* JADX INFO: renamed from: w */
    public static String f162257w = "message";

    /* JADX INFO: renamed from: x */
    public static String f162258x = "applyPanel";

    /* JADX INFO: renamed from: y */
    public static String f162259y = "reject";

    /* JADX INFO: renamed from: z */
    public static String f162260z = "invite";

    /* JADX INFO: renamed from: A */
    public static String f162211A = "accept";

    /* JADX INFO: renamed from: B */
    public static String f162212B = "timeout";

    /* JADX INFO: renamed from: C */
    public static String f162213C = "anchor";

    /* JADX INFO: renamed from: D */
    public static String f162214D = "audience";

    /* JADX INFO: renamed from: E */
    public static String f162215E = "friend";

    /* JADX INFO: renamed from: F */
    public static String f162216F = LongLinkMultiCallMessage.MultiCallMessage.Type.apply.name();

    /* JADX INFO: renamed from: G */
    public static String f162217G = LongLinkMultiCallMessage.MultiCallMessage.Type.cancel.name();

    /* JADX INFO: renamed from: H */
    public static String f162218H = LongLinkMultiCallMessage.MultiCallMessage.Type.approve.name();

    /* JADX INFO: renamed from: I */
    public static String f162219I = LongLinkMultiCallMessage.MultiCallMessage.Type.success.name();

    /* JADX INFO: renamed from: J */
    public static String f162220J = LongLinkMultiCallMessage.MultiCallMessage.Type.hangUp.name();

    /* JADX INFO: renamed from: K */
    public static String f162221K = LongLinkMultiCallMessage.MultiCallMessage.Type.goAway.name();

    /* JADX INFO: renamed from: L */
    public static String f162222L = LongLinkMultiCallMessage.MultiCallMessage.Type.comeBack.name();

    /* JADX INFO: renamed from: M */
    public static String f162223M = LongLinkMultiCallMessage.MultiCallMessage.Type.switchToVideo.name();

    /* JADX INFO: renamed from: N */
    public static String f162224N = LongLinkMultiCallMessage.MultiCallMessage.Type.mute.name();

    /* JADX INFO: renamed from: O */
    public static String f162225O = LongLinkMultiCallMessage.MultiCallMessage.Type.unMute.name();

    /* JADX INFO: renamed from: P */
    public static String f162226P = LongLinkMultiCallMessage.MultiCallMessage.Type.inviteSwitchToVideo.name();

    /* JADX INFO: renamed from: Q */
    public static String f162227Q = LongLinkMultiCallMessage.MultiCallMessage.Type.rejectSwitchToVideo.name();

    /* JADX INFO: renamed from: R */
    public static String f162228R = LongLinkMultiCallMessage.MultiCallMessage.Type.pushSuccess.name();

    /* JADX INFO: renamed from: S */
    public static String f162229S = LongLinkMultiCallMessage.MultiCallMessage.Type.switchToLeadRole.name();

    /* JADX INFO: renamed from: T */
    public static String f162230T = LongLinkMultiCallMessage.MultiCallMessage.Type.cancelLeadRole.name();

    /* JADX INFO: renamed from: U */
    public static String f162231U = LongLinkMultiCallMessage.MultiCallMessage.Type.updatePosition.name();

    /* JADX INFO: renamed from: V */
    public static String f162232V = LongLinkMultiCallMessage.MultiCallMessage.Type.cdnFail.name();

    /* JADX INFO: renamed from: W */
    public static String f162233W = "multi-call-start-refresh-stream-address";

    /* JADX INFO: renamed from: X */
    public static String f162234X = "multi-call-stop-refresh-stream-address";

    /* JADX INFO: renamed from: a */
    public static int m182205a(boolean z) {
        return z ? f162236b : t100.m186890d(152.0f) + xdl0.m208331F0();
    }
}
