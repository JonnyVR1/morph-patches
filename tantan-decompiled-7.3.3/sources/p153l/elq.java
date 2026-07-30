package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class elq extends mq2<LongLinkLiveMessage.JailInRoom> {
    public elq(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.JailInRoom jailInRoom, String str2) {
        return m159457n(str, jailInRoom.getTempdata().getId(), jailInRoom.getUser(), jailInRoom.getManager(), jailInRoom.getTempdata());
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

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.JailInRoom jailInRoom, String str) {
        return m159460r(jailInRoom.getRoomId(), "no_care", "no_care");
    }
}
