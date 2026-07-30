package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class hft extends mq2<LongLinkLiveMessage.LiveRecover> {
    public hft(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkLiveMessage.LiveRecover liveRecover, String str2) {
        return new LiveControlMessage(str, "recover", liveRecover.getStreamIdentifier()).setLiveId(liveRecover.getLiveId());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveRecover> mo95510b() {
        return LongLinkLiveMessage.LiveRecover.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.room.recover";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.LiveRecover liveRecover, String str) {
        return m159460r(liveRecover.getRoomId(), liveRecover.getUserId(), "no_care");
    }
}
