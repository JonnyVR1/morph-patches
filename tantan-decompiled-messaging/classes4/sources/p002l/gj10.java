package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gj10 extends vp2<liveAuthMessageNew.MultiDevice> {
    public gj10(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, liveAuthMessageNew.MultiDevice multiDevice, String str2) {
        return new LiveControlMessage(str, "forbidden_multidevice").setNewDeviceRole(multiDevice.getMsg().byteAt(0) == 1);
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

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(liveAuthMessageNew.MultiDevice multiDevice, String str) {
        return true;
    }
}
