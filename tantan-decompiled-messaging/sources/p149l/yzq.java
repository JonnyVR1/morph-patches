package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class yzq {
    /* JADX INFO: renamed from: a */
    public static String m216686a(boolean z, BLiveData bLiveData) {
        if (z) {
            return "anchor";
        }
        if (NullChecker.m81303a(bLiveData) && bLiveData.userKnightInfosSummary.size() > 0 && bLiveData.userKnightInfosSummary.get(0).isKnight) {
            return psk.m171176s((double) bLiveData.userKnightInfosSummary.get(0).createdTime) ? "user_knight_first_24h" : "user_knight_not_first_24h ";
        }
        return "user_not_knight";
    }

    /* JADX INFO: renamed from: b */
    public static void m216687b(ho2 ho2Var, String str, String str2) {
        zvf0.m220399u("e_live_guard_info_pay", "p_user_live_room", vwb.m200311Y("anchor_id", ho2Var.m132146l0().f56011id), vwb.m200311Y("button_type", str2), vwb.m200311Y("source", str));
    }

    /* JADX INFO: renamed from: c */
    public static void m216688c(boolean z, ho2 ho2Var, String str, BLiveData bLiveData) {
        zvf0.m220368A("e_live_guard_info", z ? "p_anchor_live_room" : "p_user_live_room", vwb.m200311Y("anchor_id", ho2Var.m132146l0().f56011id), vwb.m200311Y("source", str), vwb.m200311Y("user_type", m216686a(z, bLiveData)));
    }
}
