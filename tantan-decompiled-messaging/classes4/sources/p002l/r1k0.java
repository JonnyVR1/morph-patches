package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.h7d0;
import l.j760;
import l.sds;
import l.vwb;
import l.zcu;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r1k0 {

    /* JADX INFO: renamed from: a */
    public cwf0 f18318a;

    /* JADX INFO: renamed from: a */
    public static void m21722a(String str, String str2) {
        zvf0.u("e_audio_anchor_invite_call", "p_anchor_audio_room", new j760[]{new j760("anchor_id", str), new j760("live_id", str2)});
    }

    /* JADX INFO: renamed from: e */
    public static void m21723e(String str, String str2, ho2 ho2Var, String str3) {
        sds.a aVarB = sds.k().b(ho2Var, false);
        aVarB.h(str3).e(str2);
        zcu.c(str, aVarB.a());
    }

    /* JADX INFO: renamed from: f */
    public static void m21724f(UserCardData userCardData, String str) {
        h7d0.a aVarU = h7d0.x().w("e_pk_gotoliveroom_button").r(userCardData.getLiveId()).g(userCardData.userId()).u("onlive");
        if (NullChecker.a(userCardData.getMultiCall())) {
            aVarU.t("video_live");
        } else {
            aVarU.t("common_live");
        }
        zcu.j(aVarU.a(), str);
    }

    /* JADX INFO: renamed from: g */
    public static void m21725g(String str, String str2, String str3) {
        zvf0.u("e_audio_profile_send_message", str, new j760[]{vwb.Y("live_id", str2), vwb.Y("to_user_id", str3)});
    }

    /* JADX INFO: renamed from: h */
    public static void m21726h() {
        zvf0.r("e_livecall_user_gift", "p_live_profile");
    }

    /* JADX INFO: renamed from: i */
    public static void m21727i() {
        zvf0.x("e_livecall_user_gift", "p_live_profile");
    }

    /* JADX INFO: renamed from: j */
    public static void m21728j(boolean z, String str, String str2) {
        zvf0.u("e_audio_anchor_invite_call", "p_audio_profile", new j760[]{new j760("anchorId", str), new j760("liveId", str2), new j760("scene", "audio_profile"), new j760("user_type", z ? "anchor" : "manager")});
    }

    /* JADX INFO: renamed from: k */
    public static void m21729k(boolean z, ho2 ho2Var, String str, String str2) {
        zvf0.u("e_audio_anchor_invite_call", z ? "p_anchor_audio_room" : "p_user_audio_room", new j760[]{new j760("anchor_id", ho2Var.m14576j0()), new j760("live_id", ho2Var.m17235k()), new j760("scene", "anchorInviteCall".equals(str) ? "message" : "welcome_message"), new j760("roomId", ho2Var.m17239o()), new j760("user_type", str2)});
    }

    /* JADX INFO: renamed from: b */
    public void m21730b() {
        cwf0 cwf0Var = this.f18318a;
        if (cwf0Var != null) {
            cwf0Var.k();
            this.f18318a.j();
            this.f18318a = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m21731c(String str, String str2, String str3, String str4, UserCardData userCardData) {
        m21732d(str, str2, str3, str4, userCardData, false);
    }

    /* JADX INFO: renamed from: d */
    public void m21732d(String str, String str2, String str3, String str4, UserCardData userCardData, boolean z) {
        cwf0 cwf0Var = new cwf0(str, n1k0.class.getName());
        this.f18318a = cwf0Var;
        cwf0Var.p(new j760[]{vwb.Y("liveId", str2), vwb.Y("anchorId", str3), vwb.Y("liveroom_type", dck0.m11736d(str4)), vwb.Y("tooltips_trigger_mode", "active"), vwb.Y("audio_user_type", z ? "perform_anchor" : dck0.m11735c(userCardData)), vwb.Y("card_user_id", userCardData.userId())});
        this.f18318a.i();
        this.f18318a.l();
    }
}
