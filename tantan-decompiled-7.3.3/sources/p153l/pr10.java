package p153l;

import com.p051p1.mobile.longlink.msg.connector.LongLinkLiveMutiDeviceMessage;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class pr10 extends mq2<LongLinkLiveMutiDeviceMessage.MultiDevice> {
    public pr10(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkLiveMutiDeviceMessage.MultiDevice multiDevice, String str2) {
        return new LiveControlMessage(str, "forbidden_multidevice").setNewDeviceRole(multiDevice.getMsg().byteAt(0) == 1);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMutiDeviceMessage.MultiDevice> mo95510b() {
        return LongLinkLiveMutiDeviceMessage.MultiDevice.class;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo102648f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_LIVE_FORBIDDEN_MULTIDEVICE;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMutiDeviceMessage.MultiDevice multiDevice, String str) {
        return true;
    }
}
