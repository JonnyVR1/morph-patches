package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class sfu extends mq2<LongLinkLiveMessage.LiveUpdatePullVideoQuality> {
    public sfu(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkLiveMessage.LiveUpdatePullVideoQuality liveUpdatePullVideoQuality, String str2) {
        liveUpdatePullVideoQuality.toString();
        return new LiveControlMessage(str, "live_pull_update_video_quality");
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveUpdatePullVideoQuality> mo95510b() {
        return LongLinkLiveMessage.LiveUpdatePullVideoQuality.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.update.pullvideoquality";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.LiveUpdatePullVideoQuality liveUpdatePullVideoQuality, String str) {
        return m159460r(liveUpdatePullVideoQuality.getRoomId(), "no_care", "no_care");
    }
}
