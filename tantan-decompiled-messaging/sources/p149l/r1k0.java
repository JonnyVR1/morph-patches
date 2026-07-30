package p149l;

import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class r1k0 {

    /* JADX INFO: renamed from: a */
    public cwf0 f157284a;

    /* JADX INFO: renamed from: a */
    public static void m177467a(String str, String str2) {
        zvf0.m220399u("e_audio_anchor_invite_call", "p_anchor_audio_room", new j760("anchor_id", str), new j760("live_id", str2));
    }

    /* JADX INFO: renamed from: e */
    public static void m177468e(String str, String str2, ho2 ho2Var, String str3) {
        sds.C19911a c19911aM183543b = sds.m183540k().m183543b(ho2Var, false);
        c19911aM183543b.m183549h(str3).m183546e(str2);
        zcu.m218088c(str, c19911aM183543b.m183542a());
    }

    /* JADX INFO: renamed from: f */
    public static void m177469f(UserCardData userCardData, String str) {
        h7d0.C17241a c17241aM129682u = h7d0.m129655x().m129684w("e_pk_gotoliveroom_button").m129679r(userCardData.getLiveId()).m129668g(userCardData.userId()).m129682u("onlive");
        if (NullChecker.m81303a(userCardData.getMultiCall())) {
            c17241aM129682u.m129681t("video_live");
        } else {
            c17241aM129682u.m129681t("common_live");
        }
        zcu.m218095j(c17241aM129682u.m129662a(), str);
    }

    /* JADX INFO: renamed from: g */
    public static void m177470g(String str, String str2, String str3) {
        zvf0.m220399u("e_audio_profile_send_message", str, vwb.m200311Y("live_id", str2), vwb.m200311Y("to_user_id", str3));
    }

    /* JADX INFO: renamed from: h */
    public static void m177471h() {
        zvf0.m220396r("e_livecall_user_gift", "p_live_profile");
    }

    /* JADX INFO: renamed from: i */
    public static void m177472i() {
        zvf0.m220402x("e_livecall_user_gift", "p_live_profile");
    }

    /* JADX INFO: renamed from: j */
    public static void m177473j(boolean z, String str, String str2) {
        zvf0.m220399u("e_audio_anchor_invite_call", "p_audio_profile", new j760("anchorId", str), new j760("liveId", str2), new j760("scene", "audio_profile"), new j760("user_type", z ? "anchor" : "manager"));
    }

    /* JADX INFO: renamed from: k */
    public static void m177474k(boolean z, ho2 ho2Var, String str, String str2) {
        zvf0.m220399u("e_audio_anchor_invite_call", z ? "p_anchor_audio_room" : "p_user_audio_room", new j760("anchor_id", ho2Var.m132140j0()), new j760("live_id", ho2Var.m149814k()), new j760("scene", "anchorInviteCall".equals(str) ? "message" : "welcome_message"), new j760("roomId", ho2Var.m149818o()), new j760("user_type", str2));
    }

    /* JADX INFO: renamed from: b */
    public void m177475b() {
        cwf0 cwf0Var = this.f157284a;
        if (cwf0Var != null) {
            cwf0Var.m109035k();
            this.f157284a.m109034j();
            this.f157284a = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m177476c(String str, String str2, String str3, String str4, UserCardData userCardData) {
        m177477d(str, str2, str3, str4, userCardData, false);
    }

    /* JADX INFO: renamed from: d */
    public void m177477d(String str, String str2, String str3, String str4, UserCardData userCardData, boolean z) {
        cwf0 cwf0Var = new cwf0(str, n1k0.class.getName());
        this.f157284a = cwf0Var;
        cwf0Var.m109040p(vwb.m200311Y("liveId", str2), vwb.m200311Y("anchorId", str3), vwb.m200311Y("liveroom_type", dck0.m110719d(str4)), vwb.m200311Y("tooltips_trigger_mode", Active.TYPE), vwb.m200311Y("audio_user_type", z ? "perform_anchor" : dck0.m110718c(userCardData)), vwb.m200311Y("card_user_id", userCardData.userId()));
        this.f157284a.m109033i();
        this.f157284a.m109036l();
    }
}
