package p149l;

import com.p046p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;

/* JADX INFO: loaded from: classes4.dex */
public class h2l extends bk2<LongLinkLiveUserLevel.UserLiveHierarchyProgressChange, LongLinkLiveUserLevel.UserLiveHierarchyProgressChange> {

    /* JADX INFO: renamed from: h */
    public LongLinkLiveUserLevel.UserLiveHierarchyProgressChange f105538h;

    public h2l(p3g0<LongLinkLiveUserLevel.UserLiveHierarchyProgressChange, LongLinkLiveUserLevel.UserLiveHierarchyProgressChange> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange, String str) {
        LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange2 = this.f105538h;
        if (userLiveHierarchyProgressChange2 == null || userLiveHierarchyProgressChange2.getServerTs() <= userLiveHierarchyProgressChange.getServerTs()) {
            this.f105538h = userLiveHierarchyProgressChange;
            return true;
        }
        this.f105538h = userLiveHierarchyProgressChange;
        return false;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveUserLevel.UserLiveHierarchyProgressChange> mo94398b() {
        return LongLinkLiveUserLevel.UserLiveHierarchyProgressChange.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.hierarchy.userLiveHierarchyProgressChange";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveUserLevel.UserLiveHierarchyProgressChange mo94461z(String str, LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        return userLiveHierarchyProgressChange;
    }
}
