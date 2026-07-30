package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nk10 extends bk2<LongLinkLiveMultiPk.MultiPkPoints, LongLinkLiveMultiPk.MultiPkPoints> {
    public nk10(p3g0<LongLinkLiveMultiPk.MultiPkPoints, LongLinkLiveMultiPk.MultiPkPoints> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMultiPk.MultiPkPoints multiPkPoints, String str) {
        return multiPkPoints != null;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMultiPk.MultiPkPoints> mo9244b() {
        return LongLinkLiveMultiPk.MultiPkPoints.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.multiPk.points";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMultiPk.MultiPkPoints mo9251z(String str, LongLinkLiveMultiPk.MultiPkPoints multiPkPoints) {
        return multiPkPoints;
    }
}
