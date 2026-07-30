package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class t6k0 extends jk2<LongLinkLiveMessage.AnchorDailyTaskMessage, LongLinkLiveMessage.AnchorDailyTaskMessage> {
    public t6k0(wbg0<LongLinkLiveMessage.AnchorDailyTaskMessage, LongLinkLiveMessage.AnchorDailyTaskMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.AnchorDailyTaskMessage anchorDailyTaskMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.AnchorDailyTaskMessage> mo95510b() {
        return LongLinkLiveMessage.AnchorDailyTaskMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "livetricks:anchor.daily.task";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.AnchorDailyTaskMessage mo95993z(String str, LongLinkLiveMessage.AnchorDailyTaskMessage anchorDailyTaskMessage) {
        return anchorDailyTaskMessage;
    }
}
