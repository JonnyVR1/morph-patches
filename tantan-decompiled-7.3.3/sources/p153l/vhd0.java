package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class vhd0 extends jk2<LongLinkLiveMessage.RoomInfo, LongLinkLiveMessage.RoomInfo> {
    public vhd0(wbg0<LongLinkLiveMessage.RoomInfo, LongLinkLiveMessage.RoomInfo> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.RoomInfo roomInfo, String str) {
        return m159460r(roomInfo.getRoomId(), "no_care", roomInfo.getLiveId());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.RoomInfo> mo95510b() {
        return LongLinkLiveMessage.RoomInfo.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.voiceRoom.roomInfo";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.RoomInfo mo95993z(String str, LongLinkLiveMessage.RoomInfo roomInfo) {
        return roomInfo;
    }
}
