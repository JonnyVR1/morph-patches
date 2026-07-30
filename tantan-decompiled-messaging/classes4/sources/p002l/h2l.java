package p002l;

import com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class h2l extends bk2<LongLinkLiveUserLevel.UserLiveHierarchyProgressChange, LongLinkLiveUserLevel.UserLiveHierarchyProgressChange> {

    /* JADX INFO: renamed from: h */
    public LongLinkLiveUserLevel.UserLiveHierarchyProgressChange f11858h;

    public h2l(p3g0<LongLinkLiveUserLevel.UserLiveHierarchyProgressChange, LongLinkLiveUserLevel.UserLiveHierarchyProgressChange> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange, String str) {
        LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange2 = this.f11858h;
        if (userLiveHierarchyProgressChange2 == null || userLiveHierarchyProgressChange2.getServerTs() <= userLiveHierarchyProgressChange.getServerTs()) {
            this.f11858h = userLiveHierarchyProgressChange;
            return true;
        }
        this.f11858h = userLiveHierarchyProgressChange;
        return false;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveUserLevel.UserLiveHierarchyProgressChange> mo9244b() {
        return LongLinkLiveUserLevel.UserLiveHierarchyProgressChange.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.hierarchy.userLiveHierarchyProgressChange";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveUserLevel.UserLiveHierarchyProgressChange mo9251z(String str, LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        return userLiveHierarchyProgressChange;
    }
}
