package p149l;

import com.p046p1.mobile.longlink.msg.liveright.liveRight;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class dln0 extends bk2<liveRight.AcquireUserLiveRightMsg, tzo0> {

    /* JADX INFO: renamed from: h */
    public final HashMap<String, Long> f86847h;

    public dln0(p3g0<tzo0, tzo0> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
        this.f86847h = new HashMap<>();
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(liveRight.AcquireUserLiveRightMsg acquireUserLiveRightMsg, String str) {
        String userId = acquireUserLiveRightMsg.getUserLiveRight().getUserId();
        boolean zContainsKey = this.f86847h.containsKey(userId);
        HashMap<String, Long> map = this.f86847h;
        if (!zContainsKey) {
            map.put(userId, Long.valueOf(acquireUserLiveRightMsg.getServerTimeInSeconds()));
            return true;
        }
        if (map.get(userId).longValue() >= acquireUserLiveRightMsg.getServerTimeInSeconds()) {
            return false;
        }
        this.f86847h.put(userId, Long.valueOf(acquireUserLiveRightMsg.getServerTimeInSeconds()));
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public tzo0 mo94461z(String str, liveRight.AcquireUserLiveRightMsg acquireUserLiveRightMsg) {
        return e5t.m114913q(acquireUserLiveRightMsg);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<liveRight.AcquireUserLiveRightMsg> mo94398b() {
        return liveRight.AcquireUserLiveRightMsg.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.right.acquire";
    }
}
