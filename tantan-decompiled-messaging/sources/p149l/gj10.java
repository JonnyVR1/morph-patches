package p149l;

import com.p046p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class gj10 extends vp2<liveAuthMessageNew.MultiDevice> {
    public gj10(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, liveAuthMessageNew.MultiDevice multiDevice, String str2) {
        return new LiveControlMessage(str, "forbidden_multidevice").setNewDeviceRole(multiDevice.getMsg().byteAt(0) == 1);
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

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(liveAuthMessageNew.MultiDevice multiDevice, String str) {
        return true;
    }
}
