package p153l;

import com.p051p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveUserUpgrade;

/* JADX INFO: loaded from: classes4.dex */
public class w4l extends jk2<LongLinkLiveUserLevel.UserHierarchyGrade, BLiveUserUpgrade> {
    public w4l(wbg0<BLiveUserUpgrade, BLiveUserUpgrade> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveUserLevel.UserHierarchyGrade userHierarchyGrade, String str) {
        return userHierarchyGrade.getGrade() != 0;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveUserUpgrade mo95993z(String str, LongLinkLiveUserLevel.UserHierarchyGrade userHierarchyGrade) {
        return f7t.m124501u(userHierarchyGrade);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveUserLevel.UserHierarchyGrade> mo95510b() {
        return LongLinkLiveUserLevel.UserHierarchyGrade.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.room.hierarchyGradeUp";
    }
}
