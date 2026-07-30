package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class sbt extends mq2<LongLinkLiveMessage.LivePause> {
    public sbt(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkLiveMessage.LivePause livePause, String str2) {
        return new LiveControlMessage(str, "pause");
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LivePause> mo95510b() {
        return LongLinkLiveMessage.LivePause.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.room.pause";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.LivePause livePause, String str) {
        return m159460r(livePause.getRoomId(), livePause.getUserId(), livePause.getLiveId());
    }
}
