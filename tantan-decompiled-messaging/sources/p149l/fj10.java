package p149l;

import com.p046p1.mobile.longlink.msg.connector.LongLinkLiveMutiDeviceMessage;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class fj10 extends vp2<LongLinkLiveMutiDeviceMessage.MultiDevice> {
    public fj10(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkLiveMutiDeviceMessage.MultiDevice multiDevice, String str2) {
        return new LiveControlMessage(str, "forbidden_multidevice").setNewDeviceRole(multiDevice.getMsg().byteAt(0) == 1);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMutiDeviceMessage.MultiDevice> mo94398b() {
        return LongLinkLiveMutiDeviceMessage.MultiDevice.class;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo94756f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_LIVE_FORBIDDEN_MULTIDEVICE;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMutiDeviceMessage.MultiDevice multiDevice, String str) {
        return true;
    }
}
