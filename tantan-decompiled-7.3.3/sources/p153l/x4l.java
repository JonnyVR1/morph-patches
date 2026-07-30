package p153l;

import com.p051p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;

/* JADX INFO: loaded from: classes4.dex */
public class x4l extends jk2<LongLinkLiveUserLevel.UserLiveHierarchyProgressChange, LongLinkLiveUserLevel.UserLiveHierarchyProgressChange> {

    /* JADX INFO: renamed from: h */
    public LongLinkLiveUserLevel.UserLiveHierarchyProgressChange f192422h;

    public x4l(wbg0<LongLinkLiveUserLevel.UserLiveHierarchyProgressChange, LongLinkLiveUserLevel.UserLiveHierarchyProgressChange> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange, String str) {
        LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange2 = this.f192422h;
        if (userLiveHierarchyProgressChange2 == null || userLiveHierarchyProgressChange2.getServerTs() <= userLiveHierarchyProgressChange.getServerTs()) {
            this.f192422h = userLiveHierarchyProgressChange;
            return true;
        }
        this.f192422h = userLiveHierarchyProgressChange;
        return false;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveUserLevel.UserLiveHierarchyProgressChange> mo95510b() {
        return LongLinkLiveUserLevel.UserLiveHierarchyProgressChange.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.hierarchy.userLiveHierarchyProgressChange";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveUserLevel.UserLiveHierarchyProgressChange mo95993z(String str, LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        return userLiveHierarchyProgressChange;
    }
}
