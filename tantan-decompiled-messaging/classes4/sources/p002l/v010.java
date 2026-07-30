package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import l.p3g0;
import l.yi10;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class v010 extends bk2<LongLinkMultiCallMessage.MultiCallActionMessage, LongLinkMultiCallMessage.MultiCallActionMessage> {
    public v010(p3g0<LongLinkMultiCallMessage.MultiCallActionMessage, LongLinkMultiCallMessage.MultiCallActionMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkMultiCallMessage.MultiCallActionMessage multiCallActionMessage, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkMultiCallMessage.MultiCallActionMessage mo9251z(String str, LongLinkMultiCallMessage.MultiCallActionMessage multiCallActionMessage) {
        yi10.a("multi call action message :" + multiCallActionMessage.getType() + ", userId:" + multiCallActionMessage.getUserId());
        return multiCallActionMessage;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMultiCallMessage.MultiCallActionMessage> mo9244b() {
        return LongLinkMultiCallMessage.MultiCallActionMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.live.multi.call.action";
    }
}
