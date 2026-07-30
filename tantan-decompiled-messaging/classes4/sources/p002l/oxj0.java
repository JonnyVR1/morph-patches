package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oxj0 extends bk2<LongLinkLiveMessage.UserDailyTaskMessage, LongLinkLiveMessage.UserDailyTaskMessage> {
    public oxj0(p3g0<LongLinkLiveMessage.UserDailyTaskMessage, LongLinkLiveMessage.UserDailyTaskMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.UserDailyTaskMessage userDailyTaskMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.UserDailyTaskMessage> mo9244b() {
        return LongLinkLiveMessage.UserDailyTaskMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "livetricks:user.daily.task";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.UserDailyTaskMessage mo9251z(String str, LongLinkLiveMessage.UserDailyTaskMessage userDailyTaskMessage) {
        return userDailyTaskMessage;
    }
}
