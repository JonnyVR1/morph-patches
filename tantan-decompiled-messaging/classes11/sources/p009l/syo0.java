package p009l;

import com.p1.mobile.putong.live.base.data.BLiveUserDressUp;
import l.ho2;
import l.j760;
import l.sds;
import l.vwb;
import l.ycu;
import l.zcu;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class syo0 {
    /* JADX INFO: renamed from: a */
    public static void m22416a(String str, String str2, ho2 ho2Var, String str3) {
        sds.a aVarB = sds.k().b(ho2Var, false);
        aVarB.h(str3).e(str2);
        zcu.c(str, aVarB.a());
    }

    /* JADX INFO: renamed from: b */
    public static void m22417b(String str, String str2, String str3) {
        zvf0.u("e_audio_profile_send_message", str, new j760[]{vwb.Y("live_id", str2), vwb.Y("to_user_id", str3)});
    }

    /* JADX INFO: renamed from: c */
    public static void m22418c() {
        zvf0.r("e_livecall_user_gift", "p_live_profile");
    }

    /* JADX INFO: renamed from: d */
    public static void m22419d(ho2 ho2Var, BLiveUserDressUp bLiveUserDressUp) {
        zvf0.u(ycu.b, ho2Var.p() ? "p_anchor_audio_room" : "p_user_audio_room", new j760[]{vwb.Y("equipment_type", bLiveUserDressUp.type), vwb.Y("equipment_id", bLiveUserDressUp.id)});
    }

    /* JADX INFO: renamed from: e */
    public static void m22420e(ho2 ho2Var) {
        zvf0.x(ycu.b, ho2Var.p() ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    /* JADX INFO: renamed from: f */
    public static void m22421f() {
        zvf0.r(ycu.d, "p_audio_profile");
    }

    /* JADX INFO: renamed from: g */
    public static void m22422g() {
        zvf0.x(ycu.d, "p_audio_profile");
    }
}
