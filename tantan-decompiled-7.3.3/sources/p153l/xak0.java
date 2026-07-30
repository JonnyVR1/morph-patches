package p153l;

import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class xak0 {

    /* JADX INFO: renamed from: a */
    public l4g0 f193046a;

    /* JADX INFO: renamed from: a */
    public static void m209855a(String str, String str2) {
        i4g0.m138523u("e_audio_anchor_invite_call", "p_anchor_audio_room", new pf60("anchor_id", str), new pf60("live_id", str2));
    }

    /* JADX INFO: renamed from: e */
    public static void m209856e(String str, String str2, oo2 oo2Var, String str3) {
        tfs.C20303a c20303aM190972b = tfs.m190969k().m190972b(oo2Var, false);
        c20303aM190972b.m190978h(str3).m190975e(str2);
        afu.m97554c(str, c20303aM190972b.m190971a());
    }

    /* JADX INFO: renamed from: f */
    public static void m209857f(UserCardData userCardData, String str) {
        kfd0.C18147a c18147aM149412u = kfd0.m149385x().m149414w("e_pk_gotoliveroom_button").m149409r(userCardData.getLiveId()).m149398g(userCardData.userId()).m149412u("onlive");
        if (NullChecker.m82486a(userCardData.getMultiCall())) {
            c18147aM149412u.m149411t("video_live");
        } else {
            c18147aM149412u.m149411t("common_live");
        }
        afu.m97561j(c18147aM149412u.m149392a(), str);
    }

    /* JADX INFO: renamed from: g */
    public static void m209858g(String str, String str2, String str3) {
        i4g0.m138523u("e_audio_profile_send_message", str, jyb.m147494Y("live_id", str2), jyb.m147494Y("to_user_id", str3));
    }

    /* JADX INFO: renamed from: h */
    public static void m209859h() {
        i4g0.m138520r("e_livecall_user_gift", "p_live_profile");
    }

    /* JADX INFO: renamed from: i */
    public static void m209860i() {
        i4g0.m138526x("e_livecall_user_gift", "p_live_profile");
    }

    /* JADX INFO: renamed from: j */
    public static void m209861j(boolean z, String str, String str2) {
        i4g0.m138523u("e_audio_anchor_invite_call", "p_audio_profile", new pf60("anchorId", str), new pf60("liveId", str2), new pf60("scene", "audio_profile"), new pf60("user_type", z ? "anchor" : "manager"));
    }

    /* JADX INFO: renamed from: k */
    public static void m209862k(boolean z, oo2 oo2Var, String str, String str2) {
        i4g0.m138523u("e_audio_anchor_invite_call", z ? "p_anchor_audio_room" : "p_user_audio_room", new pf60("anchor_id", oo2Var.m168526j0()), new pf60("live_id", oo2Var.m202191k()), new pf60("scene", "anchorInviteCall".equals(str) ? "message" : "welcome_message"), new pf60("roomId", oo2Var.m202194o()), new pf60("user_type", str2));
    }

    /* JADX INFO: renamed from: b */
    public void m209863b() {
        l4g0 l4g0Var = this.f193046a;
        if (l4g0Var != null) {
            l4g0Var.m152776k();
            this.f193046a.m152775j();
            this.f193046a = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m209864c(String str, String str2, String str3, String str4, UserCardData userCardData) {
        m209865d(str, str2, str3, str4, userCardData, false);
    }

    /* JADX INFO: renamed from: d */
    public void m209865d(String str, String str2, String str3, String str4, UserCardData userCardData, boolean z) {
        l4g0 l4g0Var = new l4g0(str, tak0.class.getName());
        this.f193046a = l4g0Var;
        l4g0Var.m152781p(jyb.m147494Y("liveId", str2), jyb.m147494Y("anchorId", str3), jyb.m147494Y("liveroom_type", jlk0.m146082d(str4)), jyb.m147494Y("tooltips_trigger_mode", Active.TYPE), jyb.m147494Y("audio_user_type", z ? "perform_anchor" : jlk0.m146081c(userCardData)), jyb.m147494Y("card_user_id", userCardData.userId()));
        this.f193046a.m152774i();
        this.f193046a.m152777l();
    }
}
