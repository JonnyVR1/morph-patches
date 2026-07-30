package p002l;

import com.tantanapp.common.data.DbObject;
import l.j760;
import l.qib0;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zh3 {
    /* JADX INFO: renamed from: a */
    public static String m27373a(String str) {
        return str + "_" + qib0.H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m27374b(ho2 ho2Var) {
        return ho2Var == null;
    }

    /* JADX INFO: renamed from: c */
    public static void m27375c(String str, String str2, ho2 ho2Var, String str3, String str4, String str5) {
        if (m27374b(ho2Var)) {
            return;
        }
        zvf0.u("e_live_worldbullet", str3, new j760[]{vwb.Y("worldbullet_type", str), vwb.Y("worldbullet_name", str2), vwb.Y("roomId", ho2Var.m17238n().id), vwb.Y("live_id", ho2Var.m17234j().id), vwb.Y("anchorId", ((DbObject) ho2Var.m14582l0()).id), vwb.Y("target_room_id", str4), vwb.Y("target_live_id", str5)});
    }

    /* JADX INFO: renamed from: d */
    public static void m27376d(String str, String str2, ho2 ho2Var, String str3, String str4, String str5) {
        if (m27374b(ho2Var)) {
            return;
        }
        zvf0.A("e_live_worldbullet", str3, new j760[]{vwb.Y("worldbullet_type", str), vwb.Y("worldbullet_name", str2), vwb.Y("roomId", ho2Var.m17238n().id), vwb.Y("live_id", ho2Var.m17234j().id), vwb.Y("anchorId", ((DbObject) ho2Var.m14582l0()).id), vwb.Y("target_room_id", str4), vwb.Y("target_live_id", str5)});
    }
}
