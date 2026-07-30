package p002l;

import com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pmk0 extends bk2<liveAuthMessageNew.MultiDevice, liveAuthMessageNew.MultiDevice> {
    public pmk0(p3g0<liveAuthMessageNew.MultiDevice, liveAuthMessageNew.MultiDevice> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(liveAuthMessageNew.MultiDevice multiDevice, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<liveAuthMessageNew.MultiDevice> mo9244b() {
        return liveAuthMessageNew.MultiDevice.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.socket.multiDevice";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public liveAuthMessageNew.MultiDevice mo9251z(String str, liveAuthMessageNew.MultiDevice multiDevice) {
        return multiDevice;
    }
}
