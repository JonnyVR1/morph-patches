package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class lxi extends mq2<LongLinkLiveMessage.LiveTemplateMsg> {
    public lxi(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.LiveTemplateMsg liveTemplateMsg, String str2) {
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.followUserId = liveTemplateMsg.getUser().getId();
        extInfo.followType = "chat";
        extInfo.followTrackName = "chat";
        LiveMessage liveMessageM159458o = m159458o(str, liveTemplateMsg.getTempdata().getId(), liveTemplateMsg.getUser(), null, liveTemplateMsg.getTempdata(), extInfo);
        afu.m97556e(liveMessageM159458o, this.f137993c);
        return liveMessageM159458o;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveTemplateMsg> mo95510b() {
        return LongLinkLiveMessage.LiveTemplateMsg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.live.follow.guide";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.LiveTemplateMsg liveTemplateMsg, String str) {
        return m159460r(liveTemplateMsg.getRoomId(), "no_care", "no_care");
    }
}
