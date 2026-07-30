package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class tfu extends mq2<LongLinkLiveMessage.LiveUpdateVideoQuality> {
    public tfu(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkLiveMessage.LiveUpdateVideoQuality liveUpdateVideoQuality, String str2) {
        return new LiveControlMessage(str, "live_update_video_quality");
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveUpdateVideoQuality> mo95510b() {
        return LongLinkLiveMessage.LiveUpdateVideoQuality.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.update.videoquality";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.LiveUpdateVideoQuality liveUpdateVideoQuality, String str) {
        return m159460r(liveUpdateVideoQuality.getRoomId(), "no_care", "no_care");
    }
}
