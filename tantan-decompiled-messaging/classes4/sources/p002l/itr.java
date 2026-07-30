package p002l;

import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class itr extends bk2<LongLinkSocketMessage.LiveAnimationPlayMsg, LongLinkSocketMessage.LiveAnimationPlayMsg> {
    public itr(p3g0<LongLinkSocketMessage.LiveAnimationPlayMsg, LongLinkSocketMessage.LiveAnimationPlayMsg> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkSocketMessage.LiveAnimationPlayMsg liveAnimationPlayMsg, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.LiveAnimationPlayMsg> mo9244b() {
        return LongLinkSocketMessage.LiveAnimationPlayMsg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.animation.play";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.LiveAnimationPlayMsg mo9251z(String str, LongLinkSocketMessage.LiveAnimationPlayMsg liveAnimationPlayMsg) {
        return liveAnimationPlayMsg;
    }
}
