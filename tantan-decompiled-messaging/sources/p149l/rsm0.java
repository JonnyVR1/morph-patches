package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;

/* JADX INFO: loaded from: classes5.dex */
public class rsm0 {

    /* JADX INFO: renamed from: a */
    public static String f160880a = "[voice][call]";

    /* JADX INFO: renamed from: a */
    public static void m180693a(String str, String str2) {
        zvf0.m220399u("e_audio_accept_anchor_call", "p_user_audio_room", new j760("anchor_id", str), new j760("live_id", str2));
    }

    /* JADX INFO: renamed from: b */
    public static void m180694b(boolean z, String str, String str2) {
        zvf0.m220399u("e_audio_apply_anchor_approve", z ? "p_anchor_audio_room" : "p_user_audio_room", new j760("anchor_id", str), new j760("live_id", str2), new j760("user_type", z ? "anchor" : "manager"), new j760("scene", "message"));
    }

    /* JADX INFO: renamed from: c */
    public static void m180695c() {
        zvf0.m220396r("e_audio_blank", "p_anchor_audio_room");
    }

    /* JADX INFO: renamed from: d */
    public static void m180696d() {
        zvf0.m220396r("e_audio_blank", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: e */
    public static void m180697e(String str) {
        gkh0.m126627j(f160880a, str);
    }

    /* JADX INFO: renamed from: f */
    public static void m180698f(String str, String str2, BLiveVoiceCall bLiveVoiceCall) {
        m180697e("playTelepathicAnim userId:" + str + ",call position:" + (bLiveVoiceCall == null ? -1 : bLiveVoiceCall.position) + ",url:" + str2);
    }

    /* JADX INFO: renamed from: g */
    public static void m180699g(tzo0 tzo0Var, mqv<i54> mqvVar) {
        m180697e("updateAvatarFrame avatarFrame:" + tzo0Var.f172744a.toString() + ",userId:" + (mqvVar == null ? User.ID_TEAM_ACCOUNT : mqvVar.f135304a.f111520a));
    }

    /* JADX INFO: renamed from: h */
    public static void m180700h(boolean z, String str, String str2) {
        zvf0.m220399u("e_audio_apply_anchor_approve", "p_audio_management_panel", new j760("anchor_id", str), new j760("live_id", str2), new j760("user_type", z ? "anchor" : "manager"), new j760("scene", "management_host"));
    }

    /* JADX INFO: renamed from: i */
    public static void m180701i(boolean z, String str, String str2) {
        zvf0.m220399u("e_audio_voice_apply_refuse", "p_audio_management_panel", new j760("anchorId", str), new j760("liveId", str2), new j760("user_type", z ? "anchor" : "manager"), new j760("scene", "management_host"));
    }

    /* JADX INFO: renamed from: j */
    public static void m180702j() {
        zvf0.m220396r("e_audio_user_application", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: k */
    public static void m180703k() {
        zvf0.m220396r("e_audio_hour_rank", "p_anchor_audio_room");
    }

    /* JADX INFO: renamed from: l */
    public static void m180704l() {
        zvf0.m220396r("e_audio_hour_rank", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: m */
    public static void m180705m() {
        zvf0.m220396r("e_audio_top1_notice", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: n */
    public static void m180706n() {
        zvf0.m220402x("e_audio_contribution", "p_anchor_audio_room");
    }

    /* JADX INFO: renamed from: o */
    public static void m180707o() {
        zvf0.m220396r("e_audio_image", "p_anchor_audio_room");
    }

    /* JADX INFO: renamed from: p */
    public static void m180708p() {
        zvf0.m220396r("e_audio_image", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: q */
    public static void m180709q() {
        zvf0.m220402x("e_audio_contribution", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: r */
    public static void m180710r() {
        zvf0.m220396r("e_audio_management_entr", "p_anchor_audio_room");
    }

    /* JADX INFO: renamed from: s */
    public static void m180711s() {
        zvf0.m220396r("e_audio_management_entr", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: t */
    public static void m180712t() {
        zvf0.m220396r("e_audio_remove", "p_anchor_audio_room");
    }

    /* JADX INFO: renamed from: u */
    public static void m180713u() {
        zvf0.m220396r("e_audio_remove", "p_user_audio_room");
    }

    /* JADX INFO: renamed from: v */
    public static void m180714v() {
        zvf0.m220396r("e_audio_management_host", "p_anchor_audio_room");
    }

    /* JADX INFO: renamed from: w */
    public static void m180715w() {
        zvf0.m220396r("e_audio_management_host", "p_user_audio_room");
    }
}
