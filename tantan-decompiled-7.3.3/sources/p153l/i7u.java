package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class i7u extends mq2<LongLinkLiveMessage.LiveStart> {
    public i7u(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkLiveMessage.LiveStart liveStart, String str2) {
        return new LiveControlMessage(str, "start").setLiveId(liveStart.getLiveId());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveStart> mo95510b() {
        return LongLinkLiveMessage.LiveStart.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.room.start";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.LiveStart liveStart, String str) {
        return m159460r(liveStart.getRoomId(), liveStart.getUserId(), "no_care");
    }
}
