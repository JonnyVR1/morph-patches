package p149l;

import com.p046p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveUserUpgrade;

/* JADX INFO: loaded from: classes4.dex */
public class g2l extends bk2<LongLinkLiveUserLevel.UserHierarchyGrade, BLiveUserUpgrade> {
    public g2l(p3g0<BLiveUserUpgrade, BLiveUserUpgrade> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveUserLevel.UserHierarchyGrade userHierarchyGrade, String str) {
        return userHierarchyGrade.getGrade() != 0;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveUserUpgrade mo94461z(String str, LongLinkLiveUserLevel.UserHierarchyGrade userHierarchyGrade) {
        return e5t.m114917u(userHierarchyGrade);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveUserLevel.UserHierarchyGrade> mo94398b() {
        return LongLinkLiveUserLevel.UserHierarchyGrade.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.room.hierarchyGradeUp";
    }
}
