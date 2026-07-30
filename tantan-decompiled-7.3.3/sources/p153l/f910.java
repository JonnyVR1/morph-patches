package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;

/* JADX INFO: loaded from: classes4.dex */
public class f910 extends jk2<LongLinkMultiCallMessage.MultiCallActionMessage, LongLinkMultiCallMessage.MultiCallActionMessage> {
    public f910(wbg0<LongLinkMultiCallMessage.MultiCallActionMessage, LongLinkMultiCallMessage.MultiCallActionMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkMultiCallMessage.MultiCallActionMessage multiCallActionMessage, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkMultiCallMessage.MultiCallActionMessage mo95993z(String str, LongLinkMultiCallMessage.MultiCallActionMessage multiCallActionMessage) {
        ir10.m141746a("multi call action message :" + multiCallActionMessage.getType() + ", userId:" + multiCallActionMessage.getUserId());
        return multiCallActionMessage;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMultiCallMessage.MultiCallActionMessage> mo95510b() {
        return LongLinkMultiCallMessage.MultiCallActionMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.live.multi.call.action";
    }
}
