package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ad10 extends bk2<LongLinkMultiCallMessage.MultiCallTurnOnGuide, LongLinkMultiCallMessage.MultiCallTurnOnGuide> {
    public ad10(p3g0<LongLinkMultiCallMessage.MultiCallTurnOnGuide, LongLinkMultiCallMessage.MultiCallTurnOnGuide> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkMultiCallMessage.MultiCallTurnOnGuide multiCallTurnOnGuide, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMultiCallMessage.MultiCallTurnOnGuide> mo9244b() {
        return LongLinkMultiCallMessage.MultiCallTurnOnGuide.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.live.multi.call.turn.on.guide";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkMultiCallMessage.MultiCallTurnOnGuide mo9251z(String str, LongLinkMultiCallMessage.MultiCallTurnOnGuide multiCallTurnOnGuide) {
        return multiCallTurnOnGuide;
    }
}
