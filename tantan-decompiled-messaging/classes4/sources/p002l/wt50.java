package p002l;

import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wt50 extends bk2<LongLinkSocketMessage.OperationUpdateNotice, LongLinkSocketMessage.OperationUpdateNotice> {
    public wt50(p3g0<LongLinkSocketMessage.OperationUpdateNotice, LongLinkSocketMessage.OperationUpdateNotice> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.OperationUpdateNotice> mo9244b() {
        return LongLinkSocketMessage.OperationUpdateNotice.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.operation.update";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.OperationUpdateNotice mo9251z(String str, LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        return operationUpdateNotice;
    }
}
