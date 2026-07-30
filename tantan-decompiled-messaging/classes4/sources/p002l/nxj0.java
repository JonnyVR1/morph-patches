package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nxj0 extends bk2<LongLinkLiveMessage.AnchorDailyTaskMessage, LongLinkLiveMessage.AnchorDailyTaskMessage> {
    public nxj0(p3g0<LongLinkLiveMessage.AnchorDailyTaskMessage, LongLinkLiveMessage.AnchorDailyTaskMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.AnchorDailyTaskMessage anchorDailyTaskMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.AnchorDailyTaskMessage> mo9244b() {
        return LongLinkLiveMessage.AnchorDailyTaskMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "livetricks:anchor.daily.task";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.AnchorDailyTaskMessage mo9251z(String str, LongLinkLiveMessage.AnchorDailyTaskMessage anchorDailyTaskMessage) {
        return anchorDailyTaskMessage;
    }
}
