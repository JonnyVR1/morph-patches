package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class dlq extends jk2<LongLinkLiveMessage.JailInRoom, LongLinkLiveMessage.JailInRoom> {
    public dlq(wbg0<LongLinkLiveMessage.JailInRoom, LongLinkLiveMessage.JailInRoom> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.JailInRoom jailInRoom, String str) {
        return m159460r(jailInRoom.getRoomId(), "no_care", "no_care");
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.JailInRoom> mo95510b() {
        return LongLinkLiveMessage.JailInRoom.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.room.jail";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: h */
    public List<String> mo116845h() {
        return jyb.m147507f0("live.voiceRoom.jailUser");
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.JailInRoom mo95993z(String str, LongLinkLiveMessage.JailInRoom jailInRoom) {
        return jailInRoom;
    }
}
