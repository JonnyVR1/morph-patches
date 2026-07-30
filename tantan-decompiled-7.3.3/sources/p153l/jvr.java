package p153l;

import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;

/* JADX INFO: loaded from: classes4.dex */
public class jvr extends jk2<LongLinkSocketMessage.LiveAnimationPlayMsg, LongLinkSocketMessage.LiveAnimationPlayMsg> {
    public jvr(wbg0<LongLinkSocketMessage.LiveAnimationPlayMsg, LongLinkSocketMessage.LiveAnimationPlayMsg> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkSocketMessage.LiveAnimationPlayMsg liveAnimationPlayMsg, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.LiveAnimationPlayMsg> mo95510b() {
        return LongLinkSocketMessage.LiveAnimationPlayMsg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.animation.play";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.LiveAnimationPlayMsg mo95993z(String str, LongLinkSocketMessage.LiveAnimationPlayMsg liveAnimationPlayMsg) {
        return liveAnimationPlayMsg;
    }
}
