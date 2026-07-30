package p153l;

import com.p051p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;

/* JADX INFO: loaded from: classes4.dex */
public class vvk0 extends jk2<liveAuthMessageNew.MultiDevice, liveAuthMessageNew.MultiDevice> {
    public vvk0(wbg0<liveAuthMessageNew.MultiDevice, liveAuthMessageNew.MultiDevice> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(liveAuthMessageNew.MultiDevice multiDevice, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<liveAuthMessageNew.MultiDevice> mo95510b() {
        return liveAuthMessageNew.MultiDevice.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.socket.multiDevice";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public liveAuthMessageNew.MultiDevice mo95993z(String str, liveAuthMessageNew.MultiDevice multiDevice) {
        return multiDevice;
    }
}
