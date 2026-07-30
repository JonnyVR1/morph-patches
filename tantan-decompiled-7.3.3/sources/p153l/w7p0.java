package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveUserDressUp;

/* JADX INFO: loaded from: classes10.dex */
public class w7p0 {
    /* JADX INFO: renamed from: a */
    public static void m205353a(String str, String str2, oo2 oo2Var, String str3) {
        tfs.C20303a c20303aM190972b = tfs.m190969k().m190972b(oo2Var, false);
        c20303aM190972b.m190978h(str3).m190975e(str2);
        afu.m97554c(str, c20303aM190972b.m190971a());
    }

    /* JADX INFO: renamed from: b */
    public static void m205354b(String str, String str2, String str3) {
        i4g0.m138523u("e_audio_profile_send_message", str, jyb.m147494Y("live_id", str2), jyb.m147494Y("to_user_id", str3));
    }

    /* JADX INFO: renamed from: c */
    public static void m205355c() {
        i4g0.m138520r("e_livecall_user_gift", "p_live_profile");
    }

    /* JADX INFO: renamed from: d */
    public static void m205356d(oo2 oo2Var, BLiveUserDressUp bLiveUserDressUp) {
        i4g0.m138523u(zeu.f204075b, oo2Var.mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("equipment_type", bLiveUserDressUp.type), jyb.m147494Y("equipment_id", bLiveUserDressUp.f45318id));
    }

    /* JADX INFO: renamed from: e */
    public static void m205357e(oo2 oo2Var) {
        i4g0.m138526x(zeu.f204075b, oo2Var.mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    /* JADX INFO: renamed from: f */
    public static void m205358f() {
        i4g0.m138520r(zeu.f204077d, "p_audio_profile");
    }

    /* JADX INFO: renamed from: g */
    public static void m205359g() {
        i4g0.m138526x(zeu.f204077d, "p_audio_profile");
    }
}
