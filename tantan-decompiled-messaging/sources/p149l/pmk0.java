package p149l;

import com.p046p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;

/* JADX INFO: loaded from: classes4.dex */
public class pmk0 extends bk2<liveAuthMessageNew.MultiDevice, liveAuthMessageNew.MultiDevice> {
    public pmk0(p3g0<liveAuthMessageNew.MultiDevice, liveAuthMessageNew.MultiDevice> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(liveAuthMessageNew.MultiDevice multiDevice, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<liveAuthMessageNew.MultiDevice> mo94398b() {
        return liveAuthMessageNew.MultiDevice.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.socket.multiDevice";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public liveAuthMessageNew.MultiDevice mo94461z(String str, liveAuthMessageNew.MultiDevice multiDevice) {
        return multiDevice;
    }
}
