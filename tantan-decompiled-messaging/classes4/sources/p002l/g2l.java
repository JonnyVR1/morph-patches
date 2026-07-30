package p002l;

import com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class g2l extends bk2<LongLinkLiveUserLevel.UserHierarchyGrade, BLiveUserUpgrade> {
    public g2l(p3g0<BLiveUserUpgrade, BLiveUserUpgrade> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveUserLevel.UserHierarchyGrade userHierarchyGrade, String str) {
        return userHierarchyGrade.getGrade() != 0;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveUserUpgrade mo9251z(String str, LongLinkLiveUserLevel.UserHierarchyGrade userHierarchyGrade) {
        return e5t.m12216u(userHierarchyGrade);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveUserLevel.UserHierarchyGrade> mo9244b() {
        return LongLinkLiveUserLevel.UserHierarchyGrade.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.room.hierarchyGradeUp";
    }
}
