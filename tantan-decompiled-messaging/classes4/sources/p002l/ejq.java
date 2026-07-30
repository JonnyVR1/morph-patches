package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import java.util.List;
import l.p3g0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ejq extends bk2<LongLinkLiveMessage.JailInRoom, LongLinkLiveMessage.JailInRoom> {
    public ejq(p3g0<LongLinkLiveMessage.JailInRoom, LongLinkLiveMessage.JailInRoom> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.JailInRoom jailInRoom, String str) {
        return m24095r(jailInRoom.getRoomId(), "no_care", "no_care");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.JailInRoom> mo9244b() {
        return LongLinkLiveMessage.JailInRoom.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.room.jail";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: h */
    public List<String> mo12303h() {
        return vwb.f0(new String[]{"live.voiceRoom.jailUser"});
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.JailInRoom mo9251z(String str, LongLinkLiveMessage.JailInRoom jailInRoom) {
        return jailInRoom;
    }
}
