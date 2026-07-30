package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ejq extends bk2<LongLinkLiveMessage.JailInRoom, LongLinkLiveMessage.JailInRoom> {
    public ejq(p3g0<LongLinkLiveMessage.JailInRoom, LongLinkLiveMessage.JailInRoom> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.JailInRoom jailInRoom, String str) {
        return m199212r(jailInRoom.getRoomId(), "no_care", "no_care");
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.JailInRoom> mo94398b() {
        return LongLinkLiveMessage.JailInRoom.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.room.jail";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: h */
    public List<String> mo115407h() {
        return vwb.m200324f0("live.voiceRoom.jailUser");
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.JailInRoom mo94461z(String str, LongLinkLiveMessage.JailInRoom jailInRoom) {
        return jailInRoom;
    }
}
