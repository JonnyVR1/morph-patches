package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class oxj0 extends bk2<LongLinkLiveMessage.UserDailyTaskMessage, LongLinkLiveMessage.UserDailyTaskMessage> {
    public oxj0(p3g0<LongLinkLiveMessage.UserDailyTaskMessage, LongLinkLiveMessage.UserDailyTaskMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.UserDailyTaskMessage userDailyTaskMessage, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.UserDailyTaskMessage> mo94398b() {
        return LongLinkLiveMessage.UserDailyTaskMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "livetricks:user.daily.task";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.UserDailyTaskMessage mo94461z(String str, LongLinkLiveMessage.UserDailyTaskMessage userDailyTaskMessage) {
        return userDailyTaskMessage;
    }
}
