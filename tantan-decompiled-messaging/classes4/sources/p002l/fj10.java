package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.longlink.msg.connector.LongLinkLiveMutiDeviceMessage;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fj10 extends vp2<LongLinkLiveMutiDeviceMessage.MultiDevice> {
    public fj10(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkLiveMutiDeviceMessage.MultiDevice multiDevice, String str2) {
        return new LiveControlMessage(str, "forbidden_multidevice").setNewDeviceRole(multiDevice.getMsg().byteAt(0) == 1);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMutiDeviceMessage.MultiDevice> mo9244b() {
        return LongLinkLiveMutiDeviceMessage.MultiDevice.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo13261f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_LIVE_FORBIDDEN_MULTIDEVICE;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMutiDeviceMessage.MultiDevice multiDevice, String str) {
        return true;
    }
}
