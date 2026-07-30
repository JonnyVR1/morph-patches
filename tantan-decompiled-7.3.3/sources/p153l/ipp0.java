package p153l;

import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes5.dex */
public class ipp0 {
    /* JADX INFO: renamed from: a */
    public static void m141533a(oo2 oo2Var, String str, String str2, long j, String str3, String str4) {
        if (oo2Var == null || !oo2Var.m202193m().m146885k()) {
            return;
        }
        User userM168532l0 = oo2Var.m168532l0();
        String str5 = userM168532l0 == null ? "" : userM168532l0.f56859id;
        String strM202194o = oo2Var.m202194o();
        String strM202191k = oo2Var.m202191k();
        fhw.m125605a("[live]watchTime", "liveRoomStyle:" + str + " liveRoomDurationType:" + str2 + " liveDuration:" + j + " anchorId:" + str5 + " roomId:" + strM202194o + " liveId:" + strM202191k);
        i4g0.m138493B("e_liveduration", "", jyb.m147494Y("liveroomstyle", str), jyb.m147494Y("liveroom_durationtype", str2), jyb.m147494Y("anchorId", str5), jyb.m147494Y("roomId", strM202194o), jyb.m147494Y("liveId", strM202191k), jyb.m147494Y("liveduration", String.valueOf(j)), jyb.m147494Y("liveRecommendCategory", str3), jyb.m147494Y("live_outside_source", str4), jyb.m147494Y("live_in_source", oo2Var.mo160117o0()));
    }
}
