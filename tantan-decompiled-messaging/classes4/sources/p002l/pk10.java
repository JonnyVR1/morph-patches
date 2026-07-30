package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pk10 extends bk2<LongLinkLiveMultiPk.MultiPkStageChange, LongLinkLiveMultiPk.MultiPkStageChange> {
    public pk10(p3g0<LongLinkLiveMultiPk.MultiPkStageChange, LongLinkLiveMultiPk.MultiPkStageChange> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMultiPk.MultiPkStageChange multiPkStageChange, String str) {
        return multiPkStageChange != null;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMultiPk.MultiPkStageChange> mo9244b() {
        return LongLinkLiveMultiPk.MultiPkStageChange.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.multiPk.stageChange";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMultiPk.MultiPkStageChange mo9251z(String str, LongLinkLiveMultiPk.MultiPkStageChange multiPkStageChange) {
        return multiPkStageChange;
    }
}
