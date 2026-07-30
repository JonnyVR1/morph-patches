package p149l;

import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;

/* JADX INFO: loaded from: classes4.dex */
public class wt50 extends bk2<LongLinkSocketMessage.OperationUpdateNotice, LongLinkSocketMessage.OperationUpdateNotice> {
    public wt50(p3g0<LongLinkSocketMessage.OperationUpdateNotice, LongLinkSocketMessage.OperationUpdateNotice> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.OperationUpdateNotice> mo94398b() {
        return LongLinkSocketMessage.OperationUpdateNotice.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.operation.update";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.OperationUpdateNotice mo94461z(String str, LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        return operationUpdateNotice;
    }
}
