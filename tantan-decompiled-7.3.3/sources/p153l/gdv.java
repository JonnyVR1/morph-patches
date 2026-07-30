package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class gdv extends jk2<LongLinkLiveMessage.VoiceSettleGuideMessage, LongLinkLiveMessage.VoiceSettleGuideMessage> {
    public gdv(wbg0 wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.VoiceSettleGuideMessage voiceSettleGuideMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceSettleGuideMessage> mo95510b() {
        return LongLinkLiveMessage.VoiceSettleGuideMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voice.trick.settle.guide";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceSettleGuideMessage mo95993z(String str, LongLinkLiveMessage.VoiceSettleGuideMessage voiceSettleGuideMessage) {
        return voiceSettleGuideMessage;
    }
}
