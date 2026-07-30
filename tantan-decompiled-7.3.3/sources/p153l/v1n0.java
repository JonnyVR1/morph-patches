package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;

/* JADX INFO: loaded from: classes5.dex */
public class v1n0 {

    /* JADX INFO: renamed from: a */
    public static String f181989a = "[voice][call]";

    /* JADX INFO: renamed from: a */
    public static void m199023a(String str, String str2) {
        i4g0.m138523u("e_audio_accept_anchor_call", "p_user_audio_room", new pf60("anchor_id", str), new pf60("live_id", str2));
    }

    /* JADX INFO: renamed from: b */
    public static void m199024b(boolean z, String str, String str2) {
        i4g0.m138523u("e_audio_apply_anchor_approve", z ? "p_anchor_audio_room" : "p_user_audio_room", new pf60("anchor_id", str), new pf60("live_id", str2), new pf60("user_type", z ? "anchor" : "manager"), new pf60("scene", "message"));
    }

    /* JADX INFO: renamed from: c */
    public static void m199025c() {
        i4g0.m138520r("e_audio_blank", "p_anchor_audio_room");
    }

    /* JADX INFO: renamed from: d */
    public static void m199026d() {
        i4g0.m138520r("e_audio_blank", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: e */
    public static void m199027e(String str) {
        nsh0.m164608j(f181989a, str);
    }

    /* JADX INFO: renamed from: f */
    public static void m199028f(String str, String str2, BLiveVoiceCall bLiveVoiceCall) {
        m199027e("playTelepathicAnim userId:" + str + ",call position:" + (bLiveVoiceCall == null ? -1 : bLiveVoiceCall.position) + ",url:" + str2);
    }

    /* JADX INFO: renamed from: g */
    public static void m199029g(x8p0 x8p0Var, nsv<h64> nsvVar) {
        m199027e("updateAvatarFrame avatarFrame:" + x8p0Var.f192860a.toString() + ",userId:" + (nsvVar == null ? User.ID_TEAM_ACCOUNT : nsvVar.f143542a.f107997a));
    }

    /* JADX INFO: renamed from: h */
    public static void m199030h(boolean z, String str, String str2) {
        i4g0.m138523u("e_audio_apply_anchor_approve", "p_audio_management_panel", new pf60("anchor_id", str), new pf60("live_id", str2), new pf60("user_type", z ? "anchor" : "manager"), new pf60("scene", "management_host"));
    }

    /* JADX INFO: renamed from: i */
    public static void m199031i(boolean z, String str, String str2) {
        i4g0.m138523u("e_audio_voice_apply_refuse", "p_audio_management_panel", new pf60("anchorId", str), new pf60("liveId", str2), new pf60("user_type", z ? "anchor" : "manager"), new pf60("scene", "management_host"));
    }

    /* JADX INFO: renamed from: j */
    public static void m199032j() {
        i4g0.m138520r("e_audio_user_application", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: k */
    public static void m199033k() {
        i4g0.m138520r("e_audio_hour_rank", "p_anchor_audio_room");
    }

    /* JADX INFO: renamed from: l */
    public static void m199034l() {
        i4g0.m138520r("e_audio_hour_rank", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: m */
    public static void m199035m() {
        i4g0.m138520r("e_audio_top1_notice", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: n */
    public static void m199036n() {
        i4g0.m138526x("e_audio_contribution", "p_anchor_audio_room");
    }

    /* JADX INFO: renamed from: o */
    public static void m199037o() {
        i4g0.m138520r("e_audio_image", "p_anchor_audio_room");
    }

    /* JADX INFO: renamed from: p */
    public static void m199038p() {
        i4g0.m138520r("e_audio_image", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: q */
    public static void m199039q() {
        i4g0.m138526x("e_audio_contribution", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: r */
    public static void m199040r() {
        i4g0.m138520r("e_audio_management_entr", "p_anchor_audio_room");
    }

    /* JADX INFO: renamed from: s */
    public static void m199041s() {
        i4g0.m138520r("e_audio_management_entr", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: t */
    public static void m199042t() {
        i4g0.m138520r("e_audio_remove", "p_anchor_audio_room");
    }

    /* JADX INFO: renamed from: u */
    public static void m199043u() {
        i4g0.m138520r("e_audio_remove", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: v */
    public static void m199044v() {
        i4g0.m138520r("e_audio_management_host", "p_anchor_audio_room");
    }

    /* JADX INFO: renamed from: w */
    public static void m199045w() {
        i4g0.m138520r("e_audio_management_host", "p_user_audio_room");
    }
}
