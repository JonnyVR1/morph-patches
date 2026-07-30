package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class s9d0 extends bk2<LongLinkLiveMessage.RoomInfo, LongLinkLiveMessage.RoomInfo> {
    public s9d0(p3g0<LongLinkLiveMessage.RoomInfo, LongLinkLiveMessage.RoomInfo> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.RoomInfo roomInfo, String str) {
        return m199212r(roomInfo.getRoomId(), "no_care", roomInfo.getLiveId());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.RoomInfo> mo94398b() {
        return LongLinkLiveMessage.RoomInfo.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.voiceRoom.roomInfo";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.RoomInfo mo94461z(String str, LongLinkLiveMessage.RoomInfo roomInfo) {
        return roomInfo;
    }
}
