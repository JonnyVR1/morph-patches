package p153l;

import com.p051p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg;

/* JADX INFO: loaded from: classes4.dex */
public class ggt extends jk2<LongLinkReportMsg.LiveReportMsg, LongLinkReportMsg.LiveReportMsg> {
    public ggt(wbg0 wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkReportMsg.LiveReportMsg liveReportMsg, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkReportMsg.LiveReportMsg> mo95510b() {
        return LongLinkReportMsg.LiveReportMsg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.distribution.report";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkReportMsg.LiveReportMsg mo95993z(String str, LongLinkReportMsg.LiveReportMsg liveReportMsg) {
        return liveReportMsg;
    }
}
