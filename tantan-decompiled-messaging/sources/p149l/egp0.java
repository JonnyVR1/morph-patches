package p149l;

import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes5.dex */
public class egp0 {
    /* JADX INFO: renamed from: a */
    public static void m116297a(ho2 ho2Var, String str, String str2, long j, String str3, String str4) {
        if (ho2Var == null || !ho2Var.m149816m().m137804k()) {
            return;
        }
        User userM132146l0 = ho2Var.m132146l0();
        String str5 = userM132146l0 == null ? "" : userM132146l0.f56011id;
        String strM149818o = ho2Var.m149818o();
        String strM149814k = ho2Var.m149814k();
        hfw.m130790a("[live]watchTime", "liveRoomStyle:" + str + " liveRoomDurationType:" + str2 + " liveDuration:" + j + " anchorId:" + str5 + " roomId:" + strM149818o + " liveId:" + strM149814k);
        zvf0.m220369B("e_liveduration", "", vwb.m200311Y("liveroomstyle", str), vwb.m200311Y("liveroom_durationtype", str2), vwb.m200311Y("anchorId", str5), vwb.m200311Y("roomId", strM149818o), vwb.m200311Y("liveId", strM149814k), vwb.m200311Y("liveduration", String.valueOf(j)), vwb.m200311Y("liveRecommendCategory", str3), vwb.m200311Y("live_outside_source", str4), vwb.m200311Y("live_in_source", ho2Var.mo132155o0()));
    }
}
