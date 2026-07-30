package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.data.DbObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ney {
    /* JADX INFO: renamed from: a */
    public static boolean m18698a(long j) {
        return j >= 38;
    }

    /* JADX INFO: renamed from: b */
    public static void m18699b(h4t h4tVar) {
        h4tVar.m25548F2().GiftDialogEventGroup.openGiftDialogEvent().j(new fp50().m13445i(1100));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.ho2] */
    /* JADX INFO: renamed from: c */
    public static void m18700c(h4t h4tVar, String str) {
        if (h4tVar.m25547E2().m14582l0() == null) {
            return;
        }
        h4tVar.m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(704).userId(str).setSource("liveLeaderboard").setFromIdentity(bqq.m10554a(h4tVar, ((DbObject) h4tVar.m25547E2().m14582l0()).id, str, 1100)).setTo(bqq.m10557d(h4tVar, ((DbObject) h4tVar.m25547E2().m14582l0()).id, str, 1100)).setScene("live").trackFrom("liveOnlineUser").build());
    }
}
