package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;

/* JADX INFO: loaded from: classes4.dex */
public class v010 extends bk2<LongLinkMultiCallMessage.MultiCallActionMessage, LongLinkMultiCallMessage.MultiCallActionMessage> {
    public v010(p3g0<LongLinkMultiCallMessage.MultiCallActionMessage, LongLinkMultiCallMessage.MultiCallActionMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkMultiCallMessage.MultiCallActionMessage multiCallActionMessage, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkMultiCallMessage.MultiCallActionMessage mo94461z(String str, LongLinkMultiCallMessage.MultiCallActionMessage multiCallActionMessage) {
        yi10.m214879a("multi call action message :" + multiCallActionMessage.getType() + ", userId:" + multiCallActionMessage.getUserId());
        return multiCallActionMessage;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMultiCallMessage.MultiCallActionMessage> mo94398b() {
        return LongLinkMultiCallMessage.MultiCallActionMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.live.multi.call.action";
    }
}
