package p002l;

import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummary;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yzq {
    /* JADX INFO: renamed from: a */
    public static String m27012a(boolean z, BLiveData bLiveData) {
        if (z) {
            return "anchor";
        }
        if (NullChecker.a(bLiveData) && bLiveData.userKnightInfosSummary.size() > 0 && ((BLiveUserKnightInfoSummary) bLiveData.userKnightInfosSummary.get(0)).isKnight) {
            return psk.m20672s((double) ((BLiveUserKnightInfoSummary) bLiveData.userKnightInfosSummary.get(0)).createdTime) ? "user_knight_first_24h" : "user_knight_not_first_24h ";
        }
        return "user_not_knight";
    }

    /* JADX INFO: renamed from: b */
    public static void m27013b(ho2 ho2Var, String str, String str2) {
        zvf0.u("e_live_guard_info_pay", "p_user_live_room", new j760[]{vwb.Y("anchor_id", ((DbObject) ho2Var.m14582l0()).id), vwb.Y("button_type", str2), vwb.Y("source", str)});
    }

    /* JADX INFO: renamed from: c */
    public static void m27014c(boolean z, ho2 ho2Var, String str, BLiveData bLiveData) {
        zvf0.A("e_live_guard_info", z ? "p_anchor_live_room" : "p_user_live_room", new j760[]{vwb.Y("anchor_id", ((DbObject) ho2Var.m14582l0()).id), vwb.Y("source", str), vwb.Y("user_type", m27012a(z, bLiveData))});
    }
}
