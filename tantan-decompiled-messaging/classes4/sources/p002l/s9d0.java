package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class s9d0 extends bk2<LongLinkLiveMessage.RoomInfo, LongLinkLiveMessage.RoomInfo> {
    public s9d0(p3g0<LongLinkLiveMessage.RoomInfo, LongLinkLiveMessage.RoomInfo> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.RoomInfo roomInfo, String str) {
        return m24095r(roomInfo.getRoomId(), "no_care", roomInfo.getLiveId());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.RoomInfo> mo9244b() {
        return LongLinkLiveMessage.RoomInfo.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.voiceRoom.roomInfo";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.RoomInfo mo9251z(String str, LongLinkLiveMessage.RoomInfo roomInfo) {
        return roomInfo;
    }
}
