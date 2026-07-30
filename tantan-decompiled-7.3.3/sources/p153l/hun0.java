package p153l;

import com.p051p1.mobile.longlink.msg.liveright.liveRight;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class hun0 extends jk2<liveRight.AcquireUserLiveRightMsg, x8p0> {

    /* JADX INFO: renamed from: h */
    public final HashMap<String, Long> f111684h;

    public hun0(wbg0<x8p0, x8p0> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
        this.f111684h = new HashMap<>();
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(liveRight.AcquireUserLiveRightMsg acquireUserLiveRightMsg, String str) {
        String userId = acquireUserLiveRightMsg.getUserLiveRight().getUserId();
        boolean zContainsKey = this.f111684h.containsKey(userId);
        HashMap<String, Long> map = this.f111684h;
        if (!zContainsKey) {
            map.put(userId, Long.valueOf(acquireUserLiveRightMsg.getServerTimeInSeconds()));
            return true;
        }
        if (map.get(userId).longValue() >= acquireUserLiveRightMsg.getServerTimeInSeconds()) {
            return false;
        }
        this.f111684h.put(userId, Long.valueOf(acquireUserLiveRightMsg.getServerTimeInSeconds()));
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public x8p0 mo95993z(String str, liveRight.AcquireUserLiveRightMsg acquireUserLiveRightMsg) {
        return f7t.m124497q(acquireUserLiveRightMsg);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<liveRight.AcquireUserLiveRightMsg> mo95510b() {
        return liveRight.AcquireUserLiveRightMsg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.right.acquire";
    }
}
