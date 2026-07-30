package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class z1r {
    /* JADX INFO: renamed from: a */
    public static String m218365a(boolean z, BLiveData bLiveData) {
        if (z) {
            return "anchor";
        }
        if (NullChecker.m82486a(bLiveData) && bLiveData.userKnightInfosSummary.size() > 0 && bLiveData.userKnightInfosSummary.get(0).isKnight) {
            return fvk.m127668s((double) bLiveData.userKnightInfosSummary.get(0).createdTime) ? "user_knight_first_24h" : "user_knight_not_first_24h ";
        }
        return "user_not_knight";
    }

    /* JADX INFO: renamed from: b */
    public static void m218366b(oo2 oo2Var, String str, String str2) {
        i4g0.m138523u("e_live_guard_info_pay", "p_user_live_room", jyb.m147494Y("anchor_id", oo2Var.m168532l0().f56859id), jyb.m147494Y("button_type", str2), jyb.m147494Y("source", str));
    }

    /* JADX INFO: renamed from: c */
    public static void m218367c(boolean z, oo2 oo2Var, String str, BLiveData bLiveData) {
        i4g0.m138492A("e_live_guard_info", z ? "p_anchor_live_room" : "p_user_live_room", jyb.m147494Y("anchor_id", oo2Var.m168532l0().f56859id), jyb.m147494Y("source", str), jyb.m147494Y("user_type", m218365a(z, bLiveData)));
    }
}
