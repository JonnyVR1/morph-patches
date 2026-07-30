package p002l;

import com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fet extends bk2<LongLinkReportMsg.LiveReportMsg, LongLinkReportMsg.LiveReportMsg> {
    public fet(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkReportMsg.LiveReportMsg liveReportMsg, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkReportMsg.LiveReportMsg> mo9244b() {
        return LongLinkReportMsg.LiveReportMsg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.distribution.report";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkReportMsg.LiveReportMsg mo9251z(String str, LongLinkReportMsg.LiveReportMsg liveReportMsg) {
        return liveReportMsg;
    }
}
