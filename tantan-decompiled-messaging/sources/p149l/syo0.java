package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveUserDressUp;

/* JADX INFO: loaded from: classes11.dex */
public class syo0 {
    /* JADX INFO: renamed from: a */
    public static void m186710a(String str, String str2, ho2 ho2Var, String str3) {
        sds.C19911a c19911aM183543b = sds.m183540k().m183543b(ho2Var, false);
        c19911aM183543b.m183549h(str3).m183546e(str2);
        zcu.m218088c(str, c19911aM183543b.m183542a());
    }

    /* JADX INFO: renamed from: b */
    public static void m186711b(String str, String str2, String str3) {
        zvf0.m220399u("e_audio_profile_send_message", str, vwb.m200311Y("live_id", str2), vwb.m200311Y("to_user_id", str3));
    }

    /* JADX INFO: renamed from: c */
    public static void m186712c() {
        zvf0.m220396r("e_livecall_user_gift", "p_live_profile");
    }

    /* JADX INFO: renamed from: d */
    public static void m186713d(ho2 ho2Var, BLiveUserDressUp bLiveUserDressUp) {
        zvf0.m220399u(ycu.f197484b, ho2Var.mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("equipment_type", bLiveUserDressUp.type), vwb.m200311Y("equipment_id", bLiveUserDressUp.f44470id));
    }

    /* JADX INFO: renamed from: e */
    public static void m186714e(ho2 ho2Var) {
        zvf0.m220402x(ycu.f197484b, ho2Var.mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    /* JADX INFO: renamed from: f */
    public static void m186715f() {
        zvf0.m220396r(ycu.f197486d, "p_audio_profile");
    }

    /* JADX INFO: renamed from: g */
    public static void m186716g() {
        zvf0.m220402x(ycu.f197486d, "p_audio_profile");
    }
}
