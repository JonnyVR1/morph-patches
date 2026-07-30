package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class u6k0 extends jk2<LongLinkLiveMessage.UserDailyTaskMessage, LongLinkLiveMessage.UserDailyTaskMessage> {
    public u6k0(wbg0<LongLinkLiveMessage.UserDailyTaskMessage, LongLinkLiveMessage.UserDailyTaskMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.UserDailyTaskMessage userDailyTaskMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.UserDailyTaskMessage> mo95510b() {
        return LongLinkLiveMessage.UserDailyTaskMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "livetricks:user.daily.task";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.UserDailyTaskMessage mo95993z(String str, LongLinkLiveMessage.UserDailyTaskMessage userDailyTaskMessage) {
        return userDailyTaskMessage;
    }
}
