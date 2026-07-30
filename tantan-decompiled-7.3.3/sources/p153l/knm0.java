package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class knm0 extends mq2<LongLinkLiveMessage.VoiceLiveFollowShipApplyMessage> {
    public knm0(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.VoiceLiveFollowShipApplyMessage voiceLiveFollowShipApplyMessage, String str2) {
        return (voiceLiveFollowShipApplyMessage.getTemplateData() == null || voiceLiveFollowShipApplyMessage.getTemplateData().getId() == 0) ? super.mo113619x(str, voiceLiveFollowShipApplyMessage, str2) : m159457n(str, voiceLiveFollowShipApplyMessage.getTemplateData().getId(), null, null, voiceLiveFollowShipApplyMessage.getTemplateData());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceLiveFollowShipApplyMessage> mo95510b() {
        return LongLinkLiveMessage.VoiceLiveFollowShipApplyMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voicelive.followship.apply";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.VoiceLiveFollowShipApplyMessage voiceLiveFollowShipApplyMessage, String str) {
        return true;
    }
}
