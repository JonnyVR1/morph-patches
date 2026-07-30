package p153l;

import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;

/* JADX INFO: loaded from: classes4.dex */
public class c260 extends jk2<LongLinkSocketMessage.OperationUpdateNotice, LongLinkSocketMessage.OperationUpdateNotice> {
    public c260(wbg0<LongLinkSocketMessage.OperationUpdateNotice, LongLinkSocketMessage.OperationUpdateNotice> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.OperationUpdateNotice> mo95510b() {
        return LongLinkSocketMessage.OperationUpdateNotice.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.operation.update";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.OperationUpdateNotice mo95993z(String str, LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        return operationUpdateNotice;
    }
}
