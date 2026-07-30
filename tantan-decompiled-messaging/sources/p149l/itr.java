package p149l;

import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;

/* JADX INFO: loaded from: classes4.dex */
public class itr extends bk2<LongLinkSocketMessage.LiveAnimationPlayMsg, LongLinkSocketMessage.LiveAnimationPlayMsg> {
    public itr(p3g0<LongLinkSocketMessage.LiveAnimationPlayMsg, LongLinkSocketMessage.LiveAnimationPlayMsg> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkSocketMessage.LiveAnimationPlayMsg liveAnimationPlayMsg, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.LiveAnimationPlayMsg> mo94398b() {
        return LongLinkSocketMessage.LiveAnimationPlayMsg.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.animation.play";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkSocketMessage.LiveAnimationPlayMsg mo94461z(String str, LongLinkSocketMessage.LiveAnimationPlayMsg liveAnimationPlayMsg) {
        return liveAnimationPlayMsg;
    }
}
