package p002l;

import com.p1.mobile.longlink.msg.liveright.liveRight;
import java.util.HashMap;
import l.p3g0;
import l.tzo0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dln0 extends bk2<liveRight.AcquireUserLiveRightMsg, tzo0> {

    /* JADX INFO: renamed from: h */
    public final HashMap<String, Long> f9327h;

    public dln0(p3g0<tzo0, tzo0> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
        this.f9327h = new HashMap<>();
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(liveRight.AcquireUserLiveRightMsg acquireUserLiveRightMsg, String str) {
        String userId = acquireUserLiveRightMsg.getUserLiveRight().getUserId();
        boolean zContainsKey = this.f9327h.containsKey(userId);
        HashMap<String, Long> map = this.f9327h;
        if (!zContainsKey) {
            map.put(userId, Long.valueOf(acquireUserLiveRightMsg.getServerTimeInSeconds()));
            return true;
        }
        if (map.get(userId).longValue() >= acquireUserLiveRightMsg.getServerTimeInSeconds()) {
            return false;
        }
        this.f9327h.put(userId, Long.valueOf(acquireUserLiveRightMsg.getServerTimeInSeconds()));
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public tzo0 mo9251z(String str, liveRight.AcquireUserLiveRightMsg acquireUserLiveRightMsg) {
        return e5t.m12212q(acquireUserLiveRightMsg);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<liveRight.AcquireUserLiveRightMsg> mo9244b() {
        return liveRight.AcquireUserLiveRightMsg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.right.acquire";
    }
}
