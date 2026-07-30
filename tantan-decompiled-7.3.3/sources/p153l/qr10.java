package p153l;

import com.p051p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class qr10 extends mq2<liveAuthMessageNew.MultiDevice> {
    public qr10(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, liveAuthMessageNew.MultiDevice multiDevice, String str2) {
        return new LiveControlMessage(str, "forbidden_multidevice").setNewDeviceRole(multiDevice.getMsg().byteAt(0) == 1);
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

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(liveAuthMessageNew.MultiDevice multiDevice, String str) {
        return true;
    }
}
