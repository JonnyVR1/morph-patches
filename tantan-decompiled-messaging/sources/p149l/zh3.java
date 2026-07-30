package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class zh3 {
    /* JADX INFO: renamed from: a */
    public static String m218758a(String str) {
        return str + "_" + qib0.f154693H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m218759b(ho2 ho2Var) {
        return ho2Var == null;
    }

    /* JADX INFO: renamed from: c */
    public static void m218760c(String str, String str2, ho2 ho2Var, String str3, String str4, String str5) {
        if (m218759b(ho2Var)) {
            return;
        }
        zvf0.m220399u("e_live_worldbullet", str3, vwb.m200311Y("worldbullet_type", str), vwb.m200311Y("worldbullet_name", str2), vwb.m200311Y("roomId", ho2Var.mo149817n().f44324id), vwb.m200311Y("live_id", ho2Var.mo149813j().f44323id), vwb.m200311Y("anchorId", ho2Var.m132146l0().f56011id), vwb.m200311Y("target_room_id", str4), vwb.m200311Y("target_live_id", str5));
    }

    /* JADX INFO: renamed from: d */
    public static void m218761d(String str, String str2, ho2 ho2Var, String str3, String str4, String str5) {
        if (m218759b(ho2Var)) {
            return;
        }
        zvf0.m220368A("e_live_worldbullet", str3, vwb.m200311Y("worldbullet_type", str), vwb.m200311Y("worldbullet_name", str2), vwb.m200311Y("roomId", ho2Var.mo149817n().f44324id), vwb.m200311Y("live_id", ho2Var.mo149813j().f44323id), vwb.m200311Y("anchorId", ho2Var.m132146l0().f56011id), vwb.m200311Y("target_room_id", str4), vwb.m200311Y("target_live_id", str5));
    }
}
