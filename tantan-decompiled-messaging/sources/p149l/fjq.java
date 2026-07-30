package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class fjq extends vp2<LongLinkLiveMessage.JailInRoom> {
    public fjq(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.JailInRoom jailInRoom, String str2) {
        return m199209n(str, jailInRoom.getTempdata().getId(), jailInRoom.getUser(), jailInRoom.getManager(), jailInRoom.getTempdata());
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

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.JailInRoom jailInRoom, String str) {
        return m199212r(jailInRoom.getRoomId(), "no_care", "no_care");
    }
}
